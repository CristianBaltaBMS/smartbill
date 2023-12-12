/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String usename;
    private Long usesysid;
    private Boolean usecreatedb;
    private Boolean usesuper;
    private Boolean userepl;
    private Boolean usebypassrls;
    private String passwd;
    private OffsetDateTime valuntil;
    private String[] useconfig;

    public PgUser() {}

    public PgUser(PgUser value) {
        this.usename = value.usename;
        this.usesysid = value.usesysid;
        this.usecreatedb = value.usecreatedb;
        this.usesuper = value.usesuper;
        this.userepl = value.userepl;
        this.usebypassrls = value.usebypassrls;
        this.passwd = value.passwd;
        this.valuntil = value.valuntil;
        this.useconfig = value.useconfig;
    }

    public PgUser(
        String usename,
        Long usesysid,
        Boolean usecreatedb,
        Boolean usesuper,
        Boolean userepl,
        Boolean usebypassrls,
        String passwd,
        OffsetDateTime valuntil,
        String[] useconfig
    ) {
        this.usename = usename;
        this.usesysid = usesysid;
        this.usecreatedb = usecreatedb;
        this.usesuper = usesuper;
        this.userepl = userepl;
        this.usebypassrls = usebypassrls;
        this.passwd = passwd;
        this.valuntil = valuntil;
        this.useconfig = useconfig;
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usename</code>.
     */
    public String getUsename() {
        return this.usename;
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usename</code>.
     */
    public void setUsename(String usename) {
        this.usename = usename;
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usesysid</code>.
     */
    public Long getUsesysid() {
        return this.usesysid;
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usesysid</code>.
     */
    public void setUsesysid(Long usesysid) {
        this.usesysid = usesysid;
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usecreatedb</code>.
     */
    public Boolean getUsecreatedb() {
        return this.usecreatedb;
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usecreatedb</code>.
     */
    public void setUsecreatedb(Boolean usecreatedb) {
        this.usecreatedb = usecreatedb;
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usesuper</code>.
     */
    public Boolean getUsesuper() {
        return this.usesuper;
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usesuper</code>.
     */
    public void setUsesuper(Boolean usesuper) {
        this.usesuper = usesuper;
    }

    /**
     * Getter for <code>pg_catalog.pg_user.userepl</code>.
     */
    public Boolean getUserepl() {
        return this.userepl;
    }

    /**
     * Setter for <code>pg_catalog.pg_user.userepl</code>.
     */
    public void setUserepl(Boolean userepl) {
        this.userepl = userepl;
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usebypassrls</code>.
     */
    public Boolean getUsebypassrls() {
        return this.usebypassrls;
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usebypassrls</code>.
     */
    public void setUsebypassrls(Boolean usebypassrls) {
        this.usebypassrls = usebypassrls;
    }

    /**
     * Getter for <code>pg_catalog.pg_user.passwd</code>.
     */
    public String getPasswd() {
        return this.passwd;
    }

    /**
     * Setter for <code>pg_catalog.pg_user.passwd</code>.
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * Getter for <code>pg_catalog.pg_user.valuntil</code>.
     */
    public OffsetDateTime getValuntil() {
        return this.valuntil;
    }

    /**
     * Setter for <code>pg_catalog.pg_user.valuntil</code>.
     */
    public void setValuntil(OffsetDateTime valuntil) {
        this.valuntil = valuntil;
    }

    /**
     * Getter for <code>pg_catalog.pg_user.useconfig</code>.
     */
    public String[] getUseconfig() {
        return this.useconfig;
    }

    /**
     * Setter for <code>pg_catalog.pg_user.useconfig</code>.
     */
    public void setUseconfig(String[] useconfig) {
        this.useconfig = useconfig;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgUser other = (PgUser) obj;
        if (this.usename == null) {
            if (other.usename != null)
                return false;
        }
        else if (!this.usename.equals(other.usename))
            return false;
        if (this.usesysid == null) {
            if (other.usesysid != null)
                return false;
        }
        else if (!this.usesysid.equals(other.usesysid))
            return false;
        if (this.usecreatedb == null) {
            if (other.usecreatedb != null)
                return false;
        }
        else if (!this.usecreatedb.equals(other.usecreatedb))
            return false;
        if (this.usesuper == null) {
            if (other.usesuper != null)
                return false;
        }
        else if (!this.usesuper.equals(other.usesuper))
            return false;
        if (this.userepl == null) {
            if (other.userepl != null)
                return false;
        }
        else if (!this.userepl.equals(other.userepl))
            return false;
        if (this.usebypassrls == null) {
            if (other.usebypassrls != null)
                return false;
        }
        else if (!this.usebypassrls.equals(other.usebypassrls))
            return false;
        if (this.passwd == null) {
            if (other.passwd != null)
                return false;
        }
        else if (!this.passwd.equals(other.passwd))
            return false;
        if (this.valuntil == null) {
            if (other.valuntil != null)
                return false;
        }
        else if (!this.valuntil.equals(other.valuntil))
            return false;
        if (this.useconfig == null) {
            if (other.useconfig != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.useconfig, other.useconfig))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.usename == null) ? 0 : this.usename.hashCode());
        result = prime * result + ((this.usesysid == null) ? 0 : this.usesysid.hashCode());
        result = prime * result + ((this.usecreatedb == null) ? 0 : this.usecreatedb.hashCode());
        result = prime * result + ((this.usesuper == null) ? 0 : this.usesuper.hashCode());
        result = prime * result + ((this.userepl == null) ? 0 : this.userepl.hashCode());
        result = prime * result + ((this.usebypassrls == null) ? 0 : this.usebypassrls.hashCode());
        result = prime * result + ((this.passwd == null) ? 0 : this.passwd.hashCode());
        result = prime * result + ((this.valuntil == null) ? 0 : this.valuntil.hashCode());
        result = prime * result + ((this.useconfig == null) ? 0 : Arrays.deepHashCode(this.useconfig));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgUser (");

        sb.append(usename);
        sb.append(", ").append(usesysid);
        sb.append(", ").append(usecreatedb);
        sb.append(", ").append(usesuper);
        sb.append(", ").append(userepl);
        sb.append(", ").append(usebypassrls);
        sb.append(", ").append(passwd);
        sb.append(", ").append(valuntil);
        sb.append(", ").append(Arrays.deepToString(useconfig));

        sb.append(")");
        return sb.toString();
    }
}
