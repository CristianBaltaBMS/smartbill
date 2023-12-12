/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables;


import com.baltacristiandorin.jooq.information_schema.InformationSchema;
import com.baltacristiandorin.jooq.information_schema.tables.records.CollationsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
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
public class Collations extends TableImpl<CollationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.collations</code>
     */
    public static final Collations COLLATIONS = new Collations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CollationsRecord> getRecordType() {
        return CollationsRecord.class;
    }

    /**
     * The column <code>information_schema.collations.collation_catalog</code>.
     */
    public final TableField<CollationsRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.collations.collation_schema</code>.
     */
    public final TableField<CollationsRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.collations.collation_name</code>.
     */
    public final TableField<CollationsRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.collations.pad_attribute</code>.
     */
    public final TableField<CollationsRecord, String> PAD_ATTRIBUTE = createField(DSL.name("pad_attribute"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private Collations(Name alias, Table<CollationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Collations(Name alias, Table<CollationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "collations" as  SELECT (current_database())::information_schema.sql_identifier AS collation_catalog,
          (nc.nspname)::information_schema.sql_identifier AS collation_schema,
          (c.collname)::information_schema.sql_identifier AS collation_name,
          ('NO PAD'::character varying)::information_schema.character_data AS pad_attribute
         FROM pg_collation c,
          pg_namespace nc
        WHERE ((c.collnamespace = nc.oid) AND (c.collencoding = ANY (ARRAY['-1'::integer, ( SELECT pg_database.encoding
                 FROM pg_database
                WHERE (pg_database.datname = current_database()))])));
        """));
    }

    /**
     * Create an aliased <code>information_schema.collations</code> table
     * reference
     */
    public Collations(String alias) {
        this(DSL.name(alias), COLLATIONS);
    }

    /**
     * Create an aliased <code>information_schema.collations</code> table
     * reference
     */
    public Collations(Name alias) {
        this(alias, COLLATIONS);
    }

    /**
     * Create a <code>information_schema.collations</code> table reference
     */
    public Collations() {
        this(DSL.name("collations"), null);
    }

    public <O extends Record> Collations(Table<O> child, ForeignKey<O, CollationsRecord> key) {
        super(child, key, COLLATIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Collations as(String alias) {
        return new Collations(DSL.name(alias), this);
    }

    @Override
    public Collations as(Name alias) {
        return new Collations(alias, this);
    }

    @Override
    public Collations as(Table<?> alias) {
        return new Collations(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Collations rename(String name) {
        return new Collations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Collations rename(Name name) {
        return new Collations(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Collations rename(Table<?> name) {
        return new Collations(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
