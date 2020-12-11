package com.sc.spring.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleClientmesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleClientmesExample() {
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

        public Criteria andClientnumIsNull() {
            addCriterion("CLIENTNUM is null");
            return (Criteria) this;
        }

        public Criteria andClientnumIsNotNull() {
            addCriterion("CLIENTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andClientnumEqualTo(BigDecimal value) {
            addCriterion("CLIENTNUM =", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumNotEqualTo(BigDecimal value) {
            addCriterion("CLIENTNUM <>", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumGreaterThan(BigDecimal value) {
            addCriterion("CLIENTNUM >", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLIENTNUM >=", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumLessThan(BigDecimal value) {
            addCriterion("CLIENTNUM <", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLIENTNUM <=", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumIn(List<BigDecimal> values) {
            addCriterion("CLIENTNUM in", values, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumNotIn(List<BigDecimal> values) {
            addCriterion("CLIENTNUM not in", values, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLIENTNUM between", value1, value2, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLIENTNUM not between", value1, value2, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNull() {
            addCriterion("CLIENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNotNull() {
            addCriterion("CLIENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andClientnameEqualTo(String value) {
            addCriterion("CLIENTNAME =", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotEqualTo(String value) {
            addCriterion("CLIENTNAME <>", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThan(String value) {
            addCriterion("CLIENTNAME >", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTNAME >=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThan(String value) {
            addCriterion("CLIENTNAME <", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThanOrEqualTo(String value) {
            addCriterion("CLIENTNAME <=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLike(String value) {
            addCriterion("CLIENTNAME like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotLike(String value) {
            addCriterion("CLIENTNAME not like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameIn(List<String> values) {
            addCriterion("CLIENTNAME in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotIn(List<String> values) {
            addCriterion("CLIENTNAME not in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameBetween(String value1, String value2) {
            addCriterion("CLIENTNAME between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotBetween(String value1, String value2) {
            addCriterion("CLIENTNAME not between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientattrIsNull() {
            addCriterion("CLIENTATTR is null");
            return (Criteria) this;
        }

        public Criteria andClientattrIsNotNull() {
            addCriterion("CLIENTATTR is not null");
            return (Criteria) this;
        }

        public Criteria andClientattrEqualTo(String value) {
            addCriterion("CLIENTATTR =", value, "clientattr");
            return (Criteria) this;
        }

        public Criteria andClientattrNotEqualTo(String value) {
            addCriterion("CLIENTATTR <>", value, "clientattr");
            return (Criteria) this;
        }

        public Criteria andClientattrGreaterThan(String value) {
            addCriterion("CLIENTATTR >", value, "clientattr");
            return (Criteria) this;
        }

        public Criteria andClientattrGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTATTR >=", value, "clientattr");
            return (Criteria) this;
        }

        public Criteria andClientattrLessThan(String value) {
            addCriterion("CLIENTATTR <", value, "clientattr");
            return (Criteria) this;
        }

        public Criteria andClientattrLessThanOrEqualTo(String value) {
            addCriterion("CLIENTATTR <=", value, "clientattr");
            return (Criteria) this;
        }

        public Criteria andClientattrLike(String value) {
            addCriterion("CLIENTATTR like", value, "clientattr");
            return (Criteria) this;
        }

        public Criteria andClientattrNotLike(String value) {
            addCriterion("CLIENTATTR not like", value, "clientattr");
            return (Criteria) this;
        }

        public Criteria andClientattrIn(List<String> values) {
            addCriterion("CLIENTATTR in", values, "clientattr");
            return (Criteria) this;
        }

        public Criteria andClientattrNotIn(List<String> values) {
            addCriterion("CLIENTATTR not in", values, "clientattr");
            return (Criteria) this;
        }

        public Criteria andClientattrBetween(String value1, String value2) {
            addCriterion("CLIENTATTR between", value1, value2, "clientattr");
            return (Criteria) this;
        }

        public Criteria andClientattrNotBetween(String value1, String value2) {
            addCriterion("CLIENTATTR not between", value1, value2, "clientattr");
            return (Criteria) this;
        }

        public Criteria andCrlIsNull() {
            addCriterion("CRL is null");
            return (Criteria) this;
        }

        public Criteria andCrlIsNotNull() {
            addCriterion("CRL is not null");
            return (Criteria) this;
        }

        public Criteria andCrlEqualTo(String value) {
            addCriterion("CRL =", value, "crl");
            return (Criteria) this;
        }

        public Criteria andCrlNotEqualTo(String value) {
            addCriterion("CRL <>", value, "crl");
            return (Criteria) this;
        }

        public Criteria andCrlGreaterThan(String value) {
            addCriterion("CRL >", value, "crl");
            return (Criteria) this;
        }

        public Criteria andCrlGreaterThanOrEqualTo(String value) {
            addCriterion("CRL >=", value, "crl");
            return (Criteria) this;
        }

        public Criteria andCrlLessThan(String value) {
            addCriterion("CRL <", value, "crl");
            return (Criteria) this;
        }

        public Criteria andCrlLessThanOrEqualTo(String value) {
            addCriterion("CRL <=", value, "crl");
            return (Criteria) this;
        }

        public Criteria andCrlLike(String value) {
            addCriterion("CRL like", value, "crl");
            return (Criteria) this;
        }

        public Criteria andCrlNotLike(String value) {
            addCriterion("CRL not like", value, "crl");
            return (Criteria) this;
        }

        public Criteria andCrlIn(List<String> values) {
            addCriterion("CRL in", values, "crl");
            return (Criteria) this;
        }

        public Criteria andCrlNotIn(List<String> values) {
            addCriterion("CRL not in", values, "crl");
            return (Criteria) this;
        }

        public Criteria andCrlBetween(String value1, String value2) {
            addCriterion("CRL between", value1, value2, "crl");
            return (Criteria) this;
        }

        public Criteria andCrlNotBetween(String value1, String value2) {
            addCriterion("CRL not between", value1, value2, "crl");
            return (Criteria) this;
        }

        public Criteria andGupiaodmIsNull() {
            addCriterion("GUPIAODM is null");
            return (Criteria) this;
        }

        public Criteria andGupiaodmIsNotNull() {
            addCriterion("GUPIAODM is not null");
            return (Criteria) this;
        }

        public Criteria andGupiaodmEqualTo(String value) {
            addCriterion("GUPIAODM =", value, "gupiaodm");
            return (Criteria) this;
        }

        public Criteria andGupiaodmNotEqualTo(String value) {
            addCriterion("GUPIAODM <>", value, "gupiaodm");
            return (Criteria) this;
        }

        public Criteria andGupiaodmGreaterThan(String value) {
            addCriterion("GUPIAODM >", value, "gupiaodm");
            return (Criteria) this;
        }

        public Criteria andGupiaodmGreaterThanOrEqualTo(String value) {
            addCriterion("GUPIAODM >=", value, "gupiaodm");
            return (Criteria) this;
        }

        public Criteria andGupiaodmLessThan(String value) {
            addCriterion("GUPIAODM <", value, "gupiaodm");
            return (Criteria) this;
        }

        public Criteria andGupiaodmLessThanOrEqualTo(String value) {
            addCriterion("GUPIAODM <=", value, "gupiaodm");
            return (Criteria) this;
        }

        public Criteria andGupiaodmLike(String value) {
            addCriterion("GUPIAODM like", value, "gupiaodm");
            return (Criteria) this;
        }

        public Criteria andGupiaodmNotLike(String value) {
            addCriterion("GUPIAODM not like", value, "gupiaodm");
            return (Criteria) this;
        }

        public Criteria andGupiaodmIn(List<String> values) {
            addCriterion("GUPIAODM in", values, "gupiaodm");
            return (Criteria) this;
        }

        public Criteria andGupiaodmNotIn(List<String> values) {
            addCriterion("GUPIAODM not in", values, "gupiaodm");
            return (Criteria) this;
        }

        public Criteria andGupiaodmBetween(String value1, String value2) {
            addCriterion("GUPIAODM between", value1, value2, "gupiaodm");
            return (Criteria) this;
        }

        public Criteria andGupiaodmNotBetween(String value1, String value2) {
            addCriterion("GUPIAODM not between", value1, value2, "gupiaodm");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("LEADER is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("LEADER =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("LEADER <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("LEADER >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("LEADER >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("LEADER <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("LEADER <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("LEADER like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("LEADER not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("LEADER in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("LEADER not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("LEADER between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("LEADER not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("\"OWNER\" is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("\"OWNER\" is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("\"OWNER\" =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("\"OWNER\" <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("\"OWNER\" >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("\"OWNER\" >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("\"OWNER\" <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("\"OWNER\" <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("\"OWNER\" like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("\"OWNER\" not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("\"OWNER\" in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("\"OWNER\" not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("\"OWNER\" between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("\"OWNER\" not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andEmployesnumIsNull() {
            addCriterion("EMPLOYESNUM is null");
            return (Criteria) this;
        }

        public Criteria andEmployesnumIsNotNull() {
            addCriterion("EMPLOYESNUM is not null");
            return (Criteria) this;
        }

        public Criteria andEmployesnumEqualTo(BigDecimal value) {
            addCriterion("EMPLOYESNUM =", value, "employesnum");
            return (Criteria) this;
        }

        public Criteria andEmployesnumNotEqualTo(BigDecimal value) {
            addCriterion("EMPLOYESNUM <>", value, "employesnum");
            return (Criteria) this;
        }

        public Criteria andEmployesnumGreaterThan(BigDecimal value) {
            addCriterion("EMPLOYESNUM >", value, "employesnum");
            return (Criteria) this;
        }

        public Criteria andEmployesnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EMPLOYESNUM >=", value, "employesnum");
            return (Criteria) this;
        }

        public Criteria andEmployesnumLessThan(BigDecimal value) {
            addCriterion("EMPLOYESNUM <", value, "employesnum");
            return (Criteria) this;
        }

        public Criteria andEmployesnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EMPLOYESNUM <=", value, "employesnum");
            return (Criteria) this;
        }

        public Criteria andEmployesnumIn(List<BigDecimal> values) {
            addCriterion("EMPLOYESNUM in", values, "employesnum");
            return (Criteria) this;
        }

        public Criteria andEmployesnumNotIn(List<BigDecimal> values) {
            addCriterion("EMPLOYESNUM not in", values, "employesnum");
            return (Criteria) this;
        }

        public Criteria andEmployesnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMPLOYESNUM between", value1, value2, "employesnum");
            return (Criteria) this;
        }

        public Criteria andEmployesnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMPLOYESNUM not between", value1, value2, "employesnum");
            return (Criteria) this;
        }

        public Criteria andIndustrynumIsNull() {
            addCriterion("INDUSTRYNUM is null");
            return (Criteria) this;
        }

        public Criteria andIndustrynumIsNotNull() {
            addCriterion("INDUSTRYNUM is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrynumEqualTo(BigDecimal value) {
            addCriterion("INDUSTRYNUM =", value, "industrynum");
            return (Criteria) this;
        }

        public Criteria andIndustrynumNotEqualTo(BigDecimal value) {
            addCriterion("INDUSTRYNUM <>", value, "industrynum");
            return (Criteria) this;
        }

        public Criteria andIndustrynumGreaterThan(BigDecimal value) {
            addCriterion("INDUSTRYNUM >", value, "industrynum");
            return (Criteria) this;
        }

        public Criteria andIndustrynumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INDUSTRYNUM >=", value, "industrynum");
            return (Criteria) this;
        }

        public Criteria andIndustrynumLessThan(BigDecimal value) {
            addCriterion("INDUSTRYNUM <", value, "industrynum");
            return (Criteria) this;
        }

        public Criteria andIndustrynumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INDUSTRYNUM <=", value, "industrynum");
            return (Criteria) this;
        }

        public Criteria andIndustrynumIn(List<BigDecimal> values) {
            addCriterion("INDUSTRYNUM in", values, "industrynum");
            return (Criteria) this;
        }

        public Criteria andIndustrynumNotIn(List<BigDecimal> values) {
            addCriterion("INDUSTRYNUM not in", values, "industrynum");
            return (Criteria) this;
        }

        public Criteria andIndustrynumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INDUSTRYNUM between", value1, value2, "industrynum");
            return (Criteria) this;
        }

        public Criteria andIndustrynumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INDUSTRYNUM not between", value1, value2, "industrynum");
            return (Criteria) this;
        }

        public Criteria andClientkindsIsNull() {
            addCriterion("CLIENTKINDS is null");
            return (Criteria) this;
        }

        public Criteria andClientkindsIsNotNull() {
            addCriterion("CLIENTKINDS is not null");
            return (Criteria) this;
        }

        public Criteria andClientkindsEqualTo(String value) {
            addCriterion("CLIENTKINDS =", value, "clientkinds");
            return (Criteria) this;
        }

        public Criteria andClientkindsNotEqualTo(String value) {
            addCriterion("CLIENTKINDS <>", value, "clientkinds");
            return (Criteria) this;
        }

        public Criteria andClientkindsGreaterThan(String value) {
            addCriterion("CLIENTKINDS >", value, "clientkinds");
            return (Criteria) this;
        }

        public Criteria andClientkindsGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTKINDS >=", value, "clientkinds");
            return (Criteria) this;
        }

        public Criteria andClientkindsLessThan(String value) {
            addCriterion("CLIENTKINDS <", value, "clientkinds");
            return (Criteria) this;
        }

        public Criteria andClientkindsLessThanOrEqualTo(String value) {
            addCriterion("CLIENTKINDS <=", value, "clientkinds");
            return (Criteria) this;
        }

        public Criteria andClientkindsLike(String value) {
            addCriterion("CLIENTKINDS like", value, "clientkinds");
            return (Criteria) this;
        }

        public Criteria andClientkindsNotLike(String value) {
            addCriterion("CLIENTKINDS not like", value, "clientkinds");
            return (Criteria) this;
        }

        public Criteria andClientkindsIn(List<String> values) {
            addCriterion("CLIENTKINDS in", values, "clientkinds");
            return (Criteria) this;
        }

        public Criteria andClientkindsNotIn(List<String> values) {
            addCriterion("CLIENTKINDS not in", values, "clientkinds");
            return (Criteria) this;
        }

        public Criteria andClientkindsBetween(String value1, String value2) {
            addCriterion("CLIENTKINDS between", value1, value2, "clientkinds");
            return (Criteria) this;
        }

        public Criteria andClientkindsNotBetween(String value1, String value2) {
            addCriterion("CLIENTKINDS not between", value1, value2, "clientkinds");
            return (Criteria) this;
        }

        public Criteria andClientstateIsNull() {
            addCriterion("CLIENTSTATE is null");
            return (Criteria) this;
        }

        public Criteria andClientstateIsNotNull() {
            addCriterion("CLIENTSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andClientstateEqualTo(String value) {
            addCriterion("CLIENTSTATE =", value, "clientstate");
            return (Criteria) this;
        }

        public Criteria andClientstateNotEqualTo(String value) {
            addCriterion("CLIENTSTATE <>", value, "clientstate");
            return (Criteria) this;
        }

        public Criteria andClientstateGreaterThan(String value) {
            addCriterion("CLIENTSTATE >", value, "clientstate");
            return (Criteria) this;
        }

        public Criteria andClientstateGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTSTATE >=", value, "clientstate");
            return (Criteria) this;
        }

        public Criteria andClientstateLessThan(String value) {
            addCriterion("CLIENTSTATE <", value, "clientstate");
            return (Criteria) this;
        }

        public Criteria andClientstateLessThanOrEqualTo(String value) {
            addCriterion("CLIENTSTATE <=", value, "clientstate");
            return (Criteria) this;
        }

        public Criteria andClientstateLike(String value) {
            addCriterion("CLIENTSTATE like", value, "clientstate");
            return (Criteria) this;
        }

        public Criteria andClientstateNotLike(String value) {
            addCriterion("CLIENTSTATE not like", value, "clientstate");
            return (Criteria) this;
        }

        public Criteria andClientstateIn(List<String> values) {
            addCriterion("CLIENTSTATE in", values, "clientstate");
            return (Criteria) this;
        }

        public Criteria andClientstateNotIn(List<String> values) {
            addCriterion("CLIENTSTATE not in", values, "clientstate");
            return (Criteria) this;
        }

        public Criteria andClientstateBetween(String value1, String value2) {
            addCriterion("CLIENTSTATE between", value1, value2, "clientstate");
            return (Criteria) this;
        }

        public Criteria andClientstateNotBetween(String value1, String value2) {
            addCriterion("CLIENTSTATE not between", value1, value2, "clientstate");
            return (Criteria) this;
        }

        public Criteria andClientsourceIsNull() {
            addCriterion("CLIENTSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andClientsourceIsNotNull() {
            addCriterion("CLIENTSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andClientsourceEqualTo(String value) {
            addCriterion("CLIENTSOURCE =", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceNotEqualTo(String value) {
            addCriterion("CLIENTSOURCE <>", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceGreaterThan(String value) {
            addCriterion("CLIENTSOURCE >", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTSOURCE >=", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceLessThan(String value) {
            addCriterion("CLIENTSOURCE <", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceLessThanOrEqualTo(String value) {
            addCriterion("CLIENTSOURCE <=", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceLike(String value) {
            addCriterion("CLIENTSOURCE like", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceNotLike(String value) {
            addCriterion("CLIENTSOURCE not like", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceIn(List<String> values) {
            addCriterion("CLIENTSOURCE in", values, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceNotIn(List<String> values) {
            addCriterion("CLIENTSOURCE not in", values, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceBetween(String value1, String value2) {
            addCriterion("CLIENTSOURCE between", value1, value2, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceNotBetween(String value1, String value2) {
            addCriterion("CLIENTSOURCE not between", value1, value2, "clientsource");
            return (Criteria) this;
        }

        public Criteria andChargenumIsNull() {
            addCriterion("CHARGENUM is null");
            return (Criteria) this;
        }

        public Criteria andChargenumIsNotNull() {
            addCriterion("CHARGENUM is not null");
            return (Criteria) this;
        }

        public Criteria andChargenumEqualTo(BigDecimal value) {
            addCriterion("CHARGENUM =", value, "chargenum");
            return (Criteria) this;
        }

        public Criteria andChargenumNotEqualTo(BigDecimal value) {
            addCriterion("CHARGENUM <>", value, "chargenum");
            return (Criteria) this;
        }

        public Criteria andChargenumGreaterThan(BigDecimal value) {
            addCriterion("CHARGENUM >", value, "chargenum");
            return (Criteria) this;
        }

        public Criteria andChargenumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGENUM >=", value, "chargenum");
            return (Criteria) this;
        }

        public Criteria andChargenumLessThan(BigDecimal value) {
            addCriterion("CHARGENUM <", value, "chargenum");
            return (Criteria) this;
        }

        public Criteria andChargenumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGENUM <=", value, "chargenum");
            return (Criteria) this;
        }

        public Criteria andChargenumIn(List<BigDecimal> values) {
            addCriterion("CHARGENUM in", values, "chargenum");
            return (Criteria) this;
        }

        public Criteria andChargenumNotIn(List<BigDecimal> values) {
            addCriterion("CHARGENUM not in", values, "chargenum");
            return (Criteria) this;
        }

        public Criteria andChargenumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGENUM between", value1, value2, "chargenum");
            return (Criteria) this;
        }

        public Criteria andChargenumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGENUM not between", value1, value2, "chargenum");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("TELPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("TELPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("TELPHONE =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("TELPHONE <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("TELPHONE >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELPHONE >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("TELPHONE <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("TELPHONE <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("TELPHONE like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("TELPHONE not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("TELPHONE in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("TELPHONE not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("TELPHONE between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("TELPHONE not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNull() {
            addCriterion("PHONENUM is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNotNull() {
            addCriterion("PHONENUM is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumEqualTo(BigDecimal value) {
            addCriterion("PHONENUM =", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotEqualTo(BigDecimal value) {
            addCriterion("PHONENUM <>", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThan(BigDecimal value) {
            addCriterion("PHONENUM >", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PHONENUM >=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThan(BigDecimal value) {
            addCriterion("PHONENUM <", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PHONENUM <=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIn(List<BigDecimal> values) {
            addCriterion("PHONENUM in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotIn(List<BigDecimal> values) {
            addCriterion("PHONENUM not in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PHONENUM between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PHONENUM not between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("BANK is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("BANK is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("BANK =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("BANK <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("BANK >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("BANK >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("BANK <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("BANK <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("BANK like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("BANK not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("BANK in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("BANK not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("BANK between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("BANK not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNull() {
            addCriterion("BANKACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNotNull() {
            addCriterion("BANKACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountEqualTo(BigDecimal value) {
            addCriterion("BANKACCOUNT =", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotEqualTo(BigDecimal value) {
            addCriterion("BANKACCOUNT <>", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThan(BigDecimal value) {
            addCriterion("BANKACCOUNT >", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKACCOUNT >=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThan(BigDecimal value) {
            addCriterion("BANKACCOUNT <", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKACCOUNT <=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIn(List<BigDecimal> values) {
            addCriterion("BANKACCOUNT in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotIn(List<BigDecimal> values) {
            addCriterion("BANKACCOUNT not in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKACCOUNT between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKACCOUNT not between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andNextconttimeIsNull() {
            addCriterion("NEXTCONTTIME is null");
            return (Criteria) this;
        }

        public Criteria andNextconttimeIsNotNull() {
            addCriterion("NEXTCONTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andNextconttimeEqualTo(Date value) {
            addCriterion("NEXTCONTTIME =", value, "nextconttime");
            return (Criteria) this;
        }

        public Criteria andNextconttimeNotEqualTo(Date value) {
            addCriterion("NEXTCONTTIME <>", value, "nextconttime");
            return (Criteria) this;
        }

        public Criteria andNextconttimeGreaterThan(Date value) {
            addCriterion("NEXTCONTTIME >", value, "nextconttime");
            return (Criteria) this;
        }

        public Criteria andNextconttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NEXTCONTTIME >=", value, "nextconttime");
            return (Criteria) this;
        }

        public Criteria andNextconttimeLessThan(Date value) {
            addCriterion("NEXTCONTTIME <", value, "nextconttime");
            return (Criteria) this;
        }

        public Criteria andNextconttimeLessThanOrEqualTo(Date value) {
            addCriterion("NEXTCONTTIME <=", value, "nextconttime");
            return (Criteria) this;
        }

        public Criteria andNextconttimeIn(List<Date> values) {
            addCriterion("NEXTCONTTIME in", values, "nextconttime");
            return (Criteria) this;
        }

        public Criteria andNextconttimeNotIn(List<Date> values) {
            addCriterion("NEXTCONTTIME not in", values, "nextconttime");
            return (Criteria) this;
        }

        public Criteria andNextconttimeBetween(Date value1, Date value2) {
            addCriterion("NEXTCONTTIME between", value1, value2, "nextconttime");
            return (Criteria) this;
        }

        public Criteria andNextconttimeNotBetween(Date value1, Date value2) {
            addCriterion("NEXTCONTTIME not between", value1, value2, "nextconttime");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSicnumIsNull() {
            addCriterion("SICNUM is null");
            return (Criteria) this;
        }

        public Criteria andSicnumIsNotNull() {
            addCriterion("SICNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSicnumEqualTo(BigDecimal value) {
            addCriterion("SICNUM =", value, "sicnum");
            return (Criteria) this;
        }

        public Criteria andSicnumNotEqualTo(BigDecimal value) {
            addCriterion("SICNUM <>", value, "sicnum");
            return (Criteria) this;
        }

        public Criteria andSicnumGreaterThan(BigDecimal value) {
            addCriterion("SICNUM >", value, "sicnum");
            return (Criteria) this;
        }

        public Criteria andSicnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SICNUM >=", value, "sicnum");
            return (Criteria) this;
        }

        public Criteria andSicnumLessThan(BigDecimal value) {
            addCriterion("SICNUM <", value, "sicnum");
            return (Criteria) this;
        }

        public Criteria andSicnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SICNUM <=", value, "sicnum");
            return (Criteria) this;
        }

        public Criteria andSicnumIn(List<BigDecimal> values) {
            addCriterion("SICNUM in", values, "sicnum");
            return (Criteria) this;
        }

        public Criteria andSicnumNotIn(List<BigDecimal> values) {
            addCriterion("SICNUM not in", values, "sicnum");
            return (Criteria) this;
        }

        public Criteria andSicnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SICNUM between", value1, value2, "sicnum");
            return (Criteria) this;
        }

        public Criteria andSicnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SICNUM not between", value1, value2, "sicnum");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("PAYWAY is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("PAYWAY is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("PAYWAY =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("PAYWAY <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("PAYWAY >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("PAYWAY >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("PAYWAY <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("PAYWAY <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("PAYWAY like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("PAYWAY not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("PAYWAY in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("PAYWAY not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("PAYWAY between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("PAYWAY not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andEffectiveIsNull() {
            addCriterion("EFFECTIVE is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveIsNotNull() {
            addCriterion("EFFECTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveEqualTo(String value) {
            addCriterion("EFFECTIVE =", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotEqualTo(String value) {
            addCriterion("EFFECTIVE <>", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveGreaterThan(String value) {
            addCriterion("EFFECTIVE >", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveGreaterThanOrEqualTo(String value) {
            addCriterion("EFFECTIVE >=", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveLessThan(String value) {
            addCriterion("EFFECTIVE <", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveLessThanOrEqualTo(String value) {
            addCriterion("EFFECTIVE <=", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveLike(String value) {
            addCriterion("EFFECTIVE like", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotLike(String value) {
            addCriterion("EFFECTIVE not like", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveIn(List<String> values) {
            addCriterion("EFFECTIVE in", values, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotIn(List<String> values) {
            addCriterion("EFFECTIVE not in", values, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveBetween(String value1, String value2) {
            addCriterion("EFFECTIVE between", value1, value2, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotBetween(String value1, String value2) {
            addCriterion("EFFECTIVE not between", value1, value2, "effective");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("BEIZHU is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("BEIZHU is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("BEIZHU =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("BEIZHU <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("BEIZHU >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("BEIZHU >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("BEIZHU <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("BEIZHU <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("BEIZHU like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("BEIZHU not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("BEIZHU in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("BEIZHU not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("BEIZHU between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("BEIZHU not between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andSysnumIsNull() {
            addCriterion("SYSNUM is null");
            return (Criteria) this;
        }

        public Criteria andSysnumIsNotNull() {
            addCriterion("SYSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSysnumEqualTo(BigDecimal value) {
            addCriterion("SYSNUM =", value, "sysnum");
            return (Criteria) this;
        }

        public Criteria andSysnumNotEqualTo(BigDecimal value) {
            addCriterion("SYSNUM <>", value, "sysnum");
            return (Criteria) this;
        }

        public Criteria andSysnumGreaterThan(BigDecimal value) {
            addCriterion("SYSNUM >", value, "sysnum");
            return (Criteria) this;
        }

        public Criteria andSysnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYSNUM >=", value, "sysnum");
            return (Criteria) this;
        }

        public Criteria andSysnumLessThan(BigDecimal value) {
            addCriterion("SYSNUM <", value, "sysnum");
            return (Criteria) this;
        }

        public Criteria andSysnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYSNUM <=", value, "sysnum");
            return (Criteria) this;
        }

        public Criteria andSysnumIn(List<BigDecimal> values) {
            addCriterion("SYSNUM in", values, "sysnum");
            return (Criteria) this;
        }

        public Criteria andSysnumNotIn(List<BigDecimal> values) {
            addCriterion("SYSNUM not in", values, "sysnum");
            return (Criteria) this;
        }

        public Criteria andSysnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYSNUM between", value1, value2, "sysnum");
            return (Criteria) this;
        }

        public Criteria andSysnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYSNUM not between", value1, value2, "sysnum");
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