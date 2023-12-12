/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.records;


import com.baltacristiandorin.jooq.pg_catalog.tables.GenerateSeries;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GenerateSeriesRecord extends TableRecordImpl<GenerateSeriesRecord> implements Record1<BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.generate_series.generate_series</code>.
     */
    public void setGenerateSeries(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.generate_series.generate_series</code>.
     */
    public BigDecimal getGenerateSeries() {
        return (BigDecimal) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<BigDecimal> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<BigDecimal> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return GenerateSeries.GENERATE_SERIES.GENERATE_SERIES_;
    }

    @Override
    public BigDecimal component1() {
        return getGenerateSeries();
    }

    @Override
    public BigDecimal value1() {
        return getGenerateSeries();
    }

    @Override
    public GenerateSeriesRecord value1(BigDecimal value) {
        setGenerateSeries(value);
        return this;
    }

    @Override
    public GenerateSeriesRecord values(BigDecimal value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GenerateSeriesRecord
     */
    public GenerateSeriesRecord() {
        super(GenerateSeries.GENERATE_SERIES);
    }

    /**
     * Create a detached, initialised GenerateSeriesRecord
     */
    public GenerateSeriesRecord(BigDecimal generateSeries) {
        super(GenerateSeries.GENERATE_SERIES);

        setGenerateSeries(generateSeries);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised GenerateSeriesRecord
     */
    public GenerateSeriesRecord(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.GenerateSeries value) {
        super(GenerateSeries.GENERATE_SERIES);

        if (value != null) {
            setGenerateSeries(value.getGenerateSeries());
            resetChangedOnNotNull();
        }
    }
}