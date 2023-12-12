package com.baltacristiandorin.smartbill.service;

import com.baltacristiandorin.jooq.public_.tables.pojos.Fibonacci;
import com.baltacristiandorin.smartbill.repository.FibonacciRepository;
import com.baltacristiandorin.smartbill.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

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

    public void upsertFibonacci(Fibonacci fibonacci){

        fibonacciRepository.upsertFibonacci(fibonacci);
    }

    public void deleteFibonacciById(UUID uuid) {

        fibonacciRepository.deleteFibonacciById(uuid);
    }

    public void deleteFibonacciByUserId(UUID uuid) {

        fibonacciRepository.deleteFibonacciByUserId(uuid);
    }
}
