/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StringToTable implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stringToTable;

    public StringToTable() {}

    public StringToTable(StringToTable value) {
        this.stringToTable = value.stringToTable;
    }

    public StringToTable(
        String stringToTable
    ) {
        this.stringToTable = stringToTable;
    }

    /**
     * Getter for <code>pg_catalog.string_to_table.string_to_table</code>.
     */
    public String getStringToTable() {
        return this.stringToTable;
    }

    /**
     * Setter for <code>pg_catalog.string_to_table.string_to_table</code>.
     */
    public void setStringToTable(String stringToTable) {
        this.stringToTable = stringToTable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final StringToTable other = (StringToTable) obj;
        if (this.stringToTable == null) {
            if (other.stringToTable != null)
                return false;
        }
        else if (!this.stringToTable.equals(other.stringToTable))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.stringToTable == null) ? 0 : this.stringToTable.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StringToTable (");

        sb.append(stringToTable);

        sb.append(")");
        return sb.toString();
    }
}
