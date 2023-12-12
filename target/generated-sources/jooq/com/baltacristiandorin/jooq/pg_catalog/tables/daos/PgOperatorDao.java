/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.daos;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgOperator;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgOperatorRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgOperatorDao extends DAOImpl<PgOperatorRecord, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator, Long> {

    /**
     * Create a new PgOperatorDao without any configuration
     */
    public PgOperatorDao() {
        super(PgOperator.PG_OPERATOR, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator.class);
    }

    /**
     * Create a new PgOperatorDao with an attached configuration
     */
    public PgOperatorDao(Configuration configuration) {
        super(PgOperator.PG_OPERATOR, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator.class, configuration);
    }

    @Override
    public Long getId(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator object) {
        return object.getOid();
    }

    /**
     * Fetch records that have <code>oid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOid(Long... values) {
        return fetch(PgOperator.PG_OPERATOR.OID, values);
    }

    /**
     * Fetch a unique record that has <code>oid = value</code>
     */
    public com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator fetchOneByOid(Long value) {
        return fetchOne(PgOperator.PG_OPERATOR.OID, value);
    }

    /**
     * Fetch a unique record that has <code>oid = value</code>
     */
    public Optional<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchOptionalByOid(Long value) {
        return fetchOptional(PgOperator.PG_OPERATOR.OID, value);
    }

    /**
     * Fetch records that have <code>oprname BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprname(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprname IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprname(String... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRNAME, values);
    }

    /**
     * Fetch records that have <code>oprnamespace BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprnamespace(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRNAMESPACE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprnamespace IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprnamespace(Long... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRNAMESPACE, values);
    }

    /**
     * Fetch records that have <code>oprowner BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprowner(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPROWNER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprowner IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprowner(Long... values) {
        return fetch(PgOperator.PG_OPERATOR.OPROWNER, values);
    }

    /**
     * Fetch records that have <code>oprkind BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprkind(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRKIND, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprkind IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprkind(String... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRKIND, values);
    }

    /**
     * Fetch records that have <code>oprcanmerge BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprcanmerge(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRCANMERGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprcanmerge IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprcanmerge(Boolean... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRCANMERGE, values);
    }

    /**
     * Fetch records that have <code>oprcanhash BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprcanhash(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRCANHASH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprcanhash IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprcanhash(Boolean... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRCANHASH, values);
    }

    /**
     * Fetch records that have <code>oprleft BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprleft(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRLEFT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprleft IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprleft(Long... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRLEFT, values);
    }

    /**
     * Fetch records that have <code>oprright BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprright(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRRIGHT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprright IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprright(Long... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRRIGHT, values);
    }

    /**
     * Fetch records that have <code>oprresult BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprresult(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRRESULT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprresult IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprresult(Long... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRRESULT, values);
    }

    /**
     * Fetch records that have <code>oprcom BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprcom(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRCOM, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprcom IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprcom(Long... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRCOM, values);
    }

    /**
     * Fetch records that have <code>oprnegate BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprnegate(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRNEGATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprnegate IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprnegate(Long... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRNEGATE, values);
    }

    /**
     * Fetch records that have <code>oprcode BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprcode(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRCODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprcode IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprcode(String... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRCODE, values);
    }

    /**
     * Fetch records that have <code>oprrest BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprrest(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRREST, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprrest IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprrest(String... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRREST, values);
    }

    /**
     * Fetch records that have <code>oprjoin BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchRangeOfOprjoin(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgOperator.PG_OPERATOR.OPRJOIN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oprjoin IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgOperator> fetchByOprjoin(String... values) {
        return fetch(PgOperator.PG_OPERATOR.OPRJOIN, values);
    }
}