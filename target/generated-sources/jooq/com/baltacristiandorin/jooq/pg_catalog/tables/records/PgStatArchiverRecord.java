/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.records;


import com.baltacristiandorin.jooq.pg_catalog.tables.PgStatArchiver;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatArchiverRecord extends TableRecordImpl<PgStatArchiverRecord> implements Record7<Long, String, OffsetDateTime, Long, String, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.archived_count</code>.
     */
    public void setArchivedCount(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.archived_count</code>.
     */
    public Long getArchivedCount() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.last_archived_wal</code>.
     */
    public void setLastArchivedWal(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.last_archived_wal</code>.
     */
    public String getLastArchivedWal() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.last_archived_time</code>.
     */
    public void setLastArchivedTime(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.last_archived_time</code>.
     */
    public OffsetDateTime getLastArchivedTime() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.failed_count</code>.
     */
    public void setFailedCount(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.failed_count</code>.
     */
    public Long getFailedCount() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.last_failed_wal</code>.
     */
    public void setLastFailedWal(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.last_failed_wal</code>.
     */
    public String getLastFailedWal() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.last_failed_time</code>.
     */
    public void setLastFailedTime(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.last_failed_time</code>.
     */
    public OffsetDateTime getLastFailedTime() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.stats_reset</code>.
     */
    public void setStatsReset(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.stats_reset</code>.
     */
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, OffsetDateTime, Long, String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, OffsetDateTime, Long, String, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgStatArchiver.PG_STAT_ARCHIVER.ARCHIVED_COUNT;
    }

    @Override
    public Field<String> field2() {
        return PgStatArchiver.PG_STAT_ARCHIVER.LAST_ARCHIVED_WAL;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return PgStatArchiver.PG_STAT_ARCHIVER.LAST_ARCHIVED_TIME;
    }

    @Override
    public Field<Long> field4() {
        return PgStatArchiver.PG_STAT_ARCHIVER.FAILED_COUNT;
    }

    @Override
    public Field<String> field5() {
        return PgStatArchiver.PG_STAT_ARCHIVER.LAST_FAILED_WAL;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return PgStatArchiver.PG_STAT_ARCHIVER.LAST_FAILED_TIME;
    }

    @Override
    public Field<OffsetDateTime> field7() {
        return PgStatArchiver.PG_STAT_ARCHIVER.STATS_RESET;
    }

    @Override
    public Long component1() {
        return getArchivedCount();
    }

    @Override
    public String component2() {
        return getLastArchivedWal();
    }

    @Override
    public OffsetDateTime component3() {
        return getLastArchivedTime();
    }

    @Override
    public Long component4() {
        return getFailedCount();
    }

    @Override
    public String component5() {
        return getLastFailedWal();
    }

    @Override
    public OffsetDateTime component6() {
        return getLastFailedTime();
    }

    @Override
    public OffsetDateTime component7() {
        return getStatsReset();
    }

    @Override
    public Long value1() {
        return getArchivedCount();
    }

    @Override
    public String value2() {
        return getLastArchivedWal();
    }

    @Override
    public OffsetDateTime value3() {
        return getLastArchivedTime();
    }

    @Override
    public Long value4() {
        return getFailedCount();
    }

    @Override
    public String value5() {
        return getLastFailedWal();
    }

    @Override
    public OffsetDateTime value6() {
        return getLastFailedTime();
    }

    @Override
    public OffsetDateTime value7() {
        return getStatsReset();
    }

    @Override
    public PgStatArchiverRecord value1(Long value) {
        setArchivedCount(value);
        return this;
    }

    @Override
    public PgStatArchiverRecord value2(String value) {
        setLastArchivedWal(value);
        return this;
    }

    @Override
    public PgStatArchiverRecord value3(OffsetDateTime value) {
        setLastArchivedTime(value);
        return this;
    }

    @Override
    public PgStatArchiverRecord value4(Long value) {
        setFailedCount(value);
        return this;
    }

    @Override
    public PgStatArchiverRecord value5(String value) {
        setLastFailedWal(value);
        return this;
    }

    @Override
    public PgStatArchiverRecord value6(OffsetDateTime value) {
        setLastFailedTime(value);
        return this;
    }

    @Override
    public PgStatArchiverRecord value7(OffsetDateTime value) {
        setStatsReset(value);
        return this;
    }

    @Override
    public PgStatArchiverRecord values(Long value1, String value2, OffsetDateTime value3, Long value4, String value5, OffsetDateTime value6, OffsetDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatArchiverRecord
     */
    public PgStatArchiverRecord() {
        super(PgStatArchiver.PG_STAT_ARCHIVER);
    }

    /**
     * Create a detached, initialised PgStatArchiverRecord
     */
    public PgStatArchiverRecord(Long archivedCount, String lastArchivedWal, OffsetDateTime lastArchivedTime, Long failedCount, String lastFailedWal, OffsetDateTime lastFailedTime, OffsetDateTime statsReset) {
        super(PgStatArchiver.PG_STAT_ARCHIVER);

        setArchivedCount(archivedCount);
        setLastArchivedWal(lastArchivedWal);
        setLastArchivedTime(lastArchivedTime);
        setFailedCount(failedCount);
        setLastFailedWal(lastFailedWal);
        setLastFailedTime(lastFailedTime);
        setStatsReset(statsReset);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgStatArchiverRecord
     */
    public PgStatArchiverRecord(com.baltacristiandorin.jooq.pg_catalog.tables.pojos.PgStatArchiver value) {
        super(PgStatArchiver.PG_STAT_ARCHIVER);

        if (value != null) {
            setArchivedCount(value.getArchivedCount());
            setLastArchivedWal(value.getLastArchivedWal());
            setLastArchivedTime(value.getLastArchivedTime());
            setFailedCount(value.getFailedCount());
            setLastFailedWal(value.getLastFailedWal());
            setLastFailedTime(value.getLastFailedTime());
            setStatsReset(value.getStatsReset());
            resetChangedOnNotNull();
        }
    }
}
