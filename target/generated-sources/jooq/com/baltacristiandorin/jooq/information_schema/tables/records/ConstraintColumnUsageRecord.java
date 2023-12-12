/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables.records;


import com.baltacristiandorin.jooq.information_schema.tables.ConstraintColumnUsage;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConstraintColumnUsageRecord extends TableRecordImpl<ConstraintColumnUsageRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.constraint_column_usage.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_column_usage.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.constraint_column_usage.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_column_usage.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.constraint_column_usage.table_name</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_column_usage.table_name</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.constraint_column_usage.column_name</code>.
     */
    public void setColumnName(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_column_usage.column_name</code>.
     */
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.constraint_column_usage.constraint_catalog</code>.
     */
    public void setConstraintCatalog(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_column_usage.constraint_catalog</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.constraint_column_usage.constraint_schema</code>.
     */
    public void setConstraintSchema(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_column_usage.constraint_schema</code>.
     */
    public String getConstraintSchema() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.constraint_column_usage.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_column_usage.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.TABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.TABLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.COLUMN_NAME;
    }

    @Override
    public Field<String> field5() {
        return ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_CATALOG;
    }

    @Override
    public Field<String> field6() {
        return ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_SCHEMA;
    }

    @Override
    public Field<String> field7() {
        return ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_NAME;
    }

    @Override
    public String component1() {
        return getTableCatalog();
    }

    @Override
    public String component2() {
        return getTableSchema();
    }

    @Override
    public String component3() {
        return getTableName();
    }

    @Override
    public String component4() {
        return getColumnName();
    }

    @Override
    public String component5() {
        return getConstraintCatalog();
    }

    @Override
    public String component6() {
        return getConstraintSchema();
    }

    @Override
    public String component7() {
        return getConstraintName();
    }

    @Override
    public String value1() {
        return getTableCatalog();
    }

    @Override
    public String value2() {
        return getTableSchema();
    }

    @Override
    public String value3() {
        return getTableName();
    }

    @Override
    public String value4() {
        return getColumnName();
    }

    @Override
    public String value5() {
        return getConstraintCatalog();
    }

    @Override
    public String value6() {
        return getConstraintSchema();
    }

    @Override
    public String value7() {
        return getConstraintName();
    }

    @Override
    public ConstraintColumnUsageRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public ConstraintColumnUsageRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public ConstraintColumnUsageRecord value3(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public ConstraintColumnUsageRecord value4(String value) {
        setColumnName(value);
        return this;
    }

    @Override
    public ConstraintColumnUsageRecord value5(String value) {
        setConstraintCatalog(value);
        return this;
    }

    @Override
    public ConstraintColumnUsageRecord value6(String value) {
        setConstraintSchema(value);
        return this;
    }

    @Override
    public ConstraintColumnUsageRecord value7(String value) {
        setConstraintName(value);
        return this;
    }

    @Override
    public ConstraintColumnUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
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
     * Create a detached ConstraintColumnUsageRecord
     */
    public ConstraintColumnUsageRecord() {
        super(ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE);
    }

    /**
     * Create a detached, initialised ConstraintColumnUsageRecord
     */
    public ConstraintColumnUsageRecord(String tableCatalog, String tableSchema, String tableName, String columnName, String constraintCatalog, String constraintSchema, String constraintName) {
        super(ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ConstraintColumnUsageRecord
     */
    public ConstraintColumnUsageRecord(com.baltacristiandorin.jooq.information_schema.tables.pojos.ConstraintColumnUsage value) {
        super(ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE);

        if (value != null) {
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setColumnName(value.getColumnName());
            setConstraintCatalog(value.getConstraintCatalog());
            setConstraintSchema(value.getConstraintSchema());
            setConstraintName(value.getConstraintName());
            resetChangedOnNotNull();
        }
    }
}
