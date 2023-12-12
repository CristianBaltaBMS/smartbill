/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables.records;


import com.baltacristiandorin.jooq.information_schema.tables.RoutineColumnUsage;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoutineColumnUsageRecord extends TableRecordImpl<RoutineColumnUsageRecord> implements Record10<String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.specific_catalog</code>.
     */
    public void setSpecificCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.specific_catalog</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.specific_schema</code>.
     */
    public void setSpecificSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.specific_schema</code>.
     */
    public String getSpecificSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.specific_name</code>.
     */
    public void setSpecificName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.specific_name</code>.
     */
    public String getSpecificName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.routine_catalog</code>.
     */
    public void setRoutineCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.routine_catalog</code>.
     */
    public String getRoutineCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.routine_schema</code>.
     */
    public void setRoutineSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.routine_schema</code>.
     */
    public String getRoutineSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.routine_name</code>.
     */
    public void setRoutineName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.routine_name</code>.
     */
    public String getRoutineName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.table_name</code>.
     */
    public void setTableName(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.table_name</code>.
     */
    public String getTableName() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.routine_column_usage.column_name</code>.
     */
    public void setColumnName(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_column_usage.column_name</code>.
     */
    public String getColumnName() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.SPECIFIC_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.SPECIFIC_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.SPECIFIC_NAME;
    }

    @Override
    public Field<String> field4() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.ROUTINE_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.ROUTINE_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.ROUTINE_NAME;
    }

    @Override
    public Field<String> field7() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.TABLE_CATALOG;
    }

    @Override
    public Field<String> field8() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field9() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.TABLE_NAME;
    }

    @Override
    public Field<String> field10() {
        return RoutineColumnUsage.ROUTINE_COLUMN_USAGE.COLUMN_NAME;
    }

    @Override
    public String component1() {
        return getSpecificCatalog();
    }

    @Override
    public String component2() {
        return getSpecificSchema();
    }

    @Override
    public String component3() {
        return getSpecificName();
    }

    @Override
    public String component4() {
        return getRoutineCatalog();
    }

    @Override
    public String component5() {
        return getRoutineSchema();
    }

    @Override
    public String component6() {
        return getRoutineName();
    }

    @Override
    public String component7() {
        return getTableCatalog();
    }

    @Override
    public String component8() {
        return getTableSchema();
    }

    @Override
    public String component9() {
        return getTableName();
    }

    @Override
    public String component10() {
        return getColumnName();
    }

    @Override
    public String value1() {
        return getSpecificCatalog();
    }

    @Override
    public String value2() {
        return getSpecificSchema();
    }

    @Override
    public String value3() {
        return getSpecificName();
    }

    @Override
    public String value4() {
        return getRoutineCatalog();
    }

    @Override
    public String value5() {
        return getRoutineSchema();
    }

    @Override
    public String value6() {
        return getRoutineName();
    }

    @Override
    public String value7() {
        return getTableCatalog();
    }

    @Override
    public String value8() {
        return getTableSchema();
    }

    @Override
    public String value9() {
        return getTableName();
    }

    @Override
    public String value10() {
        return getColumnName();
    }

    @Override
    public RoutineColumnUsageRecord value1(String value) {
        setSpecificCatalog(value);
        return this;
    }

    @Override
    public RoutineColumnUsageRecord value2(String value) {
        setSpecificSchema(value);
        return this;
    }

    @Override
    public RoutineColumnUsageRecord value3(String value) {
        setSpecificName(value);
        return this;
    }

    @Override
    public RoutineColumnUsageRecord value4(String value) {
        setRoutineCatalog(value);
        return this;
    }

    @Override
    public RoutineColumnUsageRecord value5(String value) {
        setRoutineSchema(value);
        return this;
    }

    @Override
    public RoutineColumnUsageRecord value6(String value) {
        setRoutineName(value);
        return this;
    }

    @Override
    public RoutineColumnUsageRecord value7(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public RoutineColumnUsageRecord value8(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public RoutineColumnUsageRecord value9(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public RoutineColumnUsageRecord value10(String value) {
        setColumnName(value);
        return this;
    }

    @Override
    public RoutineColumnUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoutineColumnUsageRecord
     */
    public RoutineColumnUsageRecord() {
        super(RoutineColumnUsage.ROUTINE_COLUMN_USAGE);
    }

    /**
     * Create a detached, initialised RoutineColumnUsageRecord
     */
    public RoutineColumnUsageRecord(String specificCatalog, String specificSchema, String specificName, String routineCatalog, String routineSchema, String routineName, String tableCatalog, String tableSchema, String tableName, String columnName) {
        super(RoutineColumnUsage.ROUTINE_COLUMN_USAGE);

        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
        setRoutineCatalog(routineCatalog);
        setRoutineSchema(routineSchema);
        setRoutineName(routineName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised RoutineColumnUsageRecord
     */
    public RoutineColumnUsageRecord(com.baltacristiandorin.jooq.information_schema.tables.pojos.RoutineColumnUsage value) {
        super(RoutineColumnUsage.ROUTINE_COLUMN_USAGE);

        if (value != null) {
            setSpecificCatalog(value.getSpecificCatalog());
            setSpecificSchema(value.getSpecificSchema());
            setSpecificName(value.getSpecificName());
            setRoutineCatalog(value.getRoutineCatalog());
            setRoutineSchema(value.getRoutineSchema());
            setRoutineName(value.getRoutineName());
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setColumnName(value.getColumnName());
            resetChangedOnNotNull();
        }
    }
}
