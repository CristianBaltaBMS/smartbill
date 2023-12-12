/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.routines;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;



/**
 * @deprecated Unknown data type. If this is a qualified, user-defined type, it
 * may have been excluded from code generation. If this is a built-in type, you
 * can define an explicit {@link org.jooq.Binding} to specify how this type
 * should be handled. Deprecation can be turned off using {@literal
 * <deprecationOnUnknownTypes/>} in your code generator configuration.
 */
@Deprecated
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonPopulateRecord extends AbstractRoutine<Object> {

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
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\""), false, false);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> BASE = Internal.createParameter("base", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\""), false, false);

    /**
     * The parameter <code>pg_catalog.json_populate_record.from_json</code>.
     */
    public static final Parameter<JSON> FROM_JSON = Internal.createParameter("from_json", SQLDataType.JSON, false, false);

    /**
     * The parameter
     * <code>pg_catalog.json_populate_record.use_json_as_text</code>.
     */
    public static final Parameter<Boolean> USE_JSON_AS_TEXT = Internal.createParameter("use_json_as_text", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public JsonPopulateRecord() {
        super("json_populate_record", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(BASE);
        addInParameter(FROM_JSON);
        addInParameter(USE_JSON_AS_TEXT);
    }

    /**
     * Set the <code>base</code> parameter IN value to the routine
     */
    public void setBase(Object value) {
        setValue(BASE, value);
    }

    /**
     * Set the <code>base</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setBase(Field<Object> field) {
        setField(BASE, field);
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    public void setFromJson(JSON value) {
        setValue(FROM_JSON, value);
    }

    /**
     * Set the <code>from_json</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setFromJson(Field<JSON> field) {
        setField(FROM_JSON, field);
    }

    /**
     * Set the <code>use_json_as_text</code> parameter IN value to the routine
     */
    public void setUseJsonAsText(Boolean value) {
        setValue(USE_JSON_AS_TEXT, value);
    }

    /**
     * Set the <code>use_json_as_text</code> parameter to the function to be
     * used with a {@link org.jooq.Select} statement
     */
    public void setUseJsonAsText(Field<Boolean> field) {
        setField(USE_JSON_AS_TEXT, field);
    }
}
