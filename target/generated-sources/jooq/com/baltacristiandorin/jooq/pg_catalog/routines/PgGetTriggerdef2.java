/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.routines;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgGetTriggerdef2 extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.pg_get_triggerdef.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_get_triggerdef._1</code>.
     */
    public static final Parameter<Long> _1 = Internal.createParameter("_1", SQLDataType.BIGINT, false, true);

    /**
     * The parameter <code>pg_catalog.pg_get_triggerdef._2</code>.
     */
    public static final Parameter<Boolean> _2 = Internal.createParameter("_2", SQLDataType.BOOLEAN, false, true);

    /**
     * Create a new routine call instance
     */
    public PgGetTriggerdef2() {
        super("pg_get_triggerdef", PgCatalog.PG_CATALOG, SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Long value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Long> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Boolean value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<Boolean> field) {
        setField(_2, field);
    }
}