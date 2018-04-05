package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MfIcZExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MfIcZExample() {
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

        public Criteria andAmtnJsIsNull() {
            addCriterion("AMTN_JS is null");
            return (Criteria) this;
        }

        public Criteria andAmtnJsIsNotNull() {
            addCriterion("AMTN_JS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnJsEqualTo(BigDecimal value) {
            addCriterion("AMTN_JS =", value, "amtnJs");
            return (Criteria) this;
        }

        public Criteria andAmtnJsNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_JS <>", value, "amtnJs");
            return (Criteria) this;
        }

        public Criteria andAmtnJsGreaterThan(BigDecimal value) {
            addCriterion("AMTN_JS >", value, "amtnJs");
            return (Criteria) this;
        }

        public Criteria andAmtnJsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_JS >=", value, "amtnJs");
            return (Criteria) this;
        }

        public Criteria andAmtnJsLessThan(BigDecimal value) {
            addCriterion("AMTN_JS <", value, "amtnJs");
            return (Criteria) this;
        }

        public Criteria andAmtnJsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_JS <=", value, "amtnJs");
            return (Criteria) this;
        }

        public Criteria andAmtnJsIn(List<BigDecimal> values) {
            addCriterion("AMTN_JS in", values, "amtnJs");
            return (Criteria) this;
        }

        public Criteria andAmtnJsNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_JS not in", values, "amtnJs");
            return (Criteria) this;
        }

        public Criteria andAmtnJsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_JS between", value1, value2, "amtnJs");
            return (Criteria) this;
        }

        public Criteria andAmtnJsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_JS not between", value1, value2, "amtnJs");
            return (Criteria) this;
        }

        public Criteria andAmtnTjIsNull() {
            addCriterion("AMTN_TJ is null");
            return (Criteria) this;
        }

        public Criteria andAmtnTjIsNotNull() {
            addCriterion("AMTN_TJ is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnTjEqualTo(BigDecimal value) {
            addCriterion("AMTN_TJ =", value, "amtnTj");
            return (Criteria) this;
        }

        public Criteria andAmtnTjNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_TJ <>", value, "amtnTj");
            return (Criteria) this;
        }

        public Criteria andAmtnTjGreaterThan(BigDecimal value) {
            addCriterion("AMTN_TJ >", value, "amtnTj");
            return (Criteria) this;
        }

        public Criteria andAmtnTjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_TJ >=", value, "amtnTj");
            return (Criteria) this;
        }

        public Criteria andAmtnTjLessThan(BigDecimal value) {
            addCriterion("AMTN_TJ <", value, "amtnTj");
            return (Criteria) this;
        }

        public Criteria andAmtnTjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_TJ <=", value, "amtnTj");
            return (Criteria) this;
        }

        public Criteria andAmtnTjIn(List<BigDecimal> values) {
            addCriterion("AMTN_TJ in", values, "amtnTj");
            return (Criteria) this;
        }

        public Criteria andAmtnTjNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_TJ not in", values, "amtnTj");
            return (Criteria) this;
        }

        public Criteria andAmtnTjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_TJ between", value1, value2, "amtnTj");
            return (Criteria) this;
        }

        public Criteria andAmtnTjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_TJ not between", value1, value2, "amtnTj");
            return (Criteria) this;
        }

        public Criteria andAmtnYfIsNull() {
            addCriterion("AMTN_YF is null");
            return (Criteria) this;
        }

        public Criteria andAmtnYfIsNotNull() {
            addCriterion("AMTN_YF is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnYfEqualTo(BigDecimal value) {
            addCriterion("AMTN_YF =", value, "amtnYf");
            return (Criteria) this;
        }

        public Criteria andAmtnYfNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_YF <>", value, "amtnYf");
            return (Criteria) this;
        }

        public Criteria andAmtnYfGreaterThan(BigDecimal value) {
            addCriterion("AMTN_YF >", value, "amtnYf");
            return (Criteria) this;
        }

        public Criteria andAmtnYfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_YF >=", value, "amtnYf");
            return (Criteria) this;
        }

        public Criteria andAmtnYfLessThan(BigDecimal value) {
            addCriterion("AMTN_YF <", value, "amtnYf");
            return (Criteria) this;
        }

        public Criteria andAmtnYfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_YF <=", value, "amtnYf");
            return (Criteria) this;
        }

        public Criteria andAmtnYfIn(List<BigDecimal> values) {
            addCriterion("AMTN_YF in", values, "amtnYf");
            return (Criteria) this;
        }

        public Criteria andAmtnYfNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_YF not in", values, "amtnYf");
            return (Criteria) this;
        }

        public Criteria andAmtnYfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_YF between", value1, value2, "amtnYf");
            return (Criteria) this;
        }

        public Criteria andAmtnYfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_YF not between", value1, value2, "amtnYf");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andGysbmIsNull() {
            addCriterion("GYSBM is null");
            return (Criteria) this;
        }

        public Criteria andGysbmIsNotNull() {
            addCriterion("GYSBM is not null");
            return (Criteria) this;
        }

        public Criteria andGysbmEqualTo(String value) {
            addCriterion("GYSBM =", value, "gysbm");
            return (Criteria) this;
        }

        public Criteria andGysbmNotEqualTo(String value) {
            addCriterion("GYSBM <>", value, "gysbm");
            return (Criteria) this;
        }

        public Criteria andGysbmGreaterThan(String value) {
            addCriterion("GYSBM >", value, "gysbm");
            return (Criteria) this;
        }

        public Criteria andGysbmGreaterThanOrEqualTo(String value) {
            addCriterion("GYSBM >=", value, "gysbm");
            return (Criteria) this;
        }

        public Criteria andGysbmLessThan(String value) {
            addCriterion("GYSBM <", value, "gysbm");
            return (Criteria) this;
        }

        public Criteria andGysbmLessThanOrEqualTo(String value) {
            addCriterion("GYSBM <=", value, "gysbm");
            return (Criteria) this;
        }

        public Criteria andGysbmLike(String value) {
            addCriterion("GYSBM like", value, "gysbm");
            return (Criteria) this;
        }

        public Criteria andGysbmNotLike(String value) {
            addCriterion("GYSBM not like", value, "gysbm");
            return (Criteria) this;
        }

        public Criteria andGysbmIn(List<String> values) {
            addCriterion("GYSBM in", values, "gysbm");
            return (Criteria) this;
        }

        public Criteria andGysbmNotIn(List<String> values) {
            addCriterion("GYSBM not in", values, "gysbm");
            return (Criteria) this;
        }

        public Criteria andGysbmBetween(String value1, String value2) {
            addCriterion("GYSBM between", value1, value2, "gysbm");
            return (Criteria) this;
        }

        public Criteria andGysbmNotBetween(String value1, String value2) {
            addCriterion("GYSBM not between", value1, value2, "gysbm");
            return (Criteria) this;
        }

        public Criteria andJhrIsNull() {
            addCriterion("JHR is null");
            return (Criteria) this;
        }

        public Criteria andJhrIsNotNull() {
            addCriterion("JHR is not null");
            return (Criteria) this;
        }

        public Criteria andJhrEqualTo(String value) {
            addCriterion("JHR =", value, "jhr");
            return (Criteria) this;
        }

        public Criteria andJhrNotEqualTo(String value) {
            addCriterion("JHR <>", value, "jhr");
            return (Criteria) this;
        }

        public Criteria andJhrGreaterThan(String value) {
            addCriterion("JHR >", value, "jhr");
            return (Criteria) this;
        }

        public Criteria andJhrGreaterThanOrEqualTo(String value) {
            addCriterion("JHR >=", value, "jhr");
            return (Criteria) this;
        }

        public Criteria andJhrLessThan(String value) {
            addCriterion("JHR <", value, "jhr");
            return (Criteria) this;
        }

        public Criteria andJhrLessThanOrEqualTo(String value) {
            addCriterion("JHR <=", value, "jhr");
            return (Criteria) this;
        }

        public Criteria andJhrLike(String value) {
            addCriterion("JHR like", value, "jhr");
            return (Criteria) this;
        }

        public Criteria andJhrNotLike(String value) {
            addCriterion("JHR not like", value, "jhr");
            return (Criteria) this;
        }

        public Criteria andJhrIn(List<String> values) {
            addCriterion("JHR in", values, "jhr");
            return (Criteria) this;
        }

        public Criteria andJhrNotIn(List<String> values) {
            addCriterion("JHR not in", values, "jhr");
            return (Criteria) this;
        }

        public Criteria andJhrBetween(String value1, String value2) {
            addCriterion("JHR between", value1, value2, "jhr");
            return (Criteria) this;
        }

        public Criteria andJhrNotBetween(String value1, String value2) {
            addCriterion("JHR not between", value1, value2, "jhr");
            return (Criteria) this;
        }

        public Criteria andModeIsNull() {
            addCriterion("MODE is null");
            return (Criteria) this;
        }

        public Criteria andModeIsNotNull() {
            addCriterion("MODE is not null");
            return (Criteria) this;
        }

        public Criteria andModeEqualTo(String value) {
            addCriterion("MODE =", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotEqualTo(String value) {
            addCriterion("MODE <>", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThan(String value) {
            addCriterion("MODE >", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThanOrEqualTo(String value) {
            addCriterion("MODE >=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThan(String value) {
            addCriterion("MODE <", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThanOrEqualTo(String value) {
            addCriterion("MODE <=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLike(String value) {
            addCriterion("MODE like", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotLike(String value) {
            addCriterion("MODE not like", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeIn(List<String> values) {
            addCriterion("MODE in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotIn(List<String> values) {
            addCriterion("MODE not in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeBetween(String value1, String value2) {
            addCriterion("MODE between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotBetween(String value1, String value2) {
            addCriterion("MODE not between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andPpsIsNull() {
            addCriterion("PPS is null");
            return (Criteria) this;
        }

        public Criteria andPpsIsNotNull() {
            addCriterion("PPS is not null");
            return (Criteria) this;
        }

        public Criteria andPpsEqualTo(String value) {
            addCriterion("PPS =", value, "pps");
            return (Criteria) this;
        }

        public Criteria andPpsNotEqualTo(String value) {
            addCriterion("PPS <>", value, "pps");
            return (Criteria) this;
        }

        public Criteria andPpsGreaterThan(String value) {
            addCriterion("PPS >", value, "pps");
            return (Criteria) this;
        }

        public Criteria andPpsGreaterThanOrEqualTo(String value) {
            addCriterion("PPS >=", value, "pps");
            return (Criteria) this;
        }

        public Criteria andPpsLessThan(String value) {
            addCriterion("PPS <", value, "pps");
            return (Criteria) this;
        }

        public Criteria andPpsLessThanOrEqualTo(String value) {
            addCriterion("PPS <=", value, "pps");
            return (Criteria) this;
        }

        public Criteria andPpsLike(String value) {
            addCriterion("PPS like", value, "pps");
            return (Criteria) this;
        }

        public Criteria andPpsNotLike(String value) {
            addCriterion("PPS not like", value, "pps");
            return (Criteria) this;
        }

        public Criteria andPpsIn(List<String> values) {
            addCriterion("PPS in", values, "pps");
            return (Criteria) this;
        }

        public Criteria andPpsNotIn(List<String> values) {
            addCriterion("PPS not in", values, "pps");
            return (Criteria) this;
        }

        public Criteria andPpsBetween(String value1, String value2) {
            addCriterion("PPS between", value1, value2, "pps");
            return (Criteria) this;
        }

        public Criteria andPpsNotBetween(String value1, String value2) {
            addCriterion("PPS not between", value1, value2, "pps");
            return (Criteria) this;
        }

        public Criteria andQtyJsIsNull() {
            addCriterion("QTY_JS is null");
            return (Criteria) this;
        }

        public Criteria andQtyJsIsNotNull() {
            addCriterion("QTY_JS is not null");
            return (Criteria) this;
        }

        public Criteria andQtyJsEqualTo(String value) {
            addCriterion("QTY_JS =", value, "qtyJs");
            return (Criteria) this;
        }

        public Criteria andQtyJsNotEqualTo(String value) {
            addCriterion("QTY_JS <>", value, "qtyJs");
            return (Criteria) this;
        }

        public Criteria andQtyJsGreaterThan(String value) {
            addCriterion("QTY_JS >", value, "qtyJs");
            return (Criteria) this;
        }

        public Criteria andQtyJsGreaterThanOrEqualTo(String value) {
            addCriterion("QTY_JS >=", value, "qtyJs");
            return (Criteria) this;
        }

        public Criteria andQtyJsLessThan(String value) {
            addCriterion("QTY_JS <", value, "qtyJs");
            return (Criteria) this;
        }

        public Criteria andQtyJsLessThanOrEqualTo(String value) {
            addCriterion("QTY_JS <=", value, "qtyJs");
            return (Criteria) this;
        }

        public Criteria andQtyJsLike(String value) {
            addCriterion("QTY_JS like", value, "qtyJs");
            return (Criteria) this;
        }

        public Criteria andQtyJsNotLike(String value) {
            addCriterion("QTY_JS not like", value, "qtyJs");
            return (Criteria) this;
        }

        public Criteria andQtyJsIn(List<String> values) {
            addCriterion("QTY_JS in", values, "qtyJs");
            return (Criteria) this;
        }

        public Criteria andQtyJsNotIn(List<String> values) {
            addCriterion("QTY_JS not in", values, "qtyJs");
            return (Criteria) this;
        }

        public Criteria andQtyJsBetween(String value1, String value2) {
            addCriterion("QTY_JS between", value1, value2, "qtyJs");
            return (Criteria) this;
        }

        public Criteria andQtyJsNotBetween(String value1, String value2) {
            addCriterion("QTY_JS not between", value1, value2, "qtyJs");
            return (Criteria) this;
        }

        public Criteria andUpTj1IsNull() {
            addCriterion("UP_TJ1 is null");
            return (Criteria) this;
        }

        public Criteria andUpTj1IsNotNull() {
            addCriterion("UP_TJ1 is not null");
            return (Criteria) this;
        }

        public Criteria andUpTj1EqualTo(BigDecimal value) {
            addCriterion("UP_TJ1 =", value, "upTj1");
            return (Criteria) this;
        }

        public Criteria andUpTj1NotEqualTo(BigDecimal value) {
            addCriterion("UP_TJ1 <>", value, "upTj1");
            return (Criteria) this;
        }

        public Criteria andUpTj1GreaterThan(BigDecimal value) {
            addCriterion("UP_TJ1 >", value, "upTj1");
            return (Criteria) this;
        }

        public Criteria andUpTj1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_TJ1 >=", value, "upTj1");
            return (Criteria) this;
        }

        public Criteria andUpTj1LessThan(BigDecimal value) {
            addCriterion("UP_TJ1 <", value, "upTj1");
            return (Criteria) this;
        }

        public Criteria andUpTj1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_TJ1 <=", value, "upTj1");
            return (Criteria) this;
        }

        public Criteria andUpTj1In(List<BigDecimal> values) {
            addCriterion("UP_TJ1 in", values, "upTj1");
            return (Criteria) this;
        }

        public Criteria andUpTj1NotIn(List<BigDecimal> values) {
            addCriterion("UP_TJ1 not in", values, "upTj1");
            return (Criteria) this;
        }

        public Criteria andUpTj1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_TJ1 between", value1, value2, "upTj1");
            return (Criteria) this;
        }

        public Criteria andUpTj1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_TJ1 not between", value1, value2, "upTj1");
            return (Criteria) this;
        }

        public Criteria andUp1IsNull() {
            addCriterion("UP1 is null");
            return (Criteria) this;
        }

        public Criteria andUp1IsNotNull() {
            addCriterion("UP1 is not null");
            return (Criteria) this;
        }

        public Criteria andUp1EqualTo(BigDecimal value) {
            addCriterion("UP1 =", value, "up1");
            return (Criteria) this;
        }

        public Criteria andUp1NotEqualTo(BigDecimal value) {
            addCriterion("UP1 <>", value, "up1");
            return (Criteria) this;
        }

        public Criteria andUp1GreaterThan(BigDecimal value) {
            addCriterion("UP1 >", value, "up1");
            return (Criteria) this;
        }

        public Criteria andUp1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP1 >=", value, "up1");
            return (Criteria) this;
        }

        public Criteria andUp1LessThan(BigDecimal value) {
            addCriterion("UP1 <", value, "up1");
            return (Criteria) this;
        }

        public Criteria andUp1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP1 <=", value, "up1");
            return (Criteria) this;
        }

        public Criteria andUp1In(List<BigDecimal> values) {
            addCriterion("UP1 in", values, "up1");
            return (Criteria) this;
        }

        public Criteria andUp1NotIn(List<BigDecimal> values) {
            addCriterion("UP1 not in", values, "up1");
            return (Criteria) this;
        }

        public Criteria andUp1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP1 between", value1, value2, "up1");
            return (Criteria) this;
        }

        public Criteria andUp1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP1 not between", value1, value2, "up1");
            return (Criteria) this;
        }

        public Criteria andUp2IsNull() {
            addCriterion("UP2 is null");
            return (Criteria) this;
        }

        public Criteria andUp2IsNotNull() {
            addCriterion("UP2 is not null");
            return (Criteria) this;
        }

        public Criteria andUp2EqualTo(BigDecimal value) {
            addCriterion("UP2 =", value, "up2");
            return (Criteria) this;
        }

        public Criteria andUp2NotEqualTo(BigDecimal value) {
            addCriterion("UP2 <>", value, "up2");
            return (Criteria) this;
        }

        public Criteria andUp2GreaterThan(BigDecimal value) {
            addCriterion("UP2 >", value, "up2");
            return (Criteria) this;
        }

        public Criteria andUp2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP2 >=", value, "up2");
            return (Criteria) this;
        }

        public Criteria andUp2LessThan(BigDecimal value) {
            addCriterion("UP2 <", value, "up2");
            return (Criteria) this;
        }

        public Criteria andUp2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP2 <=", value, "up2");
            return (Criteria) this;
        }

        public Criteria andUp2In(List<BigDecimal> values) {
            addCriterion("UP2 in", values, "up2");
            return (Criteria) this;
        }

        public Criteria andUp2NotIn(List<BigDecimal> values) {
            addCriterion("UP2 not in", values, "up2");
            return (Criteria) this;
        }

        public Criteria andUp2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP2 between", value1, value2, "up2");
            return (Criteria) this;
        }

        public Criteria andUp2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP2 not between", value1, value2, "up2");
            return (Criteria) this;
        }

        public Criteria andWlgsIsNull() {
            addCriterion("WLGS is null");
            return (Criteria) this;
        }

        public Criteria andWlgsIsNotNull() {
            addCriterion("WLGS is not null");
            return (Criteria) this;
        }

        public Criteria andWlgsEqualTo(String value) {
            addCriterion("WLGS =", value, "wlgs");
            return (Criteria) this;
        }

        public Criteria andWlgsNotEqualTo(String value) {
            addCriterion("WLGS <>", value, "wlgs");
            return (Criteria) this;
        }

        public Criteria andWlgsGreaterThan(String value) {
            addCriterion("WLGS >", value, "wlgs");
            return (Criteria) this;
        }

        public Criteria andWlgsGreaterThanOrEqualTo(String value) {
            addCriterion("WLGS >=", value, "wlgs");
            return (Criteria) this;
        }

        public Criteria andWlgsLessThan(String value) {
            addCriterion("WLGS <", value, "wlgs");
            return (Criteria) this;
        }

        public Criteria andWlgsLessThanOrEqualTo(String value) {
            addCriterion("WLGS <=", value, "wlgs");
            return (Criteria) this;
        }

        public Criteria andWlgsLike(String value) {
            addCriterion("WLGS like", value, "wlgs");
            return (Criteria) this;
        }

        public Criteria andWlgsNotLike(String value) {
            addCriterion("WLGS not like", value, "wlgs");
            return (Criteria) this;
        }

        public Criteria andWlgsIn(List<String> values) {
            addCriterion("WLGS in", values, "wlgs");
            return (Criteria) this;
        }

        public Criteria andWlgsNotIn(List<String> values) {
            addCriterion("WLGS not in", values, "wlgs");
            return (Criteria) this;
        }

        public Criteria andWlgsBetween(String value1, String value2) {
            addCriterion("WLGS between", value1, value2, "wlgs");
            return (Criteria) this;
        }

        public Criteria andWlgsNotBetween(String value1, String value2) {
            addCriterion("WLGS not between", value1, value2, "wlgs");
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

        public Criteria andMqtyXsIsNull() {
            addCriterion("MQTY_XS is null");
            return (Criteria) this;
        }

        public Criteria andMqtyXsIsNotNull() {
            addCriterion("MQTY_XS is not null");
            return (Criteria) this;
        }

        public Criteria andMqtyXsEqualTo(BigDecimal value) {
            addCriterion("MQTY_XS =", value, "mqtyXs");
            return (Criteria) this;
        }

        public Criteria andMqtyXsNotEqualTo(BigDecimal value) {
            addCriterion("MQTY_XS <>", value, "mqtyXs");
            return (Criteria) this;
        }

        public Criteria andMqtyXsGreaterThan(BigDecimal value) {
            addCriterion("MQTY_XS >", value, "mqtyXs");
            return (Criteria) this;
        }

        public Criteria andMqtyXsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MQTY_XS >=", value, "mqtyXs");
            return (Criteria) this;
        }

        public Criteria andMqtyXsLessThan(BigDecimal value) {
            addCriterion("MQTY_XS <", value, "mqtyXs");
            return (Criteria) this;
        }

        public Criteria andMqtyXsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MQTY_XS <=", value, "mqtyXs");
            return (Criteria) this;
        }

        public Criteria andMqtyXsIn(List<BigDecimal> values) {
            addCriterion("MQTY_XS in", values, "mqtyXs");
            return (Criteria) this;
        }

        public Criteria andMqtyXsNotIn(List<BigDecimal> values) {
            addCriterion("MQTY_XS not in", values, "mqtyXs");
            return (Criteria) this;
        }

        public Criteria andMqtyXsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MQTY_XS between", value1, value2, "mqtyXs");
            return (Criteria) this;
        }

        public Criteria andMqtyXsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MQTY_XS not between", value1, value2, "mqtyXs");
            return (Criteria) this;
        }

        public Criteria andZfIsNull() {
            addCriterion("ZF is null");
            return (Criteria) this;
        }

        public Criteria andZfIsNotNull() {
            addCriterion("ZF is not null");
            return (Criteria) this;
        }

        public Criteria andZfEqualTo(String value) {
            addCriterion("ZF =", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotEqualTo(String value) {
            addCriterion("ZF <>", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfGreaterThan(String value) {
            addCriterion("ZF >", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfGreaterThanOrEqualTo(String value) {
            addCriterion("ZF >=", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfLessThan(String value) {
            addCriterion("ZF <", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfLessThanOrEqualTo(String value) {
            addCriterion("ZF <=", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfLike(String value) {
            addCriterion("ZF like", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotLike(String value) {
            addCriterion("ZF not like", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfIn(List<String> values) {
            addCriterion("ZF in", values, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotIn(List<String> values) {
            addCriterion("ZF not in", values, "zf");
            return (Criteria) this;
        }

        public Criteria andZfBetween(String value1, String value2) {
            addCriterion("ZF between", value1, value2, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotBetween(String value1, String value2) {
            addCriterion("ZF not between", value1, value2, "zf");
            return (Criteria) this;
        }

        public Criteria andJksyIsNull() {
            addCriterion("JKSY is null");
            return (Criteria) this;
        }

        public Criteria andJksyIsNotNull() {
            addCriterion("JKSY is not null");
            return (Criteria) this;
        }

        public Criteria andJksyEqualTo(String value) {
            addCriterion("JKSY =", value, "jksy");
            return (Criteria) this;
        }

        public Criteria andJksyNotEqualTo(String value) {
            addCriterion("JKSY <>", value, "jksy");
            return (Criteria) this;
        }

        public Criteria andJksyGreaterThan(String value) {
            addCriterion("JKSY >", value, "jksy");
            return (Criteria) this;
        }

        public Criteria andJksyGreaterThanOrEqualTo(String value) {
            addCriterion("JKSY >=", value, "jksy");
            return (Criteria) this;
        }

        public Criteria andJksyLessThan(String value) {
            addCriterion("JKSY <", value, "jksy");
            return (Criteria) this;
        }

        public Criteria andJksyLessThanOrEqualTo(String value) {
            addCriterion("JKSY <=", value, "jksy");
            return (Criteria) this;
        }

        public Criteria andJksyLike(String value) {
            addCriterion("JKSY like", value, "jksy");
            return (Criteria) this;
        }

        public Criteria andJksyNotLike(String value) {
            addCriterion("JKSY not like", value, "jksy");
            return (Criteria) this;
        }

        public Criteria andJksyIn(List<String> values) {
            addCriterion("JKSY in", values, "jksy");
            return (Criteria) this;
        }

        public Criteria andJksyNotIn(List<String> values) {
            addCriterion("JKSY not in", values, "jksy");
            return (Criteria) this;
        }

        public Criteria andJksyBetween(String value1, String value2) {
            addCriterion("JKSY between", value1, value2, "jksy");
            return (Criteria) this;
        }

        public Criteria andJksyNotBetween(String value1, String value2) {
            addCriterion("JKSY not between", value1, value2, "jksy");
            return (Criteria) this;
        }

        public Criteria andJkscIsNull() {
            addCriterion("JKSC is null");
            return (Criteria) this;
        }

        public Criteria andJkscIsNotNull() {
            addCriterion("JKSC is not null");
            return (Criteria) this;
        }

        public Criteria andJkscEqualTo(String value) {
            addCriterion("JKSC =", value, "jksc");
            return (Criteria) this;
        }

        public Criteria andJkscNotEqualTo(String value) {
            addCriterion("JKSC <>", value, "jksc");
            return (Criteria) this;
        }

        public Criteria andJkscGreaterThan(String value) {
            addCriterion("JKSC >", value, "jksc");
            return (Criteria) this;
        }

        public Criteria andJkscGreaterThanOrEqualTo(String value) {
            addCriterion("JKSC >=", value, "jksc");
            return (Criteria) this;
        }

        public Criteria andJkscLessThan(String value) {
            addCriterion("JKSC <", value, "jksc");
            return (Criteria) this;
        }

        public Criteria andJkscLessThanOrEqualTo(String value) {
            addCriterion("JKSC <=", value, "jksc");
            return (Criteria) this;
        }

        public Criteria andJkscLike(String value) {
            addCriterion("JKSC like", value, "jksc");
            return (Criteria) this;
        }

        public Criteria andJkscNotLike(String value) {
            addCriterion("JKSC not like", value, "jksc");
            return (Criteria) this;
        }

        public Criteria andJkscIn(List<String> values) {
            addCriterion("JKSC in", values, "jksc");
            return (Criteria) this;
        }

        public Criteria andJkscNotIn(List<String> values) {
            addCriterion("JKSC not in", values, "jksc");
            return (Criteria) this;
        }

        public Criteria andJkscBetween(String value1, String value2) {
            addCriterion("JKSC between", value1, value2, "jksc");
            return (Criteria) this;
        }

        public Criteria andJkscNotBetween(String value1, String value2) {
            addCriterion("JKSC not between", value1, value2, "jksc");
            return (Criteria) this;
        }

        public Criteria andFilePspz1IsNull() {
            addCriterion("FILE__PSPZ1 is null");
            return (Criteria) this;
        }

        public Criteria andFilePspz1IsNotNull() {
            addCriterion("FILE__PSPZ1 is not null");
            return (Criteria) this;
        }

        public Criteria andFilePspz1EqualTo(String value) {
            addCriterion("FILE__PSPZ1 =", value, "filePspz1");
            return (Criteria) this;
        }

        public Criteria andFilePspz1NotEqualTo(String value) {
            addCriterion("FILE__PSPZ1 <>", value, "filePspz1");
            return (Criteria) this;
        }

        public Criteria andFilePspz1GreaterThan(String value) {
            addCriterion("FILE__PSPZ1 >", value, "filePspz1");
            return (Criteria) this;
        }

        public Criteria andFilePspz1GreaterThanOrEqualTo(String value) {
            addCriterion("FILE__PSPZ1 >=", value, "filePspz1");
            return (Criteria) this;
        }

        public Criteria andFilePspz1LessThan(String value) {
            addCriterion("FILE__PSPZ1 <", value, "filePspz1");
            return (Criteria) this;
        }

        public Criteria andFilePspz1LessThanOrEqualTo(String value) {
            addCriterion("FILE__PSPZ1 <=", value, "filePspz1");
            return (Criteria) this;
        }

        public Criteria andFilePspz1Like(String value) {
            addCriterion("FILE__PSPZ1 like", value, "filePspz1");
            return (Criteria) this;
        }

        public Criteria andFilePspz1NotLike(String value) {
            addCriterion("FILE__PSPZ1 not like", value, "filePspz1");
            return (Criteria) this;
        }

        public Criteria andFilePspz1In(List<String> values) {
            addCriterion("FILE__PSPZ1 in", values, "filePspz1");
            return (Criteria) this;
        }

        public Criteria andFilePspz1NotIn(List<String> values) {
            addCriterion("FILE__PSPZ1 not in", values, "filePspz1");
            return (Criteria) this;
        }

        public Criteria andFilePspz1Between(String value1, String value2) {
            addCriterion("FILE__PSPZ1 between", value1, value2, "filePspz1");
            return (Criteria) this;
        }

        public Criteria andFilePspz1NotBetween(String value1, String value2) {
            addCriterion("FILE__PSPZ1 not between", value1, value2, "filePspz1");
            return (Criteria) this;
        }

        public Criteria andPfilePspzIsNull() {
            addCriterion("PFILE_PSPZ is null");
            return (Criteria) this;
        }

        public Criteria andPfilePspzIsNotNull() {
            addCriterion("PFILE_PSPZ is not null");
            return (Criteria) this;
        }

        public Criteria andPfilePspzEqualTo(String value) {
            addCriterion("PFILE_PSPZ =", value, "pfilePspz");
            return (Criteria) this;
        }

        public Criteria andPfilePspzNotEqualTo(String value) {
            addCriterion("PFILE_PSPZ <>", value, "pfilePspz");
            return (Criteria) this;
        }

        public Criteria andPfilePspzGreaterThan(String value) {
            addCriterion("PFILE_PSPZ >", value, "pfilePspz");
            return (Criteria) this;
        }

        public Criteria andPfilePspzGreaterThanOrEqualTo(String value) {
            addCriterion("PFILE_PSPZ >=", value, "pfilePspz");
            return (Criteria) this;
        }

        public Criteria andPfilePspzLessThan(String value) {
            addCriterion("PFILE_PSPZ <", value, "pfilePspz");
            return (Criteria) this;
        }

        public Criteria andPfilePspzLessThanOrEqualTo(String value) {
            addCriterion("PFILE_PSPZ <=", value, "pfilePspz");
            return (Criteria) this;
        }

        public Criteria andPfilePspzLike(String value) {
            addCriterion("PFILE_PSPZ like", value, "pfilePspz");
            return (Criteria) this;
        }

        public Criteria andPfilePspzNotLike(String value) {
            addCriterion("PFILE_PSPZ not like", value, "pfilePspz");
            return (Criteria) this;
        }

        public Criteria andPfilePspzIn(List<String> values) {
            addCriterion("PFILE_PSPZ in", values, "pfilePspz");
            return (Criteria) this;
        }

        public Criteria andPfilePspzNotIn(List<String> values) {
            addCriterion("PFILE_PSPZ not in", values, "pfilePspz");
            return (Criteria) this;
        }

        public Criteria andPfilePspzBetween(String value1, String value2) {
            addCriterion("PFILE_PSPZ between", value1, value2, "pfilePspz");
            return (Criteria) this;
        }

        public Criteria andPfilePspzNotBetween(String value1, String value2) {
            addCriterion("PFILE_PSPZ not between", value1, value2, "pfilePspz");
            return (Criteria) this;
        }

        public Criteria andShqrpzIsNull() {
            addCriterion("SHQRPZ is null");
            return (Criteria) this;
        }

        public Criteria andShqrpzIsNotNull() {
            addCriterion("SHQRPZ is not null");
            return (Criteria) this;
        }

        public Criteria andShqrpzEqualTo(String value) {
            addCriterion("SHQRPZ =", value, "shqrpz");
            return (Criteria) this;
        }

        public Criteria andShqrpzNotEqualTo(String value) {
            addCriterion("SHQRPZ <>", value, "shqrpz");
            return (Criteria) this;
        }

        public Criteria andShqrpzGreaterThan(String value) {
            addCriterion("SHQRPZ >", value, "shqrpz");
            return (Criteria) this;
        }

        public Criteria andShqrpzGreaterThanOrEqualTo(String value) {
            addCriterion("SHQRPZ >=", value, "shqrpz");
            return (Criteria) this;
        }

        public Criteria andShqrpzLessThan(String value) {
            addCriterion("SHQRPZ <", value, "shqrpz");
            return (Criteria) this;
        }

        public Criteria andShqrpzLessThanOrEqualTo(String value) {
            addCriterion("SHQRPZ <=", value, "shqrpz");
            return (Criteria) this;
        }

        public Criteria andShqrpzLike(String value) {
            addCriterion("SHQRPZ like", value, "shqrpz");
            return (Criteria) this;
        }

        public Criteria andShqrpzNotLike(String value) {
            addCriterion("SHQRPZ not like", value, "shqrpz");
            return (Criteria) this;
        }

        public Criteria andShqrpzIn(List<String> values) {
            addCriterion("SHQRPZ in", values, "shqrpz");
            return (Criteria) this;
        }

        public Criteria andShqrpzNotIn(List<String> values) {
            addCriterion("SHQRPZ not in", values, "shqrpz");
            return (Criteria) this;
        }

        public Criteria andShqrpzBetween(String value1, String value2) {
            addCriterion("SHQRPZ between", value1, value2, "shqrpz");
            return (Criteria) this;
        }

        public Criteria andShqrpzNotBetween(String value1, String value2) {
            addCriterion("SHQRPZ not between", value1, value2, "shqrpz");
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