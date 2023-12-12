/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables;


import com.baltacristiandorin.jooq.information_schema.InformationSchema;
import com.baltacristiandorin.jooq.information_schema.tables.records.SqlFeaturesRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
public class SqlFeatures extends TableImpl<SqlFeaturesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.sql_features</code>
     */
    public static final SqlFeatures SQL_FEATURES = new SqlFeatures();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SqlFeaturesRecord> getRecordType() {
        return SqlFeaturesRecord.class;
    }

    /**
     * The column <code>information_schema.sql_features.feature_id</code>.
     */
    public final TableField<SqlFeaturesRecord, String> FEATURE_ID = createField(DSL.name("feature_id"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.sql_features.feature_name</code>.
     */
    public final TableField<SqlFeaturesRecord, String> FEATURE_NAME = createField(DSL.name("feature_name"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.sql_features.sub_feature_id</code>.
     */
    public final TableField<SqlFeaturesRecord, String> SUB_FEATURE_ID = createField(DSL.name("sub_feature_id"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.sql_features.sub_feature_name</code>.
     */
    public final TableField<SqlFeaturesRecord, String> SUB_FEATURE_NAME = createField(DSL.name("sub_feature_name"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.sql_features.is_supported</code>.
     */
    public final TableField<SqlFeaturesRecord, String> IS_SUPPORTED = createField(DSL.name("is_supported"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.sql_features.is_verified_by</code>.
     */
    public final TableField<SqlFeaturesRecord, String> IS_VERIFIED_BY = createField(DSL.name("is_verified_by"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.sql_features.comments</code>.
     */
    public final TableField<SqlFeaturesRecord, String> COMMENTS = createField(DSL.name("comments"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private SqlFeatures(Name alias, Table<SqlFeaturesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SqlFeatures(Name alias, Table<SqlFeaturesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.sql_features</code> table
     * reference
     */
    public SqlFeatures(String alias) {
        this(DSL.name(alias), SQL_FEATURES);
    }

    /**
     * Create an aliased <code>information_schema.sql_features</code> table
     * reference
     */
    public SqlFeatures(Name alias) {
        this(alias, SQL_FEATURES);
    }

    /**
     * Create a <code>information_schema.sql_features</code> table reference
     */
    public SqlFeatures() {
        this(DSL.name("sql_features"), null);
    }

    public <O extends Record> SqlFeatures(Table<O> child, ForeignKey<O, SqlFeaturesRecord> key) {
        super(child, key, SQL_FEATURES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public SqlFeatures as(String alias) {
        return new SqlFeatures(DSL.name(alias), this);
    }

    @Override
    public SqlFeatures as(Name alias) {
        return new SqlFeatures(alias, this);
    }

    @Override
    public SqlFeatures as(Table<?> alias) {
        return new SqlFeatures(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlFeatures rename(String name) {
        return new SqlFeatures(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlFeatures rename(Name name) {
        return new SqlFeatures(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlFeatures rename(Table<?> name) {
        return new SqlFeatures(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
