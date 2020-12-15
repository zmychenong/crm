package com.sc.spring.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLogExample() {
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

        public Criteria andLogNumIsNull() {
            addCriterion("LOG_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLogNumIsNotNull() {
            addCriterion("LOG_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLogNumEqualTo(BigDecimal value) {
            addCriterion("LOG_NUM =", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumNotEqualTo(BigDecimal value) {
            addCriterion("LOG_NUM <>", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumGreaterThan(BigDecimal value) {
            addCriterion("LOG_NUM >", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOG_NUM >=", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumLessThan(BigDecimal value) {
            addCriterion("LOG_NUM <", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOG_NUM <=", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumIn(List<BigDecimal> values) {
            addCriterion("LOG_NUM in", values, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumNotIn(List<BigDecimal> values) {
            addCriterion("LOG_NUM not in", values, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOG_NUM between", value1, value2, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOG_NUM not between", value1, value2, "logNum");
            return (Criteria) this;
        }

        public Criteria andUsernumIsNull() {
            addCriterion("USERNUM is null");
            return (Criteria) this;
        }

        public Criteria andUsernumIsNotNull() {
            addCriterion("USERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andUsernumEqualTo(BigDecimal value) {
            addCriterion("USERNUM =", value, "usernum");
            return (Criteria) this;
        }

        public Criteria andUsernumNotEqualTo(BigDecimal value) {
            addCriterion("USERNUM <>", value, "usernum");
            return (Criteria) this;
        }

        public Criteria andUsernumGreaterThan(BigDecimal value) {
            addCriterion("USERNUM >", value, "usernum");
            return (Criteria) this;
        }

        public Criteria andUsernumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USERNUM >=", value, "usernum");
            return (Criteria) this;
        }

        public Criteria andUsernumLessThan(BigDecimal value) {
            addCriterion("USERNUM <", value, "usernum");
            return (Criteria) this;
        }

        public Criteria andUsernumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USERNUM <=", value, "usernum");
            return (Criteria) this;
        }

        public Criteria andUsernumIn(List<BigDecimal> values) {
            addCriterion("USERNUM in", values, "usernum");
            return (Criteria) this;
        }

        public Criteria andUsernumNotIn(List<BigDecimal> values) {
            addCriterion("USERNUM not in", values, "usernum");
            return (Criteria) this;
        }

        public Criteria andUsernumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERNUM between", value1, value2, "usernum");
            return (Criteria) this;
        }

        public Criteria andUsernumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERNUM not between", value1, value2, "usernum");
            return (Criteria) this;
        }

        public Criteria andFromipIsNull() {
            addCriterion("FROMIP is null");
            return (Criteria) this;
        }

        public Criteria andFromipIsNotNull() {
            addCriterion("FROMIP is not null");
            return (Criteria) this;
        }

        public Criteria andFromipEqualTo(String value) {
            addCriterion("FROMIP =", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipNotEqualTo(String value) {
            addCriterion("FROMIP <>", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipGreaterThan(String value) {
            addCriterion("FROMIP >", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipGreaterThanOrEqualTo(String value) {
            addCriterion("FROMIP >=", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipLessThan(String value) {
            addCriterion("FROMIP <", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipLessThanOrEqualTo(String value) {
            addCriterion("FROMIP <=", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipLike(String value) {
            addCriterion("FROMIP like", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipNotLike(String value) {
            addCriterion("FROMIP not like", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipIn(List<String> values) {
            addCriterion("FROMIP in", values, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipNotIn(List<String> values) {
            addCriterion("FROMIP not in", values, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipBetween(String value1, String value2) {
            addCriterion("FROMIP between", value1, value2, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipNotBetween(String value1, String value2) {
            addCriterion("FROMIP not between", value1, value2, "fromip");
            return (Criteria) this;
        }

        public Criteria andLimitIsNull() {
            addCriterion("\"LIMIT\" is null");
            return (Criteria) this;
        }

        public Criteria andLimitIsNotNull() {
            addCriterion("\"LIMIT\" is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEqualTo(String value) {
            addCriterion("\"LIMIT\" =", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotEqualTo(String value) {
            addCriterion("\"LIMIT\" <>", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThan(String value) {
            addCriterion("\"LIMIT\" >", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThanOrEqualTo(String value) {
            addCriterion("\"LIMIT\" >=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThan(String value) {
            addCriterion("\"LIMIT\" <", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThanOrEqualTo(String value) {
            addCriterion("\"LIMIT\" <=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLike(String value) {
            addCriterion("\"LIMIT\" like", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotLike(String value) {
            addCriterion("\"LIMIT\" not like", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitIn(List<String> values) {
            addCriterion("\"LIMIT\" in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotIn(List<String> values) {
            addCriterion("\"LIMIT\" not in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitBetween(String value1, String value2) {
            addCriterion("\"LIMIT\" between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotBetween(String value1, String value2) {
            addCriterion("\"LIMIT\" not between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andWhattimeIsNull() {
            addCriterion("WHATTIME is null");
            return (Criteria) this;
        }

        public Criteria andWhattimeIsNotNull() {
            addCriterion("WHATTIME is not null");
            return (Criteria) this;
        }

        public Criteria andWhattimeEqualTo(Date value) {
            addCriterion("WHATTIME =", value, "whattime");
            return (Criteria) this;
        }

        public Criteria andWhattimeNotEqualTo(Date value) {
            addCriterion("WHATTIME <>", value, "whattime");
            return (Criteria) this;
        }

        public Criteria andWhattimeGreaterThan(Date value) {
            addCriterion("WHATTIME >", value, "whattime");
            return (Criteria) this;
        }

        public Criteria andWhattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WHATTIME >=", value, "whattime");
            return (Criteria) this;
        }

        public Criteria andWhattimeLessThan(Date value) {
            addCriterion("WHATTIME <", value, "whattime");
            return (Criteria) this;
        }

        public Criteria andWhattimeLessThanOrEqualTo(Date value) {
            addCriterion("WHATTIME <=", value, "whattime");
            return (Criteria) this;
        }

        public Criteria andWhattimeIn(List<Date> values) {
            addCriterion("WHATTIME in", values, "whattime");
            return (Criteria) this;
        }

        public Criteria andWhattimeNotIn(List<Date> values) {
            addCriterion("WHATTIME not in", values, "whattime");
            return (Criteria) this;
        }

        public Criteria andWhattimeBetween(Date value1, Date value2) {
            addCriterion("WHATTIME between", value1, value2, "whattime");
            return (Criteria) this;
        }

        public Criteria andWhattimeNotBetween(Date value1, Date value2) {
            addCriterion("WHATTIME not between", value1, value2, "whattime");
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