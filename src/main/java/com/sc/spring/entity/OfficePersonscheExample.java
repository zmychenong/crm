package com.sc.spring.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfficePersonscheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficePersonscheExample() {
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

        public Criteria andSeIdIsNull() {
            addCriterion("SE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeIdIsNotNull() {
            addCriterion("SE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeIdEqualTo(Long value) {
            addCriterion("SE_ID =", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotEqualTo(Long value) {
            addCriterion("SE_ID <>", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdGreaterThan(Long value) {
            addCriterion("SE_ID >", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SE_ID >=", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLessThan(Long value) {
            addCriterion("SE_ID <", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLessThanOrEqualTo(Long value) {
            addCriterion("SE_ID <=", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdIn(List<Long> values) {
            addCriterion("SE_ID in", values, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotIn(List<Long> values) {
            addCriterion("SE_ID not in", values, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdBetween(Long value1, Long value2) {
            addCriterion("SE_ID between", value1, value2, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotBetween(Long value1, Long value2) {
            addCriterion("SE_ID not between", value1, value2, "seId");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyIsNull() {
            addCriterion("ARRANGEMENT_CATEGROY is null");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyIsNotNull() {
            addCriterion("ARRANGEMENT_CATEGROY is not null");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyEqualTo(String value) {
            addCriterion("ARRANGEMENT_CATEGROY =", value, "arrangementCategroy");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyNotEqualTo(String value) {
            addCriterion("ARRANGEMENT_CATEGROY <>", value, "arrangementCategroy");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyGreaterThan(String value) {
            addCriterion("ARRANGEMENT_CATEGROY >", value, "arrangementCategroy");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyGreaterThanOrEqualTo(String value) {
            addCriterion("ARRANGEMENT_CATEGROY >=", value, "arrangementCategroy");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyLessThan(String value) {
            addCriterion("ARRANGEMENT_CATEGROY <", value, "arrangementCategroy");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyLessThanOrEqualTo(String value) {
            addCriterion("ARRANGEMENT_CATEGROY <=", value, "arrangementCategroy");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyLike(String value) {
            addCriterion("ARRANGEMENT_CATEGROY like", value, "arrangementCategroy");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyNotLike(String value) {
            addCriterion("ARRANGEMENT_CATEGROY not like", value, "arrangementCategroy");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyIn(List<String> values) {
            addCriterion("ARRANGEMENT_CATEGROY in", values, "arrangementCategroy");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyNotIn(List<String> values) {
            addCriterion("ARRANGEMENT_CATEGROY not in", values, "arrangementCategroy");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyBetween(String value1, String value2) {
            addCriterion("ARRANGEMENT_CATEGROY between", value1, value2, "arrangementCategroy");
            return (Criteria) this;
        }

        public Criteria andArrangementCategroyNotBetween(String value1, String value2) {
            addCriterion("ARRANGEMENT_CATEGROY not between", value1, value2, "arrangementCategroy");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeIsNull() {
            addCriterion("ARRANGE_THE_THEME is null");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeIsNotNull() {
            addCriterion("ARRANGE_THE_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeEqualTo(String value) {
            addCriterion("ARRANGE_THE_THEME =", value, "arrangeTheTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeNotEqualTo(String value) {
            addCriterion("ARRANGE_THE_THEME <>", value, "arrangeTheTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeGreaterThan(String value) {
            addCriterion("ARRANGE_THE_THEME >", value, "arrangeTheTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeGreaterThanOrEqualTo(String value) {
            addCriterion("ARRANGE_THE_THEME >=", value, "arrangeTheTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeLessThan(String value) {
            addCriterion("ARRANGE_THE_THEME <", value, "arrangeTheTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeLessThanOrEqualTo(String value) {
            addCriterion("ARRANGE_THE_THEME <=", value, "arrangeTheTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeLike(String value) {
            addCriterion("ARRANGE_THE_THEME like", value, "arrangeTheTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeNotLike(String value) {
            addCriterion("ARRANGE_THE_THEME not like", value, "arrangeTheTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeIn(List<String> values) {
            addCriterion("ARRANGE_THE_THEME in", values, "arrangeTheTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeNotIn(List<String> values) {
            addCriterion("ARRANGE_THE_THEME not in", values, "arrangeTheTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeBetween(String value1, String value2) {
            addCriterion("ARRANGE_THE_THEME between", value1, value2, "arrangeTheTheme");
            return (Criteria) this;
        }

        public Criteria andArrangeTheThemeNotBetween(String value1, String value2) {
            addCriterion("ARRANGE_THE_THEME not between", value1, value2, "arrangeTheTheme");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andFillInThePersonnelNumberIsNull() {
            addCriterion("FILL_IN_THE_PERSONNEL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andFillInThePersonnelNumberIsNotNull() {
            addCriterion("FILL_IN_THE_PERSONNEL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andFillInThePersonnelNumberEqualTo(BigDecimal value) {
            addCriterion("FILL_IN_THE_PERSONNEL_NUMBER =", value, "fillInThePersonnelNumber");
            return (Criteria) this;
        }

        public Criteria andFillInThePersonnelNumberNotEqualTo(BigDecimal value) {
            addCriterion("FILL_IN_THE_PERSONNEL_NUMBER <>", value, "fillInThePersonnelNumber");
            return (Criteria) this;
        }

        public Criteria andFillInThePersonnelNumberGreaterThan(BigDecimal value) {
            addCriterion("FILL_IN_THE_PERSONNEL_NUMBER >", value, "fillInThePersonnelNumber");
            return (Criteria) this;
        }

        public Criteria andFillInThePersonnelNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FILL_IN_THE_PERSONNEL_NUMBER >=", value, "fillInThePersonnelNumber");
            return (Criteria) this;
        }

        public Criteria andFillInThePersonnelNumberLessThan(BigDecimal value) {
            addCriterion("FILL_IN_THE_PERSONNEL_NUMBER <", value, "fillInThePersonnelNumber");
            return (Criteria) this;
        }

        public Criteria andFillInThePersonnelNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FILL_IN_THE_PERSONNEL_NUMBER <=", value, "fillInThePersonnelNumber");
            return (Criteria) this;
        }

        public Criteria andFillInThePersonnelNumberIn(List<BigDecimal> values) {
            addCriterion("FILL_IN_THE_PERSONNEL_NUMBER in", values, "fillInThePersonnelNumber");
            return (Criteria) this;
        }

        public Criteria andFillInThePersonnelNumberNotIn(List<BigDecimal> values) {
            addCriterion("FILL_IN_THE_PERSONNEL_NUMBER not in", values, "fillInThePersonnelNumber");
            return (Criteria) this;
        }

        public Criteria andFillInThePersonnelNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILL_IN_THE_PERSONNEL_NUMBER between", value1, value2, "fillInThePersonnelNumber");
            return (Criteria) this;
        }

        public Criteria andFillInThePersonnelNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILL_IN_THE_PERSONNEL_NUMBER not between", value1, value2, "fillInThePersonnelNumber");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionIsNull() {
            addCriterion("ARRANGEMENT_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionIsNotNull() {
            addCriterion("ARRANGEMENT_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionEqualTo(String value) {
            addCriterion("ARRANGEMENT_DESCRIPTION =", value, "arrangementDescription");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionNotEqualTo(String value) {
            addCriterion("ARRANGEMENT_DESCRIPTION <>", value, "arrangementDescription");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionGreaterThan(String value) {
            addCriterion("ARRANGEMENT_DESCRIPTION >", value, "arrangementDescription");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ARRANGEMENT_DESCRIPTION >=", value, "arrangementDescription");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionLessThan(String value) {
            addCriterion("ARRANGEMENT_DESCRIPTION <", value, "arrangementDescription");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ARRANGEMENT_DESCRIPTION <=", value, "arrangementDescription");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionLike(String value) {
            addCriterion("ARRANGEMENT_DESCRIPTION like", value, "arrangementDescription");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionNotLike(String value) {
            addCriterion("ARRANGEMENT_DESCRIPTION not like", value, "arrangementDescription");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionIn(List<String> values) {
            addCriterion("ARRANGEMENT_DESCRIPTION in", values, "arrangementDescription");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionNotIn(List<String> values) {
            addCriterion("ARRANGEMENT_DESCRIPTION not in", values, "arrangementDescription");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionBetween(String value1, String value2) {
            addCriterion("ARRANGEMENT_DESCRIPTION between", value1, value2, "arrangementDescription");
            return (Criteria) this;
        }

        public Criteria andArrangementDescriptionNotBetween(String value1, String value2) {
            addCriterion("ARRANGEMENT_DESCRIPTION not between", value1, value2, "arrangementDescription");
            return (Criteria) this;
        }

        public Criteria andCpmpanyNumberIsNull() {
            addCriterion("CPMPANY_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCpmpanyNumberIsNotNull() {
            addCriterion("CPMPANY_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCpmpanyNumberEqualTo(BigDecimal value) {
            addCriterion("CPMPANY_NUMBER =", value, "cpmpanyNumber");
            return (Criteria) this;
        }

        public Criteria andCpmpanyNumberNotEqualTo(BigDecimal value) {
            addCriterion("CPMPANY_NUMBER <>", value, "cpmpanyNumber");
            return (Criteria) this;
        }

        public Criteria andCpmpanyNumberGreaterThan(BigDecimal value) {
            addCriterion("CPMPANY_NUMBER >", value, "cpmpanyNumber");
            return (Criteria) this;
        }

        public Criteria andCpmpanyNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CPMPANY_NUMBER >=", value, "cpmpanyNumber");
            return (Criteria) this;
        }

        public Criteria andCpmpanyNumberLessThan(BigDecimal value) {
            addCriterion("CPMPANY_NUMBER <", value, "cpmpanyNumber");
            return (Criteria) this;
        }

        public Criteria andCpmpanyNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CPMPANY_NUMBER <=", value, "cpmpanyNumber");
            return (Criteria) this;
        }

        public Criteria andCpmpanyNumberIn(List<BigDecimal> values) {
            addCriterion("CPMPANY_NUMBER in", values, "cpmpanyNumber");
            return (Criteria) this;
        }

        public Criteria andCpmpanyNumberNotIn(List<BigDecimal> values) {
            addCriterion("CPMPANY_NUMBER not in", values, "cpmpanyNumber");
            return (Criteria) this;
        }

        public Criteria andCpmpanyNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CPMPANY_NUMBER between", value1, value2, "cpmpanyNumber");
            return (Criteria) this;
        }

        public Criteria andCpmpanyNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CPMPANY_NUMBER not between", value1, value2, "cpmpanyNumber");
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