/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatioAllSequences implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long relid;
    private String schemaname;
    private String relname;
    private Long blksRead;
    private Long blksHit;

    public PgStatioAllSequences() {}

    public PgStatioAllSequences(PgStatioAllSequences value) {
        this.relid = value.relid;
        this.schemaname = value.schemaname;
        this.relname = value.relname;
        this.blksRead = value.blksRead;
        this.blksHit = value.blksHit;
    }

    public PgStatioAllSequences(
        Long relid,
        String schemaname,
        String relname,
        Long blksRead,
        Long blksHit
    ) {
        this.relid = relid;
        this.schemaname = schemaname;
        this.relname = relname;
        this.blksRead = blksRead;
        this.blksHit = blksHit;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_all_sequences.relid</code>.
     */
    public Long getRelid() {
        return this.relid;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_all_sequences.relid</code>.
     */
    public void setRelid(Long relid) {
        this.relid = relid;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_all_sequences.schemaname</code>.
     */
    public String getSchemaname() {
        return this.schemaname;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_all_sequences.schemaname</code>.
     */
    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_all_sequences.relname</code>.
     */
    public String getRelname() {
        return this.relname;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_all_sequences.relname</code>.
     */
    public void setRelname(String relname) {
        this.relname = relname;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_all_sequences.blks_read</code>.
     */
    public Long getBlksRead() {
        return this.blksRead;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_all_sequences.blks_read</code>.
     */
    public void setBlksRead(Long blksRead) {
        this.blksRead = blksRead;
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_all_sequences.blks_hit</code>.
     */
    public Long getBlksHit() {
        return this.blksHit;
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_all_sequences.blks_hit</code>.
     */
    public void setBlksHit(Long blksHit) {
        this.blksHit = blksHit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatioAllSequences other = (PgStatioAllSequences) obj;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
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
        if (this.blksRead == null) {
            if (other.blksRead != null)
                return false;
        }
        else if (!this.blksRead.equals(other.blksRead))
            return false;
        if (this.blksHit == null) {
            if (other.blksHit != null)
                return false;
        }
        else if (!this.blksHit.equals(other.blksHit))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.schemaname == null) ? 0 : this.schemaname.hashCode());
        result = prime * result + ((this.relname == null) ? 0 : this.relname.hashCode());
        result = prime * result + ((this.blksRead == null) ? 0 : this.blksRead.hashCode());
        result = prime * result + ((this.blksHit == null) ? 0 : this.blksHit.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatioAllSequences (");

        sb.append(relid);
        sb.append(", ").append(schemaname);
        sb.append(", ").append(relname);
        sb.append(", ").append(blksRead);
        sb.append(", ").append(blksHit);

        sb.append(")");
        return sb.toString();
    }
}
