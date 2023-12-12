/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables;


import com.baltacristiandorin.jooq.information_schema.InformationSchema;
import com.baltacristiandorin.jooq.information_schema.tables.records.RoleColumnGrantsRecord;

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
public class RoleColumnGrants extends TableImpl<RoleColumnGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.role_column_grants</code>
     */
    public static final RoleColumnGrants ROLE_COLUMN_GRANTS = new RoleColumnGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleColumnGrantsRecord> getRecordType() {
        return RoleColumnGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_column_grants.grantor</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> GRANTOR = createField(DSL.name("grantor"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_column_grants.grantee</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> GRANTEE = createField(DSL.name("grantee"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_column_grants.table_catalog</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_column_grants.table_schema</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_column_grants.table_name</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> TABLE_NAME = createField(DSL.name("table_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_column_grants.column_name</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_column_grants.privilege_type</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_column_grants.is_grantable</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private RoleColumnGrants(Name alias, Table<RoleColumnGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleColumnGrants(Name alias, Table<RoleColumnGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "role_column_grants" as  SELECT column_privileges.grantor,
          column_privileges.grantee,
          column_privileges.table_catalog,
          column_privileges.table_schema,
          column_privileges.table_name,
          column_privileges.column_name,
          column_privileges.privilege_type,
          column_privileges.is_grantable
         FROM information_schema.column_privileges
        WHERE (((column_privileges.grantor)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)) OR ((column_privileges.grantee)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.role_column_grants</code>
     * table reference
     */
    public RoleColumnGrants(String alias) {
        this(DSL.name(alias), ROLE_COLUMN_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.role_column_grants</code>
     * table reference
     */
    public RoleColumnGrants(Name alias) {
        this(alias, ROLE_COLUMN_GRANTS);
    }

    /**
     * Create a <code>information_schema.role_column_grants</code> table
     * reference
     */
    public RoleColumnGrants() {
        this(DSL.name("role_column_grants"), null);
    }

    public <O extends Record> RoleColumnGrants(Table<O> child, ForeignKey<O, RoleColumnGrantsRecord> key) {
        super(child, key, ROLE_COLUMN_GRANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleColumnGrants as(String alias) {
        return new RoleColumnGrants(DSL.name(alias), this);
    }

    @Override
    public RoleColumnGrants as(Name alias) {
        return new RoleColumnGrants(alias, this);
    }

    @Override
    public RoleColumnGrants as(Table<?> alias) {
        return new RoleColumnGrants(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleColumnGrants rename(String name) {
        return new RoleColumnGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleColumnGrants rename(Name name) {
        return new RoleColumnGrants(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleColumnGrants rename(Table<?> name) {
        return new RoleColumnGrants(name.getQualifiedName(), null);
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
