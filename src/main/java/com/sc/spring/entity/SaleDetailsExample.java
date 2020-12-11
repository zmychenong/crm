package com.sc.spring.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleDetailsExample() {
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

        public Criteria andSaleDidIsNull() {
            addCriterion("SALE_DID is null");
            return (Criteria) this;
        }

        public Criteria andSaleDidIsNotNull() {
            addCriterion("SALE_DID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDidEqualTo(String value) {
            addCriterion("SALE_DID =", value, "saleDid");
            return (Criteria) this;
        }

        public Criteria andSaleDidNotEqualTo(String value) {
            addCriterion("SALE_DID <>", value, "saleDid");
            return (Criteria) this;
        }

        public Criteria andSaleDidGreaterThan(String value) {
            addCriterion("SALE_DID >", value, "saleDid");
            return (Criteria) this;
        }

        public Criteria andSaleDidGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_DID >=", value, "saleDid");
            return (Criteria) this;
        }

        public Criteria andSaleDidLessThan(String value) {
            addCriterion("SALE_DID <", value, "saleDid");
            return (Criteria) this;
        }

        public Criteria andSaleDidLessThanOrEqualTo(String value) {
            addCriterion("SALE_DID <=", value, "saleDid");
            return (Criteria) this;
        }

        public Criteria andSaleDidLike(String value) {
            addCriterion("SALE_DID like", value, "saleDid");
            return (Criteria) this;
        }

        public Criteria andSaleDidNotLike(String value) {
            addCriterion("SALE_DID not like", value, "saleDid");
            return (Criteria) this;
        }

        public Criteria andSaleDidIn(List<String> values) {
            addCriterion("SALE_DID in", values, "saleDid");
            return (Criteria) this;
        }

        public Criteria andSaleDidNotIn(List<String> values) {
            addCriterion("SALE_DID not in", values, "saleDid");
            return (Criteria) this;
        }

        public Criteria andSaleDidBetween(String value1, String value2) {
            addCriterion("SALE_DID between", value1, value2, "saleDid");
            return (Criteria) this;
        }

        public Criteria andSaleDidNotBetween(String value1, String value2) {
            addCriterion("SALE_DID not between", value1, value2, "saleDid");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNull() {
            addCriterion("SALE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNotNull() {
            addCriterion("SALE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIdEqualTo(String value) {
            addCriterion("SALE_ID =", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotEqualTo(String value) {
            addCriterion("SALE_ID <>", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThan(String value) {
            addCriterion("SALE_ID >", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_ID >=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThan(String value) {
            addCriterion("SALE_ID <", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThanOrEqualTo(String value) {
            addCriterion("SALE_ID <=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLike(String value) {
            addCriterion("SALE_ID like", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotLike(String value) {
            addCriterion("SALE_ID not like", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIn(List<String> values) {
            addCriterion("SALE_ID in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotIn(List<String> values) {
            addCriterion("SALE_ID not in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdBetween(String value1, String value2) {
            addCriterion("SALE_ID between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotBetween(String value1, String value2) {
            addCriterion("SALE_ID not between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleCommidIsNull() {
            addCriterion("SALE_COMMID is null");
            return (Criteria) this;
        }

        public Criteria andSaleCommidIsNotNull() {
            addCriterion("SALE_COMMID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCommidEqualTo(String value) {
            addCriterion("SALE_COMMID =", value, "saleCommid");
            return (Criteria) this;
        }

        public Criteria andSaleCommidNotEqualTo(String value) {
            addCriterion("SALE_COMMID <>", value, "saleCommid");
            return (Criteria) this;
        }

        public Criteria andSaleCommidGreaterThan(String value) {
            addCriterion("SALE_COMMID >", value, "saleCommid");
            return (Criteria) this;
        }

        public Criteria andSaleCommidGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_COMMID >=", value, "saleCommid");
            return (Criteria) this;
        }

        public Criteria andSaleCommidLessThan(String value) {
            addCriterion("SALE_COMMID <", value, "saleCommid");
            return (Criteria) this;
        }

        public Criteria andSaleCommidLessThanOrEqualTo(String value) {
            addCriterion("SALE_COMMID <=", value, "saleCommid");
            return (Criteria) this;
        }

        public Criteria andSaleCommidLike(String value) {
            addCriterion("SALE_COMMID like", value, "saleCommid");
            return (Criteria) this;
        }

        public Criteria andSaleCommidNotLike(String value) {
            addCriterion("SALE_COMMID not like", value, "saleCommid");
            return (Criteria) this;
        }

        public Criteria andSaleCommidIn(List<String> values) {
            addCriterion("SALE_COMMID in", values, "saleCommid");
            return (Criteria) this;
        }

        public Criteria andSaleCommidNotIn(List<String> values) {
            addCriterion("SALE_COMMID not in", values, "saleCommid");
            return (Criteria) this;
        }

        public Criteria andSaleCommidBetween(String value1, String value2) {
            addCriterion("SALE_COMMID between", value1, value2, "saleCommid");
            return (Criteria) this;
        }

        public Criteria andSaleCommidNotBetween(String value1, String value2) {
            addCriterion("SALE_COMMID not between", value1, value2, "saleCommid");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNull() {
            addCriterion("SALE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNotNull() {
            addCriterion("SALE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNumEqualTo(String value) {
            addCriterion("SALE_NUM =", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotEqualTo(String value) {
            addCriterion("SALE_NUM <>", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThan(String value) {
            addCriterion("SALE_NUM >", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_NUM >=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThan(String value) {
            addCriterion("SALE_NUM <", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThanOrEqualTo(String value) {
            addCriterion("SALE_NUM <=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLike(String value) {
            addCriterion("SALE_NUM like", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotLike(String value) {
            addCriterion("SALE_NUM not like", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumIn(List<String> values) {
            addCriterion("SALE_NUM in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotIn(List<String> values) {
            addCriterion("SALE_NUM not in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumBetween(String value1, String value2) {
            addCriterion("SALE_NUM between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotBetween(String value1, String value2) {
            addCriterion("SALE_NUM not between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("SALE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("SALE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(String value) {
            addCriterion("SALE_PRICE =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(String value) {
            addCriterion("SALE_PRICE <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(String value) {
            addCriterion("SALE_PRICE >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_PRICE >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(String value) {
            addCriterion("SALE_PRICE <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(String value) {
            addCriterion("SALE_PRICE <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLike(String value) {
            addCriterion("SALE_PRICE like", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotLike(String value) {
            addCriterion("SALE_PRICE not like", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<String> values) {
            addCriterion("SALE_PRICE in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<String> values) {
            addCriterion("SALE_PRICE not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(String value1, String value2) {
            addCriterion("SALE_PRICE between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(String value1, String value2) {
            addCriterion("SALE_PRICE not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkIsNull() {
            addCriterion("SALE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkIsNotNull() {
            addCriterion("SALE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkEqualTo(String value) {
            addCriterion("SALE_REMARK =", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkNotEqualTo(String value) {
            addCriterion("SALE_REMARK <>", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkGreaterThan(String value) {
            addCriterion("SALE_REMARK >", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_REMARK >=", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkLessThan(String value) {
            addCriterion("SALE_REMARK <", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkLessThanOrEqualTo(String value) {
            addCriterion("SALE_REMARK <=", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkLike(String value) {
            addCriterion("SALE_REMARK like", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkNotLike(String value) {
            addCriterion("SALE_REMARK not like", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkIn(List<String> values) {
            addCriterion("SALE_REMARK in", values, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkNotIn(List<String> values) {
            addCriterion("SALE_REMARK not in", values, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkBetween(String value1, String value2) {
            addCriterion("SALE_REMARK between", value1, value2, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkNotBetween(String value1, String value2) {
            addCriterion("SALE_REMARK not between", value1, value2, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleComidIsNull() {
            addCriterion("SALE_COMID is null");
            return (Criteria) this;
        }

        public Criteria andSaleComidIsNotNull() {
            addCriterion("SALE_COMID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleComidEqualTo(String value) {
            addCriterion("SALE_COMID =", value, "saleComid");
            return (Criteria) this;
        }

        public Criteria andSaleComidNotEqualTo(String value) {
            addCriterion("SALE_COMID <>", value, "saleComid");
            return (Criteria) this;
        }

        public Criteria andSaleComidGreaterThan(String value) {
            addCriterion("SALE_COMID >", value, "saleComid");
            return (Criteria) this;
        }

        public Criteria andSaleComidGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_COMID >=", value, "saleComid");
            return (Criteria) this;
        }

        public Criteria andSaleComidLessThan(String value) {
            addCriterion("SALE_COMID <", value, "saleComid");
            return (Criteria) this;
        }

        public Criteria andSaleComidLessThanOrEqualTo(String value) {
            addCriterion("SALE_COMID <=", value, "saleComid");
            return (Criteria) this;
        }

        public Criteria andSaleComidLike(String value) {
            addCriterion("SALE_COMID like", value, "saleComid");
            return (Criteria) this;
        }

        public Criteria andSaleComidNotLike(String value) {
            addCriterion("SALE_COMID not like", value, "saleComid");
            return (Criteria) this;
        }

        public Criteria andSaleComidIn(List<String> values) {
            addCriterion("SALE_COMID in", values, "saleComid");
            return (Criteria) this;
        }

        public Criteria andSaleComidNotIn(List<String> values) {
            addCriterion("SALE_COMID not in", values, "saleComid");
            return (Criteria) this;
        }

        public Criteria andSaleComidBetween(String value1, String value2) {
            addCriterion("SALE_COMID between", value1, value2, "saleComid");
            return (Criteria) this;
        }

        public Criteria andSaleComidNotBetween(String value1, String value2) {
            addCriterion("SALE_COMID not between", value1, value2, "saleComid");
            return (Criteria) this;
        }

        public Criteria andSaleLastdateIsNull() {
            addCriterion("SALE_LASTDATE is null");
            return (Criteria) this;
        }

        public Criteria andSaleLastdateIsNotNull() {
            addCriterion("SALE_LASTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleLastdateEqualTo(Date value) {
            addCriterion("SALE_LASTDATE =", value, "saleLastdate");
            return (Criteria) this;
        }

        public Criteria andSaleLastdateNotEqualTo(Date value) {
            addCriterion("SALE_LASTDATE <>", value, "saleLastdate");
            return (Criteria) this;
        }

        public Criteria andSaleLastdateGreaterThan(Date value) {
            addCriterion("SALE_LASTDATE >", value, "saleLastdate");
            return (Criteria) this;
        }

        public Criteria andSaleLastdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SALE_LASTDATE >=", value, "saleLastdate");
            return (Criteria) this;
        }

        public Criteria andSaleLastdateLessThan(Date value) {
            addCriterion("SALE_LASTDATE <", value, "saleLastdate");
            return (Criteria) this;
        }

        public Criteria andSaleLastdateLessThanOrEqualTo(Date value) {
            addCriterion("SALE_LASTDATE <=", value, "saleLastdate");
            return (Criteria) this;
        }

        public Criteria andSaleLastdateIn(List<Date> values) {
            addCriterion("SALE_LASTDATE in", values, "saleLastdate");
            return (Criteria) this;
        }

        public Criteria andSaleLastdateNotIn(List<Date> values) {
            addCriterion("SALE_LASTDATE not in", values, "saleLastdate");
            return (Criteria) this;
        }

        public Criteria andSaleLastdateBetween(Date value1, Date value2) {
            addCriterion("SALE_LASTDATE between", value1, value2, "saleLastdate");
            return (Criteria) this;
        }

        public Criteria andSaleLastdateNotBetween(Date value1, Date value2) {
            addCriterion("SALE_LASTDATE not between", value1, value2, "saleLastdate");
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