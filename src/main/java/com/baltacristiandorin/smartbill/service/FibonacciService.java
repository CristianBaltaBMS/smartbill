package com.baltacristiandorin.smartbill.service;

import com.baltacristiandorin.jooq.public_.tables.pojos.Fibonacci;
import com.baltacristiandorin.jooq.public_.tables.pojos.Users;
import com.baltacristiandorin.smartbill.exceptions.SmartBillApplicationException;
import com.baltacristiandorin.smartbill.exceptions.SmartBillBadRequestException;
import com.baltacristiandorin.smartbill.exceptions.SmartBillNotFoundException;
import com.baltacristiandorin.smartbill.repository.FibonacciRepository;
import com.baltacristiandorin.smartbill.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
@Log4j2
public class FibonacciService {

    private final FibonacciRepository fibonacciRepository;
    private final UserRepository userRepository;

    public FibonacciService(FibonacciRepository fibonacciRepository, UserRepository userRepository) {
        this.fibonacciRepository = fibonacciRepository;
        this.userRepository = userRepository;
    }

    public Fibonacci getFibonacciById(UUID uuid) throws SmartBillNotFoundException {

        Fibonacci fibonacci = fibonacciRepository.getFibonacciById(uuid);

        if (fibonacci != null) {
            return fibonacci;
        } else {
            throw new SmartBillNotFoundException("The value for %s is not in the database!".formatted(uuid));
        }
    }

    public Fibonacci getFibonacciByUserId(UUID uuid) throws SmartBillNotFoundException {

        Fibonacci fibonacci = fibonacciRepository.getFibonacciByUserId(uuid);

        if (fibonacci != null) {
            return fibonacci;
        } else {
            throw new SmartBillNotFoundException("The value for %s is not in the database!".formatted(uuid));
        }
    }

    public Fibonacci getFibonacciByUserName(String name) throws SmartBillNotFoundException {

        UUID userId = userRepository.getUser(name).getUserId();

        if (userId != null) {
            Fibonacci fibonacci = getFibonacciByUserId(userId);
            if (fibonacci != null) {
                return fibonacci;
            } else {
                throw new SmartBillNotFoundException("The value for %s is not in the database!".formatted(userId));
            }
        } else {
            throw new SmartBillNotFoundException("The value for %s is not in the database!".formatted(name));
        }
    }

    public String getFibonacciList(UUID uuid) throws SmartBillNotFoundException {

        String fibonacciList = fibonacciRepository.getFibonacciByUserId(uuid).getValues();

        if (fibonacciList == null || fibonacciList.isBlank()) {
            throw new SmartBillNotFoundException("The value for %s is not in the database!".formatted(uuid));
        } else return fibonacciList;
    }

    public String getFibonacciList(String name) throws SmartBillNotFoundException {

        Users user = userRepository.getUser(name);

        if (user == null) {
            throw new SmartBillNotFoundException("The value for %s is not in the database!".formatted(name));
        } else {
            UUID userId = user.getUserId();
            String fibonacciList = fibonacciRepository.getFibonacciByUserId(userId).getValues();
            if (fibonacciList == null || fibonacciList.isBlank()) {
                throw new SmartBillNotFoundException("The value for %s is not in the database!".formatted(userId));
            } else return fibonacciList;
        }
    }

    public void upsertFibonacci(Fibonacci fibonacci) throws SmartBillBadRequestException {

        if (!isFibonacciSequence(fibonacci.getValues())) {
            throw new SmartBillNotFoundException("The value entered: %s is not a fibonacci array!".formatted(fibonacci.getValues()));
        } else {
            fibonacciRepository.upsertFibonacci(fibonacci);
        }
    }

    public BigInteger incrementFibonacci(UUID userId) throws SmartBillNotFoundException, SmartBillApplicationException {

        Fibonacci oldFibonacci = fibonacciRepository.getFibonacciByUserId(userId);

        if (oldFibonacci != null && !oldFibonacci.getValues().isEmpty()) {

            if (isFibonacciSequence(oldFibonacci.getValues())) {
                List<BigInteger> oldFibonacciValues = Arrays.stream(oldFibonacci.getValues().split(" ")).map(value -> BigInteger.valueOf(Long.parseLong(value))).toList();

                if (!oldFibonacciValues.isEmpty() && oldFibonacciValues.size() > 1) {
                    BigInteger lastFibonacciValue = oldFibonacciValues.get(oldFibonacciValues.size() - 1);
                    BigInteger secondLastFibonacciValue = oldFibonacciValues.get(oldFibonacciValues.size() - 2);

                    BigInteger generatedFibonacci = getNextFibonacciNumber(lastFibonacciValue, secondLastFibonacciValue);
                    String fibonacciString = oldFibonacci.getValues() + " " + generatedFibonacci;
                    oldFibonacci.setValues(fibonacciString);
                    fibonacciRepository.upsertFibonacci(oldFibonacci);

                    return lastFibonacciValue;
                } else {
                    oldFibonacci.setValues("0 1");
                    fibonacciRepository.upsertFibonacci(oldFibonacci);

                    return BigInteger.valueOf(1L);
                }
            } else {
                throw new SmartBillApplicationException("The value %s is not a fibonacci sequence!".formatted(oldFibonacci.getValues()));
            }
        } else {
            throw new SmartBillNotFoundException("The value for %s is not in the database!".formatted(userId));
        }
    }

    public void decrementFibonacci(UUID userId) throws SmartBillNotFoundException, SmartBillApplicationException {

        Fibonacci oldFibonacci = fibonacciRepository.getFibonacciByUserId(userId);

        if (oldFibonacci != null) {

            if (isFibonacciSequence(oldFibonacci.getValues())) {

                List<BigInteger> oldFibonacciValues = new java.util.ArrayList<>(Arrays.stream(oldFibonacci.getValues().split(" ")).map(value -> BigInteger.valueOf(Long.parseLong(value))).toList());

                if (oldFibonacciValues.isEmpty() || oldFibonacciValues.size() == 1) {
                    oldFibonacci.setValues("0 1");
                } else {
                    BigInteger oldElement = oldFibonacciValues.remove(oldFibonacciValues.size() - 1);
                    oldFibonacci.setValues(oldFibonacci.getValues().replace(" " + oldElement, ""));
                }

                fibonacciRepository.upsertFibonacci(oldFibonacci);
            } else {
                throw new SmartBillApplicationException("The value %s is not a fibonacci sequence!".formatted(oldFibonacci.getValues()));
            }
        } else {
            throw new SmartBillNotFoundException("The value for %s is not in the database!".formatted(userId));
        }
    }

    public void deleteFibonacciById(UUID uuid) {

        fibonacciRepository.deleteFibonacciById(uuid);
    }

    public void deleteFibonacciByUserId(UUID uuid) {

        fibonacciRepository.deleteFibonacciByUserId(uuid);
    }

    private BigInteger getNextFibonacciNumber(BigInteger secondLast, BigInteger last) {
        return secondLast.add(last);
    }

    private Boolean isFibonacciSequence(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        String[] parts = text.split("\\s+"); // Splitting the text by spaces
        int[] numbers = new int[parts.length];

        // Parse the parts into numbers
        for (int i = 0; i < parts.length; i++) {
            try {
                numbers[i] = Integer.parseInt(parts[i]);
            } catch (NumberFormatException e) {
                log.info("The value %s contains non-numeric values!".formatted(text));
                return false; // Non-numeric value encountered
            }
        }

        // Check if the numbers form a Fibonacci sequence
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1] + numbers[i - 2]) {
                log.info("The value %s is not a fibonacci sequence!".formatted(text));
                return false;
            }
        }

        log.info("%s is a fibonacci sequence!".formatted(text));
        return true;
    }
}
