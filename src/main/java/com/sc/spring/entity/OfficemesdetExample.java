package com.sc.spring.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfficemesdetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficemesdetExample() {
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

        public Criteria andDetailNoIsNull() {
            addCriterion("DETAIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andDetailNoIsNotNull() {
            addCriterion("DETAIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDetailNoEqualTo(Long value) {
            addCriterion("DETAIL_NO =", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoNotEqualTo(Long value) {
            addCriterion("DETAIL_NO <>", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoGreaterThan(Long value) {
            addCriterion("DETAIL_NO >", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoGreaterThanOrEqualTo(Long value) {
            addCriterion("DETAIL_NO >=", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoLessThan(Long value) {
            addCriterion("DETAIL_NO <", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoLessThanOrEqualTo(Long value) {
            addCriterion("DETAIL_NO <=", value, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoIn(List<Long> values) {
            addCriterion("DETAIL_NO in", values, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoNotIn(List<Long> values) {
            addCriterion("DETAIL_NO not in", values, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoBetween(Long value1, Long value2) {
            addCriterion("DETAIL_NO between", value1, value2, "detailNo");
            return (Criteria) this;
        }

        public Criteria andDetailNoNotBetween(Long value1, Long value2) {
            addCriterion("DETAIL_NO not between", value1, value2, "detailNo");
            return (Criteria) this;
        }

        public Criteria andSmsNumnerIsNull() {
            addCriterion("SMS_NUMNER is null");
            return (Criteria) this;
        }

        public Criteria andSmsNumnerIsNotNull() {
            addCriterion("SMS_NUMNER is not null");
            return (Criteria) this;
        }

        public Criteria andSmsNumnerEqualTo(BigDecimal value) {
            addCriterion("SMS_NUMNER =", value, "smsNumner");
            return (Criteria) this;
        }

        public Criteria andSmsNumnerNotEqualTo(BigDecimal value) {
            addCriterion("SMS_NUMNER <>", value, "smsNumner");
            return (Criteria) this;
        }

        public Criteria andSmsNumnerGreaterThan(BigDecimal value) {
            addCriterion("SMS_NUMNER >", value, "smsNumner");
            return (Criteria) this;
        }

        public Criteria andSmsNumnerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SMS_NUMNER >=", value, "smsNumner");
            return (Criteria) this;
        }

        public Criteria andSmsNumnerLessThan(BigDecimal value) {
            addCriterion("SMS_NUMNER <", value, "smsNumner");
            return (Criteria) this;
        }

        public Criteria andSmsNumnerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SMS_NUMNER <=", value, "smsNumner");
            return (Criteria) this;
        }

        public Criteria andSmsNumnerIn(List<BigDecimal> values) {
            addCriterion("SMS_NUMNER in", values, "smsNumner");
            return (Criteria) this;
        }

        public Criteria andSmsNumnerNotIn(List<BigDecimal> values) {
            addCriterion("SMS_NUMNER not in", values, "smsNumner");
            return (Criteria) this;
        }

        public Criteria andSmsNumnerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMS_NUMNER between", value1, value2, "smsNumner");
            return (Criteria) this;
        }

        public Criteria andSmsNumnerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMS_NUMNER not between", value1, value2, "smsNumner");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberIsNull() {
            addCriterion("RECEIVER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberIsNotNull() {
            addCriterion("RECEIVER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberEqualTo(BigDecimal value) {
            addCriterion("RECEIVER_NUMBER =", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVER_NUMBER <>", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberGreaterThan(BigDecimal value) {
            addCriterion("RECEIVER_NUMBER >", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVER_NUMBER >=", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberLessThan(BigDecimal value) {
            addCriterion("RECEIVER_NUMBER <", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVER_NUMBER <=", value, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberIn(List<BigDecimal> values) {
            addCriterion("RECEIVER_NUMBER in", values, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVER_NUMBER not in", values, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVER_NUMBER between", value1, value2, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andReceiverNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVER_NUMBER not between", value1, value2, "receiverNumber");
            return (Criteria) this;
        }

        public Criteria andMessageStatusIsNull() {
            addCriterion("MESSAGE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMessageStatusIsNotNull() {
            addCriterion("MESSAGE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStatusEqualTo(String value) {
            addCriterion("MESSAGE_STATUS =", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotEqualTo(String value) {
            addCriterion("MESSAGE_STATUS <>", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusGreaterThan(String value) {
            addCriterion("MESSAGE_STATUS >", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE_STATUS >=", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusLessThan(String value) {
            addCriterion("MESSAGE_STATUS <", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE_STATUS <=", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusLike(String value) {
            addCriterion("MESSAGE_STATUS like", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotLike(String value) {
            addCriterion("MESSAGE_STATUS not like", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusIn(List<String> values) {
            addCriterion("MESSAGE_STATUS in", values, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotIn(List<String> values) {
            addCriterion("MESSAGE_STATUS not in", values, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusBetween(String value1, String value2) {
            addCriterion("MESSAGE_STATUS between", value1, value2, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotBetween(String value1, String value2) {
            addCriterion("MESSAGE_STATUS not between", value1, value2, "messageStatus");
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

        public Criteria andCompanyNumberEqualTo(BigDecimal value) {
            addCriterion("COMPANY_NUMBER =", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberNotEqualTo(BigDecimal value) {
            addCriterion("COMPANY_NUMBER <>", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberGreaterThan(BigDecimal value) {
            addCriterion("COMPANY_NUMBER >", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANY_NUMBER >=", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberLessThan(BigDecimal value) {
            addCriterion("COMPANY_NUMBER <", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANY_NUMBER <=", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberIn(List<BigDecimal> values) {
            addCriterion("COMPANY_NUMBER in", values, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberNotIn(List<BigDecimal> values) {
            addCriterion("COMPANY_NUMBER not in", values, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANY_NUMBER between", value1, value2, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANY_NUMBER not between", value1, value2, "companyNumber");
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