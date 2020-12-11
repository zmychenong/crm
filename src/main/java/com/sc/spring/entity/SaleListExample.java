package com.sc.spring.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleListExample() {
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

        public Criteria andSaleFirstdateIsNull() {
            addCriterion("SALE_FIRSTDATE is null");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateIsNotNull() {
            addCriterion("SALE_FIRSTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateEqualTo(String value) {
            addCriterion("SALE_FIRSTDATE =", value, "saleFirstdate");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateNotEqualTo(String value) {
            addCriterion("SALE_FIRSTDATE <>", value, "saleFirstdate");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateGreaterThan(String value) {
            addCriterion("SALE_FIRSTDATE >", value, "saleFirstdate");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_FIRSTDATE >=", value, "saleFirstdate");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateLessThan(String value) {
            addCriterion("SALE_FIRSTDATE <", value, "saleFirstdate");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateLessThanOrEqualTo(String value) {
            addCriterion("SALE_FIRSTDATE <=", value, "saleFirstdate");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateLike(String value) {
            addCriterion("SALE_FIRSTDATE like", value, "saleFirstdate");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateNotLike(String value) {
            addCriterion("SALE_FIRSTDATE not like", value, "saleFirstdate");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateIn(List<String> values) {
            addCriterion("SALE_FIRSTDATE in", values, "saleFirstdate");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateNotIn(List<String> values) {
            addCriterion("SALE_FIRSTDATE not in", values, "saleFirstdate");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateBetween(String value1, String value2) {
            addCriterion("SALE_FIRSTDATE between", value1, value2, "saleFirstdate");
            return (Criteria) this;
        }

        public Criteria andSaleFirstdateNotBetween(String value1, String value2) {
            addCriterion("SALE_FIRSTDATE not between", value1, value2, "saleFirstdate");
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

        public Criteria andSaleUseridIsNull() {
            addCriterion("SALE_USERID is null");
            return (Criteria) this;
        }

        public Criteria andSaleUseridIsNotNull() {
            addCriterion("SALE_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleUseridEqualTo(String value) {
            addCriterion("SALE_USERID =", value, "saleUserid");
            return (Criteria) this;
        }

        public Criteria andSaleUseridNotEqualTo(String value) {
            addCriterion("SALE_USERID <>", value, "saleUserid");
            return (Criteria) this;
        }

        public Criteria andSaleUseridGreaterThan(String value) {
            addCriterion("SALE_USERID >", value, "saleUserid");
            return (Criteria) this;
        }

        public Criteria andSaleUseridGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_USERID >=", value, "saleUserid");
            return (Criteria) this;
        }

        public Criteria andSaleUseridLessThan(String value) {
            addCriterion("SALE_USERID <", value, "saleUserid");
            return (Criteria) this;
        }

        public Criteria andSaleUseridLessThanOrEqualTo(String value) {
            addCriterion("SALE_USERID <=", value, "saleUserid");
            return (Criteria) this;
        }

        public Criteria andSaleUseridLike(String value) {
            addCriterion("SALE_USERID like", value, "saleUserid");
            return (Criteria) this;
        }

        public Criteria andSaleUseridNotLike(String value) {
            addCriterion("SALE_USERID not like", value, "saleUserid");
            return (Criteria) this;
        }

        public Criteria andSaleUseridIn(List<String> values) {
            addCriterion("SALE_USERID in", values, "saleUserid");
            return (Criteria) this;
        }

        public Criteria andSaleUseridNotIn(List<String> values) {
            addCriterion("SALE_USERID not in", values, "saleUserid");
            return (Criteria) this;
        }

        public Criteria andSaleUseridBetween(String value1, String value2) {
            addCriterion("SALE_USERID between", value1, value2, "saleUserid");
            return (Criteria) this;
        }

        public Criteria andSaleUseridNotBetween(String value1, String value2) {
            addCriterion("SALE_USERID not between", value1, value2, "saleUserid");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyIsNull() {
            addCriterion("SALE_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyIsNotNull() {
            addCriterion("SALE_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyEqualTo(String value) {
            addCriterion("SALE_MONEY =", value, "saleMoney");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyNotEqualTo(String value) {
            addCriterion("SALE_MONEY <>", value, "saleMoney");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyGreaterThan(String value) {
            addCriterion("SALE_MONEY >", value, "saleMoney");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_MONEY >=", value, "saleMoney");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyLessThan(String value) {
            addCriterion("SALE_MONEY <", value, "saleMoney");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyLessThanOrEqualTo(String value) {
            addCriterion("SALE_MONEY <=", value, "saleMoney");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyLike(String value) {
            addCriterion("SALE_MONEY like", value, "saleMoney");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyNotLike(String value) {
            addCriterion("SALE_MONEY not like", value, "saleMoney");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyIn(List<String> values) {
            addCriterion("SALE_MONEY in", values, "saleMoney");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyNotIn(List<String> values) {
            addCriterion("SALE_MONEY not in", values, "saleMoney");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyBetween(String value1, String value2) {
            addCriterion("SALE_MONEY between", value1, value2, "saleMoney");
            return (Criteria) this;
        }

        public Criteria andSaleMoneyNotBetween(String value1, String value2) {
            addCriterion("SALE_MONEY not between", value1, value2, "saleMoney");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateIsNull() {
            addCriterion("SALE_OUTSTATE is null");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateIsNotNull() {
            addCriterion("SALE_OUTSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateEqualTo(String value) {
            addCriterion("SALE_OUTSTATE =", value, "saleOutstate");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateNotEqualTo(String value) {
            addCriterion("SALE_OUTSTATE <>", value, "saleOutstate");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateGreaterThan(String value) {
            addCriterion("SALE_OUTSTATE >", value, "saleOutstate");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_OUTSTATE >=", value, "saleOutstate");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateLessThan(String value) {
            addCriterion("SALE_OUTSTATE <", value, "saleOutstate");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateLessThanOrEqualTo(String value) {
            addCriterion("SALE_OUTSTATE <=", value, "saleOutstate");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateLike(String value) {
            addCriterion("SALE_OUTSTATE like", value, "saleOutstate");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateNotLike(String value) {
            addCriterion("SALE_OUTSTATE not like", value, "saleOutstate");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateIn(List<String> values) {
            addCriterion("SALE_OUTSTATE in", values, "saleOutstate");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateNotIn(List<String> values) {
            addCriterion("SALE_OUTSTATE not in", values, "saleOutstate");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateBetween(String value1, String value2) {
            addCriterion("SALE_OUTSTATE between", value1, value2, "saleOutstate");
            return (Criteria) this;
        }

        public Criteria andSaleOutstateNotBetween(String value1, String value2) {
            addCriterion("SALE_OUTSTATE not between", value1, value2, "saleOutstate");
            return (Criteria) this;
        }

        public Criteria andSaleRebateIsNull() {
            addCriterion("SALE_REBATE is null");
            return (Criteria) this;
        }

        public Criteria andSaleRebateIsNotNull() {
            addCriterion("SALE_REBATE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleRebateEqualTo(String value) {
            addCriterion("SALE_REBATE =", value, "saleRebate");
            return (Criteria) this;
        }

        public Criteria andSaleRebateNotEqualTo(String value) {
            addCriterion("SALE_REBATE <>", value, "saleRebate");
            return (Criteria) this;
        }

        public Criteria andSaleRebateGreaterThan(String value) {
            addCriterion("SALE_REBATE >", value, "saleRebate");
            return (Criteria) this;
        }

        public Criteria andSaleRebateGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_REBATE >=", value, "saleRebate");
            return (Criteria) this;
        }

        public Criteria andSaleRebateLessThan(String value) {
            addCriterion("SALE_REBATE <", value, "saleRebate");
            return (Criteria) this;
        }

        public Criteria andSaleRebateLessThanOrEqualTo(String value) {
            addCriterion("SALE_REBATE <=", value, "saleRebate");
            return (Criteria) this;
        }

        public Criteria andSaleRebateLike(String value) {
            addCriterion("SALE_REBATE like", value, "saleRebate");
            return (Criteria) this;
        }

        public Criteria andSaleRebateNotLike(String value) {
            addCriterion("SALE_REBATE not like", value, "saleRebate");
            return (Criteria) this;
        }

        public Criteria andSaleRebateIn(List<String> values) {
            addCriterion("SALE_REBATE in", values, "saleRebate");
            return (Criteria) this;
        }

        public Criteria andSaleRebateNotIn(List<String> values) {
            addCriterion("SALE_REBATE not in", values, "saleRebate");
            return (Criteria) this;
        }

        public Criteria andSaleRebateBetween(String value1, String value2) {
            addCriterion("SALE_REBATE between", value1, value2, "saleRebate");
            return (Criteria) this;
        }

        public Criteria andSaleRebateNotBetween(String value1, String value2) {
            addCriterion("SALE_REBATE not between", value1, value2, "saleRebate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateIsNull() {
            addCriterion("SALE_ORDERSTATE is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateIsNotNull() {
            addCriterion("SALE_ORDERSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateEqualTo(String value) {
            addCriterion("SALE_ORDERSTATE =", value, "saleOrderstate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateNotEqualTo(String value) {
            addCriterion("SALE_ORDERSTATE <>", value, "saleOrderstate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateGreaterThan(String value) {
            addCriterion("SALE_ORDERSTATE >", value, "saleOrderstate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_ORDERSTATE >=", value, "saleOrderstate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateLessThan(String value) {
            addCriterion("SALE_ORDERSTATE <", value, "saleOrderstate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateLessThanOrEqualTo(String value) {
            addCriterion("SALE_ORDERSTATE <=", value, "saleOrderstate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateLike(String value) {
            addCriterion("SALE_ORDERSTATE like", value, "saleOrderstate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateNotLike(String value) {
            addCriterion("SALE_ORDERSTATE not like", value, "saleOrderstate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateIn(List<String> values) {
            addCriterion("SALE_ORDERSTATE in", values, "saleOrderstate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateNotIn(List<String> values) {
            addCriterion("SALE_ORDERSTATE not in", values, "saleOrderstate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateBetween(String value1, String value2) {
            addCriterion("SALE_ORDERSTATE between", value1, value2, "saleOrderstate");
            return (Criteria) this;
        }

        public Criteria andSaleOrderstateNotBetween(String value1, String value2) {
            addCriterion("SALE_ORDERSTATE not between", value1, value2, "saleOrderstate");
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