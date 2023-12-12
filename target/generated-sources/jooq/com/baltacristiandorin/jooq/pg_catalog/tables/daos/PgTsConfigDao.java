/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.daos;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgTsConfig;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgTsConfigRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTsConfigDao extends DAOImpl<PgTsConfigRecord, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig, Long> {

    /**
     * Create a new PgTsConfigDao without any configuration
     */
    public PgTsConfigDao() {
        super(PgTsConfig.PG_TS_CONFIG, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig.class);
    }

    /**
     * Create a new PgTsConfigDao with an attached configuration
     */
    public PgTsConfigDao(Configuration configuration) {
        super(PgTsConfig.PG_TS_CONFIG, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig.class, configuration);
    }

    @Override
    public Long getId(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig object) {
        return object.getOid();
    }

    /**
     * Fetch records that have <code>oid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig> fetchRangeOfOid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgTsConfig.PG_TS_CONFIG.OID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig> fetchByOid(Long... values) {
        return fetch(PgTsConfig.PG_TS_CONFIG.OID, values);
    }

    /**
     * Fetch a unique record that has <code>oid = value</code>
     */
    public com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig fetchOneByOid(Long value) {
        return fetchOne(PgTsConfig.PG_TS_CONFIG.OID, value);
    }

    /**
     * Fetch a unique record that has <code>oid = value</code>
     */
    public Optional<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig> fetchOptionalByOid(Long value) {
        return fetchOptional(PgTsConfig.PG_TS_CONFIG.OID, value);
    }

    /**
     * Fetch records that have <code>cfgname BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig> fetchRangeOfCfgname(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgTsConfig.PG_TS_CONFIG.CFGNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>cfgname IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig> fetchByCfgname(String... values) {
        return fetch(PgTsConfig.PG_TS_CONFIG.CFGNAME, values);
    }

    /**
     * Fetch records that have <code>cfgnamespace BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig> fetchRangeOfCfgnamespace(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgTsConfig.PG_TS_CONFIG.CFGNAMESPACE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>cfgnamespace IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig> fetchByCfgnamespace(Long... values) {
        return fetch(PgTsConfig.PG_TS_CONFIG.CFGNAMESPACE, values);
    }

    /**
     * Fetch records that have <code>cfgowner BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig> fetchRangeOfCfgowner(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgTsConfig.PG_TS_CONFIG.CFGOWNER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>cfgowner IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig> fetchByCfgowner(Long... values) {
        return fetch(PgTsConfig.PG_TS_CONFIG.CFGOWNER, values);
    }

    /**
     * Fetch records that have <code>cfgparser BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig> fetchRangeOfCfgparser(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgTsConfig.PG_TS_CONFIG.CFGPARSER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>cfgparser IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfig> fetchByCfgparser(Long... values) {
        return fetch(PgTsConfig.PG_TS_CONFIG.CFGPARSER, values);
    }
}
