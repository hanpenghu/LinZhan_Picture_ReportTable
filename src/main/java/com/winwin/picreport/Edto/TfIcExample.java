package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfIcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfIcExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIcIdIsNull() {
            addCriterion("IC_ID is null");
            return (Criteria) this;
        }

        public Criteria andIcIdIsNotNull() {
            addCriterion("IC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIcIdEqualTo(String value) {
            addCriterion("IC_ID =", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdNotEqualTo(String value) {
            addCriterion("IC_ID <>", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdGreaterThan(String value) {
            addCriterion("IC_ID >", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdGreaterThanOrEqualTo(String value) {
            addCriterion("IC_ID >=", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdLessThan(String value) {
            addCriterion("IC_ID <", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdLessThanOrEqualTo(String value) {
            addCriterion("IC_ID <=", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdLike(String value) {
            addCriterion("IC_ID like", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdNotLike(String value) {
            addCriterion("IC_ID not like", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdIn(List<String> values) {
            addCriterion("IC_ID in", values, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdNotIn(List<String> values) {
            addCriterion("IC_ID not in", values, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdBetween(String value1, String value2) {
            addCriterion("IC_ID between", value1, value2, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdNotBetween(String value1, String value2) {
            addCriterion("IC_ID not between", value1, value2, "icId");
            return (Criteria) this;
        }

        public Criteria andIcNoIsNull() {
            addCriterion("IC_NO is null");
            return (Criteria) this;
        }

        public Criteria andIcNoIsNotNull() {
            addCriterion("IC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIcNoEqualTo(String value) {
            addCriterion("IC_NO =", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoNotEqualTo(String value) {
            addCriterion("IC_NO <>", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoGreaterThan(String value) {
            addCriterion("IC_NO >", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoGreaterThanOrEqualTo(String value) {
            addCriterion("IC_NO >=", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoLessThan(String value) {
            addCriterion("IC_NO <", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoLessThanOrEqualTo(String value) {
            addCriterion("IC_NO <=", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoLike(String value) {
            addCriterion("IC_NO like", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoNotLike(String value) {
            addCriterion("IC_NO not like", value, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoIn(List<String> values) {
            addCriterion("IC_NO in", values, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoNotIn(List<String> values) {
            addCriterion("IC_NO not in", values, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoBetween(String value1, String value2) {
            addCriterion("IC_NO between", value1, value2, "icNo");
            return (Criteria) this;
        }

        public Criteria andIcNoNotBetween(String value1, String value2) {
            addCriterion("IC_NO not between", value1, value2, "icNo");
            return (Criteria) this;
        }

        public Criteria andItmIsNull() {
            addCriterion("ITM is null");
            return (Criteria) this;
        }

        public Criteria andItmIsNotNull() {
            addCriterion("ITM is not null");
            return (Criteria) this;
        }

        public Criteria andItmEqualTo(Integer value) {
            addCriterion("ITM =", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmNotEqualTo(Integer value) {
            addCriterion("ITM <>", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmGreaterThan(Integer value) {
            addCriterion("ITM >", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITM >=", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmLessThan(Integer value) {
            addCriterion("ITM <", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmLessThanOrEqualTo(Integer value) {
            addCriterion("ITM <=", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmIn(List<Integer> values) {
            addCriterion("ITM in", values, "itm");
            return (Criteria) this;
        }

        public Criteria andItmNotIn(List<Integer> values) {
            addCriterion("ITM not in", values, "itm");
            return (Criteria) this;
        }

        public Criteria andItmBetween(Integer value1, Integer value2) {
            addCriterion("ITM between", value1, value2, "itm");
            return (Criteria) this;
        }

        public Criteria andItmNotBetween(Integer value1, Integer value2) {
            addCriterion("ITM not between", value1, value2, "itm");
            return (Criteria) this;
        }

        public Criteria andIcDdIsNull() {
            addCriterion("IC_DD is null");
            return (Criteria) this;
        }

        public Criteria andIcDdIsNotNull() {
            addCriterion("IC_DD is not null");
            return (Criteria) this;
        }

        public Criteria andIcDdEqualTo(Date value) {
            addCriterion("IC_DD =", value, "icDd");
            return (Criteria) this;
        }

        public Criteria andIcDdNotEqualTo(Date value) {
            addCriterion("IC_DD <>", value, "icDd");
            return (Criteria) this;
        }

        public Criteria andIcDdGreaterThan(Date value) {
            addCriterion("IC_DD >", value, "icDd");
            return (Criteria) this;
        }

        public Criteria andIcDdGreaterThanOrEqualTo(Date value) {
            addCriterion("IC_DD >=", value, "icDd");
            return (Criteria) this;
        }

        public Criteria andIcDdLessThan(Date value) {
            addCriterion("IC_DD <", value, "icDd");
            return (Criteria) this;
        }

        public Criteria andIcDdLessThanOrEqualTo(Date value) {
            addCriterion("IC_DD <=", value, "icDd");
            return (Criteria) this;
        }

        public Criteria andIcDdIn(List<Date> values) {
            addCriterion("IC_DD in", values, "icDd");
            return (Criteria) this;
        }

        public Criteria andIcDdNotIn(List<Date> values) {
            addCriterion("IC_DD not in", values, "icDd");
            return (Criteria) this;
        }

        public Criteria andIcDdBetween(Date value1, Date value2) {
            addCriterion("IC_DD between", value1, value2, "icDd");
            return (Criteria) this;
        }

        public Criteria andIcDdNotBetween(Date value1, Date value2) {
            addCriterion("IC_DD not between", value1, value2, "icDd");
            return (Criteria) this;
        }

        public Criteria andPrdNoIsNull() {
            addCriterion("PRD_NO is null");
            return (Criteria) this;
        }

        public Criteria andPrdNoIsNotNull() {
            addCriterion("PRD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNoEqualTo(String value) {
            addCriterion("PRD_NO =", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotEqualTo(String value) {
            addCriterion("PRD_NO <>", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoGreaterThan(String value) {
            addCriterion("PRD_NO >", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_NO >=", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLessThan(String value) {
            addCriterion("PRD_NO <", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLessThanOrEqualTo(String value) {
            addCriterion("PRD_NO <=", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLike(String value) {
            addCriterion("PRD_NO like", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotLike(String value) {
            addCriterion("PRD_NO not like", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoIn(List<String> values) {
            addCriterion("PRD_NO in", values, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotIn(List<String> values) {
            addCriterion("PRD_NO not in", values, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoBetween(String value1, String value2) {
            addCriterion("PRD_NO between", value1, value2, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotBetween(String value1, String value2) {
            addCriterion("PRD_NO not between", value1, value2, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNameIsNull() {
            addCriterion("PRD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrdNameIsNotNull() {
            addCriterion("PRD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNameEqualTo(String value) {
            addCriterion("PRD_NAME =", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotEqualTo(String value) {
            addCriterion("PRD_NAME <>", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameGreaterThan(String value) {
            addCriterion("PRD_NAME >", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_NAME >=", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameLessThan(String value) {
            addCriterion("PRD_NAME <", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameLessThanOrEqualTo(String value) {
            addCriterion("PRD_NAME <=", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameLike(String value) {
            addCriterion("PRD_NAME like", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotLike(String value) {
            addCriterion("PRD_NAME not like", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameIn(List<String> values) {
            addCriterion("PRD_NAME in", values, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotIn(List<String> values) {
            addCriterion("PRD_NAME not in", values, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameBetween(String value1, String value2) {
            addCriterion("PRD_NAME between", value1, value2, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotBetween(String value1, String value2) {
            addCriterion("PRD_NAME not between", value1, value2, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdMarkIsNull() {
            addCriterion("PRD_MARK is null");
            return (Criteria) this;
        }

        public Criteria andPrdMarkIsNotNull() {
            addCriterion("PRD_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andPrdMarkEqualTo(String value) {
            addCriterion("PRD_MARK =", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkNotEqualTo(String value) {
            addCriterion("PRD_MARK <>", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkGreaterThan(String value) {
            addCriterion("PRD_MARK >", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_MARK >=", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkLessThan(String value) {
            addCriterion("PRD_MARK <", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkLessThanOrEqualTo(String value) {
            addCriterion("PRD_MARK <=", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkLike(String value) {
            addCriterion("PRD_MARK like", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkNotLike(String value) {
            addCriterion("PRD_MARK not like", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkIn(List<String> values) {
            addCriterion("PRD_MARK in", values, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkNotIn(List<String> values) {
            addCriterion("PRD_MARK not in", values, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkBetween(String value1, String value2) {
            addCriterion("PRD_MARK between", value1, value2, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkNotBetween(String value1, String value2) {
            addCriterion("PRD_MARK not between", value1, value2, "prdMark");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("QTY is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("QTY is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(BigDecimal value) {
            addCriterion("QTY =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(BigDecimal value) {
            addCriterion("QTY <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(BigDecimal value) {
            addCriterion("QTY >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(BigDecimal value) {
            addCriterion("QTY <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<BigDecimal> values) {
            addCriterion("QTY in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<BigDecimal> values) {
            addCriterion("QTY not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQty1IsNull() {
            addCriterion("QTY1 is null");
            return (Criteria) this;
        }

        public Criteria andQty1IsNotNull() {
            addCriterion("QTY1 is not null");
            return (Criteria) this;
        }

        public Criteria andQty1EqualTo(BigDecimal value) {
            addCriterion("QTY1 =", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1NotEqualTo(BigDecimal value) {
            addCriterion("QTY1 <>", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1GreaterThan(BigDecimal value) {
            addCriterion("QTY1 >", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1 >=", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1LessThan(BigDecimal value) {
            addCriterion("QTY1 <", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1 <=", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1In(List<BigDecimal> values) {
            addCriterion("QTY1 in", values, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1NotIn(List<BigDecimal> values) {
            addCriterion("QTY1 not in", values, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1 between", value1, value2, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1 not between", value1, value2, "qty1");
            return (Criteria) this;
        }

        public Criteria andWh1IsNull() {
            addCriterion("WH1 is null");
            return (Criteria) this;
        }

        public Criteria andWh1IsNotNull() {
            addCriterion("WH1 is not null");
            return (Criteria) this;
        }

        public Criteria andWh1EqualTo(String value) {
            addCriterion("WH1 =", value, "wh1");
            return (Criteria) this;
        }

        public Criteria andWh1NotEqualTo(String value) {
            addCriterion("WH1 <>", value, "wh1");
            return (Criteria) this;
        }

        public Criteria andWh1GreaterThan(String value) {
            addCriterion("WH1 >", value, "wh1");
            return (Criteria) this;
        }

        public Criteria andWh1GreaterThanOrEqualTo(String value) {
            addCriterion("WH1 >=", value, "wh1");
            return (Criteria) this;
        }

        public Criteria andWh1LessThan(String value) {
            addCriterion("WH1 <", value, "wh1");
            return (Criteria) this;
        }

        public Criteria andWh1LessThanOrEqualTo(String value) {
            addCriterion("WH1 <=", value, "wh1");
            return (Criteria) this;
        }

        public Criteria andWh1Like(String value) {
            addCriterion("WH1 like", value, "wh1");
            return (Criteria) this;
        }

        public Criteria andWh1NotLike(String value) {
            addCriterion("WH1 not like", value, "wh1");
            return (Criteria) this;
        }

        public Criteria andWh1In(List<String> values) {
            addCriterion("WH1 in", values, "wh1");
            return (Criteria) this;
        }

        public Criteria andWh1NotIn(List<String> values) {
            addCriterion("WH1 not in", values, "wh1");
            return (Criteria) this;
        }

        public Criteria andWh1Between(String value1, String value2) {
            addCriterion("WH1 between", value1, value2, "wh1");
            return (Criteria) this;
        }

        public Criteria andWh1NotBetween(String value1, String value2) {
            addCriterion("WH1 not between", value1, value2, "wh1");
            return (Criteria) this;
        }

        public Criteria andWh2IsNull() {
            addCriterion("WH2 is null");
            return (Criteria) this;
        }

        public Criteria andWh2IsNotNull() {
            addCriterion("WH2 is not null");
            return (Criteria) this;
        }

        public Criteria andWh2EqualTo(String value) {
            addCriterion("WH2 =", value, "wh2");
            return (Criteria) this;
        }

        public Criteria andWh2NotEqualTo(String value) {
            addCriterion("WH2 <>", value, "wh2");
            return (Criteria) this;
        }

        public Criteria andWh2GreaterThan(String value) {
            addCriterion("WH2 >", value, "wh2");
            return (Criteria) this;
        }

        public Criteria andWh2GreaterThanOrEqualTo(String value) {
            addCriterion("WH2 >=", value, "wh2");
            return (Criteria) this;
        }

        public Criteria andWh2LessThan(String value) {
            addCriterion("WH2 <", value, "wh2");
            return (Criteria) this;
        }

        public Criteria andWh2LessThanOrEqualTo(String value) {
            addCriterion("WH2 <=", value, "wh2");
            return (Criteria) this;
        }

        public Criteria andWh2Like(String value) {
            addCriterion("WH2 like", value, "wh2");
            return (Criteria) this;
        }

        public Criteria andWh2NotLike(String value) {
            addCriterion("WH2 not like", value, "wh2");
            return (Criteria) this;
        }

        public Criteria andWh2In(List<String> values) {
            addCriterion("WH2 in", values, "wh2");
            return (Criteria) this;
        }

        public Criteria andWh2NotIn(List<String> values) {
            addCriterion("WH2 not in", values, "wh2");
            return (Criteria) this;
        }

        public Criteria andWh2Between(String value1, String value2) {
            addCriterion("WH2 between", value1, value2, "wh2");
            return (Criteria) this;
        }

        public Criteria andWh2NotBetween(String value1, String value2) {
            addCriterion("WH2 not between", value1, value2, "wh2");
            return (Criteria) this;
        }

        public Criteria andCstIsNull() {
            addCriterion("CST is null");
            return (Criteria) this;
        }

        public Criteria andCstIsNotNull() {
            addCriterion("CST is not null");
            return (Criteria) this;
        }

        public Criteria andCstEqualTo(BigDecimal value) {
            addCriterion("CST =", value, "cst");
            return (Criteria) this;
        }

        public Criteria andCstNotEqualTo(BigDecimal value) {
            addCriterion("CST <>", value, "cst");
            return (Criteria) this;
        }

        public Criteria andCstGreaterThan(BigDecimal value) {
            addCriterion("CST >", value, "cst");
            return (Criteria) this;
        }

        public Criteria andCstGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST >=", value, "cst");
            return (Criteria) this;
        }

        public Criteria andCstLessThan(BigDecimal value) {
            addCriterion("CST <", value, "cst");
            return (Criteria) this;
        }

        public Criteria andCstLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST <=", value, "cst");
            return (Criteria) this;
        }

        public Criteria andCstIn(List<BigDecimal> values) {
            addCriterion("CST in", values, "cst");
            return (Criteria) this;
        }

        public Criteria andCstNotIn(List<BigDecimal> values) {
            addCriterion("CST not in", values, "cst");
            return (Criteria) this;
        }

        public Criteria andCstBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST between", value1, value2, "cst");
            return (Criteria) this;
        }

        public Criteria andCstNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST not between", value1, value2, "cst");
            return (Criteria) this;
        }

        public Criteria andFixCstIsNull() {
            addCriterion("FIX_CST is null");
            return (Criteria) this;
        }

        public Criteria andFixCstIsNotNull() {
            addCriterion("FIX_CST is not null");
            return (Criteria) this;
        }

        public Criteria andFixCstEqualTo(String value) {
            addCriterion("FIX_CST =", value, "fixCst");
            return (Criteria) this;
        }

        public Criteria andFixCstNotEqualTo(String value) {
            addCriterion("FIX_CST <>", value, "fixCst");
            return (Criteria) this;
        }

        public Criteria andFixCstGreaterThan(String value) {
            addCriterion("FIX_CST >", value, "fixCst");
            return (Criteria) this;
        }

        public Criteria andFixCstGreaterThanOrEqualTo(String value) {
            addCriterion("FIX_CST >=", value, "fixCst");
            return (Criteria) this;
        }

        public Criteria andFixCstLessThan(String value) {
            addCriterion("FIX_CST <", value, "fixCst");
            return (Criteria) this;
        }

        public Criteria andFixCstLessThanOrEqualTo(String value) {
            addCriterion("FIX_CST <=", value, "fixCst");
            return (Criteria) this;
        }

        public Criteria andFixCstLike(String value) {
            addCriterion("FIX_CST like", value, "fixCst");
            return (Criteria) this;
        }

        public Criteria andFixCstNotLike(String value) {
            addCriterion("FIX_CST not like", value, "fixCst");
            return (Criteria) this;
        }

        public Criteria andFixCstIn(List<String> values) {
            addCriterion("FIX_CST in", values, "fixCst");
            return (Criteria) this;
        }

        public Criteria andFixCstNotIn(List<String> values) {
            addCriterion("FIX_CST not in", values, "fixCst");
            return (Criteria) this;
        }

        public Criteria andFixCstBetween(String value1, String value2) {
            addCriterion("FIX_CST between", value1, value2, "fixCst");
            return (Criteria) this;
        }

        public Criteria andFixCstNotBetween(String value1, String value2) {
            addCriterion("FIX_CST not between", value1, value2, "fixCst");
            return (Criteria) this;
        }

        public Criteria andBatNoIsNull() {
            addCriterion("BAT_NO is null");
            return (Criteria) this;
        }

        public Criteria andBatNoIsNotNull() {
            addCriterion("BAT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBatNoEqualTo(String value) {
            addCriterion("BAT_NO =", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoNotEqualTo(String value) {
            addCriterion("BAT_NO <>", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoGreaterThan(String value) {
            addCriterion("BAT_NO >", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoGreaterThanOrEqualTo(String value) {
            addCriterion("BAT_NO >=", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoLessThan(String value) {
            addCriterion("BAT_NO <", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoLessThanOrEqualTo(String value) {
            addCriterion("BAT_NO <=", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoLike(String value) {
            addCriterion("BAT_NO like", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoNotLike(String value) {
            addCriterion("BAT_NO not like", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoIn(List<String> values) {
            addCriterion("BAT_NO in", values, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoNotIn(List<String> values) {
            addCriterion("BAT_NO not in", values, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoBetween(String value1, String value2) {
            addCriterion("BAT_NO between", value1, value2, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoNotBetween(String value1, String value2) {
            addCriterion("BAT_NO not between", value1, value2, "batNo");
            return (Criteria) this;
        }

        public Criteria andRemIsNull() {
            addCriterion("REM is null");
            return (Criteria) this;
        }

        public Criteria andRemIsNotNull() {
            addCriterion("REM is not null");
            return (Criteria) this;
        }

        public Criteria andRemEqualTo(String value) {
            addCriterion("REM =", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotEqualTo(String value) {
            addCriterion("REM <>", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemGreaterThan(String value) {
            addCriterion("REM >", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemGreaterThanOrEqualTo(String value) {
            addCriterion("REM >=", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemLessThan(String value) {
            addCriterion("REM <", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemLessThanOrEqualTo(String value) {
            addCriterion("REM <=", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemLike(String value) {
            addCriterion("REM like", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotLike(String value) {
            addCriterion("REM not like", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemIn(List<String> values) {
            addCriterion("REM in", values, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotIn(List<String> values) {
            addCriterion("REM not in", values, "rem");
            return (Criteria) this;
        }

        public Criteria andRemBetween(String value1, String value2) {
            addCriterion("REM between", value1, value2, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotBetween(String value1, String value2) {
            addCriterion("REM not between", value1, value2, "rem");
            return (Criteria) this;
        }

        public Criteria andCstStdIsNull() {
            addCriterion("CST_STD is null");
            return (Criteria) this;
        }

        public Criteria andCstStdIsNotNull() {
            addCriterion("CST_STD is not null");
            return (Criteria) this;
        }

        public Criteria andCstStdEqualTo(BigDecimal value) {
            addCriterion("CST_STD =", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdNotEqualTo(BigDecimal value) {
            addCriterion("CST_STD <>", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdGreaterThan(BigDecimal value) {
            addCriterion("CST_STD >", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD >=", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdLessThan(BigDecimal value) {
            addCriterion("CST_STD <", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD <=", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdIn(List<BigDecimal> values) {
            addCriterion("CST_STD in", values, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdNotIn(List<BigDecimal> values) {
            addCriterion("CST_STD not in", values, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD between", value1, value2, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD not between", value1, value2, "cstStd");
            return (Criteria) this;
        }

        public Criteria andBatNo2IsNull() {
            addCriterion("BAT_NO2 is null");
            return (Criteria) this;
        }

        public Criteria andBatNo2IsNotNull() {
            addCriterion("BAT_NO2 is not null");
            return (Criteria) this;
        }

        public Criteria andBatNo2EqualTo(String value) {
            addCriterion("BAT_NO2 =", value, "batNo2");
            return (Criteria) this;
        }

        public Criteria andBatNo2NotEqualTo(String value) {
            addCriterion("BAT_NO2 <>", value, "batNo2");
            return (Criteria) this;
        }

        public Criteria andBatNo2GreaterThan(String value) {
            addCriterion("BAT_NO2 >", value, "batNo2");
            return (Criteria) this;
        }

        public Criteria andBatNo2GreaterThanOrEqualTo(String value) {
            addCriterion("BAT_NO2 >=", value, "batNo2");
            return (Criteria) this;
        }

        public Criteria andBatNo2LessThan(String value) {
            addCriterion("BAT_NO2 <", value, "batNo2");
            return (Criteria) this;
        }

        public Criteria andBatNo2LessThanOrEqualTo(String value) {
            addCriterion("BAT_NO2 <=", value, "batNo2");
            return (Criteria) this;
        }

        public Criteria andBatNo2Like(String value) {
            addCriterion("BAT_NO2 like", value, "batNo2");
            return (Criteria) this;
        }

        public Criteria andBatNo2NotLike(String value) {
            addCriterion("BAT_NO2 not like", value, "batNo2");
            return (Criteria) this;
        }

        public Criteria andBatNo2In(List<String> values) {
            addCriterion("BAT_NO2 in", values, "batNo2");
            return (Criteria) this;
        }

        public Criteria andBatNo2NotIn(List<String> values) {
            addCriterion("BAT_NO2 not in", values, "batNo2");
            return (Criteria) this;
        }

        public Criteria andBatNo2Between(String value1, String value2) {
            addCriterion("BAT_NO2 between", value1, value2, "batNo2");
            return (Criteria) this;
        }

        public Criteria andBatNo2NotBetween(String value1, String value2) {
            addCriterion("BAT_NO2 not between", value1, value2, "batNo2");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUtnameIsNull() {
            addCriterion("UTNAME is null");
            return (Criteria) this;
        }

        public Criteria andUtnameIsNotNull() {
            addCriterion("UTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUtnameEqualTo(String value) {
            addCriterion("UTNAME =", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameNotEqualTo(String value) {
            addCriterion("UTNAME <>", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameGreaterThan(String value) {
            addCriterion("UTNAME >", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameGreaterThanOrEqualTo(String value) {
            addCriterion("UTNAME >=", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameLessThan(String value) {
            addCriterion("UTNAME <", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameLessThanOrEqualTo(String value) {
            addCriterion("UTNAME <=", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameLike(String value) {
            addCriterion("UTNAME like", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameNotLike(String value) {
            addCriterion("UTNAME not like", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameIn(List<String> values) {
            addCriterion("UTNAME in", values, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameNotIn(List<String> values) {
            addCriterion("UTNAME not in", values, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameBetween(String value1, String value2) {
            addCriterion("UTNAME between", value1, value2, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameNotBetween(String value1, String value2) {
            addCriterion("UTNAME not between", value1, value2, "utname");
            return (Criteria) this;
        }

        public Criteria andUprIsNull() {
            addCriterion("UPR is null");
            return (Criteria) this;
        }

        public Criteria andUprIsNotNull() {
            addCriterion("UPR is not null");
            return (Criteria) this;
        }

        public Criteria andUprEqualTo(BigDecimal value) {
            addCriterion("UPR =", value, "upr");
            return (Criteria) this;
        }

        public Criteria andUprNotEqualTo(BigDecimal value) {
            addCriterion("UPR <>", value, "upr");
            return (Criteria) this;
        }

        public Criteria andUprGreaterThan(BigDecimal value) {
            addCriterion("UPR >", value, "upr");
            return (Criteria) this;
        }

        public Criteria andUprGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR >=", value, "upr");
            return (Criteria) this;
        }

        public Criteria andUprLessThan(BigDecimal value) {
            addCriterion("UPR <", value, "upr");
            return (Criteria) this;
        }

        public Criteria andUprLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR <=", value, "upr");
            return (Criteria) this;
        }

        public Criteria andUprIn(List<BigDecimal> values) {
            addCriterion("UPR in", values, "upr");
            return (Criteria) this;
        }

        public Criteria andUprNotIn(List<BigDecimal> values) {
            addCriterion("UPR not in", values, "upr");
            return (Criteria) this;
        }

        public Criteria andUprBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR between", value1, value2, "upr");
            return (Criteria) this;
        }

        public Criteria andUprNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR not between", value1, value2, "upr");
            return (Criteria) this;
        }

        public Criteria andRlRecevIsNull() {
            addCriterion("RL_RECEV is null");
            return (Criteria) this;
        }

        public Criteria andRlRecevIsNotNull() {
            addCriterion("RL_RECEV is not null");
            return (Criteria) this;
        }

        public Criteria andRlRecevEqualTo(BigDecimal value) {
            addCriterion("RL_RECEV =", value, "rlRecev");
            return (Criteria) this;
        }

        public Criteria andRlRecevNotEqualTo(BigDecimal value) {
            addCriterion("RL_RECEV <>", value, "rlRecev");
            return (Criteria) this;
        }

        public Criteria andRlRecevGreaterThan(BigDecimal value) {
            addCriterion("RL_RECEV >", value, "rlRecev");
            return (Criteria) this;
        }

        public Criteria andRlRecevGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RL_RECEV >=", value, "rlRecev");
            return (Criteria) this;
        }

        public Criteria andRlRecevLessThan(BigDecimal value) {
            addCriterion("RL_RECEV <", value, "rlRecev");
            return (Criteria) this;
        }

        public Criteria andRlRecevLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RL_RECEV <=", value, "rlRecev");
            return (Criteria) this;
        }

        public Criteria andRlRecevIn(List<BigDecimal> values) {
            addCriterion("RL_RECEV in", values, "rlRecev");
            return (Criteria) this;
        }

        public Criteria andRlRecevNotIn(List<BigDecimal> values) {
            addCriterion("RL_RECEV not in", values, "rlRecev");
            return (Criteria) this;
        }

        public Criteria andRlRecevBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RL_RECEV between", value1, value2, "rlRecev");
            return (Criteria) this;
        }

        public Criteria andRlRecevNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RL_RECEV not between", value1, value2, "rlRecev");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoIsNull() {
            addCriterion("COMPOSE_IDNO is null");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoIsNotNull() {
            addCriterion("COMPOSE_IDNO is not null");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoEqualTo(String value) {
            addCriterion("COMPOSE_IDNO =", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoNotEqualTo(String value) {
            addCriterion("COMPOSE_IDNO <>", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoGreaterThan(String value) {
            addCriterion("COMPOSE_IDNO >", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("COMPOSE_IDNO >=", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoLessThan(String value) {
            addCriterion("COMPOSE_IDNO <", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoLessThanOrEqualTo(String value) {
            addCriterion("COMPOSE_IDNO <=", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoLike(String value) {
            addCriterion("COMPOSE_IDNO like", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoNotLike(String value) {
            addCriterion("COMPOSE_IDNO not like", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoIn(List<String> values) {
            addCriterion("COMPOSE_IDNO in", values, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoNotIn(List<String> values) {
            addCriterion("COMPOSE_IDNO not in", values, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoBetween(String value1, String value2) {
            addCriterion("COMPOSE_IDNO between", value1, value2, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoNotBetween(String value1, String value2) {
            addCriterion("COMPOSE_IDNO not between", value1, value2, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andPreItmIsNull() {
            addCriterion("PRE_ITM is null");
            return (Criteria) this;
        }

        public Criteria andPreItmIsNotNull() {
            addCriterion("PRE_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andPreItmEqualTo(Integer value) {
            addCriterion("PRE_ITM =", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmNotEqualTo(Integer value) {
            addCriterion("PRE_ITM <>", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmGreaterThan(Integer value) {
            addCriterion("PRE_ITM >", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRE_ITM >=", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmLessThan(Integer value) {
            addCriterion("PRE_ITM <", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmLessThanOrEqualTo(Integer value) {
            addCriterion("PRE_ITM <=", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmIn(List<Integer> values) {
            addCriterion("PRE_ITM in", values, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmNotIn(List<Integer> values) {
            addCriterion("PRE_ITM not in", values, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmBetween(Integer value1, Integer value2) {
            addCriterion("PRE_ITM between", value1, value2, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmNotBetween(Integer value1, Integer value2) {
            addCriterion("PRE_ITM not between", value1, value2, "preItm");
            return (Criteria) this;
        }

        public Criteria andQtyFaIsNull() {
            addCriterion("QTY_FA is null");
            return (Criteria) this;
        }

        public Criteria andQtyFaIsNotNull() {
            addCriterion("QTY_FA is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFaEqualTo(BigDecimal value) {
            addCriterion("QTY_FA =", value, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaNotEqualTo(BigDecimal value) {
            addCriterion("QTY_FA <>", value, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaGreaterThan(BigDecimal value) {
            addCriterion("QTY_FA >", value, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FA >=", value, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaLessThan(BigDecimal value) {
            addCriterion("QTY_FA <", value, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FA <=", value, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaIn(List<BigDecimal> values) {
            addCriterion("QTY_FA in", values, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaNotIn(List<BigDecimal> values) {
            addCriterion("QTY_FA not in", values, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FA between", value1, value2, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FA not between", value1, value2, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andRtnIdIsNull() {
            addCriterion("RTN_ID is null");
            return (Criteria) this;
        }

        public Criteria andRtnIdIsNotNull() {
            addCriterion("RTN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRtnIdEqualTo(String value) {
            addCriterion("RTN_ID =", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdNotEqualTo(String value) {
            addCriterion("RTN_ID <>", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdGreaterThan(String value) {
            addCriterion("RTN_ID >", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdGreaterThanOrEqualTo(String value) {
            addCriterion("RTN_ID >=", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdLessThan(String value) {
            addCriterion("RTN_ID <", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdLessThanOrEqualTo(String value) {
            addCriterion("RTN_ID <=", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdLike(String value) {
            addCriterion("RTN_ID like", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdNotLike(String value) {
            addCriterion("RTN_ID not like", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdIn(List<String> values) {
            addCriterion("RTN_ID in", values, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdNotIn(List<String> values) {
            addCriterion("RTN_ID not in", values, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdBetween(String value1, String value2) {
            addCriterion("RTN_ID between", value1, value2, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdNotBetween(String value1, String value2) {
            addCriterion("RTN_ID not between", value1, value2, "rtnId");
            return (Criteria) this;
        }

        public Criteria andKeyItmIsNull() {
            addCriterion("KEY_ITM is null");
            return (Criteria) this;
        }

        public Criteria andKeyItmIsNotNull() {
            addCriterion("KEY_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andKeyItmEqualTo(Integer value) {
            addCriterion("KEY_ITM =", value, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmNotEqualTo(Integer value) {
            addCriterion("KEY_ITM <>", value, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmGreaterThan(Integer value) {
            addCriterion("KEY_ITM >", value, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("KEY_ITM >=", value, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmLessThan(Integer value) {
            addCriterion("KEY_ITM <", value, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmLessThanOrEqualTo(Integer value) {
            addCriterion("KEY_ITM <=", value, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmIn(List<Integer> values) {
            addCriterion("KEY_ITM in", values, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmNotIn(List<Integer> values) {
            addCriterion("KEY_ITM not in", values, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmBetween(Integer value1, Integer value2) {
            addCriterion("KEY_ITM between", value1, value2, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmNotBetween(Integer value1, Integer value2) {
            addCriterion("KEY_ITM not between", value1, value2, "keyItm");
            return (Criteria) this;
        }

        public Criteria andUpIsNull() {
            addCriterion("UP is null");
            return (Criteria) this;
        }

        public Criteria andUpIsNotNull() {
            addCriterion("UP is not null");
            return (Criteria) this;
        }

        public Criteria andUpEqualTo(BigDecimal value) {
            addCriterion("UP =", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotEqualTo(BigDecimal value) {
            addCriterion("UP <>", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpGreaterThan(BigDecimal value) {
            addCriterion("UP >", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP >=", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpLessThan(BigDecimal value) {
            addCriterion("UP <", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP <=", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpIn(List<BigDecimal> values) {
            addCriterion("UP in", values, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotIn(List<BigDecimal> values) {
            addCriterion("UP not in", values, "up");
            return (Criteria) this;
        }

        public Criteria andUpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP between", value1, value2, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP not between", value1, value2, "up");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIsNull() {
            addCriterion("AMTN_NET is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIsNotNull() {
            addCriterion("AMTN_NET is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET =", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET <>", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET >", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET >=", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetLessThan(BigDecimal value) {
            addCriterion("AMTN_NET <", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET <=", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET in", values, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET not in", values, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET between", value1, value2, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET not between", value1, value2, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andBoxItmIsNull() {
            addCriterion("BOX_ITM is null");
            return (Criteria) this;
        }

        public Criteria andBoxItmIsNotNull() {
            addCriterion("BOX_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andBoxItmEqualTo(Integer value) {
            addCriterion("BOX_ITM =", value, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmNotEqualTo(Integer value) {
            addCriterion("BOX_ITM <>", value, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmGreaterThan(Integer value) {
            addCriterion("BOX_ITM >", value, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOX_ITM >=", value, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmLessThan(Integer value) {
            addCriterion("BOX_ITM <", value, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmLessThanOrEqualTo(Integer value) {
            addCriterion("BOX_ITM <=", value, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmIn(List<Integer> values) {
            addCriterion("BOX_ITM in", values, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmNotIn(List<Integer> values) {
            addCriterion("BOX_ITM not in", values, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmBetween(Integer value1, Integer value2) {
            addCriterion("BOX_ITM between", value1, value2, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmNotBetween(Integer value1, Integer value2) {
            addCriterion("BOX_ITM not between", value1, value2, "boxItm");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpIsNull() {
            addCriterion("AMTN_NET_FP is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpIsNotNull() {
            addCriterion("AMTN_NET_FP is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP =", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP <>", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_FP >", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP >=", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_FP <", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP <=", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_FP in", values, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_FP not in", values, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_FP between", value1, value2, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_FP not between", value1, value2, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpIsNull() {
            addCriterion("AMT_FP is null");
            return (Criteria) this;
        }

        public Criteria andAmtFpIsNotNull() {
            addCriterion("AMT_FP is not null");
            return (Criteria) this;
        }

        public Criteria andAmtFpEqualTo(BigDecimal value) {
            addCriterion("AMT_FP =", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpNotEqualTo(BigDecimal value) {
            addCriterion("AMT_FP <>", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpGreaterThan(BigDecimal value) {
            addCriterion("AMT_FP >", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_FP >=", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpLessThan(BigDecimal value) {
            addCriterion("AMT_FP <", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_FP <=", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpIn(List<BigDecimal> values) {
            addCriterion("AMT_FP in", values, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpNotIn(List<BigDecimal> values) {
            addCriterion("AMT_FP not in", values, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_FP between", value1, value2, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_FP not between", value1, value2, "amtFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpIsNull() {
            addCriterion("TAX_FP is null");
            return (Criteria) this;
        }

        public Criteria andTaxFpIsNotNull() {
            addCriterion("TAX_FP is not null");
            return (Criteria) this;
        }

        public Criteria andTaxFpEqualTo(BigDecimal value) {
            addCriterion("TAX_FP =", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpNotEqualTo(BigDecimal value) {
            addCriterion("TAX_FP <>", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpGreaterThan(BigDecimal value) {
            addCriterion("TAX_FP >", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_FP >=", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpLessThan(BigDecimal value) {
            addCriterion("TAX_FP <", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_FP <=", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpIn(List<BigDecimal> values) {
            addCriterion("TAX_FP in", values, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpNotIn(List<BigDecimal> values) {
            addCriterion("TAX_FP not in", values, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_FP between", value1, value2, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_FP not between", value1, value2, "taxFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpIsNull() {
            addCriterion("QTY_FP is null");
            return (Criteria) this;
        }

        public Criteria andQtyFpIsNotNull() {
            addCriterion("QTY_FP is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFpEqualTo(BigDecimal value) {
            addCriterion("QTY_FP =", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpNotEqualTo(BigDecimal value) {
            addCriterion("QTY_FP <>", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpGreaterThan(BigDecimal value) {
            addCriterion("QTY_FP >", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FP >=", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpLessThan(BigDecimal value) {
            addCriterion("QTY_FP <", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FP <=", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpIn(List<BigDecimal> values) {
            addCriterion("QTY_FP in", values, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpNotIn(List<BigDecimal> values) {
            addCriterion("QTY_FP not in", values, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FP between", value1, value2, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FP not between", value1, value2, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andBilIdIsNull() {
            addCriterion("BIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBilIdIsNotNull() {
            addCriterion("BIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBilIdEqualTo(String value) {
            addCriterion("BIL_ID =", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotEqualTo(String value) {
            addCriterion("BIL_ID <>", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdGreaterThan(String value) {
            addCriterion("BIL_ID >", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_ID >=", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdLessThan(String value) {
            addCriterion("BIL_ID <", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdLessThanOrEqualTo(String value) {
            addCriterion("BIL_ID <=", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdLike(String value) {
            addCriterion("BIL_ID like", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotLike(String value) {
            addCriterion("BIL_ID not like", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdIn(List<String> values) {
            addCriterion("BIL_ID in", values, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotIn(List<String> values) {
            addCriterion("BIL_ID not in", values, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdBetween(String value1, String value2) {
            addCriterion("BIL_ID between", value1, value2, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotBetween(String value1, String value2) {
            addCriterion("BIL_ID not between", value1, value2, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilNoIsNull() {
            addCriterion("BIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andBilNoIsNotNull() {
            addCriterion("BIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBilNoEqualTo(String value) {
            addCriterion("BIL_NO =", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotEqualTo(String value) {
            addCriterion("BIL_NO <>", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoGreaterThan(String value) {
            addCriterion("BIL_NO >", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_NO >=", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoLessThan(String value) {
            addCriterion("BIL_NO <", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoLessThanOrEqualTo(String value) {
            addCriterion("BIL_NO <=", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoLike(String value) {
            addCriterion("BIL_NO like", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotLike(String value) {
            addCriterion("BIL_NO not like", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoIn(List<String> values) {
            addCriterion("BIL_NO in", values, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotIn(List<String> values) {
            addCriterion("BIL_NO not in", values, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoBetween(String value1, String value2) {
            addCriterion("BIL_NO between", value1, value2, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotBetween(String value1, String value2) {
            addCriterion("BIL_NO not between", value1, value2, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilItmIsNull() {
            addCriterion("BIL_ITM is null");
            return (Criteria) this;
        }

        public Criteria andBilItmIsNotNull() {
            addCriterion("BIL_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andBilItmEqualTo(Integer value) {
            addCriterion("BIL_ITM =", value, "bilItm");
            return (Criteria) this;
        }

        public Criteria andBilItmNotEqualTo(Integer value) {
            addCriterion("BIL_ITM <>", value, "bilItm");
            return (Criteria) this;
        }

        public Criteria andBilItmGreaterThan(Integer value) {
            addCriterion("BIL_ITM >", value, "bilItm");
            return (Criteria) this;
        }

        public Criteria andBilItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("BIL_ITM >=", value, "bilItm");
            return (Criteria) this;
        }

        public Criteria andBilItmLessThan(Integer value) {
            addCriterion("BIL_ITM <", value, "bilItm");
            return (Criteria) this;
        }

        public Criteria andBilItmLessThanOrEqualTo(Integer value) {
            addCriterion("BIL_ITM <=", value, "bilItm");
            return (Criteria) this;
        }

        public Criteria andBilItmIn(List<Integer> values) {
            addCriterion("BIL_ITM in", values, "bilItm");
            return (Criteria) this;
        }

        public Criteria andBilItmNotIn(List<Integer> values) {
            addCriterion("BIL_ITM not in", values, "bilItm");
            return (Criteria) this;
        }

        public Criteria andBilItmBetween(Integer value1, Integer value2) {
            addCriterion("BIL_ITM between", value1, value2, "bilItm");
            return (Criteria) this;
        }

        public Criteria andBilItmNotBetween(Integer value1, Integer value2) {
            addCriterion("BIL_ITM not between", value1, value2, "bilItm");
            return (Criteria) this;
        }

        public Criteria andUpCstIsNull() {
            addCriterion("UP_CST is null");
            return (Criteria) this;
        }

        public Criteria andUpCstIsNotNull() {
            addCriterion("UP_CST is not null");
            return (Criteria) this;
        }

        public Criteria andUpCstEqualTo(BigDecimal value) {
            addCriterion("UP_CST =", value, "upCst");
            return (Criteria) this;
        }

        public Criteria andUpCstNotEqualTo(BigDecimal value) {
            addCriterion("UP_CST <>", value, "upCst");
            return (Criteria) this;
        }

        public Criteria andUpCstGreaterThan(BigDecimal value) {
            addCriterion("UP_CST >", value, "upCst");
            return (Criteria) this;
        }

        public Criteria andUpCstGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_CST >=", value, "upCst");
            return (Criteria) this;
        }

        public Criteria andUpCstLessThan(BigDecimal value) {
            addCriterion("UP_CST <", value, "upCst");
            return (Criteria) this;
        }

        public Criteria andUpCstLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_CST <=", value, "upCst");
            return (Criteria) this;
        }

        public Criteria andUpCstIn(List<BigDecimal> values) {
            addCriterion("UP_CST in", values, "upCst");
            return (Criteria) this;
        }

        public Criteria andUpCstNotIn(List<BigDecimal> values) {
            addCriterion("UP_CST not in", values, "upCst");
            return (Criteria) this;
        }

        public Criteria andUpCstBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_CST between", value1, value2, "upCst");
            return (Criteria) this;
        }

        public Criteria andUpCstNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_CST not between", value1, value2, "upCst");
            return (Criteria) this;
        }

        public Criteria andDisCntIsNull() {
            addCriterion("DIS_CNT is null");
            return (Criteria) this;
        }

        public Criteria andDisCntIsNotNull() {
            addCriterion("DIS_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andDisCntEqualTo(BigDecimal value) {
            addCriterion("DIS_CNT =", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntNotEqualTo(BigDecimal value) {
            addCriterion("DIS_CNT <>", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntGreaterThan(BigDecimal value) {
            addCriterion("DIS_CNT >", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DIS_CNT >=", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntLessThan(BigDecimal value) {
            addCriterion("DIS_CNT <", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DIS_CNT <=", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntIn(List<BigDecimal> values) {
            addCriterion("DIS_CNT in", values, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntNotIn(List<BigDecimal> values) {
            addCriterion("DIS_CNT not in", values, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIS_CNT between", value1, value2, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIS_CNT not between", value1, value2, "disCnt");
            return (Criteria) this;
        }

        public Criteria andOsIdIsNull() {
            addCriterion("OS_ID is null");
            return (Criteria) this;
        }

        public Criteria andOsIdIsNotNull() {
            addCriterion("OS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOsIdEqualTo(String value) {
            addCriterion("OS_ID =", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotEqualTo(String value) {
            addCriterion("OS_ID <>", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdGreaterThan(String value) {
            addCriterion("OS_ID >", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdGreaterThanOrEqualTo(String value) {
            addCriterion("OS_ID >=", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdLessThan(String value) {
            addCriterion("OS_ID <", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdLessThanOrEqualTo(String value) {
            addCriterion("OS_ID <=", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdLike(String value) {
            addCriterion("OS_ID like", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotLike(String value) {
            addCriterion("OS_ID not like", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdIn(List<String> values) {
            addCriterion("OS_ID in", values, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotIn(List<String> values) {
            addCriterion("OS_ID not in", values, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdBetween(String value1, String value2) {
            addCriterion("OS_ID between", value1, value2, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotBetween(String value1, String value2) {
            addCriterion("OS_ID not between", value1, value2, "osId");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andEstItmIsNull() {
            addCriterion("EST_ITM is null");
            return (Criteria) this;
        }

        public Criteria andEstItmIsNotNull() {
            addCriterion("EST_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andEstItmEqualTo(Short value) {
            addCriterion("EST_ITM =", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmNotEqualTo(Short value) {
            addCriterion("EST_ITM <>", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmGreaterThan(Short value) {
            addCriterion("EST_ITM >", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmGreaterThanOrEqualTo(Short value) {
            addCriterion("EST_ITM >=", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmLessThan(Short value) {
            addCriterion("EST_ITM <", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmLessThanOrEqualTo(Short value) {
            addCriterion("EST_ITM <=", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmIn(List<Short> values) {
            addCriterion("EST_ITM in", values, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmNotIn(List<Short> values) {
            addCriterion("EST_ITM not in", values, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmBetween(Short value1, Short value2) {
            addCriterion("EST_ITM between", value1, value2, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmNotBetween(Short value1, Short value2) {
            addCriterion("EST_ITM not between", value1, value2, "estItm");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFp2IsNull() {
            addCriterion("AMTN_NET_FP2 is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFp2IsNotNull() {
            addCriterion("AMTN_NET_FP2 is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFp2EqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP2 =", value, "amtnNetFp2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFp2NotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP2 <>", value, "amtnNetFp2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFp2GreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_FP2 >", value, "amtnNetFp2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFp2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP2 >=", value, "amtnNetFp2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFp2LessThan(BigDecimal value) {
            addCriterion("AMTN_NET_FP2 <", value, "amtnNetFp2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFp2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP2 <=", value, "amtnNetFp2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFp2In(List<BigDecimal> values) {
            addCriterion("AMTN_NET_FP2 in", values, "amtnNetFp2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFp2NotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_FP2 not in", values, "amtnNetFp2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFp2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_FP2 between", value1, value2, "amtnNetFp2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFp2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_FP2 not between", value1, value2, "amtnNetFp2");
            return (Criteria) this;
        }

        public Criteria andAmtFp2IsNull() {
            addCriterion("AMT_FP2 is null");
            return (Criteria) this;
        }

        public Criteria andAmtFp2IsNotNull() {
            addCriterion("AMT_FP2 is not null");
            return (Criteria) this;
        }

        public Criteria andAmtFp2EqualTo(BigDecimal value) {
            addCriterion("AMT_FP2 =", value, "amtFp2");
            return (Criteria) this;
        }

        public Criteria andAmtFp2NotEqualTo(BigDecimal value) {
            addCriterion("AMT_FP2 <>", value, "amtFp2");
            return (Criteria) this;
        }

        public Criteria andAmtFp2GreaterThan(BigDecimal value) {
            addCriterion("AMT_FP2 >", value, "amtFp2");
            return (Criteria) this;
        }

        public Criteria andAmtFp2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_FP2 >=", value, "amtFp2");
            return (Criteria) this;
        }

        public Criteria andAmtFp2LessThan(BigDecimal value) {
            addCriterion("AMT_FP2 <", value, "amtFp2");
            return (Criteria) this;
        }

        public Criteria andAmtFp2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_FP2 <=", value, "amtFp2");
            return (Criteria) this;
        }

        public Criteria andAmtFp2In(List<BigDecimal> values) {
            addCriterion("AMT_FP2 in", values, "amtFp2");
            return (Criteria) this;
        }

        public Criteria andAmtFp2NotIn(List<BigDecimal> values) {
            addCriterion("AMT_FP2 not in", values, "amtFp2");
            return (Criteria) this;
        }

        public Criteria andAmtFp2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_FP2 between", value1, value2, "amtFp2");
            return (Criteria) this;
        }

        public Criteria andAmtFp2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_FP2 not between", value1, value2, "amtFp2");
            return (Criteria) this;
        }

        public Criteria andTaxFp2IsNull() {
            addCriterion("TAX_FP2 is null");
            return (Criteria) this;
        }

        public Criteria andTaxFp2IsNotNull() {
            addCriterion("TAX_FP2 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxFp2EqualTo(BigDecimal value) {
            addCriterion("TAX_FP2 =", value, "taxFp2");
            return (Criteria) this;
        }

        public Criteria andTaxFp2NotEqualTo(BigDecimal value) {
            addCriterion("TAX_FP2 <>", value, "taxFp2");
            return (Criteria) this;
        }

        public Criteria andTaxFp2GreaterThan(BigDecimal value) {
            addCriterion("TAX_FP2 >", value, "taxFp2");
            return (Criteria) this;
        }

        public Criteria andTaxFp2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_FP2 >=", value, "taxFp2");
            return (Criteria) this;
        }

        public Criteria andTaxFp2LessThan(BigDecimal value) {
            addCriterion("TAX_FP2 <", value, "taxFp2");
            return (Criteria) this;
        }

        public Criteria andTaxFp2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_FP2 <=", value, "taxFp2");
            return (Criteria) this;
        }

        public Criteria andTaxFp2In(List<BigDecimal> values) {
            addCriterion("TAX_FP2 in", values, "taxFp2");
            return (Criteria) this;
        }

        public Criteria andTaxFp2NotIn(List<BigDecimal> values) {
            addCriterion("TAX_FP2 not in", values, "taxFp2");
            return (Criteria) this;
        }

        public Criteria andTaxFp2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_FP2 between", value1, value2, "taxFp2");
            return (Criteria) this;
        }

        public Criteria andTaxFp2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_FP2 not between", value1, value2, "taxFp2");
            return (Criteria) this;
        }

        public Criteria andQtyFp2IsNull() {
            addCriterion("QTY_FP2 is null");
            return (Criteria) this;
        }

        public Criteria andQtyFp2IsNotNull() {
            addCriterion("QTY_FP2 is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFp2EqualTo(BigDecimal value) {
            addCriterion("QTY_FP2 =", value, "qtyFp2");
            return (Criteria) this;
        }

        public Criteria andQtyFp2NotEqualTo(BigDecimal value) {
            addCriterion("QTY_FP2 <>", value, "qtyFp2");
            return (Criteria) this;
        }

        public Criteria andQtyFp2GreaterThan(BigDecimal value) {
            addCriterion("QTY_FP2 >", value, "qtyFp2");
            return (Criteria) this;
        }

        public Criteria andQtyFp2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FP2 >=", value, "qtyFp2");
            return (Criteria) this;
        }

        public Criteria andQtyFp2LessThan(BigDecimal value) {
            addCriterion("QTY_FP2 <", value, "qtyFp2");
            return (Criteria) this;
        }

        public Criteria andQtyFp2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FP2 <=", value, "qtyFp2");
            return (Criteria) this;
        }

        public Criteria andQtyFp2In(List<BigDecimal> values) {
            addCriterion("QTY_FP2 in", values, "qtyFp2");
            return (Criteria) this;
        }

        public Criteria andQtyFp2NotIn(List<BigDecimal> values) {
            addCriterion("QTY_FP2 not in", values, "qtyFp2");
            return (Criteria) this;
        }

        public Criteria andQtyFp2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FP2 between", value1, value2, "qtyFp2");
            return (Criteria) this;
        }

        public Criteria andQtyFp2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FP2 not between", value1, value2, "qtyFp2");
            return (Criteria) this;
        }

        public Criteria andValidDdIsNull() {
            addCriterion("VALID_DD is null");
            return (Criteria) this;
        }

        public Criteria andValidDdIsNotNull() {
            addCriterion("VALID_DD is not null");
            return (Criteria) this;
        }

        public Criteria andValidDdEqualTo(Date value) {
            addCriterion("VALID_DD =", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdNotEqualTo(Date value) {
            addCriterion("VALID_DD <>", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdGreaterThan(Date value) {
            addCriterion("VALID_DD >", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdGreaterThanOrEqualTo(Date value) {
            addCriterion("VALID_DD >=", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdLessThan(Date value) {
            addCriterion("VALID_DD <", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdLessThanOrEqualTo(Date value) {
            addCriterion("VALID_DD <=", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdIn(List<Date> values) {
            addCriterion("VALID_DD in", values, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdNotIn(List<Date> values) {
            addCriterion("VALID_DD not in", values, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdBetween(Date value1, Date value2) {
            addCriterion("VALID_DD between", value1, value2, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdNotBetween(Date value1, Date value2) {
            addCriterion("VALID_DD not between", value1, value2, "validDd");
            return (Criteria) this;
        }

        public Criteria andRkDdIsNull() {
            addCriterion("RK_DD is null");
            return (Criteria) this;
        }

        public Criteria andRkDdIsNotNull() {
            addCriterion("RK_DD is not null");
            return (Criteria) this;
        }

        public Criteria andRkDdEqualTo(Date value) {
            addCriterion("RK_DD =", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdNotEqualTo(Date value) {
            addCriterion("RK_DD <>", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdGreaterThan(Date value) {
            addCriterion("RK_DD >", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdGreaterThanOrEqualTo(Date value) {
            addCriterion("RK_DD >=", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdLessThan(Date value) {
            addCriterion("RK_DD <", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdLessThanOrEqualTo(Date value) {
            addCriterion("RK_DD <=", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdIn(List<Date> values) {
            addCriterion("RK_DD in", values, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdNotIn(List<Date> values) {
            addCriterion("RK_DD not in", values, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdBetween(Date value1, Date value2) {
            addCriterion("RK_DD between", value1, value2, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdNotBetween(Date value1, Date value2) {
            addCriterion("RK_DD not between", value1, value2, "rkDd");
            return (Criteria) this;
        }

        public Criteria andDepRk1IsNull() {
            addCriterion("DEP_RK1 is null");
            return (Criteria) this;
        }

        public Criteria andDepRk1IsNotNull() {
            addCriterion("DEP_RK1 is not null");
            return (Criteria) this;
        }

        public Criteria andDepRk1EqualTo(String value) {
            addCriterion("DEP_RK1 =", value, "depRk1");
            return (Criteria) this;
        }

        public Criteria andDepRk1NotEqualTo(String value) {
            addCriterion("DEP_RK1 <>", value, "depRk1");
            return (Criteria) this;
        }

        public Criteria andDepRk1GreaterThan(String value) {
            addCriterion("DEP_RK1 >", value, "depRk1");
            return (Criteria) this;
        }

        public Criteria andDepRk1GreaterThanOrEqualTo(String value) {
            addCriterion("DEP_RK1 >=", value, "depRk1");
            return (Criteria) this;
        }

        public Criteria andDepRk1LessThan(String value) {
            addCriterion("DEP_RK1 <", value, "depRk1");
            return (Criteria) this;
        }

        public Criteria andDepRk1LessThanOrEqualTo(String value) {
            addCriterion("DEP_RK1 <=", value, "depRk1");
            return (Criteria) this;
        }

        public Criteria andDepRk1Like(String value) {
            addCriterion("DEP_RK1 like", value, "depRk1");
            return (Criteria) this;
        }

        public Criteria andDepRk1NotLike(String value) {
            addCriterion("DEP_RK1 not like", value, "depRk1");
            return (Criteria) this;
        }

        public Criteria andDepRk1In(List<String> values) {
            addCriterion("DEP_RK1 in", values, "depRk1");
            return (Criteria) this;
        }

        public Criteria andDepRk1NotIn(List<String> values) {
            addCriterion("DEP_RK1 not in", values, "depRk1");
            return (Criteria) this;
        }

        public Criteria andDepRk1Between(String value1, String value2) {
            addCriterion("DEP_RK1 between", value1, value2, "depRk1");
            return (Criteria) this;
        }

        public Criteria andDepRk1NotBetween(String value1, String value2) {
            addCriterion("DEP_RK1 not between", value1, value2, "depRk1");
            return (Criteria) this;
        }

        public Criteria andDepRk2IsNull() {
            addCriterion("DEP_RK2 is null");
            return (Criteria) this;
        }

        public Criteria andDepRk2IsNotNull() {
            addCriterion("DEP_RK2 is not null");
            return (Criteria) this;
        }

        public Criteria andDepRk2EqualTo(String value) {
            addCriterion("DEP_RK2 =", value, "depRk2");
            return (Criteria) this;
        }

        public Criteria andDepRk2NotEqualTo(String value) {
            addCriterion("DEP_RK2 <>", value, "depRk2");
            return (Criteria) this;
        }

        public Criteria andDepRk2GreaterThan(String value) {
            addCriterion("DEP_RK2 >", value, "depRk2");
            return (Criteria) this;
        }

        public Criteria andDepRk2GreaterThanOrEqualTo(String value) {
            addCriterion("DEP_RK2 >=", value, "depRk2");
            return (Criteria) this;
        }

        public Criteria andDepRk2LessThan(String value) {
            addCriterion("DEP_RK2 <", value, "depRk2");
            return (Criteria) this;
        }

        public Criteria andDepRk2LessThanOrEqualTo(String value) {
            addCriterion("DEP_RK2 <=", value, "depRk2");
            return (Criteria) this;
        }

        public Criteria andDepRk2Like(String value) {
            addCriterion("DEP_RK2 like", value, "depRk2");
            return (Criteria) this;
        }

        public Criteria andDepRk2NotLike(String value) {
            addCriterion("DEP_RK2 not like", value, "depRk2");
            return (Criteria) this;
        }

        public Criteria andDepRk2In(List<String> values) {
            addCriterion("DEP_RK2 in", values, "depRk2");
            return (Criteria) this;
        }

        public Criteria andDepRk2NotIn(List<String> values) {
            addCriterion("DEP_RK2 not in", values, "depRk2");
            return (Criteria) this;
        }

        public Criteria andDepRk2Between(String value1, String value2) {
            addCriterion("DEP_RK2 between", value1, value2, "depRk2");
            return (Criteria) this;
        }

        public Criteria andDepRk2NotBetween(String value1, String value2) {
            addCriterion("DEP_RK2 not between", value1, value2, "depRk2");
            return (Criteria) this;
        }

        public Criteria andMoNoIsNull() {
            addCriterion("MO_NO is null");
            return (Criteria) this;
        }

        public Criteria andMoNoIsNotNull() {
            addCriterion("MO_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMoNoEqualTo(String value) {
            addCriterion("MO_NO =", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoNotEqualTo(String value) {
            addCriterion("MO_NO <>", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoGreaterThan(String value) {
            addCriterion("MO_NO >", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoGreaterThanOrEqualTo(String value) {
            addCriterion("MO_NO >=", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoLessThan(String value) {
            addCriterion("MO_NO <", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoLessThanOrEqualTo(String value) {
            addCriterion("MO_NO <=", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoLike(String value) {
            addCriterion("MO_NO like", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoNotLike(String value) {
            addCriterion("MO_NO not like", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoIn(List<String> values) {
            addCriterion("MO_NO in", values, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoNotIn(List<String> values) {
            addCriterion("MO_NO not in", values, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoBetween(String value1, String value2) {
            addCriterion("MO_NO between", value1, value2, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoNotBetween(String value1, String value2) {
            addCriterion("MO_NO not between", value1, value2, "moNo");
            return (Criteria) this;
        }

        public Criteria andEpIdIsNull() {
            addCriterion("EP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEpIdIsNotNull() {
            addCriterion("EP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEpIdEqualTo(String value) {
            addCriterion("EP_ID =", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotEqualTo(String value) {
            addCriterion("EP_ID <>", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdGreaterThan(String value) {
            addCriterion("EP_ID >", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdGreaterThanOrEqualTo(String value) {
            addCriterion("EP_ID >=", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdLessThan(String value) {
            addCriterion("EP_ID <", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdLessThanOrEqualTo(String value) {
            addCriterion("EP_ID <=", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdLike(String value) {
            addCriterion("EP_ID like", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotLike(String value) {
            addCriterion("EP_ID not like", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdIn(List<String> values) {
            addCriterion("EP_ID in", values, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotIn(List<String> values) {
            addCriterion("EP_ID not in", values, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdBetween(String value1, String value2) {
            addCriterion("EP_ID between", value1, value2, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotBetween(String value1, String value2) {
            addCriterion("EP_ID not between", value1, value2, "epId");
            return (Criteria) this;
        }

        public Criteria andUpIcIsNull() {
            addCriterion("UP_IC is null");
            return (Criteria) this;
        }

        public Criteria andUpIcIsNotNull() {
            addCriterion("UP_IC is not null");
            return (Criteria) this;
        }

        public Criteria andUpIcEqualTo(BigDecimal value) {
            addCriterion("UP_IC =", value, "upIc");
            return (Criteria) this;
        }

        public Criteria andUpIcNotEqualTo(BigDecimal value) {
            addCriterion("UP_IC <>", value, "upIc");
            return (Criteria) this;
        }

        public Criteria andUpIcGreaterThan(BigDecimal value) {
            addCriterion("UP_IC >", value, "upIc");
            return (Criteria) this;
        }

        public Criteria andUpIcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_IC >=", value, "upIc");
            return (Criteria) this;
        }

        public Criteria andUpIcLessThan(BigDecimal value) {
            addCriterion("UP_IC <", value, "upIc");
            return (Criteria) this;
        }

        public Criteria andUpIcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_IC <=", value, "upIc");
            return (Criteria) this;
        }

        public Criteria andUpIcIn(List<BigDecimal> values) {
            addCriterion("UP_IC in", values, "upIc");
            return (Criteria) this;
        }

        public Criteria andUpIcNotIn(List<BigDecimal> values) {
            addCriterion("UP_IC not in", values, "upIc");
            return (Criteria) this;
        }

        public Criteria andUpIcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_IC between", value1, value2, "upIc");
            return (Criteria) this;
        }

        public Criteria andUpIcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_IC not between", value1, value2, "upIc");
            return (Criteria) this;
        }

        public Criteria andAmtnIcIsNull() {
            addCriterion("AMTN_IC is null");
            return (Criteria) this;
        }

        public Criteria andAmtnIcIsNotNull() {
            addCriterion("AMTN_IC is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnIcEqualTo(BigDecimal value) {
            addCriterion("AMTN_IC =", value, "amtnIc");
            return (Criteria) this;
        }

        public Criteria andAmtnIcNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_IC <>", value, "amtnIc");
            return (Criteria) this;
        }

        public Criteria andAmtnIcGreaterThan(BigDecimal value) {
            addCriterion("AMTN_IC >", value, "amtnIc");
            return (Criteria) this;
        }

        public Criteria andAmtnIcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_IC >=", value, "amtnIc");
            return (Criteria) this;
        }

        public Criteria andAmtnIcLessThan(BigDecimal value) {
            addCriterion("AMTN_IC <", value, "amtnIc");
            return (Criteria) this;
        }

        public Criteria andAmtnIcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_IC <=", value, "amtnIc");
            return (Criteria) this;
        }

        public Criteria andAmtnIcIn(List<BigDecimal> values) {
            addCriterion("AMTN_IC in", values, "amtnIc");
            return (Criteria) this;
        }

        public Criteria andAmtnIcNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_IC not in", values, "amtnIc");
            return (Criteria) this;
        }

        public Criteria andAmtnIcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_IC between", value1, value2, "amtnIc");
            return (Criteria) this;
        }

        public Criteria andAmtnIcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_IC not between", value1, value2, "amtnIc");
            return (Criteria) this;
        }

        public Criteria andPwItmIsNull() {
            addCriterion("PW_ITM is null");
            return (Criteria) this;
        }

        public Criteria andPwItmIsNotNull() {
            addCriterion("PW_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andPwItmEqualTo(Integer value) {
            addCriterion("PW_ITM =", value, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmNotEqualTo(Integer value) {
            addCriterion("PW_ITM <>", value, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmGreaterThan(Integer value) {
            addCriterion("PW_ITM >", value, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("PW_ITM >=", value, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmLessThan(Integer value) {
            addCriterion("PW_ITM <", value, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmLessThanOrEqualTo(Integer value) {
            addCriterion("PW_ITM <=", value, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmIn(List<Integer> values) {
            addCriterion("PW_ITM in", values, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmNotIn(List<Integer> values) {
            addCriterion("PW_ITM not in", values, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmBetween(Integer value1, Integer value2) {
            addCriterion("PW_ITM between", value1, value2, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmNotBetween(Integer value1, Integer value2) {
            addCriterion("PW_ITM not between", value1, value2, "pwItm");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIsNull() {
            addCriterion("AMTN_EP is null");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIsNotNull() {
            addCriterion("AMTN_EP is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnEpEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP =", value, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP <>", value, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpGreaterThan(BigDecimal value) {
            addCriterion("AMTN_EP >", value, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP >=", value, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpLessThan(BigDecimal value) {
            addCriterion("AMTN_EP <", value, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP <=", value, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIn(List<BigDecimal> values) {
            addCriterion("AMTN_EP in", values, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_EP not in", values, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_EP between", value1, value2, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_EP not between", value1, value2, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andQtyCfmIsNull() {
            addCriterion("QTY_CFM is null");
            return (Criteria) this;
        }

        public Criteria andQtyCfmIsNotNull() {
            addCriterion("QTY_CFM is not null");
            return (Criteria) this;
        }

        public Criteria andQtyCfmEqualTo(BigDecimal value) {
            addCriterion("QTY_CFM =", value, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmNotEqualTo(BigDecimal value) {
            addCriterion("QTY_CFM <>", value, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmGreaterThan(BigDecimal value) {
            addCriterion("QTY_CFM >", value, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CFM >=", value, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmLessThan(BigDecimal value) {
            addCriterion("QTY_CFM <", value, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CFM <=", value, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmIn(List<BigDecimal> values) {
            addCriterion("QTY_CFM in", values, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmNotIn(List<BigDecimal> values) {
            addCriterion("QTY_CFM not in", values, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CFM between", value1, value2, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CFM not between", value1, value2, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyLostIsNull() {
            addCriterion("QTY_LOST is null");
            return (Criteria) this;
        }

        public Criteria andQtyLostIsNotNull() {
            addCriterion("QTY_LOST is not null");
            return (Criteria) this;
        }

        public Criteria andQtyLostEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST =", value, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostNotEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST <>", value, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostGreaterThan(BigDecimal value) {
            addCriterion("QTY_LOST >", value, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST >=", value, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostLessThan(BigDecimal value) {
            addCriterion("QTY_LOST <", value, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST <=", value, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostIn(List<BigDecimal> values) {
            addCriterion("QTY_LOST in", values, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostNotIn(List<BigDecimal> values) {
            addCriterion("QTY_LOST not in", values, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOST between", value1, value2, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOST not between", value1, value2, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andEstDdIsNull() {
            addCriterion("EST_DD is null");
            return (Criteria) this;
        }

        public Criteria andEstDdIsNotNull() {
            addCriterion("EST_DD is not null");
            return (Criteria) this;
        }

        public Criteria andEstDdEqualTo(Date value) {
            addCriterion("EST_DD =", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdNotEqualTo(Date value) {
            addCriterion("EST_DD <>", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdGreaterThan(Date value) {
            addCriterion("EST_DD >", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdGreaterThanOrEqualTo(Date value) {
            addCriterion("EST_DD >=", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdLessThan(Date value) {
            addCriterion("EST_DD <", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdLessThanOrEqualTo(Date value) {
            addCriterion("EST_DD <=", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdIn(List<Date> values) {
            addCriterion("EST_DD in", values, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdNotIn(List<Date> values) {
            addCriterion("EST_DD not in", values, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdBetween(Date value1, Date value2) {
            addCriterion("EST_DD between", value1, value2, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdNotBetween(Date value1, Date value2) {
            addCriterion("EST_DD not between", value1, value2, "estDd");
            return (Criteria) this;
        }

        public Criteria andQty1CfmIsNull() {
            addCriterion("QTY1_CFM is null");
            return (Criteria) this;
        }

        public Criteria andQty1CfmIsNotNull() {
            addCriterion("QTY1_CFM is not null");
            return (Criteria) this;
        }

        public Criteria andQty1CfmEqualTo(BigDecimal value) {
            addCriterion("QTY1_CFM =", value, "qty1Cfm");
            return (Criteria) this;
        }

        public Criteria andQty1CfmNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_CFM <>", value, "qty1Cfm");
            return (Criteria) this;
        }

        public Criteria andQty1CfmGreaterThan(BigDecimal value) {
            addCriterion("QTY1_CFM >", value, "qty1Cfm");
            return (Criteria) this;
        }

        public Criteria andQty1CfmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_CFM >=", value, "qty1Cfm");
            return (Criteria) this;
        }

        public Criteria andQty1CfmLessThan(BigDecimal value) {
            addCriterion("QTY1_CFM <", value, "qty1Cfm");
            return (Criteria) this;
        }

        public Criteria andQty1CfmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_CFM <=", value, "qty1Cfm");
            return (Criteria) this;
        }

        public Criteria andQty1CfmIn(List<BigDecimal> values) {
            addCriterion("QTY1_CFM in", values, "qty1Cfm");
            return (Criteria) this;
        }

        public Criteria andQty1CfmNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_CFM not in", values, "qty1Cfm");
            return (Criteria) this;
        }

        public Criteria andQty1CfmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_CFM between", value1, value2, "qty1Cfm");
            return (Criteria) this;
        }

        public Criteria andQty1CfmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_CFM not between", value1, value2, "qty1Cfm");
            return (Criteria) this;
        }

        public Criteria andQty1LostIsNull() {
            addCriterion("QTY1_LOST is null");
            return (Criteria) this;
        }

        public Criteria andQty1LostIsNotNull() {
            addCriterion("QTY1_LOST is not null");
            return (Criteria) this;
        }

        public Criteria andQty1LostEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOST =", value, "qty1Lost");
            return (Criteria) this;
        }

        public Criteria andQty1LostNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOST <>", value, "qty1Lost");
            return (Criteria) this;
        }

        public Criteria andQty1LostGreaterThan(BigDecimal value) {
            addCriterion("QTY1_LOST >", value, "qty1Lost");
            return (Criteria) this;
        }

        public Criteria andQty1LostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOST >=", value, "qty1Lost");
            return (Criteria) this;
        }

        public Criteria andQty1LostLessThan(BigDecimal value) {
            addCriterion("QTY1_LOST <", value, "qty1Lost");
            return (Criteria) this;
        }

        public Criteria andQty1LostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOST <=", value, "qty1Lost");
            return (Criteria) this;
        }

        public Criteria andQty1LostIn(List<BigDecimal> values) {
            addCriterion("QTY1_LOST in", values, "qty1Lost");
            return (Criteria) this;
        }

        public Criteria andQty1LostNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_LOST not in", values, "qty1Lost");
            return (Criteria) this;
        }

        public Criteria andQty1LostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LOST between", value1, value2, "qty1Lost");
            return (Criteria) this;
        }

        public Criteria andQty1LostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LOST not between", value1, value2, "qty1Lost");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoIsNull() {
            addCriterion("SUP_PRD_NO is null");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoIsNotNull() {
            addCriterion("SUP_PRD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoEqualTo(String value) {
            addCriterion("SUP_PRD_NO =", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoNotEqualTo(String value) {
            addCriterion("SUP_PRD_NO <>", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoGreaterThan(String value) {
            addCriterion("SUP_PRD_NO >", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_NO >=", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoLessThan(String value) {
            addCriterion("SUP_PRD_NO <", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoLessThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_NO <=", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoLike(String value) {
            addCriterion("SUP_PRD_NO like", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoNotLike(String value) {
            addCriterion("SUP_PRD_NO not like", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoIn(List<String> values) {
            addCriterion("SUP_PRD_NO in", values, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoNotIn(List<String> values) {
            addCriterion("SUP_PRD_NO not in", values, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoBetween(String value1, String value2) {
            addCriterion("SUP_PRD_NO between", value1, value2, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoNotBetween(String value1, String value2) {
            addCriterion("SUP_PRD_NO not between", value1, value2, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andUpMainIIsNull() {
            addCriterion("UP_MAIN_I is null");
            return (Criteria) this;
        }

        public Criteria andUpMainIIsNotNull() {
            addCriterion("UP_MAIN_I is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainIEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I =", value, "upMainI");
            return (Criteria) this;
        }

        public Criteria andUpMainINotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I <>", value, "upMainI");
            return (Criteria) this;
        }

        public Criteria andUpMainIGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN_I >", value, "upMainI");
            return (Criteria) this;
        }

        public Criteria andUpMainIGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I >=", value, "upMainI");
            return (Criteria) this;
        }

        public Criteria andUpMainILessThan(BigDecimal value) {
            addCriterion("UP_MAIN_I <", value, "upMainI");
            return (Criteria) this;
        }

        public Criteria andUpMainILessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I <=", value, "upMainI");
            return (Criteria) this;
        }

        public Criteria andUpMainIIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_I in", values, "upMainI");
            return (Criteria) this;
        }

        public Criteria andUpMainINotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_I not in", values, "upMainI");
            return (Criteria) this;
        }

        public Criteria andUpMainIBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_I between", value1, value2, "upMainI");
            return (Criteria) this;
        }

        public Criteria andUpMainINotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_I not between", value1, value2, "upMainI");
            return (Criteria) this;
        }

        public Criteria andUpMainOIsNull() {
            addCriterion("UP_MAIN_O is null");
            return (Criteria) this;
        }

        public Criteria andUpMainOIsNotNull() {
            addCriterion("UP_MAIN_O is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainOEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O =", value, "upMainO");
            return (Criteria) this;
        }

        public Criteria andUpMainONotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O <>", value, "upMainO");
            return (Criteria) this;
        }

        public Criteria andUpMainOGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN_O >", value, "upMainO");
            return (Criteria) this;
        }

        public Criteria andUpMainOGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O >=", value, "upMainO");
            return (Criteria) this;
        }

        public Criteria andUpMainOLessThan(BigDecimal value) {
            addCriterion("UP_MAIN_O <", value, "upMainO");
            return (Criteria) this;
        }

        public Criteria andUpMainOLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O <=", value, "upMainO");
            return (Criteria) this;
        }

        public Criteria andUpMainOIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_O in", values, "upMainO");
            return (Criteria) this;
        }

        public Criteria andUpMainONotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_O not in", values, "upMainO");
            return (Criteria) this;
        }

        public Criteria andUpMainOBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_O between", value1, value2, "upMainO");
            return (Criteria) this;
        }

        public Criteria andUpMainONotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_O not between", value1, value2, "upMainO");
            return (Criteria) this;
        }

        public Criteria andPrdMark2IsNull() {
            addCriterion("PRD_MARK2 is null");
            return (Criteria) this;
        }

        public Criteria andPrdMark2IsNotNull() {
            addCriterion("PRD_MARK2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrdMark2EqualTo(String value) {
            addCriterion("PRD_MARK2 =", value, "prdMark2");
            return (Criteria) this;
        }

        public Criteria andPrdMark2NotEqualTo(String value) {
            addCriterion("PRD_MARK2 <>", value, "prdMark2");
            return (Criteria) this;
        }

        public Criteria andPrdMark2GreaterThan(String value) {
            addCriterion("PRD_MARK2 >", value, "prdMark2");
            return (Criteria) this;
        }

        public Criteria andPrdMark2GreaterThanOrEqualTo(String value) {
            addCriterion("PRD_MARK2 >=", value, "prdMark2");
            return (Criteria) this;
        }

        public Criteria andPrdMark2LessThan(String value) {
            addCriterion("PRD_MARK2 <", value, "prdMark2");
            return (Criteria) this;
        }

        public Criteria andPrdMark2LessThanOrEqualTo(String value) {
            addCriterion("PRD_MARK2 <=", value, "prdMark2");
            return (Criteria) this;
        }

        public Criteria andPrdMark2Like(String value) {
            addCriterion("PRD_MARK2 like", value, "prdMark2");
            return (Criteria) this;
        }

        public Criteria andPrdMark2NotLike(String value) {
            addCriterion("PRD_MARK2 not like", value, "prdMark2");
            return (Criteria) this;
        }

        public Criteria andPrdMark2In(List<String> values) {
            addCriterion("PRD_MARK2 in", values, "prdMark2");
            return (Criteria) this;
        }

        public Criteria andPrdMark2NotIn(List<String> values) {
            addCriterion("PRD_MARK2 not in", values, "prdMark2");
            return (Criteria) this;
        }

        public Criteria andPrdMark2Between(String value1, String value2) {
            addCriterion("PRD_MARK2 between", value1, value2, "prdMark2");
            return (Criteria) this;
        }

        public Criteria andPrdMark2NotBetween(String value1, String value2) {
            addCriterion("PRD_MARK2 not between", value1, value2, "prdMark2");
            return (Criteria) this;
        }

        public Criteria andQcFlagIsNull() {
            addCriterion("QC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andQcFlagIsNotNull() {
            addCriterion("QC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andQcFlagEqualTo(String value) {
            addCriterion("QC_FLAG =", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagNotEqualTo(String value) {
            addCriterion("QC_FLAG <>", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagGreaterThan(String value) {
            addCriterion("QC_FLAG >", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagGreaterThanOrEqualTo(String value) {
            addCriterion("QC_FLAG >=", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagLessThan(String value) {
            addCriterion("QC_FLAG <", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagLessThanOrEqualTo(String value) {
            addCriterion("QC_FLAG <=", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagLike(String value) {
            addCriterion("QC_FLAG like", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagNotLike(String value) {
            addCriterion("QC_FLAG not like", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagIn(List<String> values) {
            addCriterion("QC_FLAG in", values, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagNotIn(List<String> values) {
            addCriterion("QC_FLAG not in", values, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagBetween(String value1, String value2) {
            addCriterion("QC_FLAG between", value1, value2, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagNotBetween(String value1, String value2) {
            addCriterion("QC_FLAG not between", value1, value2, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andPakUnitIsNull() {
            addCriterion("PAK_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPakUnitIsNotNull() {
            addCriterion("PAK_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPakUnitEqualTo(String value) {
            addCriterion("PAK_UNIT =", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotEqualTo(String value) {
            addCriterion("PAK_UNIT <>", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitGreaterThan(String value) {
            addCriterion("PAK_UNIT >", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAK_UNIT >=", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitLessThan(String value) {
            addCriterion("PAK_UNIT <", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitLessThanOrEqualTo(String value) {
            addCriterion("PAK_UNIT <=", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitLike(String value) {
            addCriterion("PAK_UNIT like", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotLike(String value) {
            addCriterion("PAK_UNIT not like", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitIn(List<String> values) {
            addCriterion("PAK_UNIT in", values, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotIn(List<String> values) {
            addCriterion("PAK_UNIT not in", values, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitBetween(String value1, String value2) {
            addCriterion("PAK_UNIT between", value1, value2, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotBetween(String value1, String value2) {
            addCriterion("PAK_UNIT not between", value1, value2, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakExcIsNull() {
            addCriterion("PAK_EXC is null");
            return (Criteria) this;
        }

        public Criteria andPakExcIsNotNull() {
            addCriterion("PAK_EXC is not null");
            return (Criteria) this;
        }

        public Criteria andPakExcEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC =", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcNotEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC <>", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcGreaterThan(BigDecimal value) {
            addCriterion("PAK_EXC >", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC >=", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcLessThan(BigDecimal value) {
            addCriterion("PAK_EXC <", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC <=", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcIn(List<BigDecimal> values) {
            addCriterion("PAK_EXC in", values, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcNotIn(List<BigDecimal> values) {
            addCriterion("PAK_EXC not in", values, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_EXC between", value1, value2, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_EXC not between", value1, value2, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakNwNIsNull() {
            addCriterion("PAK_NW_N is null");
            return (Criteria) this;
        }

        public Criteria andPakNwNIsNotNull() {
            addCriterion("PAK_NW_N is not null");
            return (Criteria) this;
        }

        public Criteria andPakNwNEqualTo(BigDecimal value) {
            addCriterion("PAK_NW_N =", value, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNNotEqualTo(BigDecimal value) {
            addCriterion("PAK_NW_N <>", value, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNGreaterThan(BigDecimal value) {
            addCriterion("PAK_NW_N >", value, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_NW_N >=", value, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNLessThan(BigDecimal value) {
            addCriterion("PAK_NW_N <", value, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_NW_N <=", value, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNIn(List<BigDecimal> values) {
            addCriterion("PAK_NW_N in", values, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNNotIn(List<BigDecimal> values) {
            addCriterion("PAK_NW_N not in", values, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_NW_N between", value1, value2, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_NW_N not between", value1, value2, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwIsNull() {
            addCriterion("PAK_NW is null");
            return (Criteria) this;
        }

        public Criteria andPakNwIsNotNull() {
            addCriterion("PAK_NW is not null");
            return (Criteria) this;
        }

        public Criteria andPakNwEqualTo(BigDecimal value) {
            addCriterion("PAK_NW =", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwNotEqualTo(BigDecimal value) {
            addCriterion("PAK_NW <>", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwGreaterThan(BigDecimal value) {
            addCriterion("PAK_NW >", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_NW >=", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwLessThan(BigDecimal value) {
            addCriterion("PAK_NW <", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_NW <=", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwIn(List<BigDecimal> values) {
            addCriterion("PAK_NW in", values, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwNotIn(List<BigDecimal> values) {
            addCriterion("PAK_NW not in", values, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_NW between", value1, value2, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_NW not between", value1, value2, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitIsNull() {
            addCriterion("PAK_WEIGHT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitIsNotNull() {
            addCriterion("PAK_WEIGHT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT =", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT <>", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitGreaterThan(String value) {
            addCriterion("PAK_WEIGHT_UNIT >", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT >=", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitLessThan(String value) {
            addCriterion("PAK_WEIGHT_UNIT <", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitLessThanOrEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT <=", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitLike(String value) {
            addCriterion("PAK_WEIGHT_UNIT like", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotLike(String value) {
            addCriterion("PAK_WEIGHT_UNIT not like", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitIn(List<String> values) {
            addCriterion("PAK_WEIGHT_UNIT in", values, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotIn(List<String> values) {
            addCriterion("PAK_WEIGHT_UNIT not in", values, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitBetween(String value1, String value2) {
            addCriterion("PAK_WEIGHT_UNIT between", value1, value2, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotBetween(String value1, String value2) {
            addCriterion("PAK_WEIGHT_UNIT not between", value1, value2, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakGwNIsNull() {
            addCriterion("PAK_GW_N is null");
            return (Criteria) this;
        }

        public Criteria andPakGwNIsNotNull() {
            addCriterion("PAK_GW_N is not null");
            return (Criteria) this;
        }

        public Criteria andPakGwNEqualTo(BigDecimal value) {
            addCriterion("PAK_GW_N =", value, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNNotEqualTo(BigDecimal value) {
            addCriterion("PAK_GW_N <>", value, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNGreaterThan(BigDecimal value) {
            addCriterion("PAK_GW_N >", value, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_GW_N >=", value, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNLessThan(BigDecimal value) {
            addCriterion("PAK_GW_N <", value, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_GW_N <=", value, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNIn(List<BigDecimal> values) {
            addCriterion("PAK_GW_N in", values, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNNotIn(List<BigDecimal> values) {
            addCriterion("PAK_GW_N not in", values, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_GW_N between", value1, value2, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_GW_N not between", value1, value2, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwIsNull() {
            addCriterion("PAK_GW is null");
            return (Criteria) this;
        }

        public Criteria andPakGwIsNotNull() {
            addCriterion("PAK_GW is not null");
            return (Criteria) this;
        }

        public Criteria andPakGwEqualTo(BigDecimal value) {
            addCriterion("PAK_GW =", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwNotEqualTo(BigDecimal value) {
            addCriterion("PAK_GW <>", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwGreaterThan(BigDecimal value) {
            addCriterion("PAK_GW >", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_GW >=", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwLessThan(BigDecimal value) {
            addCriterion("PAK_GW <", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_GW <=", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwIn(List<BigDecimal> values) {
            addCriterion("PAK_GW in", values, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwNotIn(List<BigDecimal> values) {
            addCriterion("PAK_GW not in", values, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_GW between", value1, value2, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_GW not between", value1, value2, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakMeastIsNull() {
            addCriterion("PAK_MEAST is null");
            return (Criteria) this;
        }

        public Criteria andPakMeastIsNotNull() {
            addCriterion("PAK_MEAST is not null");
            return (Criteria) this;
        }

        public Criteria andPakMeastEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST =", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastNotEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST <>", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastGreaterThan(BigDecimal value) {
            addCriterion("PAK_MEAST >", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST >=", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastLessThan(BigDecimal value) {
            addCriterion("PAK_MEAST <", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST <=", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastIn(List<BigDecimal> values) {
            addCriterion("PAK_MEAST in", values, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastNotIn(List<BigDecimal> values) {
            addCriterion("PAK_MEAST not in", values, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_MEAST between", value1, value2, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_MEAST not between", value1, value2, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitIsNull() {
            addCriterion("PAK_MEAST_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitIsNotNull() {
            addCriterion("PAK_MEAST_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT =", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT <>", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitGreaterThan(String value) {
            addCriterion("PAK_MEAST_UNIT >", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT >=", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitLessThan(String value) {
            addCriterion("PAK_MEAST_UNIT <", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitLessThanOrEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT <=", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitLike(String value) {
            addCriterion("PAK_MEAST_UNIT like", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotLike(String value) {
            addCriterion("PAK_MEAST_UNIT not like", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitIn(List<String> values) {
            addCriterion("PAK_MEAST_UNIT in", values, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotIn(List<String> values) {
            addCriterion("PAK_MEAST_UNIT not in", values, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitBetween(String value1, String value2) {
            addCriterion("PAK_MEAST_UNIT between", value1, value2, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotBetween(String value1, String value2) {
            addCriterion("PAK_MEAST_UNIT not between", value1, value2, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andUpQty1IsNull() {
            addCriterion("UP_QTY1 is null");
            return (Criteria) this;
        }

        public Criteria andUpQty1IsNotNull() {
            addCriterion("UP_QTY1 is not null");
            return (Criteria) this;
        }

        public Criteria andUpQty1EqualTo(BigDecimal value) {
            addCriterion("UP_QTY1 =", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1NotEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1 <>", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1GreaterThan(BigDecimal value) {
            addCriterion("UP_QTY1 >", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1 >=", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1LessThan(BigDecimal value) {
            addCriterion("UP_QTY1 <", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1 <=", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1In(List<BigDecimal> values) {
            addCriterion("UP_QTY1 in", values, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1NotIn(List<BigDecimal> values) {
            addCriterion("UP_QTY1 not in", values, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_QTY1 between", value1, value2, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_QTY1 not between", value1, value2, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1CstIsNull() {
            addCriterion("UP_QTY1_CST is null");
            return (Criteria) this;
        }

        public Criteria andUpQty1CstIsNotNull() {
            addCriterion("UP_QTY1_CST is not null");
            return (Criteria) this;
        }

        public Criteria andUpQty1CstEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1_CST =", value, "upQty1Cst");
            return (Criteria) this;
        }

        public Criteria andUpQty1CstNotEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1_CST <>", value, "upQty1Cst");
            return (Criteria) this;
        }

        public Criteria andUpQty1CstGreaterThan(BigDecimal value) {
            addCriterion("UP_QTY1_CST >", value, "upQty1Cst");
            return (Criteria) this;
        }

        public Criteria andUpQty1CstGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1_CST >=", value, "upQty1Cst");
            return (Criteria) this;
        }

        public Criteria andUpQty1CstLessThan(BigDecimal value) {
            addCriterion("UP_QTY1_CST <", value, "upQty1Cst");
            return (Criteria) this;
        }

        public Criteria andUpQty1CstLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1_CST <=", value, "upQty1Cst");
            return (Criteria) this;
        }

        public Criteria andUpQty1CstIn(List<BigDecimal> values) {
            addCriterion("UP_QTY1_CST in", values, "upQty1Cst");
            return (Criteria) this;
        }

        public Criteria andUpQty1CstNotIn(List<BigDecimal> values) {
            addCriterion("UP_QTY1_CST not in", values, "upQty1Cst");
            return (Criteria) this;
        }

        public Criteria andUpQty1CstBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_QTY1_CST between", value1, value2, "upQty1Cst");
            return (Criteria) this;
        }

        public Criteria andUpQty1CstNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_QTY1_CST not between", value1, value2, "upQty1Cst");
            return (Criteria) this;
        }

        public Criteria andUpStdIsNull() {
            addCriterion("UP_STD is null");
            return (Criteria) this;
        }

        public Criteria andUpStdIsNotNull() {
            addCriterion("UP_STD is not null");
            return (Criteria) this;
        }

        public Criteria andUpStdEqualTo(BigDecimal value) {
            addCriterion("UP_STD =", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdNotEqualTo(BigDecimal value) {
            addCriterion("UP_STD <>", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdGreaterThan(BigDecimal value) {
            addCriterion("UP_STD >", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_STD >=", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdLessThan(BigDecimal value) {
            addCriterion("UP_STD <", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_STD <=", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdIn(List<BigDecimal> values) {
            addCriterion("UP_STD in", values, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdNotIn(List<BigDecimal> values) {
            addCriterion("UP_STD not in", values, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_STD between", value1, value2, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_STD not between", value1, value2, "upStd");
            return (Criteria) this;
        }

        public Criteria andQtyCfmUnshIsNull() {
            addCriterion("QTY_CFM_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyCfmUnshIsNotNull() {
            addCriterion("QTY_CFM_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyCfmUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_CFM_UNSH =", value, "qtyCfmUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCfmUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_CFM_UNSH <>", value, "qtyCfmUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCfmUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_CFM_UNSH >", value, "qtyCfmUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCfmUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CFM_UNSH >=", value, "qtyCfmUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCfmUnshLessThan(BigDecimal value) {
            addCriterion("QTY_CFM_UNSH <", value, "qtyCfmUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCfmUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CFM_UNSH <=", value, "qtyCfmUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCfmUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_CFM_UNSH in", values, "qtyCfmUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCfmUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_CFM_UNSH not in", values, "qtyCfmUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCfmUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CFM_UNSH between", value1, value2, "qtyCfmUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCfmUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CFM_UNSH not between", value1, value2, "qtyCfmUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLostUnshIsNull() {
            addCriterion("QTY_LOST_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyLostUnshIsNotNull() {
            addCriterion("QTY_LOST_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyLostUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST_UNSH =", value, "qtyLostUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLostUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST_UNSH <>", value, "qtyLostUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLostUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_LOST_UNSH >", value, "qtyLostUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLostUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST_UNSH >=", value, "qtyLostUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLostUnshLessThan(BigDecimal value) {
            addCriterion("QTY_LOST_UNSH <", value, "qtyLostUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLostUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST_UNSH <=", value, "qtyLostUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLostUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_LOST_UNSH in", values, "qtyLostUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLostUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_LOST_UNSH not in", values, "qtyLostUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLostUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOST_UNSH between", value1, value2, "qtyLostUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLostUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOST_UNSH not between", value1, value2, "qtyLostUnsh");
            return (Criteria) this;
        }

        public Criteria andCstOIfrsIsNull() {
            addCriterion("CST_O_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andCstOIfrsIsNotNull() {
            addCriterion("CST_O_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andCstOIfrsEqualTo(BigDecimal value) {
            addCriterion("CST_O_IFRS =", value, "cstOIfrs");
            return (Criteria) this;
        }

        public Criteria andCstOIfrsNotEqualTo(BigDecimal value) {
            addCriterion("CST_O_IFRS <>", value, "cstOIfrs");
            return (Criteria) this;
        }

        public Criteria andCstOIfrsGreaterThan(BigDecimal value) {
            addCriterion("CST_O_IFRS >", value, "cstOIfrs");
            return (Criteria) this;
        }

        public Criteria andCstOIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_O_IFRS >=", value, "cstOIfrs");
            return (Criteria) this;
        }

        public Criteria andCstOIfrsLessThan(BigDecimal value) {
            addCriterion("CST_O_IFRS <", value, "cstOIfrs");
            return (Criteria) this;
        }

        public Criteria andCstOIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_O_IFRS <=", value, "cstOIfrs");
            return (Criteria) this;
        }

        public Criteria andCstOIfrsIn(List<BigDecimal> values) {
            addCriterion("CST_O_IFRS in", values, "cstOIfrs");
            return (Criteria) this;
        }

        public Criteria andCstOIfrsNotIn(List<BigDecimal> values) {
            addCriterion("CST_O_IFRS not in", values, "cstOIfrs");
            return (Criteria) this;
        }

        public Criteria andCstOIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_O_IFRS between", value1, value2, "cstOIfrs");
            return (Criteria) this;
        }

        public Criteria andCstOIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_O_IFRS not between", value1, value2, "cstOIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIIfrsIsNull() {
            addCriterion("CST_I_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andCstIIfrsIsNotNull() {
            addCriterion("CST_I_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andCstIIfrsEqualTo(BigDecimal value) {
            addCriterion("CST_I_IFRS =", value, "cstIIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIIfrsNotEqualTo(BigDecimal value) {
            addCriterion("CST_I_IFRS <>", value, "cstIIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIIfrsGreaterThan(BigDecimal value) {
            addCriterion("CST_I_IFRS >", value, "cstIIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_I_IFRS >=", value, "cstIIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIIfrsLessThan(BigDecimal value) {
            addCriterion("CST_I_IFRS <", value, "cstIIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_I_IFRS <=", value, "cstIIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIIfrsIn(List<BigDecimal> values) {
            addCriterion("CST_I_IFRS in", values, "cstIIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIIfrsNotIn(List<BigDecimal> values) {
            addCriterion("CST_I_IFRS not in", values, "cstIIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_I_IFRS between", value1, value2, "cstIIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_I_IFRS not between", value1, value2, "cstIIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsIsNull() {
            addCriterion("CST_STD_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsIsNotNull() {
            addCriterion("CST_STD_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsEqualTo(BigDecimal value) {
            addCriterion("CST_STD_IFRS =", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsNotEqualTo(BigDecimal value) {
            addCriterion("CST_STD_IFRS <>", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsGreaterThan(BigDecimal value) {
            addCriterion("CST_STD_IFRS >", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD_IFRS >=", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsLessThan(BigDecimal value) {
            addCriterion("CST_STD_IFRS <", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD_IFRS <=", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsIn(List<BigDecimal> values) {
            addCriterion("CST_STD_IFRS in", values, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsNotIn(List<BigDecimal> values) {
            addCriterion("CST_STD_IFRS not in", values, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD_IFRS between", value1, value2, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD_IFRS not between", value1, value2, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsIsNull() {
            addCriterion("UP_MAIN_I_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsIsNotNull() {
            addCriterion("UP_MAIN_I_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I_IFRS =", value, "upMainIIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I_IFRS <>", value, "upMainIIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN_I_IFRS >", value, "upMainIIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I_IFRS >=", value, "upMainIIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsLessThan(BigDecimal value) {
            addCriterion("UP_MAIN_I_IFRS <", value, "upMainIIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I_IFRS <=", value, "upMainIIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_I_IFRS in", values, "upMainIIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_I_IFRS not in", values, "upMainIIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_I_IFRS between", value1, value2, "upMainIIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_I_IFRS not between", value1, value2, "upMainIIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsIsNull() {
            addCriterion("UP_MAIN_O_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsIsNotNull() {
            addCriterion("UP_MAIN_O_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O_IFRS =", value, "upMainOIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O_IFRS <>", value, "upMainOIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN_O_IFRS >", value, "upMainOIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O_IFRS >=", value, "upMainOIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsLessThan(BigDecimal value) {
            addCriterion("UP_MAIN_O_IFRS <", value, "upMainOIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O_IFRS <=", value, "upMainOIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_O_IFRS in", values, "upMainOIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_O_IFRS not in", values, "upMainOIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_O_IFRS between", value1, value2, "upMainOIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_O_IFRS not between", value1, value2, "upMainOIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsIsNull() {
            addCriterion("UP_STD_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsIsNotNull() {
            addCriterion("UP_STD_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsEqualTo(BigDecimal value) {
            addCriterion("UP_STD_IFRS =", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsNotEqualTo(BigDecimal value) {
            addCriterion("UP_STD_IFRS <>", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsGreaterThan(BigDecimal value) {
            addCriterion("UP_STD_IFRS >", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_STD_IFRS >=", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsLessThan(BigDecimal value) {
            addCriterion("UP_STD_IFRS <", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_STD_IFRS <=", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsIn(List<BigDecimal> values) {
            addCriterion("UP_STD_IFRS in", values, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsNotIn(List<BigDecimal> values) {
            addCriterion("UP_STD_IFRS not in", values, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_STD_IFRS between", value1, value2, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_STD_IFRS not between", value1, value2, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsIsNull() {
            addCriterion("AMTN_NET_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsIsNotNull() {
            addCriterion("AMTN_NET_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS =", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS <>", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS >", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS >=", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS <", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS <=", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_IFRS in", values, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_IFRS not in", values, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_IFRS between", value1, value2, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_IFRS not between", value1, value2, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsIsNull() {
            addCriterion("CST_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andCstIfrsIsNotNull() {
            addCriterion("CST_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andCstIfrsEqualTo(BigDecimal value) {
            addCriterion("CST_IFRS =", value, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsNotEqualTo(BigDecimal value) {
            addCriterion("CST_IFRS <>", value, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsGreaterThan(BigDecimal value) {
            addCriterion("CST_IFRS >", value, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_IFRS >=", value, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsLessThan(BigDecimal value) {
            addCriterion("CST_IFRS <", value, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_IFRS <=", value, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsIn(List<BigDecimal> values) {
            addCriterion("CST_IFRS in", values, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsNotIn(List<BigDecimal> values) {
            addCriterion("CST_IFRS not in", values, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_IFRS between", value1, value2, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_IFRS not between", value1, value2, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkIsNull() {
            addCriterion("SUP_PRD_MARK is null");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkIsNotNull() {
            addCriterion("SUP_PRD_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkEqualTo(String value) {
            addCriterion("SUP_PRD_MARK =", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkNotEqualTo(String value) {
            addCriterion("SUP_PRD_MARK <>", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkGreaterThan(String value) {
            addCriterion("SUP_PRD_MARK >", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_MARK >=", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkLessThan(String value) {
            addCriterion("SUP_PRD_MARK <", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkLessThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_MARK <=", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkLike(String value) {
            addCriterion("SUP_PRD_MARK like", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkNotLike(String value) {
            addCriterion("SUP_PRD_MARK not like", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkIn(List<String> values) {
            addCriterion("SUP_PRD_MARK in", values, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkNotIn(List<String> values) {
            addCriterion("SUP_PRD_MARK not in", values, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkBetween(String value1, String value2) {
            addCriterion("SUP_PRD_MARK between", value1, value2, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkNotBetween(String value1, String value2) {
            addCriterion("SUP_PRD_MARK not between", value1, value2, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andFreeIdIsNull() {
            addCriterion("FREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFreeIdIsNotNull() {
            addCriterion("FREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFreeIdEqualTo(String value) {
            addCriterion("FREE_ID =", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotEqualTo(String value) {
            addCriterion("FREE_ID <>", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdGreaterThan(String value) {
            addCriterion("FREE_ID >", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FREE_ID >=", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdLessThan(String value) {
            addCriterion("FREE_ID <", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdLessThanOrEqualTo(String value) {
            addCriterion("FREE_ID <=", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdLike(String value) {
            addCriterion("FREE_ID like", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotLike(String value) {
            addCriterion("FREE_ID not like", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdIn(List<String> values) {
            addCriterion("FREE_ID in", values, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotIn(List<String> values) {
            addCriterion("FREE_ID not in", values, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdBetween(String value1, String value2) {
            addCriterion("FREE_ID between", value1, value2, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotBetween(String value1, String value2) {
            addCriterion("FREE_ID not between", value1, value2, "freeId");
            return (Criteria) this;
        }

        public Criteria andDefNoIsNull() {
            addCriterion("DEF_NO is null");
            return (Criteria) this;
        }

        public Criteria andDefNoIsNotNull() {
            addCriterion("DEF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDefNoEqualTo(String value) {
            addCriterion("DEF_NO =", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoNotEqualTo(String value) {
            addCriterion("DEF_NO <>", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoGreaterThan(String value) {
            addCriterion("DEF_NO >", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_NO >=", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoLessThan(String value) {
            addCriterion("DEF_NO <", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoLessThanOrEqualTo(String value) {
            addCriterion("DEF_NO <=", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoLike(String value) {
            addCriterion("DEF_NO like", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoNotLike(String value) {
            addCriterion("DEF_NO not like", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoIn(List<String> values) {
            addCriterion("DEF_NO in", values, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoNotIn(List<String> values) {
            addCriterion("DEF_NO not in", values, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoBetween(String value1, String value2) {
            addCriterion("DEF_NO between", value1, value2, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoNotBetween(String value1, String value2) {
            addCriterion("DEF_NO not between", value1, value2, "defNo");
            return (Criteria) this;
        }

        public Criteria andFixCst1IsNull() {
            addCriterion("FIX_CST1 is null");
            return (Criteria) this;
        }

        public Criteria andFixCst1IsNotNull() {
            addCriterion("FIX_CST1 is not null");
            return (Criteria) this;
        }

        public Criteria andFixCst1EqualTo(String value) {
            addCriterion("FIX_CST1 =", value, "fixCst1");
            return (Criteria) this;
        }

        public Criteria andFixCst1NotEqualTo(String value) {
            addCriterion("FIX_CST1 <>", value, "fixCst1");
            return (Criteria) this;
        }

        public Criteria andFixCst1GreaterThan(String value) {
            addCriterion("FIX_CST1 >", value, "fixCst1");
            return (Criteria) this;
        }

        public Criteria andFixCst1GreaterThanOrEqualTo(String value) {
            addCriterion("FIX_CST1 >=", value, "fixCst1");
            return (Criteria) this;
        }

        public Criteria andFixCst1LessThan(String value) {
            addCriterion("FIX_CST1 <", value, "fixCst1");
            return (Criteria) this;
        }

        public Criteria andFixCst1LessThanOrEqualTo(String value) {
            addCriterion("FIX_CST1 <=", value, "fixCst1");
            return (Criteria) this;
        }

        public Criteria andFixCst1Like(String value) {
            addCriterion("FIX_CST1 like", value, "fixCst1");
            return (Criteria) this;
        }

        public Criteria andFixCst1NotLike(String value) {
            addCriterion("FIX_CST1 not like", value, "fixCst1");
            return (Criteria) this;
        }

        public Criteria andFixCst1In(List<String> values) {
            addCriterion("FIX_CST1 in", values, "fixCst1");
            return (Criteria) this;
        }

        public Criteria andFixCst1NotIn(List<String> values) {
            addCriterion("FIX_CST1 not in", values, "fixCst1");
            return (Criteria) this;
        }

        public Criteria andFixCst1Between(String value1, String value2) {
            addCriterion("FIX_CST1 between", value1, value2, "fixCst1");
            return (Criteria) this;
        }

        public Criteria andFixCst1NotBetween(String value1, String value2) {
            addCriterion("FIX_CST1 not between", value1, value2, "fixCst1");
            return (Criteria) this;
        }

        public Criteria andUpSoIsNull() {
            addCriterion("UP_SO is null");
            return (Criteria) this;
        }

        public Criteria andUpSoIsNotNull() {
            addCriterion("UP_SO is not null");
            return (Criteria) this;
        }

        public Criteria andUpSoEqualTo(BigDecimal value) {
            addCriterion("UP_SO =", value, "upSo");
            return (Criteria) this;
        }

        public Criteria andUpSoNotEqualTo(BigDecimal value) {
            addCriterion("UP_SO <>", value, "upSo");
            return (Criteria) this;
        }

        public Criteria andUpSoGreaterThan(BigDecimal value) {
            addCriterion("UP_SO >", value, "upSo");
            return (Criteria) this;
        }

        public Criteria andUpSoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_SO >=", value, "upSo");
            return (Criteria) this;
        }

        public Criteria andUpSoLessThan(BigDecimal value) {
            addCriterion("UP_SO <", value, "upSo");
            return (Criteria) this;
        }

        public Criteria andUpSoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_SO <=", value, "upSo");
            return (Criteria) this;
        }

        public Criteria andUpSoIn(List<BigDecimal> values) {
            addCriterion("UP_SO in", values, "upSo");
            return (Criteria) this;
        }

        public Criteria andUpSoNotIn(List<BigDecimal> values) {
            addCriterion("UP_SO not in", values, "upSo");
            return (Criteria) this;
        }

        public Criteria andUpSoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_SO between", value1, value2, "upSo");
            return (Criteria) this;
        }

        public Criteria andUpSoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_SO not between", value1, value2, "upSo");
            return (Criteria) this;
        }

        public Criteria andAmtSoIsNull() {
            addCriterion("AMT_SO is null");
            return (Criteria) this;
        }

        public Criteria andAmtSoIsNotNull() {
            addCriterion("AMT_SO is not null");
            return (Criteria) this;
        }

        public Criteria andAmtSoEqualTo(BigDecimal value) {
            addCriterion("AMT_SO =", value, "amtSo");
            return (Criteria) this;
        }

        public Criteria andAmtSoNotEqualTo(BigDecimal value) {
            addCriterion("AMT_SO <>", value, "amtSo");
            return (Criteria) this;
        }

        public Criteria andAmtSoGreaterThan(BigDecimal value) {
            addCriterion("AMT_SO >", value, "amtSo");
            return (Criteria) this;
        }

        public Criteria andAmtSoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_SO >=", value, "amtSo");
            return (Criteria) this;
        }

        public Criteria andAmtSoLessThan(BigDecimal value) {
            addCriterion("AMT_SO <", value, "amtSo");
            return (Criteria) this;
        }

        public Criteria andAmtSoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_SO <=", value, "amtSo");
            return (Criteria) this;
        }

        public Criteria andAmtSoIn(List<BigDecimal> values) {
            addCriterion("AMT_SO in", values, "amtSo");
            return (Criteria) this;
        }

        public Criteria andAmtSoNotIn(List<BigDecimal> values) {
            addCriterion("AMT_SO not in", values, "amtSo");
            return (Criteria) this;
        }

        public Criteria andAmtSoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_SO between", value1, value2, "amtSo");
            return (Criteria) this;
        }

        public Criteria andAmtSoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_SO not between", value1, value2, "amtSo");
            return (Criteria) this;
        }

        public Criteria andQty1FpIsNull() {
            addCriterion("QTY1_FP is null");
            return (Criteria) this;
        }

        public Criteria andQty1FpIsNotNull() {
            addCriterion("QTY1_FP is not null");
            return (Criteria) this;
        }

        public Criteria andQty1FpEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP =", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP <>", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpGreaterThan(BigDecimal value) {
            addCriterion("QTY1_FP >", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP >=", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpLessThan(BigDecimal value) {
            addCriterion("QTY1_FP <", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP <=", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpIn(List<BigDecimal> values) {
            addCriterion("QTY1_FP in", values, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_FP not in", values, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_FP between", value1, value2, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_FP not between", value1, value2, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1Fp2IsNull() {
            addCriterion("QTY1_FP2 is null");
            return (Criteria) this;
        }

        public Criteria andQty1Fp2IsNotNull() {
            addCriterion("QTY1_FP2 is not null");
            return (Criteria) this;
        }

        public Criteria andQty1Fp2EqualTo(BigDecimal value) {
            addCriterion("QTY1_FP2 =", value, "qty1Fp2");
            return (Criteria) this;
        }

        public Criteria andQty1Fp2NotEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP2 <>", value, "qty1Fp2");
            return (Criteria) this;
        }

        public Criteria andQty1Fp2GreaterThan(BigDecimal value) {
            addCriterion("QTY1_FP2 >", value, "qty1Fp2");
            return (Criteria) this;
        }

        public Criteria andQty1Fp2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP2 >=", value, "qty1Fp2");
            return (Criteria) this;
        }

        public Criteria andQty1Fp2LessThan(BigDecimal value) {
            addCriterion("QTY1_FP2 <", value, "qty1Fp2");
            return (Criteria) this;
        }

        public Criteria andQty1Fp2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP2 <=", value, "qty1Fp2");
            return (Criteria) this;
        }

        public Criteria andQty1Fp2In(List<BigDecimal> values) {
            addCriterion("QTY1_FP2 in", values, "qty1Fp2");
            return (Criteria) this;
        }

        public Criteria andQty1Fp2NotIn(List<BigDecimal> values) {
            addCriterion("QTY1_FP2 not in", values, "qty1Fp2");
            return (Criteria) this;
        }

        public Criteria andQty1Fp2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_FP2 between", value1, value2, "qty1Fp2");
            return (Criteria) this;
        }

        public Criteria andQty1Fp2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_FP2 not between", value1, value2, "qty1Fp2");
            return (Criteria) this;
        }

        public Criteria andBzKndIsNull() {
            addCriterion("BZ_KND is null");
            return (Criteria) this;
        }

        public Criteria andBzKndIsNotNull() {
            addCriterion("BZ_KND is not null");
            return (Criteria) this;
        }

        public Criteria andBzKndEqualTo(String value) {
            addCriterion("BZ_KND =", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndNotEqualTo(String value) {
            addCriterion("BZ_KND <>", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndGreaterThan(String value) {
            addCriterion("BZ_KND >", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndGreaterThanOrEqualTo(String value) {
            addCriterion("BZ_KND >=", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndLessThan(String value) {
            addCriterion("BZ_KND <", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndLessThanOrEqualTo(String value) {
            addCriterion("BZ_KND <=", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndLike(String value) {
            addCriterion("BZ_KND like", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndNotLike(String value) {
            addCriterion("BZ_KND not like", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndIn(List<String> values) {
            addCriterion("BZ_KND in", values, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndNotIn(List<String> values) {
            addCriterion("BZ_KND not in", values, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndBetween(String value1, String value2) {
            addCriterion("BZ_KND between", value1, value2, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndNotBetween(String value1, String value2) {
            addCriterion("BZ_KND not between", value1, value2, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andUpQty1SoIsNull() {
            addCriterion("UP_QTY1_SO is null");
            return (Criteria) this;
        }

        public Criteria andUpQty1SoIsNotNull() {
            addCriterion("UP_QTY1_SO is not null");
            return (Criteria) this;
        }

        public Criteria andUpQty1SoEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1_SO =", value, "upQty1So");
            return (Criteria) this;
        }

        public Criteria andUpQty1SoNotEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1_SO <>", value, "upQty1So");
            return (Criteria) this;
        }

        public Criteria andUpQty1SoGreaterThan(BigDecimal value) {
            addCriterion("UP_QTY1_SO >", value, "upQty1So");
            return (Criteria) this;
        }

        public Criteria andUpQty1SoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1_SO >=", value, "upQty1So");
            return (Criteria) this;
        }

        public Criteria andUpQty1SoLessThan(BigDecimal value) {
            addCriterion("UP_QTY1_SO <", value, "upQty1So");
            return (Criteria) this;
        }

        public Criteria andUpQty1SoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1_SO <=", value, "upQty1So");
            return (Criteria) this;
        }

        public Criteria andUpQty1SoIn(List<BigDecimal> values) {
            addCriterion("UP_QTY1_SO in", values, "upQty1So");
            return (Criteria) this;
        }

        public Criteria andUpQty1SoNotIn(List<BigDecimal> values) {
            addCriterion("UP_QTY1_SO not in", values, "upQty1So");
            return (Criteria) this;
        }

        public Criteria andUpQty1SoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_QTY1_SO between", value1, value2, "upQty1So");
            return (Criteria) this;
        }

        public Criteria andUpQty1SoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_QTY1_SO not between", value1, value2, "upQty1So");
            return (Criteria) this;
        }

        public Criteria andUpMainOBxIsNull() {
            addCriterion("UP_MAIN_O_BX is null");
            return (Criteria) this;
        }

        public Criteria andUpMainOBxIsNotNull() {
            addCriterion("UP_MAIN_O_BX is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainOBxEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O_BX =", value, "upMainOBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOBxNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O_BX <>", value, "upMainOBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOBxGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN_O_BX >", value, "upMainOBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O_BX >=", value, "upMainOBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOBxLessThan(BigDecimal value) {
            addCriterion("UP_MAIN_O_BX <", value, "upMainOBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O_BX <=", value, "upMainOBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOBxIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_O_BX in", values, "upMainOBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOBxNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_O_BX not in", values, "upMainOBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_O_BX between", value1, value2, "upMainOBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_O_BX not between", value1, value2, "upMainOBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIBxIsNull() {
            addCriterion("UP_MAIN_I_BX is null");
            return (Criteria) this;
        }

        public Criteria andUpMainIBxIsNotNull() {
            addCriterion("UP_MAIN_I_BX is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainIBxEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I_BX =", value, "upMainIBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIBxNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I_BX <>", value, "upMainIBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIBxGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN_I_BX >", value, "upMainIBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I_BX >=", value, "upMainIBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIBxLessThan(BigDecimal value) {
            addCriterion("UP_MAIN_I_BX <", value, "upMainIBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I_BX <=", value, "upMainIBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIBxIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_I_BX in", values, "upMainIBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIBxNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_I_BX not in", values, "upMainIBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_I_BX between", value1, value2, "upMainIBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_I_BX not between", value1, value2, "upMainIBx");
            return (Criteria) this;
        }

        public Criteria andCstBxIsNull() {
            addCriterion("CST_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstBxIsNotNull() {
            addCriterion("CST_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstBxEqualTo(BigDecimal value) {
            addCriterion("CST_BX =", value, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_BX <>", value, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxGreaterThan(BigDecimal value) {
            addCriterion("CST_BX >", value, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_BX >=", value, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxLessThan(BigDecimal value) {
            addCriterion("CST_BX <", value, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_BX <=", value, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxIn(List<BigDecimal> values) {
            addCriterion("CST_BX in", values, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_BX not in", values, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_BX between", value1, value2, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_BX not between", value1, value2, "cstBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBxIsNull() {
            addCriterion("AMTN_NET_BX is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBxIsNotNull() {
            addCriterion("AMTN_NET_BX is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBxEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_BX =", value, "amtnNetBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBxNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_BX <>", value, "amtnNetBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBxGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_BX >", value, "amtnNetBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_BX >=", value, "amtnNetBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBxLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_BX <", value, "amtnNetBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_BX <=", value, "amtnNetBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBxIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_BX in", values, "amtnNetBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBxNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_BX not in", values, "amtnNetBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_BX between", value1, value2, "amtnNetBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_BX not between", value1, value2, "amtnNetBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOBxIsNull() {
            addCriterion("CST_ML_O_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstMlOBxIsNotNull() {
            addCriterion("CST_ML_O_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstMlOBxEqualTo(BigDecimal value) {
            addCriterion("CST_ML_O_BX =", value, "cstMlOBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_ML_O_BX <>", value, "cstMlOBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOBxGreaterThan(BigDecimal value) {
            addCriterion("CST_ML_O_BX >", value, "cstMlOBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ML_O_BX >=", value, "cstMlOBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOBxLessThan(BigDecimal value) {
            addCriterion("CST_ML_O_BX <", value, "cstMlOBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ML_O_BX <=", value, "cstMlOBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOBxIn(List<BigDecimal> values) {
            addCriterion("CST_ML_O_BX in", values, "cstMlOBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_ML_O_BX not in", values, "cstMlOBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ML_O_BX between", value1, value2, "cstMlOBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ML_O_BX not between", value1, value2, "cstMlOBx");
            return (Criteria) this;
        }

        public Criteria andCstManOBxIsNull() {
            addCriterion("CST_MAN_O_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstManOBxIsNotNull() {
            addCriterion("CST_MAN_O_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstManOBxEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_O_BX =", value, "cstManOBx");
            return (Criteria) this;
        }

        public Criteria andCstManOBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_O_BX <>", value, "cstManOBx");
            return (Criteria) this;
        }

        public Criteria andCstManOBxGreaterThan(BigDecimal value) {
            addCriterion("CST_MAN_O_BX >", value, "cstManOBx");
            return (Criteria) this;
        }

        public Criteria andCstManOBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_O_BX >=", value, "cstManOBx");
            return (Criteria) this;
        }

        public Criteria andCstManOBxLessThan(BigDecimal value) {
            addCriterion("CST_MAN_O_BX <", value, "cstManOBx");
            return (Criteria) this;
        }

        public Criteria andCstManOBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_O_BX <=", value, "cstManOBx");
            return (Criteria) this;
        }

        public Criteria andCstManOBxIn(List<BigDecimal> values) {
            addCriterion("CST_MAN_O_BX in", values, "cstManOBx");
            return (Criteria) this;
        }

        public Criteria andCstManOBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_MAN_O_BX not in", values, "cstManOBx");
            return (Criteria) this;
        }

        public Criteria andCstManOBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAN_O_BX between", value1, value2, "cstManOBx");
            return (Criteria) this;
        }

        public Criteria andCstManOBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAN_O_BX not between", value1, value2, "cstManOBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOBxIsNull() {
            addCriterion("CST_MAK_O_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstMakOBxIsNotNull() {
            addCriterion("CST_MAK_O_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstMakOBxEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_O_BX =", value, "cstMakOBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_O_BX <>", value, "cstMakOBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOBxGreaterThan(BigDecimal value) {
            addCriterion("CST_MAK_O_BX >", value, "cstMakOBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_O_BX >=", value, "cstMakOBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOBxLessThan(BigDecimal value) {
            addCriterion("CST_MAK_O_BX <", value, "cstMakOBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_O_BX <=", value, "cstMakOBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOBxIn(List<BigDecimal> values) {
            addCriterion("CST_MAK_O_BX in", values, "cstMakOBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_MAK_O_BX not in", values, "cstMakOBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAK_O_BX between", value1, value2, "cstMakOBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAK_O_BX not between", value1, value2, "cstMakOBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOBxIsNull() {
            addCriterion("CST_PRD_O_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstPrdOBxIsNotNull() {
            addCriterion("CST_PRD_O_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstPrdOBxEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_O_BX =", value, "cstPrdOBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_O_BX <>", value, "cstPrdOBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOBxGreaterThan(BigDecimal value) {
            addCriterion("CST_PRD_O_BX >", value, "cstPrdOBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_O_BX >=", value, "cstPrdOBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOBxLessThan(BigDecimal value) {
            addCriterion("CST_PRD_O_BX <", value, "cstPrdOBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_O_BX <=", value, "cstPrdOBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOBxIn(List<BigDecimal> values) {
            addCriterion("CST_PRD_O_BX in", values, "cstPrdOBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_PRD_O_BX not in", values, "cstPrdOBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_PRD_O_BX between", value1, value2, "cstPrdOBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_PRD_O_BX not between", value1, value2, "cstPrdOBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOBxIsNull() {
            addCriterion("CST_OUT_O_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstOutOBxIsNotNull() {
            addCriterion("CST_OUT_O_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstOutOBxEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_O_BX =", value, "cstOutOBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_O_BX <>", value, "cstOutOBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOBxGreaterThan(BigDecimal value) {
            addCriterion("CST_OUT_O_BX >", value, "cstOutOBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_O_BX >=", value, "cstOutOBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOBxLessThan(BigDecimal value) {
            addCriterion("CST_OUT_O_BX <", value, "cstOutOBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_O_BX <=", value, "cstOutOBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOBxIn(List<BigDecimal> values) {
            addCriterion("CST_OUT_O_BX in", values, "cstOutOBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_OUT_O_BX not in", values, "cstOutOBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT_O_BX between", value1, value2, "cstOutOBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT_O_BX not between", value1, value2, "cstOutOBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIBxIsNull() {
            addCriterion("CST_ML_I_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstMlIBxIsNotNull() {
            addCriterion("CST_ML_I_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstMlIBxEqualTo(BigDecimal value) {
            addCriterion("CST_ML_I_BX =", value, "cstMlIBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_ML_I_BX <>", value, "cstMlIBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIBxGreaterThan(BigDecimal value) {
            addCriterion("CST_ML_I_BX >", value, "cstMlIBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ML_I_BX >=", value, "cstMlIBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIBxLessThan(BigDecimal value) {
            addCriterion("CST_ML_I_BX <", value, "cstMlIBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ML_I_BX <=", value, "cstMlIBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIBxIn(List<BigDecimal> values) {
            addCriterion("CST_ML_I_BX in", values, "cstMlIBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_ML_I_BX not in", values, "cstMlIBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ML_I_BX between", value1, value2, "cstMlIBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ML_I_BX not between", value1, value2, "cstMlIBx");
            return (Criteria) this;
        }

        public Criteria andCstManIBxIsNull() {
            addCriterion("CST_MAN_I_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstManIBxIsNotNull() {
            addCriterion("CST_MAN_I_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstManIBxEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_I_BX =", value, "cstManIBx");
            return (Criteria) this;
        }

        public Criteria andCstManIBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_I_BX <>", value, "cstManIBx");
            return (Criteria) this;
        }

        public Criteria andCstManIBxGreaterThan(BigDecimal value) {
            addCriterion("CST_MAN_I_BX >", value, "cstManIBx");
            return (Criteria) this;
        }

        public Criteria andCstManIBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_I_BX >=", value, "cstManIBx");
            return (Criteria) this;
        }

        public Criteria andCstManIBxLessThan(BigDecimal value) {
            addCriterion("CST_MAN_I_BX <", value, "cstManIBx");
            return (Criteria) this;
        }

        public Criteria andCstManIBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_I_BX <=", value, "cstManIBx");
            return (Criteria) this;
        }

        public Criteria andCstManIBxIn(List<BigDecimal> values) {
            addCriterion("CST_MAN_I_BX in", values, "cstManIBx");
            return (Criteria) this;
        }

        public Criteria andCstManIBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_MAN_I_BX not in", values, "cstManIBx");
            return (Criteria) this;
        }

        public Criteria andCstManIBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAN_I_BX between", value1, value2, "cstManIBx");
            return (Criteria) this;
        }

        public Criteria andCstManIBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAN_I_BX not between", value1, value2, "cstManIBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIBxIsNull() {
            addCriterion("CST_MAK_I_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstMakIBxIsNotNull() {
            addCriterion("CST_MAK_I_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstMakIBxEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_I_BX =", value, "cstMakIBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_I_BX <>", value, "cstMakIBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIBxGreaterThan(BigDecimal value) {
            addCriterion("CST_MAK_I_BX >", value, "cstMakIBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_I_BX >=", value, "cstMakIBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIBxLessThan(BigDecimal value) {
            addCriterion("CST_MAK_I_BX <", value, "cstMakIBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_I_BX <=", value, "cstMakIBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIBxIn(List<BigDecimal> values) {
            addCriterion("CST_MAK_I_BX in", values, "cstMakIBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_MAK_I_BX not in", values, "cstMakIBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAK_I_BX between", value1, value2, "cstMakIBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAK_I_BX not between", value1, value2, "cstMakIBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIBxIsNull() {
            addCriterion("CST_PRD_I_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstPrdIBxIsNotNull() {
            addCriterion("CST_PRD_I_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstPrdIBxEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_I_BX =", value, "cstPrdIBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_I_BX <>", value, "cstPrdIBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIBxGreaterThan(BigDecimal value) {
            addCriterion("CST_PRD_I_BX >", value, "cstPrdIBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_I_BX >=", value, "cstPrdIBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIBxLessThan(BigDecimal value) {
            addCriterion("CST_PRD_I_BX <", value, "cstPrdIBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_I_BX <=", value, "cstPrdIBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIBxIn(List<BigDecimal> values) {
            addCriterion("CST_PRD_I_BX in", values, "cstPrdIBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_PRD_I_BX not in", values, "cstPrdIBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_PRD_I_BX between", value1, value2, "cstPrdIBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_PRD_I_BX not between", value1, value2, "cstPrdIBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIBxIsNull() {
            addCriterion("CST_OUT_I_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstOutIBxIsNotNull() {
            addCriterion("CST_OUT_I_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstOutIBxEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_I_BX =", value, "cstOutIBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_I_BX <>", value, "cstOutIBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIBxGreaterThan(BigDecimal value) {
            addCriterion("CST_OUT_I_BX >", value, "cstOutIBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_I_BX >=", value, "cstOutIBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIBxLessThan(BigDecimal value) {
            addCriterion("CST_OUT_I_BX <", value, "cstOutIBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_I_BX <=", value, "cstOutIBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIBxIn(List<BigDecimal> values) {
            addCriterion("CST_OUT_I_BX in", values, "cstOutIBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_OUT_I_BX not in", values, "cstOutIBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT_I_BX between", value1, value2, "cstOutIBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT_I_BX not between", value1, value2, "cstOutIBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBxIsNull() {
            addCriterion("UP_MAIN_O_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBxIsNotNull() {
            addCriterion("UP_MAIN_O_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBxEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O_IFRS_BX =", value, "upMainOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O_IFRS_BX <>", value, "upMainOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN_O_IFRS_BX >", value, "upMainOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O_IFRS_BX >=", value, "upMainOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBxLessThan(BigDecimal value) {
            addCriterion("UP_MAIN_O_IFRS_BX <", value, "upMainOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_O_IFRS_BX <=", value, "upMainOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBxIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_O_IFRS_BX in", values, "upMainOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_O_IFRS_BX not in", values, "upMainOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_O_IFRS_BX between", value1, value2, "upMainOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainOIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_O_IFRS_BX not between", value1, value2, "upMainOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBxIsNull() {
            addCriterion("UP_MAIN_I_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBxIsNotNull() {
            addCriterion("UP_MAIN_I_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBxEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I_IFRS_BX =", value, "upMainIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I_IFRS_BX <>", value, "upMainIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN_I_IFRS_BX >", value, "upMainIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I_IFRS_BX >=", value, "upMainIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBxLessThan(BigDecimal value) {
            addCriterion("UP_MAIN_I_IFRS_BX <", value, "upMainIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_I_IFRS_BX <=", value, "upMainIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBxIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_I_IFRS_BX in", values, "upMainIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_I_IFRS_BX not in", values, "upMainIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_I_IFRS_BX between", value1, value2, "upMainIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_I_IFRS_BX not between", value1, value2, "upMainIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBxIsNull() {
            addCriterion("CST_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBxIsNotNull() {
            addCriterion("CST_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_IFRS_BX =", value, "cstIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_IFRS_BX <>", value, "cstIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_IFRS_BX >", value, "cstIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_IFRS_BX >=", value, "cstIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_IFRS_BX <", value, "cstIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_IFRS_BX <=", value, "cstIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_IFRS_BX in", values, "cstIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_IFRS_BX not in", values, "cstIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_IFRS_BX between", value1, value2, "cstIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_IFRS_BX not between", value1, value2, "cstIfrsBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBxIsNull() {
            addCriterion("AMTN_NET_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBxIsNotNull() {
            addCriterion("AMTN_NET_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBxEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS_BX =", value, "amtnNetIfrsBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS_BX <>", value, "amtnNetIfrsBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS_BX >", value, "amtnNetIfrsBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS_BX >=", value, "amtnNetIfrsBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBxLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS_BX <", value, "amtnNetIfrsBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS_BX <=", value, "amtnNetIfrsBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBxIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_IFRS_BX in", values, "amtnNetIfrsBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_IFRS_BX not in", values, "amtnNetIfrsBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_IFRS_BX between", value1, value2, "amtnNetIfrsBx");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_IFRS_BX not between", value1, value2, "amtnNetIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOIfrsBxIsNull() {
            addCriterion("CST_ML_O_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstMlOIfrsBxIsNotNull() {
            addCriterion("CST_ML_O_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstMlOIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_ML_O_IFRS_BX =", value, "cstMlOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_ML_O_IFRS_BX <>", value, "cstMlOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_ML_O_IFRS_BX >", value, "cstMlOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ML_O_IFRS_BX >=", value, "cstMlOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_ML_O_IFRS_BX <", value, "cstMlOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ML_O_IFRS_BX <=", value, "cstMlOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_ML_O_IFRS_BX in", values, "cstMlOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_ML_O_IFRS_BX not in", values, "cstMlOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ML_O_IFRS_BX between", value1, value2, "cstMlOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlOIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ML_O_IFRS_BX not between", value1, value2, "cstMlOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManOIfrsBxIsNull() {
            addCriterion("CST_MAN_O_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstManOIfrsBxIsNotNull() {
            addCriterion("CST_MAN_O_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstManOIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_O_IFRS_BX =", value, "cstManOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManOIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_O_IFRS_BX <>", value, "cstManOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManOIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_MAN_O_IFRS_BX >", value, "cstManOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManOIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_O_IFRS_BX >=", value, "cstManOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManOIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_MAN_O_IFRS_BX <", value, "cstManOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManOIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_O_IFRS_BX <=", value, "cstManOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManOIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_MAN_O_IFRS_BX in", values, "cstManOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManOIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_MAN_O_IFRS_BX not in", values, "cstManOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManOIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAN_O_IFRS_BX between", value1, value2, "cstManOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManOIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAN_O_IFRS_BX not between", value1, value2, "cstManOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOIfrsBxIsNull() {
            addCriterion("CST_MAK_O_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstMakOIfrsBxIsNotNull() {
            addCriterion("CST_MAK_O_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstMakOIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_O_IFRS_BX =", value, "cstMakOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_O_IFRS_BX <>", value, "cstMakOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_MAK_O_IFRS_BX >", value, "cstMakOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_O_IFRS_BX >=", value, "cstMakOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_MAK_O_IFRS_BX <", value, "cstMakOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_O_IFRS_BX <=", value, "cstMakOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_MAK_O_IFRS_BX in", values, "cstMakOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_MAK_O_IFRS_BX not in", values, "cstMakOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAK_O_IFRS_BX between", value1, value2, "cstMakOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakOIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAK_O_IFRS_BX not between", value1, value2, "cstMakOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOIfrsBxIsNull() {
            addCriterion("CST_PRD_O_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstPrdOIfrsBxIsNotNull() {
            addCriterion("CST_PRD_O_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstPrdOIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_O_IFRS_BX =", value, "cstPrdOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_O_IFRS_BX <>", value, "cstPrdOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_PRD_O_IFRS_BX >", value, "cstPrdOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_O_IFRS_BX >=", value, "cstPrdOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_PRD_O_IFRS_BX <", value, "cstPrdOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_O_IFRS_BX <=", value, "cstPrdOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_PRD_O_IFRS_BX in", values, "cstPrdOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_PRD_O_IFRS_BX not in", values, "cstPrdOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_PRD_O_IFRS_BX between", value1, value2, "cstPrdOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdOIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_PRD_O_IFRS_BX not between", value1, value2, "cstPrdOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOIfrsBxIsNull() {
            addCriterion("CST_OUT_O_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstOutOIfrsBxIsNotNull() {
            addCriterion("CST_OUT_O_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstOutOIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_O_IFRS_BX =", value, "cstOutOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_O_IFRS_BX <>", value, "cstOutOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_OUT_O_IFRS_BX >", value, "cstOutOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_O_IFRS_BX >=", value, "cstOutOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_OUT_O_IFRS_BX <", value, "cstOutOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_O_IFRS_BX <=", value, "cstOutOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_OUT_O_IFRS_BX in", values, "cstOutOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_OUT_O_IFRS_BX not in", values, "cstOutOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT_O_IFRS_BX between", value1, value2, "cstOutOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutOIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT_O_IFRS_BX not between", value1, value2, "cstOutOIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIIfrsBxIsNull() {
            addCriterion("CST_ML_I_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstMlIIfrsBxIsNotNull() {
            addCriterion("CST_ML_I_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstMlIIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_ML_I_IFRS_BX =", value, "cstMlIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_ML_I_IFRS_BX <>", value, "cstMlIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_ML_I_IFRS_BX >", value, "cstMlIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ML_I_IFRS_BX >=", value, "cstMlIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_ML_I_IFRS_BX <", value, "cstMlIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ML_I_IFRS_BX <=", value, "cstMlIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_ML_I_IFRS_BX in", values, "cstMlIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_ML_I_IFRS_BX not in", values, "cstMlIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ML_I_IFRS_BX between", value1, value2, "cstMlIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ML_I_IFRS_BX not between", value1, value2, "cstMlIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIIfrsBxIsNull() {
            addCriterion("CST_MAN_I_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstManIIfrsBxIsNotNull() {
            addCriterion("CST_MAN_I_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstManIIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_I_IFRS_BX =", value, "cstManIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_I_IFRS_BX <>", value, "cstManIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_MAN_I_IFRS_BX >", value, "cstManIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_I_IFRS_BX >=", value, "cstManIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_MAN_I_IFRS_BX <", value, "cstManIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_I_IFRS_BX <=", value, "cstManIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_MAN_I_IFRS_BX in", values, "cstManIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_MAN_I_IFRS_BX not in", values, "cstManIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAN_I_IFRS_BX between", value1, value2, "cstManIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAN_I_IFRS_BX not between", value1, value2, "cstManIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIIfrsBxIsNull() {
            addCriterion("CST_MAK_I_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstMakIIfrsBxIsNotNull() {
            addCriterion("CST_MAK_I_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstMakIIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_I_IFRS_BX =", value, "cstMakIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_I_IFRS_BX <>", value, "cstMakIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_MAK_I_IFRS_BX >", value, "cstMakIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_I_IFRS_BX >=", value, "cstMakIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_MAK_I_IFRS_BX <", value, "cstMakIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_I_IFRS_BX <=", value, "cstMakIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_MAK_I_IFRS_BX in", values, "cstMakIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_MAK_I_IFRS_BX not in", values, "cstMakIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAK_I_IFRS_BX between", value1, value2, "cstMakIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAK_I_IFRS_BX not between", value1, value2, "cstMakIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIIfrsBxIsNull() {
            addCriterion("CST_PRD_I_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstPrdIIfrsBxIsNotNull() {
            addCriterion("CST_PRD_I_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstPrdIIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_I_IFRS_BX =", value, "cstPrdIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_I_IFRS_BX <>", value, "cstPrdIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_PRD_I_IFRS_BX >", value, "cstPrdIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_I_IFRS_BX >=", value, "cstPrdIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_PRD_I_IFRS_BX <", value, "cstPrdIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_I_IFRS_BX <=", value, "cstPrdIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_PRD_I_IFRS_BX in", values, "cstPrdIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_PRD_I_IFRS_BX not in", values, "cstPrdIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_PRD_I_IFRS_BX between", value1, value2, "cstPrdIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_PRD_I_IFRS_BX not between", value1, value2, "cstPrdIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIIfrsBxIsNull() {
            addCriterion("CST_OUT_I_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstOutIIfrsBxIsNotNull() {
            addCriterion("CST_OUT_I_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstOutIIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_I_IFRS_BX =", value, "cstOutIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_I_IFRS_BX <>", value, "cstOutIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_OUT_I_IFRS_BX >", value, "cstOutIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_I_IFRS_BX >=", value, "cstOutIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_OUT_I_IFRS_BX <", value, "cstOutIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_I_IFRS_BX <=", value, "cstOutIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_OUT_I_IFRS_BX in", values, "cstOutIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_OUT_I_IFRS_BX not in", values, "cstOutIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT_I_IFRS_BX between", value1, value2, "cstOutIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT_I_IFRS_BX not between", value1, value2, "cstOutIIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpInIsNull() {
            addCriterion("UP_IN is null");
            return (Criteria) this;
        }

        public Criteria andUpInIsNotNull() {
            addCriterion("UP_IN is not null");
            return (Criteria) this;
        }

        public Criteria andUpInEqualTo(BigDecimal value) {
            addCriterion("UP_IN =", value, "upIn");
            return (Criteria) this;
        }

        public Criteria andUpInNotEqualTo(BigDecimal value) {
            addCriterion("UP_IN <>", value, "upIn");
            return (Criteria) this;
        }

        public Criteria andUpInGreaterThan(BigDecimal value) {
            addCriterion("UP_IN >", value, "upIn");
            return (Criteria) this;
        }

        public Criteria andUpInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_IN >=", value, "upIn");
            return (Criteria) this;
        }

        public Criteria andUpInLessThan(BigDecimal value) {
            addCriterion("UP_IN <", value, "upIn");
            return (Criteria) this;
        }

        public Criteria andUpInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_IN <=", value, "upIn");
            return (Criteria) this;
        }

        public Criteria andUpInIn(List<BigDecimal> values) {
            addCriterion("UP_IN in", values, "upIn");
            return (Criteria) this;
        }

        public Criteria andUpInNotIn(List<BigDecimal> values) {
            addCriterion("UP_IN not in", values, "upIn");
            return (Criteria) this;
        }

        public Criteria andUpInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_IN between", value1, value2, "upIn");
            return (Criteria) this;
        }

        public Criteria andUpInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_IN not between", value1, value2, "upIn");
            return (Criteria) this;
        }

        public Criteria andAmtnNetInIsNull() {
            addCriterion("AMTN_NET_IN is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetInIsNotNull() {
            addCriterion("AMTN_NET_IN is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetInEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IN =", value, "amtnNetIn");
            return (Criteria) this;
        }

        public Criteria andAmtnNetInNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IN <>", value, "amtnNetIn");
            return (Criteria) this;
        }

        public Criteria andAmtnNetInGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_IN >", value, "amtnNetIn");
            return (Criteria) this;
        }

        public Criteria andAmtnNetInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IN >=", value, "amtnNetIn");
            return (Criteria) this;
        }

        public Criteria andAmtnNetInLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_IN <", value, "amtnNetIn");
            return (Criteria) this;
        }

        public Criteria andAmtnNetInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IN <=", value, "amtnNetIn");
            return (Criteria) this;
        }

        public Criteria andAmtnNetInIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_IN in", values, "amtnNetIn");
            return (Criteria) this;
        }

        public Criteria andAmtnNetInNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_IN not in", values, "amtnNetIn");
            return (Criteria) this;
        }

        public Criteria andAmtnNetInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_IN between", value1, value2, "amtnNetIn");
            return (Criteria) this;
        }

        public Criteria andAmtnNetInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_IN not between", value1, value2, "amtnNetIn");
            return (Criteria) this;
        }

        public Criteria andUpCstOutIsNull() {
            addCriterion("UP_CST_OUT is null");
            return (Criteria) this;
        }

        public Criteria andUpCstOutIsNotNull() {
            addCriterion("UP_CST_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andUpCstOutEqualTo(BigDecimal value) {
            addCriterion("UP_CST_OUT =", value, "upCstOut");
            return (Criteria) this;
        }

        public Criteria andUpCstOutNotEqualTo(BigDecimal value) {
            addCriterion("UP_CST_OUT <>", value, "upCstOut");
            return (Criteria) this;
        }

        public Criteria andUpCstOutGreaterThan(BigDecimal value) {
            addCriterion("UP_CST_OUT >", value, "upCstOut");
            return (Criteria) this;
        }

        public Criteria andUpCstOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_CST_OUT >=", value, "upCstOut");
            return (Criteria) this;
        }

        public Criteria andUpCstOutLessThan(BigDecimal value) {
            addCriterion("UP_CST_OUT <", value, "upCstOut");
            return (Criteria) this;
        }

        public Criteria andUpCstOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_CST_OUT <=", value, "upCstOut");
            return (Criteria) this;
        }

        public Criteria andUpCstOutIn(List<BigDecimal> values) {
            addCriterion("UP_CST_OUT in", values, "upCstOut");
            return (Criteria) this;
        }

        public Criteria andUpCstOutNotIn(List<BigDecimal> values) {
            addCriterion("UP_CST_OUT not in", values, "upCstOut");
            return (Criteria) this;
        }

        public Criteria andUpCstOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_CST_OUT between", value1, value2, "upCstOut");
            return (Criteria) this;
        }

        public Criteria andUpCstOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_CST_OUT not between", value1, value2, "upCstOut");
            return (Criteria) this;
        }

        public Criteria andCstOutIsNull() {
            addCriterion("CST_OUT is null");
            return (Criteria) this;
        }

        public Criteria andCstOutIsNotNull() {
            addCriterion("CST_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andCstOutEqualTo(BigDecimal value) {
            addCriterion("CST_OUT =", value, "cstOut");
            return (Criteria) this;
        }

        public Criteria andCstOutNotEqualTo(BigDecimal value) {
            addCriterion("CST_OUT <>", value, "cstOut");
            return (Criteria) this;
        }

        public Criteria andCstOutGreaterThan(BigDecimal value) {
            addCriterion("CST_OUT >", value, "cstOut");
            return (Criteria) this;
        }

        public Criteria andCstOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT >=", value, "cstOut");
            return (Criteria) this;
        }

        public Criteria andCstOutLessThan(BigDecimal value) {
            addCriterion("CST_OUT <", value, "cstOut");
            return (Criteria) this;
        }

        public Criteria andCstOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT <=", value, "cstOut");
            return (Criteria) this;
        }

        public Criteria andCstOutIn(List<BigDecimal> values) {
            addCriterion("CST_OUT in", values, "cstOut");
            return (Criteria) this;
        }

        public Criteria andCstOutNotIn(List<BigDecimal> values) {
            addCriterion("CST_OUT not in", values, "cstOut");
            return (Criteria) this;
        }

        public Criteria andCstOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT between", value1, value2, "cstOut");
            return (Criteria) this;
        }

        public Criteria andCstOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT not between", value1, value2, "cstOut");
            return (Criteria) this;
        }

        public Criteria andMatrixItmIsNull() {
            addCriterion("MATRIX_ITM is null");
            return (Criteria) this;
        }

        public Criteria andMatrixItmIsNotNull() {
            addCriterion("MATRIX_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andMatrixItmEqualTo(Integer value) {
            addCriterion("MATRIX_ITM =", value, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmNotEqualTo(Integer value) {
            addCriterion("MATRIX_ITM <>", value, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmGreaterThan(Integer value) {
            addCriterion("MATRIX_ITM >", value, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("MATRIX_ITM >=", value, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmLessThan(Integer value) {
            addCriterion("MATRIX_ITM <", value, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmLessThanOrEqualTo(Integer value) {
            addCriterion("MATRIX_ITM <=", value, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmIn(List<Integer> values) {
            addCriterion("MATRIX_ITM in", values, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmNotIn(List<Integer> values) {
            addCriterion("MATRIX_ITM not in", values, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmBetween(Integer value1, Integer value2) {
            addCriterion("MATRIX_ITM between", value1, value2, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmNotBetween(Integer value1, Integer value2) {
            addCriterion("MATRIX_ITM not between", value1, value2, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andTaskNoIsNull() {
            addCriterion("TASK_NO is null");
            return (Criteria) this;
        }

        public Criteria andTaskNoIsNotNull() {
            addCriterion("TASK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNoEqualTo(String value) {
            addCriterion("TASK_NO =", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotEqualTo(String value) {
            addCriterion("TASK_NO <>", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoGreaterThan(String value) {
            addCriterion("TASK_NO >", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NO >=", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLessThan(String value) {
            addCriterion("TASK_NO <", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLessThanOrEqualTo(String value) {
            addCriterion("TASK_NO <=", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLike(String value) {
            addCriterion("TASK_NO like", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotLike(String value) {
            addCriterion("TASK_NO not like", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoIn(List<String> values) {
            addCriterion("TASK_NO in", values, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotIn(List<String> values) {
            addCriterion("TASK_NO not in", values, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoBetween(String value1, String value2) {
            addCriterion("TASK_NO between", value1, value2, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotBetween(String value1, String value2) {
            addCriterion("TASK_NO not between", value1, value2, "taskNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoIsNull() {
            addCriterion("PRM_NO is null");
            return (Criteria) this;
        }

        public Criteria andPrmNoIsNotNull() {
            addCriterion("PRM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPrmNoEqualTo(String value) {
            addCriterion("PRM_NO =", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoNotEqualTo(String value) {
            addCriterion("PRM_NO <>", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoGreaterThan(String value) {
            addCriterion("PRM_NO >", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRM_NO >=", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoLessThan(String value) {
            addCriterion("PRM_NO <", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoLessThanOrEqualTo(String value) {
            addCriterion("PRM_NO <=", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoLike(String value) {
            addCriterion("PRM_NO like", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoNotLike(String value) {
            addCriterion("PRM_NO not like", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoIn(List<String> values) {
            addCriterion("PRM_NO in", values, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoNotIn(List<String> values) {
            addCriterion("PRM_NO not in", values, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoBetween(String value1, String value2) {
            addCriterion("PRM_NO between", value1, value2, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoNotBetween(String value1, String value2) {
            addCriterion("PRM_NO not between", value1, value2, "prmNo");
            return (Criteria) this;
        }

        public Criteria andScDdIsNull() {
            addCriterion("SC_DD is null");
            return (Criteria) this;
        }

        public Criteria andScDdIsNotNull() {
            addCriterion("SC_DD is not null");
            return (Criteria) this;
        }

        public Criteria andScDdEqualTo(Date value) {
            addCriterion("SC_DD =", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdNotEqualTo(Date value) {
            addCriterion("SC_DD <>", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdGreaterThan(Date value) {
            addCriterion("SC_DD >", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdGreaterThanOrEqualTo(Date value) {
            addCriterion("SC_DD >=", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdLessThan(Date value) {
            addCriterion("SC_DD <", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdLessThanOrEqualTo(Date value) {
            addCriterion("SC_DD <=", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdIn(List<Date> values) {
            addCriterion("SC_DD in", values, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdNotIn(List<Date> values) {
            addCriterion("SC_DD not in", values, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdBetween(Date value1, Date value2) {
            addCriterion("SC_DD between", value1, value2, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdNotBetween(Date value1, Date value2) {
            addCriterion("SC_DD not between", value1, value2, "scDd");
            return (Criteria) this;
        }

        public Criteria andChkXzlIsNull() {
            addCriterion("CHK_XZL is null");
            return (Criteria) this;
        }

        public Criteria andChkXzlIsNotNull() {
            addCriterion("CHK_XZL is not null");
            return (Criteria) this;
        }

        public Criteria andChkXzlEqualTo(String value) {
            addCriterion("CHK_XZL =", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlNotEqualTo(String value) {
            addCriterion("CHK_XZL <>", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlGreaterThan(String value) {
            addCriterion("CHK_XZL >", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_XZL >=", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlLessThan(String value) {
            addCriterion("CHK_XZL <", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlLessThanOrEqualTo(String value) {
            addCriterion("CHK_XZL <=", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlLike(String value) {
            addCriterion("CHK_XZL like", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlNotLike(String value) {
            addCriterion("CHK_XZL not like", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlIn(List<String> values) {
            addCriterion("CHK_XZL in", values, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlNotIn(List<String> values) {
            addCriterion("CHK_XZL not in", values, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlBetween(String value1, String value2) {
            addCriterion("CHK_XZL between", value1, value2, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlNotBetween(String value1, String value2) {
            addCriterion("CHK_XZL not between", value1, value2, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andCkBilIdIsNull() {
            addCriterion("CK_BIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCkBilIdIsNotNull() {
            addCriterion("CK_BIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCkBilIdEqualTo(String value) {
            addCriterion("CK_BIL_ID =", value, "ckBilId");
            return (Criteria) this;
        }

        public Criteria andCkBilIdNotEqualTo(String value) {
            addCriterion("CK_BIL_ID <>", value, "ckBilId");
            return (Criteria) this;
        }

        public Criteria andCkBilIdGreaterThan(String value) {
            addCriterion("CK_BIL_ID >", value, "ckBilId");
            return (Criteria) this;
        }

        public Criteria andCkBilIdGreaterThanOrEqualTo(String value) {
            addCriterion("CK_BIL_ID >=", value, "ckBilId");
            return (Criteria) this;
        }

        public Criteria andCkBilIdLessThan(String value) {
            addCriterion("CK_BIL_ID <", value, "ckBilId");
            return (Criteria) this;
        }

        public Criteria andCkBilIdLessThanOrEqualTo(String value) {
            addCriterion("CK_BIL_ID <=", value, "ckBilId");
            return (Criteria) this;
        }

        public Criteria andCkBilIdLike(String value) {
            addCriterion("CK_BIL_ID like", value, "ckBilId");
            return (Criteria) this;
        }

        public Criteria andCkBilIdNotLike(String value) {
            addCriterion("CK_BIL_ID not like", value, "ckBilId");
            return (Criteria) this;
        }

        public Criteria andCkBilIdIn(List<String> values) {
            addCriterion("CK_BIL_ID in", values, "ckBilId");
            return (Criteria) this;
        }

        public Criteria andCkBilIdNotIn(List<String> values) {
            addCriterion("CK_BIL_ID not in", values, "ckBilId");
            return (Criteria) this;
        }

        public Criteria andCkBilIdBetween(String value1, String value2) {
            addCriterion("CK_BIL_ID between", value1, value2, "ckBilId");
            return (Criteria) this;
        }

        public Criteria andCkBilIdNotBetween(String value1, String value2) {
            addCriterion("CK_BIL_ID not between", value1, value2, "ckBilId");
            return (Criteria) this;
        }

        public Criteria andCkBilNoIsNull() {
            addCriterion("CK_BIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andCkBilNoIsNotNull() {
            addCriterion("CK_BIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCkBilNoEqualTo(String value) {
            addCriterion("CK_BIL_NO =", value, "ckBilNo");
            return (Criteria) this;
        }

        public Criteria andCkBilNoNotEqualTo(String value) {
            addCriterion("CK_BIL_NO <>", value, "ckBilNo");
            return (Criteria) this;
        }

        public Criteria andCkBilNoGreaterThan(String value) {
            addCriterion("CK_BIL_NO >", value, "ckBilNo");
            return (Criteria) this;
        }

        public Criteria andCkBilNoGreaterThanOrEqualTo(String value) {
            addCriterion("CK_BIL_NO >=", value, "ckBilNo");
            return (Criteria) this;
        }

        public Criteria andCkBilNoLessThan(String value) {
            addCriterion("CK_BIL_NO <", value, "ckBilNo");
            return (Criteria) this;
        }

        public Criteria andCkBilNoLessThanOrEqualTo(String value) {
            addCriterion("CK_BIL_NO <=", value, "ckBilNo");
            return (Criteria) this;
        }

        public Criteria andCkBilNoLike(String value) {
            addCriterion("CK_BIL_NO like", value, "ckBilNo");
            return (Criteria) this;
        }

        public Criteria andCkBilNoNotLike(String value) {
            addCriterion("CK_BIL_NO not like", value, "ckBilNo");
            return (Criteria) this;
        }

        public Criteria andCkBilNoIn(List<String> values) {
            addCriterion("CK_BIL_NO in", values, "ckBilNo");
            return (Criteria) this;
        }

        public Criteria andCkBilNoNotIn(List<String> values) {
            addCriterion("CK_BIL_NO not in", values, "ckBilNo");
            return (Criteria) this;
        }

        public Criteria andCkBilNoBetween(String value1, String value2) {
            addCriterion("CK_BIL_NO between", value1, value2, "ckBilNo");
            return (Criteria) this;
        }

        public Criteria andCkBilNoNotBetween(String value1, String value2) {
            addCriterion("CK_BIL_NO not between", value1, value2, "ckBilNo");
            return (Criteria) this;
        }

        public Criteria andCkEstItmIsNull() {
            addCriterion("CK_EST_ITM is null");
            return (Criteria) this;
        }

        public Criteria andCkEstItmIsNotNull() {
            addCriterion("CK_EST_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andCkEstItmEqualTo(Integer value) {
            addCriterion("CK_EST_ITM =", value, "ckEstItm");
            return (Criteria) this;
        }

        public Criteria andCkEstItmNotEqualTo(Integer value) {
            addCriterion("CK_EST_ITM <>", value, "ckEstItm");
            return (Criteria) this;
        }

        public Criteria andCkEstItmGreaterThan(Integer value) {
            addCriterion("CK_EST_ITM >", value, "ckEstItm");
            return (Criteria) this;
        }

        public Criteria andCkEstItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("CK_EST_ITM >=", value, "ckEstItm");
            return (Criteria) this;
        }

        public Criteria andCkEstItmLessThan(Integer value) {
            addCriterion("CK_EST_ITM <", value, "ckEstItm");
            return (Criteria) this;
        }

        public Criteria andCkEstItmLessThanOrEqualTo(Integer value) {
            addCriterion("CK_EST_ITM <=", value, "ckEstItm");
            return (Criteria) this;
        }

        public Criteria andCkEstItmIn(List<Integer> values) {
            addCriterion("CK_EST_ITM in", values, "ckEstItm");
            return (Criteria) this;
        }

        public Criteria andCkEstItmNotIn(List<Integer> values) {
            addCriterion("CK_EST_ITM not in", values, "ckEstItm");
            return (Criteria) this;
        }

        public Criteria andCkEstItmBetween(Integer value1, Integer value2) {
            addCriterion("CK_EST_ITM between", value1, value2, "ckEstItm");
            return (Criteria) this;
        }

        public Criteria andCkEstItmNotBetween(Integer value1, Integer value2) {
            addCriterion("CK_EST_ITM not between", value1, value2, "ckEstItm");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoIsNull() {
            addCriterion("NB_BOX_NO is null");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoIsNotNull() {
            addCriterion("NB_BOX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoEqualTo(String value) {
            addCriterion("NB_BOX_NO =", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoNotEqualTo(String value) {
            addCriterion("NB_BOX_NO <>", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoGreaterThan(String value) {
            addCriterion("NB_BOX_NO >", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoGreaterThanOrEqualTo(String value) {
            addCriterion("NB_BOX_NO >=", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoLessThan(String value) {
            addCriterion("NB_BOX_NO <", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoLessThanOrEqualTo(String value) {
            addCriterion("NB_BOX_NO <=", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoLike(String value) {
            addCriterion("NB_BOX_NO like", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoNotLike(String value) {
            addCriterion("NB_BOX_NO not like", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoIn(List<String> values) {
            addCriterion("NB_BOX_NO in", values, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoNotIn(List<String> values) {
            addCriterion("NB_BOX_NO not in", values, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoBetween(String value1, String value2) {
            addCriterion("NB_BOX_NO between", value1, value2, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoNotBetween(String value1, String value2) {
            addCriterion("NB_BOX_NO not between", value1, value2, "nbBoxNo");
            return (Criteria) this;
        }
    }

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