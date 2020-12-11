package com.sc.spring.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfficeTasktestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficeTasktestExample() {
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

        public Criteria andTaskTitleIsNull() {
            addCriterion("TASK_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIsNotNull() {
            addCriterion("TASK_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTitleEqualTo(String value) {
            addCriterion("TASK_TITLE =", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotEqualTo(String value) {
            addCriterion("TASK_TITLE <>", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleGreaterThan(String value) {
            addCriterion("TASK_TITLE >", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TITLE >=", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLessThan(String value) {
            addCriterion("TASK_TITLE <", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLessThanOrEqualTo(String value) {
            addCriterion("TASK_TITLE <=", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLike(String value) {
            addCriterion("TASK_TITLE like", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotLike(String value) {
            addCriterion("TASK_TITLE not like", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIn(List<String> values) {
            addCriterion("TASK_TITLE in", values, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotIn(List<String> values) {
            addCriterion("TASK_TITLE not in", values, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleBetween(String value1, String value2) {
            addCriterion("TASK_TITLE between", value1, value2, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotBetween(String value1, String value2) {
            addCriterion("TASK_TITLE not between", value1, value2, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentIsNull() {
            addCriterion("TASK_SPECIFIC_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentIsNotNull() {
            addCriterion("TASK_SPECIFIC_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentEqualTo(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT =", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentNotEqualTo(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT <>", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentGreaterThan(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT >", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT >=", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentLessThan(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT <", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentLessThanOrEqualTo(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT <=", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentLike(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT like", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentNotLike(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT not like", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentIn(List<String> values) {
            addCriterion("TASK_SPECIFIC_CONTENT in", values, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentNotIn(List<String> values) {
            addCriterion("TASK_SPECIFIC_CONTENT not in", values, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentBetween(String value1, String value2) {
            addCriterion("TASK_SPECIFIC_CONTENT between", value1, value2, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentNotBetween(String value1, String value2) {
            addCriterion("TASK_SPECIFIC_CONTENT not between", value1, value2, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherIsNull() {
            addCriterion("TASK_PUBLISHER is null");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherIsNotNull() {
            addCriterion("TASK_PUBLISHER is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherEqualTo(String value) {
            addCriterion("TASK_PUBLISHER =", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherNotEqualTo(String value) {
            addCriterion("TASK_PUBLISHER <>", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherGreaterThan(String value) {
            addCriterion("TASK_PUBLISHER >", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_PUBLISHER >=", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherLessThan(String value) {
            addCriterion("TASK_PUBLISHER <", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherLessThanOrEqualTo(String value) {
            addCriterion("TASK_PUBLISHER <=", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherLike(String value) {
            addCriterion("TASK_PUBLISHER like", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherNotLike(String value) {
            addCriterion("TASK_PUBLISHER not like", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherIn(List<String> values) {
            addCriterion("TASK_PUBLISHER in", values, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherNotIn(List<String> values) {
            addCriterion("TASK_PUBLISHER not in", values, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherBetween(String value1, String value2) {
            addCriterion("TASK_PUBLISHER between", value1, value2, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherNotBetween(String value1, String value2) {
            addCriterion("TASK_PUBLISHER not between", value1, value2, "taskPublisher");
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

        public Criteria andTaskStartTimeIsNull() {
            addCriterion("TASK_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIsNotNull() {
            addCriterion("TASK_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeEqualTo(String value) {
            addCriterion("TASK_START_TIME =", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotEqualTo(String value) {
            addCriterion("TASK_START_TIME <>", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeGreaterThan(String value) {
            addCriterion("TASK_START_TIME >", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_START_TIME >=", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLessThan(String value) {
            addCriterion("TASK_START_TIME <", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLessThanOrEqualTo(String value) {
            addCriterion("TASK_START_TIME <=", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLike(String value) {
            addCriterion("TASK_START_TIME like", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotLike(String value) {
            addCriterion("TASK_START_TIME not like", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIn(List<String> values) {
            addCriterion("TASK_START_TIME in", values, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotIn(List<String> values) {
            addCriterion("TASK_START_TIME not in", values, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeBetween(String value1, String value2) {
            addCriterion("TASK_START_TIME between", value1, value2, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotBetween(String value1, String value2) {
            addCriterion("TASK_START_TIME not between", value1, value2, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeIsNull() {
            addCriterion("TASK_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeIsNotNull() {
            addCriterion("TASK_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeEqualTo(String value) {
            addCriterion("TASK_END_TIME =", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeNotEqualTo(String value) {
            addCriterion("TASK_END_TIME <>", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeGreaterThan(String value) {
            addCriterion("TASK_END_TIME >", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_END_TIME >=", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeLessThan(String value) {
            addCriterion("TASK_END_TIME <", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeLessThanOrEqualTo(String value) {
            addCriterion("TASK_END_TIME <=", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeLike(String value) {
            addCriterion("TASK_END_TIME like", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeNotLike(String value) {
            addCriterion("TASK_END_TIME not like", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeIn(List<String> values) {
            addCriterion("TASK_END_TIME in", values, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeNotIn(List<String> values) {
            addCriterion("TASK_END_TIME not in", values, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeBetween(String value1, String value2) {
            addCriterion("TASK_END_TIME between", value1, value2, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeNotBetween(String value1, String value2) {
            addCriterion("TASK_END_TIME not between", value1, value2, "taskEndTime");
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