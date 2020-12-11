package com.sc.spring.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * PUR_ORDER
 * @author 
 */
public class PurOrder implements Serializable {
    /**
     * 订单编号
     */
    private Long oid;

    /**
     * 采购主题
     */
    private String theym;

    /**
     * 采购日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderdate;

    /**
     * 供应商id
     */
    private Long gid;

    /**
     * 订单金额
     */
    private String money;

    /**
     * 发票号码
     */
    private Long fapiaoid;

    /**
     * 付款情况
     */
    private String fukuanstatu;

    /**
     * 采购进展
     */
    private String ojinzhan;

    /**
     * 交货时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date givedate;

    /**
     * 交货地点
     */
    private String giveplace;

    /**
     * 交货方式
     */
    private String giveway;

    /**
     * 操作人员
     */
    private String controner;

    /**
     * 备注
     */
    private String remakers;

    /**
     * 公司id
     */
    private Long cid;

    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getTheym() {
        return theym;
    }

    public void setTheym(String theym) {
        this.theym = theym;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Long getFapiaoid() {
        return fapiaoid;
    }

    public void setFapiaoid(Long fapiaoid) {
        this.fapiaoid = fapiaoid;
    }

    public String getFukuanstatu() {
        return fukuanstatu;
    }

    public void setFukuanstatu(String fukuanstatu) {
        this.fukuanstatu = fukuanstatu;
    }

    public String getOjinzhan() {
        return ojinzhan;
    }

    public void setOjinzhan(String ojinzhan) {
        this.ojinzhan = ojinzhan;
    }

    public Date getGivedate() {
        return givedate;
    }

    public void setGivedate(Date givedate) {
        this.givedate = givedate;
    }

    public String getGiveplace() {
        return giveplace;
    }

    public void setGiveplace(String giveplace) {
        this.giveplace = giveplace;
    }

    public String getGiveway() {
        return giveway;
    }

    public void setGiveway(String giveway) {
        this.giveway = giveway;
    }

    public String getControner() {
        return controner;
    }

    public void setControner(String controner) {
        this.controner = controner;
    }

    public String getRemakers() {
        return remakers;
    }

    public void setRemakers(String remakers) {
        this.remakers = remakers;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PurOrder other = (PurOrder) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getTheym() == null ? other.getTheym() == null : this.getTheym().equals(other.getTheym()))
            && (this.getOrderdate() == null ? other.getOrderdate() == null : this.getOrderdate().equals(other.getOrderdate()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getFapiaoid() == null ? other.getFapiaoid() == null : this.getFapiaoid().equals(other.getFapiaoid()))
            && (this.getFukuanstatu() == null ? other.getFukuanstatu() == null : this.getFukuanstatu().equals(other.getFukuanstatu()))
            && (this.getOjinzhan() == null ? other.getOjinzhan() == null : this.getOjinzhan().equals(other.getOjinzhan()))
            && (this.getGivedate() == null ? other.getGivedate() == null : this.getGivedate().equals(other.getGivedate()))
            && (this.getGiveplace() == null ? other.getGiveplace() == null : this.getGiveplace().equals(other.getGiveplace()))
            && (this.getGiveway() == null ? other.getGiveway() == null : this.getGiveway().equals(other.getGiveway()))
            && (this.getControner() == null ? other.getControner() == null : this.getControner().equals(other.getControner()))
            && (this.getRemakers() == null ? other.getRemakers() == null : this.getRemakers().equals(other.getRemakers()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getTheym() == null) ? 0 : getTheym().hashCode());
        result = prime * result + ((getOrderdate() == null) ? 0 : getOrderdate().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getFapiaoid() == null) ? 0 : getFapiaoid().hashCode());
        result = prime * result + ((getFukuanstatu() == null) ? 0 : getFukuanstatu().hashCode());
        result = prime * result + ((getOjinzhan() == null) ? 0 : getOjinzhan().hashCode());
        result = prime * result + ((getGivedate() == null) ? 0 : getGivedate().hashCode());
        result = prime * result + ((getGiveplace() == null) ? 0 : getGiveplace().hashCode());
        result = prime * result + ((getGiveway() == null) ? 0 : getGiveway().hashCode());
        result = prime * result + ((getControner() == null) ? 0 : getControner().hashCode());
        result = prime * result + ((getRemakers() == null) ? 0 : getRemakers().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", theym=").append(theym);
        sb.append(", orderdate=").append(orderdate);
        sb.append(", gid=").append(gid);
        sb.append(", money=").append(money);
        sb.append(", fapiaoid=").append(fapiaoid);
        sb.append(", fukuanstatu=").append(fukuanstatu);
        sb.append(", ojinzhan=").append(ojinzhan);
        sb.append(", givedate=").append(givedate);
        sb.append(", giveplace=").append(giveplace);
        sb.append(", giveway=").append(giveway);
        sb.append(", controner=").append(controner);
        sb.append(", remakers=").append(remakers);
        sb.append(", cid=").append(cid);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}