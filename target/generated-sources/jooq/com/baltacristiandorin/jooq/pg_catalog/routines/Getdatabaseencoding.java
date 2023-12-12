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
public class Getdatabaseencoding extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.getdatabaseencoding.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public Getdatabaseencoding() {
        super("getdatabaseencoding", PgCatalog.PG_CATALOG, SQLDataType.VARCHAR);

        setReturnParameter(RETURN_VALUE);
    }
}
