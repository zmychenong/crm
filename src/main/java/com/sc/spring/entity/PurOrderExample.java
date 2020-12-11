package com.sc.spring.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurOrderExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("OID is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("OID is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Long value) {
            addCriterion("OID =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Long value) {
            addCriterion("OID <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Long value) {
            addCriterion("OID >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Long value) {
            addCriterion("OID >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Long value) {
            addCriterion("OID <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Long value) {
            addCriterion("OID <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Long> values) {
            addCriterion("OID in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Long> values) {
            addCriterion("OID not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Long value1, Long value2) {
            addCriterion("OID between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Long value1, Long value2) {
            addCriterion("OID not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andTheymIsNull() {
            addCriterion("THEYM is null");
            return (Criteria) this;
        }

        public Criteria andTheymIsNotNull() {
            addCriterion("THEYM is not null");
            return (Criteria) this;
        }

        public Criteria andTheymEqualTo(String value) {
            addCriterion("THEYM =", value, "theym");
            return (Criteria) this;
        }

        public Criteria andTheymNotEqualTo(String value) {
            addCriterion("THEYM <>", value, "theym");
            return (Criteria) this;
        }

        public Criteria andTheymGreaterThan(String value) {
            addCriterion("THEYM >", value, "theym");
            return (Criteria) this;
        }

        public Criteria andTheymGreaterThanOrEqualTo(String value) {
            addCriterion("THEYM >=", value, "theym");
            return (Criteria) this;
        }

        public Criteria andTheymLessThan(String value) {
            addCriterion("THEYM <", value, "theym");
            return (Criteria) this;
        }

        public Criteria andTheymLessThanOrEqualTo(String value) {
            addCriterion("THEYM <=", value, "theym");
            return (Criteria) this;
        }

        public Criteria andTheymLike(String value) {
            addCriterion("THEYM like", value, "theym");
            return (Criteria) this;
        }

        public Criteria andTheymNotLike(String value) {
            addCriterion("THEYM not like", value, "theym");
            return (Criteria) this;
        }

        public Criteria andTheymIn(List<String> values) {
            addCriterion("THEYM in", values, "theym");
            return (Criteria) this;
        }

        public Criteria andTheymNotIn(List<String> values) {
            addCriterion("THEYM not in", values, "theym");
            return (Criteria) this;
        }

        public Criteria andTheymBetween(String value1, String value2) {
            addCriterion("THEYM between", value1, value2, "theym");
            return (Criteria) this;
        }

        public Criteria andTheymNotBetween(String value1, String value2) {
            addCriterion("THEYM not between", value1, value2, "theym");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("ORDERDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("ORDERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterion("ORDERDATE =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterion("ORDERDATE <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterion("ORDERDATE >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDERDATE >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterion("ORDERDATE <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterion("ORDERDATE <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterion("ORDERDATE in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterion("ORDERDATE not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterion("ORDERDATE between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterion("ORDERDATE not between", value1, value2, "orderdate");
            return (Criteria) this;
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

        public Criteria andMoneyIsNull() {
            addCriterion("MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("MONEY =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("MONEY <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("MONEY >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("MONEY >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("MONEY <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("MONEY <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("MONEY like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("MONEY not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("MONEY in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("MONEY not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("MONEY between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("MONEY not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andFapiaoidIsNull() {
            addCriterion("FAPIAOID is null");
            return (Criteria) this;
        }

        public Criteria andFapiaoidIsNotNull() {
            addCriterion("FAPIAOID is not null");
            return (Criteria) this;
        }

        public Criteria andFapiaoidEqualTo(Long value) {
            addCriterion("FAPIAOID =", value, "fapiaoid");
            return (Criteria) this;
        }

        public Criteria andFapiaoidNotEqualTo(Long value) {
            addCriterion("FAPIAOID <>", value, "fapiaoid");
            return (Criteria) this;
        }

        public Criteria andFapiaoidGreaterThan(Long value) {
            addCriterion("FAPIAOID >", value, "fapiaoid");
            return (Criteria) this;
        }

        public Criteria andFapiaoidGreaterThanOrEqualTo(Long value) {
            addCriterion("FAPIAOID >=", value, "fapiaoid");
            return (Criteria) this;
        }

        public Criteria andFapiaoidLessThan(Long value) {
            addCriterion("FAPIAOID <", value, "fapiaoid");
            return (Criteria) this;
        }

        public Criteria andFapiaoidLessThanOrEqualTo(Long value) {
            addCriterion("FAPIAOID <=", value, "fapiaoid");
            return (Criteria) this;
        }

        public Criteria andFapiaoidIn(List<Long> values) {
            addCriterion("FAPIAOID in", values, "fapiaoid");
            return (Criteria) this;
        }

        public Criteria andFapiaoidNotIn(List<Long> values) {
            addCriterion("FAPIAOID not in", values, "fapiaoid");
            return (Criteria) this;
        }

        public Criteria andFapiaoidBetween(Long value1, Long value2) {
            addCriterion("FAPIAOID between", value1, value2, "fapiaoid");
            return (Criteria) this;
        }

        public Criteria andFapiaoidNotBetween(Long value1, Long value2) {
            addCriterion("FAPIAOID not between", value1, value2, "fapiaoid");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuIsNull() {
            addCriterion("FUKUANSTATU is null");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuIsNotNull() {
            addCriterion("FUKUANSTATU is not null");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuEqualTo(String value) {
            addCriterion("FUKUANSTATU =", value, "fukuanstatu");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuNotEqualTo(String value) {
            addCriterion("FUKUANSTATU <>", value, "fukuanstatu");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuGreaterThan(String value) {
            addCriterion("FUKUANSTATU >", value, "fukuanstatu");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuGreaterThanOrEqualTo(String value) {
            addCriterion("FUKUANSTATU >=", value, "fukuanstatu");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuLessThan(String value) {
            addCriterion("FUKUANSTATU <", value, "fukuanstatu");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuLessThanOrEqualTo(String value) {
            addCriterion("FUKUANSTATU <=", value, "fukuanstatu");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuLike(String value) {
            addCriterion("FUKUANSTATU like", value, "fukuanstatu");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuNotLike(String value) {
            addCriterion("FUKUANSTATU not like", value, "fukuanstatu");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuIn(List<String> values) {
            addCriterion("FUKUANSTATU in", values, "fukuanstatu");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuNotIn(List<String> values) {
            addCriterion("FUKUANSTATU not in", values, "fukuanstatu");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuBetween(String value1, String value2) {
            addCriterion("FUKUANSTATU between", value1, value2, "fukuanstatu");
            return (Criteria) this;
        }

        public Criteria andFukuanstatuNotBetween(String value1, String value2) {
            addCriterion("FUKUANSTATU not between", value1, value2, "fukuanstatu");
            return (Criteria) this;
        }

        public Criteria andOjinzhanIsNull() {
            addCriterion("OJINZHAN is null");
            return (Criteria) this;
        }

        public Criteria andOjinzhanIsNotNull() {
            addCriterion("OJINZHAN is not null");
            return (Criteria) this;
        }

        public Criteria andOjinzhanEqualTo(String value) {
            addCriterion("OJINZHAN =", value, "ojinzhan");
            return (Criteria) this;
        }

        public Criteria andOjinzhanNotEqualTo(String value) {
            addCriterion("OJINZHAN <>", value, "ojinzhan");
            return (Criteria) this;
        }

        public Criteria andOjinzhanGreaterThan(String value) {
            addCriterion("OJINZHAN >", value, "ojinzhan");
            return (Criteria) this;
        }

        public Criteria andOjinzhanGreaterThanOrEqualTo(String value) {
            addCriterion("OJINZHAN >=", value, "ojinzhan");
            return (Criteria) this;
        }

        public Criteria andOjinzhanLessThan(String value) {
            addCriterion("OJINZHAN <", value, "ojinzhan");
            return (Criteria) this;
        }

        public Criteria andOjinzhanLessThanOrEqualTo(String value) {
            addCriterion("OJINZHAN <=", value, "ojinzhan");
            return (Criteria) this;
        }

        public Criteria andOjinzhanLike(String value) {
            addCriterion("OJINZHAN like", value, "ojinzhan");
            return (Criteria) this;
        }

        public Criteria andOjinzhanNotLike(String value) {
            addCriterion("OJINZHAN not like", value, "ojinzhan");
            return (Criteria) this;
        }

        public Criteria andOjinzhanIn(List<String> values) {
            addCriterion("OJINZHAN in", values, "ojinzhan");
            return (Criteria) this;
        }

        public Criteria andOjinzhanNotIn(List<String> values) {
            addCriterion("OJINZHAN not in", values, "ojinzhan");
            return (Criteria) this;
        }

        public Criteria andOjinzhanBetween(String value1, String value2) {
            addCriterion("OJINZHAN between", value1, value2, "ojinzhan");
            return (Criteria) this;
        }

        public Criteria andOjinzhanNotBetween(String value1, String value2) {
            addCriterion("OJINZHAN not between", value1, value2, "ojinzhan");
            return (Criteria) this;
        }

        public Criteria andGivedateIsNull() {
            addCriterion("GIVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andGivedateIsNotNull() {
            addCriterion("GIVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andGivedateEqualTo(Date value) {
            addCriterion("GIVEDATE =", value, "givedate");
            return (Criteria) this;
        }

        public Criteria andGivedateNotEqualTo(Date value) {
            addCriterion("GIVEDATE <>", value, "givedate");
            return (Criteria) this;
        }

        public Criteria andGivedateGreaterThan(Date value) {
            addCriterion("GIVEDATE >", value, "givedate");
            return (Criteria) this;
        }

        public Criteria andGivedateGreaterThanOrEqualTo(Date value) {
            addCriterion("GIVEDATE >=", value, "givedate");
            return (Criteria) this;
        }

        public Criteria andGivedateLessThan(Date value) {
            addCriterion("GIVEDATE <", value, "givedate");
            return (Criteria) this;
        }

        public Criteria andGivedateLessThanOrEqualTo(Date value) {
            addCriterion("GIVEDATE <=", value, "givedate");
            return (Criteria) this;
        }

        public Criteria andGivedateIn(List<Date> values) {
            addCriterion("GIVEDATE in", values, "givedate");
            return (Criteria) this;
        }

        public Criteria andGivedateNotIn(List<Date> values) {
            addCriterion("GIVEDATE not in", values, "givedate");
            return (Criteria) this;
        }

        public Criteria andGivedateBetween(Date value1, Date value2) {
            addCriterion("GIVEDATE between", value1, value2, "givedate");
            return (Criteria) this;
        }

        public Criteria andGivedateNotBetween(Date value1, Date value2) {
            addCriterion("GIVEDATE not between", value1, value2, "givedate");
            return (Criteria) this;
        }

        public Criteria andGiveplaceIsNull() {
            addCriterion("GIVEPLACE is null");
            return (Criteria) this;
        }

        public Criteria andGiveplaceIsNotNull() {
            addCriterion("GIVEPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andGiveplaceEqualTo(String value) {
            addCriterion("GIVEPLACE =", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceNotEqualTo(String value) {
            addCriterion("GIVEPLACE <>", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceGreaterThan(String value) {
            addCriterion("GIVEPLACE >", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceGreaterThanOrEqualTo(String value) {
            addCriterion("GIVEPLACE >=", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceLessThan(String value) {
            addCriterion("GIVEPLACE <", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceLessThanOrEqualTo(String value) {
            addCriterion("GIVEPLACE <=", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceLike(String value) {
            addCriterion("GIVEPLACE like", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceNotLike(String value) {
            addCriterion("GIVEPLACE not like", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceIn(List<String> values) {
            addCriterion("GIVEPLACE in", values, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceNotIn(List<String> values) {
            addCriterion("GIVEPLACE not in", values, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceBetween(String value1, String value2) {
            addCriterion("GIVEPLACE between", value1, value2, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceNotBetween(String value1, String value2) {
            addCriterion("GIVEPLACE not between", value1, value2, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGivewayIsNull() {
            addCriterion("GIVEWAY is null");
            return (Criteria) this;
        }

        public Criteria andGivewayIsNotNull() {
            addCriterion("GIVEWAY is not null");
            return (Criteria) this;
        }

        public Criteria andGivewayEqualTo(String value) {
            addCriterion("GIVEWAY =", value, "giveway");
            return (Criteria) this;
        }

        public Criteria andGivewayNotEqualTo(String value) {
            addCriterion("GIVEWAY <>", value, "giveway");
            return (Criteria) this;
        }

        public Criteria andGivewayGreaterThan(String value) {
            addCriterion("GIVEWAY >", value, "giveway");
            return (Criteria) this;
        }

        public Criteria andGivewayGreaterThanOrEqualTo(String value) {
            addCriterion("GIVEWAY >=", value, "giveway");
            return (Criteria) this;
        }

        public Criteria andGivewayLessThan(String value) {
            addCriterion("GIVEWAY <", value, "giveway");
            return (Criteria) this;
        }

        public Criteria andGivewayLessThanOrEqualTo(String value) {
            addCriterion("GIVEWAY <=", value, "giveway");
            return (Criteria) this;
        }

        public Criteria andGivewayLike(String value) {
            addCriterion("GIVEWAY like", value, "giveway");
            return (Criteria) this;
        }

        public Criteria andGivewayNotLike(String value) {
            addCriterion("GIVEWAY not like", value, "giveway");
            return (Criteria) this;
        }

        public Criteria andGivewayIn(List<String> values) {
            addCriterion("GIVEWAY in", values, "giveway");
            return (Criteria) this;
        }

        public Criteria andGivewayNotIn(List<String> values) {
            addCriterion("GIVEWAY not in", values, "giveway");
            return (Criteria) this;
        }

        public Criteria andGivewayBetween(String value1, String value2) {
            addCriterion("GIVEWAY between", value1, value2, "giveway");
            return (Criteria) this;
        }

        public Criteria andGivewayNotBetween(String value1, String value2) {
            addCriterion("GIVEWAY not between", value1, value2, "giveway");
            return (Criteria) this;
        }

        public Criteria andContronerIsNull() {
            addCriterion("CONTRONER is null");
            return (Criteria) this;
        }

        public Criteria andContronerIsNotNull() {
            addCriterion("CONTRONER is not null");
            return (Criteria) this;
        }

        public Criteria andContronerEqualTo(String value) {
            addCriterion("CONTRONER =", value, "controner");
            return (Criteria) this;
        }

        public Criteria andContronerNotEqualTo(String value) {
            addCriterion("CONTRONER <>", value, "controner");
            return (Criteria) this;
        }

        public Criteria andContronerGreaterThan(String value) {
            addCriterion("CONTRONER >", value, "controner");
            return (Criteria) this;
        }

        public Criteria andContronerGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRONER >=", value, "controner");
            return (Criteria) this;
        }

        public Criteria andContronerLessThan(String value) {
            addCriterion("CONTRONER <", value, "controner");
            return (Criteria) this;
        }

        public Criteria andContronerLessThanOrEqualTo(String value) {
            addCriterion("CONTRONER <=", value, "controner");
            return (Criteria) this;
        }

        public Criteria andContronerLike(String value) {
            addCriterion("CONTRONER like", value, "controner");
            return (Criteria) this;
        }

        public Criteria andContronerNotLike(String value) {
            addCriterion("CONTRONER not like", value, "controner");
            return (Criteria) this;
        }

        public Criteria andContronerIn(List<String> values) {
            addCriterion("CONTRONER in", values, "controner");
            return (Criteria) this;
        }

        public Criteria andContronerNotIn(List<String> values) {
            addCriterion("CONTRONER not in", values, "controner");
            return (Criteria) this;
        }

        public Criteria andContronerBetween(String value1, String value2) {
            addCriterion("CONTRONER between", value1, value2, "controner");
            return (Criteria) this;
        }

        public Criteria andContronerNotBetween(String value1, String value2) {
            addCriterion("CONTRONER not between", value1, value2, "controner");
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

        public Criteria andCidEqualTo(Long value) {
            addCriterion("CID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("CID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("CID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("CID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("CID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("CID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("CID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("CID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("CID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("CID not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("LASTTIME is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("LASTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(Date value) {
            addCriterion("LASTTIME =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(Date value) {
            addCriterion("LASTTIME <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(Date value) {
            addCriterion("LASTTIME >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTTIME >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(Date value) {
            addCriterion("LASTTIME <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTTIME <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<Date> values) {
            addCriterion("LASTTIME in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<Date> values) {
            addCriterion("LASTTIME not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(Date value1, Date value2) {
            addCriterion("LASTTIME between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTTIME not between", value1, value2, "lasttime");
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