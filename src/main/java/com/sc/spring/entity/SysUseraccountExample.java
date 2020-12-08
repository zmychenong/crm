package com.sc.spring.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUseraccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUseraccountExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIsNull() {
            addCriterion("WORKER_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIsNotNull() {
            addCriterion("WORKER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdEqualTo(Long value) {
            addCriterion("WORKER_ID =", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotEqualTo(Long value) {
            addCriterion("WORKER_ID <>", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThan(Long value) {
            addCriterion("WORKER_ID >", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WORKER_ID >=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThan(Long value) {
            addCriterion("WORKER_ID <", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThanOrEqualTo(Long value) {
            addCriterion("WORKER_ID <=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIn(List<Long> values) {
            addCriterion("WORKER_ID in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotIn(List<Long> values) {
            addCriterion("WORKER_ID not in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdBetween(Long value1, Long value2) {
            addCriterion("WORKER_ID between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotBetween(Long value1, Long value2) {
            addCriterion("WORKER_ID not between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andAccountStateIsNull() {
            addCriterion("ACCOUNT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountStateIsNotNull() {
            addCriterion("ACCOUNT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStateEqualTo(String value) {
            addCriterion("ACCOUNT_STATE =", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotEqualTo(String value) {
            addCriterion("ACCOUNT_STATE <>", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateGreaterThan(String value) {
            addCriterion("ACCOUNT_STATE >", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_STATE >=", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLessThan(String value) {
            addCriterion("ACCOUNT_STATE <", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_STATE <=", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLike(String value) {
            addCriterion("ACCOUNT_STATE like", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotLike(String value) {
            addCriterion("ACCOUNT_STATE not like", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateIn(List<String> values) {
            addCriterion("ACCOUNT_STATE in", values, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotIn(List<String> values) {
            addCriterion("ACCOUNT_STATE not in", values, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateBetween(String value1, String value2) {
            addCriterion("ACCOUNT_STATE between", value1, value2, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_STATE not between", value1, value2, "accountState");
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

        public Criteria andUserSaltIsNull() {
            addCriterion("USER_SALT is null");
            return (Criteria) this;
        }

        public Criteria andUserSaltIsNotNull() {
            addCriterion("USER_SALT is not null");
            return (Criteria) this;
        }

        public Criteria andUserSaltEqualTo(String value) {
            addCriterion("USER_SALT =", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotEqualTo(String value) {
            addCriterion("USER_SALT <>", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltGreaterThan(String value) {
            addCriterion("USER_SALT >", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SALT >=", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLessThan(String value) {
            addCriterion("USER_SALT <", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLessThanOrEqualTo(String value) {
            addCriterion("USER_SALT <=", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLike(String value) {
            addCriterion("USER_SALT like", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotLike(String value) {
            addCriterion("USER_SALT not like", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltIn(List<String> values) {
            addCriterion("USER_SALT in", values, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotIn(List<String> values) {
            addCriterion("USER_SALT not in", values, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltBetween(String value1, String value2) {
            addCriterion("USER_SALT between", value1, value2, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotBetween(String value1, String value2) {
            addCriterion("USER_SALT not between", value1, value2, "userSalt");
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