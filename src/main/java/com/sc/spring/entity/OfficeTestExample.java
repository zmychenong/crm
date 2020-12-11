package com.sc.spring.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfficeTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficeTestExample() {
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

        public Criteria andIndexIdIsNull() {
            addCriterion("INDEX_ID is null");
            return (Criteria) this;
        }

        public Criteria andIndexIdIsNotNull() {
            addCriterion("INDEX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIndexIdEqualTo(String value) {
            addCriterion("INDEX_ID =", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotEqualTo(String value) {
            addCriterion("INDEX_ID <>", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdGreaterThan(String value) {
            addCriterion("INDEX_ID >", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdGreaterThanOrEqualTo(String value) {
            addCriterion("INDEX_ID >=", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdLessThan(String value) {
            addCriterion("INDEX_ID <", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdLessThanOrEqualTo(String value) {
            addCriterion("INDEX_ID <=", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdLike(String value) {
            addCriterion("INDEX_ID like", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotLike(String value) {
            addCriterion("INDEX_ID not like", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdIn(List<String> values) {
            addCriterion("INDEX_ID in", values, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotIn(List<String> values) {
            addCriterion("INDEX_ID not in", values, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdBetween(String value1, String value2) {
            addCriterion("INDEX_ID between", value1, value2, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotBetween(String value1, String value2) {
            addCriterion("INDEX_ID not between", value1, value2, "indexId");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexIsNull() {
            addCriterion("ASSESSMENT_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexIsNotNull() {
            addCriterion("ASSESSMENT_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexEqualTo(String value) {
            addCriterion("ASSESSMENT_INDEX =", value, "assessmentIndex");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexNotEqualTo(String value) {
            addCriterion("ASSESSMENT_INDEX <>", value, "assessmentIndex");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexGreaterThan(String value) {
            addCriterion("ASSESSMENT_INDEX >", value, "assessmentIndex");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESSMENT_INDEX >=", value, "assessmentIndex");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexLessThan(String value) {
            addCriterion("ASSESSMENT_INDEX <", value, "assessmentIndex");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexLessThanOrEqualTo(String value) {
            addCriterion("ASSESSMENT_INDEX <=", value, "assessmentIndex");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexLike(String value) {
            addCriterion("ASSESSMENT_INDEX like", value, "assessmentIndex");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexNotLike(String value) {
            addCriterion("ASSESSMENT_INDEX not like", value, "assessmentIndex");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexIn(List<String> values) {
            addCriterion("ASSESSMENT_INDEX in", values, "assessmentIndex");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexNotIn(List<String> values) {
            addCriterion("ASSESSMENT_INDEX not in", values, "assessmentIndex");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexBetween(String value1, String value2) {
            addCriterion("ASSESSMENT_INDEX between", value1, value2, "assessmentIndex");
            return (Criteria) this;
        }

        public Criteria andAssessmentIndexNotBetween(String value1, String value2) {
            addCriterion("ASSESSMENT_INDEX not between", value1, value2, "assessmentIndex");
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