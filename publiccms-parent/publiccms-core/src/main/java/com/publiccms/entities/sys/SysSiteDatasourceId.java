package com.publiccms.entities.sys;
// Generated 2021-8-2 11:20:41 by Hibernate Tools 5.4.32.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SysSiteDatasourceId generated by hbm2java
 */
@Embeddable
public class SysSiteDatasourceId implements java.io.Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = 1L;
    private short siteId;
    private String datasource;

    public SysSiteDatasourceId() {
    }

    public SysSiteDatasourceId(short siteId, String datasource) {
        this.siteId = siteId;
        this.datasource = datasource;
    }

    @Column(name = "site_id", nullable = false)
    public short getSiteId() {
        return this.siteId;
    }

    public void setSiteId(short siteId) {
        this.siteId = siteId;
    }

    @Column(name = "datasource", nullable = false, length = 50)
    public String getDatasource() {
        return this.datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof SysSiteDatasourceId))
            return false;
        SysSiteDatasourceId castOther = (SysSiteDatasourceId) other;

        return (this.getSiteId() == castOther.getSiteId())
                && ((this.getDatasource() == castOther.getDatasource()) || (this.getDatasource() != null
                        && castOther.getDatasource() != null && this.getDatasource().equals(castOther.getDatasource())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getSiteId();
        result = 37 * result + (getDatasource() == null ? 0 : this.getDatasource().hashCode());
        return result;
    }

}