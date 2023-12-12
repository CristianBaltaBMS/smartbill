/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.records;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgPreparedStatement;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPreparedStatementRecord extends TableRecordImpl<PgPreparedStatementRecord> implements Record7<String, String, OffsetDateTime, Object[], Boolean, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.statement</code>.
     */
    public void setStatement(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.statement</code>.
     */
    public String getStatement() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.prepare_time</code>.
     */
    public void setPrepareTime(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.prepare_time</code>.
     */
    public OffsetDateTime getPrepareTime() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.parameter_types</code>.
     */
    public void setParameterTypes(Object[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.parameter_types</code>.
     */
    public Object[] getParameterTypes() {
        return (Object[]) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.from_sql</code>.
     */
    public void setFromSql(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.from_sql</code>.
     */
    public Boolean getFromSql() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.generic_plans</code>.
     */
    public void setGenericPlans(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.generic_plans</code>.
     */
    public Long getGenericPlans() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_statement.custom_plans</code>.
     */
    public void setCustomPlans(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_statement.custom_plans</code>.
     */
    public Long getCustomPlans() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, OffsetDateTime, Object[], Boolean, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, OffsetDateTime, Object[], Boolean, Long, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgPreparedStatement.PG_PREPARED_STATEMENT.NAME;
    }

    @Override
    public Field<String> field2() {
        return PgPreparedStatement.PG_PREPARED_STATEMENT.STATEMENT;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return PgPreparedStatement.PG_PREPARED_STATEMENT.PREPARE_TIME;
    }

    @Override
    public Field<Object[]> field4() {
        return PgPreparedStatement.PG_PREPARED_STATEMENT.PARAMETER_TYPES;
    }

    @Override
    public Field<Boolean> field5() {
        return PgPreparedStatement.PG_PREPARED_STATEMENT.FROM_SQL;
    }

    @Override
    public Field<Long> field6() {
        return PgPreparedStatement.PG_PREPARED_STATEMENT.GENERIC_PLANS;
    }

    @Override
    public Field<Long> field7() {
        return PgPreparedStatement.PG_PREPARED_STATEMENT.CUSTOM_PLANS;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getStatement();
    }

    @Override
    public OffsetDateTime component3() {
        return getPrepareTime();
    }

    @Override
    public Object[] component4() {
        return getParameterTypes();
    }

    @Override
    public Boolean component5() {
        return getFromSql();
    }

    @Override
    public Long component6() {
        return getGenericPlans();
    }

    @Override
    public Long component7() {
        return getCustomPlans();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getStatement();
    }

    @Override
    public OffsetDateTime value3() {
        return getPrepareTime();
    }

    @Override
    public Object[] value4() {
        return getParameterTypes();
    }

    @Override
    public Boolean value5() {
        return getFromSql();
    }

    @Override
    public Long value6() {
        return getGenericPlans();
    }

    @Override
    public Long value7() {
        return getCustomPlans();
    }

    @Override
    public PgPreparedStatementRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public PgPreparedStatementRecord value2(String value) {
        setStatement(value);
        return this;
    }

    @Override
    public PgPreparedStatementRecord value3(OffsetDateTime value) {
        setPrepareTime(value);
        return this;
    }

    @Override
    public PgPreparedStatementRecord value4(Object[] value) {
        setParameterTypes(value);
        return this;
    }

    @Override
    public PgPreparedStatementRecord value5(Boolean value) {
        setFromSql(value);
        return this;
    }

    @Override
    public PgPreparedStatementRecord value6(Long value) {
        setGenericPlans(value);
        return this;
    }

    @Override
    public PgPreparedStatementRecord value7(Long value) {
        setCustomPlans(value);
        return this;
    }

    @Override
    public PgPreparedStatementRecord values(String value1, String value2, OffsetDateTime value3, Object[] value4, Boolean value5, Long value6, Long value7) {
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
     * Create a detached PgPreparedStatementRecord
     */
    public PgPreparedStatementRecord() {
        super(PgPreparedStatement.PG_PREPARED_STATEMENT);
    }

    /**
     * Create a detached, initialised PgPreparedStatementRecord
     */
    public PgPreparedStatementRecord(String name, String statement, OffsetDateTime prepareTime, Object[] parameterTypes, Boolean fromSql, Long genericPlans, Long customPlans) {
        super(PgPreparedStatement.PG_PREPARED_STATEMENT);

        setName(name);
        setStatement(statement);
        setPrepareTime(prepareTime);
        setParameterTypes(parameterTypes);
        setFromSql(fromSql);
        setGenericPlans(genericPlans);
        setCustomPlans(customPlans);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgPreparedStatementRecord
     */
    public PgPreparedStatementRecord(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgPreparedStatement value) {
        super(PgPreparedStatement.PG_PREPARED_STATEMENT);

        if (value != null) {
            setName(value.getName());
            setStatement(value.getStatement());
            setPrepareTime(value.getPrepareTime());
            setParameterTypes(value.getParameterTypes());
            setFromSql(value.getFromSql());
            setGenericPlans(value.getGenericPlans());
            setCustomPlans(value.getCustomPlans());
            resetChangedOnNotNull();
        }
    }
}
