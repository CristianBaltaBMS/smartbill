/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.JsonbEachRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function2;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbEach extends TableImpl<JsonbEachRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.jsonb_each</code>
     */
    public static final JsonbEach JSONB_EACH = new JsonbEach();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonbEachRecord> getRecordType() {
        return JsonbEachRecord.class;
    }

    /**
     * The column <code>pg_catalog.jsonb_each.key</code>.
     */
    public final TableField<JsonbEachRecord, String> KEY = createField(DSL.name("key"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.jsonb_each.value</code>.
     */
    public final TableField<JsonbEachRecord, JSONB> VALUE = createField(DSL.name("value"), SQLDataType.JSONB, this, "");

    private JsonbEach(Name alias, Table<JsonbEachRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.JSONB)
        });
    }

    private JsonbEach(Name alias, Table<JsonbEachRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_each</code> table reference
     */
    public JsonbEach(String alias) {
        this(DSL.name(alias), JSONB_EACH);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_each</code> table reference
     */
    public JsonbEach(Name alias) {
        this(alias, JSONB_EACH);
    }

    /**
     * Create a <code>pg_catalog.jsonb_each</code> table reference
     */
    public JsonbEach() {
        this(DSL.name("jsonb_each"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public JsonbEach as(String alias) {
        return new JsonbEach(DSL.name(alias), this, parameters);
    }

    @Override
    public JsonbEach as(Name alias) {
        return new JsonbEach(alias, this, parameters);
    }

    @Override
    public JsonbEach as(Table<?> alias) {
        return new JsonbEach(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbEach rename(String name) {
        return new JsonbEach(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbEach rename(Name name) {
        return new JsonbEach(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbEach rename(Table<?> name) {
        return new JsonbEach(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, JSONB> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public JsonbEach call(
          JSONB fromJson
    ) {
        JsonbEach result = new JsonbEach(DSL.name("jsonb_each"), null, new Field[] {
            DSL.val(fromJson, SQLDataType.JSONB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public JsonbEach call(
          Field<JSONB> fromJson
    ) {
        JsonbEach result = new JsonbEach(DSL.name("jsonb_each"), null, new Field[] {
            fromJson
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super JSONB, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super JSONB, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
