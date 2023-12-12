/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgAvailableExtensionVersionsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
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
public class PgAvailableExtensionVersions extends TableImpl<PgAvailableExtensionVersionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_available_extension_versions</code>
     */
    public static final PgAvailableExtensionVersions PG_AVAILABLE_EXTENSION_VERSIONS = new PgAvailableExtensionVersions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAvailableExtensionVersionsRecord> getRecordType() {
        return PgAvailableExtensionVersionsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_available_extension_versions.name</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.version</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, String> VERSION = createField(DSL.name("version"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.installed</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, Boolean> INSTALLED = createField(DSL.name("installed"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.superuser</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, Boolean> SUPERUSER = createField(DSL.name("superuser"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.trusted</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, Boolean> TRUSTED = createField(DSL.name("trusted"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.relocatable</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, Boolean> RELOCATABLE = createField(DSL.name("relocatable"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.schema</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, String> SCHEMA = createField(DSL.name("schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.requires</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, String[]> REQUIRES = createField(DSL.name("requires"), SQLDataType.VARCHAR.array(), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_available_extension_versions.comment</code>.
     */
    public final TableField<PgAvailableExtensionVersionsRecord, String> COMMENT = createField(DSL.name("comment"), SQLDataType.CLOB, this, "");

    private PgAvailableExtensionVersions(Name alias, Table<PgAvailableExtensionVersionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAvailableExtensionVersions(Name alias, Table<PgAvailableExtensionVersionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_available_extension_versions" as  SELECT e.name,
         e.version,
         (x.extname IS NOT NULL) AS installed,
         e.superuser,
         e.trusted,
         e.relocatable,
         e.schema,
         e.requires,
         e.comment
        FROM (pg_available_extension_versions() e(name, version, superuser, trusted, relocatable, schema, requires, comment)
          LEFT JOIN pg_extension x ON (((e.name = x.extname) AND (e.version = x.extversion))));
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_available_extension_versions</code>
     * table reference
     */
    public PgAvailableExtensionVersions(String alias) {
        this(DSL.name(alias), PG_AVAILABLE_EXTENSION_VERSIONS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_available_extension_versions</code>
     * table reference
     */
    public PgAvailableExtensionVersions(Name alias) {
        this(alias, PG_AVAILABLE_EXTENSION_VERSIONS);
    }

    /**
     * Create a <code>pg_catalog.pg_available_extension_versions</code> table
     * reference
     */
    public PgAvailableExtensionVersions() {
        this(DSL.name("pg_available_extension_versions"), null);
    }

    public <O extends Record> PgAvailableExtensionVersions(Table<O> child, ForeignKey<O, PgAvailableExtensionVersionsRecord> key) {
        super(child, key, PG_AVAILABLE_EXTENSION_VERSIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgAvailableExtensionVersions as(String alias) {
        return new PgAvailableExtensionVersions(DSL.name(alias), this);
    }

    @Override
    public PgAvailableExtensionVersions as(Name alias) {
        return new PgAvailableExtensionVersions(alias, this);
    }

    @Override
    public PgAvailableExtensionVersions as(Table<?> alias) {
        return new PgAvailableExtensionVersions(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAvailableExtensionVersions rename(String name) {
        return new PgAvailableExtensionVersions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAvailableExtensionVersions rename(Name name) {
        return new PgAvailableExtensionVersions(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAvailableExtensionVersions rename(Table<?> name) {
        return new PgAvailableExtensionVersions(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, Boolean, Boolean, Boolean, Boolean, String, String[], String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super String, ? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super String[], ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super String[], ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
