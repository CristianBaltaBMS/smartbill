package com.baltacristiandorin.smartbill.controller;

import com.baltacristiandorin.jooq.public_.tables.pojos.Fibonacci;
import com.baltacristiandorin.jooq.public_.tables.pojos.Users;
import com.baltacristiandorin.smartbill.service.FibonacciService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.UUID;

@RestController
@Log4j2
@RequestMapping(path = "api/v1/fibonacci")
public class FibonacciController {

    private final FibonacciService fibonacciService;

    public FibonacciController(FibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<Fibonacci> getFibonacciById(@PathVariable UUID id) {

        return new ResponseEntity<>(fibonacciService.getFibonacciById(id), HttpStatus.OK);
    }

    @GetMapping(path = "/user/name/{name}")
    public ResponseEntity<Fibonacci> getFibonacciById(@PathVariable String name) {

        return new ResponseEntity<>(fibonacciService.getFibonacciByUserName(name), HttpStatus.OK);
    }

    @GetMapping(path = "/user/{id}")
    public ResponseEntity<Fibonacci> getFibonacciByUserId(@PathVariable UUID id) {

        return new ResponseEntity<>(fibonacciService.getFibonacciByUserId(id), HttpStatus.OK);
    }

    @GetMapping(path = "/list/user/{id}")
    public ResponseEntity<String> getFibonacciList(@PathVariable UUID id) {

        return new ResponseEntity<>(fibonacciService.getFibonacciList(id), HttpStatus.OK);
    }

    @GetMapping(path = "/list/user/name/{name}")
    public ResponseEntity<String> getFibonacciList(@PathVariable String name) {

        return new ResponseEntity<>(fibonacciService.getFibonacciList(name), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> upsertFibonacci(@RequestBody Fibonacci fibonacci) {

        fibonacciService.upsertFibonacci(fibonacci);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping(path = "/increment/user/{id}")
    public ResponseEntity<BigInteger> incrementFibonacci(@PathVariable UUID id) {

        return new ResponseEntity<>(fibonacciService.incrementFibonacci(id), HttpStatus.OK);
    }

    @PostMapping(path = "/decrement/user/{id}")
    public ResponseEntity<HttpStatus> decrementFibonacci(@PathVariable UUID id) {

        fibonacciService.decrementFibonacci(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Users> deleteFibonacciById(@PathVariable UUID id) {

        fibonacciService.deleteFibonacciById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/user/{id}")
    public ResponseEntity<Users> deleteFibonacciByUserId(@PathVariable UUID id) {

        fibonacciService.deleteFibonacciByUserId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
