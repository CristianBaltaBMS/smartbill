/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPartitionTree implements Serializable {

    private static final long serialVersionUID = 1L;

    private Object relid;
    private Object parentrelid;
    private Boolean isleaf;
    private Integer level;

    public PgPartitionTree() {}

    public PgPartitionTree(PgPartitionTree value) {
        this.relid = value.relid;
        this.parentrelid = value.parentrelid;
        this.isleaf = value.isleaf;
        this.level = value.level;
    }

    public PgPartitionTree(
        Object relid,
        Object parentrelid,
        Boolean isleaf,
        Integer level
    ) {
        this.relid = relid;
        this.parentrelid = parentrelid;
        this.isleaf = isleaf;
        this.level = level;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getRelid() {
        return this.relid;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setRelid(Object relid) {
        this.relid = relid;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getParentrelid() {
        return this.parentrelid;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setParentrelid(Object parentrelid) {
        this.parentrelid = parentrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_partition_tree.isleaf</code>.
     */
    public Boolean getIsleaf() {
        return this.isleaf;
    }

    /**
     * Setter for <code>pg_catalog.pg_partition_tree.isleaf</code>.
     */
    public void setIsleaf(Boolean isleaf) {
        this.isleaf = isleaf;
    }

    /**
     * Getter for <code>pg_catalog.pg_partition_tree.level</code>.
     */
    public Integer getLevel() {
        return this.level;
    }

    /**
     * Setter for <code>pg_catalog.pg_partition_tree.level</code>.
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgPartitionTree other = (PgPartitionTree) obj;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
            return false;
        if (this.parentrelid == null) {
            if (other.parentrelid != null)
                return false;
        }
        else if (!this.parentrelid.equals(other.parentrelid))
            return false;
        if (this.isleaf == null) {
            if (other.isleaf != null)
                return false;
        }
        else if (!this.isleaf.equals(other.isleaf))
            return false;
        if (this.level == null) {
            if (other.level != null)
                return false;
        }
        else if (!this.level.equals(other.level))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.parentrelid == null) ? 0 : this.parentrelid.hashCode());
        result = prime * result + ((this.isleaf == null) ? 0 : this.isleaf.hashCode());
        result = prime * result + ((this.level == null) ? 0 : this.level.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgPartitionTree (");

        sb.append(relid);
        sb.append(", ").append(parentrelid);
        sb.append(", ").append(isleaf);
        sb.append(", ").append(level);

        sb.append(")");
        return sb.toString();
    }
}
