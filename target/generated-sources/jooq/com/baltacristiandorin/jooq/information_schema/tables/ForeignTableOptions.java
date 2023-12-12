/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables;


import com.baltacristiandorin.jooq.information_schema.InformationSchema;
import com.baltacristiandorin.jooq.information_schema.tables.records.ForeignTableOptionsRecord;

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
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ForeignTableOptions extends TableImpl<ForeignTableOptionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.foreign_table_options</code>
     */
    public static final ForeignTableOptions FOREIGN_TABLE_OPTIONS = new ForeignTableOptions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForeignTableOptionsRecord> getRecordType() {
        return ForeignTableOptionsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.foreign_table_options.foreign_table_catalog</code>.
     */
    public final TableField<ForeignTableOptionsRecord, String> FOREIGN_TABLE_CATALOG = createField(DSL.name("foreign_table_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_table_options.foreign_table_schema</code>.
     */
    public final TableField<ForeignTableOptionsRecord, String> FOREIGN_TABLE_SCHEMA = createField(DSL.name("foreign_table_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_table_options.foreign_table_name</code>.
     */
    public final TableField<ForeignTableOptionsRecord, String> FOREIGN_TABLE_NAME = createField(DSL.name("foreign_table_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_table_options.option_name</code>.
     */
    public final TableField<ForeignTableOptionsRecord, String> OPTION_NAME = createField(DSL.name("option_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_table_options.option_value</code>.
     */
    public final TableField<ForeignTableOptionsRecord, String> OPTION_VALUE = createField(DSL.name("option_value"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private ForeignTableOptions(Name alias, Table<ForeignTableOptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignTableOptions(Name alias, Table<ForeignTableOptionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "foreign_table_options" as  SELECT t.foreign_table_catalog,
         t.foreign_table_schema,
         t.foreign_table_name,
         ((pg_options_to_table(t.ftoptions)).option_name)::information_schema.sql_identifier AS option_name,
         ((pg_options_to_table(t.ftoptions)).option_value)::information_schema.character_data AS option_value
        FROM information_schema._pg_foreign_tables t;
        """));
    }

    /**
     * Create an aliased <code>information_schema.foreign_table_options</code>
     * table reference
     */
    public ForeignTableOptions(String alias) {
        this(DSL.name(alias), FOREIGN_TABLE_OPTIONS);
    }

    /**
     * Create an aliased <code>information_schema.foreign_table_options</code>
     * table reference
     */
    public ForeignTableOptions(Name alias) {
        this(alias, FOREIGN_TABLE_OPTIONS);
    }

    /**
     * Create a <code>information_schema.foreign_table_options</code> table
     * reference
     */
    public ForeignTableOptions() {
        this(DSL.name("foreign_table_options"), null);
    }

    public <O extends Record> ForeignTableOptions(Table<O> child, ForeignKey<O, ForeignTableOptionsRecord> key) {
        super(child, key, FOREIGN_TABLE_OPTIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ForeignTableOptions as(String alias) {
        return new ForeignTableOptions(DSL.name(alias), this);
    }

    @Override
    public ForeignTableOptions as(Name alias) {
        return new ForeignTableOptions(alias, this);
    }

    @Override
    public ForeignTableOptions as(Table<?> alias) {
        return new ForeignTableOptions(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignTableOptions rename(String name) {
        return new ForeignTableOptions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignTableOptions rename(Name name) {
        return new ForeignTableOptions(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignTableOptions rename(Table<?> name) {
        return new ForeignTableOptions(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
