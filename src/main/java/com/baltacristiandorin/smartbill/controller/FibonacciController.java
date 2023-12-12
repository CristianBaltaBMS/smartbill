package com.baltacristiandorin.smartbill.controller;

import com.baltacristiandorin.jooq.public_.tables.pojos.Fibonacci;
import com.baltacristiandorin.jooq.public_.tables.pojos.Users;
import com.baltacristiandorin.smartbill.service.FibonacciService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Fibonacci> getFibonacciById(@PathVariable UUID uuid) {

        return new ResponseEntity<>(fibonacciService.getFibonacciById(uuid), HttpStatus.OK);
    }

    @GetMapping(path = "/user/{id}")
    public ResponseEntity<Fibonacci> getFibonacciByUserId(@PathVariable UUID uuid) {

        return new ResponseEntity<>(fibonacciService.getFibonacciByUserId(uuid), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> upsertFibonacci(@RequestBody Fibonacci fibonacci) {

        fibonacciService.upsertFibonacci(fibonacci);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Users> deleteFibonacciById(@PathVariable UUID uuid) {

        fibonacciService.deleteFibonacciById(uuid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/user/{id}")
    public ResponseEntity<Users> deleteFibonacciByUserId(@PathVariable UUID uuid) {

        fibonacciService.deleteFibonacciByUserId(uuid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
