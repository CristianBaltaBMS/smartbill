/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables.records;


import com.baltacristiandorin.jooq.information_schema.tables.Triggers;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TriggersRecord extends TableRecordImpl<TriggersRecord> implements Record17<String, String, String, String, String, String, String, Integer, String, String, String, String, String, String, String, String, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.triggers.trigger_catalog</code>.
     */
    public void setTriggerCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.triggers.trigger_catalog</code>.
     */
    public String getTriggerCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.triggers.trigger_schema</code>.
     */
    public void setTriggerSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.triggers.trigger_schema</code>.
     */
    public String getTriggerSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.triggers.trigger_name</code>.
     */
    public void setTriggerName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.triggers.trigger_name</code>.
     */
    public String getTriggerName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.triggers.event_manipulation</code>.
     */
    public void setEventManipulation(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.triggers.event_manipulation</code>.
     */
    public String getEventManipulation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.triggers.event_object_catalog</code>.
     */
    public void setEventObjectCatalog(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.triggers.event_object_catalog</code>.
     */
    public String getEventObjectCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.triggers.event_object_schema</code>.
     */
    public void setEventObjectSchema(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.triggers.event_object_schema</code>.
     */
    public String getEventObjectSchema() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.triggers.event_object_table</code>.
     */
    public void setEventObjectTable(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.triggers.event_object_table</code>.
     */
    public String getEventObjectTable() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.triggers.action_order</code>.
     */
    public void setActionOrder(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.triggers.action_order</code>.
     */
    public Integer getActionOrder() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>information_schema.triggers.action_condition</code>.
     */
    public void setActionCondition(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.triggers.action_condition</code>.
     */
    public String getActionCondition() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.triggers.action_statement</code>.
     */
    public void setActionStatement(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.triggers.action_statement</code>.
     */
    public String getActionStatement() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.triggers.action_orientation</code>.
     */
    public void setActionOrientation(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.triggers.action_orientation</code>.
     */
    public String getActionOrientation() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.triggers.action_timing</code>.
     */
    public void setActionTiming(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.triggers.action_timing</code>.
     */
    public String getActionTiming() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>information_schema.triggers.action_reference_old_table</code>.
     */
    public void setActionReferenceOldTable(String value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>information_schema.triggers.action_reference_old_table</code>.
     */
    public String getActionReferenceOldTable() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>information_schema.triggers.action_reference_new_table</code>.
     */
    public void setActionReferenceNewTable(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>information_schema.triggers.action_reference_new_table</code>.
     */
    public String getActionReferenceNewTable() {
        return (String) get(13);
    }

    /**
     * Setter for
     * <code>information_schema.triggers.action_reference_old_row</code>.
     */
    public void setActionReferenceOldRow(String value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>information_schema.triggers.action_reference_old_row</code>.
     */
    public String getActionReferenceOldRow() {
        return (String) get(14);
    }

    /**
     * Setter for
     * <code>information_schema.triggers.action_reference_new_row</code>.
     */
    public void setActionReferenceNewRow(String value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>information_schema.triggers.action_reference_new_row</code>.
     */
    public String getActionReferenceNewRow() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.triggers.created</code>.
     */
    public void setCreated(OffsetDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.triggers.created</code>.
     */
    public OffsetDateTime getCreated() {
        return (OffsetDateTime) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, String, String, String, String, String, Integer, String, String, String, String, String, String, String, String, OffsetDateTime> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<String, String, String, String, String, String, String, Integer, String, String, String, String, String, String, String, String, OffsetDateTime> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Triggers.TRIGGERS.TRIGGER_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return Triggers.TRIGGERS.TRIGGER_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return Triggers.TRIGGERS.TRIGGER_NAME;
    }

    @Override
    public Field<String> field4() {
        return Triggers.TRIGGERS.EVENT_MANIPULATION;
    }

    @Override
    public Field<String> field5() {
        return Triggers.TRIGGERS.EVENT_OBJECT_CATALOG;
    }

    @Override
    public Field<String> field6() {
        return Triggers.TRIGGERS.EVENT_OBJECT_SCHEMA;
    }

    @Override
    public Field<String> field7() {
        return Triggers.TRIGGERS.EVENT_OBJECT_TABLE;
    }

    @Override
    public Field<Integer> field8() {
        return Triggers.TRIGGERS.ACTION_ORDER;
    }

    @Override
    public Field<String> field9() {
        return Triggers.TRIGGERS.ACTION_CONDITION;
    }

    @Override
    public Field<String> field10() {
        return Triggers.TRIGGERS.ACTION_STATEMENT;
    }

    @Override
    public Field<String> field11() {
        return Triggers.TRIGGERS.ACTION_ORIENTATION;
    }

    @Override
    public Field<String> field12() {
        return Triggers.TRIGGERS.ACTION_TIMING;
    }

    @Override
    public Field<String> field13() {
        return Triggers.TRIGGERS.ACTION_REFERENCE_OLD_TABLE;
    }

    @Override
    public Field<String> field14() {
        return Triggers.TRIGGERS.ACTION_REFERENCE_NEW_TABLE;
    }

    @Override
    public Field<String> field15() {
        return Triggers.TRIGGERS.ACTION_REFERENCE_OLD_ROW;
    }

    @Override
    public Field<String> field16() {
        return Triggers.TRIGGERS.ACTION_REFERENCE_NEW_ROW;
    }

    @Override
    public Field<OffsetDateTime> field17() {
        return Triggers.TRIGGERS.CREATED;
    }

    @Override
    public String component1() {
        return getTriggerCatalog();
    }

    @Override
    public String component2() {
        return getTriggerSchema();
    }

    @Override
    public String component3() {
        return getTriggerName();
    }

    @Override
    public String component4() {
        return getEventManipulation();
    }

    @Override
    public String component5() {
        return getEventObjectCatalog();
    }

    @Override
    public String component6() {
        return getEventObjectSchema();
    }

    @Override
    public String component7() {
        return getEventObjectTable();
    }

    @Override
    public Integer component8() {
        return getActionOrder();
    }

    @Override
    public String component9() {
        return getActionCondition();
    }

    @Override
    public String component10() {
        return getActionStatement();
    }

    @Override
    public String component11() {
        return getActionOrientation();
    }

    @Override
    public String component12() {
        return getActionTiming();
    }

    @Override
    public String component13() {
        return getActionReferenceOldTable();
    }

    @Override
    public String component14() {
        return getActionReferenceNewTable();
    }

    @Override
    public String component15() {
        return getActionReferenceOldRow();
    }

    @Override
    public String component16() {
        return getActionReferenceNewRow();
    }

    @Override
    public OffsetDateTime component17() {
        return getCreated();
    }

    @Override
    public String value1() {
        return getTriggerCatalog();
    }

    @Override
    public String value2() {
        return getTriggerSchema();
    }

    @Override
    public String value3() {
        return getTriggerName();
    }

    @Override
    public String value4() {
        return getEventManipulation();
    }

    @Override
    public String value5() {
        return getEventObjectCatalog();
    }

    @Override
    public String value6() {
        return getEventObjectSchema();
    }

    @Override
    public String value7() {
        return getEventObjectTable();
    }

    @Override
    public Integer value8() {
        return getActionOrder();
    }

    @Override
    public String value9() {
        return getActionCondition();
    }

    @Override
    public String value10() {
        return getActionStatement();
    }

    @Override
    public String value11() {
        return getActionOrientation();
    }

    @Override
    public String value12() {
        return getActionTiming();
    }

    @Override
    public String value13() {
        return getActionReferenceOldTable();
    }

    @Override
    public String value14() {
        return getActionReferenceNewTable();
    }

    @Override
    public String value15() {
        return getActionReferenceOldRow();
    }

    @Override
    public String value16() {
        return getActionReferenceNewRow();
    }

    @Override
    public OffsetDateTime value17() {
        return getCreated();
    }

    @Override
    public TriggersRecord value1(String value) {
        setTriggerCatalog(value);
        return this;
    }

    @Override
    public TriggersRecord value2(String value) {
        setTriggerSchema(value);
        return this;
    }

    @Override
    public TriggersRecord value3(String value) {
        setTriggerName(value);
        return this;
    }

    @Override
    public TriggersRecord value4(String value) {
        setEventManipulation(value);
        return this;
    }

    @Override
    public TriggersRecord value5(String value) {
        setEventObjectCatalog(value);
        return this;
    }

    @Override
    public TriggersRecord value6(String value) {
        setEventObjectSchema(value);
        return this;
    }

    @Override
    public TriggersRecord value7(String value) {
        setEventObjectTable(value);
        return this;
    }

    @Override
    public TriggersRecord value8(Integer value) {
        setActionOrder(value);
        return this;
    }

    @Override
    public TriggersRecord value9(String value) {
        setActionCondition(value);
        return this;
    }

    @Override
    public TriggersRecord value10(String value) {
        setActionStatement(value);
        return this;
    }

    @Override
    public TriggersRecord value11(String value) {
        setActionOrientation(value);
        return this;
    }

    @Override
    public TriggersRecord value12(String value) {
        setActionTiming(value);
        return this;
    }

    @Override
    public TriggersRecord value13(String value) {
        setActionReferenceOldTable(value);
        return this;
    }

    @Override
    public TriggersRecord value14(String value) {
        setActionReferenceNewTable(value);
        return this;
    }

    @Override
    public TriggersRecord value15(String value) {
        setActionReferenceOldRow(value);
        return this;
    }

    @Override
    public TriggersRecord value16(String value) {
        setActionReferenceNewRow(value);
        return this;
    }

    @Override
    public TriggersRecord value17(OffsetDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TriggersRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Integer value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, OffsetDateTime value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TriggersRecord
     */
    public TriggersRecord() {
        super(Triggers.TRIGGERS);
    }

    /**
     * Create a detached, initialised TriggersRecord
     */
    public TriggersRecord(String triggerCatalog, String triggerSchema, String triggerName, String eventManipulation, String eventObjectCatalog, String eventObjectSchema, String eventObjectTable, Integer actionOrder, String actionCondition, String actionStatement, String actionOrientation, String actionTiming, String actionReferenceOldTable, String actionReferenceNewTable, String actionReferenceOldRow, String actionReferenceNewRow, OffsetDateTime created) {
        super(Triggers.TRIGGERS);

        setTriggerCatalog(triggerCatalog);
        setTriggerSchema(triggerSchema);
        setTriggerName(triggerName);
        setEventManipulation(eventManipulation);
        setEventObjectCatalog(eventObjectCatalog);
        setEventObjectSchema(eventObjectSchema);
        setEventObjectTable(eventObjectTable);
        setActionOrder(actionOrder);
        setActionCondition(actionCondition);
        setActionStatement(actionStatement);
        setActionOrientation(actionOrientation);
        setActionTiming(actionTiming);
        setActionReferenceOldTable(actionReferenceOldTable);
        setActionReferenceNewTable(actionReferenceNewTable);
        setActionReferenceOldRow(actionReferenceOldRow);
        setActionReferenceNewRow(actionReferenceNewRow);
        setCreated(created);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TriggersRecord
     */
    public TriggersRecord(com.baltacristiandorin.jooq.information_schema.tables.pojos.Triggers value) {
        super(Triggers.TRIGGERS);

        if (value != null) {
            setTriggerCatalog(value.getTriggerCatalog());
            setTriggerSchema(value.getTriggerSchema());
            setTriggerName(value.getTriggerName());
            setEventManipulation(value.getEventManipulation());
            setEventObjectCatalog(value.getEventObjectCatalog());
            setEventObjectSchema(value.getEventObjectSchema());
            setEventObjectTable(value.getEventObjectTable());
            setActionOrder(value.getActionOrder());
            setActionCondition(value.getActionCondition());
            setActionStatement(value.getActionStatement());
            setActionOrientation(value.getActionOrientation());
            setActionTiming(value.getActionTiming());
            setActionReferenceOldTable(value.getActionReferenceOldTable());
            setActionReferenceNewTable(value.getActionReferenceNewTable());
            setActionReferenceOldRow(value.getActionReferenceOldRow());
            setActionReferenceNewRow(value.getActionReferenceNewRow());
            setCreated(value.getCreated());
            resetChangedOnNotNull();
        }
    }
}
