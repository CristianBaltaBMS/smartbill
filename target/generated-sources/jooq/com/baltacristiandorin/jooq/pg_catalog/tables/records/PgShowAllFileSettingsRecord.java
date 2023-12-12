/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.records;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgShowAllFileSettings;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgShowAllFileSettingsRecord extends TableRecordImpl<PgShowAllFileSettingsRecord> implements Record7<String, Integer, Integer, String, String, Boolean, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.sourcefile</code>.
     */
    public void setSourcefile(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.sourcefile</code>.
     */
    public String getSourcefile() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.sourceline</code>.
     */
    public void setSourceline(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.sourceline</code>.
     */
    public Integer getSourceline() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.seqno</code>.
     */
    public void setSeqno(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.seqno</code>.
     */
    public Integer getSeqno() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.setting</code>.
     */
    public void setSetting(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.setting</code>.
     */
    public String getSetting() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.applied</code>.
     */
    public void setApplied(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.applied</code>.
     */
    public Boolean getApplied() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.error</code>.
     */
    public void setError(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.error</code>.
     */
    public String getError() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Integer, Integer, String, String, Boolean, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, Integer, Integer, String, String, Boolean, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgShowAllFileSettings.PG_SHOW_ALL_FILE_SETTINGS.SOURCEFILE;
    }

    @Override
    public Field<Integer> field2() {
        return PgShowAllFileSettings.PG_SHOW_ALL_FILE_SETTINGS.SOURCELINE;
    }

    @Override
    public Field<Integer> field3() {
        return PgShowAllFileSettings.PG_SHOW_ALL_FILE_SETTINGS.SEQNO;
    }

    @Override
    public Field<String> field4() {
        return PgShowAllFileSettings.PG_SHOW_ALL_FILE_SETTINGS.NAME;
    }

    @Override
    public Field<String> field5() {
        return PgShowAllFileSettings.PG_SHOW_ALL_FILE_SETTINGS.SETTING;
    }

    @Override
    public Field<Boolean> field6() {
        return PgShowAllFileSettings.PG_SHOW_ALL_FILE_SETTINGS.APPLIED;
    }

    @Override
    public Field<String> field7() {
        return PgShowAllFileSettings.PG_SHOW_ALL_FILE_SETTINGS.ERROR;
    }

    @Override
    public String component1() {
        return getSourcefile();
    }

    @Override
    public Integer component2() {
        return getSourceline();
    }

    @Override
    public Integer component3() {
        return getSeqno();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public String component5() {
        return getSetting();
    }

    @Override
    public Boolean component6() {
        return getApplied();
    }

    @Override
    public String component7() {
        return getError();
    }

    @Override
    public String value1() {
        return getSourcefile();
    }

    @Override
    public Integer value2() {
        return getSourceline();
    }

    @Override
    public Integer value3() {
        return getSeqno();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public String value5() {
        return getSetting();
    }

    @Override
    public Boolean value6() {
        return getApplied();
    }

    @Override
    public String value7() {
        return getError();
    }

    @Override
    public PgShowAllFileSettingsRecord value1(String value) {
        setSourcefile(value);
        return this;
    }

    @Override
    public PgShowAllFileSettingsRecord value2(Integer value) {
        setSourceline(value);
        return this;
    }

    @Override
    public PgShowAllFileSettingsRecord value3(Integer value) {
        setSeqno(value);
        return this;
    }

    @Override
    public PgShowAllFileSettingsRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public PgShowAllFileSettingsRecord value5(String value) {
        setSetting(value);
        return this;
    }

    @Override
    public PgShowAllFileSettingsRecord value6(Boolean value) {
        setApplied(value);
        return this;
    }

    @Override
    public PgShowAllFileSettingsRecord value7(String value) {
        setError(value);
        return this;
    }

    @Override
    public PgShowAllFileSettingsRecord values(String value1, Integer value2, Integer value3, String value4, String value5, Boolean value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgShowAllFileSettingsRecord
     */
    public PgShowAllFileSettingsRecord() {
        super(PgShowAllFileSettings.PG_SHOW_ALL_FILE_SETTINGS);
    }

    /**
     * Create a detached, initialised PgShowAllFileSettingsRecord
     */
    public PgShowAllFileSettingsRecord(String sourcefile, Integer sourceline, Integer seqno, String name, String setting, Boolean applied, String error) {
        super(PgShowAllFileSettings.PG_SHOW_ALL_FILE_SETTINGS);

        setSourcefile(sourcefile);
        setSourceline(sourceline);
        setSeqno(seqno);
        setName(name);
        setSetting(setting);
        setApplied(applied);
        setError(error);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgShowAllFileSettingsRecord
     */
    public PgShowAllFileSettingsRecord(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgShowAllFileSettings value) {
        super(PgShowAllFileSettings.PG_SHOW_ALL_FILE_SETTINGS);

        if (value != null) {
            setSourcefile(value.getSourcefile());
            setSourceline(value.getSourceline());
            setSeqno(value.getSeqno());
            setName(value.getName());
            setSetting(value.getSetting());
            setApplied(value.getApplied());
            setError(value.getError());
            resetChangedOnNotNull();
        }
    }
}
