/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.daos;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgTrigger;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgTriggerRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTriggerDao extends DAOImpl<PgTriggerRecord, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger, Long> {

    /**
     * Create a new PgTriggerDao without any configuration
     */
    public PgTriggerDao() {
        super(PgTrigger.PG_TRIGGER, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger.class);
    }

    /**
     * Create a new PgTriggerDao with an attached configuration
     */
    public PgTriggerDao(Configuration configuration) {
        super(PgTrigger.PG_TRIGGER, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger.class, configuration);
    }

    @Override
    public Long getId(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger object) {
        return object.getOid();
    }

    /**
     * Fetch records that have <code>oid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfOid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.OID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByOid(Long... values) {
        return fetch(PgTrigger.PG_TRIGGER.OID, values);
    }

    /**
     * Fetch a unique record that has <code>oid = value</code>
     */
    public com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger fetchOneByOid(Long value) {
        return fetchOne(PgTrigger.PG_TRIGGER.OID, value);
    }

    /**
     * Fetch a unique record that has <code>oid = value</code>
     */
    public Optional<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchOptionalByOid(Long value) {
        return fetchOptional(PgTrigger.PG_TRIGGER.OID, value);
    }

    /**
     * Fetch records that have <code>tgrelid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgrelid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGRELID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgrelid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgrelid(Long... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGRELID, values);
    }

    /**
     * Fetch records that have <code>tgparentid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgparentid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGPARENTID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgparentid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgparentid(Long... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGPARENTID, values);
    }

    /**
     * Fetch records that have <code>tgname BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgname(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgname IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgname(String... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGNAME, values);
    }

    /**
     * Fetch records that have <code>tgfoid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgfoid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGFOID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgfoid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgfoid(Long... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGFOID, values);
    }

    /**
     * Fetch records that have <code>tgtype BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgtype(Short lowerInclusive, Short upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGTYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgtype IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgtype(Short... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGTYPE, values);
    }

    /**
     * Fetch records that have <code>tgenabled BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgenabled(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGENABLED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgenabled IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgenabled(String... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGENABLED, values);
    }

    /**
     * Fetch records that have <code>tgisinternal BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgisinternal(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGISINTERNAL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgisinternal IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgisinternal(Boolean... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGISINTERNAL, values);
    }

    /**
     * Fetch records that have <code>tgconstrrelid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgconstrrelid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGCONSTRRELID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgconstrrelid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgconstrrelid(Long... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGCONSTRRELID, values);
    }

    /**
     * Fetch records that have <code>tgconstrindid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgconstrindid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGCONSTRINDID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgconstrindid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgconstrindid(Long... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGCONSTRINDID, values);
    }

    /**
     * Fetch records that have <code>tgconstraint BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgconstraint(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGCONSTRAINT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgconstraint IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgconstraint(Long... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGCONSTRAINT, values);
    }

    /**
     * Fetch records that have <code>tgdeferrable BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgdeferrable(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGDEFERRABLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgdeferrable IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgdeferrable(Boolean... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGDEFERRABLE, values);
    }

    /**
     * Fetch records that have <code>tginitdeferred BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTginitdeferred(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGINITDEFERRED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tginitdeferred IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTginitdeferred(Boolean... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGINITDEFERRED, values);
    }

    /**
     * Fetch records that have <code>tgnargs BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgnargs(Short lowerInclusive, Short upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGNARGS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgnargs IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgnargs(Short... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGNARGS, values);
    }

    /**
     * Fetch records that have <code>tgattr BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgattr(Object[] lowerInclusive, Object[] upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGATTR, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgattr IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgattr(Object[]... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGATTR, values);
    }

    /**
     * Fetch records that have <code>tgargs BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgargs(byte[] lowerInclusive, byte[] upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGARGS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgargs IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgargs(byte[]... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGARGS, values);
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
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgqual(Object lowerInclusive, Object upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGQUAL, lowerInclusive, upperInclusive);
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
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgqual(Object... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGQUAL, values);
    }

    /**
     * Fetch records that have <code>tgoldtable BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgoldtable(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGOLDTABLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgoldtable IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgoldtable(String... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGOLDTABLE, values);
    }

    /**
     * Fetch records that have <code>tgnewtable BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchRangeOfTgnewtable(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgTrigger.PG_TRIGGER.TGNEWTABLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tgnewtable IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTrigger> fetchByTgnewtable(String... values) {
        return fetch(PgTrigger.PG_TRIGGER.TGNEWTABLE, values);
    }
}