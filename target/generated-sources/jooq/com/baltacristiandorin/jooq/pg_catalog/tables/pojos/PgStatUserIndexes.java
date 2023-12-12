/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatUserIndexes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long relid;
    private Long indexrelid;
    private String schemaname;
    private String relname;
    private String indexrelname;
    private Long idxScan;
    private Long idxTupRead;
    private Long idxTupFetch;

    public PgStatUserIndexes() {}

    public PgStatUserIndexes(PgStatUserIndexes value) {
        this.relid = value.relid;
        this.indexrelid = value.indexrelid;
        this.schemaname = value.schemaname;
        this.relname = value.relname;
        this.indexrelname = value.indexrelname;
        this.idxScan = value.idxScan;
        this.idxTupRead = value.idxTupRead;
        this.idxTupFetch = value.idxTupFetch;
    }

    public PgStatUserIndexes(
        Long relid,
        Long indexrelid,
        String schemaname,
        String relname,
        String indexrelname,
        Long idxScan,
        Long idxTupRead,
        Long idxTupFetch
    ) {
        this.relid = relid;
        this.indexrelid = indexrelid;
        this.schemaname = schemaname;
        this.relname = relname;
        this.indexrelname = indexrelname;
        this.idxScan = idxScan;
        this.idxTupRead = idxTupRead;
        this.idxTupFetch = idxTupFetch;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.relid</code>.
     */
    public Long getRelid() {
        return this.relid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.relid</code>.
     */
    public void setRelid(Long relid) {
        this.relid = relid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.indexrelid</code>.
     */
    public Long getIndexrelid() {
        return this.indexrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.indexrelid</code>.
     */
    public void setIndexrelid(Long indexrelid) {
        this.indexrelid = indexrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.schemaname</code>.
     */
    public String getSchemaname() {
        return this.schemaname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.schemaname</code>.
     */
    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.relname</code>.
     */
    public String getRelname() {
        return this.relname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.relname</code>.
     */
    public void setRelname(String relname) {
        this.relname = relname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.indexrelname</code>.
     */
    public String getIndexrelname() {
        return this.indexrelname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.indexrelname</code>.
     */
    public void setIndexrelname(String indexrelname) {
        this.indexrelname = indexrelname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.idx_scan</code>.
     */
    public Long getIdxScan() {
        return this.idxScan;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.idx_scan</code>.
     */
    public void setIdxScan(Long idxScan) {
        this.idxScan = idxScan;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.idx_tup_read</code>.
     */
    public Long getIdxTupRead() {
        return this.idxTupRead;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.idx_tup_read</code>.
     */
    public void setIdxTupRead(Long idxTupRead) {
        this.idxTupRead = idxTupRead;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.idx_tup_fetch</code>.
     */
    public Long getIdxTupFetch() {
        return this.idxTupFetch;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.idx_tup_fetch</code>.
     */
    public void setIdxTupFetch(Long idxTupFetch) {
        this.idxTupFetch = idxTupFetch;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatUserIndexes other = (PgStatUserIndexes) obj;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
            return false;
        if (this.indexrelid == null) {
            if (other.indexrelid != null)
                return false;
        }
        else if (!this.indexrelid.equals(other.indexrelid))
            return false;
        if (this.schemaname == null) {
            if (other.schemaname != null)
                return false;
        }
        else if (!this.schemaname.equals(other.schemaname))
            return false;
        if (this.relname == null) {
            if (other.relname != null)
                return false;
        }
        else if (!this.relname.equals(other.relname))
            return false;
        if (this.indexrelname == null) {
            if (other.indexrelname != null)
                return false;
        }
        else if (!this.indexrelname.equals(other.indexrelname))
            return false;
        if (this.idxScan == null) {
            if (other.idxScan != null)
                return false;
        }
        else if (!this.idxScan.equals(other.idxScan))
            return false;
        if (this.idxTupRead == null) {
            if (other.idxTupRead != null)
                return false;
        }
        else if (!this.idxTupRead.equals(other.idxTupRead))
            return false;
        if (this.idxTupFetch == null) {
            if (other.idxTupFetch != null)
                return false;
        }
        else if (!this.idxTupFetch.equals(other.idxTupFetch))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.indexrelid == null) ? 0 : this.indexrelid.hashCode());
        result = prime * result + ((this.schemaname == null) ? 0 : this.schemaname.hashCode());
        result = prime * result + ((this.relname == null) ? 0 : this.relname.hashCode());
        result = prime * result + ((this.indexrelname == null) ? 0 : this.indexrelname.hashCode());
        result = prime * result + ((this.idxScan == null) ? 0 : this.idxScan.hashCode());
        result = prime * result + ((this.idxTupRead == null) ? 0 : this.idxTupRead.hashCode());
        result = prime * result + ((this.idxTupFetch == null) ? 0 : this.idxTupFetch.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatUserIndexes (");

        sb.append(relid);
        sb.append(", ").append(indexrelid);
        sb.append(", ").append(schemaname);
        sb.append(", ").append(relname);
        sb.append(", ").append(indexrelname);
        sb.append(", ").append(idxScan);
        sb.append(", ").append(idxTupRead);
        sb.append(", ").append(idxTupFetch);

        sb.append(")");
        return sb.toString();
    }
}