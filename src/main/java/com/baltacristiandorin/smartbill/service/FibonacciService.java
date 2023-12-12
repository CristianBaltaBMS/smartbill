package com.baltacristiandorin.smartbill.service;

import com.baltacristiandorin.jooq.public_.tables.pojos.Fibonacci;
import com.baltacristiandorin.jooq.public_.tables.pojos.Users;
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

    public Fibonacci getFibonacciById(UUID uuid) {

        return fibonacciRepository.getFibonacciById(uuid);
    }

    public Fibonacci getFibonacciByUserId(UUID uuid) {

        return fibonacciRepository.getFibonacciByUserId(uuid);
    }

    public Fibonacci getFibonacciByUserName(String name) {

        UUID userId = userRepository.getUser(name).getUserId();
        return fibonacciRepository.getFibonacciByUserId(userId);
    }

    public String getFibonacciList(UUID uuid) {

        return fibonacciRepository.getFibonacciByUserId(uuid).getValues();
    }

    public String getFibonacciList(String name) {

        Users user = userRepository.getUser(name);

        if (user != null) {
            return fibonacciRepository.getFibonacciByUserId(user.getUserId()).getValues();
        } else return null;
    }

    public void upsertFibonacci(Fibonacci fibonacci) {

        if (!isFibonacciSequence(fibonacci.getValues())) {
            fibonacci.setValues("0 1");
        }
        fibonacciRepository.upsertFibonacci(fibonacci);
    }

    public BigInteger incrementFibonacci(UUID userId) {

        Fibonacci oldFibonacci = fibonacciRepository.getFibonacciByUserId(userId);

        if (oldFibonacci != null && !oldFibonacci.getValues().isEmpty()) {

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
            Fibonacci fibonacci = new Fibonacci();
            fibonacci.setUserId(userId);
            fibonacci.setValues("0 1");
            fibonacciRepository.upsertFibonacci(fibonacci);

            return BigInteger.valueOf(1L);
        }
    }

    public void decrementFibonacci(UUID userId) {

        Fibonacci oldFibonacci = fibonacciRepository.getFibonacciByUserId(userId);

        if (oldFibonacci != null) {

            List<BigInteger> oldFibonacciValues = new java.util.ArrayList<>(Arrays.stream(oldFibonacci.getValues().split(" ")).map(value -> BigInteger.valueOf(Long.parseLong(value))).toList());

            if (oldFibonacciValues.isEmpty() || oldFibonacciValues.size() == 1) {
                oldFibonacci.setValues("0 1");
            } else {
                BigInteger oldElement = oldFibonacciValues.remove(oldFibonacciValues.size() - 1);
                oldFibonacci.setValues(oldFibonacci.getValues().replace(" " + oldElement, ""));
            }

            fibonacciRepository.upsertFibonacci(oldFibonacci);
        } else {

            Fibonacci fibonacci = new Fibonacci();
            fibonacci.setUserId(userId);
            fibonacci.setValues("0 1");
            fibonacciRepository.upsertFibonacci(fibonacci);
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
                return false; // Non-numeric value encountered
            }
        }

        // Check if the numbers form a Fibonacci sequence
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1] + numbers[i - 2]) {
                return false;
            }
        }

        return true;
    }
}
