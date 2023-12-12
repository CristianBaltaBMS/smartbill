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
public class PgStats implements Serializable {

    private static final long serialVersionUID = 1L;

    private String schemaname;
    private String tablename;
    private String attname;
    private Boolean inherited;
    private Float nullFrac;
    private Integer avgWidth;
    private Float nDistinct;
    private Object[] mostCommonVals;
    private Float[] mostCommonFreqs;
    private Object[] histogramBounds;
    private Float correlation;
    private Object[] mostCommonElems;
    private Float[] mostCommonElemFreqs;
    private Float[] elemCountHistogram;

    public PgStats() {}

    public PgStats(PgStats value) {
        this.schemaname = value.schemaname;
        this.tablename = value.tablename;
        this.attname = value.attname;
        this.inherited = value.inherited;
        this.nullFrac = value.nullFrac;
        this.avgWidth = value.avgWidth;
        this.nDistinct = value.nDistinct;
        this.mostCommonVals = value.mostCommonVals;
        this.mostCommonFreqs = value.mostCommonFreqs;
        this.histogramBounds = value.histogramBounds;
        this.correlation = value.correlation;
        this.mostCommonElems = value.mostCommonElems;
        this.mostCommonElemFreqs = value.mostCommonElemFreqs;
        this.elemCountHistogram = value.elemCountHistogram;
    }

    public PgStats(
        String schemaname,
        String tablename,
        String attname,
        Boolean inherited,
        Float nullFrac,
        Integer avgWidth,
        Float nDistinct,
        Object[] mostCommonVals,
        Float[] mostCommonFreqs,
        Object[] histogramBounds,
        Float correlation,
        Object[] mostCommonElems,
        Float[] mostCommonElemFreqs,
        Float[] elemCountHistogram
    ) {
        this.schemaname = schemaname;
        this.tablename = tablename;
        this.attname = attname;
        this.inherited = inherited;
        this.nullFrac = nullFrac;
        this.avgWidth = avgWidth;
        this.nDistinct = nDistinct;
        this.mostCommonVals = mostCommonVals;
        this.mostCommonFreqs = mostCommonFreqs;
        this.histogramBounds = histogramBounds;
        this.correlation = correlation;
        this.mostCommonElems = mostCommonElems;
        this.mostCommonElemFreqs = mostCommonElemFreqs;
        this.elemCountHistogram = elemCountHistogram;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.schemaname</code>.
     */
    public String getSchemaname() {
        return this.schemaname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.schemaname</code>.
     */
    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.tablename</code>.
     */
    public String getTablename() {
        return this.tablename;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.tablename</code>.
     */
    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.attname</code>.
     */
    public String getAttname() {
        return this.attname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.attname</code>.
     */
    public void setAttname(String attname) {
        this.attname = attname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.inherited</code>.
     */
    public Boolean getInherited() {
        return this.inherited;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.inherited</code>.
     */
    public void setInherited(Boolean inherited) {
        this.inherited = inherited;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.null_frac</code>.
     */
    public Float getNullFrac() {
        return this.nullFrac;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.null_frac</code>.
     */
    public void setNullFrac(Float nullFrac) {
        this.nullFrac = nullFrac;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.avg_width</code>.
     */
    public Integer getAvgWidth() {
        return this.avgWidth;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.avg_width</code>.
     */
    public void setAvgWidth(Integer avgWidth) {
        this.avgWidth = avgWidth;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.n_distinct</code>.
     */
    public Float getNDistinct() {
        return this.nDistinct;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.n_distinct</code>.
     */
    public void setNDistinct(Float nDistinct) {
        this.nDistinct = nDistinct;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.most_common_vals</code>.
     */
    public Object[] getMostCommonVals() {
        return this.mostCommonVals;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.most_common_vals</code>.
     */
    public void setMostCommonVals(Object[] mostCommonVals) {
        this.mostCommonVals = mostCommonVals;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.most_common_freqs</code>.
     */
    public Float[] getMostCommonFreqs() {
        return this.mostCommonFreqs;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.most_common_freqs</code>.
     */
    public void setMostCommonFreqs(Float[] mostCommonFreqs) {
        this.mostCommonFreqs = mostCommonFreqs;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.histogram_bounds</code>.
     */
    public Object[] getHistogramBounds() {
        return this.histogramBounds;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.histogram_bounds</code>.
     */
    public void setHistogramBounds(Object[] histogramBounds) {
        this.histogramBounds = histogramBounds;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.correlation</code>.
     */
    public Float getCorrelation() {
        return this.correlation;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.correlation</code>.
     */
    public void setCorrelation(Float correlation) {
        this.correlation = correlation;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.most_common_elems</code>.
     */
    public Object[] getMostCommonElems() {
        return this.mostCommonElems;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.most_common_elems</code>.
     */
    public void setMostCommonElems(Object[] mostCommonElems) {
        this.mostCommonElems = mostCommonElems;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.most_common_elem_freqs</code>.
     */
    public Float[] getMostCommonElemFreqs() {
        return this.mostCommonElemFreqs;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.most_common_elem_freqs</code>.
     */
    public void setMostCommonElemFreqs(Float[] mostCommonElemFreqs) {
        this.mostCommonElemFreqs = mostCommonElemFreqs;
    }

    /**
     * Getter for <code>pg_catalog.pg_stats.elem_count_histogram</code>.
     */
    public Float[] getElemCountHistogram() {
        return this.elemCountHistogram;
    }

    /**
     * Setter for <code>pg_catalog.pg_stats.elem_count_histogram</code>.
     */
    public void setElemCountHistogram(Float[] elemCountHistogram) {
        this.elemCountHistogram = elemCountHistogram;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStats other = (PgStats) obj;
        if (this.schemaname == null) {
            if (other.schemaname != null)
                return false;
        }
        else if (!this.schemaname.equals(other.schemaname))
            return false;
        if (this.tablename == null) {
            if (other.tablename != null)
                return false;
        }
        else if (!this.tablename.equals(other.tablename))
            return false;
        if (this.attname == null) {
            if (other.attname != null)
                return false;
        }
        else if (!this.attname.equals(other.attname))
            return false;
        if (this.inherited == null) {
            if (other.inherited != null)
                return false;
        }
        else if (!this.inherited.equals(other.inherited))
            return false;
        if (this.nullFrac == null) {
            if (other.nullFrac != null)
                return false;
        }
        else if (!this.nullFrac.equals(other.nullFrac))
            return false;
        if (this.avgWidth == null) {
            if (other.avgWidth != null)
                return false;
        }
        else if (!this.avgWidth.equals(other.avgWidth))
            return false;
        if (this.nDistinct == null) {
            if (other.nDistinct != null)
                return false;
        }
        else if (!this.nDistinct.equals(other.nDistinct))
            return false;
        if (this.mostCommonVals == null) {
            if (other.mostCommonVals != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.mostCommonVals, other.mostCommonVals))
            return false;
        if (this.mostCommonFreqs == null) {
            if (other.mostCommonFreqs != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.mostCommonFreqs, other.mostCommonFreqs))
            return false;
        if (this.histogramBounds == null) {
            if (other.histogramBounds != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.histogramBounds, other.histogramBounds))
            return false;
        if (this.correlation == null) {
            if (other.correlation != null)
                return false;
        }
        else if (!this.correlation.equals(other.correlation))
            return false;
        if (this.mostCommonElems == null) {
            if (other.mostCommonElems != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.mostCommonElems, other.mostCommonElems))
            return false;
        if (this.mostCommonElemFreqs == null) {
            if (other.mostCommonElemFreqs != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.mostCommonElemFreqs, other.mostCommonElemFreqs))
            return false;
        if (this.elemCountHistogram == null) {
            if (other.elemCountHistogram != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.elemCountHistogram, other.elemCountHistogram))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.schemaname == null) ? 0 : this.schemaname.hashCode());
        result = prime * result + ((this.tablename == null) ? 0 : this.tablename.hashCode());
        result = prime * result + ((this.attname == null) ? 0 : this.attname.hashCode());
        result = prime * result + ((this.inherited == null) ? 0 : this.inherited.hashCode());
        result = prime * result + ((this.nullFrac == null) ? 0 : this.nullFrac.hashCode());
        result = prime * result + ((this.avgWidth == null) ? 0 : this.avgWidth.hashCode());
        result = prime * result + ((this.nDistinct == null) ? 0 : this.nDistinct.hashCode());
        result = prime * result + ((this.mostCommonVals == null) ? 0 : Arrays.deepHashCode(this.mostCommonVals));
        result = prime * result + ((this.mostCommonFreqs == null) ? 0 : Arrays.deepHashCode(this.mostCommonFreqs));
        result = prime * result + ((this.histogramBounds == null) ? 0 : Arrays.deepHashCode(this.histogramBounds));
        result = prime * result + ((this.correlation == null) ? 0 : this.correlation.hashCode());
        result = prime * result + ((this.mostCommonElems == null) ? 0 : Arrays.deepHashCode(this.mostCommonElems));
        result = prime * result + ((this.mostCommonElemFreqs == null) ? 0 : Arrays.deepHashCode(this.mostCommonElemFreqs));
        result = prime * result + ((this.elemCountHistogram == null) ? 0 : Arrays.deepHashCode(this.elemCountHistogram));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStats (");

        sb.append(schemaname);
        sb.append(", ").append(tablename);
        sb.append(", ").append(attname);
        sb.append(", ").append(inherited);
        sb.append(", ").append(nullFrac);
        sb.append(", ").append(avgWidth);
        sb.append(", ").append(nDistinct);
        sb.append(", ").append(Arrays.deepToString(mostCommonVals));
        sb.append(", ").append(Arrays.deepToString(mostCommonFreqs));
        sb.append(", ").append(Arrays.deepToString(histogramBounds));
        sb.append(", ").append(correlation);
        sb.append(", ").append(Arrays.deepToString(mostCommonElems));
        sb.append(", ").append(Arrays.deepToString(mostCommonElemFreqs));
        sb.append(", ").append(Arrays.deepToString(elemCountHistogram));

        sb.append(")");
        return sb.toString();
    }
}
