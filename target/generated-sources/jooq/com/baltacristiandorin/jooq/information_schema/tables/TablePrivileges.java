/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables;


import com.baltacristiandorin.jooq.information_schema.InformationSchema;
import com.baltacristiandorin.jooq.information_schema.tables.records.TablePrivilegesRecord;

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
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablePrivileges extends TableImpl<TablePrivilegesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.table_privileges</code>
     */
    public static final TablePrivileges TABLE_PRIVILEGES = new TablePrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablePrivilegesRecord> getRecordType() {
        return TablePrivilegesRecord.class;
    }

    /**
     * The column <code>information_schema.table_privileges.grantor</code>.
     */
    public final TableField<TablePrivilegesRecord, String> GRANTOR = createField(DSL.name("grantor"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.table_privileges.grantee</code>.
     */
    public final TableField<TablePrivilegesRecord, String> GRANTEE = createField(DSL.name("grantee"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_privileges.table_catalog</code>.
     */
    public final TableField<TablePrivilegesRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.table_privileges.table_schema</code>.
     */
    public final TableField<TablePrivilegesRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.table_privileges.table_name</code>.
     */
    public final TableField<TablePrivilegesRecord, String> TABLE_NAME = createField(DSL.name("table_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_privileges.privilege_type</code>.
     */
    public final TableField<TablePrivilegesRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.table_privileges.is_grantable</code>.
     */
    public final TableField<TablePrivilegesRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.table_privileges.with_hierarchy</code>.
     */
    public final TableField<TablePrivilegesRecord, String> WITH_HIERARCHY = createField(DSL.name("with_hierarchy"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private TablePrivileges(Name alias, Table<TablePrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TablePrivileges(Name alias, Table<TablePrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "table_privileges" as  SELECT (u_grantor.rolname)::information_schema.sql_identifier AS grantor,
          (grantee.rolname)::information_schema.sql_identifier AS grantee,
          (current_database())::information_schema.sql_identifier AS table_catalog,
          (nc.nspname)::information_schema.sql_identifier AS table_schema,
          (c.relname)::information_schema.sql_identifier AS table_name,
          (c.prtype)::information_schema.character_data AS privilege_type,
          (
              CASE
                  WHEN (pg_has_role(grantee.oid, c.relowner, 'USAGE'::text) OR c.grantable) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_grantable,
          (
              CASE
                  WHEN (c.prtype = 'SELECT'::text) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS with_hierarchy
         FROM ( SELECT pg_class.oid,
                  pg_class.relname,
                  pg_class.relnamespace,
                  pg_class.relkind,
                  pg_class.relowner,
                  (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).grantor AS grantor,
                  (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).grantee AS grantee,
                  (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).privilege_type AS privilege_type,
                  (aclexplode(COALESCE(pg_class.relacl, acldefault('r'::"char", pg_class.relowner)))).is_grantable AS is_grantable
                 FROM pg_class) c(oid, relname, relnamespace, relkind, relowner, grantor, grantee, prtype, grantable),
          pg_namespace nc,
          pg_authid u_grantor,
          ( SELECT pg_authid.oid,
                  pg_authid.rolname
                 FROM pg_authid
              UNION ALL
               SELECT (0)::oid AS oid,
                  'PUBLIC'::name) grantee(oid, rolname)
        WHERE ((c.relnamespace = nc.oid) AND (c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND (c.grantee = grantee.oid) AND (c.grantor = u_grantor.oid) AND (c.prtype = ANY (ARRAY['INSERT'::text, 'SELECT'::text, 'UPDATE'::text, 'DELETE'::text, 'TRUNCATE'::text, 'REFERENCES'::text, 'TRIGGER'::text])) AND (pg_has_role(u_grantor.oid, 'USAGE'::text) OR pg_has_role(grantee.oid, 'USAGE'::text) OR (grantee.rolname = 'PUBLIC'::name)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.table_privileges</code> table
     * reference
     */
    public TablePrivileges(String alias) {
        this(DSL.name(alias), TABLE_PRIVILEGES);
    }

    /**
     * Create an aliased <code>information_schema.table_privileges</code> table
     * reference
     */
    public TablePrivileges(Name alias) {
        this(alias, TABLE_PRIVILEGES);
    }

    /**
     * Create a <code>information_schema.table_privileges</code> table reference
     */
    public TablePrivileges() {
        this(DSL.name("table_privileges"), null);
    }

    public <O extends Record> TablePrivileges(Table<O> child, ForeignKey<O, TablePrivilegesRecord> key) {
        super(child, key, TABLE_PRIVILEGES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public TablePrivileges as(String alias) {
        return new TablePrivileges(DSL.name(alias), this);
    }

    @Override
    public TablePrivileges as(Name alias) {
        return new TablePrivileges(alias, this);
    }

    @Override
    public TablePrivileges as(Table<?> alias) {
        return new TablePrivileges(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TablePrivileges rename(String name) {
        return new TablePrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TablePrivileges rename(Name name) {
        return new TablePrivileges(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TablePrivileges rename(Table<?> name) {
        return new TablePrivileges(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
