/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgGetWalResourceManagersRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row3;
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
public class PgGetWalResourceManagers extends TableImpl<PgGetWalResourceManagersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_get_wal_resource_managers</code>
     */
    public static final PgGetWalResourceManagers PG_GET_WAL_RESOURCE_MANAGERS = new PgGetWalResourceManagers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgGetWalResourceManagersRecord> getRecordType() {
        return PgGetWalResourceManagersRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_get_wal_resource_managers.rm_id</code>.
     */
    public final TableField<PgGetWalResourceManagersRecord, Integer> RM_ID = createField(DSL.name("rm_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_get_wal_resource_managers.rm_name</code>.
     */
    public final TableField<PgGetWalResourceManagersRecord, String> RM_NAME = createField(DSL.name("rm_name"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_get_wal_resource_managers.rm_builtin</code>.
     */
    public final TableField<PgGetWalResourceManagersRecord, Boolean> RM_BUILTIN = createField(DSL.name("rm_builtin"), SQLDataType.BOOLEAN, this, "");

    private PgGetWalResourceManagers(Name alias, Table<PgGetWalResourceManagersRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgGetWalResourceManagers(Name alias, Table<PgGetWalResourceManagersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_wal_resource_managers</code>
     * table reference
     */
    public PgGetWalResourceManagers(String alias) {
        this(DSL.name(alias), PG_GET_WAL_RESOURCE_MANAGERS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_wal_resource_managers</code>
     * table reference
     */
    public PgGetWalResourceManagers(Name alias) {
        this(alias, PG_GET_WAL_RESOURCE_MANAGERS);
    }

    /**
     * Create a <code>pg_catalog.pg_get_wal_resource_managers</code> table
     * reference
     */
    public PgGetWalResourceManagers() {
        this(DSL.name("pg_get_wal_resource_managers"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgGetWalResourceManagers as(String alias) {
        return new PgGetWalResourceManagers(DSL.name(alias), this, parameters);
    }

    @Override
    public PgGetWalResourceManagers as(Name alias) {
        return new PgGetWalResourceManagers(alias, this, parameters);
    }

    @Override
    public PgGetWalResourceManagers as(Table<?> alias) {
        return new PgGetWalResourceManagers(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetWalResourceManagers rename(String name) {
        return new PgGetWalResourceManagers(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetWalResourceManagers rename(Name name) {
        return new PgGetWalResourceManagers(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetWalResourceManagers rename(Table<?> name) {
        return new PgGetWalResourceManagers(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Boolean> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgGetWalResourceManagers call() {
        PgGetWalResourceManagers result = new PgGetWalResourceManagers(DSL.name("pg_get_wal_resource_managers"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super String, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super String, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
