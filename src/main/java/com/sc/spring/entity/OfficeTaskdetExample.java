package com.sc.spring.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfficeTaskdetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficeTaskdetExample() {
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

        public Criteria andOfficeIdIsNull() {
            addCriterion("OFFICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIsNotNull() {
            addCriterion("OFFICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeIdEqualTo(Long value) {
            addCriterion("OFFICE_ID =", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotEqualTo(Long value) {
            addCriterion("OFFICE_ID <>", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdGreaterThan(Long value) {
            addCriterion("OFFICE_ID >", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OFFICE_ID >=", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLessThan(Long value) {
            addCriterion("OFFICE_ID <", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLessThanOrEqualTo(Long value) {
            addCriterion("OFFICE_ID <=", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIn(List<Long> values) {
            addCriterion("OFFICE_ID in", values, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotIn(List<Long> values) {
            addCriterion("OFFICE_ID not in", values, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdBetween(Long value1, Long value2) {
            addCriterion("OFFICE_ID between", value1, value2, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotBetween(Long value1, Long value2) {
            addCriterion("OFFICE_ID not between", value1, value2, "officeId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberIsNull() {
            addCriterion("ACCEPT_USER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberIsNotNull() {
            addCriterion("ACCEPT_USER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberEqualTo(String value) {
            addCriterion("ACCEPT_USER_NUMBER =", value, "acceptUserNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberNotEqualTo(String value) {
            addCriterion("ACCEPT_USER_NUMBER <>", value, "acceptUserNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberGreaterThan(String value) {
            addCriterion("ACCEPT_USER_NUMBER >", value, "acceptUserNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ACCEPT_USER_NUMBER >=", value, "acceptUserNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberLessThan(String value) {
            addCriterion("ACCEPT_USER_NUMBER <", value, "acceptUserNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberLessThanOrEqualTo(String value) {
            addCriterion("ACCEPT_USER_NUMBER <=", value, "acceptUserNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberLike(String value) {
            addCriterion("ACCEPT_USER_NUMBER like", value, "acceptUserNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberNotLike(String value) {
            addCriterion("ACCEPT_USER_NUMBER not like", value, "acceptUserNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberIn(List<String> values) {
            addCriterion("ACCEPT_USER_NUMBER in", values, "acceptUserNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberNotIn(List<String> values) {
            addCriterion("ACCEPT_USER_NUMBER not in", values, "acceptUserNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberBetween(String value1, String value2) {
            addCriterion("ACCEPT_USER_NUMBER between", value1, value2, "acceptUserNumber");
            return (Criteria) this;
        }

        public Criteria andAcceptUserNumberNotBetween(String value1, String value2) {
            addCriterion("ACCEPT_USER_NUMBER not between", value1, value2, "acceptUserNumber");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedIsNull() {
            addCriterion("IT_IS_COMPELETED is null");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedIsNotNull() {
            addCriterion("IT_IS_COMPELETED is not null");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedEqualTo(String value) {
            addCriterion("IT_IS_COMPELETED =", value, "itIsCompeleted");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedNotEqualTo(String value) {
            addCriterion("IT_IS_COMPELETED <>", value, "itIsCompeleted");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedGreaterThan(String value) {
            addCriterion("IT_IS_COMPELETED >", value, "itIsCompeleted");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedGreaterThanOrEqualTo(String value) {
            addCriterion("IT_IS_COMPELETED >=", value, "itIsCompeleted");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedLessThan(String value) {
            addCriterion("IT_IS_COMPELETED <", value, "itIsCompeleted");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedLessThanOrEqualTo(String value) {
            addCriterion("IT_IS_COMPELETED <=", value, "itIsCompeleted");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedLike(String value) {
            addCriterion("IT_IS_COMPELETED like", value, "itIsCompeleted");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedNotLike(String value) {
            addCriterion("IT_IS_COMPELETED not like", value, "itIsCompeleted");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedIn(List<String> values) {
            addCriterion("IT_IS_COMPELETED in", values, "itIsCompeleted");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedNotIn(List<String> values) {
            addCriterion("IT_IS_COMPELETED not in", values, "itIsCompeleted");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedBetween(String value1, String value2) {
            addCriterion("IT_IS_COMPELETED between", value1, value2, "itIsCompeleted");
            return (Criteria) this;
        }

        public Criteria andItIsCompeletedNotBetween(String value1, String value2) {
            addCriterion("IT_IS_COMPELETED not between", value1, value2, "itIsCompeleted");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("\"STATE\" is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("\"STATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("\"STATE\" =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("\"STATE\" <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("\"STATE\" >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("\"STATE\" >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("\"STATE\" <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("\"STATE\" <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("\"STATE\" like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("\"STATE\" not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("\"STATE\" in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("\"STATE\" not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("\"STATE\" between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("\"STATE\" not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberIsNull() {
            addCriterion("COMPANY_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberIsNotNull() {
            addCriterion("COMPANY_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberEqualTo(String value) {
            addCriterion("COMPANY_NUMBER =", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberNotEqualTo(String value) {
            addCriterion("COMPANY_NUMBER <>", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberGreaterThan(String value) {
            addCriterion("COMPANY_NUMBER >", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NUMBER >=", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberLessThan(String value) {
            addCriterion("COMPANY_NUMBER <", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NUMBER <=", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberLike(String value) {
            addCriterion("COMPANY_NUMBER like", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberNotLike(String value) {
            addCriterion("COMPANY_NUMBER not like", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberIn(List<String> values) {
            addCriterion("COMPANY_NUMBER in", values, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberNotIn(List<String> values) {
            addCriterion("COMPANY_NUMBER not in", values, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberBetween(String value1, String value2) {
            addCriterion("COMPANY_NUMBER between", value1, value2, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NUMBER not between", value1, value2, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeIsNull() {
            addCriterion("LAST_MODIFICATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeIsNotNull() {
            addCriterion("LAST_MODIFICATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeEqualTo(Date value) {
            addCriterion("LAST_MODIFICATION_TIME =", value, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeNotEqualTo(Date value) {
            addCriterion("LAST_MODIFICATION_TIME <>", value, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeGreaterThan(Date value) {
            addCriterion("LAST_MODIFICATION_TIME >", value, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFICATION_TIME >=", value, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeLessThan(Date value) {
            addCriterion("LAST_MODIFICATION_TIME <", value, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFICATION_TIME <=", value, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeIn(List<Date> values) {
            addCriterion("LAST_MODIFICATION_TIME in", values, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeNotIn(List<Date> values) {
            addCriterion("LAST_MODIFICATION_TIME not in", values, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFICATION_TIME between", value1, value2, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFICATION_TIME not between", value1, value2, "lastModificationTime");
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