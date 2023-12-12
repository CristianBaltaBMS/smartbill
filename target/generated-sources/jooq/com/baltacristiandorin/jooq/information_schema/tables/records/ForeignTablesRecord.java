/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables.records;


import com.baltacristiandorin.jooq.information_schema.tables.ForeignTables;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ForeignTablesRecord extends TableRecordImpl<ForeignTablesRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.foreign_tables.foreign_table_catalog</code>.
     */
    public void setForeignTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_tables.foreign_table_catalog</code>.
     */
    public String getForeignTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_tables.foreign_table_schema</code>.
     */
    public void setForeignTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_tables.foreign_table_schema</code>.
     */
    public String getForeignTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_tables.foreign_table_name</code>.
     */
    public void setForeignTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_tables.foreign_table_name</code>.
     */
    public String getForeignTableName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_tables.foreign_server_catalog</code>.
     */
    public void setForeignServerCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_tables.foreign_server_catalog</code>.
     */
    public String getForeignServerCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_tables.foreign_server_name</code>.
     */
    public void setForeignServerName(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_tables.foreign_server_name</code>.
     */
    public String getForeignServerName() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ForeignTables.FOREIGN_TABLES.FOREIGN_TABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return ForeignTables.FOREIGN_TABLES.FOREIGN_TABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return ForeignTables.FOREIGN_TABLES.FOREIGN_TABLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return ForeignTables.FOREIGN_TABLES.FOREIGN_SERVER_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return ForeignTables.FOREIGN_TABLES.FOREIGN_SERVER_NAME;
    }

    @Override
    public String component1() {
        return getForeignTableCatalog();
    }

    @Override
    public String component2() {
        return getForeignTableSchema();
    }

    @Override
    public String component3() {
        return getForeignTableName();
    }

    @Override
    public String component4() {
        return getForeignServerCatalog();
    }

    @Override
    public String component5() {
        return getForeignServerName();
    }

    @Override
    public String value1() {
        return getForeignTableCatalog();
    }

    @Override
    public String value2() {
        return getForeignTableSchema();
    }

    @Override
    public String value3() {
        return getForeignTableName();
    }

    @Override
    public String value4() {
        return getForeignServerCatalog();
    }

    @Override
    public String value5() {
        return getForeignServerName();
    }

    @Override
    public ForeignTablesRecord value1(String value) {
        setForeignTableCatalog(value);
        return this;
    }

    @Override
    public ForeignTablesRecord value2(String value) {
        setForeignTableSchema(value);
        return this;
    }

    @Override
    public ForeignTablesRecord value3(String value) {
        setForeignTableName(value);
        return this;
    }

    @Override
    public ForeignTablesRecord value4(String value) {
        setForeignServerCatalog(value);
        return this;
    }

    @Override
    public ForeignTablesRecord value5(String value) {
        setForeignServerName(value);
        return this;
    }

    @Override
    public ForeignTablesRecord values(String value1, String value2, String value3, String value4, String value5) {
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
     * Create a detached ForeignTablesRecord
     */
    public ForeignTablesRecord() {
        super(ForeignTables.FOREIGN_TABLES);
    }

    /**
     * Create a detached, initialised ForeignTablesRecord
     */
    public ForeignTablesRecord(String foreignTableCatalog, String foreignTableSchema, String foreignTableName, String foreignServerCatalog, String foreignServerName) {
        super(ForeignTables.FOREIGN_TABLES);

        setForeignTableCatalog(foreignTableCatalog);
        setForeignTableSchema(foreignTableSchema);
        setForeignTableName(foreignTableName);
        setForeignServerCatalog(foreignServerCatalog);
        setForeignServerName(foreignServerName);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ForeignTablesRecord
     */
    public ForeignTablesRecord(com.baltacristiandorin.jooq.information_schema.tables.pojos.ForeignTables value) {
        super(ForeignTables.FOREIGN_TABLES);

        if (value != null) {
            setForeignTableCatalog(value.getForeignTableCatalog());
            setForeignTableSchema(value.getForeignTableSchema());
            setForeignTableName(value.getForeignTableName());
            setForeignServerCatalog(value.getForeignServerCatalog());
            setForeignServerName(value.getForeignServerName());
            resetChangedOnNotNull();
        }
    }
}
