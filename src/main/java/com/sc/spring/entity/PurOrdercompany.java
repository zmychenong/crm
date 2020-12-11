package com.sc.spring.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * PUR_ORDERCOMPANY
 * @author 
 */
public class PurOrdercompany implements Serializable {
    private Long gid;

    private String gname;

    private String gnikename;

    private String person;

    private String tel;

    private String mobiletel;

    private String chuanzhen;

    private String adress;

    private String youbian;

    private String mail;

    private String bankename;

    private BigDecimal bankid;

    private String comindex;

    private String isused;

    private String ctlperson;

    private String remakers;

    private BigDecimal cid;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastname;

    private static final long serialVersionUID = 1L;

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGnikename() {
        return gnikename;
    }

    public void setGnikename(String gnikename) {
        this.gnikename = gnikename;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMobiletel() {
        return mobiletel;
    }

    public void setMobiletel(String mobiletel) {
        this.mobiletel = mobiletel;
    }

    public String getChuanzhen() {
        return chuanzhen;
    }

    public void setChuanzhen(String chuanzhen) {
        this.chuanzhen = chuanzhen;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getYoubian() {
        return youbian;
    }

    public void setYoubian(String youbian) {
        this.youbian = youbian;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getBankename() {
        return bankename;
    }

    public void setBankename(String bankename) {
        this.bankename = bankename;
    }

    public BigDecimal getBankid() {
        return bankid;
    }

    public void setBankid(BigDecimal bankid) {
        this.bankid = bankid;
    }

    public String getComindex() {
        return comindex;
    }

    public void setComindex(String comindex) {
        this.comindex = comindex;
    }

    public String getIsused() {
        return isused;
    }

    public void setIsused(String isused) {
        this.isused = isused;
    }

    public String getCtlperson() {
        return ctlperson;
    }

    public void setCtlperson(String ctlperson) {
        this.ctlperson = ctlperson;
    }

    public String getRemakers() {
        return remakers;
    }

    public void setRemakers(String remakers) {
        this.remakers = remakers;
    }

    public BigDecimal getCid() {
        return cid;
    }

    public void setCid(BigDecimal cid) {
        this.cid = cid;
    }

    public Date getLastname() {
        return lastname;
    }

    public void setLastname(Date lastname) {
        this.lastname = lastname;
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
        PurOrdercompany other = (PurOrdercompany) that;
        return (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getGname() == null ? other.getGname() == null : this.getGname().equals(other.getGname()))
            && (this.getGnikename() == null ? other.getGnikename() == null : this.getGnikename().equals(other.getGnikename()))
            && (this.getPerson() == null ? other.getPerson() == null : this.getPerson().equals(other.getPerson()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getMobiletel() == null ? other.getMobiletel() == null : this.getMobiletel().equals(other.getMobiletel()))
            && (this.getChuanzhen() == null ? other.getChuanzhen() == null : this.getChuanzhen().equals(other.getChuanzhen()))
            && (this.getAdress() == null ? other.getAdress() == null : this.getAdress().equals(other.getAdress()))
            && (this.getYoubian() == null ? other.getYoubian() == null : this.getYoubian().equals(other.getYoubian()))
            && (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()))
            && (this.getBankename() == null ? other.getBankename() == null : this.getBankename().equals(other.getBankename()))
            && (this.getBankid() == null ? other.getBankid() == null : this.getBankid().equals(other.getBankid()))
            && (this.getComindex() == null ? other.getComindex() == null : this.getComindex().equals(other.getComindex()))
            && (this.getIsused() == null ? other.getIsused() == null : this.getIsused().equals(other.getIsused()))
            && (this.getCtlperson() == null ? other.getCtlperson() == null : this.getCtlperson().equals(other.getCtlperson()))
            && (this.getRemakers() == null ? other.getRemakers() == null : this.getRemakers().equals(other.getRemakers()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getGname() == null) ? 0 : getGname().hashCode());
        result = prime * result + ((getGnikename() == null) ? 0 : getGnikename().hashCode());
        result = prime * result + ((getPerson() == null) ? 0 : getPerson().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getMobiletel() == null) ? 0 : getMobiletel().hashCode());
        result = prime * result + ((getChuanzhen() == null) ? 0 : getChuanzhen().hashCode());
        result = prime * result + ((getAdress() == null) ? 0 : getAdress().hashCode());
        result = prime * result + ((getYoubian() == null) ? 0 : getYoubian().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        result = prime * result + ((getBankename() == null) ? 0 : getBankename().hashCode());
        result = prime * result + ((getBankid() == null) ? 0 : getBankid().hashCode());
        result = prime * result + ((getComindex() == null) ? 0 : getComindex().hashCode());
        result = prime * result + ((getIsused() == null) ? 0 : getIsused().hashCode());
        result = prime * result + ((getCtlperson() == null) ? 0 : getCtlperson().hashCode());
        result = prime * result + ((getRemakers() == null) ? 0 : getRemakers().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gid=").append(gid);
        sb.append(", gname=").append(gname);
        sb.append(", gnikename=").append(gnikename);
        sb.append(", person=").append(person);
        sb.append(", tel=").append(tel);
        sb.append(", mobiletel=").append(mobiletel);
        sb.append(", chuanzhen=").append(chuanzhen);
        sb.append(", adress=").append(adress);
        sb.append(", youbian=").append(youbian);
        sb.append(", mail=").append(mail);
        sb.append(", bankename=").append(bankename);
        sb.append(", bankid=").append(bankid);
        sb.append(", comindex=").append(comindex);
        sb.append(", isused=").append(isused);
        sb.append(", ctlperson=").append(ctlperson);
        sb.append(", remakers=").append(remakers);
        sb.append(", cid=").append(cid);
        sb.append(", lastname=").append(lastname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}