package com.baltacristiandorin.smartbill.repository;

import com.baltacristiandorin.jooq.public_.tables.daos.FibonacciDao;
import com.baltacristiandorin.jooq.public_.tables.pojos.Fibonacci;
import org.jooq.DSLContext;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static com.baltacristiandorin.jooq.public_.tables.Fibonacci.FIBONACCI;
import static org.jooq.impl.DSL.field;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FibonacciRepositoryTest {

    @Mock
    private DSLContext mockDslContext;

    @Mock
    private FibonacciDao mockFibonacciDao;

    @InjectMocks
    private FibonacciRepository fibonacciRepository;

    @Test
    void getFibonacciByIdTest() {
        UUID uuid = UUID.randomUUID();
        Fibonacci expectedFibonacci = new Fibonacci();
        expectedFibonacci.setUserId(uuid);

        when(mockFibonacciDao.findById(uuid)).thenReturn(expectedFibonacci);

        Fibonacci result = fibonacciRepository.getFibonacciById(uuid);

        assertEquals(expectedFibonacci, result);
        verify(mockFibonacciDao).findById(uuid);
    }

    @Test
    @Disabled
    void getFibonacciByUserIdTest() {
        UUID uuid = UUID.randomUUID();
        Fibonacci expectedFibonacci = new Fibonacci();
        expectedFibonacci.setUserId(uuid);

        when(mockDslContext.selectFrom(FIBONACCI)
                .where(FIBONACCI.USER_ID.eq(uuid))
                .fetchOneInto(Fibonacci.class)).thenReturn(expectedFibonacci);

        Fibonacci result = fibonacciRepository.getFibonacciByUserId(uuid);

        assertEquals(expectedFibonacci, result);
    }

    @Test
    @Disabled
    void upsertFibonacciTest() {
        UUID uuid = UUID.randomUUID();
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.setUserId(uuid);
        fibonacci.setValues("0 1 1 2 3 5");

        doNothing().when(mockDslContext)
                .insertInto(FIBONACCI, FIBONACCI.USER_ID, FIBONACCI.VALUES)
                .values(fibonacci.getUserId(), fibonacci.getValues())
                .onConflict(field(FIBONACCI.USER_ID))
                .doUpdate()
                .set(field(FIBONACCI.VALUES), fibonacci.getValues())
                .execute();

        assertDoesNotThrow(() -> fibonacciRepository.upsertFibonacci(fibonacci));
    }

    @Test
    void deleteFibonacciByIdTest() {
        UUID uuid = UUID.randomUUID();

        doNothing().when(mockFibonacciDao).deleteById(uuid);

        fibonacciRepository.deleteFibonacciById(uuid);

        verify(mockFibonacciDao).deleteById(uuid);
    }

    @Test
    @Disabled
    void deleteFibonacciByUserIdTest() {
        UUID uuid = UUID.randomUUID();

        doNothing().when(mockDslContext).deleteFrom(FIBONACCI)
                .where(FIBONACCI.USER_ID.eq(uuid))
                .execute();

        fibonacciRepository.deleteFibonacciByUserId(uuid);

        verify(mockDslContext).deleteFrom(FIBONACCI);
    }
}
