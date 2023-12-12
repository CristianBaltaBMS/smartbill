/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.daos;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgAggregate;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgAggregateRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgAggregateDao extends DAOImpl<PgAggregateRecord, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate, String> {

    /**
     * Create a new PgAggregateDao without any configuration
     */
    public PgAggregateDao() {
        super(PgAggregate.PG_AGGREGATE, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate.class);
    }

    /**
     * Create a new PgAggregateDao with an attached configuration
     */
    public PgAggregateDao(Configuration configuration) {
        super(PgAggregate.PG_AGGREGATE, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate.class, configuration);
    }

    @Override
    public String getId(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate object) {
        return object.getAggfnoid();
    }

    /**
     * Fetch records that have <code>aggfnoid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggfnoid(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGFNOID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggfnoid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggfnoid(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGFNOID, values);
    }

    /**
     * Fetch a unique record that has <code>aggfnoid = value</code>
     */
    public com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate fetchOneByAggfnoid(String value) {
        return fetchOne(PgAggregate.PG_AGGREGATE.AGGFNOID, value);
    }

    /**
     * Fetch a unique record that has <code>aggfnoid = value</code>
     */
    public Optional<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchOptionalByAggfnoid(String value) {
        return fetchOptional(PgAggregate.PG_AGGREGATE.AGGFNOID, value);
    }

    /**
     * Fetch records that have <code>aggkind BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggkind(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGKIND, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggkind IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggkind(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGKIND, values);
    }

    /**
     * Fetch records that have <code>aggnumdirectargs BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggnumdirectargs(Short lowerInclusive, Short upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGNUMDIRECTARGS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggnumdirectargs IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggnumdirectargs(Short... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGNUMDIRECTARGS, values);
    }

    /**
     * Fetch records that have <code>aggtransfn BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggtransfn(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGTRANSFN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggtransfn IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggtransfn(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGTRANSFN, values);
    }

    /**
     * Fetch records that have <code>aggfinalfn BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggfinalfn(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGFINALFN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggfinalfn IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggfinalfn(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGFINALFN, values);
    }

    /**
     * Fetch records that have <code>aggcombinefn BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggcombinefn(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGCOMBINEFN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggcombinefn IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggcombinefn(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGCOMBINEFN, values);
    }

    /**
     * Fetch records that have <code>aggserialfn BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggserialfn(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGSERIALFN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggserialfn IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggserialfn(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGSERIALFN, values);
    }

    /**
     * Fetch records that have <code>aggdeserialfn BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggdeserialfn(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGDESERIALFN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggdeserialfn IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggdeserialfn(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGDESERIALFN, values);
    }

    /**
     * Fetch records that have <code>aggmtransfn BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggmtransfn(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGMTRANSFN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggmtransfn IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggmtransfn(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGMTRANSFN, values);
    }

    /**
     * Fetch records that have <code>aggminvtransfn BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggminvtransfn(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGMINVTRANSFN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggminvtransfn IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggminvtransfn(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGMINVTRANSFN, values);
    }

    /**
     * Fetch records that have <code>aggmfinalfn BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggmfinalfn(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGMFINALFN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggmfinalfn IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggmfinalfn(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGMFINALFN, values);
    }

    /**
     * Fetch records that have <code>aggfinalextra BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggfinalextra(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGFINALEXTRA, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggfinalextra IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggfinalextra(Boolean... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGFINALEXTRA, values);
    }

    /**
     * Fetch records that have <code>aggmfinalextra BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggmfinalextra(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGMFINALEXTRA, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggmfinalextra IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggmfinalextra(Boolean... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGMFINALEXTRA, values);
    }

    /**
     * Fetch records that have <code>aggfinalmodify BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggfinalmodify(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGFINALMODIFY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggfinalmodify IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggfinalmodify(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGFINALMODIFY, values);
    }

    /**
     * Fetch records that have <code>aggmfinalmodify BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggmfinalmodify(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGMFINALMODIFY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggmfinalmodify IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggmfinalmodify(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGMFINALMODIFY, values);
    }

    /**
     * Fetch records that have <code>aggsortop BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggsortop(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGSORTOP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggsortop IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggsortop(Long... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGSORTOP, values);
    }

    /**
     * Fetch records that have <code>aggtranstype BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggtranstype(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGTRANSTYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggtranstype IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggtranstype(Long... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGTRANSTYPE, values);
    }

    /**
     * Fetch records that have <code>aggtransspace BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggtransspace(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGTRANSSPACE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggtransspace IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggtransspace(Integer... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGTRANSSPACE, values);
    }

    /**
     * Fetch records that have <code>aggmtranstype BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggmtranstype(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGMTRANSTYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggmtranstype IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggmtranstype(Long... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGMTRANSTYPE, values);
    }

    /**
     * Fetch records that have <code>aggmtransspace BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggmtransspace(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGMTRANSSPACE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggmtransspace IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggmtransspace(Integer... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGMTRANSSPACE, values);
    }

    /**
     * Fetch records that have <code>agginitval BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAgginitval(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGINITVAL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>agginitval IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAgginitval(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGINITVAL, values);
    }

    /**
     * Fetch records that have <code>aggminitval BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchRangeOfAggminitval(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgAggregate.PG_AGGREGATE.AGGMINITVAL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>aggminitval IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgAggregate> fetchByAggminitval(String... values) {
        return fetch(PgAggregate.PG_AGGREGATE.AGGMINITVAL, values);
    }
}