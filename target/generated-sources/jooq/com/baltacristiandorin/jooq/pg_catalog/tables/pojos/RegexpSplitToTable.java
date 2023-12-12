/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RegexpSplitToTable implements Serializable {

    private static final long serialVersionUID = 1L;

    private String regexpSplitToTable;

    public RegexpSplitToTable() {}

    public RegexpSplitToTable(RegexpSplitToTable value) {
        this.regexpSplitToTable = value.regexpSplitToTable;
    }

    public RegexpSplitToTable(
        String regexpSplitToTable
    ) {
        this.regexpSplitToTable = regexpSplitToTable;
    }

    /**
     * Getter for
     * <code>pg_catalog.regexp_split_to_table.regexp_split_to_table</code>.
     */
    public String getRegexpSplitToTable() {
        return this.regexpSplitToTable;
    }

    /**
     * Setter for
     * <code>pg_catalog.regexp_split_to_table.regexp_split_to_table</code>.
     */
    public void setRegexpSplitToTable(String regexpSplitToTable) {
        this.regexpSplitToTable = regexpSplitToTable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final RegexpSplitToTable other = (RegexpSplitToTable) obj;
        if (this.regexpSplitToTable == null) {
            if (other.regexpSplitToTable != null)
                return false;
        }
        else if (!this.regexpSplitToTable.equals(other.regexpSplitToTable))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.regexpSplitToTable == null) ? 0 : this.regexpSplitToTable.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RegexpSplitToTable (");

        sb.append(regexpSplitToTable);

        sb.append(")");
        return sb.toString();
    }
}
