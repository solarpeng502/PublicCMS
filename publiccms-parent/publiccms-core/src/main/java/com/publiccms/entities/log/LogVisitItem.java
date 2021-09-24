package com.publiccms.entities.log;
// Generated 2021-8-6 14:20:45 by Hibernate Tools 5.4.32.Final

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * LogVisitItem generated by hbm2java
 */
@Entity
@Table(name = "log_visit_item")
@DynamicUpdate
public class LogVisitItem implements java.io.Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private LogVisitItemId id;
    @GeneratorColumn(title = "PV")
    private long pv;
    @GeneratorColumn(title = "UV")
    private Long uv;
    @GeneratorColumn(title = "IP Views")
    private Long ipviews;

    public LogVisitItem() {
    }

    public LogVisitItem(LogVisitItemId id, long pv) {
        this.id = id;
        this.pv = pv;
    }

    public LogVisitItem(short siteId, Date visitDate, String itemType, String itemId, long pv, Long uv, Long ipviews) {
        this.id = new LogVisitItemId(siteId, visitDate, itemType, itemId);
        this.pv = pv;
        this.uv = uv;
        this.ipviews = ipviews;
    }

    public LogVisitItem(LogVisitItemId id, long pv, Long uv, Long ipviews) {
        this.id = id;
        this.pv = pv;
        this.uv = uv;
        this.ipviews = ipviews;
    }

    @EmbeddedId
    @AttributeOverrides({ @AttributeOverride(name = "siteId", column = @Column(name = "site_id", nullable = false)),
            @AttributeOverride(name = "visitDate", column = @Column(name = "visit_date", nullable = false, length = 10)),
            @AttributeOverride(name = "itemType", column = @Column(name = "item_type", nullable = false, length = 50)),
            @AttributeOverride(name = "itemId", column = @Column(name = "item_id", nullable = false, length = 50)) })
    public LogVisitItemId getId() {
        return this.id;
    }

    public void setId(LogVisitItemId id) {
        this.id = id;
    }

    @Column(name = "pv", nullable = false)
    public long getPv() {
        return this.pv;
    }

    public void setPv(long pv) {
        this.pv = pv;
    }

    @Column(name = "uv")
    public Long getUv() {
        return this.uv;
    }

    public void setUv(Long uv) {
        this.uv = uv;
    }

    @Column(name = "ipviews")
    public Long getIpviews() {
        return this.ipviews;
    }

    public void setIpviews(Long ipviews) {
        this.ipviews = ipviews;
    }

}
