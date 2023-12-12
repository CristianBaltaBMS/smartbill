/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema;


import com.baltacristiandorin.jooq.information_schema.routines._PgCharMaxLength;
import com.baltacristiandorin.jooq.information_schema.routines._PgCharOctetLength;
import com.baltacristiandorin.jooq.information_schema.routines._PgDatetimePrecision;
import com.baltacristiandorin.jooq.information_schema.routines._PgIndexPosition;
import com.baltacristiandorin.jooq.information_schema.routines._PgIntervalType;
import com.baltacristiandorin.jooq.information_schema.routines._PgNumericPrecision;
import com.baltacristiandorin.jooq.information_schema.routines._PgNumericPrecisionRadix;
import com.baltacristiandorin.jooq.information_schema.routines._PgNumericScale;
import com.baltacristiandorin.jooq.information_schema.routines._PgTruetypid;
import com.baltacristiandorin.jooq.information_schema.routines._PgTruetypmod;
import com.baltacristiandorin.jooq.information_schema.tables._PgExpandarray;
import com.baltacristiandorin.jooq.information_schema.tables.records._PgExpandarrayRecord;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgAttributeRecord;
import com.baltacristiandorin.jooq.pg_catalog.tables.records.PgTypeRecord;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;


/**
 * Convenience access to all stored procedures and functions in
 * information_schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * Call <code>information_schema._pg_char_max_length</code>
     */
    public static Integer _PgCharMaxLength(
          Configuration configuration
        , Long typid
        , Integer typmod
    ) {
        _PgCharMaxLength f = new _PgCharMaxLength();
        f.setTypid(typid);
        f.setTypmod(typmod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_char_max_length</code> as a field.
     */
    public static Field<Integer> _PgCharMaxLength(
          Long typid
        , Integer typmod
    ) {
        _PgCharMaxLength f = new _PgCharMaxLength();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_char_max_length</code> as a field.
     */
    public static Field<Integer> _PgCharMaxLength(
          Field<Long> typid
        , Field<Integer> typmod
    ) {
        _PgCharMaxLength f = new _PgCharMaxLength();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_char_octet_length</code>
     */
    public static Integer _PgCharOctetLength(
          Configuration configuration
        , Long typid
        , Integer typmod
    ) {
        _PgCharOctetLength f = new _PgCharOctetLength();
        f.setTypid(typid);
        f.setTypmod(typmod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_char_octet_length</code> as a field.
     */
    public static Field<Integer> _PgCharOctetLength(
          Long typid
        , Integer typmod
    ) {
        _PgCharOctetLength f = new _PgCharOctetLength();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_char_octet_length</code> as a field.
     */
    public static Field<Integer> _PgCharOctetLength(
          Field<Long> typid
        , Field<Integer> typmod
    ) {
        _PgCharOctetLength f = new _PgCharOctetLength();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_datetime_precision</code>
     */
    public static Integer _PgDatetimePrecision(
          Configuration configuration
        , Long typid
        , Integer typmod
    ) {
        _PgDatetimePrecision f = new _PgDatetimePrecision();
        f.setTypid(typid);
        f.setTypmod(typmod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_datetime_precision</code> as a field.
     */
    public static Field<Integer> _PgDatetimePrecision(
          Long typid
        , Integer typmod
    ) {
        _PgDatetimePrecision f = new _PgDatetimePrecision();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_datetime_precision</code> as a field.
     */
    public static Field<Integer> _PgDatetimePrecision(
          Field<Long> typid
        , Field<Integer> typmod
    ) {
        _PgDatetimePrecision f = new _PgDatetimePrecision();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_index_position</code>
     */
    public static Integer _PgIndexPosition(
          Configuration configuration
        , Long __1
        , Short __2
    ) {
        _PgIndexPosition f = new _PgIndexPosition();
        f.set__1(__1);
        f.set__2(__2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_index_position</code> as a field.
     */
    public static Field<Integer> _PgIndexPosition(
          Long __1
        , Short __2
    ) {
        _PgIndexPosition f = new _PgIndexPosition();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_index_position</code> as a field.
     */
    public static Field<Integer> _PgIndexPosition(
          Field<Long> __1
        , Field<Short> __2
    ) {
        _PgIndexPosition f = new _PgIndexPosition();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_interval_type</code>
     */
    public static String _PgIntervalType(
          Configuration configuration
        , Long typid
        , Integer mod
    ) {
        _PgIntervalType f = new _PgIntervalType();
        f.setTypid(typid);
        f.setMod(mod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_interval_type</code> as a field.
     */
    public static Field<String> _PgIntervalType(
          Long typid
        , Integer mod
    ) {
        _PgIntervalType f = new _PgIntervalType();
        f.setTypid(typid);
        f.setMod(mod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_interval_type</code> as a field.
     */
    public static Field<String> _PgIntervalType(
          Field<Long> typid
        , Field<Integer> mod
    ) {
        _PgIntervalType f = new _PgIntervalType();
        f.setTypid(typid);
        f.setMod(mod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_numeric_precision</code>
     */
    public static Integer _PgNumericPrecision(
          Configuration configuration
        , Long typid
        , Integer typmod
    ) {
        _PgNumericPrecision f = new _PgNumericPrecision();
        f.setTypid(typid);
        f.setTypmod(typmod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_numeric_precision</code> as a field.
     */
    public static Field<Integer> _PgNumericPrecision(
          Long typid
        , Integer typmod
    ) {
        _PgNumericPrecision f = new _PgNumericPrecision();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_numeric_precision</code> as a field.
     */
    public static Field<Integer> _PgNumericPrecision(
          Field<Long> typid
        , Field<Integer> typmod
    ) {
        _PgNumericPrecision f = new _PgNumericPrecision();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_numeric_precision_radix</code>
     */
    public static Integer _PgNumericPrecisionRadix(
          Configuration configuration
        , Long typid
        , Integer typmod
    ) {
        _PgNumericPrecisionRadix f = new _PgNumericPrecisionRadix();
        f.setTypid(typid);
        f.setTypmod(typmod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_numeric_precision_radix</code> as a
     * field.
     */
    public static Field<Integer> _PgNumericPrecisionRadix(
          Long typid
        , Integer typmod
    ) {
        _PgNumericPrecisionRadix f = new _PgNumericPrecisionRadix();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_numeric_precision_radix</code> as a
     * field.
     */
    public static Field<Integer> _PgNumericPrecisionRadix(
          Field<Long> typid
        , Field<Integer> typmod
    ) {
        _PgNumericPrecisionRadix f = new _PgNumericPrecisionRadix();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_numeric_scale</code>
     */
    public static Integer _PgNumericScale(
          Configuration configuration
        , Long typid
        , Integer typmod
    ) {
        _PgNumericScale f = new _PgNumericScale();
        f.setTypid(typid);
        f.setTypmod(typmod);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_numeric_scale</code> as a field.
     */
    public static Field<Integer> _PgNumericScale(
          Long typid
        , Integer typmod
    ) {
        _PgNumericScale f = new _PgNumericScale();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_numeric_scale</code> as a field.
     */
    public static Field<Integer> _PgNumericScale(
          Field<Long> typid
        , Field<Integer> typmod
    ) {
        _PgNumericScale f = new _PgNumericScale();
        f.setTypid(typid);
        f.setTypmod(typmod);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_truetypid</code>
     */
    public static Long _PgTruetypid(
          Configuration configuration
        , PgAttributeRecord __1
        , PgTypeRecord __2
    ) {
        _PgTruetypid f = new _PgTruetypid();
        f.set__1(__1);
        f.set__2(__2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_truetypid</code> as a field.
     */
    public static Field<Long> _PgTruetypid(
          PgAttributeRecord __1
        , PgTypeRecord __2
    ) {
        _PgTruetypid f = new _PgTruetypid();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_truetypid</code> as a field.
     */
    public static Field<Long> _PgTruetypid(
          Field<PgAttributeRecord> __1
        , Field<PgTypeRecord> __2
    ) {
        _PgTruetypid f = new _PgTruetypid();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_truetypmod</code>
     */
    public static Integer _PgTruetypmod(
          Configuration configuration
        , PgAttributeRecord __1
        , PgTypeRecord __2
    ) {
        _PgTruetypmod f = new _PgTruetypmod();
        f.set__1(__1);
        f.set__2(__2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>information_schema._pg_truetypmod</code> as a field.
     */
    public static Field<Integer> _PgTruetypmod(
          PgAttributeRecord __1
        , PgTypeRecord __2
    ) {
        _PgTruetypmod f = new _PgTruetypmod();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * Get <code>information_schema._pg_truetypmod</code> as a field.
     */
    public static Field<Integer> _PgTruetypmod(
          Field<PgAttributeRecord> __1
        , Field<PgTypeRecord> __2
    ) {
        _PgTruetypmod f = new _PgTruetypmod();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * Call <code>information_schema._pg_expandarray</code>.
     */
    public static Result<_PgExpandarrayRecord> _PgExpandarray(
          Configuration configuration
        , Object[] __1
    ) {
        return configuration.dsl().selectFrom(com.baltacristiandorin.jooq.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(
              __1
        )).fetch();
    }

    /**
     * Get <code>information_schema._pg_expandarray</code> as a table.
     */
    public static _PgExpandarray _PgExpandarray(
          Object[] __1
    ) {
        return com.baltacristiandorin.jooq.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(
            __1
        );
    }

    /**
     * Get <code>information_schema._pg_expandarray</code> as a table.
     */
    public static _PgExpandarray _PgExpandarray(
          Field<Object[]> __1
    ) {
        return com.baltacristiandorin.jooq.information_schema.tables._PgExpandarray._PG_EXPANDARRAY.call(
            __1
        );
    }
}
