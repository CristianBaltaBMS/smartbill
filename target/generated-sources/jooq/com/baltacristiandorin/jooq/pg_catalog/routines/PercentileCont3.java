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
public class PercentileCont3 extends AbstractRoutine<Double[]> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.percentile_cont.RETURN_VALUE</code>.
     */
    public static final Parameter<Double[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.FLOAT.array(), false, false);

    /**
     * The parameter <code>pg_catalog.percentile_cont._1</code>.
     */
    public static final Parameter<Double[]> _1 = Internal.createParameter("_1", SQLDataType.FLOAT.array(), false, true);

    /**
     * The parameter <code>pg_catalog.percentile_cont._2</code>.
     */
    public static final Parameter<Double> _2 = Internal.createParameter("_2", SQLDataType.DOUBLE, false, true);

    /**
     * Create a new routine call instance
     */
    public PercentileCont3() {
        super("percentile_cont", PgCatalog.PG_CATALOG, SQLDataType.FLOAT.array());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Double[] value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Double[]> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Double value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<Double> field) {
        setField(_2, field);
    }
}
