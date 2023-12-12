/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables.records;


import com.baltacristiandorin.jooq.information_schema.tables.Views;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewsRecord extends TableRecordImpl<ViewsRecord> implements Record10<String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.views.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.views.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.views.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.views.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.views.table_name</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.views.table_name</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.views.view_definition</code>.
     */
    public void setViewDefinition(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.views.view_definition</code>.
     */
    public String getViewDefinition() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.views.check_option</code>.
     */
    public void setCheckOption(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.views.check_option</code>.
     */
    public String getCheckOption() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.views.is_updatable</code>.
     */
    public void setIsUpdatable(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.views.is_updatable</code>.
     */
    public String getIsUpdatable() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.views.is_insertable_into</code>.
     */
    public void setIsInsertableInto(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.views.is_insertable_into</code>.
     */
    public String getIsInsertableInto() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.views.is_trigger_updatable</code>.
     */
    public void setIsTriggerUpdatable(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.views.is_trigger_updatable</code>.
     */
    public String getIsTriggerUpdatable() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.views.is_trigger_deletable</code>.
     */
    public void setIsTriggerDeletable(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.views.is_trigger_deletable</code>.
     */
    public String getIsTriggerDeletable() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.views.is_trigger_insertable_into</code>.
     */
    public void setIsTriggerInsertableInto(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>information_schema.views.is_trigger_insertable_into</code>.
     */
    public String getIsTriggerInsertableInto() {
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
        return Views.VIEWS.TABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return Views.VIEWS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return Views.VIEWS.TABLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return Views.VIEWS.VIEW_DEFINITION;
    }

    @Override
    public Field<String> field5() {
        return Views.VIEWS.CHECK_OPTION;
    }

    @Override
    public Field<String> field6() {
        return Views.VIEWS.IS_UPDATABLE;
    }

    @Override
    public Field<String> field7() {
        return Views.VIEWS.IS_INSERTABLE_INTO;
    }

    @Override
    public Field<String> field8() {
        return Views.VIEWS.IS_TRIGGER_UPDATABLE;
    }

    @Override
    public Field<String> field9() {
        return Views.VIEWS.IS_TRIGGER_DELETABLE;
    }

    @Override
    public Field<String> field10() {
        return Views.VIEWS.IS_TRIGGER_INSERTABLE_INTO;
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
        return getViewDefinition();
    }

    @Override
    public String component5() {
        return getCheckOption();
    }

    @Override
    public String component6() {
        return getIsUpdatable();
    }

    @Override
    public String component7() {
        return getIsInsertableInto();
    }

    @Override
    public String component8() {
        return getIsTriggerUpdatable();
    }

    @Override
    public String component9() {
        return getIsTriggerDeletable();
    }

    @Override
    public String component10() {
        return getIsTriggerInsertableInto();
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
        return getViewDefinition();
    }

    @Override
    public String value5() {
        return getCheckOption();
    }

    @Override
    public String value6() {
        return getIsUpdatable();
    }

    @Override
    public String value7() {
        return getIsInsertableInto();
    }

    @Override
    public String value8() {
        return getIsTriggerUpdatable();
    }

    @Override
    public String value9() {
        return getIsTriggerDeletable();
    }

    @Override
    public String value10() {
        return getIsTriggerInsertableInto();
    }

    @Override
    public ViewsRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public ViewsRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public ViewsRecord value3(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public ViewsRecord value4(String value) {
        setViewDefinition(value);
        return this;
    }

    @Override
    public ViewsRecord value5(String value) {
        setCheckOption(value);
        return this;
    }

    @Override
    public ViewsRecord value6(String value) {
        setIsUpdatable(value);
        return this;
    }

    @Override
    public ViewsRecord value7(String value) {
        setIsInsertableInto(value);
        return this;
    }

    @Override
    public ViewsRecord value8(String value) {
        setIsTriggerUpdatable(value);
        return this;
    }

    @Override
    public ViewsRecord value9(String value) {
        setIsTriggerDeletable(value);
        return this;
    }

    @Override
    public ViewsRecord value10(String value) {
        setIsTriggerInsertableInto(value);
        return this;
    }

    @Override
    public ViewsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
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
     * Create a detached ViewsRecord
     */
    public ViewsRecord() {
        super(Views.VIEWS);
    }

    /**
     * Create a detached, initialised ViewsRecord
     */
    public ViewsRecord(String tableCatalog, String tableSchema, String tableName, String viewDefinition, String checkOption, String isUpdatable, String isInsertableInto, String isTriggerUpdatable, String isTriggerDeletable, String isTriggerInsertableInto) {
        super(Views.VIEWS);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setViewDefinition(viewDefinition);
        setCheckOption(checkOption);
        setIsUpdatable(isUpdatable);
        setIsInsertableInto(isInsertableInto);
        setIsTriggerUpdatable(isTriggerUpdatable);
        setIsTriggerDeletable(isTriggerDeletable);
        setIsTriggerInsertableInto(isTriggerInsertableInto);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ViewsRecord
     */
    public ViewsRecord(com.baltacristiandorin.jooq.information_schema.tables.pojos.Views value) {
        super(Views.VIEWS);

        if (value != null) {
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setViewDefinition(value.getViewDefinition());
            setCheckOption(value.getCheckOption());
            setIsUpdatable(value.getIsUpdatable());
            setIsInsertableInto(value.getIsInsertableInto());
            setIsTriggerUpdatable(value.getIsTriggerUpdatable());
            setIsTriggerDeletable(value.getIsTriggerDeletable());
            setIsTriggerInsertableInto(value.getIsTriggerInsertableInto());
            resetChangedOnNotNull();
        }
    }
}