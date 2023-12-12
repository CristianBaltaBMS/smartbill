/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TsStat implements Serializable {

    private static final long serialVersionUID = 1L;

    private String word;
    private Integer ndoc;
    private Integer nentry;

    public TsStat() {}

    public TsStat(TsStat value) {
        this.word = value.word;
        this.ndoc = value.ndoc;
        this.nentry = value.nentry;
    }

    public TsStat(
        String word,
        Integer ndoc,
        Integer nentry
    ) {
        this.word = word;
        this.ndoc = ndoc;
        this.nentry = nentry;
    }

    /**
     * Getter for <code>pg_catalog.ts_stat.word</code>.
     */
    public String getWord() {
        return this.word;
    }

    /**
     * Setter for <code>pg_catalog.ts_stat.word</code>.
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * Getter for <code>pg_catalog.ts_stat.ndoc</code>.
     */
    public Integer getNdoc() {
        return this.ndoc;
    }

    /**
     * Setter for <code>pg_catalog.ts_stat.ndoc</code>.
     */
    public void setNdoc(Integer ndoc) {
        this.ndoc = ndoc;
    }

    /**
     * Getter for <code>pg_catalog.ts_stat.nentry</code>.
     */
    public Integer getNentry() {
        return this.nentry;
    }

    /**
     * Setter for <code>pg_catalog.ts_stat.nentry</code>.
     */
    public void setNentry(Integer nentry) {
        this.nentry = nentry;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TsStat other = (TsStat) obj;
        if (this.word == null) {
            if (other.word != null)
                return false;
        }
        else if (!this.word.equals(other.word))
            return false;
        if (this.ndoc == null) {
            if (other.ndoc != null)
                return false;
        }
        else if (!this.ndoc.equals(other.ndoc))
            return false;
        if (this.nentry == null) {
            if (other.nentry != null)
                return false;
        }
        else if (!this.nentry.equals(other.nentry))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.word == null) ? 0 : this.word.hashCode());
        result = prime * result + ((this.ndoc == null) ? 0 : this.ndoc.hashCode());
        result = prime * result + ((this.nentry == null) ? 0 : this.nentry.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TsStat (");

        sb.append(word);
        sb.append(", ").append(ndoc);
        sb.append(", ").append(nentry);

        sb.append(")");
        return sb.toString();
    }
}
