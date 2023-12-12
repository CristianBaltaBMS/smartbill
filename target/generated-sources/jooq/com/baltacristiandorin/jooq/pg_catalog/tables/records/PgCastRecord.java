/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.records;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgCast;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgCastRecord extends UpdatableRecordImpl<PgCastRecord> implements Record6<Long, Long, Long, Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_cast.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.castsource</code>.
     */
    public void setCastsource(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.castsource</code>.
     */
    public Long getCastsource() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.casttarget</code>.
     */
    public void setCasttarget(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.casttarget</code>.
     */
    public Long getCasttarget() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.castfunc</code>.
     */
    public void setCastfunc(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.castfunc</code>.
     */
    public Long getCastfunc() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.castcontext</code>.
     */
    public void setCastcontext(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.castcontext</code>.
     */
    public String getCastcontext() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_cast.castmethod</code>.
     */
    public void setCastmethod(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cast.castmethod</code>.
     */
    public String getCastmethod() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, Long, Long, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, Long, Long, Long, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgCast.PG_CAST.OID;
    }

    @Override
    public Field<Long> field2() {
        return PgCast.PG_CAST.CASTSOURCE;
    }

    @Override
    public Field<Long> field3() {
        return PgCast.PG_CAST.CASTTARGET;
    }

    @Override
    public Field<Long> field4() {
        return PgCast.PG_CAST.CASTFUNC;
    }

    @Override
    public Field<String> field5() {
        return PgCast.PG_CAST.CASTCONTEXT;
    }

    @Override
    public Field<String> field6() {
        return PgCast.PG_CAST.CASTMETHOD;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public Long component2() {
        return getCastsource();
    }

    @Override
    public Long component3() {
        return getCasttarget();
    }

    @Override
    public Long component4() {
        return getCastfunc();
    }

    @Override
    public String component5() {
        return getCastcontext();
    }

    @Override
    public String component6() {
        return getCastmethod();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public Long value2() {
        return getCastsource();
    }

    @Override
    public Long value3() {
        return getCasttarget();
    }

    @Override
    public Long value4() {
        return getCastfunc();
    }

    @Override
    public String value5() {
        return getCastcontext();
    }

    @Override
    public String value6() {
        return getCastmethod();
    }

    @Override
    public PgCastRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgCastRecord value2(Long value) {
        setCastsource(value);
        return this;
    }

    @Override
    public PgCastRecord value3(Long value) {
        setCasttarget(value);
        return this;
    }

    @Override
    public PgCastRecord value4(Long value) {
        setCastfunc(value);
        return this;
    }

    @Override
    public PgCastRecord value5(String value) {
        setCastcontext(value);
        return this;
    }

    @Override
    public PgCastRecord value6(String value) {
        setCastmethod(value);
        return this;
    }

    @Override
    public PgCastRecord values(Long value1, Long value2, Long value3, Long value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgCastRecord
     */
    public PgCastRecord() {
        super(PgCast.PG_CAST);
    }

    /**
     * Create a detached, initialised PgCastRecord
     */
    public PgCastRecord(Long oid, Long castsource, Long casttarget, Long castfunc, String castcontext, String castmethod) {
        super(PgCast.PG_CAST);

        setOid(oid);
        setCastsource(castsource);
        setCasttarget(casttarget);
        setCastfunc(castfunc);
        setCastcontext(castcontext);
        setCastmethod(castmethod);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgCastRecord
     */
    public PgCastRecord(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgCast value) {
        super(PgCast.PG_CAST);

        if (value != null) {
            setOid(value.getOid());
            setCastsource(value.getCastsource());
            setCasttarget(value.getCasttarget());
            setCastfunc(value.getCastfunc());
            setCastcontext(value.getCastcontext());
            setCastmethod(value.getCastmethod());
            resetChangedOnNotNull();
        }
    }
}
