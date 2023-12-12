/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables;


import com.baltacristiandorin.jooq.pg_catalog.PgCatalog;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgStatGetSubscriptionRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatGetSubscription extends TableImpl<PgStatGetSubscriptionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_stat_get_subscription</code>
     */
    public static final PgStatGetSubscription PG_STAT_GET_SUBSCRIPTION = new PgStatGetSubscription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatGetSubscriptionRecord> getRecordType() {
        return PgStatGetSubscriptionRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_get_subscription.subid</code>.
     */
    public final TableField<PgStatGetSubscriptionRecord, Long> SUBID = createField(DSL.name("subid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_subscription.relid</code>.
     */
    public final TableField<PgStatGetSubscriptionRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_subscription.pid</code>.
     */
    public final TableField<PgStatGetSubscriptionRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatGetSubscriptionRecord, Object> RECEIVED_LSN = createField(DSL.name("received_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_get_subscription.last_msg_send_time</code>.
     */
    public final TableField<PgStatGetSubscriptionRecord, OffsetDateTime> LAST_MSG_SEND_TIME = createField(DSL.name("last_msg_send_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_get_subscription.last_msg_receipt_time</code>.
     */
    public final TableField<PgStatGetSubscriptionRecord, OffsetDateTime> LAST_MSG_RECEIPT_TIME = createField(DSL.name("last_msg_receipt_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatGetSubscriptionRecord, Object> LATEST_END_LSN = createField(DSL.name("latest_end_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_get_subscription.latest_end_time</code>.
     */
    public final TableField<PgStatGetSubscriptionRecord, OffsetDateTime> LATEST_END_TIME = createField(DSL.name("latest_end_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatGetSubscription(Name alias, Table<PgStatGetSubscriptionRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.BIGINT)
        });
    }

    private PgStatGetSubscription(Name alias, Table<PgStatGetSubscriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_subscription</code> table
     * reference
     */
    public PgStatGetSubscription(String alias) {
        this(DSL.name(alias), PG_STAT_GET_SUBSCRIPTION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_subscription</code> table
     * reference
     */
    public PgStatGetSubscription(Name alias) {
        this(alias, PG_STAT_GET_SUBSCRIPTION);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_get_subscription</code> table reference
     */
    public PgStatGetSubscription() {
        this(DSL.name("pg_stat_get_subscription"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatGetSubscription as(String alias) {
        return new PgStatGetSubscription(DSL.name(alias), this, parameters);
    }

    @Override
    public PgStatGetSubscription as(Name alias) {
        return new PgStatGetSubscription(alias, this, parameters);
    }

    @Override
    public PgStatGetSubscription as(Table<?> alias) {
        return new PgStatGetSubscription(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetSubscription rename(String name) {
        return new PgStatGetSubscription(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetSubscription rename(Name name) {
        return new PgStatGetSubscription(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetSubscription rename(Table<?> name) {
        return new PgStatGetSubscription(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Integer, Object, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgStatGetSubscription call(
          Long subid
    ) {
        PgStatGetSubscription result = new PgStatGetSubscription(DSL.name("pg_stat_get_subscription"), null, new Field[] {
            DSL.val(subid, SQLDataType.BIGINT)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgStatGetSubscription call(
          Field<Long> subid
    ) {
        PgStatGetSubscription result = new PgStatGetSubscription(DSL.name("pg_stat_get_subscription"), null, new Field[] {
            subid
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Long, ? super Long, ? super Integer, ? super Object, ? super OffsetDateTime, ? super OffsetDateTime, ? super Object, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super Long, ? super Integer, ? super Object, ? super OffsetDateTime, ? super OffsetDateTime, ? super Object, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
