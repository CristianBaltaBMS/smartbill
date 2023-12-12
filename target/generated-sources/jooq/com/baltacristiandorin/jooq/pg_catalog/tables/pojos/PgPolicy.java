/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPolicy implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String polname;
    private Long polrelid;
    private String polcmd;
    private Boolean polpermissive;
    private Long[] polroles;
    private Object polqual;
    private Object polwithcheck;

    public PgPolicy() {}

    public PgPolicy(PgPolicy value) {
        this.oid = value.oid;
        this.polname = value.polname;
        this.polrelid = value.polrelid;
        this.polcmd = value.polcmd;
        this.polpermissive = value.polpermissive;
        this.polroles = value.polroles;
        this.polqual = value.polqual;
        this.polwithcheck = value.polwithcheck;
    }

    public PgPolicy(
        Long oid,
        String polname,
        Long polrelid,
        String polcmd,
        Boolean polpermissive,
        Long[] polroles,
        Object polqual,
        Object polwithcheck
    ) {
        this.oid = oid;
        this.polname = polname;
        this.polrelid = polrelid;
        this.polcmd = polcmd;
        this.polpermissive = polpermissive;
        this.polroles = polroles;
        this.polqual = polqual;
        this.polwithcheck = polwithcheck;
    }

    /**
     * Getter for <code>pg_catalog.pg_policy.oid</code>.
     */
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_policy.oid</code>.
     */
    public void setOid(Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_policy.polname</code>.
     */
    public String getPolname() {
        return this.polname;
    }

    /**
     * Setter for <code>pg_catalog.pg_policy.polname</code>.
     */
    public void setPolname(String polname) {
        this.polname = polname;
    }

    /**
     * Getter for <code>pg_catalog.pg_policy.polrelid</code>.
     */
    public Long getPolrelid() {
        return this.polrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_policy.polrelid</code>.
     */
    public void setPolrelid(Long polrelid) {
        this.polrelid = polrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_policy.polcmd</code>.
     */
    public String getPolcmd() {
        return this.polcmd;
    }

    /**
     * Setter for <code>pg_catalog.pg_policy.polcmd</code>.
     */
    public void setPolcmd(String polcmd) {
        this.polcmd = polcmd;
    }

    /**
     * Getter for <code>pg_catalog.pg_policy.polpermissive</code>.
     */
    public Boolean getPolpermissive() {
        return this.polpermissive;
    }

    /**
     * Setter for <code>pg_catalog.pg_policy.polpermissive</code>.
     */
    public void setPolpermissive(Boolean polpermissive) {
        this.polpermissive = polpermissive;
    }

    /**
     * Getter for <code>pg_catalog.pg_policy.polroles</code>.
     */
    public Long[] getPolroles() {
        return this.polroles;
    }

    /**
     * Setter for <code>pg_catalog.pg_policy.polroles</code>.
     */
    public void setPolroles(Long[] polroles) {
        this.polroles = polroles;
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
    public Object getPolqual() {
        return this.polqual;
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
    public void setPolqual(Object polqual) {
        this.polqual = polqual;
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
    public Object getPolwithcheck() {
        return this.polwithcheck;
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
    public void setPolwithcheck(Object polwithcheck) {
        this.polwithcheck = polwithcheck;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgPolicy other = (PgPolicy) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.polname == null) {
            if (other.polname != null)
                return false;
        }
        else if (!this.polname.equals(other.polname))
            return false;
        if (this.polrelid == null) {
            if (other.polrelid != null)
                return false;
        }
        else if (!this.polrelid.equals(other.polrelid))
            return false;
        if (this.polcmd == null) {
            if (other.polcmd != null)
                return false;
        }
        else if (!this.polcmd.equals(other.polcmd))
            return false;
        if (this.polpermissive == null) {
            if (other.polpermissive != null)
                return false;
        }
        else if (!this.polpermissive.equals(other.polpermissive))
            return false;
        if (this.polroles == null) {
            if (other.polroles != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.polroles, other.polroles))
            return false;
        if (this.polqual == null) {
            if (other.polqual != null)
                return false;
        }
        else if (!this.polqual.equals(other.polqual))
            return false;
        if (this.polwithcheck == null) {
            if (other.polwithcheck != null)
                return false;
        }
        else if (!this.polwithcheck.equals(other.polwithcheck))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.polname == null) ? 0 : this.polname.hashCode());
        result = prime * result + ((this.polrelid == null) ? 0 : this.polrelid.hashCode());
        result = prime * result + ((this.polcmd == null) ? 0 : this.polcmd.hashCode());
        result = prime * result + ((this.polpermissive == null) ? 0 : this.polpermissive.hashCode());
        result = prime * result + ((this.polroles == null) ? 0 : Arrays.deepHashCode(this.polroles));
        result = prime * result + ((this.polqual == null) ? 0 : this.polqual.hashCode());
        result = prime * result + ((this.polwithcheck == null) ? 0 : this.polwithcheck.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgPolicy (");

        sb.append(oid);
        sb.append(", ").append(polname);
        sb.append(", ").append(polrelid);
        sb.append(", ").append(polcmd);
        sb.append(", ").append(polpermissive);
        sb.append(", ").append(Arrays.deepToString(polroles));
        sb.append(", ").append(polqual);
        sb.append(", ").append(polwithcheck);

        sb.append(")");
        return sb.toString();
    }
}
