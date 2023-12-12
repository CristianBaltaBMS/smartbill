/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables;


import com.baltacristiandorin.jooq.information_schema.InformationSchema;
import com.baltacristiandorin.jooq.information_schema.tables.records.TableConstraintsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function11;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row11;
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
public class TableConstraints extends TableImpl<TableConstraintsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.table_constraints</code>
     */
    public static final TableConstraints TABLE_CONSTRAINTS = new TableConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TableConstraintsRecord> getRecordType() {
        return TableConstraintsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.table_constraints.constraint_catalog</code>.
     */
    public final TableField<TableConstraintsRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.constraint_schema</code>.
     */
    public final TableField<TableConstraintsRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.constraint_name</code>.
     */
    public final TableField<TableConstraintsRecord, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.table_catalog</code>.
     */
    public final TableField<TableConstraintsRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.table_schema</code>.
     */
    public final TableField<TableConstraintsRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.table_constraints.table_name</code>.
     */
    public final TableField<TableConstraintsRecord, String> TABLE_NAME = createField(DSL.name("table_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.constraint_type</code>.
     */
    public final TableField<TableConstraintsRecord, String> CONSTRAINT_TYPE = createField(DSL.name("constraint_type"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.is_deferrable</code>.
     */
    public final TableField<TableConstraintsRecord, String> IS_DEFERRABLE = createField(DSL.name("is_deferrable"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.initially_deferred</code>.
     */
    public final TableField<TableConstraintsRecord, String> INITIALLY_DEFERRED = createField(DSL.name("initially_deferred"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.table_constraints.enforced</code>.
     */
    public final TableField<TableConstraintsRecord, String> ENFORCED = createField(DSL.name("enforced"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_constraints.nulls_distinct</code>.
     */
    public final TableField<TableConstraintsRecord, String> NULLS_DISTINCT = createField(DSL.name("nulls_distinct"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private TableConstraints(Name alias, Table<TableConstraintsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TableConstraints(Name alias, Table<TableConstraintsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
         create view "table_constraints" as  SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,
            (nc.nspname)::information_schema.sql_identifier AS constraint_schema,
            (c.conname)::information_schema.sql_identifier AS constraint_name,
            (current_database())::information_schema.sql_identifier AS table_catalog,
            (nr.nspname)::information_schema.sql_identifier AS table_schema,
            (r.relname)::information_schema.sql_identifier AS table_name,
            (
                CASE c.contype
                    WHEN 'c'::"char" THEN 'CHECK'::text
                    WHEN 'f'::"char" THEN 'FOREIGN KEY'::text
                    WHEN 'p'::"char" THEN 'PRIMARY KEY'::text
                    WHEN 'u'::"char" THEN 'UNIQUE'::text
                    ELSE NULL::text
                END)::information_schema.character_data AS constraint_type,
            (
                CASE
                    WHEN c.condeferrable THEN 'YES'::text
                    ELSE 'NO'::text
                END)::information_schema.yes_or_no AS is_deferrable,
            (
                CASE
                    WHEN c.condeferred THEN 'YES'::text
                    ELSE 'NO'::text
                END)::information_schema.yes_or_no AS initially_deferred,
            ('YES'::character varying)::information_schema.yes_or_no AS enforced,
            (
                CASE
                    WHEN (c.contype = 'u'::"char") THEN
                    CASE
                        WHEN ( SELECT (NOT pg_index.indnullsnotdistinct)
                           FROM pg_index
                          WHERE (pg_index.indexrelid = c.conindid)) THEN 'YES'::text
                        ELSE 'NO'::text
                    END
                    ELSE NULL::text
                END)::information_schema.yes_or_no AS nulls_distinct
           FROM pg_namespace nc,
            pg_namespace nr,
            pg_constraint c,
            pg_class r
          WHERE ((nc.oid = c.connamespace) AND (nr.oid = r.relnamespace) AND (c.conrelid = r.oid) AND (c.contype <> ALL (ARRAY['t'::"char", 'x'::"char"])) AND (r.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) AND (NOT pg_is_other_temp_schema(nr.oid)) AND (pg_has_role(r.relowner, 'USAGE'::text) OR has_table_privilege(r.oid, 'INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(r.oid, 'INSERT, UPDATE, REFERENCES'::text)))
        UNION ALL
         SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,
            (nr.nspname)::information_schema.sql_identifier AS constraint_schema,
            (((((((nr.oid)::text || '_'::text) || (r.oid)::text) || '_'::text) || (a.attnum)::text) || '_not_null'::text))::information_schema.sql_identifier AS constraint_name,
            (current_database())::information_schema.sql_identifier AS table_catalog,
            (nr.nspname)::information_schema.sql_identifier AS table_schema,
            (r.relname)::information_schema.sql_identifier AS table_name,
            ('CHECK'::character varying)::information_schema.character_data AS constraint_type,
            ('NO'::character varying)::information_schema.yes_or_no AS is_deferrable,
            ('NO'::character varying)::information_schema.yes_or_no AS initially_deferred,
            ('YES'::character varying)::information_schema.yes_or_no AS enforced,
            (NULL::character varying)::information_schema.yes_or_no AS nulls_distinct
           FROM pg_namespace nr,
            pg_class r,
            pg_attribute a
          WHERE ((nr.oid = r.relnamespace) AND (r.oid = a.attrelid) AND a.attnotnull AND (a.attnum > 0) AND (NOT a.attisdropped) AND (r.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) AND (NOT pg_is_other_temp_schema(nr.oid)) AND (pg_has_role(r.relowner, 'USAGE'::text) OR has_table_privilege(r.oid, 'INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(r.oid, 'INSERT, UPDATE, REFERENCES'::text)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.table_constraints</code> table
     * reference
     */
    public TableConstraints(String alias) {
        this(DSL.name(alias), TABLE_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>information_schema.table_constraints</code> table
     * reference
     */
    public TableConstraints(Name alias) {
        this(alias, TABLE_CONSTRAINTS);
    }

    /**
     * Create a <code>information_schema.table_constraints</code> table
     * reference
     */
    public TableConstraints() {
        this(DSL.name("table_constraints"), null);
    }

    public <O extends Record> TableConstraints(Table<O> child, ForeignKey<O, TableConstraintsRecord> key) {
        super(child, key, TABLE_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public TableConstraints as(String alias) {
        return new TableConstraints(DSL.name(alias), this);
    }

    @Override
    public TableConstraints as(Name alias) {
        return new TableConstraints(alias, this);
    }

    @Override
    public TableConstraints as(Table<?> alias) {
        return new TableConstraints(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraints rename(String name) {
        return new TableConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraints rename(Name name) {
        return new TableConstraints(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraints rename(Table<?> name) {
        return new TableConstraints(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
