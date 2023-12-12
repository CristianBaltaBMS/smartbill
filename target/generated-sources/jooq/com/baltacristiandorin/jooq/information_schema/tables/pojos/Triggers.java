/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Triggers implements Serializable {

    private static final long serialVersionUID = 1L;

    private String triggerCatalog;
    private String triggerSchema;
    private String triggerName;
    private String eventManipulation;
    private String eventObjectCatalog;
    private String eventObjectSchema;
    private String eventObjectTable;
    private Integer actionOrder;
    private String actionCondition;
    private String actionStatement;
    private String actionOrientation;
    private String actionTiming;
    private String actionReferenceOldTable;
    private String actionReferenceNewTable;
    private String actionReferenceOldRow;
    private String actionReferenceNewRow;
    private OffsetDateTime created;

    public Triggers() {}

    public Triggers(Triggers value) {
        this.triggerCatalog = value.triggerCatalog;
        this.triggerSchema = value.triggerSchema;
        this.triggerName = value.triggerName;
        this.eventManipulation = value.eventManipulation;
        this.eventObjectCatalog = value.eventObjectCatalog;
        this.eventObjectSchema = value.eventObjectSchema;
        this.eventObjectTable = value.eventObjectTable;
        this.actionOrder = value.actionOrder;
        this.actionCondition = value.actionCondition;
        this.actionStatement = value.actionStatement;
        this.actionOrientation = value.actionOrientation;
        this.actionTiming = value.actionTiming;
        this.actionReferenceOldTable = value.actionReferenceOldTable;
        this.actionReferenceNewTable = value.actionReferenceNewTable;
        this.actionReferenceOldRow = value.actionReferenceOldRow;
        this.actionReferenceNewRow = value.actionReferenceNewRow;
        this.created = value.created;
    }

    public Triggers(
        String triggerCatalog,
        String triggerSchema,
        String triggerName,
        String eventManipulation,
        String eventObjectCatalog,
        String eventObjectSchema,
        String eventObjectTable,
        Integer actionOrder,
        String actionCondition,
        String actionStatement,
        String actionOrientation,
        String actionTiming,
        String actionReferenceOldTable,
        String actionReferenceNewTable,
        String actionReferenceOldRow,
        String actionReferenceNewRow,
        OffsetDateTime created
    ) {
        this.triggerCatalog = triggerCatalog;
        this.triggerSchema = triggerSchema;
        this.triggerName = triggerName;
        this.eventManipulation = eventManipulation;
        this.eventObjectCatalog = eventObjectCatalog;
        this.eventObjectSchema = eventObjectSchema;
        this.eventObjectTable = eventObjectTable;
        this.actionOrder = actionOrder;
        this.actionCondition = actionCondition;
        this.actionStatement = actionStatement;
        this.actionOrientation = actionOrientation;
        this.actionTiming = actionTiming;
        this.actionReferenceOldTable = actionReferenceOldTable;
        this.actionReferenceNewTable = actionReferenceNewTable;
        this.actionReferenceOldRow = actionReferenceOldRow;
        this.actionReferenceNewRow = actionReferenceNewRow;
        this.created = created;
    }

    /**
     * Getter for <code>information_schema.triggers.trigger_catalog</code>.
     */
    public String getTriggerCatalog() {
        return this.triggerCatalog;
    }

    /**
     * Setter for <code>information_schema.triggers.trigger_catalog</code>.
     */
    public void setTriggerCatalog(String triggerCatalog) {
        this.triggerCatalog = triggerCatalog;
    }

    /**
     * Getter for <code>information_schema.triggers.trigger_schema</code>.
     */
    public String getTriggerSchema() {
        return this.triggerSchema;
    }

    /**
     * Setter for <code>information_schema.triggers.trigger_schema</code>.
     */
    public void setTriggerSchema(String triggerSchema) {
        this.triggerSchema = triggerSchema;
    }

    /**
     * Getter for <code>information_schema.triggers.trigger_name</code>.
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * Setter for <code>information_schema.triggers.trigger_name</code>.
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * Getter for <code>information_schema.triggers.event_manipulation</code>.
     */
    public String getEventManipulation() {
        return this.eventManipulation;
    }

    /**
     * Setter for <code>information_schema.triggers.event_manipulation</code>.
     */
    public void setEventManipulation(String eventManipulation) {
        this.eventManipulation = eventManipulation;
    }

    /**
     * Getter for <code>information_schema.triggers.event_object_catalog</code>.
     */
    public String getEventObjectCatalog() {
        return this.eventObjectCatalog;
    }

    /**
     * Setter for <code>information_schema.triggers.event_object_catalog</code>.
     */
    public void setEventObjectCatalog(String eventObjectCatalog) {
        this.eventObjectCatalog = eventObjectCatalog;
    }

    /**
     * Getter for <code>information_schema.triggers.event_object_schema</code>.
     */
    public String getEventObjectSchema() {
        return this.eventObjectSchema;
    }

    /**
     * Setter for <code>information_schema.triggers.event_object_schema</code>.
     */
    public void setEventObjectSchema(String eventObjectSchema) {
        this.eventObjectSchema = eventObjectSchema;
    }

    /**
     * Getter for <code>information_schema.triggers.event_object_table</code>.
     */
    public String getEventObjectTable() {
        return this.eventObjectTable;
    }

    /**
     * Setter for <code>information_schema.triggers.event_object_table</code>.
     */
    public void setEventObjectTable(String eventObjectTable) {
        this.eventObjectTable = eventObjectTable;
    }

    /**
     * Getter for <code>information_schema.triggers.action_order</code>.
     */
    public Integer getActionOrder() {
        return this.actionOrder;
    }

    /**
     * Setter for <code>information_schema.triggers.action_order</code>.
     */
    public void setActionOrder(Integer actionOrder) {
        this.actionOrder = actionOrder;
    }

    /**
     * Getter for <code>information_schema.triggers.action_condition</code>.
     */
    public String getActionCondition() {
        return this.actionCondition;
    }

    /**
     * Setter for <code>information_schema.triggers.action_condition</code>.
     */
    public void setActionCondition(String actionCondition) {
        this.actionCondition = actionCondition;
    }

    /**
     * Getter for <code>information_schema.triggers.action_statement</code>.
     */
    public String getActionStatement() {
        return this.actionStatement;
    }

    /**
     * Setter for <code>information_schema.triggers.action_statement</code>.
     */
    public void setActionStatement(String actionStatement) {
        this.actionStatement = actionStatement;
    }

    /**
     * Getter for <code>information_schema.triggers.action_orientation</code>.
     */
    public String getActionOrientation() {
        return this.actionOrientation;
    }

    /**
     * Setter for <code>information_schema.triggers.action_orientation</code>.
     */
    public void setActionOrientation(String actionOrientation) {
        this.actionOrientation = actionOrientation;
    }

    /**
     * Getter for <code>information_schema.triggers.action_timing</code>.
     */
    public String getActionTiming() {
        return this.actionTiming;
    }

    /**
     * Setter for <code>information_schema.triggers.action_timing</code>.
     */
    public void setActionTiming(String actionTiming) {
        this.actionTiming = actionTiming;
    }

    /**
     * Getter for
     * <code>information_schema.triggers.action_reference_old_table</code>.
     */
    public String getActionReferenceOldTable() {
        return this.actionReferenceOldTable;
    }

    /**
     * Setter for
     * <code>information_schema.triggers.action_reference_old_table</code>.
     */
    public void setActionReferenceOldTable(String actionReferenceOldTable) {
        this.actionReferenceOldTable = actionReferenceOldTable;
    }

    /**
     * Getter for
     * <code>information_schema.triggers.action_reference_new_table</code>.
     */
    public String getActionReferenceNewTable() {
        return this.actionReferenceNewTable;
    }

    /**
     * Setter for
     * <code>information_schema.triggers.action_reference_new_table</code>.
     */
    public void setActionReferenceNewTable(String actionReferenceNewTable) {
        this.actionReferenceNewTable = actionReferenceNewTable;
    }

    /**
     * Getter for
     * <code>information_schema.triggers.action_reference_old_row</code>.
     */
    public String getActionReferenceOldRow() {
        return this.actionReferenceOldRow;
    }

    /**
     * Setter for
     * <code>information_schema.triggers.action_reference_old_row</code>.
     */
    public void setActionReferenceOldRow(String actionReferenceOldRow) {
        this.actionReferenceOldRow = actionReferenceOldRow;
    }

    /**
     * Getter for
     * <code>information_schema.triggers.action_reference_new_row</code>.
     */
    public String getActionReferenceNewRow() {
        return this.actionReferenceNewRow;
    }

    /**
     * Setter for
     * <code>information_schema.triggers.action_reference_new_row</code>.
     */
    public void setActionReferenceNewRow(String actionReferenceNewRow) {
        this.actionReferenceNewRow = actionReferenceNewRow;
    }

    /**
     * Getter for <code>information_schema.triggers.created</code>.
     */
    public OffsetDateTime getCreated() {
        return this.created;
    }

    /**
     * Setter for <code>information_schema.triggers.created</code>.
     */
    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Triggers other = (Triggers) obj;
        if (this.triggerCatalog == null) {
            if (other.triggerCatalog != null)
                return false;
        }
        else if (!this.triggerCatalog.equals(other.triggerCatalog))
            return false;
        if (this.triggerSchema == null) {
            if (other.triggerSchema != null)
                return false;
        }
        else if (!this.triggerSchema.equals(other.triggerSchema))
            return false;
        if (this.triggerName == null) {
            if (other.triggerName != null)
                return false;
        }
        else if (!this.triggerName.equals(other.triggerName))
            return false;
        if (this.eventManipulation == null) {
            if (other.eventManipulation != null)
                return false;
        }
        else if (!this.eventManipulation.equals(other.eventManipulation))
            return false;
        if (this.eventObjectCatalog == null) {
            if (other.eventObjectCatalog != null)
                return false;
        }
        else if (!this.eventObjectCatalog.equals(other.eventObjectCatalog))
            return false;
        if (this.eventObjectSchema == null) {
            if (other.eventObjectSchema != null)
                return false;
        }
        else if (!this.eventObjectSchema.equals(other.eventObjectSchema))
            return false;
        if (this.eventObjectTable == null) {
            if (other.eventObjectTable != null)
                return false;
        }
        else if (!this.eventObjectTable.equals(other.eventObjectTable))
            return false;
        if (this.actionOrder == null) {
            if (other.actionOrder != null)
                return false;
        }
        else if (!this.actionOrder.equals(other.actionOrder))
            return false;
        if (this.actionCondition == null) {
            if (other.actionCondition != null)
                return false;
        }
        else if (!this.actionCondition.equals(other.actionCondition))
            return false;
        if (this.actionStatement == null) {
            if (other.actionStatement != null)
                return false;
        }
        else if (!this.actionStatement.equals(other.actionStatement))
            return false;
        if (this.actionOrientation == null) {
            if (other.actionOrientation != null)
                return false;
        }
        else if (!this.actionOrientation.equals(other.actionOrientation))
            return false;
        if (this.actionTiming == null) {
            if (other.actionTiming != null)
                return false;
        }
        else if (!this.actionTiming.equals(other.actionTiming))
            return false;
        if (this.actionReferenceOldTable == null) {
            if (other.actionReferenceOldTable != null)
                return false;
        }
        else if (!this.actionReferenceOldTable.equals(other.actionReferenceOldTable))
            return false;
        if (this.actionReferenceNewTable == null) {
            if (other.actionReferenceNewTable != null)
                return false;
        }
        else if (!this.actionReferenceNewTable.equals(other.actionReferenceNewTable))
            return false;
        if (this.actionReferenceOldRow == null) {
            if (other.actionReferenceOldRow != null)
                return false;
        }
        else if (!this.actionReferenceOldRow.equals(other.actionReferenceOldRow))
            return false;
        if (this.actionReferenceNewRow == null) {
            if (other.actionReferenceNewRow != null)
                return false;
        }
        else if (!this.actionReferenceNewRow.equals(other.actionReferenceNewRow))
            return false;
        if (this.created == null) {
            if (other.created != null)
                return false;
        }
        else if (!this.created.equals(other.created))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.triggerCatalog == null) ? 0 : this.triggerCatalog.hashCode());
        result = prime * result + ((this.triggerSchema == null) ? 0 : this.triggerSchema.hashCode());
        result = prime * result + ((this.triggerName == null) ? 0 : this.triggerName.hashCode());
        result = prime * result + ((this.eventManipulation == null) ? 0 : this.eventManipulation.hashCode());
        result = prime * result + ((this.eventObjectCatalog == null) ? 0 : this.eventObjectCatalog.hashCode());
        result = prime * result + ((this.eventObjectSchema == null) ? 0 : this.eventObjectSchema.hashCode());
        result = prime * result + ((this.eventObjectTable == null) ? 0 : this.eventObjectTable.hashCode());
        result = prime * result + ((this.actionOrder == null) ? 0 : this.actionOrder.hashCode());
        result = prime * result + ((this.actionCondition == null) ? 0 : this.actionCondition.hashCode());
        result = prime * result + ((this.actionStatement == null) ? 0 : this.actionStatement.hashCode());
        result = prime * result + ((this.actionOrientation == null) ? 0 : this.actionOrientation.hashCode());
        result = prime * result + ((this.actionTiming == null) ? 0 : this.actionTiming.hashCode());
        result = prime * result + ((this.actionReferenceOldTable == null) ? 0 : this.actionReferenceOldTable.hashCode());
        result = prime * result + ((this.actionReferenceNewTable == null) ? 0 : this.actionReferenceNewTable.hashCode());
        result = prime * result + ((this.actionReferenceOldRow == null) ? 0 : this.actionReferenceOldRow.hashCode());
        result = prime * result + ((this.actionReferenceNewRow == null) ? 0 : this.actionReferenceNewRow.hashCode());
        result = prime * result + ((this.created == null) ? 0 : this.created.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Triggers (");

        sb.append(triggerCatalog);
        sb.append(", ").append(triggerSchema);
        sb.append(", ").append(triggerName);
        sb.append(", ").append(eventManipulation);
        sb.append(", ").append(eventObjectCatalog);
        sb.append(", ").append(eventObjectSchema);
        sb.append(", ").append(eventObjectTable);
        sb.append(", ").append(actionOrder);
        sb.append(", ").append(actionCondition);
        sb.append(", ").append(actionStatement);
        sb.append(", ").append(actionOrientation);
        sb.append(", ").append(actionTiming);
        sb.append(", ").append(actionReferenceOldTable);
        sb.append(", ").append(actionReferenceNewTable);
        sb.append(", ").append(actionReferenceOldRow);
        sb.append(", ").append(actionReferenceNewRow);
        sb.append(", ").append(created);

        sb.append(")");
        return sb.toString();
    }
}