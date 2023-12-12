/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.Keys;
import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgDatabaseRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function16;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row16;
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
public class PgDatabase extends TableImpl<PgDatabaseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_database</code>
     */
    public static final PgDatabase PG_DATABASE = new PgDatabase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgDatabaseRecord> getRecordType() {
        return PgDatabaseRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_database.oid</code>.
     */
    public final TableField<PgDatabaseRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datname</code>.
     */
    public final TableField<PgDatabaseRecord, String> DATNAME = createField(DSL.name("datname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datdba</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATDBA = createField(DSL.name("datdba"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.encoding</code>.
     */
    public final TableField<PgDatabaseRecord, Integer> ENCODING = createField(DSL.name("encoding"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datlocprovider</code>.
     */
    public final TableField<PgDatabaseRecord, String> DATLOCPROVIDER = createField(DSL.name("datlocprovider"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datistemplate</code>.
     */
    public final TableField<PgDatabaseRecord, Boolean> DATISTEMPLATE = createField(DSL.name("datistemplate"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datallowconn</code>.
     */
    public final TableField<PgDatabaseRecord, Boolean> DATALLOWCONN = createField(DSL.name("datallowconn"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datconnlimit</code>.
     */
    public final TableField<PgDatabaseRecord, Integer> DATCONNLIMIT = createField(DSL.name("datconnlimit"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datfrozenxid</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATFROZENXID = createField(DSL.name("datfrozenxid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datminmxid</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATMINMXID = createField(DSL.name("datminmxid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.dattablespace</code>.
     */
    public final TableField<PgDatabaseRecord, Long> DATTABLESPACE = createField(DSL.name("dattablespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datcollate</code>.
     */
    public final TableField<PgDatabaseRecord, String> DATCOLLATE = createField(DSL.name("datcollate"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.datctype</code>.
     */
    public final TableField<PgDatabaseRecord, String> DATCTYPE = createField(DSL.name("datctype"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_database.daticulocale</code>.
     */
    public final TableField<PgDatabaseRecord, String> DATICULOCALE = createField(DSL.name("daticulocale"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_database.datcollversion</code>.
     */
    public final TableField<PgDatabaseRecord, String> DATCOLLVERSION = createField(DSL.name("datcollversion"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_database.datacl</code>.
     */
    public final TableField<PgDatabaseRecord, String[]> DATACL = createField(DSL.name("datacl"), SQLDataType.VARCHAR.array(), this, "");

    private PgDatabase(Name alias, Table<PgDatabaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgDatabase(Name alias, Table<PgDatabaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_database</code> table reference
     */
    public PgDatabase(String alias) {
        this(DSL.name(alias), PG_DATABASE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_database</code> table reference
     */
    public PgDatabase(Name alias) {
        this(alias, PG_DATABASE);
    }

    /**
     * Create a <code>pg_catalog.pg_database</code> table reference
     */
    public PgDatabase() {
        this(DSL.name("pg_database"), null);
    }

    public <O extends Record> PgDatabase(Table<O> child, ForeignKey<O, PgDatabaseRecord> key) {
        super(child, key, PG_DATABASE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgDatabaseRecord> getPrimaryKey() {
        return Keys.PG_DATABASE_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgDatabaseRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_DATABASE_DATNAME_INDEX);
    }

    @Override
    public PgDatabase as(String alias) {
        return new PgDatabase(DSL.name(alias), this);
    }

    @Override
    public PgDatabase as(Name alias) {
        return new PgDatabase(alias, this);
    }

    @Override
    public PgDatabase as(Table<?> alias) {
        return new PgDatabase(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDatabase rename(String name) {
        return new PgDatabase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDatabase rename(Name name) {
        return new PgDatabase(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDatabase rename(Table<?> name) {
        return new PgDatabase(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, String, Long, Integer, String, Boolean, Boolean, Integer, Long, Long, Long, String, String, String, String, String[]> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function16<? super Long, ? super String, ? super Long, ? super Integer, ? super String, ? super Boolean, ? super Boolean, ? super Integer, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function16<? super Long, ? super String, ? super Long, ? super Integer, ? super String, ? super Boolean, ? super Boolean, ? super Integer, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
