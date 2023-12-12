/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgStatProgressAnalyzeRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function12;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row12;
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
public class PgStatProgressAnalyze extends TableImpl<PgStatProgressAnalyzeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_stat_progress_analyze</code>
     */
    public static final PgStatProgressAnalyze PG_STAT_PROGRESS_ANALYZE = new PgStatProgressAnalyze();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatProgressAnalyzeRecord> getRecordType() {
        return PgStatProgressAnalyzeRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_progress_analyze.pid</code>.
     */
    public final TableField<PgStatProgressAnalyzeRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_analyze.datid</code>.
     */
    public final TableField<PgStatProgressAnalyzeRecord, Long> DATID = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_analyze.datname</code>.
     */
    public final TableField<PgStatProgressAnalyzeRecord, String> DATNAME = createField(DSL.name("datname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_analyze.relid</code>.
     */
    public final TableField<PgStatProgressAnalyzeRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_analyze.phase</code>.
     */
    public final TableField<PgStatProgressAnalyzeRecord, String> PHASE = createField(DSL.name("phase"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_analyze.sample_blks_total</code>.
     */
    public final TableField<PgStatProgressAnalyzeRecord, Long> SAMPLE_BLKS_TOTAL = createField(DSL.name("sample_blks_total"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_analyze.sample_blks_scanned</code>.
     */
    public final TableField<PgStatProgressAnalyzeRecord, Long> SAMPLE_BLKS_SCANNED = createField(DSL.name("sample_blks_scanned"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_analyze.ext_stats_total</code>.
     */
    public final TableField<PgStatProgressAnalyzeRecord, Long> EXT_STATS_TOTAL = createField(DSL.name("ext_stats_total"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_analyze.ext_stats_computed</code>.
     */
    public final TableField<PgStatProgressAnalyzeRecord, Long> EXT_STATS_COMPUTED = createField(DSL.name("ext_stats_computed"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_analyze.child_tables_total</code>.
     */
    public final TableField<PgStatProgressAnalyzeRecord, Long> CHILD_TABLES_TOTAL = createField(DSL.name("child_tables_total"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_analyze.child_tables_done</code>.
     */
    public final TableField<PgStatProgressAnalyzeRecord, Long> CHILD_TABLES_DONE = createField(DSL.name("child_tables_done"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_analyze.current_child_table_relid</code>.
     */
    public final TableField<PgStatProgressAnalyzeRecord, Long> CURRENT_CHILD_TABLE_RELID = createField(DSL.name("current_child_table_relid"), SQLDataType.BIGINT, this, "");

    private PgStatProgressAnalyze(Name alias, Table<PgStatProgressAnalyzeRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatProgressAnalyze(Name alias, Table<PgStatProgressAnalyzeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_progress_analyze" as  SELECT s.pid,
         s.datid,
         d.datname,
         s.relid,
             CASE s.param1
                 WHEN 0 THEN 'initializing'::text
                 WHEN 1 THEN 'acquiring sample rows'::text
                 WHEN 2 THEN 'acquiring inherited sample rows'::text
                 WHEN 3 THEN 'computing statistics'::text
                 WHEN 4 THEN 'computing extended statistics'::text
                 WHEN 5 THEN 'finalizing analyze'::text
                 ELSE NULL::text
             END AS phase,
         s.param2 AS sample_blks_total,
         s.param3 AS sample_blks_scanned,
         s.param4 AS ext_stats_total,
         s.param5 AS ext_stats_computed,
         s.param6 AS child_tables_total,
         s.param7 AS child_tables_done,
         (s.param8)::oid AS current_child_table_relid
        FROM (pg_stat_get_progress_info('ANALYZE'::text) s(pid, datid, relid, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20)
          LEFT JOIN pg_database d ON ((s.datid = d.oid)));
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_progress_analyze</code> table
     * reference
     */
    public PgStatProgressAnalyze(String alias) {
        this(DSL.name(alias), PG_STAT_PROGRESS_ANALYZE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_progress_analyze</code> table
     * reference
     */
    public PgStatProgressAnalyze(Name alias) {
        this(alias, PG_STAT_PROGRESS_ANALYZE);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_progress_analyze</code> table reference
     */
    public PgStatProgressAnalyze() {
        this(DSL.name("pg_stat_progress_analyze"), null);
    }

    public <O extends Record> PgStatProgressAnalyze(Table<O> child, ForeignKey<O, PgStatProgressAnalyzeRecord> key) {
        super(child, key, PG_STAT_PROGRESS_ANALYZE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatProgressAnalyze as(String alias) {
        return new PgStatProgressAnalyze(DSL.name(alias), this);
    }

    @Override
    public PgStatProgressAnalyze as(Name alias) {
        return new PgStatProgressAnalyze(alias, this);
    }

    @Override
    public PgStatProgressAnalyze as(Table<?> alias) {
        return new PgStatProgressAnalyze(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatProgressAnalyze rename(String name) {
        return new PgStatProgressAnalyze(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatProgressAnalyze rename(Name name) {
        return new PgStatProgressAnalyze(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatProgressAnalyze rename(Table<?> name) {
        return new PgStatProgressAnalyze(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, Long, String, Long, String, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super Integer, ? super Long, ? super String, ? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super Integer, ? super Long, ? super String, ? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
