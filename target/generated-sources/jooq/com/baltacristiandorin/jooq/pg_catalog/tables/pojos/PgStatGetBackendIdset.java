/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatGetBackendIdset implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pgStatGetBackendIdset;

    public PgStatGetBackendIdset() {}

    public PgStatGetBackendIdset(PgStatGetBackendIdset value) {
        this.pgStatGetBackendIdset = value.pgStatGetBackendIdset;
    }

    public PgStatGetBackendIdset(
        Integer pgStatGetBackendIdset
    ) {
        this.pgStatGetBackendIdset = pgStatGetBackendIdset;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_get_backend_idset.pg_stat_get_backend_idset</code>.
     */
    public Integer getPgStatGetBackendIdset() {
        return this.pgStatGetBackendIdset;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_get_backend_idset.pg_stat_get_backend_idset</code>.
     */
    public void setPgStatGetBackendIdset(Integer pgStatGetBackendIdset) {
        this.pgStatGetBackendIdset = pgStatGetBackendIdset;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatGetBackendIdset other = (PgStatGetBackendIdset) obj;
        if (this.pgStatGetBackendIdset == null) {
            if (other.pgStatGetBackendIdset != null)
                return false;
        }
        else if (!this.pgStatGetBackendIdset.equals(other.pgStatGetBackendIdset))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pgStatGetBackendIdset == null) ? 0 : this.pgStatGetBackendIdset.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatGetBackendIdset (");

        sb.append(pgStatGetBackendIdset);

        sb.append(")");
        return sb.toString();
    }
}
