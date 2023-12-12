/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.daos;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgSeclabel;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgSeclabelRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.Record4;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSeclabelDao extends DAOImpl<PgSeclabelRecord, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel, Record4<Long, Long, Integer, String>> {

    /**
     * Create a new PgSeclabelDao without any configuration
     */
    public PgSeclabelDao() {
        super(PgSeclabel.PG_SECLABEL, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel.class);
    }

    /**
     * Create a new PgSeclabelDao with an attached configuration
     */
    public PgSeclabelDao(Configuration configuration) {
        super(PgSeclabel.PG_SECLABEL, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel.class, configuration);
    }

    @Override
    public Record4<Long, Long, Integer, String> getId(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel object) {
        return compositeKeyRecord(object.getObjoid(), object.getClassoid(), object.getObjsubid(), object.getProvider());
    }

    /**
     * Fetch records that have <code>objoid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel> fetchRangeOfObjoid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgSeclabel.PG_SECLABEL.OBJOID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>objoid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel> fetchByObjoid(Long... values) {
        return fetch(PgSeclabel.PG_SECLABEL.OBJOID, values);
    }

    /**
     * Fetch records that have <code>classoid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel> fetchRangeOfClassoid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgSeclabel.PG_SECLABEL.CLASSOID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>classoid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel> fetchByClassoid(Long... values) {
        return fetch(PgSeclabel.PG_SECLABEL.CLASSOID, values);
    }

    /**
     * Fetch records that have <code>objsubid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel> fetchRangeOfObjsubid(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(PgSeclabel.PG_SECLABEL.OBJSUBID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>objsubid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel> fetchByObjsubid(Integer... values) {
        return fetch(PgSeclabel.PG_SECLABEL.OBJSUBID, values);
    }

    /**
     * Fetch records that have <code>provider BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel> fetchRangeOfProvider(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgSeclabel.PG_SECLABEL.PROVIDER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>provider IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel> fetchByProvider(String... values) {
        return fetch(PgSeclabel.PG_SECLABEL.PROVIDER, values);
    }

    /**
     * Fetch records that have <code>label BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel> fetchRangeOfLabel(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgSeclabel.PG_SECLABEL.LABEL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>label IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgSeclabel> fetchByLabel(String... values) {
        return fetch(PgSeclabel.PG_SECLABEL.LABEL, values);
    }
}