/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.Keys;
import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgTablespaceRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
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
public class PgTablespace extends TableImpl<PgTablespaceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_tablespace</code>
     */
    public static final PgTablespace PG_TABLESPACE = new PgTablespace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTablespaceRecord> getRecordType() {
        return PgTablespaceRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_tablespace.oid</code>.
     */
    public final TableField<PgTablespaceRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_tablespace.spcname</code>.
     */
    public final TableField<PgTablespaceRecord, String> SPCNAME = createField(DSL.name("spcname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_tablespace.spcowner</code>.
     */
    public final TableField<PgTablespaceRecord, Long> SPCOWNER = createField(DSL.name("spcowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_tablespace.spcacl</code>.
     */
    public final TableField<PgTablespaceRecord, String[]> SPCACL = createField(DSL.name("spcacl"), SQLDataType.VARCHAR.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_tablespace.spcoptions</code>.
     */
    public final TableField<PgTablespaceRecord, String[]> SPCOPTIONS = createField(DSL.name("spcoptions"), SQLDataType.CLOB.array(), this, "");

    private PgTablespace(Name alias, Table<PgTablespaceRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTablespace(Name alias, Table<PgTablespaceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_tablespace</code> table reference
     */
    public PgTablespace(String alias) {
        this(DSL.name(alias), PG_TABLESPACE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_tablespace</code> table reference
     */
    public PgTablespace(Name alias) {
        this(alias, PG_TABLESPACE);
    }

    /**
     * Create a <code>pg_catalog.pg_tablespace</code> table reference
     */
    public PgTablespace() {
        this(DSL.name("pg_tablespace"), null);
    }

    public <O extends Record> PgTablespace(Table<O> child, ForeignKey<O, PgTablespaceRecord> key) {
        super(child, key, PG_TABLESPACE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgTablespaceRecord> getPrimaryKey() {
        return Keys.PG_TABLESPACE_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgTablespaceRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_TABLESPACE_SPCNAME_INDEX);
    }

    @Override
    public PgTablespace as(String alias) {
        return new PgTablespace(DSL.name(alias), this);
    }

    @Override
    public PgTablespace as(Name alias) {
        return new PgTablespace(alias, this);
    }

    @Override
    public PgTablespace as(Table<?> alias) {
        return new PgTablespace(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTablespace rename(String name) {
        return new PgTablespace(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTablespace rename(Name name) {
        return new PgTablespace(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTablespace rename(Table<?> name) {
        return new PgTablespace(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, Long, String[], String[]> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Long, ? super String, ? super Long, ? super String[], ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Long, ? super String, ? super Long, ? super String[], ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
