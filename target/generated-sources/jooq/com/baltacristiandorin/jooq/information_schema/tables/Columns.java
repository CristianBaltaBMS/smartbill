/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables;


import com.baltacristiandorin.jooq.information_schema.InformationSchema;
import com.baltacristiandorin.jooq.information_schema.tables.records.ColumnsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Columns extends TableImpl<ColumnsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.columns</code>
     */
    public static final Columns COLUMNS = new Columns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnsRecord> getRecordType() {
        return ColumnsRecord.class;
    }

    /**
     * The column <code>information_schema.columns.table_catalog</code>.
     */
    public final TableField<ColumnsRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.table_schema</code>.
     */
    public final TableField<ColumnsRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.table_name</code>.
     */
    public final TableField<ColumnsRecord, String> TABLE_NAME = createField(DSL.name("table_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.column_name</code>.
     */
    public final TableField<ColumnsRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.ordinal_position</code>.
     */
    public final TableField<ColumnsRecord, Integer> ORDINAL_POSITION = createField(DSL.name("ordinal_position"), com.baltacristiandorin.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.column_default</code>.
     */
    public final TableField<ColumnsRecord, String> COLUMN_DEFAULT = createField(DSL.name("column_default"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.is_nullable</code>.
     */
    public final TableField<ColumnsRecord, String> IS_NULLABLE = createField(DSL.name("is_nullable"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.data_type</code>.
     */
    public final TableField<ColumnsRecord, String> DATA_TYPE = createField(DSL.name("data_type"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.columns.character_maximum_length</code>.
     */
    public final TableField<ColumnsRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), com.baltacristiandorin.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.columns.character_octet_length</code>.
     */
    public final TableField<ColumnsRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), com.baltacristiandorin.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.numeric_precision</code>.
     */
    public final TableField<ColumnsRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), com.baltacristiandorin.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.columns.numeric_precision_radix</code>.
     */
    public final TableField<ColumnsRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), com.baltacristiandorin.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.numeric_scale</code>.
     */
    public final TableField<ColumnsRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), com.baltacristiandorin.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.datetime_precision</code>.
     */
    public final TableField<ColumnsRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), com.baltacristiandorin.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.interval_type</code>.
     */
    public final TableField<ColumnsRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.interval_precision</code>.
     */
    public final TableField<ColumnsRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), com.baltacristiandorin.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.character_set_catalog</code>.
     */
    public final TableField<ColumnsRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.character_set_schema</code>.
     */
    public final TableField<ColumnsRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.character_set_name</code>.
     */
    public final TableField<ColumnsRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.collation_catalog</code>.
     */
    public final TableField<ColumnsRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.collation_schema</code>.
     */
    public final TableField<ColumnsRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.collation_name</code>.
     */
    public final TableField<ColumnsRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.domain_catalog</code>.
     */
    public final TableField<ColumnsRecord, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.domain_schema</code>.
     */
    public final TableField<ColumnsRecord, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.domain_name</code>.
     */
    public final TableField<ColumnsRecord, String> DOMAIN_NAME = createField(DSL.name("domain_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.udt_catalog</code>.
     */
    public final TableField<ColumnsRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.udt_schema</code>.
     */
    public final TableField<ColumnsRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.udt_name</code>.
     */
    public final TableField<ColumnsRecord, String> UDT_NAME = createField(DSL.name("udt_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.scope_catalog</code>.
     */
    public final TableField<ColumnsRecord, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.scope_schema</code>.
     */
    public final TableField<ColumnsRecord, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.scope_name</code>.
     */
    public final TableField<ColumnsRecord, String> SCOPE_NAME = createField(DSL.name("scope_name"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.maximum_cardinality</code>.
     */
    public final TableField<ColumnsRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), com.baltacristiandorin.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.dtd_identifier</code>.
     */
    public final TableField<ColumnsRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), com.baltacristiandorin.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.is_self_referencing</code>.
     */
    public final TableField<ColumnsRecord, String> IS_SELF_REFERENCING = createField(DSL.name("is_self_referencing"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.is_identity</code>.
     */
    public final TableField<ColumnsRecord, String> IS_IDENTITY = createField(DSL.name("is_identity"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.identity_generation</code>.
     */
    public final TableField<ColumnsRecord, String> IDENTITY_GENERATION = createField(DSL.name("identity_generation"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.identity_start</code>.
     */
    public final TableField<ColumnsRecord, String> IDENTITY_START = createField(DSL.name("identity_start"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.identity_increment</code>.
     */
    public final TableField<ColumnsRecord, String> IDENTITY_INCREMENT = createField(DSL.name("identity_increment"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.identity_maximum</code>.
     */
    public final TableField<ColumnsRecord, String> IDENTITY_MAXIMUM = createField(DSL.name("identity_maximum"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.identity_minimum</code>.
     */
    public final TableField<ColumnsRecord, String> IDENTITY_MINIMUM = createField(DSL.name("identity_minimum"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.identity_cycle</code>.
     */
    public final TableField<ColumnsRecord, String> IDENTITY_CYCLE = createField(DSL.name("identity_cycle"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.is_generated</code>.
     */
    public final TableField<ColumnsRecord, String> IS_GENERATED = createField(DSL.name("is_generated"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.generation_expression</code>.
     */
    public final TableField<ColumnsRecord, String> GENERATION_EXPRESSION = createField(DSL.name("generation_expression"), com.baltacristiandorin.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.columns.is_updatable</code>.
     */
    public final TableField<ColumnsRecord, String> IS_UPDATABLE = createField(DSL.name("is_updatable"), com.baltacristiandorin.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private Columns(Name alias, Table<ColumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Columns(Name alias, Table<ColumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "columns" as  SELECT (current_database())::information_schema.sql_identifier AS table_catalog,
          (nc.nspname)::information_schema.sql_identifier AS table_schema,
          (c.relname)::information_schema.sql_identifier AS table_name,
          (a.attname)::information_schema.sql_identifier AS column_name,
          (a.attnum)::information_schema.cardinal_number AS ordinal_position,
          (
              CASE
                  WHEN (a.attgenerated = ''::"char") THEN pg_get_expr(ad.adbin, ad.adrelid)
                  ELSE NULL::text
              END)::information_schema.character_data AS column_default,
          (
              CASE
                  WHEN (a.attnotnull OR ((t.typtype = 'd'::"char") AND t.typnotnull)) THEN 'NO'::text
                  ELSE 'YES'::text
              END)::information_schema.yes_or_no AS is_nullable,
          (
              CASE
                  WHEN (t.typtype = 'd'::"char") THEN
                  CASE
                      WHEN ((bt.typelem <> (0)::oid) AND (bt.typlen = '-1'::integer)) THEN 'ARRAY'::text
                      WHEN (nbt.nspname = 'pg_catalog'::name) THEN format_type(t.typbasetype, NULL::integer)
                      ELSE 'USER-DEFINED'::text
                  END
                  ELSE
                  CASE
                      WHEN ((t.typelem <> (0)::oid) AND (t.typlen = '-1'::integer)) THEN 'ARRAY'::text
                      WHEN (nt.nspname = 'pg_catalog'::name) THEN format_type(a.atttypid, NULL::integer)
                      ELSE 'USER-DEFINED'::text
                  END
              END)::information_schema.character_data AS data_type,
          (information_schema._pg_char_max_length(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.cardinal_number AS character_maximum_length,
          (information_schema._pg_char_octet_length(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.cardinal_number AS character_octet_length,
          (information_schema._pg_numeric_precision(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.cardinal_number AS numeric_precision,
          (information_schema._pg_numeric_precision_radix(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.cardinal_number AS numeric_precision_radix,
          (information_schema._pg_numeric_scale(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.cardinal_number AS numeric_scale,
          (information_schema._pg_datetime_precision(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.cardinal_number AS datetime_precision,
          (information_schema._pg_interval_type(information_schema._pg_truetypid(a.*, t.*), information_schema._pg_truetypmod(a.*, t.*)))::information_schema.character_data AS interval_type,
          (NULL::integer)::information_schema.cardinal_number AS interval_precision,
          (NULL::name)::information_schema.sql_identifier AS character_set_catalog,
          (NULL::name)::information_schema.sql_identifier AS character_set_schema,
          (NULL::name)::information_schema.sql_identifier AS character_set_name,
          (
              CASE
                  WHEN (nco.nspname IS NOT NULL) THEN current_database()
                  ELSE NULL::name
              END)::information_schema.sql_identifier AS collation_catalog,
          (nco.nspname)::information_schema.sql_identifier AS collation_schema,
          (co.collname)::information_schema.sql_identifier AS collation_name,
          (
              CASE
                  WHEN (t.typtype = 'd'::"char") THEN current_database()
                  ELSE NULL::name
              END)::information_schema.sql_identifier AS domain_catalog,
          (
              CASE
                  WHEN (t.typtype = 'd'::"char") THEN nt.nspname
                  ELSE NULL::name
              END)::information_schema.sql_identifier AS domain_schema,
          (
              CASE
                  WHEN (t.typtype = 'd'::"char") THEN t.typname
                  ELSE NULL::name
              END)::information_schema.sql_identifier AS domain_name,
          (current_database())::information_schema.sql_identifier AS udt_catalog,
          (COALESCE(nbt.nspname, nt.nspname))::information_schema.sql_identifier AS udt_schema,
          (COALESCE(bt.typname, t.typname))::information_schema.sql_identifier AS udt_name,
          (NULL::name)::information_schema.sql_identifier AS scope_catalog,
          (NULL::name)::information_schema.sql_identifier AS scope_schema,
          (NULL::name)::information_schema.sql_identifier AS scope_name,
          (NULL::integer)::information_schema.cardinal_number AS maximum_cardinality,
          (a.attnum)::information_schema.sql_identifier AS dtd_identifier,
          ('NO'::character varying)::information_schema.yes_or_no AS is_self_referencing,
          (
              CASE
                  WHEN (a.attidentity = ANY (ARRAY['a'::"char", 'd'::"char"])) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_identity,
          (
              CASE a.attidentity
                  WHEN 'a'::"char" THEN 'ALWAYS'::text
                  WHEN 'd'::"char" THEN 'BY DEFAULT'::text
                  ELSE NULL::text
              END)::information_schema.character_data AS identity_generation,
          (seq.seqstart)::information_schema.character_data AS identity_start,
          (seq.seqincrement)::information_schema.character_data AS identity_increment,
          (seq.seqmax)::information_schema.character_data AS identity_maximum,
          (seq.seqmin)::information_schema.character_data AS identity_minimum,
          (
              CASE
                  WHEN seq.seqcycle THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS identity_cycle,
          (
              CASE
                  WHEN (a.attgenerated <> ''::"char") THEN 'ALWAYS'::text
                  ELSE 'NEVER'::text
              END)::information_schema.character_data AS is_generated,
          (
              CASE
                  WHEN (a.attgenerated <> ''::"char") THEN pg_get_expr(ad.adbin, ad.adrelid)
                  ELSE NULL::text
              END)::information_schema.character_data AS generation_expression,
          (
              CASE
                  WHEN ((c.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) OR ((c.relkind = ANY (ARRAY['v'::"char", 'f'::"char"])) AND pg_column_is_updatable((c.oid)::regclass, a.attnum, false))) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_updatable
         FROM ((((((pg_attribute a
           LEFT JOIN pg_attrdef ad ON (((a.attrelid = ad.adrelid) AND (a.attnum = ad.adnum))))
           JOIN (pg_class c
           JOIN pg_namespace nc ON ((c.relnamespace = nc.oid))) ON ((a.attrelid = c.oid)))
           JOIN (pg_type t
           JOIN pg_namespace nt ON ((t.typnamespace = nt.oid))) ON ((a.atttypid = t.oid)))
           LEFT JOIN (pg_type bt
           JOIN pg_namespace nbt ON ((bt.typnamespace = nbt.oid))) ON (((t.typtype = 'd'::"char") AND (t.typbasetype = bt.oid))))
           LEFT JOIN (pg_collation co
           JOIN pg_namespace nco ON ((co.collnamespace = nco.oid))) ON (((a.attcollation = co.oid) AND ((nco.nspname <> 'pg_catalog'::name) OR (co.collname <> 'default'::name)))))
           LEFT JOIN (pg_depend dep
           JOIN pg_sequence seq ON (((dep.classid = ('pg_class'::regclass)::oid) AND (dep.objid = seq.seqrelid) AND (dep.deptype = 'i'::"char")))) ON (((dep.refclassid = ('pg_class'::regclass)::oid) AND (dep.refobjid = c.oid) AND (dep.refobjsubid = a.attnum))))
        WHERE ((NOT pg_is_other_temp_schema(nc.oid)) AND (a.attnum > 0) AND (NOT a.attisdropped) AND (c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND (pg_has_role(c.relowner, 'USAGE'::text) OR has_column_privilege(c.oid, a.attnum, 'SELECT, INSERT, UPDATE, REFERENCES'::text)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.columns</code> table reference
     */
    public Columns(String alias) {
        this(DSL.name(alias), COLUMNS);
    }

    /**
     * Create an aliased <code>information_schema.columns</code> table reference
     */
    public Columns(Name alias) {
        this(alias, COLUMNS);
    }

    /**
     * Create a <code>information_schema.columns</code> table reference
     */
    public Columns() {
        this(DSL.name("columns"), null);
    }

    public <O extends Record> Columns(Table<O> child, ForeignKey<O, ColumnsRecord> key) {
        super(child, key, COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Columns as(String alias) {
        return new Columns(DSL.name(alias), this);
    }

    @Override
    public Columns as(Name alias) {
        return new Columns(alias, this);
    }

    @Override
    public Columns as(Table<?> alias) {
        return new Columns(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(String name) {
        return new Columns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(Name name) {
        return new Columns(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(Table<?> name) {
        return new Columns(name.getQualifiedName(), null);
    }
}
