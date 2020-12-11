package com.sc.spring.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurOrdercompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurOrdercompanyExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGidIsNull() {
            addCriterion("GID is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("GID is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Long value) {
            addCriterion("GID =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Long value) {
            addCriterion("GID <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Long value) {
            addCriterion("GID >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Long value) {
            addCriterion("GID >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Long value) {
            addCriterion("GID <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Long value) {
            addCriterion("GID <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Long> values) {
            addCriterion("GID in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Long> values) {
            addCriterion("GID not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Long value1, Long value2) {
            addCriterion("GID between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Long value1, Long value2) {
            addCriterion("GID not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("GNAME is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("GNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("GNAME =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("GNAME <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("GNAME >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("GNAME >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("GNAME <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("GNAME <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("GNAME like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("GNAME not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("GNAME in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("GNAME not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("GNAME between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("GNAME not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnikenameIsNull() {
            addCriterion("GNIKENAME is null");
            return (Criteria) this;
        }

        public Criteria andGnikenameIsNotNull() {
            addCriterion("GNIKENAME is not null");
            return (Criteria) this;
        }

        public Criteria andGnikenameEqualTo(String value) {
            addCriterion("GNIKENAME =", value, "gnikename");
            return (Criteria) this;
        }

        public Criteria andGnikenameNotEqualTo(String value) {
            addCriterion("GNIKENAME <>", value, "gnikename");
            return (Criteria) this;
        }

        public Criteria andGnikenameGreaterThan(String value) {
            addCriterion("GNIKENAME >", value, "gnikename");
            return (Criteria) this;
        }

        public Criteria andGnikenameGreaterThanOrEqualTo(String value) {
            addCriterion("GNIKENAME >=", value, "gnikename");
            return (Criteria) this;
        }

        public Criteria andGnikenameLessThan(String value) {
            addCriterion("GNIKENAME <", value, "gnikename");
            return (Criteria) this;
        }

        public Criteria andGnikenameLessThanOrEqualTo(String value) {
            addCriterion("GNIKENAME <=", value, "gnikename");
            return (Criteria) this;
        }

        public Criteria andGnikenameLike(String value) {
            addCriterion("GNIKENAME like", value, "gnikename");
            return (Criteria) this;
        }

        public Criteria andGnikenameNotLike(String value) {
            addCriterion("GNIKENAME not like", value, "gnikename");
            return (Criteria) this;
        }

        public Criteria andGnikenameIn(List<String> values) {
            addCriterion("GNIKENAME in", values, "gnikename");
            return (Criteria) this;
        }

        public Criteria andGnikenameNotIn(List<String> values) {
            addCriterion("GNIKENAME not in", values, "gnikename");
            return (Criteria) this;
        }

        public Criteria andGnikenameBetween(String value1, String value2) {
            addCriterion("GNIKENAME between", value1, value2, "gnikename");
            return (Criteria) this;
        }

        public Criteria andGnikenameNotBetween(String value1, String value2) {
            addCriterion("GNIKENAME not between", value1, value2, "gnikename");
            return (Criteria) this;
        }

        public Criteria andPersonIsNull() {
            addCriterion("PERSON is null");
            return (Criteria) this;
        }

        public Criteria andPersonIsNotNull() {
            addCriterion("PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEqualTo(String value) {
            addCriterion("PERSON =", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotEqualTo(String value) {
            addCriterion("PERSON <>", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThan(String value) {
            addCriterion("PERSON >", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON >=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThan(String value) {
            addCriterion("PERSON <", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThanOrEqualTo(String value) {
            addCriterion("PERSON <=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLike(String value) {
            addCriterion("PERSON like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotLike(String value) {
            addCriterion("PERSON not like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonIn(List<String> values) {
            addCriterion("PERSON in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotIn(List<String> values) {
            addCriterion("PERSON not in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonBetween(String value1, String value2) {
            addCriterion("PERSON between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotBetween(String value1, String value2) {
            addCriterion("PERSON not between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andMobiletelIsNull() {
            addCriterion("MOBILETEL is null");
            return (Criteria) this;
        }

        public Criteria andMobiletelIsNotNull() {
            addCriterion("MOBILETEL is not null");
            return (Criteria) this;
        }

        public Criteria andMobiletelEqualTo(String value) {
            addCriterion("MOBILETEL =", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelNotEqualTo(String value) {
            addCriterion("MOBILETEL <>", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelGreaterThan(String value) {
            addCriterion("MOBILETEL >", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILETEL >=", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelLessThan(String value) {
            addCriterion("MOBILETEL <", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelLessThanOrEqualTo(String value) {
            addCriterion("MOBILETEL <=", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelLike(String value) {
            addCriterion("MOBILETEL like", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelNotLike(String value) {
            addCriterion("MOBILETEL not like", value, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelIn(List<String> values) {
            addCriterion("MOBILETEL in", values, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelNotIn(List<String> values) {
            addCriterion("MOBILETEL not in", values, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelBetween(String value1, String value2) {
            addCriterion("MOBILETEL between", value1, value2, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andMobiletelNotBetween(String value1, String value2) {
            addCriterion("MOBILETEL not between", value1, value2, "mobiletel");
            return (Criteria) this;
        }

        public Criteria andChuanzhenIsNull() {
            addCriterion("CHUANZHEN is null");
            return (Criteria) this;
        }

        public Criteria andChuanzhenIsNotNull() {
            addCriterion("CHUANZHEN is not null");
            return (Criteria) this;
        }

        public Criteria andChuanzhenEqualTo(String value) {
            addCriterion("CHUANZHEN =", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenNotEqualTo(String value) {
            addCriterion("CHUANZHEN <>", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenGreaterThan(String value) {
            addCriterion("CHUANZHEN >", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenGreaterThanOrEqualTo(String value) {
            addCriterion("CHUANZHEN >=", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenLessThan(String value) {
            addCriterion("CHUANZHEN <", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenLessThanOrEqualTo(String value) {
            addCriterion("CHUANZHEN <=", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenLike(String value) {
            addCriterion("CHUANZHEN like", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenNotLike(String value) {
            addCriterion("CHUANZHEN not like", value, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenIn(List<String> values) {
            addCriterion("CHUANZHEN in", values, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenNotIn(List<String> values) {
            addCriterion("CHUANZHEN not in", values, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenBetween(String value1, String value2) {
            addCriterion("CHUANZHEN between", value1, value2, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andChuanzhenNotBetween(String value1, String value2) {
            addCriterion("CHUANZHEN not between", value1, value2, "chuanzhen");
            return (Criteria) this;
        }

        public Criteria andAdressIsNull() {
            addCriterion("ADRESS is null");
            return (Criteria) this;
        }

        public Criteria andAdressIsNotNull() {
            addCriterion("ADRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAdressEqualTo(String value) {
            addCriterion("ADRESS =", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotEqualTo(String value) {
            addCriterion("ADRESS <>", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThan(String value) {
            addCriterion("ADRESS >", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThanOrEqualTo(String value) {
            addCriterion("ADRESS >=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThan(String value) {
            addCriterion("ADRESS <", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThanOrEqualTo(String value) {
            addCriterion("ADRESS <=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLike(String value) {
            addCriterion("ADRESS like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotLike(String value) {
            addCriterion("ADRESS not like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressIn(List<String> values) {
            addCriterion("ADRESS in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotIn(List<String> values) {
            addCriterion("ADRESS not in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressBetween(String value1, String value2) {
            addCriterion("ADRESS between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotBetween(String value1, String value2) {
            addCriterion("ADRESS not between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andYoubianIsNull() {
            addCriterion("YOUBIAN is null");
            return (Criteria) this;
        }

        public Criteria andYoubianIsNotNull() {
            addCriterion("YOUBIAN is not null");
            return (Criteria) this;
        }

        public Criteria andYoubianEqualTo(String value) {
            addCriterion("YOUBIAN =", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotEqualTo(String value) {
            addCriterion("YOUBIAN <>", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianGreaterThan(String value) {
            addCriterion("YOUBIAN >", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianGreaterThanOrEqualTo(String value) {
            addCriterion("YOUBIAN >=", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLessThan(String value) {
            addCriterion("YOUBIAN <", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLessThanOrEqualTo(String value) {
            addCriterion("YOUBIAN <=", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLike(String value) {
            addCriterion("YOUBIAN like", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotLike(String value) {
            addCriterion("YOUBIAN not like", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianIn(List<String> values) {
            addCriterion("YOUBIAN in", values, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotIn(List<String> values) {
            addCriterion("YOUBIAN not in", values, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianBetween(String value1, String value2) {
            addCriterion("YOUBIAN between", value1, value2, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotBetween(String value1, String value2) {
            addCriterion("YOUBIAN not between", value1, value2, "youbian");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("MAIL is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("MAIL =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("MAIL <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("MAIL >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("MAIL <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("MAIL <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("MAIL like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("MAIL not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("MAIL in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("MAIL not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("MAIL between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("MAIL not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andBankenameIsNull() {
            addCriterion("BANKENAME is null");
            return (Criteria) this;
        }

        public Criteria andBankenameIsNotNull() {
            addCriterion("BANKENAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankenameEqualTo(String value) {
            addCriterion("BANKENAME =", value, "bankename");
            return (Criteria) this;
        }

        public Criteria andBankenameNotEqualTo(String value) {
            addCriterion("BANKENAME <>", value, "bankename");
            return (Criteria) this;
        }

        public Criteria andBankenameGreaterThan(String value) {
            addCriterion("BANKENAME >", value, "bankename");
            return (Criteria) this;
        }

        public Criteria andBankenameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKENAME >=", value, "bankename");
            return (Criteria) this;
        }

        public Criteria andBankenameLessThan(String value) {
            addCriterion("BANKENAME <", value, "bankename");
            return (Criteria) this;
        }

        public Criteria andBankenameLessThanOrEqualTo(String value) {
            addCriterion("BANKENAME <=", value, "bankename");
            return (Criteria) this;
        }

        public Criteria andBankenameLike(String value) {
            addCriterion("BANKENAME like", value, "bankename");
            return (Criteria) this;
        }

        public Criteria andBankenameNotLike(String value) {
            addCriterion("BANKENAME not like", value, "bankename");
            return (Criteria) this;
        }

        public Criteria andBankenameIn(List<String> values) {
            addCriterion("BANKENAME in", values, "bankename");
            return (Criteria) this;
        }

        public Criteria andBankenameNotIn(List<String> values) {
            addCriterion("BANKENAME not in", values, "bankename");
            return (Criteria) this;
        }

        public Criteria andBankenameBetween(String value1, String value2) {
            addCriterion("BANKENAME between", value1, value2, "bankename");
            return (Criteria) this;
        }

        public Criteria andBankenameNotBetween(String value1, String value2) {
            addCriterion("BANKENAME not between", value1, value2, "bankename");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("BANKID is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("BANKID is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(BigDecimal value) {
            addCriterion("BANKID =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(BigDecimal value) {
            addCriterion("BANKID <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(BigDecimal value) {
            addCriterion("BANKID >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKID >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(BigDecimal value) {
            addCriterion("BANKID <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKID <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<BigDecimal> values) {
            addCriterion("BANKID in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<BigDecimal> values) {
            addCriterion("BANKID not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKID between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKID not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andComindexIsNull() {
            addCriterion("COMINDEX is null");
            return (Criteria) this;
        }

        public Criteria andComindexIsNotNull() {
            addCriterion("COMINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andComindexEqualTo(String value) {
            addCriterion("COMINDEX =", value, "comindex");
            return (Criteria) this;
        }

        public Criteria andComindexNotEqualTo(String value) {
            addCriterion("COMINDEX <>", value, "comindex");
            return (Criteria) this;
        }

        public Criteria andComindexGreaterThan(String value) {
            addCriterion("COMINDEX >", value, "comindex");
            return (Criteria) this;
        }

        public Criteria andComindexGreaterThanOrEqualTo(String value) {
            addCriterion("COMINDEX >=", value, "comindex");
            return (Criteria) this;
        }

        public Criteria andComindexLessThan(String value) {
            addCriterion("COMINDEX <", value, "comindex");
            return (Criteria) this;
        }

        public Criteria andComindexLessThanOrEqualTo(String value) {
            addCriterion("COMINDEX <=", value, "comindex");
            return (Criteria) this;
        }

        public Criteria andComindexLike(String value) {
            addCriterion("COMINDEX like", value, "comindex");
            return (Criteria) this;
        }

        public Criteria andComindexNotLike(String value) {
            addCriterion("COMINDEX not like", value, "comindex");
            return (Criteria) this;
        }

        public Criteria andComindexIn(List<String> values) {
            addCriterion("COMINDEX in", values, "comindex");
            return (Criteria) this;
        }

        public Criteria andComindexNotIn(List<String> values) {
            addCriterion("COMINDEX not in", values, "comindex");
            return (Criteria) this;
        }

        public Criteria andComindexBetween(String value1, String value2) {
            addCriterion("COMINDEX between", value1, value2, "comindex");
            return (Criteria) this;
        }

        public Criteria andComindexNotBetween(String value1, String value2) {
            addCriterion("COMINDEX not between", value1, value2, "comindex");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNull() {
            addCriterion("ISUSED is null");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNotNull() {
            addCriterion("ISUSED is not null");
            return (Criteria) this;
        }

        public Criteria andIsusedEqualTo(String value) {
            addCriterion("ISUSED =", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotEqualTo(String value) {
            addCriterion("ISUSED <>", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThan(String value) {
            addCriterion("ISUSED >", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThanOrEqualTo(String value) {
            addCriterion("ISUSED >=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThan(String value) {
            addCriterion("ISUSED <", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThanOrEqualTo(String value) {
            addCriterion("ISUSED <=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLike(String value) {
            addCriterion("ISUSED like", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotLike(String value) {
            addCriterion("ISUSED not like", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedIn(List<String> values) {
            addCriterion("ISUSED in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotIn(List<String> values) {
            addCriterion("ISUSED not in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedBetween(String value1, String value2) {
            addCriterion("ISUSED between", value1, value2, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotBetween(String value1, String value2) {
            addCriterion("ISUSED not between", value1, value2, "isused");
            return (Criteria) this;
        }

        public Criteria andCtlpersonIsNull() {
            addCriterion("CTLPERSON is null");
            return (Criteria) this;
        }

        public Criteria andCtlpersonIsNotNull() {
            addCriterion("CTLPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andCtlpersonEqualTo(String value) {
            addCriterion("CTLPERSON =", value, "ctlperson");
            return (Criteria) this;
        }

        public Criteria andCtlpersonNotEqualTo(String value) {
            addCriterion("CTLPERSON <>", value, "ctlperson");
            return (Criteria) this;
        }

        public Criteria andCtlpersonGreaterThan(String value) {
            addCriterion("CTLPERSON >", value, "ctlperson");
            return (Criteria) this;
        }

        public Criteria andCtlpersonGreaterThanOrEqualTo(String value) {
            addCriterion("CTLPERSON >=", value, "ctlperson");
            return (Criteria) this;
        }

        public Criteria andCtlpersonLessThan(String value) {
            addCriterion("CTLPERSON <", value, "ctlperson");
            return (Criteria) this;
        }

        public Criteria andCtlpersonLessThanOrEqualTo(String value) {
            addCriterion("CTLPERSON <=", value, "ctlperson");
            return (Criteria) this;
        }

        public Criteria andCtlpersonLike(String value) {
            addCriterion("CTLPERSON like", value, "ctlperson");
            return (Criteria) this;
        }

        public Criteria andCtlpersonNotLike(String value) {
            addCriterion("CTLPERSON not like", value, "ctlperson");
            return (Criteria) this;
        }

        public Criteria andCtlpersonIn(List<String> values) {
            addCriterion("CTLPERSON in", values, "ctlperson");
            return (Criteria) this;
        }

        public Criteria andCtlpersonNotIn(List<String> values) {
            addCriterion("CTLPERSON not in", values, "ctlperson");
            return (Criteria) this;
        }

        public Criteria andCtlpersonBetween(String value1, String value2) {
            addCriterion("CTLPERSON between", value1, value2, "ctlperson");
            return (Criteria) this;
        }

        public Criteria andCtlpersonNotBetween(String value1, String value2) {
            addCriterion("CTLPERSON not between", value1, value2, "ctlperson");
            return (Criteria) this;
        }

        public Criteria andRemakersIsNull() {
            addCriterion("REMAKERS is null");
            return (Criteria) this;
        }

        public Criteria andRemakersIsNotNull() {
            addCriterion("REMAKERS is not null");
            return (Criteria) this;
        }

        public Criteria andRemakersEqualTo(String value) {
            addCriterion("REMAKERS =", value, "remakers");
            return (Criteria) this;
        }

        public Criteria andRemakersNotEqualTo(String value) {
            addCriterion("REMAKERS <>", value, "remakers");
            return (Criteria) this;
        }

        public Criteria andRemakersGreaterThan(String value) {
            addCriterion("REMAKERS >", value, "remakers");
            return (Criteria) this;
        }

        public Criteria andRemakersGreaterThanOrEqualTo(String value) {
            addCriterion("REMAKERS >=", value, "remakers");
            return (Criteria) this;
        }

        public Criteria andRemakersLessThan(String value) {
            addCriterion("REMAKERS <", value, "remakers");
            return (Criteria) this;
        }

        public Criteria andRemakersLessThanOrEqualTo(String value) {
            addCriterion("REMAKERS <=", value, "remakers");
            return (Criteria) this;
        }

        public Criteria andRemakersLike(String value) {
            addCriterion("REMAKERS like", value, "remakers");
            return (Criteria) this;
        }

        public Criteria andRemakersNotLike(String value) {
            addCriterion("REMAKERS not like", value, "remakers");
            return (Criteria) this;
        }

        public Criteria andRemakersIn(List<String> values) {
            addCriterion("REMAKERS in", values, "remakers");
            return (Criteria) this;
        }

        public Criteria andRemakersNotIn(List<String> values) {
            addCriterion("REMAKERS not in", values, "remakers");
            return (Criteria) this;
        }

        public Criteria andRemakersBetween(String value1, String value2) {
            addCriterion("REMAKERS between", value1, value2, "remakers");
            return (Criteria) this;
        }

        public Criteria andRemakersNotBetween(String value1, String value2) {
            addCriterion("REMAKERS not between", value1, value2, "remakers");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("CID is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("CID is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(BigDecimal value) {
            addCriterion("CID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(BigDecimal value) {
            addCriterion("CID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(BigDecimal value) {
            addCriterion("CID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(BigDecimal value) {
            addCriterion("CID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<BigDecimal> values) {
            addCriterion("CID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<BigDecimal> values) {
            addCriterion("CID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CID not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("LASTNAME is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("LASTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(Date value) {
            addCriterion("LASTNAME =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(Date value) {
            addCriterion("LASTNAME <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(Date value) {
            addCriterion("LASTNAME >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTNAME >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(Date value) {
            addCriterion("LASTNAME <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(Date value) {
            addCriterion("LASTNAME <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<Date> values) {
            addCriterion("LASTNAME in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<Date> values) {
            addCriterion("LASTNAME not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(Date value1, Date value2) {
            addCriterion("LASTNAME between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(Date value1, Date value2) {
            addCriterion("LASTNAME not between", value1, value2, "lastname");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}