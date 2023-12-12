/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.Indexes;
import com.baltacristiandorin.jooq.pg_catalog.Keys;
import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgIndexRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function21;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row21;
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
public class PgIndex extends TableImpl<PgIndexRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_index</code>
     */
    public static final PgIndex PG_INDEX = new PgIndex();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgIndexRecord> getRecordType() {
        return PgIndexRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_index.indexrelid</code>.
     */
    public final TableField<PgIndexRecord, Long> INDEXRELID = createField(DSL.name("indexrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indrelid</code>.
     */
    public final TableField<PgIndexRecord, Long> INDRELID = createField(DSL.name("indrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indnatts</code>.
     */
    public final TableField<PgIndexRecord, Short> INDNATTS = createField(DSL.name("indnatts"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indnkeyatts</code>.
     */
    public final TableField<PgIndexRecord, Short> INDNKEYATTS = createField(DSL.name("indnkeyatts"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisunique</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISUNIQUE = createField(DSL.name("indisunique"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indnullsnotdistinct</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDNULLSNOTDISTINCT = createField(DSL.name("indnullsnotdistinct"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisprimary</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISPRIMARY = createField(DSL.name("indisprimary"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisexclusion</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISEXCLUSION = createField(DSL.name("indisexclusion"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indimmediate</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDIMMEDIATE = createField(DSL.name("indimmediate"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisclustered</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISCLUSTERED = createField(DSL.name("indisclustered"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisvalid</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISVALID = createField(DSL.name("indisvalid"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indcheckxmin</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDCHECKXMIN = createField(DSL.name("indcheckxmin"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisready</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISREADY = createField(DSL.name("indisready"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indislive</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISLIVE = createField(DSL.name("indislive"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisreplident</code>.
     */
    public final TableField<PgIndexRecord, Boolean> INDISREPLIDENT = createField(DSL.name("indisreplident"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indkey</code>.
     */
    public final TableField<PgIndexRecord, Object[]> INDKEY = createField(DSL.name("indkey"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"nt2vector\"").nullable(false).array(), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indcollation</code>.
     */
    public final TableField<PgIndexRecord, Object[]> INDCOLLATION = createField(DSL.name("indcollation"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"idvector\"").nullable(false).array(), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indclass</code>.
     */
    public final TableField<PgIndexRecord, Object[]> INDCLASS = createField(DSL.name("indclass"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"idvector\"").nullable(false).array(), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indoption</code>.
     */
    public final TableField<PgIndexRecord, Object[]> INDOPTION = createField(DSL.name("indoption"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"nt2vector\"").nullable(false).array(), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgIndexRecord, Object> INDEXPRS = createField(DSL.name("indexprs"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgIndexRecord, Object> INDPRED = createField(DSL.name("indpred"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    private PgIndex(Name alias, Table<PgIndexRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgIndex(Name alias, Table<PgIndexRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_index</code> table reference
     */
    public PgIndex(String alias) {
        this(DSL.name(alias), PG_INDEX);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_index</code> table reference
     */
    public PgIndex(Name alias) {
        this(alias, PG_INDEX);
    }

    /**
     * Create a <code>pg_catalog.pg_index</code> table reference
     */
    public PgIndex() {
        this(DSL.name("pg_index"), null);
    }

    public <O extends Record> PgIndex(Table<O> child, ForeignKey<O, PgIndexRecord> key) {
        super(child, key, PG_INDEX);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_INDEX_INDRELID_INDEX);
    }

    @Override
    public UniqueKey<PgIndexRecord> getPrimaryKey() {
        return Keys.PG_INDEX_INDEXRELID_INDEX;
    }

    @Override
    public PgIndex as(String alias) {
        return new PgIndex(DSL.name(alias), this);
    }

    @Override
    public PgIndex as(Name alias) {
        return new PgIndex(alias, this);
    }

    @Override
    public PgIndex as(Table<?> alias) {
        return new PgIndex(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgIndex rename(String name) {
        return new PgIndex(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgIndex rename(Name name) {
        return new PgIndex(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgIndex rename(Table<?> name) {
        return new PgIndex(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<Long, Long, Short, Short, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Object[], Object[], Object[], Object[], Object, Object> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function21<? super Long, ? super Long, ? super Short, ? super Short, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Object[], ? super Object[], ? super Object[], ? super Object[], ? super Object, ? super Object, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function21<? super Long, ? super Long, ? super Short, ? super Short, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Object[], ? super Object[], ? super Object[], ? super Object[], ? super Object, ? super Object, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
