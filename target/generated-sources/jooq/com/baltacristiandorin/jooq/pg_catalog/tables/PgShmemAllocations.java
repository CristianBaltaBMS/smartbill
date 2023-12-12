/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgShmemAllocationsRecord;

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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgShmemAllocations extends TableImpl<PgShmemAllocationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_shmem_allocations</code>
     */
    public static final PgShmemAllocations PG_SHMEM_ALLOCATIONS = new PgShmemAllocations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgShmemAllocationsRecord> getRecordType() {
        return PgShmemAllocationsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_shmem_allocations.name</code>.
     */
    public final TableField<PgShmemAllocationsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_shmem_allocations.off</code>.
     */
    public final TableField<PgShmemAllocationsRecord, Long> OFF = createField(DSL.name("off"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_shmem_allocations.size</code>.
     */
    public final TableField<PgShmemAllocationsRecord, Long> SIZE = createField(DSL.name("size"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_shmem_allocations.allocated_size</code>.
     */
    public final TableField<PgShmemAllocationsRecord, Long> ALLOCATED_SIZE = createField(DSL.name("allocated_size"), SQLDataType.BIGINT, this, "");

    private PgShmemAllocations(Name alias, Table<PgShmemAllocationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgShmemAllocations(Name alias, Table<PgShmemAllocationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_shmem_allocations" as  SELECT pg_get_shmem_allocations.name,
         pg_get_shmem_allocations.off,
         pg_get_shmem_allocations.size,
         pg_get_shmem_allocations.allocated_size
        FROM pg_get_shmem_allocations() pg_get_shmem_allocations(name, off, size, allocated_size);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shmem_allocations</code> table
     * reference
     */
    public PgShmemAllocations(String alias) {
        this(DSL.name(alias), PG_SHMEM_ALLOCATIONS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shmem_allocations</code> table
     * reference
     */
    public PgShmemAllocations(Name alias) {
        this(alias, PG_SHMEM_ALLOCATIONS);
    }

    /**
     * Create a <code>pg_catalog.pg_shmem_allocations</code> table reference
     */
    public PgShmemAllocations() {
        this(DSL.name("pg_shmem_allocations"), null);
    }

    public <O extends Record> PgShmemAllocations(Table<O> child, ForeignKey<O, PgShmemAllocationsRecord> key) {
        super(child, key, PG_SHMEM_ALLOCATIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgShmemAllocations as(String alias) {
        return new PgShmemAllocations(DSL.name(alias), this);
    }

    @Override
    public PgShmemAllocations as(Name alias) {
        return new PgShmemAllocations(alias, this);
    }

    @Override
    public PgShmemAllocations as(Table<?> alias) {
        return new PgShmemAllocations(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShmemAllocations rename(String name) {
        return new PgShmemAllocations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShmemAllocations rename(Name name) {
        return new PgShmemAllocations(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShmemAllocations rename(Table<?> name) {
        return new PgShmemAllocations(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
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