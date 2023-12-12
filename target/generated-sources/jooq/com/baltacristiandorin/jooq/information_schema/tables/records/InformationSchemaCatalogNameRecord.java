/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables.records;


import com.baltacristiandorin.jooq.information_schema.tables.InformationSchemaCatalogName;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchemaCatalogNameRecord extends TableRecordImpl<InformationSchemaCatalogNameRecord> implements Record1<String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.information_schema_catalog_name.catalog_name</code>.
     */
    public void setCatalogName(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.information_schema_catalog_name.catalog_name</code>.
     */
    public String getCatalogName() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME.CATALOG_NAME;
    }

    @Override
    public String component1() {
        return getCatalogName();
    }

    @Override
    public String value1() {
        return getCatalogName();
    }

    @Override
    public InformationSchemaCatalogNameRecord value1(String value) {
        setCatalogName(value);
        return this;
    }

    @Override
    public InformationSchemaCatalogNameRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InformationSchemaCatalogNameRecord
     */
    public InformationSchemaCatalogNameRecord() {
        super(InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME);
    }

    /**
     * Create a detached, initialised InformationSchemaCatalogNameRecord
     */
    public InformationSchemaCatalogNameRecord(String catalogName) {
        super(InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME);

        setCatalogName(catalogName);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised InformationSchemaCatalogNameRecord
     */
    public InformationSchemaCatalogNameRecord(com.baltacristiandorin.jooq.information_schema.tables.pojos.InformationSchemaCatalogName value) {
        super(InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME);

        if (value != null) {
            setCatalogName(value.getCatalogName());
            resetChangedOnNotNull();
        }
    }
}
