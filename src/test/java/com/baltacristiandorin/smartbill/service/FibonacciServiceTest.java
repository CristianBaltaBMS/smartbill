package com.baltacristiandorin.smartbill.service;

import com.baltacristiandorin.jooq.public_.tables.pojos.Fibonacci;
import com.baltacristiandorin.smartbill.exceptions.SmartBillNotFoundException;
import com.baltacristiandorin.smartbill.repository.FibonacciRepository;
import com.baltacristiandorin.smartbill.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FibonacciServiceTest {

    @Mock
    private FibonacciRepository mockFibonacciRepository;

    @Mock
    private UserRepository mockUserRepository;

    @InjectMocks
    private FibonacciService fibonacciService;

    @Test
    void testGetFibonacciById() {
        UUID uuid = UUID.randomUUID();
        Fibonacci expectedFibonacci = new Fibonacci();
        expectedFibonacci.setUserId(uuid);

        when(mockFibonacciRepository.getFibonacciById(uuid)).thenReturn(expectedFibonacci);

        Fibonacci result = fibonacciService.getFibonacciById(uuid);

        assertNotNull(result);
        assertEquals(expectedFibonacci, result);
    }

    @Test
    void testGetFibonacciByIdNotFound() {
        UUID uuid = UUID.randomUUID();

        when(mockFibonacciRepository.getFibonacciById(uuid)).thenReturn(null);

        assertThrows(SmartBillNotFoundException.class, () -> fibonacciService.getFibonacciById(uuid));
    }

    @Test
    void testGetFibonacciByUserId() {
        UUID uuid = UUID.randomUUID();
        Fibonacci expectedFibonacci = new Fibonacci();
        expectedFibonacci.setUserId(uuid);

        when(mockFibonacciRepository.getFibonacciByUserId(uuid)).thenReturn(expectedFibonacci);

        Fibonacci result = fibonacciService.getFibonacciByUserId(uuid);

        assertNotNull(result);
        assertEquals(expectedFibonacci, result);
    }

    @Test
    void testGetFibonacciByUserIdNotFound() {
        UUID uuid = UUID.randomUUID();

        when(mockFibonacciRepository.getFibonacciByUserId(uuid)).thenReturn(null);

        assertThrows(SmartBillNotFoundException.class, () -> fibonacciService.getFibonacciByUserId(uuid));
    }
}
