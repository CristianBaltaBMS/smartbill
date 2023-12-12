/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.records;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgTsConfigMap;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTsConfigMapRecord extends UpdatableRecordImpl<PgTsConfigMapRecord> implements Record4<Long, Integer, Integer, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_ts_config_map.mapcfg</code>.
     */
    public void setMapcfg(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config_map.mapcfg</code>.
     */
    public Long getMapcfg() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config_map.maptokentype</code>.
     */
    public void setMaptokentype(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config_map.maptokentype</code>.
     */
    public Integer getMaptokentype() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config_map.mapseqno</code>.
     */
    public void setMapseqno(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config_map.mapseqno</code>.
     */
    public Integer getMapseqno() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config_map.mapdict</code>.
     */
    public void setMapdict(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config_map.mapdict</code>.
     */
    public Long getMapdict() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Long, Integer, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Integer, Integer, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Integer, Integer, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgTsConfigMap.PG_TS_CONFIG_MAP.MAPCFG;
    }

    @Override
    public Field<Integer> field2() {
        return PgTsConfigMap.PG_TS_CONFIG_MAP.MAPTOKENTYPE;
    }

    @Override
    public Field<Integer> field3() {
        return PgTsConfigMap.PG_TS_CONFIG_MAP.MAPSEQNO;
    }

    @Override
    public Field<Long> field4() {
        return PgTsConfigMap.PG_TS_CONFIG_MAP.MAPDICT;
    }

    @Override
    public Long component1() {
        return getMapcfg();
    }

    @Override
    public Integer component2() {
        return getMaptokentype();
    }

    @Override
    public Integer component3() {
        return getMapseqno();
    }

    @Override
    public Long component4() {
        return getMapdict();
    }

    @Override
    public Long value1() {
        return getMapcfg();
    }

    @Override
    public Integer value2() {
        return getMaptokentype();
    }

    @Override
    public Integer value3() {
        return getMapseqno();
    }

    @Override
    public Long value4() {
        return getMapdict();
    }

    @Override
    public PgTsConfigMapRecord value1(Long value) {
        setMapcfg(value);
        return this;
    }

    @Override
    public PgTsConfigMapRecord value2(Integer value) {
        setMaptokentype(value);
        return this;
    }

    @Override
    public PgTsConfigMapRecord value3(Integer value) {
        setMapseqno(value);
        return this;
    }

    @Override
    public PgTsConfigMapRecord value4(Long value) {
        setMapdict(value);
        return this;
    }

    @Override
    public PgTsConfigMapRecord values(Long value1, Integer value2, Integer value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgTsConfigMapRecord
     */
    public PgTsConfigMapRecord() {
        super(PgTsConfigMap.PG_TS_CONFIG_MAP);
    }

    /**
     * Create a detached, initialised PgTsConfigMapRecord
     */
    public PgTsConfigMapRecord(Long mapcfg, Integer maptokentype, Integer mapseqno, Long mapdict) {
        super(PgTsConfigMap.PG_TS_CONFIG_MAP);

        setMapcfg(mapcfg);
        setMaptokentype(maptokentype);
        setMapseqno(mapseqno);
        setMapdict(mapdict);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgTsConfigMapRecord
     */
    public PgTsConfigMapRecord(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgTsConfigMap value) {
        super(PgTsConfigMap.PG_TS_CONFIG_MAP);

        if (value != null) {
            setMapcfg(value.getMapcfg());
            setMaptokentype(value.getMaptokentype());
            setMapseqno(value.getMapseqno());
            setMapdict(value.getMapdict());
            resetChangedOnNotNull();
        }
    }
}
