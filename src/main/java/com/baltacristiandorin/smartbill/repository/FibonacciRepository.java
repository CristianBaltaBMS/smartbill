package com.baltacristiandorin.smartbill.repository;

import com.baltacristiandorin.jooq.public_.tables.daos.FibonacciDao;
import com.baltacristiandorin.jooq.public_.tables.pojos.Fibonacci;
import com.baltacristiandorin.smartbill.exceptions.SmartBillBadRequestException;
import lombok.extern.log4j.Log4j2;
import org.jooq.DSLContext;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import static com.baltacristiandorin.jooq.public_.tables.Fibonacci.FIBONACCI;
import static org.jooq.impl.DSL.field;

@Repository
@Log4j2
public class FibonacciRepository {

    private final FibonacciDao fibonacciDao;
    private final DSLContext dslContext;

    public FibonacciRepository(FibonacciDao fibonacciDao, DSLContext dslContext) {
        this.fibonacciDao = fibonacciDao;
        this.dslContext = dslContext;
    }

    public Fibonacci getFibonacciById(UUID uuid) {

        return fibonacciDao.findById(uuid);
    }

    public Fibonacci getFibonacciByUserId(UUID uuid) {

        return dslContext.selectFrom(FIBONACCI)
                .where(FIBONACCI.USER_ID.eq(uuid))
                .fetchOneInto(Fibonacci.class);
    }

    public void upsertFibonacci(Fibonacci fibonacci) throws SmartBillBadRequestException {

        try {
            dslContext.insertInto(FIBONACCI, FIBONACCI.USER_ID, FIBONACCI.VALUES)
                    .values(fibonacci.getUserId(), fibonacci.getValues())
                    .onConflict(field(FIBONACCI.USER_ID))
                    .doUpdate()
                    .set(field(FIBONACCI.VALUES), fibonacci.getValues())
                    .execute();
        } catch (DataIntegrityViolationException dataIntegrityViolationException) {
            throw new SmartBillBadRequestException(dataIntegrityViolationException.getMessage());
        }
    }

    public void deleteFibonacciById(UUID uuid) {

        fibonacciDao.deleteById(uuid);
    }

    public void deleteFibonacciByUserId(UUID uuid) {

        dslContext.deleteFrom(FIBONACCI).where(FIBONACCI.USER_ID.eq(uuid)).execute();
    }
}
