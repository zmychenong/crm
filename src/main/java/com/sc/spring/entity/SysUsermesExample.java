package com.sc.spring.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUsermesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUsermesExample() {
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

        public Criteria andWorkerNameIsNull() {
            addCriterion("WORKER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNotNull() {
            addCriterion("WORKER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameEqualTo(String value) {
            addCriterion("WORKER_NAME =", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotEqualTo(String value) {
            addCriterion("WORKER_NAME <>", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThan(String value) {
            addCriterion("WORKER_NAME >", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_NAME >=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThan(String value) {
            addCriterion("WORKER_NAME <", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThanOrEqualTo(String value) {
            addCriterion("WORKER_NAME <=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLike(String value) {
            addCriterion("WORKER_NAME like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotLike(String value) {
            addCriterion("WORKER_NAME not like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIn(List<String> values) {
            addCriterion("WORKER_NAME in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotIn(List<String> values) {
            addCriterion("WORKER_NAME not in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameBetween(String value1, String value2) {
            addCriterion("WORKER_NAME between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotBetween(String value1, String value2) {
            addCriterion("WORKER_NAME not between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIsNull() {
            addCriterion("WORKER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIsNotNull() {
            addCriterion("WORKER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerSexEqualTo(String value) {
            addCriterion("WORKER_SEX =", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotEqualTo(String value) {
            addCriterion("WORKER_SEX <>", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexGreaterThan(String value) {
            addCriterion("WORKER_SEX >", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_SEX >=", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLessThan(String value) {
            addCriterion("WORKER_SEX <", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLessThanOrEqualTo(String value) {
            addCriterion("WORKER_SEX <=", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLike(String value) {
            addCriterion("WORKER_SEX like", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotLike(String value) {
            addCriterion("WORKER_SEX not like", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIn(List<String> values) {
            addCriterion("WORKER_SEX in", values, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotIn(List<String> values) {
            addCriterion("WORKER_SEX not in", values, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexBetween(String value1, String value2) {
            addCriterion("WORKER_SEX between", value1, value2, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotBetween(String value1, String value2) {
            addCriterion("WORKER_SEX not between", value1, value2, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoIsNull() {
            addCriterion("WORKER_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoIsNotNull() {
            addCriterion("WORKER_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoEqualTo(String value) {
            addCriterion("WORKER_PHOTO =", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoNotEqualTo(String value) {
            addCriterion("WORKER_PHOTO <>", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoGreaterThan(String value) {
            addCriterion("WORKER_PHOTO >", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_PHOTO >=", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoLessThan(String value) {
            addCriterion("WORKER_PHOTO <", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoLessThanOrEqualTo(String value) {
            addCriterion("WORKER_PHOTO <=", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoLike(String value) {
            addCriterion("WORKER_PHOTO like", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoNotLike(String value) {
            addCriterion("WORKER_PHOTO not like", value, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoIn(List<String> values) {
            addCriterion("WORKER_PHOTO in", values, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoNotIn(List<String> values) {
            addCriterion("WORKER_PHOTO not in", values, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoBetween(String value1, String value2) {
            addCriterion("WORKER_PHOTO between", value1, value2, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotoNotBetween(String value1, String value2) {
            addCriterion("WORKER_PHOTO not between", value1, value2, "workerPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardIsNull() {
            addCriterion("WORKER_IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardIsNotNull() {
            addCriterion("WORKER_IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardEqualTo(String value) {
            addCriterion("WORKER_IDCARD =", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardNotEqualTo(String value) {
            addCriterion("WORKER_IDCARD <>", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardGreaterThan(String value) {
            addCriterion("WORKER_IDCARD >", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_IDCARD >=", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardLessThan(String value) {
            addCriterion("WORKER_IDCARD <", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardLessThanOrEqualTo(String value) {
            addCriterion("WORKER_IDCARD <=", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardLike(String value) {
            addCriterion("WORKER_IDCARD like", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardNotLike(String value) {
            addCriterion("WORKER_IDCARD not like", value, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardIn(List<String> values) {
            addCriterion("WORKER_IDCARD in", values, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardNotIn(List<String> values) {
            addCriterion("WORKER_IDCARD not in", values, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardBetween(String value1, String value2) {
            addCriterion("WORKER_IDCARD between", value1, value2, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andWorkerIdcardNotBetween(String value1, String value2) {
            addCriterion("WORKER_IDCARD not between", value1, value2, "workerIdcard");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNull() {
            addCriterion("HOME_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("HOME_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("HOME_ADDRESS =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("HOME_ADDRESS <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("HOME_ADDRESS >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_ADDRESS >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("HOME_ADDRESS <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("HOME_ADDRESS <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("HOME_ADDRESS like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("HOME_ADDRESS not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("HOME_ADDRESS in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("HOME_ADDRESS not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("HOME_ADDRESS between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("HOME_ADDRESS not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressIsNull() {
            addCriterion("NOW_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andNowAddressIsNotNull() {
            addCriterion("NOW_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andNowAddressEqualTo(String value) {
            addCriterion("NOW_ADDRESS =", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotEqualTo(String value) {
            addCriterion("NOW_ADDRESS <>", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressGreaterThan(String value) {
            addCriterion("NOW_ADDRESS >", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressGreaterThanOrEqualTo(String value) {
            addCriterion("NOW_ADDRESS >=", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressLessThan(String value) {
            addCriterion("NOW_ADDRESS <", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressLessThanOrEqualTo(String value) {
            addCriterion("NOW_ADDRESS <=", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressLike(String value) {
            addCriterion("NOW_ADDRESS like", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotLike(String value) {
            addCriterion("NOW_ADDRESS not like", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressIn(List<String> values) {
            addCriterion("NOW_ADDRESS in", values, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotIn(List<String> values) {
            addCriterion("NOW_ADDRESS not in", values, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressBetween(String value1, String value2) {
            addCriterion("NOW_ADDRESS between", value1, value2, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotBetween(String value1, String value2) {
            addCriterion("NOW_ADDRESS not between", value1, value2, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerEduIsNull() {
            addCriterion("WORKER_EDU is null");
            return (Criteria) this;
        }

        public Criteria andWorkerEduIsNotNull() {
            addCriterion("WORKER_EDU is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerEduEqualTo(String value) {
            addCriterion("WORKER_EDU =", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduNotEqualTo(String value) {
            addCriterion("WORKER_EDU <>", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduGreaterThan(String value) {
            addCriterion("WORKER_EDU >", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_EDU >=", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduLessThan(String value) {
            addCriterion("WORKER_EDU <", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduLessThanOrEqualTo(String value) {
            addCriterion("WORKER_EDU <=", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduLike(String value) {
            addCriterion("WORKER_EDU like", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduNotLike(String value) {
            addCriterion("WORKER_EDU not like", value, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduIn(List<String> values) {
            addCriterion("WORKER_EDU in", values, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduNotIn(List<String> values) {
            addCriterion("WORKER_EDU not in", values, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduBetween(String value1, String value2) {
            addCriterion("WORKER_EDU between", value1, value2, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andWorkerEduNotBetween(String value1, String value2) {
            addCriterion("WORKER_EDU not between", value1, value2, "workerEdu");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookIsNull() {
            addCriterion("POLITC_OUTLOOK is null");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookIsNotNull() {
            addCriterion("POLITC_OUTLOOK is not null");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookEqualTo(String value) {
            addCriterion("POLITC_OUTLOOK =", value, "politcOutlook");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookNotEqualTo(String value) {
            addCriterion("POLITC_OUTLOOK <>", value, "politcOutlook");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookGreaterThan(String value) {
            addCriterion("POLITC_OUTLOOK >", value, "politcOutlook");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookGreaterThanOrEqualTo(String value) {
            addCriterion("POLITC_OUTLOOK >=", value, "politcOutlook");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookLessThan(String value) {
            addCriterion("POLITC_OUTLOOK <", value, "politcOutlook");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookLessThanOrEqualTo(String value) {
            addCriterion("POLITC_OUTLOOK <=", value, "politcOutlook");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookLike(String value) {
            addCriterion("POLITC_OUTLOOK like", value, "politcOutlook");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookNotLike(String value) {
            addCriterion("POLITC_OUTLOOK not like", value, "politcOutlook");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookIn(List<String> values) {
            addCriterion("POLITC_OUTLOOK in", values, "politcOutlook");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookNotIn(List<String> values) {
            addCriterion("POLITC_OUTLOOK not in", values, "politcOutlook");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookBetween(String value1, String value2) {
            addCriterion("POLITC_OUTLOOK between", value1, value2, "politcOutlook");
            return (Criteria) this;
        }

        public Criteria andPolitcOutlookNotBetween(String value1, String value2) {
            addCriterion("POLITC_OUTLOOK not between", value1, value2, "politcOutlook");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("SCHOOL =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("SCHOOL <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("SCHOOL >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("SCHOOL <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("SCHOOL like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("SCHOOL not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("SCHOOL in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("SCHOOL not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("SCHOOL between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("SCHOOL not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andOnlineContactIsNull() {
            addCriterion("ONLINE_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andOnlineContactIsNotNull() {
            addCriterion("ONLINE_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineContactEqualTo(String value) {
            addCriterion("ONLINE_CONTACT =", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactNotEqualTo(String value) {
            addCriterion("ONLINE_CONTACT <>", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactGreaterThan(String value) {
            addCriterion("ONLINE_CONTACT >", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactGreaterThanOrEqualTo(String value) {
            addCriterion("ONLINE_CONTACT >=", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactLessThan(String value) {
            addCriterion("ONLINE_CONTACT <", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactLessThanOrEqualTo(String value) {
            addCriterion("ONLINE_CONTACT <=", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactLike(String value) {
            addCriterion("ONLINE_CONTACT like", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactNotLike(String value) {
            addCriterion("ONLINE_CONTACT not like", value, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactIn(List<String> values) {
            addCriterion("ONLINE_CONTACT in", values, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactNotIn(List<String> values) {
            addCriterion("ONLINE_CONTACT not in", values, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactBetween(String value1, String value2) {
            addCriterion("ONLINE_CONTACT between", value1, value2, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andOnlineContactNotBetween(String value1, String value2) {
            addCriterion("ONLINE_CONTACT not between", value1, value2, "onlineContact");
            return (Criteria) this;
        }

        public Criteria andContactinfoIsNull() {
            addCriterion("CONTACTINFO is null");
            return (Criteria) this;
        }

        public Criteria andContactinfoIsNotNull() {
            addCriterion("CONTACTINFO is not null");
            return (Criteria) this;
        }

        public Criteria andContactinfoEqualTo(String value) {
            addCriterion("CONTACTINFO =", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotEqualTo(String value) {
            addCriterion("CONTACTINFO <>", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoGreaterThan(String value) {
            addCriterion("CONTACTINFO >", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTINFO >=", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoLessThan(String value) {
            addCriterion("CONTACTINFO <", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoLessThanOrEqualTo(String value) {
            addCriterion("CONTACTINFO <=", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoLike(String value) {
            addCriterion("CONTACTINFO like", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotLike(String value) {
            addCriterion("CONTACTINFO not like", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoIn(List<String> values) {
            addCriterion("CONTACTINFO in", values, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotIn(List<String> values) {
            addCriterion("CONTACTINFO not in", values, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoBetween(String value1, String value2) {
            addCriterion("CONTACTINFO between", value1, value2, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotBetween(String value1, String value2) {
            addCriterion("CONTACTINFO not between", value1, value2, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andExamineStateIsNull() {
            addCriterion("EXAMINE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andExamineStateIsNotNull() {
            addCriterion("EXAMINE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andExamineStateEqualTo(String value) {
            addCriterion("EXAMINE_STATE =", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateNotEqualTo(String value) {
            addCriterion("EXAMINE_STATE <>", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateGreaterThan(String value) {
            addCriterion("EXAMINE_STATE >", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_STATE >=", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateLessThan(String value) {
            addCriterion("EXAMINE_STATE <", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_STATE <=", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateLike(String value) {
            addCriterion("EXAMINE_STATE like", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateNotLike(String value) {
            addCriterion("EXAMINE_STATE not like", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateIn(List<String> values) {
            addCriterion("EXAMINE_STATE in", values, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateNotIn(List<String> values) {
            addCriterion("EXAMINE_STATE not in", values, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateBetween(String value1, String value2) {
            addCriterion("EXAMINE_STATE between", value1, value2, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_STATE not between", value1, value2, "examineState");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("POST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("POST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Long value) {
            addCriterion("POST_ID =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Long value) {
            addCriterion("POST_ID <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Long value) {
            addCriterion("POST_ID >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("POST_ID >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Long value) {
            addCriterion("POST_ID <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Long value) {
            addCriterion("POST_ID <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Long> values) {
            addCriterion("POST_ID in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Long> values) {
            addCriterion("POST_ID not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Long value1, Long value2) {
            addCriterion("POST_ID between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Long value1, Long value2) {
            addCriterion("POST_ID not between", value1, value2, "postId");
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