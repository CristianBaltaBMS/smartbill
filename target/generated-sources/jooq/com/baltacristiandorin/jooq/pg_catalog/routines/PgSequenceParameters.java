/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.routines;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSequenceParameters extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.pg_sequence_parameters.sequence_oid</code>.
     */
    public static final Parameter<Long> SEQUENCE_OID = Internal.createParameter("sequence_oid", SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_sequence_parameters.start_value</code>.
     */
    public static final Parameter<Long> START_VALUE = Internal.createParameter("start_value", SQLDataType.BIGINT, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_sequence_parameters.minimum_value</code>.
     */
    public static final Parameter<Long> MINIMUM_VALUE = Internal.createParameter("minimum_value", SQLDataType.BIGINT, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_sequence_parameters.maximum_value</code>.
     */
    public static final Parameter<Long> MAXIMUM_VALUE = Internal.createParameter("maximum_value", SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_sequence_parameters.increment</code>.
     */
    public static final Parameter<Long> INCREMENT = Internal.createParameter("increment", SQLDataType.BIGINT, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_sequence_parameters.cycle_option</code>.
     */
    public static final Parameter<Boolean> CYCLE_OPTION = Internal.createParameter("cycle_option", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.pg_sequence_parameters.cache_size</code>.
     */
    public static final Parameter<Long> CACHE_SIZE = Internal.createParameter("cache_size", SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_sequence_parameters.data_type</code>.
     */
    public static final Parameter<Long> DATA_TYPE = Internal.createParameter("data_type", SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PgSequenceParameters() {
        super("pg_sequence_parameters", PgCatalog.PG_CATALOG);

        addInParameter(SEQUENCE_OID);
        addOutParameter(START_VALUE);
        addOutParameter(MINIMUM_VALUE);
        addOutParameter(MAXIMUM_VALUE);
        addOutParameter(INCREMENT);
        addOutParameter(CYCLE_OPTION);
        addOutParameter(CACHE_SIZE);
        addOutParameter(DATA_TYPE);
    }

    /**
     * Set the <code>sequence_oid</code> parameter IN value to the routine
     */
    public void setSequenceOid(Long value) {
        setValue(SEQUENCE_OID, value);
    }

    /**
     * Get the <code>start_value</code> parameter OUT value from the routine
     */
    public Long getStartValue() {
        return get(START_VALUE);
    }

    /**
     * Get the <code>minimum_value</code> parameter OUT value from the routine
     */
    public Long getMinimumValue() {
        return get(MINIMUM_VALUE);
    }

    /**
     * Get the <code>maximum_value</code> parameter OUT value from the routine
     */
    public Long getMaximumValue() {
        return get(MAXIMUM_VALUE);
    }

    /**
     * Get the <code>increment</code> parameter OUT value from the routine
     */
    public Long getIncrement() {
        return get(INCREMENT);
    }

    /**
     * Get the <code>cycle_option</code> parameter OUT value from the routine
     */
    public Boolean getCycleOption() {
        return get(CYCLE_OPTION);
    }

    /**
     * Get the <code>cache_size</code> parameter OUT value from the routine
     */
    public Long getCacheSize() {
        return get(CACHE_SIZE);
    }

    /**
     * Get the <code>data_type</code> parameter OUT value from the routine
     */
    public Long getDataType() {
        return get(DATA_TYPE);
    }
}
