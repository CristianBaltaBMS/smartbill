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
public class PgLanguage implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String lanname;
    private Long lanowner;
    private Boolean lanispl;
    private Boolean lanpltrusted;
    private Long lanplcallfoid;
    private Long laninline;
    private Long lanvalidator;
    private String[] lanacl;

    public PgLanguage() {}

    public PgLanguage(PgLanguage value) {
        this.oid = value.oid;
        this.lanname = value.lanname;
        this.lanowner = value.lanowner;
        this.lanispl = value.lanispl;
        this.lanpltrusted = value.lanpltrusted;
        this.lanplcallfoid = value.lanplcallfoid;
        this.laninline = value.laninline;
        this.lanvalidator = value.lanvalidator;
        this.lanacl = value.lanacl;
    }

    public PgLanguage(
        Long oid,
        String lanname,
        Long lanowner,
        Boolean lanispl,
        Boolean lanpltrusted,
        Long lanplcallfoid,
        Long laninline,
        Long lanvalidator,
        String[] lanacl
    ) {
        this.oid = oid;
        this.lanname = lanname;
        this.lanowner = lanowner;
        this.lanispl = lanispl;
        this.lanpltrusted = lanpltrusted;
        this.lanplcallfoid = lanplcallfoid;
        this.laninline = laninline;
        this.lanvalidator = lanvalidator;
        this.lanacl = lanacl;
    }

    /**
     * Getter for <code>pg_catalog.pg_language.oid</code>.
     */
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_language.oid</code>.
     */
    public void setOid(Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanname</code>.
     */
    public String getLanname() {
        return this.lanname;
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanname</code>.
     */
    public void setLanname(String lanname) {
        this.lanname = lanname;
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanowner</code>.
     */
    public Long getLanowner() {
        return this.lanowner;
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanowner</code>.
     */
    public void setLanowner(Long lanowner) {
        this.lanowner = lanowner;
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanispl</code>.
     */
    public Boolean getLanispl() {
        return this.lanispl;
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanispl</code>.
     */
    public void setLanispl(Boolean lanispl) {
        this.lanispl = lanispl;
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanpltrusted</code>.
     */
    public Boolean getLanpltrusted() {
        return this.lanpltrusted;
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanpltrusted</code>.
     */
    public void setLanpltrusted(Boolean lanpltrusted) {
        this.lanpltrusted = lanpltrusted;
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanplcallfoid</code>.
     */
    public Long getLanplcallfoid() {
        return this.lanplcallfoid;
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanplcallfoid</code>.
     */
    public void setLanplcallfoid(Long lanplcallfoid) {
        this.lanplcallfoid = lanplcallfoid;
    }

    /**
     * Getter for <code>pg_catalog.pg_language.laninline</code>.
     */
    public Long getLaninline() {
        return this.laninline;
    }

    /**
     * Setter for <code>pg_catalog.pg_language.laninline</code>.
     */
    public void setLaninline(Long laninline) {
        this.laninline = laninline;
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanvalidator</code>.
     */
    public Long getLanvalidator() {
        return this.lanvalidator;
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanvalidator</code>.
     */
    public void setLanvalidator(Long lanvalidator) {
        this.lanvalidator = lanvalidator;
    }

    /**
     * Getter for <code>pg_catalog.pg_language.lanacl</code>.
     */
    public String[] getLanacl() {
        return this.lanacl;
    }

    /**
     * Setter for <code>pg_catalog.pg_language.lanacl</code>.
     */
    public void setLanacl(String[] lanacl) {
        this.lanacl = lanacl;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgLanguage other = (PgLanguage) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.lanname == null) {
            if (other.lanname != null)
                return false;
        }
        else if (!this.lanname.equals(other.lanname))
            return false;
        if (this.lanowner == null) {
            if (other.lanowner != null)
                return false;
        }
        else if (!this.lanowner.equals(other.lanowner))
            return false;
        if (this.lanispl == null) {
            if (other.lanispl != null)
                return false;
        }
        else if (!this.lanispl.equals(other.lanispl))
            return false;
        if (this.lanpltrusted == null) {
            if (other.lanpltrusted != null)
                return false;
        }
        else if (!this.lanpltrusted.equals(other.lanpltrusted))
            return false;
        if (this.lanplcallfoid == null) {
            if (other.lanplcallfoid != null)
                return false;
        }
        else if (!this.lanplcallfoid.equals(other.lanplcallfoid))
            return false;
        if (this.laninline == null) {
            if (other.laninline != null)
                return false;
        }
        else if (!this.laninline.equals(other.laninline))
            return false;
        if (this.lanvalidator == null) {
            if (other.lanvalidator != null)
                return false;
        }
        else if (!this.lanvalidator.equals(other.lanvalidator))
            return false;
        if (this.lanacl == null) {
            if (other.lanacl != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.lanacl, other.lanacl))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.lanname == null) ? 0 : this.lanname.hashCode());
        result = prime * result + ((this.lanowner == null) ? 0 : this.lanowner.hashCode());
        result = prime * result + ((this.lanispl == null) ? 0 : this.lanispl.hashCode());
        result = prime * result + ((this.lanpltrusted == null) ? 0 : this.lanpltrusted.hashCode());
        result = prime * result + ((this.lanplcallfoid == null) ? 0 : this.lanplcallfoid.hashCode());
        result = prime * result + ((this.laninline == null) ? 0 : this.laninline.hashCode());
        result = prime * result + ((this.lanvalidator == null) ? 0 : this.lanvalidator.hashCode());
        result = prime * result + ((this.lanacl == null) ? 0 : Arrays.deepHashCode(this.lanacl));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgLanguage (");

        sb.append(oid);
        sb.append(", ").append(lanname);
        sb.append(", ").append(lanowner);
        sb.append(", ").append(lanispl);
        sb.append(", ").append(lanpltrusted);
        sb.append(", ").append(lanplcallfoid);
        sb.append(", ").append(laninline);
        sb.append(", ").append(lanvalidator);
        sb.append(", ").append(Arrays.deepToString(lanacl));

        sb.append(")");
        return sb.toString();
    }
}
