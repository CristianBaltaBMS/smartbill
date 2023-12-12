/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Collations implements Serializable {

    private static final long serialVersionUID = 1L;

    private String collationCatalog;
    private String collationSchema;
    private String collationName;
    private String padAttribute;

    public Collations() {}

    public Collations(Collations value) {
        this.collationCatalog = value.collationCatalog;
        this.collationSchema = value.collationSchema;
        this.collationName = value.collationName;
        this.padAttribute = value.padAttribute;
    }

    public Collations(
        String collationCatalog,
        String collationSchema,
        String collationName,
        String padAttribute
    ) {
        this.collationCatalog = collationCatalog;
        this.collationSchema = collationSchema;
        this.collationName = collationName;
        this.padAttribute = padAttribute;
    }

    /**
     * Getter for <code>information_schema.collations.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return this.collationCatalog;
    }

    /**
     * Setter for <code>information_schema.collations.collation_catalog</code>.
     */
    public void setCollationCatalog(String collationCatalog) {
        this.collationCatalog = collationCatalog;
    }

    /**
     * Getter for <code>information_schema.collations.collation_schema</code>.
     */
    public String getCollationSchema() {
        return this.collationSchema;
    }

    /**
     * Setter for <code>information_schema.collations.collation_schema</code>.
     */
    public void setCollationSchema(String collationSchema) {
        this.collationSchema = collationSchema;
    }

    /**
     * Getter for <code>information_schema.collations.collation_name</code>.
     */
    public String getCollationName() {
        return this.collationName;
    }

    /**
     * Setter for <code>information_schema.collations.collation_name</code>.
     */
    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    /**
     * Getter for <code>information_schema.collations.pad_attribute</code>.
     */
    public String getPadAttribute() {
        return this.padAttribute;
    }

    /**
     * Setter for <code>information_schema.collations.pad_attribute</code>.
     */
    public void setPadAttribute(String padAttribute) {
        this.padAttribute = padAttribute;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Collations other = (Collations) obj;
        if (this.collationCatalog == null) {
            if (other.collationCatalog != null)
                return false;
        }
        else if (!this.collationCatalog.equals(other.collationCatalog))
            return false;
        if (this.collationSchema == null) {
            if (other.collationSchema != null)
                return false;
        }
        else if (!this.collationSchema.equals(other.collationSchema))
            return false;
        if (this.collationName == null) {
            if (other.collationName != null)
                return false;
        }
        else if (!this.collationName.equals(other.collationName))
            return false;
        if (this.padAttribute == null) {
            if (other.padAttribute != null)
                return false;
        }
        else if (!this.padAttribute.equals(other.padAttribute))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.collationCatalog == null) ? 0 : this.collationCatalog.hashCode());
        result = prime * result + ((this.collationSchema == null) ? 0 : this.collationSchema.hashCode());
        result = prime * result + ((this.collationName == null) ? 0 : this.collationName.hashCode());
        result = prime * result + ((this.padAttribute == null) ? 0 : this.padAttribute.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Collations (");

        sb.append(collationCatalog);
        sb.append(", ").append(collationSchema);
        sb.append(", ").append(collationName);
        sb.append(", ").append(padAttribute);

        sb.append(")");
        return sb.toString();
    }
}
