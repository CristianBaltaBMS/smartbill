/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.daos;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgConstraint;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgConstraintRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgConstraintDao extends DAOImpl<PgConstraintRecord, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint, Long> {

    /**
     * Create a new PgConstraintDao without any configuration
     */
    public PgConstraintDao() {
        super(PgConstraint.PG_CONSTRAINT, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint.class);
    }

    /**
     * Create a new PgConstraintDao with an attached configuration
     */
    public PgConstraintDao(Configuration configuration) {
        super(PgConstraint.PG_CONSTRAINT, com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint.class, configuration);
    }

    @Override
    public Long getId(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint object) {
        return object.getOid();
    }

    /**
     * Fetch records that have <code>oid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfOid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.OID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>oid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByOid(Long... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.OID, values);
    }

    /**
     * Fetch a unique record that has <code>oid = value</code>
     */
    public com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint fetchOneByOid(Long value) {
        return fetchOne(PgConstraint.PG_CONSTRAINT.OID, value);
    }

    /**
     * Fetch a unique record that has <code>oid = value</code>
     */
    public Optional<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchOptionalByOid(Long value) {
        return fetchOptional(PgConstraint.PG_CONSTRAINT.OID, value);
    }

    /**
     * Fetch records that have <code>conname BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConname(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>conname IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConname(String... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONNAME, values);
    }

    /**
     * Fetch records that have <code>connamespace BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConnamespace(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONNAMESPACE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>connamespace IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConnamespace(Long... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONNAMESPACE, values);
    }

    /**
     * Fetch records that have <code>contype BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfContype(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONTYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>contype IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByContype(String... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONTYPE, values);
    }

    /**
     * Fetch records that have <code>condeferrable BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfCondeferrable(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONDEFERRABLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>condeferrable IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByCondeferrable(Boolean... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONDEFERRABLE, values);
    }

    /**
     * Fetch records that have <code>condeferred BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfCondeferred(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONDEFERRED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>condeferred IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByCondeferred(Boolean... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONDEFERRED, values);
    }

    /**
     * Fetch records that have <code>convalidated BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConvalidated(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONVALIDATED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>convalidated IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConvalidated(Boolean... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONVALIDATED, values);
    }

    /**
     * Fetch records that have <code>conrelid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConrelid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONRELID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>conrelid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConrelid(Long... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONRELID, values);
    }

    /**
     * Fetch records that have <code>contypid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfContypid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONTYPID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>contypid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByContypid(Long... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONTYPID, values);
    }

    /**
     * Fetch records that have <code>conindid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConindid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONINDID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>conindid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConindid(Long... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONINDID, values);
    }

    /**
     * Fetch records that have <code>conparentid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConparentid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONPARENTID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>conparentid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConparentid(Long... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONPARENTID, values);
    }

    /**
     * Fetch records that have <code>confrelid BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConfrelid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONFRELID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>confrelid IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConfrelid(Long... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONFRELID, values);
    }

    /**
     * Fetch records that have <code>confupdtype BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConfupdtype(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONFUPDTYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>confupdtype IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConfupdtype(String... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONFUPDTYPE, values);
    }

    /**
     * Fetch records that have <code>confdeltype BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConfdeltype(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONFDELTYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>confdeltype IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConfdeltype(String... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONFDELTYPE, values);
    }

    /**
     * Fetch records that have <code>confmatchtype BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConfmatchtype(String lowerInclusive, String upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONFMATCHTYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>confmatchtype IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConfmatchtype(String... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONFMATCHTYPE, values);
    }

    /**
     * Fetch records that have <code>conislocal BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConislocal(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONISLOCAL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>conislocal IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConislocal(Boolean... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONISLOCAL, values);
    }

    /**
     * Fetch records that have <code>coninhcount BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConinhcount(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONINHCOUNT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>coninhcount IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConinhcount(Integer... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONINHCOUNT, values);
    }

    /**
     * Fetch records that have <code>connoinherit BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConnoinherit(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONNOINHERIT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>connoinherit IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConnoinherit(Boolean... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONNOINHERIT, values);
    }

    /**
     * Fetch records that have <code>conkey BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConkey(Short[] lowerInclusive, Short[] upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONKEY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>conkey IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConkey(Short[]... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONKEY, values);
    }

    /**
     * Fetch records that have <code>confkey BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConfkey(Short[] lowerInclusive, Short[] upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONFKEY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>confkey IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConfkey(Short[]... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONFKEY, values);
    }

    /**
     * Fetch records that have <code>conpfeqop BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConpfeqop(Long[] lowerInclusive, Long[] upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONPFEQOP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>conpfeqop IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConpfeqop(Long[]... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONPFEQOP, values);
    }

    /**
     * Fetch records that have <code>conppeqop BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConppeqop(Long[] lowerInclusive, Long[] upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONPPEQOP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>conppeqop IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConppeqop(Long[]... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONPPEQOP, values);
    }

    /**
     * Fetch records that have <code>conffeqop BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConffeqop(Long[] lowerInclusive, Long[] upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONFFEQOP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>conffeqop IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConffeqop(Long[]... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONFFEQOP, values);
    }

    /**
     * Fetch records that have <code>confdelsetcols BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConfdelsetcols(Short[] lowerInclusive, Short[] upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONFDELSETCOLS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>confdelsetcols IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConfdelsetcols(Short[]... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONFDELSETCOLS, values);
    }

    /**
     * Fetch records that have <code>conexclop BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConexclop(Long[] lowerInclusive, Long[] upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONEXCLOP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>conexclop IN (values)</code>
     */
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConexclop(Long[]... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONEXCLOP, values);
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
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchRangeOfConbin(Object lowerInclusive, Object upperInclusive) {
        return fetchRange(PgConstraint.PG_CONSTRAINT.CONBIN, lowerInclusive, upperInclusive);
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
    public List<com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgConstraint> fetchByConbin(Object... values) {
        return fetch(PgConstraint.PG_CONSTRAINT.CONBIN, values);
    }
}
