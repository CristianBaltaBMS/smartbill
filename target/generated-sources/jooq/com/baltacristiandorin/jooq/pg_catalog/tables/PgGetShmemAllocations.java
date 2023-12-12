/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgGetShmemAllocationsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row4;
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
public class PgGetShmemAllocations extends TableImpl<PgGetShmemAllocationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_get_shmem_allocations</code>
     */
    public static final PgGetShmemAllocations PG_GET_SHMEM_ALLOCATIONS = new PgGetShmemAllocations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgGetShmemAllocationsRecord> getRecordType() {
        return PgGetShmemAllocationsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_get_shmem_allocations.name</code>.
     */
    public final TableField<PgGetShmemAllocationsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_get_shmem_allocations.off</code>.
     */
    public final TableField<PgGetShmemAllocationsRecord, Long> OFF = createField(DSL.name("off"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_get_shmem_allocations.size</code>.
     */
    public final TableField<PgGetShmemAllocationsRecord, Long> SIZE = createField(DSL.name("size"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_get_shmem_allocations.allocated_size</code>.
     */
    public final TableField<PgGetShmemAllocationsRecord, Long> ALLOCATED_SIZE = createField(DSL.name("allocated_size"), SQLDataType.BIGINT, this, "");

    private PgGetShmemAllocations(Name alias, Table<PgGetShmemAllocationsRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgGetShmemAllocations(Name alias, Table<PgGetShmemAllocationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_shmem_allocations</code> table
     * reference
     */
    public PgGetShmemAllocations(String alias) {
        this(DSL.name(alias), PG_GET_SHMEM_ALLOCATIONS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_shmem_allocations</code> table
     * reference
     */
    public PgGetShmemAllocations(Name alias) {
        this(alias, PG_GET_SHMEM_ALLOCATIONS);
    }

    /**
     * Create a <code>pg_catalog.pg_get_shmem_allocations</code> table reference
     */
    public PgGetShmemAllocations() {
        this(DSL.name("pg_get_shmem_allocations"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgGetShmemAllocations as(String alias) {
        return new PgGetShmemAllocations(DSL.name(alias), this, parameters);
    }

    @Override
    public PgGetShmemAllocations as(Name alias) {
        return new PgGetShmemAllocations(alias, this, parameters);
    }

    @Override
    public PgGetShmemAllocations as(Table<?> alias) {
        return new PgGetShmemAllocations(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetShmemAllocations rename(String name) {
        return new PgGetShmemAllocations(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetShmemAllocations rename(Name name) {
        return new PgGetShmemAllocations(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetShmemAllocations rename(Table<?> name) {
        return new PgGetShmemAllocations(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgGetShmemAllocations call() {
        PgGetShmemAllocations result = new PgGetShmemAllocations(DSL.name("pg_get_shmem_allocations"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
