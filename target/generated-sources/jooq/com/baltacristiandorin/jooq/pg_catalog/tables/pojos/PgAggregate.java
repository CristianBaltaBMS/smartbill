/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgAggregate implements Serializable {

    private static final long serialVersionUID = 1L;

    private String aggfnoid;
    private String aggkind;
    private Short aggnumdirectargs;
    private String aggtransfn;
    private String aggfinalfn;
    private String aggcombinefn;
    private String aggserialfn;
    private String aggdeserialfn;
    private String aggmtransfn;
    private String aggminvtransfn;
    private String aggmfinalfn;
    private Boolean aggfinalextra;
    private Boolean aggmfinalextra;
    private String aggfinalmodify;
    private String aggmfinalmodify;
    private Long aggsortop;
    private Long aggtranstype;
    private Integer aggtransspace;
    private Long aggmtranstype;
    private Integer aggmtransspace;
    private String agginitval;
    private String aggminitval;

    public PgAggregate() {}

    public PgAggregate(PgAggregate value) {
        this.aggfnoid = value.aggfnoid;
        this.aggkind = value.aggkind;
        this.aggnumdirectargs = value.aggnumdirectargs;
        this.aggtransfn = value.aggtransfn;
        this.aggfinalfn = value.aggfinalfn;
        this.aggcombinefn = value.aggcombinefn;
        this.aggserialfn = value.aggserialfn;
        this.aggdeserialfn = value.aggdeserialfn;
        this.aggmtransfn = value.aggmtransfn;
        this.aggminvtransfn = value.aggminvtransfn;
        this.aggmfinalfn = value.aggmfinalfn;
        this.aggfinalextra = value.aggfinalextra;
        this.aggmfinalextra = value.aggmfinalextra;
        this.aggfinalmodify = value.aggfinalmodify;
        this.aggmfinalmodify = value.aggmfinalmodify;
        this.aggsortop = value.aggsortop;
        this.aggtranstype = value.aggtranstype;
        this.aggtransspace = value.aggtransspace;
        this.aggmtranstype = value.aggmtranstype;
        this.aggmtransspace = value.aggmtransspace;
        this.agginitval = value.agginitval;
        this.aggminitval = value.aggminitval;
    }

    public PgAggregate(
        String aggfnoid,
        String aggkind,
        Short aggnumdirectargs,
        String aggtransfn,
        String aggfinalfn,
        String aggcombinefn,
        String aggserialfn,
        String aggdeserialfn,
        String aggmtransfn,
        String aggminvtransfn,
        String aggmfinalfn,
        Boolean aggfinalextra,
        Boolean aggmfinalextra,
        String aggfinalmodify,
        String aggmfinalmodify,
        Long aggsortop,
        Long aggtranstype,
        Integer aggtransspace,
        Long aggmtranstype,
        Integer aggmtransspace,
        String agginitval,
        String aggminitval
    ) {
        this.aggfnoid = aggfnoid;
        this.aggkind = aggkind;
        this.aggnumdirectargs = aggnumdirectargs;
        this.aggtransfn = aggtransfn;
        this.aggfinalfn = aggfinalfn;
        this.aggcombinefn = aggcombinefn;
        this.aggserialfn = aggserialfn;
        this.aggdeserialfn = aggdeserialfn;
        this.aggmtransfn = aggmtransfn;
        this.aggminvtransfn = aggminvtransfn;
        this.aggmfinalfn = aggmfinalfn;
        this.aggfinalextra = aggfinalextra;
        this.aggmfinalextra = aggmfinalextra;
        this.aggfinalmodify = aggfinalmodify;
        this.aggmfinalmodify = aggmfinalmodify;
        this.aggsortop = aggsortop;
        this.aggtranstype = aggtranstype;
        this.aggtransspace = aggtransspace;
        this.aggmtranstype = aggmtranstype;
        this.aggmtransspace = aggmtransspace;
        this.agginitval = agginitval;
        this.aggminitval = aggminitval;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggfnoid</code>.
     */
    public String getAggfnoid() {
        return this.aggfnoid;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggfnoid</code>.
     */
    public void setAggfnoid(String aggfnoid) {
        this.aggfnoid = aggfnoid;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggkind</code>.
     */
    public String getAggkind() {
        return this.aggkind;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggkind</code>.
     */
    public void setAggkind(String aggkind) {
        this.aggkind = aggkind;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggnumdirectargs</code>.
     */
    public Short getAggnumdirectargs() {
        return this.aggnumdirectargs;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggnumdirectargs</code>.
     */
    public void setAggnumdirectargs(Short aggnumdirectargs) {
        this.aggnumdirectargs = aggnumdirectargs;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggtransfn</code>.
     */
    public String getAggtransfn() {
        return this.aggtransfn;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggtransfn</code>.
     */
    public void setAggtransfn(String aggtransfn) {
        this.aggtransfn = aggtransfn;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggfinalfn</code>.
     */
    public String getAggfinalfn() {
        return this.aggfinalfn;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggfinalfn</code>.
     */
    public void setAggfinalfn(String aggfinalfn) {
        this.aggfinalfn = aggfinalfn;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggcombinefn</code>.
     */
    public String getAggcombinefn() {
        return this.aggcombinefn;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggcombinefn</code>.
     */
    public void setAggcombinefn(String aggcombinefn) {
        this.aggcombinefn = aggcombinefn;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggserialfn</code>.
     */
    public String getAggserialfn() {
        return this.aggserialfn;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggserialfn</code>.
     */
    public void setAggserialfn(String aggserialfn) {
        this.aggserialfn = aggserialfn;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggdeserialfn</code>.
     */
    public String getAggdeserialfn() {
        return this.aggdeserialfn;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggdeserialfn</code>.
     */
    public void setAggdeserialfn(String aggdeserialfn) {
        this.aggdeserialfn = aggdeserialfn;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggmtransfn</code>.
     */
    public String getAggmtransfn() {
        return this.aggmtransfn;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggmtransfn</code>.
     */
    public void setAggmtransfn(String aggmtransfn) {
        this.aggmtransfn = aggmtransfn;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggminvtransfn</code>.
     */
    public String getAggminvtransfn() {
        return this.aggminvtransfn;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggminvtransfn</code>.
     */
    public void setAggminvtransfn(String aggminvtransfn) {
        this.aggminvtransfn = aggminvtransfn;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggmfinalfn</code>.
     */
    public String getAggmfinalfn() {
        return this.aggmfinalfn;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggmfinalfn</code>.
     */
    public void setAggmfinalfn(String aggmfinalfn) {
        this.aggmfinalfn = aggmfinalfn;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggfinalextra</code>.
     */
    public Boolean getAggfinalextra() {
        return this.aggfinalextra;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggfinalextra</code>.
     */
    public void setAggfinalextra(Boolean aggfinalextra) {
        this.aggfinalextra = aggfinalextra;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggmfinalextra</code>.
     */
    public Boolean getAggmfinalextra() {
        return this.aggmfinalextra;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggmfinalextra</code>.
     */
    public void setAggmfinalextra(Boolean aggmfinalextra) {
        this.aggmfinalextra = aggmfinalextra;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggfinalmodify</code>.
     */
    public String getAggfinalmodify() {
        return this.aggfinalmodify;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggfinalmodify</code>.
     */
    public void setAggfinalmodify(String aggfinalmodify) {
        this.aggfinalmodify = aggfinalmodify;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggmfinalmodify</code>.
     */
    public String getAggmfinalmodify() {
        return this.aggmfinalmodify;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggmfinalmodify</code>.
     */
    public void setAggmfinalmodify(String aggmfinalmodify) {
        this.aggmfinalmodify = aggmfinalmodify;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggsortop</code>.
     */
    public Long getAggsortop() {
        return this.aggsortop;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggsortop</code>.
     */
    public void setAggsortop(Long aggsortop) {
        this.aggsortop = aggsortop;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggtranstype</code>.
     */
    public Long getAggtranstype() {
        return this.aggtranstype;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggtranstype</code>.
     */
    public void setAggtranstype(Long aggtranstype) {
        this.aggtranstype = aggtranstype;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggtransspace</code>.
     */
    public Integer getAggtransspace() {
        return this.aggtransspace;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggtransspace</code>.
     */
    public void setAggtransspace(Integer aggtransspace) {
        this.aggtransspace = aggtransspace;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggmtranstype</code>.
     */
    public Long getAggmtranstype() {
        return this.aggmtranstype;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggmtranstype</code>.
     */
    public void setAggmtranstype(Long aggmtranstype) {
        this.aggmtranstype = aggmtranstype;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggmtransspace</code>.
     */
    public Integer getAggmtransspace() {
        return this.aggmtransspace;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggmtransspace</code>.
     */
    public void setAggmtransspace(Integer aggmtransspace) {
        this.aggmtransspace = aggmtransspace;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.agginitval</code>.
     */
    public String getAgginitval() {
        return this.agginitval;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.agginitval</code>.
     */
    public void setAgginitval(String agginitval) {
        this.agginitval = agginitval;
    }

    /**
     * Getter for <code>pg_catalog.pg_aggregate.aggminitval</code>.
     */
    public String getAggminitval() {
        return this.aggminitval;
    }

    /**
     * Setter for <code>pg_catalog.pg_aggregate.aggminitval</code>.
     */
    public void setAggminitval(String aggminitval) {
        this.aggminitval = aggminitval;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgAggregate other = (PgAggregate) obj;
        if (this.aggfnoid == null) {
            if (other.aggfnoid != null)
                return false;
        }
        else if (!this.aggfnoid.equals(other.aggfnoid))
            return false;
        if (this.aggkind == null) {
            if (other.aggkind != null)
                return false;
        }
        else if (!this.aggkind.equals(other.aggkind))
            return false;
        if (this.aggnumdirectargs == null) {
            if (other.aggnumdirectargs != null)
                return false;
        }
        else if (!this.aggnumdirectargs.equals(other.aggnumdirectargs))
            return false;
        if (this.aggtransfn == null) {
            if (other.aggtransfn != null)
                return false;
        }
        else if (!this.aggtransfn.equals(other.aggtransfn))
            return false;
        if (this.aggfinalfn == null) {
            if (other.aggfinalfn != null)
                return false;
        }
        else if (!this.aggfinalfn.equals(other.aggfinalfn))
            return false;
        if (this.aggcombinefn == null) {
            if (other.aggcombinefn != null)
                return false;
        }
        else if (!this.aggcombinefn.equals(other.aggcombinefn))
            return false;
        if (this.aggserialfn == null) {
            if (other.aggserialfn != null)
                return false;
        }
        else if (!this.aggserialfn.equals(other.aggserialfn))
            return false;
        if (this.aggdeserialfn == null) {
            if (other.aggdeserialfn != null)
                return false;
        }
        else if (!this.aggdeserialfn.equals(other.aggdeserialfn))
            return false;
        if (this.aggmtransfn == null) {
            if (other.aggmtransfn != null)
                return false;
        }
        else if (!this.aggmtransfn.equals(other.aggmtransfn))
            return false;
        if (this.aggminvtransfn == null) {
            if (other.aggminvtransfn != null)
                return false;
        }
        else if (!this.aggminvtransfn.equals(other.aggminvtransfn))
            return false;
        if (this.aggmfinalfn == null) {
            if (other.aggmfinalfn != null)
                return false;
        }
        else if (!this.aggmfinalfn.equals(other.aggmfinalfn))
            return false;
        if (this.aggfinalextra == null) {
            if (other.aggfinalextra != null)
                return false;
        }
        else if (!this.aggfinalextra.equals(other.aggfinalextra))
            return false;
        if (this.aggmfinalextra == null) {
            if (other.aggmfinalextra != null)
                return false;
        }
        else if (!this.aggmfinalextra.equals(other.aggmfinalextra))
            return false;
        if (this.aggfinalmodify == null) {
            if (other.aggfinalmodify != null)
                return false;
        }
        else if (!this.aggfinalmodify.equals(other.aggfinalmodify))
            return false;
        if (this.aggmfinalmodify == null) {
            if (other.aggmfinalmodify != null)
                return false;
        }
        else if (!this.aggmfinalmodify.equals(other.aggmfinalmodify))
            return false;
        if (this.aggsortop == null) {
            if (other.aggsortop != null)
                return false;
        }
        else if (!this.aggsortop.equals(other.aggsortop))
            return false;
        if (this.aggtranstype == null) {
            if (other.aggtranstype != null)
                return false;
        }
        else if (!this.aggtranstype.equals(other.aggtranstype))
            return false;
        if (this.aggtransspace == null) {
            if (other.aggtransspace != null)
                return false;
        }
        else if (!this.aggtransspace.equals(other.aggtransspace))
            return false;
        if (this.aggmtranstype == null) {
            if (other.aggmtranstype != null)
                return false;
        }
        else if (!this.aggmtranstype.equals(other.aggmtranstype))
            return false;
        if (this.aggmtransspace == null) {
            if (other.aggmtransspace != null)
                return false;
        }
        else if (!this.aggmtransspace.equals(other.aggmtransspace))
            return false;
        if (this.agginitval == null) {
            if (other.agginitval != null)
                return false;
        }
        else if (!this.agginitval.equals(other.agginitval))
            return false;
        if (this.aggminitval == null) {
            if (other.aggminitval != null)
                return false;
        }
        else if (!this.aggminitval.equals(other.aggminitval))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.aggfnoid == null) ? 0 : this.aggfnoid.hashCode());
        result = prime * result + ((this.aggkind == null) ? 0 : this.aggkind.hashCode());
        result = prime * result + ((this.aggnumdirectargs == null) ? 0 : this.aggnumdirectargs.hashCode());
        result = prime * result + ((this.aggtransfn == null) ? 0 : this.aggtransfn.hashCode());
        result = prime * result + ((this.aggfinalfn == null) ? 0 : this.aggfinalfn.hashCode());
        result = prime * result + ((this.aggcombinefn == null) ? 0 : this.aggcombinefn.hashCode());
        result = prime * result + ((this.aggserialfn == null) ? 0 : this.aggserialfn.hashCode());
        result = prime * result + ((this.aggdeserialfn == null) ? 0 : this.aggdeserialfn.hashCode());
        result = prime * result + ((this.aggmtransfn == null) ? 0 : this.aggmtransfn.hashCode());
        result = prime * result + ((this.aggminvtransfn == null) ? 0 : this.aggminvtransfn.hashCode());
        result = prime * result + ((this.aggmfinalfn == null) ? 0 : this.aggmfinalfn.hashCode());
        result = prime * result + ((this.aggfinalextra == null) ? 0 : this.aggfinalextra.hashCode());
        result = prime * result + ((this.aggmfinalextra == null) ? 0 : this.aggmfinalextra.hashCode());
        result = prime * result + ((this.aggfinalmodify == null) ? 0 : this.aggfinalmodify.hashCode());
        result = prime * result + ((this.aggmfinalmodify == null) ? 0 : this.aggmfinalmodify.hashCode());
        result = prime * result + ((this.aggsortop == null) ? 0 : this.aggsortop.hashCode());
        result = prime * result + ((this.aggtranstype == null) ? 0 : this.aggtranstype.hashCode());
        result = prime * result + ((this.aggtransspace == null) ? 0 : this.aggtransspace.hashCode());
        result = prime * result + ((this.aggmtranstype == null) ? 0 : this.aggmtranstype.hashCode());
        result = prime * result + ((this.aggmtransspace == null) ? 0 : this.aggmtransspace.hashCode());
        result = prime * result + ((this.agginitval == null) ? 0 : this.agginitval.hashCode());
        result = prime * result + ((this.aggminitval == null) ? 0 : this.aggminitval.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAggregate (");

        sb.append(aggfnoid);
        sb.append(", ").append(aggkind);
        sb.append(", ").append(aggnumdirectargs);
        sb.append(", ").append(aggtransfn);
        sb.append(", ").append(aggfinalfn);
        sb.append(", ").append(aggcombinefn);
        sb.append(", ").append(aggserialfn);
        sb.append(", ").append(aggdeserialfn);
        sb.append(", ").append(aggmtransfn);
        sb.append(", ").append(aggminvtransfn);
        sb.append(", ").append(aggmfinalfn);
        sb.append(", ").append(aggfinalextra);
        sb.append(", ").append(aggmfinalextra);
        sb.append(", ").append(aggfinalmodify);
        sb.append(", ").append(aggmfinalmodify);
        sb.append(", ").append(aggsortop);
        sb.append(", ").append(aggtranstype);
        sb.append(", ").append(aggtransspace);
        sb.append(", ").append(aggmtranstype);
        sb.append(", ").append(aggmtransspace);
        sb.append(", ").append(agginitval);
        sb.append(", ").append(aggminitval);

        sb.append(")");
        return sb.toString();
    }
}
