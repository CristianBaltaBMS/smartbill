/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgPoliciesRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
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
public class PgPolicies extends TableImpl<PgPoliciesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_policies</code>
     */
    public static final PgPolicies PG_POLICIES = new PgPolicies();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPoliciesRecord> getRecordType() {
        return PgPoliciesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_policies.schemaname</code>.
     */
    public final TableField<PgPoliciesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.tablename</code>.
     */
    public final TableField<PgPoliciesRecord, String> TABLENAME = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.policyname</code>.
     */
    public final TableField<PgPoliciesRecord, String> POLICYNAME = createField(DSL.name("policyname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.permissive</code>.
     */
    public final TableField<PgPoliciesRecord, String> PERMISSIVE = createField(DSL.name("permissive"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.roles</code>.
     */
    public final TableField<PgPoliciesRecord, String[]> ROLES = createField(DSL.name("roles"), SQLDataType.VARCHAR.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_policies.cmd</code>.
     */
    public final TableField<PgPoliciesRecord, String> CMD = createField(DSL.name("cmd"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.qual</code>.
     */
    public final TableField<PgPoliciesRecord, String> QUAL = createField(DSL.name("qual"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.with_check</code>.
     */
    public final TableField<PgPoliciesRecord, String> WITH_CHECK = createField(DSL.name("with_check"), SQLDataType.CLOB, this, "");

    private PgPolicies(Name alias, Table<PgPoliciesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPolicies(Name alias, Table<PgPoliciesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_policies" as  SELECT n.nspname AS schemaname,
         c.relname AS tablename,
         pol.polname AS policyname,
             CASE
                 WHEN pol.polpermissive THEN 'PERMISSIVE'::text
                 ELSE 'RESTRICTIVE'::text
             END AS permissive,
             CASE
                 WHEN (pol.polroles = '{0}'::oid[]) THEN (string_to_array('public'::text, ''::text))::name[]
                 ELSE ARRAY( SELECT pg_authid.rolname
                    FROM pg_authid
                   WHERE (pg_authid.oid = ANY (pol.polroles))
                   ORDER BY pg_authid.rolname)
             END AS roles,
             CASE pol.polcmd
                 WHEN 'r'::"char" THEN 'SELECT'::text
                 WHEN 'a'::"char" THEN 'INSERT'::text
                 WHEN 'w'::"char" THEN 'UPDATE'::text
                 WHEN 'd'::"char" THEN 'DELETE'::text
                 WHEN '*'::"char" THEN 'ALL'::text
                 ELSE NULL::text
             END AS cmd,
         pg_get_expr(pol.polqual, pol.polrelid) AS qual,
         pg_get_expr(pol.polwithcheck, pol.polrelid) AS with_check
        FROM ((pg_policy pol
          JOIN pg_class c ON ((c.oid = pol.polrelid)))
          LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)));
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_policies</code> table reference
     */
    public PgPolicies(String alias) {
        this(DSL.name(alias), PG_POLICIES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_policies</code> table reference
     */
    public PgPolicies(Name alias) {
        this(alias, PG_POLICIES);
    }

    /**
     * Create a <code>pg_catalog.pg_policies</code> table reference
     */
    public PgPolicies() {
        this(DSL.name("pg_policies"), null);
    }

    public <O extends Record> PgPolicies(Table<O> child, ForeignKey<O, PgPoliciesRecord> key) {
        super(child, key, PG_POLICIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgPolicies as(String alias) {
        return new PgPolicies(DSL.name(alias), this);
    }

    @Override
    public PgPolicies as(Name alias) {
        return new PgPolicies(alias, this);
    }

    @Override
    public PgPolicies as(Table<?> alias) {
        return new PgPolicies(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPolicies rename(String name) {
        return new PgPolicies(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPolicies rename(Name name) {
        return new PgPolicies(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPolicies rename(Table<?> name) {
        return new PgPolicies(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String[], String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super String, ? super String, ? super String, ? super String, ? super String[], ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super String, ? super String, ? super String, ? super String, ? super String[], ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
