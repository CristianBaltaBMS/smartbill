/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;

import org.jooq.Record;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbToRecordset implements Serializable {

    private static final long serialVersionUID = 1L;

    private Record jsonbToRecordset;

    public JsonbToRecordset() {}

    public JsonbToRecordset(JsonbToRecordset value) {
        this.jsonbToRecordset = value.jsonbToRecordset;
    }

    public JsonbToRecordset(
        Record jsonbToRecordset
    ) {
        this.jsonbToRecordset = jsonbToRecordset;
    }

    /**
     * Getter for <code>pg_catalog.jsonb_to_recordset.jsonb_to_recordset</code>.
     */
    public Record getJsonbToRecordset() {
        return this.jsonbToRecordset;
    }

    /**
     * Setter for <code>pg_catalog.jsonb_to_recordset.jsonb_to_recordset</code>.
     */
    public void setJsonbToRecordset(Record jsonbToRecordset) {
        this.jsonbToRecordset = jsonbToRecordset;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final JsonbToRecordset other = (JsonbToRecordset) obj;
        if (this.jsonbToRecordset == null) {
            if (other.jsonbToRecordset != null)
                return false;
        }
        else if (!this.jsonbToRecordset.equals(other.jsonbToRecordset))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.jsonbToRecordset == null) ? 0 : this.jsonbToRecordset.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JsonbToRecordset (");

        sb.append(jsonbToRecordset);

        sb.append(")");
        return sb.toString();
    }
}
