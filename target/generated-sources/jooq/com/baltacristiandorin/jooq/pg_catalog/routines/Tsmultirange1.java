/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.routines;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;



/**
 * @deprecated Unknown data type. If this is a qualified, user-defined type, it
 * may have been excluded from code generation. If this is a built-in type, you
 * can define an explicit {@link org.jooq.Binding} to specify how this type
 * should be handled. Deprecation can be turned off using {@literal
 * <deprecationOnUnknownTypes/>} in your code generator configuration.
 */
@Deprecated
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tsmultirange1 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsmultirange\""), false, false);

    /**
     * Create a new routine call instance
     */
    public Tsmultirange1() {
        super("tsmultirange", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsmultirange\""));

        setReturnParameter(RETURN_VALUE);
        setOverloaded(true);
    }
}
