/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.Keys;
import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgParameterAclRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
public class PgParameterAcl extends TableImpl<PgParameterAclRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_parameter_acl</code>
     */
    public static final PgParameterAcl PG_PARAMETER_ACL = new PgParameterAcl();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgParameterAclRecord> getRecordType() {
        return PgParameterAclRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_parameter_acl.oid</code>.
     */
    public final TableField<PgParameterAclRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_parameter_acl.parname</code>.
     */
    public final TableField<PgParameterAclRecord, String> PARNAME = createField(DSL.name("parname"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_parameter_acl.paracl</code>.
     */
    public final TableField<PgParameterAclRecord, String[]> PARACL = createField(DSL.name("paracl"), SQLDataType.VARCHAR.array(), this, "");

    private PgParameterAcl(Name alias, Table<PgParameterAclRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgParameterAcl(Name alias, Table<PgParameterAclRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_parameter_acl</code> table
     * reference
     */
    public PgParameterAcl(String alias) {
        this(DSL.name(alias), PG_PARAMETER_ACL);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_parameter_acl</code> table
     * reference
     */
    public PgParameterAcl(Name alias) {
        this(alias, PG_PARAMETER_ACL);
    }

    /**
     * Create a <code>pg_catalog.pg_parameter_acl</code> table reference
     */
    public PgParameterAcl() {
        this(DSL.name("pg_parameter_acl"), null);
    }

    public <O extends Record> PgParameterAcl(Table<O> child, ForeignKey<O, PgParameterAclRecord> key) {
        super(child, key, PG_PARAMETER_ACL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgParameterAclRecord> getPrimaryKey() {
        return Keys.PG_PARAMETER_ACL_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgParameterAclRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_PARAMETER_ACL_PARNAME_INDEX);
    }

    @Override
    public PgParameterAcl as(String alias) {
        return new PgParameterAcl(DSL.name(alias), this);
    }

    @Override
    public PgParameterAcl as(Name alias) {
        return new PgParameterAcl(alias, this);
    }

    @Override
    public PgParameterAcl as(Table<?> alias) {
        return new PgParameterAcl(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgParameterAcl rename(String name) {
        return new PgParameterAcl(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgParameterAcl rename(Name name) {
        return new PgParameterAcl(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgParameterAcl rename(Table<?> name) {
        return new PgParameterAcl(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Long, ? super String, ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super String, ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
