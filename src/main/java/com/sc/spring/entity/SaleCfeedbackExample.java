package com.sc.spring.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleCfeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleCfeedbackExample() {
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

        public Criteria andBacknumIsNull() {
            addCriterion("BACKNUM is null");
            return (Criteria) this;
        }

        public Criteria andBacknumIsNotNull() {
            addCriterion("BACKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andBacknumEqualTo(BigDecimal value) {
            addCriterion("BACKNUM =", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumNotEqualTo(BigDecimal value) {
            addCriterion("BACKNUM <>", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumGreaterThan(BigDecimal value) {
            addCriterion("BACKNUM >", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKNUM >=", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumLessThan(BigDecimal value) {
            addCriterion("BACKNUM <", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKNUM <=", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumIn(List<BigDecimal> values) {
            addCriterion("BACKNUM in", values, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumNotIn(List<BigDecimal> values) {
            addCriterion("BACKNUM not in", values, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKNUM between", value1, value2, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKNUM not between", value1, value2, "backnum");
            return (Criteria) this;
        }

        public Criteria andRecordfirstIsNull() {
            addCriterion("RECORDFIRST is null");
            return (Criteria) this;
        }

        public Criteria andRecordfirstIsNotNull() {
            addCriterion("RECORDFIRST is not null");
            return (Criteria) this;
        }

        public Criteria andRecordfirstEqualTo(String value) {
            addCriterion("RECORDFIRST =", value, "recordfirst");
            return (Criteria) this;
        }

        public Criteria andRecordfirstNotEqualTo(String value) {
            addCriterion("RECORDFIRST <>", value, "recordfirst");
            return (Criteria) this;
        }

        public Criteria andRecordfirstGreaterThan(String value) {
            addCriterion("RECORDFIRST >", value, "recordfirst");
            return (Criteria) this;
        }

        public Criteria andRecordfirstGreaterThanOrEqualTo(String value) {
            addCriterion("RECORDFIRST >=", value, "recordfirst");
            return (Criteria) this;
        }

        public Criteria andRecordfirstLessThan(String value) {
            addCriterion("RECORDFIRST <", value, "recordfirst");
            return (Criteria) this;
        }

        public Criteria andRecordfirstLessThanOrEqualTo(String value) {
            addCriterion("RECORDFIRST <=", value, "recordfirst");
            return (Criteria) this;
        }

        public Criteria andRecordfirstLike(String value) {
            addCriterion("RECORDFIRST like", value, "recordfirst");
            return (Criteria) this;
        }

        public Criteria andRecordfirstNotLike(String value) {
            addCriterion("RECORDFIRST not like", value, "recordfirst");
            return (Criteria) this;
        }

        public Criteria andRecordfirstIn(List<String> values) {
            addCriterion("RECORDFIRST in", values, "recordfirst");
            return (Criteria) this;
        }

        public Criteria andRecordfirstNotIn(List<String> values) {
            addCriterion("RECORDFIRST not in", values, "recordfirst");
            return (Criteria) this;
        }

        public Criteria andRecordfirstBetween(String value1, String value2) {
            addCriterion("RECORDFIRST between", value1, value2, "recordfirst");
            return (Criteria) this;
        }

        public Criteria andRecordfirstNotBetween(String value1, String value2) {
            addCriterion("RECORDFIRST not between", value1, value2, "recordfirst");
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

        public Criteria andHowIsNull() {
            addCriterion("HOW is null");
            return (Criteria) this;
        }

        public Criteria andHowIsNotNull() {
            addCriterion("HOW is not null");
            return (Criteria) this;
        }

        public Criteria andHowEqualTo(String value) {
            addCriterion("HOW =", value, "how");
            return (Criteria) this;
        }

        public Criteria andHowNotEqualTo(String value) {
            addCriterion("HOW <>", value, "how");
            return (Criteria) this;
        }

        public Criteria andHowGreaterThan(String value) {
            addCriterion("HOW >", value, "how");
            return (Criteria) this;
        }

        public Criteria andHowGreaterThanOrEqualTo(String value) {
            addCriterion("HOW >=", value, "how");
            return (Criteria) this;
        }

        public Criteria andHowLessThan(String value) {
            addCriterion("HOW <", value, "how");
            return (Criteria) this;
        }

        public Criteria andHowLessThanOrEqualTo(String value) {
            addCriterion("HOW <=", value, "how");
            return (Criteria) this;
        }

        public Criteria andHowLike(String value) {
            addCriterion("HOW like", value, "how");
            return (Criteria) this;
        }

        public Criteria andHowNotLike(String value) {
            addCriterion("HOW not like", value, "how");
            return (Criteria) this;
        }

        public Criteria andHowIn(List<String> values) {
            addCriterion("HOW in", values, "how");
            return (Criteria) this;
        }

        public Criteria andHowNotIn(List<String> values) {
            addCriterion("HOW not in", values, "how");
            return (Criteria) this;
        }

        public Criteria andHowBetween(String value1, String value2) {
            addCriterion("HOW between", value1, value2, "how");
            return (Criteria) this;
        }

        public Criteria andHowNotBetween(String value1, String value2) {
            addCriterion("HOW not between", value1, value2, "how");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeIsNull() {
            addCriterion("FEEDBACKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeIsNotNull() {
            addCriterion("FEEDBACKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeEqualTo(String value) {
            addCriterion("FEEDBACKTYPE =", value, "feedbacktype");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeNotEqualTo(String value) {
            addCriterion("FEEDBACKTYPE <>", value, "feedbacktype");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeGreaterThan(String value) {
            addCriterion("FEEDBACKTYPE >", value, "feedbacktype");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACKTYPE >=", value, "feedbacktype");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeLessThan(String value) {
            addCriterion("FEEDBACKTYPE <", value, "feedbacktype");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACKTYPE <=", value, "feedbacktype");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeLike(String value) {
            addCriterion("FEEDBACKTYPE like", value, "feedbacktype");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeNotLike(String value) {
            addCriterion("FEEDBACKTYPE not like", value, "feedbacktype");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeIn(List<String> values) {
            addCriterion("FEEDBACKTYPE in", values, "feedbacktype");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeNotIn(List<String> values) {
            addCriterion("FEEDBACKTYPE not in", values, "feedbacktype");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeBetween(String value1, String value2) {
            addCriterion("FEEDBACKTYPE between", value1, value2, "feedbacktype");
            return (Criteria) this;
        }

        public Criteria andFeedbacktypeNotBetween(String value1, String value2) {
            addCriterion("FEEDBACKTYPE not between", value1, value2, "feedbacktype");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeIsNull() {
            addCriterion("FEEDBACKTIME is null");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeIsNotNull() {
            addCriterion("FEEDBACKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeEqualTo(Date value) {
            addCriterion("FEEDBACKTIME =", value, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeNotEqualTo(Date value) {
            addCriterion("FEEDBACKTIME <>", value, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeGreaterThan(Date value) {
            addCriterion("FEEDBACKTIME >", value, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FEEDBACKTIME >=", value, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeLessThan(Date value) {
            addCriterion("FEEDBACKTIME <", value, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeLessThanOrEqualTo(Date value) {
            addCriterion("FEEDBACKTIME <=", value, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeIn(List<Date> values) {
            addCriterion("FEEDBACKTIME in", values, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeNotIn(List<Date> values) {
            addCriterion("FEEDBACKTIME not in", values, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeBetween(Date value1, Date value2) {
            addCriterion("FEEDBACKTIME between", value1, value2, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeNotBetween(Date value1, Date value2) {
            addCriterion("FEEDBACKTIME not between", value1, value2, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andChargemenIsNull() {
            addCriterion("CHARGEMEN is null");
            return (Criteria) this;
        }

        public Criteria andChargemenIsNotNull() {
            addCriterion("CHARGEMEN is not null");
            return (Criteria) this;
        }

        public Criteria andChargemenEqualTo(String value) {
            addCriterion("CHARGEMEN =", value, "chargemen");
            return (Criteria) this;
        }

        public Criteria andChargemenNotEqualTo(String value) {
            addCriterion("CHARGEMEN <>", value, "chargemen");
            return (Criteria) this;
        }

        public Criteria andChargemenGreaterThan(String value) {
            addCriterion("CHARGEMEN >", value, "chargemen");
            return (Criteria) this;
        }

        public Criteria andChargemenGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGEMEN >=", value, "chargemen");
            return (Criteria) this;
        }

        public Criteria andChargemenLessThan(String value) {
            addCriterion("CHARGEMEN <", value, "chargemen");
            return (Criteria) this;
        }

        public Criteria andChargemenLessThanOrEqualTo(String value) {
            addCriterion("CHARGEMEN <=", value, "chargemen");
            return (Criteria) this;
        }

        public Criteria andChargemenLike(String value) {
            addCriterion("CHARGEMEN like", value, "chargemen");
            return (Criteria) this;
        }

        public Criteria andChargemenNotLike(String value) {
            addCriterion("CHARGEMEN not like", value, "chargemen");
            return (Criteria) this;
        }

        public Criteria andChargemenIn(List<String> values) {
            addCriterion("CHARGEMEN in", values, "chargemen");
            return (Criteria) this;
        }

        public Criteria andChargemenNotIn(List<String> values) {
            addCriterion("CHARGEMEN not in", values, "chargemen");
            return (Criteria) this;
        }

        public Criteria andChargemenBetween(String value1, String value2) {
            addCriterion("CHARGEMEN between", value1, value2, "chargemen");
            return (Criteria) this;
        }

        public Criteria andChargemenNotBetween(String value1, String value2) {
            addCriterion("CHARGEMEN not between", value1, value2, "chargemen");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("\"SOURCE\" is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("\"SOURCE\" is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("\"SOURCE\" =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("\"SOURCE\" <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("\"SOURCE\" >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("\"SOURCE\" >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("\"SOURCE\" <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("\"SOURCE\" <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("\"SOURCE\" like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("\"SOURCE\" not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("\"SOURCE\" in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("\"SOURCE\" not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("\"SOURCE\" between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("\"SOURCE\" not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andThemeIsNull() {
            addCriterion("THEME is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("THEME is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("THEME =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("THEME <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("THEME >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("THEME >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("THEME <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("THEME <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("THEME like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("THEME not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("THEME in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("THEME not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("THEME between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("THEME not between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNull() {
            addCriterion("ANALYSIS is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNotNull() {
            addCriterion("ANALYSIS is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisEqualTo(String value) {
            addCriterion("ANALYSIS =", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotEqualTo(String value) {
            addCriterion("ANALYSIS <>", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThan(String value) {
            addCriterion("ANALYSIS >", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("ANALYSIS >=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThan(String value) {
            addCriterion("ANALYSIS <", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThanOrEqualTo(String value) {
            addCriterion("ANALYSIS <=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLike(String value) {
            addCriterion("ANALYSIS like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotLike(String value) {
            addCriterion("ANALYSIS not like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisIn(List<String> values) {
            addCriterion("ANALYSIS in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotIn(List<String> values) {
            addCriterion("ANALYSIS not in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisBetween(String value1, String value2) {
            addCriterion("ANALYSIS between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotBetween(String value1, String value2) {
            addCriterion("ANALYSIS not between", value1, value2, "analysis");
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