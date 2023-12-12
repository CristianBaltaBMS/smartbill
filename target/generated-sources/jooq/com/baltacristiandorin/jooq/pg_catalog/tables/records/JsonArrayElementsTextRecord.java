/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.records;


import com.baltacristiandorin.jooq.pg_catalog.tables.JsonArrayElementsText;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonArrayElementsTextRecord extends TableRecordImpl<JsonArrayElementsTextRecord> implements Record1<String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.json_array_elements_text.value</code>.
     */
    public void setValue(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.json_array_elements_text.value</code>.
     */
    public String getValue() {
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
        return JsonArrayElementsText.JSON_ARRAY_ELEMENTS_TEXT.VALUE;
    }

    @Override
    public String component1() {
        return getValue();
    }

    @Override
    public String value1() {
        return getValue();
    }

    @Override
    public JsonArrayElementsTextRecord value1(String value) {
        setValue(value);
        return this;
    }

    @Override
    public JsonArrayElementsTextRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonArrayElementsTextRecord
     */
    public JsonArrayElementsTextRecord() {
        super(JsonArrayElementsText.JSON_ARRAY_ELEMENTS_TEXT);
    }

    /**
     * Create a detached, initialised JsonArrayElementsTextRecord
     */
    public JsonArrayElementsTextRecord(String value) {
        super(JsonArrayElementsText.JSON_ARRAY_ELEMENTS_TEXT);

        setValue(value);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised JsonArrayElementsTextRecord
     */
    public JsonArrayElementsTextRecord(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.JsonArrayElementsText value) {
        super(JsonArrayElementsText.JSON_ARRAY_ELEMENTS_TEXT);

        if (value != null) {
            setValue(value.getValue());
            resetChangedOnNotNull();
        }
    }
}
