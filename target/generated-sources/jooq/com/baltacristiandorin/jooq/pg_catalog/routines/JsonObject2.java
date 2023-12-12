/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.routines;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonObject2 extends AbstractRoutine<JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.json_object.RETURN_VALUE</code>.
     */
    public static final Parameter<JSON> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.JSON, false, false);

    /**
     * The parameter <code>pg_catalog.json_object._1</code>.
     */
    public static final Parameter<String[]> _1 = Internal.createParameter("_1", SQLDataType.CLOB.array(), false, true);

    /**
     * The parameter <code>pg_catalog.json_object._2</code>.
     */
    public static final Parameter<String[]> _2 = Internal.createParameter("_2", SQLDataType.CLOB.array(), false, true);

    /**
     * Create a new routine call instance
     */
    public JsonObject2() {
        super("json_object", PgCatalog.PG_CATALOG, SQLDataType.JSON);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(String[] value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<String[]> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(String[] value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<String[]> field) {
        setField(_2, field);
    }
}
