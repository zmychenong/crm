package com.sc.spring.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleClientcontExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleClientcontExample() {
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

        public Criteria andContnumIsNull() {
            addCriterion("CONTNUM is null");
            return (Criteria) this;
        }

        public Criteria andContnumIsNotNull() {
            addCriterion("CONTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andContnumEqualTo(BigDecimal value) {
            addCriterion("CONTNUM =", value, "contnum");
            return (Criteria) this;
        }

        public Criteria andContnumNotEqualTo(BigDecimal value) {
            addCriterion("CONTNUM <>", value, "contnum");
            return (Criteria) this;
        }

        public Criteria andContnumGreaterThan(BigDecimal value) {
            addCriterion("CONTNUM >", value, "contnum");
            return (Criteria) this;
        }

        public Criteria andContnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTNUM >=", value, "contnum");
            return (Criteria) this;
        }

        public Criteria andContnumLessThan(BigDecimal value) {
            addCriterion("CONTNUM <", value, "contnum");
            return (Criteria) this;
        }

        public Criteria andContnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTNUM <=", value, "contnum");
            return (Criteria) this;
        }

        public Criteria andContnumIn(List<BigDecimal> values) {
            addCriterion("CONTNUM in", values, "contnum");
            return (Criteria) this;
        }

        public Criteria andContnumNotIn(List<BigDecimal> values) {
            addCriterion("CONTNUM not in", values, "contnum");
            return (Criteria) this;
        }

        public Criteria andContnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTNUM between", value1, value2, "contnum");
            return (Criteria) this;
        }

        public Criteria andContnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTNUM not between", value1, value2, "contnum");
            return (Criteria) this;
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

        public Criteria andContnameIsNull() {
            addCriterion("CONTNAME is null");
            return (Criteria) this;
        }

        public Criteria andContnameIsNotNull() {
            addCriterion("CONTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andContnameEqualTo(String value) {
            addCriterion("CONTNAME =", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameNotEqualTo(String value) {
            addCriterion("CONTNAME <>", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameGreaterThan(String value) {
            addCriterion("CONTNAME >", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTNAME >=", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameLessThan(String value) {
            addCriterion("CONTNAME <", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameLessThanOrEqualTo(String value) {
            addCriterion("CONTNAME <=", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameLike(String value) {
            addCriterion("CONTNAME like", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameNotLike(String value) {
            addCriterion("CONTNAME not like", value, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameIn(List<String> values) {
            addCriterion("CONTNAME in", values, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameNotIn(List<String> values) {
            addCriterion("CONTNAME not in", values, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameBetween(String value1, String value2) {
            addCriterion("CONTNAME between", value1, value2, "contname");
            return (Criteria) this;
        }

        public Criteria andContnameNotBetween(String value1, String value2) {
            addCriterion("CONTNAME not between", value1, value2, "contname");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNull() {
            addCriterion("ENGLISH is null");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNotNull() {
            addCriterion("ENGLISH is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishEqualTo(String value) {
            addCriterion("ENGLISH =", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotEqualTo(String value) {
            addCriterion("ENGLISH <>", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThan(String value) {
            addCriterion("ENGLISH >", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("ENGLISH >=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThan(String value) {
            addCriterion("ENGLISH <", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThanOrEqualTo(String value) {
            addCriterion("ENGLISH <=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLike(String value) {
            addCriterion("ENGLISH like", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotLike(String value) {
            addCriterion("ENGLISH not like", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishIn(List<String> values) {
            addCriterion("ENGLISH in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotIn(List<String> values) {
            addCriterion("ENGLISH not in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishBetween(String value1, String value2) {
            addCriterion("ENGLISH between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotBetween(String value1, String value2) {
            addCriterion("ENGLISH not between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andBotanyIsNull() {
            addCriterion("BOTANY is null");
            return (Criteria) this;
        }

        public Criteria andBotanyIsNotNull() {
            addCriterion("BOTANY is not null");
            return (Criteria) this;
        }

        public Criteria andBotanyEqualTo(String value) {
            addCriterion("BOTANY =", value, "botany");
            return (Criteria) this;
        }

        public Criteria andBotanyNotEqualTo(String value) {
            addCriterion("BOTANY <>", value, "botany");
            return (Criteria) this;
        }

        public Criteria andBotanyGreaterThan(String value) {
            addCriterion("BOTANY >", value, "botany");
            return (Criteria) this;
        }

        public Criteria andBotanyGreaterThanOrEqualTo(String value) {
            addCriterion("BOTANY >=", value, "botany");
            return (Criteria) this;
        }

        public Criteria andBotanyLessThan(String value) {
            addCriterion("BOTANY <", value, "botany");
            return (Criteria) this;
        }

        public Criteria andBotanyLessThanOrEqualTo(String value) {
            addCriterion("BOTANY <=", value, "botany");
            return (Criteria) this;
        }

        public Criteria andBotanyLike(String value) {
            addCriterion("BOTANY like", value, "botany");
            return (Criteria) this;
        }

        public Criteria andBotanyNotLike(String value) {
            addCriterion("BOTANY not like", value, "botany");
            return (Criteria) this;
        }

        public Criteria andBotanyIn(List<String> values) {
            addCriterion("BOTANY in", values, "botany");
            return (Criteria) this;
        }

        public Criteria andBotanyNotIn(List<String> values) {
            addCriterion("BOTANY not in", values, "botany");
            return (Criteria) this;
        }

        public Criteria andBotanyBetween(String value1, String value2) {
            addCriterion("BOTANY between", value1, value2, "botany");
            return (Criteria) this;
        }

        public Criteria andBotanyNotBetween(String value1, String value2) {
            addCriterion("BOTANY not between", value1, value2, "botany");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
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

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
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

        public Criteria andBeizhuxxIsNull() {
            addCriterion("BEIZHUXX is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxIsNotNull() {
            addCriterion("BEIZHUXX is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxEqualTo(String value) {
            addCriterion("BEIZHUXX =", value, "beizhuxx");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxNotEqualTo(String value) {
            addCriterion("BEIZHUXX <>", value, "beizhuxx");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxGreaterThan(String value) {
            addCriterion("BEIZHUXX >", value, "beizhuxx");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxGreaterThanOrEqualTo(String value) {
            addCriterion("BEIZHUXX >=", value, "beizhuxx");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxLessThan(String value) {
            addCriterion("BEIZHUXX <", value, "beizhuxx");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxLessThanOrEqualTo(String value) {
            addCriterion("BEIZHUXX <=", value, "beizhuxx");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxLike(String value) {
            addCriterion("BEIZHUXX like", value, "beizhuxx");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxNotLike(String value) {
            addCriterion("BEIZHUXX not like", value, "beizhuxx");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxIn(List<String> values) {
            addCriterion("BEIZHUXX in", values, "beizhuxx");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxNotIn(List<String> values) {
            addCriterion("BEIZHUXX not in", values, "beizhuxx");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxBetween(String value1, String value2) {
            addCriterion("BEIZHUXX between", value1, value2, "beizhuxx");
            return (Criteria) this;
        }

        public Criteria andBeizhuxxNotBetween(String value1, String value2) {
            addCriterion("BEIZHUXX not between", value1, value2, "beizhuxx");
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