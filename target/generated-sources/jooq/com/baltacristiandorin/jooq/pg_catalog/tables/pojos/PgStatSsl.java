/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatSsl implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pid;
    private Boolean ssl;
    private String version;
    private String cipher;
    private Integer bits;
    private String clientDn;
    private BigDecimal clientSerial;
    private String issuerDn;

    public PgStatSsl() {}

    public PgStatSsl(PgStatSsl value) {
        this.pid = value.pid;
        this.ssl = value.ssl;
        this.version = value.version;
        this.cipher = value.cipher;
        this.bits = value.bits;
        this.clientDn = value.clientDn;
        this.clientSerial = value.clientSerial;
        this.issuerDn = value.issuerDn;
    }

    public PgStatSsl(
        Integer pid,
        Boolean ssl,
        String version,
        String cipher,
        Integer bits,
        String clientDn,
        BigDecimal clientSerial,
        String issuerDn
    ) {
        this.pid = pid;
        this.ssl = ssl;
        this.version = version;
        this.cipher = cipher;
        this.bits = bits;
        this.clientDn = clientDn;
        this.clientSerial = clientSerial;
        this.issuerDn = issuerDn;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.pid</code>.
     */
    public Integer getPid() {
        return this.pid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.pid</code>.
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.ssl</code>.
     */
    public Boolean getSsl() {
        return this.ssl;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.ssl</code>.
     */
    public void setSsl(Boolean ssl) {
        this.ssl = ssl;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.version</code>.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.version</code>.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.cipher</code>.
     */
    public String getCipher() {
        return this.cipher;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.cipher</code>.
     */
    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.bits</code>.
     */
    public Integer getBits() {
        return this.bits;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.bits</code>.
     */
    public void setBits(Integer bits) {
        this.bits = bits;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.client_dn</code>.
     */
    public String getClientDn() {
        return this.clientDn;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.client_dn</code>.
     */
    public void setClientDn(String clientDn) {
        this.clientDn = clientDn;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.client_serial</code>.
     */
    public BigDecimal getClientSerial() {
        return this.clientSerial;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.client_serial</code>.
     */
    public void setClientSerial(BigDecimal clientSerial) {
        this.clientSerial = clientSerial;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.issuer_dn</code>.
     */
    public String getIssuerDn() {
        return this.issuerDn;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.issuer_dn</code>.
     */
    public void setIssuerDn(String issuerDn) {
        this.issuerDn = issuerDn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatSsl other = (PgStatSsl) obj;
        if (this.pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!this.pid.equals(other.pid))
            return false;
        if (this.ssl == null) {
            if (other.ssl != null)
                return false;
        }
        else if (!this.ssl.equals(other.ssl))
            return false;
        if (this.version == null) {
            if (other.version != null)
                return false;
        }
        else if (!this.version.equals(other.version))
            return false;
        if (this.cipher == null) {
            if (other.cipher != null)
                return false;
        }
        else if (!this.cipher.equals(other.cipher))
            return false;
        if (this.bits == null) {
            if (other.bits != null)
                return false;
        }
        else if (!this.bits.equals(other.bits))
            return false;
        if (this.clientDn == null) {
            if (other.clientDn != null)
                return false;
        }
        else if (!this.clientDn.equals(other.clientDn))
            return false;
        if (this.clientSerial == null) {
            if (other.clientSerial != null)
                return false;
        }
        else if (!this.clientSerial.equals(other.clientSerial))
            return false;
        if (this.issuerDn == null) {
            if (other.issuerDn != null)
                return false;
        }
        else if (!this.issuerDn.equals(other.issuerDn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.ssl == null) ? 0 : this.ssl.hashCode());
        result = prime * result + ((this.version == null) ? 0 : this.version.hashCode());
        result = prime * result + ((this.cipher == null) ? 0 : this.cipher.hashCode());
        result = prime * result + ((this.bits == null) ? 0 : this.bits.hashCode());
        result = prime * result + ((this.clientDn == null) ? 0 : this.clientDn.hashCode());
        result = prime * result + ((this.clientSerial == null) ? 0 : this.clientSerial.hashCode());
        result = prime * result + ((this.issuerDn == null) ? 0 : this.issuerDn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatSsl (");

        sb.append(pid);
        sb.append(", ").append(ssl);
        sb.append(", ").append(version);
        sb.append(", ").append(cipher);
        sb.append(", ").append(bits);
        sb.append(", ").append(clientDn);
        sb.append(", ").append(clientSerial);
        sb.append(", ").append(issuerDn);

        sb.append(")");
        return sb.toString();
    }
}
