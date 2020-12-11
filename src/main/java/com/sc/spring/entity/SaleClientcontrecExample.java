package com.sc.spring.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleClientcontrecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleClientcontrecExample() {
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

        public Criteria andRecnumIsNull() {
            addCriterion("RECNUM is null");
            return (Criteria) this;
        }

        public Criteria andRecnumIsNotNull() {
            addCriterion("RECNUM is not null");
            return (Criteria) this;
        }

        public Criteria andRecnumEqualTo(BigDecimal value) {
            addCriterion("RECNUM =", value, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumNotEqualTo(BigDecimal value) {
            addCriterion("RECNUM <>", value, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumGreaterThan(BigDecimal value) {
            addCriterion("RECNUM >", value, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECNUM >=", value, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumLessThan(BigDecimal value) {
            addCriterion("RECNUM <", value, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECNUM <=", value, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumIn(List<BigDecimal> values) {
            addCriterion("RECNUM in", values, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumNotIn(List<BigDecimal> values) {
            addCriterion("RECNUM not in", values, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECNUM between", value1, value2, "recnum");
            return (Criteria) this;
        }

        public Criteria andRecnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECNUM not between", value1, value2, "recnum");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("\"TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("\"TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("\"TIME\" =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("\"TIME\" <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("\"TIME\" >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"TIME\" >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("\"TIME\" <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"TIME\" <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("\"TIME\" in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("\"TIME\" not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("\"TIME\" between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"TIME\" not between", value1, value2, "time");
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

        public Criteria andDetailsIsNull() {
            addCriterion("DETAILS is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNotNull() {
            addCriterion("DETAILS is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsEqualTo(String value) {
            addCriterion("DETAILS =", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotEqualTo(String value) {
            addCriterion("DETAILS <>", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThan(String value) {
            addCriterion("DETAILS >", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("DETAILS >=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThan(String value) {
            addCriterion("DETAILS <", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThanOrEqualTo(String value) {
            addCriterion("DETAILS <=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLike(String value) {
            addCriterion("DETAILS like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotLike(String value) {
            addCriterion("DETAILS not like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsIn(List<String> values) {
            addCriterion("DETAILS in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotIn(List<String> values) {
            addCriterion("DETAILS not in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsBetween(String value1, String value2) {
            addCriterion("DETAILS between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotBetween(String value1, String value2) {
            addCriterion("DETAILS not between", value1, value2, "details");
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