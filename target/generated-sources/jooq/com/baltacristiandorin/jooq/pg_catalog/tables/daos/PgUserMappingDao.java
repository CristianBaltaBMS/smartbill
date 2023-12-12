/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.daos;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgUserMapping;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgUserMappingRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgUserMappingDao extends DAOImpl<PgUserMappingRecord, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping, Long> {

    /**
     * Create a new PgUserMappingDao without any configuration
     */
    public PgUserMappingDao() {
        super(PgUserMapping.PG_USER_MAPPING, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping.class);
    }

    /**
     * Create a new PgUserMappingDao with an attached configuration
     */
    public PgUserMappingDao(Configuration configuration) {
        super(PgUserMapping.PG_USER_MAPPING, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping.class, configuration);
    }

    @Override
    public Long getId(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping object) {
        return object.getOid();
    }

    /**
     * Fetch records that have <code>oid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping> fetchRangeOfOid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgUserMapping.PG_USER_MAPPING.OID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping> fetchByOid(Long... values) {
        return fetch(PgUserMapping.PG_USER_MAPPING.OID, values);
    }

    /**
     * Fetch a unique record that has <code>oid = value</code>
     */
    public com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping fetchOneByOid(Long value) {
        return fetchOne(PgUserMapping.PG_USER_MAPPING.OID, value);
    }

    /**
     * Fetch a unique record that has <code>oid = value</code>
     */
    public Optional<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping> fetchOptionalByOid(Long value) {
        return fetchOptional(PgUserMapping.PG_USER_MAPPING.OID, value);
    }

    /**
     * Fetch records that have <code>umuser BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping> fetchRangeOfUmuser(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgUserMapping.PG_USER_MAPPING.UMUSER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>umuser IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping> fetchByUmuser(Long... values) {
        return fetch(PgUserMapping.PG_USER_MAPPING.UMUSER, values);
    }

    /**
     * Fetch records that have <code>umserver BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping> fetchRangeOfUmserver(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgUserMapping.PG_USER_MAPPING.UMSERVER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>umserver IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping> fetchByUmserver(Long... values) {
        return fetch(PgUserMapping.PG_USER_MAPPING.UMSERVER, values);
    }

    /**
     * Fetch records that have <code>umoptions BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping> fetchRangeOfUmoptions(String[] lowerInclusive, String[] upperInclusive) {
        return fetchRange(PgUserMapping.PG_USER_MAPPING.UMOPTIONS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>umoptions IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgUserMapping> fetchByUmoptions(String[]... values) {
        return fetch(PgUserMapping.PG_USER_MAPPING.UMOPTIONS, values);
    }
}
