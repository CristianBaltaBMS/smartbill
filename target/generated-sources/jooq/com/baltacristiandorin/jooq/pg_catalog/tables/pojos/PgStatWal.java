/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatWal implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long walRecords;
    private Long walFpi;
    private BigDecimal walBytes;
    private Long walBuffersFull;
    private Long walWrite;
    private Long walSync;
    private Double walWriteTime;
    private Double walSyncTime;
    private OffsetDateTime statsReset;

    public PgStatWal() {}

    public PgStatWal(PgStatWal value) {
        this.walRecords = value.walRecords;
        this.walFpi = value.walFpi;
        this.walBytes = value.walBytes;
        this.walBuffersFull = value.walBuffersFull;
        this.walWrite = value.walWrite;
        this.walSync = value.walSync;
        this.walWriteTime = value.walWriteTime;
        this.walSyncTime = value.walSyncTime;
        this.statsReset = value.statsReset;
    }

    public PgStatWal(
        Long walRecords,
        Long walFpi,
        BigDecimal walBytes,
        Long walBuffersFull,
        Long walWrite,
        Long walSync,
        Double walWriteTime,
        Double walSyncTime,
        OffsetDateTime statsReset
    ) {
        this.walRecords = walRecords;
        this.walFpi = walFpi;
        this.walBytes = walBytes;
        this.walBuffersFull = walBuffersFull;
        this.walWrite = walWrite;
        this.walSync = walSync;
        this.walWriteTime = walWriteTime;
        this.walSyncTime = walSyncTime;
        this.statsReset = statsReset;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal.wal_records</code>.
     */
    public Long getWalRecords() {
        return this.walRecords;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal.wal_records</code>.
     */
    public void setWalRecords(Long walRecords) {
        this.walRecords = walRecords;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal.wal_fpi</code>.
     */
    public Long getWalFpi() {
        return this.walFpi;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal.wal_fpi</code>.
     */
    public void setWalFpi(Long walFpi) {
        this.walFpi = walFpi;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal.wal_bytes</code>.
     */
    public BigDecimal getWalBytes() {
        return this.walBytes;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal.wal_bytes</code>.
     */
    public void setWalBytes(BigDecimal walBytes) {
        this.walBytes = walBytes;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal.wal_buffers_full</code>.
     */
    public Long getWalBuffersFull() {
        return this.walBuffersFull;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal.wal_buffers_full</code>.
     */
    public void setWalBuffersFull(Long walBuffersFull) {
        this.walBuffersFull = walBuffersFull;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal.wal_write</code>.
     */
    public Long getWalWrite() {
        return this.walWrite;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal.wal_write</code>.
     */
    public void setWalWrite(Long walWrite) {
        this.walWrite = walWrite;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal.wal_sync</code>.
     */
    public Long getWalSync() {
        return this.walSync;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal.wal_sync</code>.
     */
    public void setWalSync(Long walSync) {
        this.walSync = walSync;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal.wal_write_time</code>.
     */
    public Double getWalWriteTime() {
        return this.walWriteTime;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal.wal_write_time</code>.
     */
    public void setWalWriteTime(Double walWriteTime) {
        this.walWriteTime = walWriteTime;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal.wal_sync_time</code>.
     */
    public Double getWalSyncTime() {
        return this.walSyncTime;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal.wal_sync_time</code>.
     */
    public void setWalSyncTime(Double walSyncTime) {
        this.walSyncTime = walSyncTime;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_wal.stats_reset</code>.
     */
    public OffsetDateTime getStatsReset() {
        return this.statsReset;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_wal.stats_reset</code>.
     */
    public void setStatsReset(OffsetDateTime statsReset) {
        this.statsReset = statsReset;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatWal other = (PgStatWal) obj;
        if (this.walRecords == null) {
            if (other.walRecords != null)
                return false;
        }
        else if (!this.walRecords.equals(other.walRecords))
            return false;
        if (this.walFpi == null) {
            if (other.walFpi != null)
                return false;
        }
        else if (!this.walFpi.equals(other.walFpi))
            return false;
        if (this.walBytes == null) {
            if (other.walBytes != null)
                return false;
        }
        else if (!this.walBytes.equals(other.walBytes))
            return false;
        if (this.walBuffersFull == null) {
            if (other.walBuffersFull != null)
                return false;
        }
        else if (!this.walBuffersFull.equals(other.walBuffersFull))
            return false;
        if (this.walWrite == null) {
            if (other.walWrite != null)
                return false;
        }
        else if (!this.walWrite.equals(other.walWrite))
            return false;
        if (this.walSync == null) {
            if (other.walSync != null)
                return false;
        }
        else if (!this.walSync.equals(other.walSync))
            return false;
        if (this.walWriteTime == null) {
            if (other.walWriteTime != null)
                return false;
        }
        else if (!this.walWriteTime.equals(other.walWriteTime))
            return false;
        if (this.walSyncTime == null) {
            if (other.walSyncTime != null)
                return false;
        }
        else if (!this.walSyncTime.equals(other.walSyncTime))
            return false;
        if (this.statsReset == null) {
            if (other.statsReset != null)
                return false;
        }
        else if (!this.statsReset.equals(other.statsReset))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.walRecords == null) ? 0 : this.walRecords.hashCode());
        result = prime * result + ((this.walFpi == null) ? 0 : this.walFpi.hashCode());
        result = prime * result + ((this.walBytes == null) ? 0 : this.walBytes.hashCode());
        result = prime * result + ((this.walBuffersFull == null) ? 0 : this.walBuffersFull.hashCode());
        result = prime * result + ((this.walWrite == null) ? 0 : this.walWrite.hashCode());
        result = prime * result + ((this.walSync == null) ? 0 : this.walSync.hashCode());
        result = prime * result + ((this.walWriteTime == null) ? 0 : this.walWriteTime.hashCode());
        result = prime * result + ((this.walSyncTime == null) ? 0 : this.walSyncTime.hashCode());
        result = prime * result + ((this.statsReset == null) ? 0 : this.statsReset.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatWal (");

        sb.append(walRecords);
        sb.append(", ").append(walFpi);
        sb.append(", ").append(walBytes);
        sb.append(", ").append(walBuffersFull);
        sb.append(", ").append(walWrite);
        sb.append(", ").append(walSync);
        sb.append(", ").append(walWriteTime);
        sb.append(", ").append(walSyncTime);
        sb.append(", ").append(statsReset);

        sb.append(")");
        return sb.toString();
    }
}
