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
public class PgCursors implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String statement;
    private Boolean isHoldable;
    private Boolean isBinary;
    private Boolean isScrollable;
    private OffsetDateTime creationTime;

    public PgCursors() {}

    public PgCursors(PgCursors value) {
        this.name = value.name;
        this.statement = value.statement;
        this.isHoldable = value.isHoldable;
        this.isBinary = value.isBinary;
        this.isScrollable = value.isScrollable;
        this.creationTime = value.creationTime;
    }

    public PgCursors(
        String name,
        String statement,
        Boolean isHoldable,
        Boolean isBinary,
        Boolean isScrollable,
        OffsetDateTime creationTime
    ) {
        this.name = name;
        this.statement = statement;
        this.isHoldable = isHoldable;
        this.isBinary = isBinary;
        this.isScrollable = isScrollable;
        this.creationTime = creationTime;
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.statement</code>.
     */
    public String getStatement() {
        return this.statement;
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.statement</code>.
     */
    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.is_holdable</code>.
     */
    public Boolean getIsHoldable() {
        return this.isHoldable;
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.is_holdable</code>.
     */
    public void setIsHoldable(Boolean isHoldable) {
        this.isHoldable = isHoldable;
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.is_binary</code>.
     */
    public Boolean getIsBinary() {
        return this.isBinary;
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.is_binary</code>.
     */
    public void setIsBinary(Boolean isBinary) {
        this.isBinary = isBinary;
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.is_scrollable</code>.
     */
    public Boolean getIsScrollable() {
        return this.isScrollable;
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.is_scrollable</code>.
     */
    public void setIsScrollable(Boolean isScrollable) {
        this.isScrollable = isScrollable;
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.creation_time</code>.
     */
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.creation_time</code>.
     */
    public void setCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgCursors other = (PgCursors) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.statement == null) {
            if (other.statement != null)
                return false;
        }
        else if (!this.statement.equals(other.statement))
            return false;
        if (this.isHoldable == null) {
            if (other.isHoldable != null)
                return false;
        }
        else if (!this.isHoldable.equals(other.isHoldable))
            return false;
        if (this.isBinary == null) {
            if (other.isBinary != null)
                return false;
        }
        else if (!this.isBinary.equals(other.isBinary))
            return false;
        if (this.isScrollable == null) {
            if (other.isScrollable != null)
                return false;
        }
        else if (!this.isScrollable.equals(other.isScrollable))
            return false;
        if (this.creationTime == null) {
            if (other.creationTime != null)
                return false;
        }
        else if (!this.creationTime.equals(other.creationTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.statement == null) ? 0 : this.statement.hashCode());
        result = prime * result + ((this.isHoldable == null) ? 0 : this.isHoldable.hashCode());
        result = prime * result + ((this.isBinary == null) ? 0 : this.isBinary.hashCode());
        result = prime * result + ((this.isScrollable == null) ? 0 : this.isScrollable.hashCode());
        result = prime * result + ((this.creationTime == null) ? 0 : this.creationTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgCursors (");

        sb.append(name);
        sb.append(", ").append(statement);
        sb.append(", ").append(isHoldable);
        sb.append(", ").append(isBinary);
        sb.append(", ").append(isScrollable);
        sb.append(", ").append(creationTime);

        sb.append(")");
        return sb.toString();
    }
}
