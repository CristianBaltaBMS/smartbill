/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Unnest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Object unnest;

    public Unnest() {}

    public Unnest(Unnest value) {
        this.unnest = value.unnest;
    }

    public Unnest(
        Object unnest
    ) {
        this.unnest = unnest;
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
    public Object getUnnest() {
        return this.unnest;
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
    public void setUnnest(Object unnest) {
        this.unnest = unnest;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Unnest other = (Unnest) obj;
        if (this.unnest == null) {
            if (other.unnest != null)
                return false;
        }
        else if (!this.unnest.equals(other.unnest))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.unnest == null) ? 0 : this.unnest.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Unnest (");

        sb.append(unnest);

        sb.append(")");
        return sb.toString();
    }
}