/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgSequencesRecord;

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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSequences extends TableImpl<PgSequencesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_sequences</code>
     */
    public static final PgSequences PG_SEQUENCES = new PgSequences();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgSequencesRecord> getRecordType() {
        return PgSequencesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_sequences.schemaname</code>.
     */
    public final TableField<PgSequencesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.sequencename</code>.
     */
    public final TableField<PgSequencesRecord, String> SEQUENCENAME = createField(DSL.name("sequencename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.sequenceowner</code>.
     */
    public final TableField<PgSequencesRecord, String> SEQUENCEOWNER = createField(DSL.name("sequenceowner"), SQLDataType.VARCHAR, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgSequencesRecord, Object> DATA_TYPE = createField(DSL.name("data_type"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regtype\""), this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.start_value</code>.
     */
    public final TableField<PgSequencesRecord, Long> START_VALUE = createField(DSL.name("start_value"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.min_value</code>.
     */
    public final TableField<PgSequencesRecord, Long> MIN_VALUE = createField(DSL.name("min_value"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.max_value</code>.
     */
    public final TableField<PgSequencesRecord, Long> MAX_VALUE = createField(DSL.name("max_value"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.increment_by</code>.
     */
    public final TableField<PgSequencesRecord, Long> INCREMENT_BY = createField(DSL.name("increment_by"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.cycle</code>.
     */
    public final TableField<PgSequencesRecord, Boolean> CYCLE = createField(DSL.name("cycle"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.cache_size</code>.
     */
    public final TableField<PgSequencesRecord, Long> CACHE_SIZE = createField(DSL.name("cache_size"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_sequences.last_value</code>.
     */
    public final TableField<PgSequencesRecord, Long> LAST_VALUE = createField(DSL.name("last_value"), SQLDataType.BIGINT, this, "");

    private PgSequences(Name alias, Table<PgSequencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSequences(Name alias, Table<PgSequencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_sequences" as  SELECT n.nspname AS schemaname,
          c.relname AS sequencename,
          pg_get_userbyid(c.relowner) AS sequenceowner,
          (s.seqtypid)::regtype AS data_type,
          s.seqstart AS start_value,
          s.seqmin AS min_value,
          s.seqmax AS max_value,
          s.seqincrement AS increment_by,
          s.seqcycle AS cycle,
          s.seqcache AS cache_size,
              CASE
                  WHEN has_sequence_privilege(c.oid, 'SELECT,USAGE'::text) THEN pg_sequence_last_value((c.oid)::regclass)
                  ELSE NULL::bigint
              END AS last_value
         FROM ((pg_sequence s
           JOIN pg_class c ON ((c.oid = s.seqrelid)))
           LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
        WHERE ((NOT pg_is_other_temp_schema(n.oid)) AND (c.relkind = 'S'::"char"));
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_sequences</code> table reference
     */
    public PgSequences(String alias) {
        this(DSL.name(alias), PG_SEQUENCES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_sequences</code> table reference
     */
    public PgSequences(Name alias) {
        this(alias, PG_SEQUENCES);
    }

    /**
     * Create a <code>pg_catalog.pg_sequences</code> table reference
     */
    public PgSequences() {
        this(DSL.name("pg_sequences"), null);
    }

    public <O extends Record> PgSequences(Table<O> child, ForeignKey<O, PgSequencesRecord> key) {
        super(child, key, PG_SEQUENCES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgSequences as(String alias) {
        return new PgSequences(DSL.name(alias), this);
    }

    @Override
    public PgSequences as(Name alias) {
        return new PgSequences(alias, this);
    }

    @Override
    public PgSequences as(Table<?> alias) {
        return new PgSequences(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequences rename(String name) {
        return new PgSequences(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequences rename(Name name) {
        return new PgSequences(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequences rename(Table<?> name) {
        return new PgSequences(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, Object, Long, Long, Long, Long, Boolean, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super String, ? super String, ? super String, ? super Object, ? super Long, ? super Long, ? super Long, ? super Long, ? super Boolean, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super String, ? super String, ? super String, ? super Object, ? super Long, ? super Long, ? super Long, ? super Long, ? super Boolean, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
