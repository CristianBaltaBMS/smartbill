/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables;


import com.baltacristiandorin.jooq.information_schema.InformationSchema;
import com.baltacristiandorin.jooq.information_schema.tables.records.ConstraintTableUsageRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConstraintTableUsage extends TableImpl<ConstraintTableUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.constraint_table_usage</code>
     */
    public static final ConstraintTableUsage CONSTRAINT_TABLE_USAGE = new ConstraintTableUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConstraintTableUsageRecord> getRecordType() {
        return ConstraintTableUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.constraint_table_usage.table_catalog</code>.
     */
    public final TableField<ConstraintTableUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_table_usage.table_schema</code>.
     */
    public final TableField<ConstraintTableUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_table_usage.table_name</code>.
     */
    public final TableField<ConstraintTableUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_table_usage.constraint_catalog</code>.
     */
    public final TableField<ConstraintTableUsageRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_table_usage.constraint_schema</code>.
     */
    public final TableField<ConstraintTableUsageRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_table_usage.constraint_name</code>.
     */
    public final TableField<ConstraintTableUsageRecord, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ConstraintTableUsage(Name alias, Table<ConstraintTableUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConstraintTableUsage(Name alias, Table<ConstraintTableUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "constraint_table_usage" as  SELECT (current_database())::information_schema.sql_identifier AS table_catalog,
          (nr.nspname)::information_schema.sql_identifier AS table_schema,
          (r.relname)::information_schema.sql_identifier AS table_name,
          (current_database())::information_schema.sql_identifier AS constraint_catalog,
          (nc.nspname)::information_schema.sql_identifier AS constraint_schema,
          (c.conname)::information_schema.sql_identifier AS constraint_name
         FROM pg_constraint c,
          pg_namespace nc,
          pg_class r,
          pg_namespace nr
        WHERE ((c.connamespace = nc.oid) AND (r.relnamespace = nr.oid) AND (((c.contype = 'f'::"char") AND (c.confrelid = r.oid)) OR ((c.contype = ANY (ARRAY['p'::"char", 'u'::"char"])) AND (c.conrelid = r.oid))) AND (r.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) AND pg_has_role(r.relowner, 'USAGE'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.constraint_table_usage</code>
     * table reference
     */
    public ConstraintTableUsage(String alias) {
        this(DSL.name(alias), CONSTRAINT_TABLE_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.constraint_table_usage</code>
     * table reference
     */
    public ConstraintTableUsage(Name alias) {
        this(alias, CONSTRAINT_TABLE_USAGE);
    }

    /**
     * Create a <code>information_schema.constraint_table_usage</code> table
     * reference
     */
    public ConstraintTableUsage() {
        this(DSL.name("constraint_table_usage"), null);
    }

    public <O extends Record> ConstraintTableUsage(Table<O> child, ForeignKey<O, ConstraintTableUsageRecord> key) {
        super(child, key, CONSTRAINT_TABLE_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ConstraintTableUsage as(String alias) {
        return new ConstraintTableUsage(DSL.name(alias), this);
    }

    @Override
    public ConstraintTableUsage as(Name alias) {
        return new ConstraintTableUsage(alias, this);
    }

    @Override
    public ConstraintTableUsage as(Table<?> alias) {
        return new ConstraintTableUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintTableUsage rename(String name) {
        return new ConstraintTableUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintTableUsage rename(Name name) {
        return new ConstraintTableUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintTableUsage rename(Table<?> name) {
        return new ConstraintTableUsage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
