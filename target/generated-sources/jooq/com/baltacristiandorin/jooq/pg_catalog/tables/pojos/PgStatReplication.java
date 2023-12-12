/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;

import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatReplication implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pid;
    private Long usesysid;
    private String usename;
    private String applicationName;
    private Object clientAddr;
    private String clientHostname;
    private Integer clientPort;
    private OffsetDateTime backendStart;
    private Long backendXmin;
    private String state;
    private Object sentLsn;
    private Object writeLsn;
    private Object flushLsn;
    private Object replayLsn;
    private YearToSecond writeLag;
    private YearToSecond flushLag;
    private YearToSecond replayLag;
    private Integer syncPriority;
    private String syncState;
    private OffsetDateTime replyTime;

    public PgStatReplication() {}

    public PgStatReplication(PgStatReplication value) {
        this.pid = value.pid;
        this.usesysid = value.usesysid;
        this.usename = value.usename;
        this.applicationName = value.applicationName;
        this.clientAddr = value.clientAddr;
        this.clientHostname = value.clientHostname;
        this.clientPort = value.clientPort;
        this.backendStart = value.backendStart;
        this.backendXmin = value.backendXmin;
        this.state = value.state;
        this.sentLsn = value.sentLsn;
        this.writeLsn = value.writeLsn;
        this.flushLsn = value.flushLsn;
        this.replayLsn = value.replayLsn;
        this.writeLag = value.writeLag;
        this.flushLag = value.flushLag;
        this.replayLag = value.replayLag;
        this.syncPriority = value.syncPriority;
        this.syncState = value.syncState;
        this.replyTime = value.replyTime;
    }

    public PgStatReplication(
        Integer pid,
        Long usesysid,
        String usename,
        String applicationName,
        Object clientAddr,
        String clientHostname,
        Integer clientPort,
        OffsetDateTime backendStart,
        Long backendXmin,
        String state,
        Object sentLsn,
        Object writeLsn,
        Object flushLsn,
        Object replayLsn,
        YearToSecond writeLag,
        YearToSecond flushLag,
        YearToSecond replayLag,
        Integer syncPriority,
        String syncState,
        OffsetDateTime replyTime
    ) {
        this.pid = pid;
        this.usesysid = usesysid;
        this.usename = usename;
        this.applicationName = applicationName;
        this.clientAddr = clientAddr;
        this.clientHostname = clientHostname;
        this.clientPort = clientPort;
        this.backendStart = backendStart;
        this.backendXmin = backendXmin;
        this.state = state;
        this.sentLsn = sentLsn;
        this.writeLsn = writeLsn;
        this.flushLsn = flushLsn;
        this.replayLsn = replayLsn;
        this.writeLag = writeLag;
        this.flushLag = flushLag;
        this.replayLag = replayLag;
        this.syncPriority = syncPriority;
        this.syncState = syncState;
        this.replyTime = replyTime;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.pid</code>.
     */
    public Integer getPid() {
        return this.pid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.pid</code>.
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.usesysid</code>.
     */
    public Long getUsesysid() {
        return this.usesysid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.usesysid</code>.
     */
    public void setUsesysid(Long usesysid) {
        this.usesysid = usesysid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.usename</code>.
     */
    public String getUsename() {
        return this.usename;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.usename</code>.
     */
    public void setUsename(String usename) {
        this.usename = usename;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.application_name</code>.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.application_name</code>.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
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
    public Object getClientAddr() {
        return this.clientAddr;
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
    public void setClientAddr(Object clientAddr) {
        this.clientAddr = clientAddr;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.client_hostname</code>.
     */
    public String getClientHostname() {
        return this.clientHostname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.client_hostname</code>.
     */
    public void setClientHostname(String clientHostname) {
        this.clientHostname = clientHostname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.client_port</code>.
     */
    public Integer getClientPort() {
        return this.clientPort;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.client_port</code>.
     */
    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.backend_start</code>.
     */
    public OffsetDateTime getBackendStart() {
        return this.backendStart;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.backend_start</code>.
     */
    public void setBackendStart(OffsetDateTime backendStart) {
        this.backendStart = backendStart;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.backend_xmin</code>.
     */
    public Long getBackendXmin() {
        return this.backendXmin;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.backend_xmin</code>.
     */
    public void setBackendXmin(Long backendXmin) {
        this.backendXmin = backendXmin;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.state</code>.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.state</code>.
     */
    public void setState(String state) {
        this.state = state;
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
    public Object getSentLsn() {
        return this.sentLsn;
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
    public void setSentLsn(Object sentLsn) {
        this.sentLsn = sentLsn;
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
    public Object getWriteLsn() {
        return this.writeLsn;
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
    public void setWriteLsn(Object writeLsn) {
        this.writeLsn = writeLsn;
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
    public Object getFlushLsn() {
        return this.flushLsn;
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
    public void setFlushLsn(Object flushLsn) {
        this.flushLsn = flushLsn;
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
    public Object getReplayLsn() {
        return this.replayLsn;
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
    public void setReplayLsn(Object replayLsn) {
        this.replayLsn = replayLsn;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.write_lag</code>.
     */
    public YearToSecond getWriteLag() {
        return this.writeLag;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.write_lag</code>.
     */
    public void setWriteLag(YearToSecond writeLag) {
        this.writeLag = writeLag;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.flush_lag</code>.
     */
    public YearToSecond getFlushLag() {
        return this.flushLag;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.flush_lag</code>.
     */
    public void setFlushLag(YearToSecond flushLag) {
        this.flushLag = flushLag;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.replay_lag</code>.
     */
    public YearToSecond getReplayLag() {
        return this.replayLag;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.replay_lag</code>.
     */
    public void setReplayLag(YearToSecond replayLag) {
        this.replayLag = replayLag;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.sync_priority</code>.
     */
    public Integer getSyncPriority() {
        return this.syncPriority;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.sync_priority</code>.
     */
    public void setSyncPriority(Integer syncPriority) {
        this.syncPriority = syncPriority;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.sync_state</code>.
     */
    public String getSyncState() {
        return this.syncState;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.sync_state</code>.
     */
    public void setSyncState(String syncState) {
        this.syncState = syncState;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.reply_time</code>.
     */
    public OffsetDateTime getReplyTime() {
        return this.replyTime;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.reply_time</code>.
     */
    public void setReplyTime(OffsetDateTime replyTime) {
        this.replyTime = replyTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatReplication other = (PgStatReplication) obj;
        if (this.pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!this.pid.equals(other.pid))
            return false;
        if (this.usesysid == null) {
            if (other.usesysid != null)
                return false;
        }
        else if (!this.usesysid.equals(other.usesysid))
            return false;
        if (this.usename == null) {
            if (other.usename != null)
                return false;
        }
        else if (!this.usename.equals(other.usename))
            return false;
        if (this.applicationName == null) {
            if (other.applicationName != null)
                return false;
        }
        else if (!this.applicationName.equals(other.applicationName))
            return false;
        if (this.clientAddr == null) {
            if (other.clientAddr != null)
                return false;
        }
        else if (!this.clientAddr.equals(other.clientAddr))
            return false;
        if (this.clientHostname == null) {
            if (other.clientHostname != null)
                return false;
        }
        else if (!this.clientHostname.equals(other.clientHostname))
            return false;
        if (this.clientPort == null) {
            if (other.clientPort != null)
                return false;
        }
        else if (!this.clientPort.equals(other.clientPort))
            return false;
        if (this.backendStart == null) {
            if (other.backendStart != null)
                return false;
        }
        else if (!this.backendStart.equals(other.backendStart))
            return false;
        if (this.backendXmin == null) {
            if (other.backendXmin != null)
                return false;
        }
        else if (!this.backendXmin.equals(other.backendXmin))
            return false;
        if (this.state == null) {
            if (other.state != null)
                return false;
        }
        else if (!this.state.equals(other.state))
            return false;
        if (this.sentLsn == null) {
            if (other.sentLsn != null)
                return false;
        }
        else if (!this.sentLsn.equals(other.sentLsn))
            return false;
        if (this.writeLsn == null) {
            if (other.writeLsn != null)
                return false;
        }
        else if (!this.writeLsn.equals(other.writeLsn))
            return false;
        if (this.flushLsn == null) {
            if (other.flushLsn != null)
                return false;
        }
        else if (!this.flushLsn.equals(other.flushLsn))
            return false;
        if (this.replayLsn == null) {
            if (other.replayLsn != null)
                return false;
        }
        else if (!this.replayLsn.equals(other.replayLsn))
            return false;
        if (this.writeLag == null) {
            if (other.writeLag != null)
                return false;
        }
        else if (!this.writeLag.equals(other.writeLag))
            return false;
        if (this.flushLag == null) {
            if (other.flushLag != null)
                return false;
        }
        else if (!this.flushLag.equals(other.flushLag))
            return false;
        if (this.replayLag == null) {
            if (other.replayLag != null)
                return false;
        }
        else if (!this.replayLag.equals(other.replayLag))
            return false;
        if (this.syncPriority == null) {
            if (other.syncPriority != null)
                return false;
        }
        else if (!this.syncPriority.equals(other.syncPriority))
            return false;
        if (this.syncState == null) {
            if (other.syncState != null)
                return false;
        }
        else if (!this.syncState.equals(other.syncState))
            return false;
        if (this.replyTime == null) {
            if (other.replyTime != null)
                return false;
        }
        else if (!this.replyTime.equals(other.replyTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.usesysid == null) ? 0 : this.usesysid.hashCode());
        result = prime * result + ((this.usename == null) ? 0 : this.usename.hashCode());
        result = prime * result + ((this.applicationName == null) ? 0 : this.applicationName.hashCode());
        result = prime * result + ((this.clientAddr == null) ? 0 : this.clientAddr.hashCode());
        result = prime * result + ((this.clientHostname == null) ? 0 : this.clientHostname.hashCode());
        result = prime * result + ((this.clientPort == null) ? 0 : this.clientPort.hashCode());
        result = prime * result + ((this.backendStart == null) ? 0 : this.backendStart.hashCode());
        result = prime * result + ((this.backendXmin == null) ? 0 : this.backendXmin.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.sentLsn == null) ? 0 : this.sentLsn.hashCode());
        result = prime * result + ((this.writeLsn == null) ? 0 : this.writeLsn.hashCode());
        result = prime * result + ((this.flushLsn == null) ? 0 : this.flushLsn.hashCode());
        result = prime * result + ((this.replayLsn == null) ? 0 : this.replayLsn.hashCode());
        result = prime * result + ((this.writeLag == null) ? 0 : this.writeLag.hashCode());
        result = prime * result + ((this.flushLag == null) ? 0 : this.flushLag.hashCode());
        result = prime * result + ((this.replayLag == null) ? 0 : this.replayLag.hashCode());
        result = prime * result + ((this.syncPriority == null) ? 0 : this.syncPriority.hashCode());
        result = prime * result + ((this.syncState == null) ? 0 : this.syncState.hashCode());
        result = prime * result + ((this.replyTime == null) ? 0 : this.replyTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatReplication (");

        sb.append(pid);
        sb.append(", ").append(usesysid);
        sb.append(", ").append(usename);
        sb.append(", ").append(applicationName);
        sb.append(", ").append(clientAddr);
        sb.append(", ").append(clientHostname);
        sb.append(", ").append(clientPort);
        sb.append(", ").append(backendStart);
        sb.append(", ").append(backendXmin);
        sb.append(", ").append(state);
        sb.append(", ").append(sentLsn);
        sb.append(", ").append(writeLsn);
        sb.append(", ").append(flushLsn);
        sb.append(", ").append(replayLsn);
        sb.append(", ").append(writeLag);
        sb.append(", ").append(flushLag);
        sb.append(", ").append(replayLag);
        sb.append(", ").append(syncPriority);
        sb.append(", ").append(syncState);
        sb.append(", ").append(replyTime);

        sb.append(")");
        return sb.toString();
    }
}
