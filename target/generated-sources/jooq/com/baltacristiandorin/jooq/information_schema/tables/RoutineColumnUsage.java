/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables;


import com.baltacristiandorin.jooq.information_schema.InformationSchema;
import com.baltacristiandorin.jooq.information_schema.tables.records.RoutineColumnUsageRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function10;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row10;
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
public class RoutineColumnUsage extends TableImpl<RoutineColumnUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.routine_column_usage</code>
     */
    public static final RoutineColumnUsage ROUTINE_COLUMN_USAGE = new RoutineColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoutineColumnUsageRecord> getRecordType() {
        return RoutineColumnUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.routine_column_usage.specific_catalog</code>.
     */
    public final TableField<RoutineColumnUsageRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_column_usage.specific_schema</code>.
     */
    public final TableField<RoutineColumnUsageRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_column_usage.specific_name</code>.
     */
    public final TableField<RoutineColumnUsageRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_column_usage.routine_catalog</code>.
     */
    public final TableField<RoutineColumnUsageRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_column_usage.routine_schema</code>.
     */
    public final TableField<RoutineColumnUsageRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_column_usage.routine_name</code>.
     */
    public final TableField<RoutineColumnUsageRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_column_usage.table_catalog</code>.
     */
    public final TableField<RoutineColumnUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_column_usage.table_schema</code>.
     */
    public final TableField<RoutineColumnUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_column_usage.table_name</code>.
     */
    public final TableField<RoutineColumnUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_column_usage.column_name</code>.
     */
    public final TableField<RoutineColumnUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private RoutineColumnUsage(Name alias, Table<RoutineColumnUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoutineColumnUsage(Name alias, Table<RoutineColumnUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "routine_column_usage" as  SELECT DISTINCT (current_database())::information_schema.sql_identifier AS specific_catalog,
          (np.nspname)::information_schema.sql_identifier AS specific_schema,
          (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name,
          (current_database())::information_schema.sql_identifier AS routine_catalog,
          (np.nspname)::information_schema.sql_identifier AS routine_schema,
          (p.proname)::information_schema.sql_identifier AS routine_name,
          (current_database())::information_schema.sql_identifier AS table_catalog,
          (nt.nspname)::information_schema.sql_identifier AS table_schema,
          (t.relname)::information_schema.sql_identifier AS table_name,
          (a.attname)::information_schema.sql_identifier AS column_name
         FROM pg_namespace np,
          pg_proc p,
          pg_depend d,
          pg_class t,
          pg_namespace nt,
          pg_attribute a
        WHERE ((np.oid = p.pronamespace) AND (p.oid = d.objid) AND (d.classid = ('pg_proc'::regclass)::oid) AND (d.refobjid = t.oid) AND (d.refclassid = ('pg_class'::regclass)::oid) AND (t.relnamespace = nt.oid) AND (t.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND (t.oid = a.attrelid) AND (d.refobjsubid = a.attnum) AND pg_has_role(t.relowner, 'USAGE'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.routine_column_usage</code>
     * table reference
     */
    public RoutineColumnUsage(String alias) {
        this(DSL.name(alias), ROUTINE_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.routine_column_usage</code>
     * table reference
     */
    public RoutineColumnUsage(Name alias) {
        this(alias, ROUTINE_COLUMN_USAGE);
    }

    /**
     * Create a <code>information_schema.routine_column_usage</code> table
     * reference
     */
    public RoutineColumnUsage() {
        this(DSL.name("routine_column_usage"), null);
    }

    public <O extends Record> RoutineColumnUsage(Table<O> child, ForeignKey<O, RoutineColumnUsageRecord> key) {
        super(child, key, ROUTINE_COLUMN_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoutineColumnUsage as(String alias) {
        return new RoutineColumnUsage(DSL.name(alias), this);
    }

    @Override
    public RoutineColumnUsage as(Name alias) {
        return new RoutineColumnUsage(alias, this);
    }

    @Override
    public RoutineColumnUsage as(Table<?> alias) {
        return new RoutineColumnUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineColumnUsage rename(String name) {
        return new RoutineColumnUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineColumnUsage rename(Name name) {
        return new RoutineColumnUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineColumnUsage rename(Table<?> name) {
        return new RoutineColumnUsage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function10<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function10<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
