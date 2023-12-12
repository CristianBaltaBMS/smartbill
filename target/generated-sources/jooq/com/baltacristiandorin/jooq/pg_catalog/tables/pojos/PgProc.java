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
public class PgProc implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String proname;
    private Long pronamespace;
    private Long proowner;
    private Long prolang;
    private Float procost;
    private Float prorows;
    private Long provariadic;
    private String prosupport;
    private String prokind;
    private Boolean prosecdef;
    private Boolean proleakproof;
    private Boolean proisstrict;
    private Boolean proretset;
    private String provolatile;
    private String proparallel;
    private Short pronargs;
    private Short pronargdefaults;
    private Long prorettype;
    private Object[] proargtypes;
    private Long[] proallargtypes;
    private String[] proargmodes;
    private String[] proargnames;
    private Object proargdefaults;
    private Long[] protrftypes;
    private String prosrc;
    private String probin;
    private Object prosqlbody;
    private String[] proconfig;
    private String[] proacl;

    public PgProc() {}

    public PgProc(PgProc value) {
        this.oid = value.oid;
        this.proname = value.proname;
        this.pronamespace = value.pronamespace;
        this.proowner = value.proowner;
        this.prolang = value.prolang;
        this.procost = value.procost;
        this.prorows = value.prorows;
        this.provariadic = value.provariadic;
        this.prosupport = value.prosupport;
        this.prokind = value.prokind;
        this.prosecdef = value.prosecdef;
        this.proleakproof = value.proleakproof;
        this.proisstrict = value.proisstrict;
        this.proretset = value.proretset;
        this.provolatile = value.provolatile;
        this.proparallel = value.proparallel;
        this.pronargs = value.pronargs;
        this.pronargdefaults = value.pronargdefaults;
        this.prorettype = value.prorettype;
        this.proargtypes = value.proargtypes;
        this.proallargtypes = value.proallargtypes;
        this.proargmodes = value.proargmodes;
        this.proargnames = value.proargnames;
        this.proargdefaults = value.proargdefaults;
        this.protrftypes = value.protrftypes;
        this.prosrc = value.prosrc;
        this.probin = value.probin;
        this.prosqlbody = value.prosqlbody;
        this.proconfig = value.proconfig;
        this.proacl = value.proacl;
    }

    public PgProc(
        Long oid,
        String proname,
        Long pronamespace,
        Long proowner,
        Long prolang,
        Float procost,
        Float prorows,
        Long provariadic,
        String prosupport,
        String prokind,
        Boolean prosecdef,
        Boolean proleakproof,
        Boolean proisstrict,
        Boolean proretset,
        String provolatile,
        String proparallel,
        Short pronargs,
        Short pronargdefaults,
        Long prorettype,
        Object[] proargtypes,
        Long[] proallargtypes,
        String[] proargmodes,
        String[] proargnames,
        Object proargdefaults,
        Long[] protrftypes,
        String prosrc,
        String probin,
        Object prosqlbody,
        String[] proconfig,
        String[] proacl
    ) {
        this.oid = oid;
        this.proname = proname;
        this.pronamespace = pronamespace;
        this.proowner = proowner;
        this.prolang = prolang;
        this.procost = procost;
        this.prorows = prorows;
        this.provariadic = provariadic;
        this.prosupport = prosupport;
        this.prokind = prokind;
        this.prosecdef = prosecdef;
        this.proleakproof = proleakproof;
        this.proisstrict = proisstrict;
        this.proretset = proretset;
        this.provolatile = provolatile;
        this.proparallel = proparallel;
        this.pronargs = pronargs;
        this.pronargdefaults = pronargdefaults;
        this.prorettype = prorettype;
        this.proargtypes = proargtypes;
        this.proallargtypes = proallargtypes;
        this.proargmodes = proargmodes;
        this.proargnames = proargnames;
        this.proargdefaults = proargdefaults;
        this.protrftypes = protrftypes;
        this.prosrc = prosrc;
        this.probin = probin;
        this.prosqlbody = prosqlbody;
        this.proconfig = proconfig;
        this.proacl = proacl;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.oid</code>.
     */
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.oid</code>.
     */
    public void setOid(Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proname</code>.
     */
    public String getProname() {
        return this.proname;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proname</code>.
     */
    public void setProname(String proname) {
        this.proname = proname;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.pronamespace</code>.
     */
    public Long getPronamespace() {
        return this.pronamespace;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.pronamespace</code>.
     */
    public void setPronamespace(Long pronamespace) {
        this.pronamespace = pronamespace;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proowner</code>.
     */
    public Long getProowner() {
        return this.proowner;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proowner</code>.
     */
    public void setProowner(Long proowner) {
        this.proowner = proowner;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.prolang</code>.
     */
    public Long getProlang() {
        return this.prolang;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.prolang</code>.
     */
    public void setProlang(Long prolang) {
        this.prolang = prolang;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.procost</code>.
     */
    public Float getProcost() {
        return this.procost;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.procost</code>.
     */
    public void setProcost(Float procost) {
        this.procost = procost;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.prorows</code>.
     */
    public Float getProrows() {
        return this.prorows;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.prorows</code>.
     */
    public void setProrows(Float prorows) {
        this.prorows = prorows;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.provariadic</code>.
     */
    public Long getProvariadic() {
        return this.provariadic;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.provariadic</code>.
     */
    public void setProvariadic(Long provariadic) {
        this.provariadic = provariadic;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.prosupport</code>.
     */
    public String getProsupport() {
        return this.prosupport;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.prosupport</code>.
     */
    public void setProsupport(String prosupport) {
        this.prosupport = prosupport;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.prokind</code>.
     */
    public String getProkind() {
        return this.prokind;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.prokind</code>.
     */
    public void setProkind(String prokind) {
        this.prokind = prokind;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.prosecdef</code>.
     */
    public Boolean getProsecdef() {
        return this.prosecdef;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.prosecdef</code>.
     */
    public void setProsecdef(Boolean prosecdef) {
        this.prosecdef = prosecdef;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proleakproof</code>.
     */
    public Boolean getProleakproof() {
        return this.proleakproof;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proleakproof</code>.
     */
    public void setProleakproof(Boolean proleakproof) {
        this.proleakproof = proleakproof;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proisstrict</code>.
     */
    public Boolean getProisstrict() {
        return this.proisstrict;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proisstrict</code>.
     */
    public void setProisstrict(Boolean proisstrict) {
        this.proisstrict = proisstrict;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proretset</code>.
     */
    public Boolean getProretset() {
        return this.proretset;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proretset</code>.
     */
    public void setProretset(Boolean proretset) {
        this.proretset = proretset;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.provolatile</code>.
     */
    public String getProvolatile() {
        return this.provolatile;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.provolatile</code>.
     */
    public void setProvolatile(String provolatile) {
        this.provolatile = provolatile;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proparallel</code>.
     */
    public String getProparallel() {
        return this.proparallel;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proparallel</code>.
     */
    public void setProparallel(String proparallel) {
        this.proparallel = proparallel;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.pronargs</code>.
     */
    public Short getPronargs() {
        return this.pronargs;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.pronargs</code>.
     */
    public void setPronargs(Short pronargs) {
        this.pronargs = pronargs;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.pronargdefaults</code>.
     */
    public Short getPronargdefaults() {
        return this.pronargdefaults;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.pronargdefaults</code>.
     */
    public void setPronargdefaults(Short pronargdefaults) {
        this.pronargdefaults = pronargdefaults;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.prorettype</code>.
     */
    public Long getProrettype() {
        return this.prorettype;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.prorettype</code>.
     */
    public void setProrettype(Long prorettype) {
        this.prorettype = prorettype;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proargtypes</code>.
     */
    public Object[] getProargtypes() {
        return this.proargtypes;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proargtypes</code>.
     */
    public void setProargtypes(Object[] proargtypes) {
        this.proargtypes = proargtypes;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proallargtypes</code>.
     */
    public Long[] getProallargtypes() {
        return this.proallargtypes;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proallargtypes</code>.
     */
    public void setProallargtypes(Long[] proallargtypes) {
        this.proallargtypes = proallargtypes;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proargmodes</code>.
     */
    public String[] getProargmodes() {
        return this.proargmodes;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proargmodes</code>.
     */
    public void setProargmodes(String[] proargmodes) {
        this.proargmodes = proargmodes;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proargnames</code>.
     */
    public String[] getProargnames() {
        return this.proargnames;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proargnames</code>.
     */
    public void setProargnames(String[] proargnames) {
        this.proargnames = proargnames;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getProargdefaults() {
        return this.proargdefaults;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setProargdefaults(Object proargdefaults) {
        this.proargdefaults = proargdefaults;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.protrftypes</code>.
     */
    public Long[] getProtrftypes() {
        return this.protrftypes;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.protrftypes</code>.
     */
    public void setProtrftypes(Long[] protrftypes) {
        this.protrftypes = protrftypes;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.prosrc</code>.
     */
    public String getProsrc() {
        return this.prosrc;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.prosrc</code>.
     */
    public void setProsrc(String prosrc) {
        this.prosrc = prosrc;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.probin</code>.
     */
    public String getProbin() {
        return this.probin;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.probin</code>.
     */
    public void setProbin(String probin) {
        this.probin = probin;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getProsqlbody() {
        return this.prosqlbody;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setProsqlbody(Object prosqlbody) {
        this.prosqlbody = prosqlbody;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proconfig</code>.
     */
    public String[] getProconfig() {
        return this.proconfig;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proconfig</code>.
     */
    public void setProconfig(String[] proconfig) {
        this.proconfig = proconfig;
    }

    /**
     * Getter for <code>pg_catalog.pg_proc.proacl</code>.
     */
    public String[] getProacl() {
        return this.proacl;
    }

    /**
     * Setter for <code>pg_catalog.pg_proc.proacl</code>.
     */
    public void setProacl(String[] proacl) {
        this.proacl = proacl;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgProc other = (PgProc) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.proname == null) {
            if (other.proname != null)
                return false;
        }
        else if (!this.proname.equals(other.proname))
            return false;
        if (this.pronamespace == null) {
            if (other.pronamespace != null)
                return false;
        }
        else if (!this.pronamespace.equals(other.pronamespace))
            return false;
        if (this.proowner == null) {
            if (other.proowner != null)
                return false;
        }
        else if (!this.proowner.equals(other.proowner))
            return false;
        if (this.prolang == null) {
            if (other.prolang != null)
                return false;
        }
        else if (!this.prolang.equals(other.prolang))
            return false;
        if (this.procost == null) {
            if (other.procost != null)
                return false;
        }
        else if (!this.procost.equals(other.procost))
            return false;
        if (this.prorows == null) {
            if (other.prorows != null)
                return false;
        }
        else if (!this.prorows.equals(other.prorows))
            return false;
        if (this.provariadic == null) {
            if (other.provariadic != null)
                return false;
        }
        else if (!this.provariadic.equals(other.provariadic))
            return false;
        if (this.prosupport == null) {
            if (other.prosupport != null)
                return false;
        }
        else if (!this.prosupport.equals(other.prosupport))
            return false;
        if (this.prokind == null) {
            if (other.prokind != null)
                return false;
        }
        else if (!this.prokind.equals(other.prokind))
            return false;
        if (this.prosecdef == null) {
            if (other.prosecdef != null)
                return false;
        }
        else if (!this.prosecdef.equals(other.prosecdef))
            return false;
        if (this.proleakproof == null) {
            if (other.proleakproof != null)
                return false;
        }
        else if (!this.proleakproof.equals(other.proleakproof))
            return false;
        if (this.proisstrict == null) {
            if (other.proisstrict != null)
                return false;
        }
        else if (!this.proisstrict.equals(other.proisstrict))
            return false;
        if (this.proretset == null) {
            if (other.proretset != null)
                return false;
        }
        else if (!this.proretset.equals(other.proretset))
            return false;
        if (this.provolatile == null) {
            if (other.provolatile != null)
                return false;
        }
        else if (!this.provolatile.equals(other.provolatile))
            return false;
        if (this.proparallel == null) {
            if (other.proparallel != null)
                return false;
        }
        else if (!this.proparallel.equals(other.proparallel))
            return false;
        if (this.pronargs == null) {
            if (other.pronargs != null)
                return false;
        }
        else if (!this.pronargs.equals(other.pronargs))
            return false;
        if (this.pronargdefaults == null) {
            if (other.pronargdefaults != null)
                return false;
        }
        else if (!this.pronargdefaults.equals(other.pronargdefaults))
            return false;
        if (this.prorettype == null) {
            if (other.prorettype != null)
                return false;
        }
        else if (!this.prorettype.equals(other.prorettype))
            return false;
        if (this.proargtypes == null) {
            if (other.proargtypes != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.proargtypes, other.proargtypes))
            return false;
        if (this.proallargtypes == null) {
            if (other.proallargtypes != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.proallargtypes, other.proallargtypes))
            return false;
        if (this.proargmodes == null) {
            if (other.proargmodes != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.proargmodes, other.proargmodes))
            return false;
        if (this.proargnames == null) {
            if (other.proargnames != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.proargnames, other.proargnames))
            return false;
        if (this.proargdefaults == null) {
            if (other.proargdefaults != null)
                return false;
        }
        else if (!this.proargdefaults.equals(other.proargdefaults))
            return false;
        if (this.protrftypes == null) {
            if (other.protrftypes != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.protrftypes, other.protrftypes))
            return false;
        if (this.prosrc == null) {
            if (other.prosrc != null)
                return false;
        }
        else if (!this.prosrc.equals(other.prosrc))
            return false;
        if (this.probin == null) {
            if (other.probin != null)
                return false;
        }
        else if (!this.probin.equals(other.probin))
            return false;
        if (this.prosqlbody == null) {
            if (other.prosqlbody != null)
                return false;
        }
        else if (!this.prosqlbody.equals(other.prosqlbody))
            return false;
        if (this.proconfig == null) {
            if (other.proconfig != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.proconfig, other.proconfig))
            return false;
        if (this.proacl == null) {
            if (other.proacl != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.proacl, other.proacl))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.proname == null) ? 0 : this.proname.hashCode());
        result = prime * result + ((this.pronamespace == null) ? 0 : this.pronamespace.hashCode());
        result = prime * result + ((this.proowner == null) ? 0 : this.proowner.hashCode());
        result = prime * result + ((this.prolang == null) ? 0 : this.prolang.hashCode());
        result = prime * result + ((this.procost == null) ? 0 : this.procost.hashCode());
        result = prime * result + ((this.prorows == null) ? 0 : this.prorows.hashCode());
        result = prime * result + ((this.provariadic == null) ? 0 : this.provariadic.hashCode());
        result = prime * result + ((this.prosupport == null) ? 0 : this.prosupport.hashCode());
        result = prime * result + ((this.prokind == null) ? 0 : this.prokind.hashCode());
        result = prime * result + ((this.prosecdef == null) ? 0 : this.prosecdef.hashCode());
        result = prime * result + ((this.proleakproof == null) ? 0 : this.proleakproof.hashCode());
        result = prime * result + ((this.proisstrict == null) ? 0 : this.proisstrict.hashCode());
        result = prime * result + ((this.proretset == null) ? 0 : this.proretset.hashCode());
        result = prime * result + ((this.provolatile == null) ? 0 : this.provolatile.hashCode());
        result = prime * result + ((this.proparallel == null) ? 0 : this.proparallel.hashCode());
        result = prime * result + ((this.pronargs == null) ? 0 : this.pronargs.hashCode());
        result = prime * result + ((this.pronargdefaults == null) ? 0 : this.pronargdefaults.hashCode());
        result = prime * result + ((this.prorettype == null) ? 0 : this.prorettype.hashCode());
        result = prime * result + ((this.proargtypes == null) ? 0 : Arrays.deepHashCode(this.proargtypes));
        result = prime * result + ((this.proallargtypes == null) ? 0 : Arrays.deepHashCode(this.proallargtypes));
        result = prime * result + ((this.proargmodes == null) ? 0 : Arrays.deepHashCode(this.proargmodes));
        result = prime * result + ((this.proargnames == null) ? 0 : Arrays.deepHashCode(this.proargnames));
        result = prime * result + ((this.proargdefaults == null) ? 0 : this.proargdefaults.hashCode());
        result = prime * result + ((this.protrftypes == null) ? 0 : Arrays.deepHashCode(this.protrftypes));
        result = prime * result + ((this.prosrc == null) ? 0 : this.prosrc.hashCode());
        result = prime * result + ((this.probin == null) ? 0 : this.probin.hashCode());
        result = prime * result + ((this.prosqlbody == null) ? 0 : this.prosqlbody.hashCode());
        result = prime * result + ((this.proconfig == null) ? 0 : Arrays.deepHashCode(this.proconfig));
        result = prime * result + ((this.proacl == null) ? 0 : Arrays.deepHashCode(this.proacl));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgProc (");

        sb.append(oid);
        sb.append(", ").append(proname);
        sb.append(", ").append(pronamespace);
        sb.append(", ").append(proowner);
        sb.append(", ").append(prolang);
        sb.append(", ").append(procost);
        sb.append(", ").append(prorows);
        sb.append(", ").append(provariadic);
        sb.append(", ").append(prosupport);
        sb.append(", ").append(prokind);
        sb.append(", ").append(prosecdef);
        sb.append(", ").append(proleakproof);
        sb.append(", ").append(proisstrict);
        sb.append(", ").append(proretset);
        sb.append(", ").append(provolatile);
        sb.append(", ").append(proparallel);
        sb.append(", ").append(pronargs);
        sb.append(", ").append(pronargdefaults);
        sb.append(", ").append(prorettype);
        sb.append(", ").append(Arrays.deepToString(proargtypes));
        sb.append(", ").append(Arrays.deepToString(proallargtypes));
        sb.append(", ").append(Arrays.deepToString(proargmodes));
        sb.append(", ").append(Arrays.deepToString(proargnames));
        sb.append(", ").append(proargdefaults);
        sb.append(", ").append(Arrays.deepToString(protrftypes));
        sb.append(", ").append(prosrc);
        sb.append(", ").append(probin);
        sb.append(", ").append(prosqlbody);
        sb.append(", ").append(Arrays.deepToString(proconfig));
        sb.append(", ").append(Arrays.deepToString(proacl));

        sb.append(")");
        return sb.toString();
    }
}
