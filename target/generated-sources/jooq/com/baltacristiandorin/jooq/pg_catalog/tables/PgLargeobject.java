/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.Keys;
import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgLargeobjectRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLargeobject extends TableImpl<PgLargeobjectRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_largeobject</code>
     */
    public static final PgLargeobject PG_LARGEOBJECT = new PgLargeobject();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLargeobjectRecord> getRecordType() {
        return PgLargeobjectRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_largeobject.loid</code>.
     */
    public final TableField<PgLargeobjectRecord, Long> LOID = createField(DSL.name("loid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_largeobject.pageno</code>.
     */
    public final TableField<PgLargeobjectRecord, Integer> PAGENO = createField(DSL.name("pageno"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_largeobject.data</code>.
     */
    public final TableField<PgLargeobjectRecord, byte[]> DATA = createField(DSL.name("data"), SQLDataType.BLOB.nullable(false), this, "");

    private PgLargeobject(Name alias, Table<PgLargeobjectRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgLargeobject(Name alias, Table<PgLargeobjectRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_largeobject</code> table reference
     */
    public PgLargeobject(String alias) {
        this(DSL.name(alias), PG_LARGEOBJECT);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_largeobject</code> table reference
     */
    public PgLargeobject(Name alias) {
        this(alias, PG_LARGEOBJECT);
    }

    /**
     * Create a <code>pg_catalog.pg_largeobject</code> table reference
     */
    public PgLargeobject() {
        this(DSL.name("pg_largeobject"), null);
    }

    public <O extends Record> PgLargeobject(Table<O> child, ForeignKey<O, PgLargeobjectRecord> key) {
        super(child, key, PG_LARGEOBJECT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgLargeobjectRecord> getPrimaryKey() {
        return Keys.PG_LARGEOBJECT_LOID_PN_INDEX;
    }

    @Override
    public PgLargeobject as(String alias) {
        return new PgLargeobject(DSL.name(alias), this);
    }

    @Override
    public PgLargeobject as(Name alias) {
        return new PgLargeobject(alias, this);
    }

    @Override
    public PgLargeobject as(Table<?> alias) {
        return new PgLargeobject(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLargeobject rename(String name) {
        return new PgLargeobject(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLargeobject rename(Name name) {
        return new PgLargeobject(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLargeobject rename(Table<?> name) {
        return new PgLargeobject(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Integer, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Long, ? super Integer, ? super byte[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super Integer, ? super byte[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
