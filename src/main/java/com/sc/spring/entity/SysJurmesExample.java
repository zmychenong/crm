package com.sc.spring.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysJurmesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysJurmesExample() {
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

        public Criteria andPowerIdIsNull() {
            addCriterion("POWER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPowerIdIsNotNull() {
            addCriterion("POWER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPowerIdEqualTo(Long value) {
            addCriterion("POWER_ID =", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotEqualTo(Long value) {
            addCriterion("POWER_ID <>", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThan(Long value) {
            addCriterion("POWER_ID >", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("POWER_ID >=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThan(Long value) {
            addCriterion("POWER_ID <", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThanOrEqualTo(Long value) {
            addCriterion("POWER_ID <=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdIn(List<Long> values) {
            addCriterion("POWER_ID in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotIn(List<Long> values) {
            addCriterion("POWER_ID not in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdBetween(Long value1, Long value2) {
            addCriterion("POWER_ID between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotBetween(Long value1, Long value2) {
            addCriterion("POWER_ID not between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerNameIsNull() {
            addCriterion("POWER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPowerNameIsNotNull() {
            addCriterion("POWER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPowerNameEqualTo(String value) {
            addCriterion("POWER_NAME =", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotEqualTo(String value) {
            addCriterion("POWER_NAME <>", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameGreaterThan(String value) {
            addCriterion("POWER_NAME >", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_NAME >=", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLessThan(String value) {
            addCriterion("POWER_NAME <", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLessThanOrEqualTo(String value) {
            addCriterion("POWER_NAME <=", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLike(String value) {
            addCriterion("POWER_NAME like", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotLike(String value) {
            addCriterion("POWER_NAME not like", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameIn(List<String> values) {
            addCriterion("POWER_NAME in", values, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotIn(List<String> values) {
            addCriterion("POWER_NAME not in", values, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameBetween(String value1, String value2) {
            addCriterion("POWER_NAME between", value1, value2, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotBetween(String value1, String value2) {
            addCriterion("POWER_NAME not between", value1, value2, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("\"POWER\" is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("\"POWER\" is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("\"POWER\" =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("\"POWER\" <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("\"POWER\" >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("\"POWER\" >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("\"POWER\" <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("\"POWER\" <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("\"POWER\" like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("\"POWER\" not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("\"POWER\" in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("\"POWER\" not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("\"POWER\" between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("\"POWER\" not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerColumnsIdIsNull() {
            addCriterion("POWER_COLUMNS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPowerColumnsIdIsNotNull() {
            addCriterion("POWER_COLUMNS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPowerColumnsIdEqualTo(Long value) {
            addCriterion("POWER_COLUMNS_ID =", value, "powerColumnsId");
            return (Criteria) this;
        }

        public Criteria andPowerColumnsIdNotEqualTo(Long value) {
            addCriterion("POWER_COLUMNS_ID <>", value, "powerColumnsId");
            return (Criteria) this;
        }

        public Criteria andPowerColumnsIdGreaterThan(Long value) {
            addCriterion("POWER_COLUMNS_ID >", value, "powerColumnsId");
            return (Criteria) this;
        }

        public Criteria andPowerColumnsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("POWER_COLUMNS_ID >=", value, "powerColumnsId");
            return (Criteria) this;
        }

        public Criteria andPowerColumnsIdLessThan(Long value) {
            addCriterion("POWER_COLUMNS_ID <", value, "powerColumnsId");
            return (Criteria) this;
        }

        public Criteria andPowerColumnsIdLessThanOrEqualTo(Long value) {
            addCriterion("POWER_COLUMNS_ID <=", value, "powerColumnsId");
            return (Criteria) this;
        }

        public Criteria andPowerColumnsIdIn(List<Long> values) {
            addCriterion("POWER_COLUMNS_ID in", values, "powerColumnsId");
            return (Criteria) this;
        }

        public Criteria andPowerColumnsIdNotIn(List<Long> values) {
            addCriterion("POWER_COLUMNS_ID not in", values, "powerColumnsId");
            return (Criteria) this;
        }

        public Criteria andPowerColumnsIdBetween(Long value1, Long value2) {
            addCriterion("POWER_COLUMNS_ID between", value1, value2, "powerColumnsId");
            return (Criteria) this;
        }

        public Criteria andPowerColumnsIdNotBetween(Long value1, Long value2) {
            addCriterion("POWER_COLUMNS_ID not between", value1, value2, "powerColumnsId");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andLastchangeTimeIsNull() {
            addCriterion("LASTCHANGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastchangeTimeIsNotNull() {
            addCriterion("LASTCHANGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastchangeTimeEqualTo(Date value) {
            addCriterion("LASTCHANGE_TIME =", value, "lastchangeTime");
            return (Criteria) this;
        }

        public Criteria andLastchangeTimeNotEqualTo(Date value) {
            addCriterion("LASTCHANGE_TIME <>", value, "lastchangeTime");
            return (Criteria) this;
        }

        public Criteria andLastchangeTimeGreaterThan(Date value) {
            addCriterion("LASTCHANGE_TIME >", value, "lastchangeTime");
            return (Criteria) this;
        }

        public Criteria andLastchangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTCHANGE_TIME >=", value, "lastchangeTime");
            return (Criteria) this;
        }

        public Criteria andLastchangeTimeLessThan(Date value) {
            addCriterion("LASTCHANGE_TIME <", value, "lastchangeTime");
            return (Criteria) this;
        }

        public Criteria andLastchangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTCHANGE_TIME <=", value, "lastchangeTime");
            return (Criteria) this;
        }

        public Criteria andLastchangeTimeIn(List<Date> values) {
            addCriterion("LASTCHANGE_TIME in", values, "lastchangeTime");
            return (Criteria) this;
        }

        public Criteria andLastchangeTimeNotIn(List<Date> values) {
            addCriterion("LASTCHANGE_TIME not in", values, "lastchangeTime");
            return (Criteria) this;
        }

        public Criteria andLastchangeTimeBetween(Date value1, Date value2) {
            addCriterion("LASTCHANGE_TIME between", value1, value2, "lastchangeTime");
            return (Criteria) this;
        }

        public Criteria andLastchangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTCHANGE_TIME not between", value1, value2, "lastchangeTime");
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