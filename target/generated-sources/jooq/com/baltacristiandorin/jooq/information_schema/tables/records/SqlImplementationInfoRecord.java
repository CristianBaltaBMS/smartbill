/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables.records;


import com.baltacristiandorin.jooq.information_schema.tables.SqlImplementationInfo;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SqlImplementationInfoRecord extends TableRecordImpl<SqlImplementationInfoRecord> implements Record5<String, String, Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.implementation_info_id</code>.
     */
    public void setImplementationInfoId(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.implementation_info_id</code>.
     */
    public String getImplementationInfoId() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.implementation_info_name</code>.
     */
    public void setImplementationInfoName(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.implementation_info_name</code>.
     */
    public String getImplementationInfoName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.integer_value</code>.
     */
    public void setIntegerValue(Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.integer_value</code>.
     */
    public Integer getIntegerValue() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.character_value</code>.
     */
    public void setCharacterValue(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.character_value</code>.
     */
    public String getCharacterValue() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.sql_implementation_info.comments</code>.
     */
    public void setComments(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.sql_implementation_info.comments</code>.
     */
    public String getComments() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, Integer, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, Integer, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SqlImplementationInfo.SQL_IMPLEMENTATION_INFO.IMPLEMENTATION_INFO_ID;
    }

    @Override
    public Field<String> field2() {
        return SqlImplementationInfo.SQL_IMPLEMENTATION_INFO.IMPLEMENTATION_INFO_NAME;
    }

    @Override
    public Field<Integer> field3() {
        return SqlImplementationInfo.SQL_IMPLEMENTATION_INFO.INTEGER_VALUE;
    }

    @Override
    public Field<String> field4() {
        return SqlImplementationInfo.SQL_IMPLEMENTATION_INFO.CHARACTER_VALUE;
    }

    @Override
    public Field<String> field5() {
        return SqlImplementationInfo.SQL_IMPLEMENTATION_INFO.COMMENTS;
    }

    @Override
    public String component1() {
        return getImplementationInfoId();
    }

    @Override
    public String component2() {
        return getImplementationInfoName();
    }

    @Override
    public Integer component3() {
        return getIntegerValue();
    }

    @Override
    public String component4() {
        return getCharacterValue();
    }

    @Override
    public String component5() {
        return getComments();
    }

    @Override
    public String value1() {
        return getImplementationInfoId();
    }

    @Override
    public String value2() {
        return getImplementationInfoName();
    }

    @Override
    public Integer value3() {
        return getIntegerValue();
    }

    @Override
    public String value4() {
        return getCharacterValue();
    }

    @Override
    public String value5() {
        return getComments();
    }

    @Override
    public SqlImplementationInfoRecord value1(String value) {
        setImplementationInfoId(value);
        return this;
    }

    @Override
    public SqlImplementationInfoRecord value2(String value) {
        setImplementationInfoName(value);
        return this;
    }

    @Override
    public SqlImplementationInfoRecord value3(Integer value) {
        setIntegerValue(value);
        return this;
    }

    @Override
    public SqlImplementationInfoRecord value4(String value) {
        setCharacterValue(value);
        return this;
    }

    @Override
    public SqlImplementationInfoRecord value5(String value) {
        setComments(value);
        return this;
    }

    @Override
    public SqlImplementationInfoRecord values(String value1, String value2, Integer value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SqlImplementationInfoRecord
     */
    public SqlImplementationInfoRecord() {
        super(SqlImplementationInfo.SQL_IMPLEMENTATION_INFO);
    }

    /**
     * Create a detached, initialised SqlImplementationInfoRecord
     */
    public SqlImplementationInfoRecord(String implementationInfoId, String implementationInfoName, Integer integerValue, String characterValue, String comments) {
        super(SqlImplementationInfo.SQL_IMPLEMENTATION_INFO);

        setImplementationInfoId(implementationInfoId);
        setImplementationInfoName(implementationInfoName);
        setIntegerValue(integerValue);
        setCharacterValue(characterValue);
        setComments(comments);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised SqlImplementationInfoRecord
     */
    public SqlImplementationInfoRecord(com.baltacristiandorin.jooq.information_schema.tables.pojos.SqlImplementationInfo value) {
        super(SqlImplementationInfo.SQL_IMPLEMENTATION_INFO);

        if (value != null) {
            setImplementationInfoId(value.getImplementationInfoId());
            setImplementationInfoName(value.getImplementationInfoName());
            setIntegerValue(value.getIntegerValue());
            setCharacterValue(value.getCharacterValue());
            setComments(value.getComments());
            resetChangedOnNotNull();
        }
    }
}
