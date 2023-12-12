/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sequenceCatalog;
    private String sequenceSchema;
    private String sequenceName;
    private String dataType;
    private Integer numericPrecision;
    private Integer numericPrecisionRadix;
    private Integer numericScale;
    private String startValue;
    private String minimumValue;
    private String maximumValue;
    private String increment;
    private String cycleOption;

    public Sequences() {}

    public Sequences(Sequences value) {
        this.sequenceCatalog = value.sequenceCatalog;
        this.sequenceSchema = value.sequenceSchema;
        this.sequenceName = value.sequenceName;
        this.dataType = value.dataType;
        this.numericPrecision = value.numericPrecision;
        this.numericPrecisionRadix = value.numericPrecisionRadix;
        this.numericScale = value.numericScale;
        this.startValue = value.startValue;
        this.minimumValue = value.minimumValue;
        this.maximumValue = value.maximumValue;
        this.increment = value.increment;
        this.cycleOption = value.cycleOption;
    }

    public Sequences(
        String sequenceCatalog,
        String sequenceSchema,
        String sequenceName,
        String dataType,
        Integer numericPrecision,
        Integer numericPrecisionRadix,
        Integer numericScale,
        String startValue,
        String minimumValue,
        String maximumValue,
        String increment,
        String cycleOption
    ) {
        this.sequenceCatalog = sequenceCatalog;
        this.sequenceSchema = sequenceSchema;
        this.sequenceName = sequenceName;
        this.dataType = dataType;
        this.numericPrecision = numericPrecision;
        this.numericPrecisionRadix = numericPrecisionRadix;
        this.numericScale = numericScale;
        this.startValue = startValue;
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.increment = increment;
        this.cycleOption = cycleOption;
    }

    /**
     * Getter for <code>information_schema.sequences.sequence_catalog</code>.
     */
    public String getSequenceCatalog() {
        return this.sequenceCatalog;
    }

    /**
     * Setter for <code>information_schema.sequences.sequence_catalog</code>.
     */
    public void setSequenceCatalog(String sequenceCatalog) {
        this.sequenceCatalog = sequenceCatalog;
    }

    /**
     * Getter for <code>information_schema.sequences.sequence_schema</code>.
     */
    public String getSequenceSchema() {
        return this.sequenceSchema;
    }

    /**
     * Setter for <code>information_schema.sequences.sequence_schema</code>.
     */
    public void setSequenceSchema(String sequenceSchema) {
        this.sequenceSchema = sequenceSchema;
    }

    /**
     * Getter for <code>information_schema.sequences.sequence_name</code>.
     */
    public String getSequenceName() {
        return this.sequenceName;
    }

    /**
     * Setter for <code>information_schema.sequences.sequence_name</code>.
     */
    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    /**
     * Getter for <code>information_schema.sequences.data_type</code>.
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * Setter for <code>information_schema.sequences.data_type</code>.
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Getter for <code>information_schema.sequences.numeric_precision</code>.
     */
    public Integer getNumericPrecision() {
        return this.numericPrecision;
    }

    /**
     * Setter for <code>information_schema.sequences.numeric_precision</code>.
     */
    public void setNumericPrecision(Integer numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    /**
     * Getter for
     * <code>information_schema.sequences.numeric_precision_radix</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return this.numericPrecisionRadix;
    }

    /**
     * Setter for
     * <code>information_schema.sequences.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(Integer numericPrecisionRadix) {
        this.numericPrecisionRadix = numericPrecisionRadix;
    }

    /**
     * Getter for <code>information_schema.sequences.numeric_scale</code>.
     */
    public Integer getNumericScale() {
        return this.numericScale;
    }

    /**
     * Setter for <code>information_schema.sequences.numeric_scale</code>.
     */
    public void setNumericScale(Integer numericScale) {
        this.numericScale = numericScale;
    }

    /**
     * Getter for <code>information_schema.sequences.start_value</code>.
     */
    public String getStartValue() {
        return this.startValue;
    }

    /**
     * Setter for <code>information_schema.sequences.start_value</code>.
     */
    public void setStartValue(String startValue) {
        this.startValue = startValue;
    }

    /**
     * Getter for <code>information_schema.sequences.minimum_value</code>.
     */
    public String getMinimumValue() {
        return this.minimumValue;
    }

    /**
     * Setter for <code>information_schema.sequences.minimum_value</code>.
     */
    public void setMinimumValue(String minimumValue) {
        this.minimumValue = minimumValue;
    }

    /**
     * Getter for <code>information_schema.sequences.maximum_value</code>.
     */
    public String getMaximumValue() {
        return this.maximumValue;
    }

    /**
     * Setter for <code>information_schema.sequences.maximum_value</code>.
     */
    public void setMaximumValue(String maximumValue) {
        this.maximumValue = maximumValue;
    }

    /**
     * Getter for <code>information_schema.sequences.increment</code>.
     */
    public String getIncrement() {
        return this.increment;
    }

    /**
     * Setter for <code>information_schema.sequences.increment</code>.
     */
    public void setIncrement(String increment) {
        this.increment = increment;
    }

    /**
     * Getter for <code>information_schema.sequences.cycle_option</code>.
     */
    public String getCycleOption() {
        return this.cycleOption;
    }

    /**
     * Setter for <code>information_schema.sequences.cycle_option</code>.
     */
    public void setCycleOption(String cycleOption) {
        this.cycleOption = cycleOption;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Sequences other = (Sequences) obj;
        if (this.sequenceCatalog == null) {
            if (other.sequenceCatalog != null)
                return false;
        }
        else if (!this.sequenceCatalog.equals(other.sequenceCatalog))
            return false;
        if (this.sequenceSchema == null) {
            if (other.sequenceSchema != null)
                return false;
        }
        else if (!this.sequenceSchema.equals(other.sequenceSchema))
            return false;
        if (this.sequenceName == null) {
            if (other.sequenceName != null)
                return false;
        }
        else if (!this.sequenceName.equals(other.sequenceName))
            return false;
        if (this.dataType == null) {
            if (other.dataType != null)
                return false;
        }
        else if (!this.dataType.equals(other.dataType))
            return false;
        if (this.numericPrecision == null) {
            if (other.numericPrecision != null)
                return false;
        }
        else if (!this.numericPrecision.equals(other.numericPrecision))
            return false;
        if (this.numericPrecisionRadix == null) {
            if (other.numericPrecisionRadix != null)
                return false;
        }
        else if (!this.numericPrecisionRadix.equals(other.numericPrecisionRadix))
            return false;
        if (this.numericScale == null) {
            if (other.numericScale != null)
                return false;
        }
        else if (!this.numericScale.equals(other.numericScale))
            return false;
        if (this.startValue == null) {
            if (other.startValue != null)
                return false;
        }
        else if (!this.startValue.equals(other.startValue))
            return false;
        if (this.minimumValue == null) {
            if (other.minimumValue != null)
                return false;
        }
        else if (!this.minimumValue.equals(other.minimumValue))
            return false;
        if (this.maximumValue == null) {
            if (other.maximumValue != null)
                return false;
        }
        else if (!this.maximumValue.equals(other.maximumValue))
            return false;
        if (this.increment == null) {
            if (other.increment != null)
                return false;
        }
        else if (!this.increment.equals(other.increment))
            return false;
        if (this.cycleOption == null) {
            if (other.cycleOption != null)
                return false;
        }
        else if (!this.cycleOption.equals(other.cycleOption))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.sequenceCatalog == null) ? 0 : this.sequenceCatalog.hashCode());
        result = prime * result + ((this.sequenceSchema == null) ? 0 : this.sequenceSchema.hashCode());
        result = prime * result + ((this.sequenceName == null) ? 0 : this.sequenceName.hashCode());
        result = prime * result + ((this.dataType == null) ? 0 : this.dataType.hashCode());
        result = prime * result + ((this.numericPrecision == null) ? 0 : this.numericPrecision.hashCode());
        result = prime * result + ((this.numericPrecisionRadix == null) ? 0 : this.numericPrecisionRadix.hashCode());
        result = prime * result + ((this.numericScale == null) ? 0 : this.numericScale.hashCode());
        result = prime * result + ((this.startValue == null) ? 0 : this.startValue.hashCode());
        result = prime * result + ((this.minimumValue == null) ? 0 : this.minimumValue.hashCode());
        result = prime * result + ((this.maximumValue == null) ? 0 : this.maximumValue.hashCode());
        result = prime * result + ((this.increment == null) ? 0 : this.increment.hashCode());
        result = prime * result + ((this.cycleOption == null) ? 0 : this.cycleOption.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Sequences (");

        sb.append(sequenceCatalog);
        sb.append(", ").append(sequenceSchema);
        sb.append(", ").append(sequenceName);
        sb.append(", ").append(dataType);
        sb.append(", ").append(numericPrecision);
        sb.append(", ").append(numericPrecisionRadix);
        sb.append(", ").append(numericScale);
        sb.append(", ").append(startValue);
        sb.append(", ").append(minimumValue);
        sb.append(", ").append(maximumValue);
        sb.append(", ").append(increment);
        sb.append(", ").append(cycleOption);

        sb.append(")");
        return sb.toString();
    }
}
