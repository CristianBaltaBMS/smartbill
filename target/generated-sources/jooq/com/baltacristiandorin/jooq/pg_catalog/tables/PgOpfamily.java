/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.Keys;
import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgOpfamilyRecord;

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
public class PgOpfamily extends TableImpl<PgOpfamilyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_opfamily</code>
     */
    public static final PgOpfamily PG_OPFAMILY = new PgOpfamily();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgOpfamilyRecord> getRecordType() {
        return PgOpfamilyRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_opfamily.oid</code>.
     */
    public final TableField<PgOpfamilyRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opfamily.opfmethod</code>.
     */
    public final TableField<PgOpfamilyRecord, Long> OPFMETHOD = createField(DSL.name("opfmethod"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opfamily.opfname</code>.
     */
    public final TableField<PgOpfamilyRecord, String> OPFNAME = createField(DSL.name("opfname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opfamily.opfnamespace</code>.
     */
    public final TableField<PgOpfamilyRecord, Long> OPFNAMESPACE = createField(DSL.name("opfnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_opfamily.opfowner</code>.
     */
    public final TableField<PgOpfamilyRecord, Long> OPFOWNER = createField(DSL.name("opfowner"), SQLDataType.BIGINT.nullable(false), this, "");

    private PgOpfamily(Name alias, Table<PgOpfamilyRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgOpfamily(Name alias, Table<PgOpfamilyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_opfamily</code> table reference
     */
    public PgOpfamily(String alias) {
        this(DSL.name(alias), PG_OPFAMILY);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_opfamily</code> table reference
     */
    public PgOpfamily(Name alias) {
        this(alias, PG_OPFAMILY);
    }

    /**
     * Create a <code>pg_catalog.pg_opfamily</code> table reference
     */
    public PgOpfamily() {
        this(DSL.name("pg_opfamily"), null);
    }

    public <O extends Record> PgOpfamily(Table<O> child, ForeignKey<O, PgOpfamilyRecord> key) {
        super(child, key, PG_OPFAMILY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgOpfamilyRecord> getPrimaryKey() {
        return Keys.PG_OPFAMILY_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgOpfamilyRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_OPFAMILY_AM_NAME_NSP_INDEX);
    }

    @Override
    public PgOpfamily as(String alias) {
        return new PgOpfamily(DSL.name(alias), this);
    }

    @Override
    public PgOpfamily as(Name alias) {
        return new PgOpfamily(alias, this);
    }

    @Override
    public PgOpfamily as(Table<?> alias) {
        return new PgOpfamily(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOpfamily rename(String name) {
        return new PgOpfamily(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOpfamily rename(Name name) {
        return new PgOpfamily(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOpfamily rename(Table<?> name) {
        return new PgOpfamily(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, String, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Long, ? super Long, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Long, ? super Long, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
