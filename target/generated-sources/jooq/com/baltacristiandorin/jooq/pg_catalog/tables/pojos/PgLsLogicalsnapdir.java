/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLsLogicalsnapdir implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Long size;
    private OffsetDateTime modification;

    public PgLsLogicalsnapdir() {}

    public PgLsLogicalsnapdir(PgLsLogicalsnapdir value) {
        this.name = value.name;
        this.size = value.size;
        this.modification = value.modification;
    }

    public PgLsLogicalsnapdir(
        String name,
        Long size,
        OffsetDateTime modification
    ) {
        this.name = name;
        this.size = size;
        this.modification = modification;
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_logicalsnapdir.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>pg_catalog.pg_ls_logicalsnapdir.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_logicalsnapdir.size</code>.
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * Setter for <code>pg_catalog.pg_ls_logicalsnapdir.size</code>.
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_logicalsnapdir.modification</code>.
     */
    public OffsetDateTime getModification() {
        return this.modification;
    }

    /**
     * Setter for <code>pg_catalog.pg_ls_logicalsnapdir.modification</code>.
     */
    public void setModification(OffsetDateTime modification) {
        this.modification = modification;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgLsLogicalsnapdir other = (PgLsLogicalsnapdir) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.size == null) {
            if (other.size != null)
                return false;
        }
        else if (!this.size.equals(other.size))
            return false;
        if (this.modification == null) {
            if (other.modification != null)
                return false;
        }
        else if (!this.modification.equals(other.modification))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.size == null) ? 0 : this.size.hashCode());
        result = prime * result + ((this.modification == null) ? 0 : this.modification.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgLsLogicalsnapdir (");

        sb.append(name);
        sb.append(", ").append(size);
        sb.append(", ").append(modification);

        sb.append(")");
        return sb.toString();
    }
}
