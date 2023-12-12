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
public class PgAuthid implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String rolname;
    private Boolean rolsuper;
    private Boolean rolinherit;
    private Boolean rolcreaterole;
    private Boolean rolcreatedb;
    private Boolean rolcanlogin;
    private Boolean rolreplication;
    private Boolean rolbypassrls;
    private Integer rolconnlimit;
    private String rolpassword;
    private OffsetDateTime rolvaliduntil;

    public PgAuthid() {}

    public PgAuthid(PgAuthid value) {
        this.oid = value.oid;
        this.rolname = value.rolname;
        this.rolsuper = value.rolsuper;
        this.rolinherit = value.rolinherit;
        this.rolcreaterole = value.rolcreaterole;
        this.rolcreatedb = value.rolcreatedb;
        this.rolcanlogin = value.rolcanlogin;
        this.rolreplication = value.rolreplication;
        this.rolbypassrls = value.rolbypassrls;
        this.rolconnlimit = value.rolconnlimit;
        this.rolpassword = value.rolpassword;
        this.rolvaliduntil = value.rolvaliduntil;
    }

    public PgAuthid(
        Long oid,
        String rolname,
        Boolean rolsuper,
        Boolean rolinherit,
        Boolean rolcreaterole,
        Boolean rolcreatedb,
        Boolean rolcanlogin,
        Boolean rolreplication,
        Boolean rolbypassrls,
        Integer rolconnlimit,
        String rolpassword,
        OffsetDateTime rolvaliduntil
    ) {
        this.oid = oid;
        this.rolname = rolname;
        this.rolsuper = rolsuper;
        this.rolinherit = rolinherit;
        this.rolcreaterole = rolcreaterole;
        this.rolcreatedb = rolcreatedb;
        this.rolcanlogin = rolcanlogin;
        this.rolreplication = rolreplication;
        this.rolbypassrls = rolbypassrls;
        this.rolconnlimit = rolconnlimit;
        this.rolpassword = rolpassword;
        this.rolvaliduntil = rolvaliduntil;
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.oid</code>.
     */
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.oid</code>.
     */
    public void setOid(Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolname</code>.
     */
    public String getRolname() {
        return this.rolname;
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolname</code>.
     */
    public void setRolname(String rolname) {
        this.rolname = rolname;
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolsuper</code>.
     */
    public Boolean getRolsuper() {
        return this.rolsuper;
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolsuper</code>.
     */
    public void setRolsuper(Boolean rolsuper) {
        this.rolsuper = rolsuper;
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolinherit</code>.
     */
    public Boolean getRolinherit() {
        return this.rolinherit;
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolinherit</code>.
     */
    public void setRolinherit(Boolean rolinherit) {
        this.rolinherit = rolinherit;
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolcreaterole</code>.
     */
    public Boolean getRolcreaterole() {
        return this.rolcreaterole;
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolcreaterole</code>.
     */
    public void setRolcreaterole(Boolean rolcreaterole) {
        this.rolcreaterole = rolcreaterole;
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolcreatedb</code>.
     */
    public Boolean getRolcreatedb() {
        return this.rolcreatedb;
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolcreatedb</code>.
     */
    public void setRolcreatedb(Boolean rolcreatedb) {
        this.rolcreatedb = rolcreatedb;
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolcanlogin</code>.
     */
    public Boolean getRolcanlogin() {
        return this.rolcanlogin;
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolcanlogin</code>.
     */
    public void setRolcanlogin(Boolean rolcanlogin) {
        this.rolcanlogin = rolcanlogin;
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolreplication</code>.
     */
    public Boolean getRolreplication() {
        return this.rolreplication;
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolreplication</code>.
     */
    public void setRolreplication(Boolean rolreplication) {
        this.rolreplication = rolreplication;
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolbypassrls</code>.
     */
    public Boolean getRolbypassrls() {
        return this.rolbypassrls;
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolbypassrls</code>.
     */
    public void setRolbypassrls(Boolean rolbypassrls) {
        this.rolbypassrls = rolbypassrls;
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolconnlimit</code>.
     */
    public Integer getRolconnlimit() {
        return this.rolconnlimit;
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolconnlimit</code>.
     */
    public void setRolconnlimit(Integer rolconnlimit) {
        this.rolconnlimit = rolconnlimit;
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolpassword</code>.
     */
    public String getRolpassword() {
        return this.rolpassword;
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolpassword</code>.
     */
    public void setRolpassword(String rolpassword) {
        this.rolpassword = rolpassword;
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolvaliduntil</code>.
     */
    public OffsetDateTime getRolvaliduntil() {
        return this.rolvaliduntil;
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolvaliduntil</code>.
     */
    public void setRolvaliduntil(OffsetDateTime rolvaliduntil) {
        this.rolvaliduntil = rolvaliduntil;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgAuthid other = (PgAuthid) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.rolname == null) {
            if (other.rolname != null)
                return false;
        }
        else if (!this.rolname.equals(other.rolname))
            return false;
        if (this.rolsuper == null) {
            if (other.rolsuper != null)
                return false;
        }
        else if (!this.rolsuper.equals(other.rolsuper))
            return false;
        if (this.rolinherit == null) {
            if (other.rolinherit != null)
                return false;
        }
        else if (!this.rolinherit.equals(other.rolinherit))
            return false;
        if (this.rolcreaterole == null) {
            if (other.rolcreaterole != null)
                return false;
        }
        else if (!this.rolcreaterole.equals(other.rolcreaterole))
            return false;
        if (this.rolcreatedb == null) {
            if (other.rolcreatedb != null)
                return false;
        }
        else if (!this.rolcreatedb.equals(other.rolcreatedb))
            return false;
        if (this.rolcanlogin == null) {
            if (other.rolcanlogin != null)
                return false;
        }
        else if (!this.rolcanlogin.equals(other.rolcanlogin))
            return false;
        if (this.rolreplication == null) {
            if (other.rolreplication != null)
                return false;
        }
        else if (!this.rolreplication.equals(other.rolreplication))
            return false;
        if (this.rolbypassrls == null) {
            if (other.rolbypassrls != null)
                return false;
        }
        else if (!this.rolbypassrls.equals(other.rolbypassrls))
            return false;
        if (this.rolconnlimit == null) {
            if (other.rolconnlimit != null)
                return false;
        }
        else if (!this.rolconnlimit.equals(other.rolconnlimit))
            return false;
        if (this.rolpassword == null) {
            if (other.rolpassword != null)
                return false;
        }
        else if (!this.rolpassword.equals(other.rolpassword))
            return false;
        if (this.rolvaliduntil == null) {
            if (other.rolvaliduntil != null)
                return false;
        }
        else if (!this.rolvaliduntil.equals(other.rolvaliduntil))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.rolname == null) ? 0 : this.rolname.hashCode());
        result = prime * result + ((this.rolsuper == null) ? 0 : this.rolsuper.hashCode());
        result = prime * result + ((this.rolinherit == null) ? 0 : this.rolinherit.hashCode());
        result = prime * result + ((this.rolcreaterole == null) ? 0 : this.rolcreaterole.hashCode());
        result = prime * result + ((this.rolcreatedb == null) ? 0 : this.rolcreatedb.hashCode());
        result = prime * result + ((this.rolcanlogin == null) ? 0 : this.rolcanlogin.hashCode());
        result = prime * result + ((this.rolreplication == null) ? 0 : this.rolreplication.hashCode());
        result = prime * result + ((this.rolbypassrls == null) ? 0 : this.rolbypassrls.hashCode());
        result = prime * result + ((this.rolconnlimit == null) ? 0 : this.rolconnlimit.hashCode());
        result = prime * result + ((this.rolpassword == null) ? 0 : this.rolpassword.hashCode());
        result = prime * result + ((this.rolvaliduntil == null) ? 0 : this.rolvaliduntil.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAuthid (");

        sb.append(oid);
        sb.append(", ").append(rolname);
        sb.append(", ").append(rolsuper);
        sb.append(", ").append(rolinherit);
        sb.append(", ").append(rolcreaterole);
        sb.append(", ").append(rolcreatedb);
        sb.append(", ").append(rolcanlogin);
        sb.append(", ").append(rolreplication);
        sb.append(", ").append(rolbypassrls);
        sb.append(", ").append(rolconnlimit);
        sb.append(", ").append(rolpassword);
        sb.append(", ").append(rolvaliduntil);

        sb.append(")");
        return sb.toString();
    }
}
