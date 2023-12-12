/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.daos;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgSubscription;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgSubscriptionRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSubscriptionDao extends DAOImpl<PgSubscriptionRecord, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription, Long> {

    /**
     * Create a new PgSubscriptionDao without any configuration
     */
    public PgSubscriptionDao() {
        super(PgSubscription.PG_SUBSCRIPTION, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription.class);
    }

    /**
     * Create a new PgSubscriptionDao with an attached configuration
     */
    public PgSubscriptionDao(Configuration configuration) {
        super(PgSubscription.PG_SUBSCRIPTION, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription.class, configuration);
    }

    @Override
    public Long getId(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription object) {
        return object.getOid();
    }

    /**
     * Fetch records that have <code>oid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfOid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.OID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchByOid(Long... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.OID, values);
    }

    /**
     * Fetch a unique record that has <code>oid = value</code>
     */
    public com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription fetchOneByOid(Long value) {
        return fetchOne(PgSubscription.PG_SUBSCRIPTION.OID, value);
    }

    /**
     * Fetch a unique record that has <code>oid = value</code>
     */
    public Optional<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchOptionalByOid(Long value) {
        return fetchOptional(PgSubscription.PG_SUBSCRIPTION.OID, value);
    }

    /**
     * Fetch records that have <code>subdbid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubdbid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBDBID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subdbid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubdbid(Long... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBDBID, values);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubskiplsn(Object lowerInclusive, Object upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBSKIPLSN, lowerInclusive, upperInclusive);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubskiplsn(Object... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBSKIPLSN, values);
    }

    /**
     * Fetch records that have <code>subname BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubname(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subname IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubname(String... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBNAME, values);
    }

    /**
     * Fetch records that have <code>subowner BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubowner(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBOWNER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subowner IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubowner(Long... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBOWNER, values);
    }

    /**
     * Fetch records that have <code>subenabled BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubenabled(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBENABLED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subenabled IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubenabled(Boolean... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBENABLED, values);
    }

    /**
     * Fetch records that have <code>subbinary BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubbinary(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBBINARY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subbinary IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubbinary(Boolean... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBBINARY, values);
    }

    /**
     * Fetch records that have <code>substream BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubstream(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBSTREAM, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>substream IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubstream(Boolean... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBSTREAM, values);
    }

    /**
     * Fetch records that have <code>subtwophasestate BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubtwophasestate(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBTWOPHASESTATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subtwophasestate IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubtwophasestate(String... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBTWOPHASESTATE, values);
    }

    /**
     * Fetch records that have <code>subdisableonerr BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubdisableonerr(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBDISABLEONERR, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subdisableonerr IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubdisableonerr(Boolean... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBDISABLEONERR, values);
    }

    /**
     * Fetch records that have <code>subconninfo BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubconninfo(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBCONNINFO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subconninfo IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubconninfo(String... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBCONNINFO, values);
    }

    /**
     * Fetch records that have <code>subslotname BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubslotname(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBSLOTNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subslotname IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubslotname(String... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBSLOTNAME, values);
    }

    /**
     * Fetch records that have <code>subsynccommit BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubsynccommit(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBSYNCCOMMIT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subsynccommit IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubsynccommit(String... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBSYNCCOMMIT, values);
    }

    /**
     * Fetch records that have <code>subpublications BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchRangeOfSubpublications(String[] lowerInclusive, String[] upperInclusive) {
        return fetchRange(PgSubscription.PG_SUBSCRIPTION.SUBPUBLICATIONS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subpublications IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSubscription> fetchBySubpublications(String[]... values) {
        return fetch(PgSubscription.PG_SUBSCRIPTION.SUBPUBLICATIONS, values);
    }
}