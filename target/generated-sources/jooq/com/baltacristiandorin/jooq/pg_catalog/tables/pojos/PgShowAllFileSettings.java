/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgShowAllFileSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sourcefile;
    private Integer sourceline;
    private Integer seqno;
    private String name;
    private String setting;
    private Boolean applied;
    private String error;

    public PgShowAllFileSettings() {}

    public PgShowAllFileSettings(PgShowAllFileSettings value) {
        this.sourcefile = value.sourcefile;
        this.sourceline = value.sourceline;
        this.seqno = value.seqno;
        this.name = value.name;
        this.setting = value.setting;
        this.applied = value.applied;
        this.error = value.error;
    }

    public PgShowAllFileSettings(
        String sourcefile,
        Integer sourceline,
        Integer seqno,
        String name,
        String setting,
        Boolean applied,
        String error
    ) {
        this.sourcefile = sourcefile;
        this.sourceline = sourceline;
        this.seqno = seqno;
        this.name = name;
        this.setting = setting;
        this.applied = applied;
        this.error = error;
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.sourcefile</code>.
     */
    public String getSourcefile() {
        return this.sourcefile;
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.sourcefile</code>.
     */
    public void setSourcefile(String sourcefile) {
        this.sourcefile = sourcefile;
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.sourceline</code>.
     */
    public Integer getSourceline() {
        return this.sourceline;
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.sourceline</code>.
     */
    public void setSourceline(Integer sourceline) {
        this.sourceline = sourceline;
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.seqno</code>.
     */
    public Integer getSeqno() {
        return this.seqno;
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.seqno</code>.
     */
    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.setting</code>.
     */
    public String getSetting() {
        return this.setting;
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.setting</code>.
     */
    public void setSetting(String setting) {
        this.setting = setting;
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.applied</code>.
     */
    public Boolean getApplied() {
        return this.applied;
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.applied</code>.
     */
    public void setApplied(Boolean applied) {
        this.applied = applied;
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.error</code>.
     */
    public String getError() {
        return this.error;
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.error</code>.
     */
    public void setError(String error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgShowAllFileSettings other = (PgShowAllFileSettings) obj;
        if (this.sourcefile == null) {
            if (other.sourcefile != null)
                return false;
        }
        else if (!this.sourcefile.equals(other.sourcefile))
            return false;
        if (this.sourceline == null) {
            if (other.sourceline != null)
                return false;
        }
        else if (!this.sourceline.equals(other.sourceline))
            return false;
        if (this.seqno == null) {
            if (other.seqno != null)
                return false;
        }
        else if (!this.seqno.equals(other.seqno))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.setting == null) {
            if (other.setting != null)
                return false;
        }
        else if (!this.setting.equals(other.setting))
            return false;
        if (this.applied == null) {
            if (other.applied != null)
                return false;
        }
        else if (!this.applied.equals(other.applied))
            return false;
        if (this.error == null) {
            if (other.error != null)
                return false;
        }
        else if (!this.error.equals(other.error))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.sourcefile == null) ? 0 : this.sourcefile.hashCode());
        result = prime * result + ((this.sourceline == null) ? 0 : this.sourceline.hashCode());
        result = prime * result + ((this.seqno == null) ? 0 : this.seqno.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.setting == null) ? 0 : this.setting.hashCode());
        result = prime * result + ((this.applied == null) ? 0 : this.applied.hashCode());
        result = prime * result + ((this.error == null) ? 0 : this.error.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgShowAllFileSettings (");

        sb.append(sourcefile);
        sb.append(", ").append(sourceline);
        sb.append(", ").append(seqno);
        sb.append(", ").append(name);
        sb.append(", ").append(setting);
        sb.append(", ").append(applied);
        sb.append(", ").append(error);

        sb.append(")");
        return sb.toString();
    }
}
