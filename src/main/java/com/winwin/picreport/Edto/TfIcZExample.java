package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TfIcZExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfIcZExample() {
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

        public Criteria andQtyXsIsNull() {
            addCriterion("QTY_XS is null");
            return (Criteria) this;
        }

        public Criteria andQtyXsIsNotNull() {
            addCriterion("QTY_XS is not null");
            return (Criteria) this;
        }

        public Criteria andQtyXsEqualTo(BigDecimal value) {
            addCriterion("QTY_XS =", value, "qtyXs");
            return (Criteria) this;
        }

        public Criteria andQtyXsNotEqualTo(BigDecimal value) {
            addCriterion("QTY_XS <>", value, "qtyXs");
            return (Criteria) this;
        }

        public Criteria andQtyXsGreaterThan(BigDecimal value) {
            addCriterion("QTY_XS >", value, "qtyXs");
            return (Criteria) this;
        }

        public Criteria andQtyXsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_XS >=", value, "qtyXs");
            return (Criteria) this;
        }

        public Criteria andQtyXsLessThan(BigDecimal value) {
            addCriterion("QTY_XS <", value, "qtyXs");
            return (Criteria) this;
        }

        public Criteria andQtyXsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_XS <=", value, "qtyXs");
            return (Criteria) this;
        }

        public Criteria andQtyXsIn(List<BigDecimal> values) {
            addCriterion("QTY_XS in", values, "qtyXs");
            return (Criteria) this;
        }

        public Criteria andQtyXsNotIn(List<BigDecimal> values) {
            addCriterion("QTY_XS not in", values, "qtyXs");
            return (Criteria) this;
        }

        public Criteria andQtyXsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_XS between", value1, value2, "qtyXs");
            return (Criteria) this;
        }

        public Criteria andQtyXsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_XS not between", value1, value2, "qtyXs");
            return (Criteria) this;
        }

        public Criteria andUpTjIsNull() {
            addCriterion("UP_TJ is null");
            return (Criteria) this;
        }

        public Criteria andUpTjIsNotNull() {
            addCriterion("UP_TJ is not null");
            return (Criteria) this;
        }

        public Criteria andUpTjEqualTo(BigDecimal value) {
            addCriterion("UP_TJ =", value, "upTj");
            return (Criteria) this;
        }

        public Criteria andUpTjNotEqualTo(BigDecimal value) {
            addCriterion("UP_TJ <>", value, "upTj");
            return (Criteria) this;
        }

        public Criteria andUpTjGreaterThan(BigDecimal value) {
            addCriterion("UP_TJ >", value, "upTj");
            return (Criteria) this;
        }

        public Criteria andUpTjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_TJ >=", value, "upTj");
            return (Criteria) this;
        }

        public Criteria andUpTjLessThan(BigDecimal value) {
            addCriterion("UP_TJ <", value, "upTj");
            return (Criteria) this;
        }

        public Criteria andUpTjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_TJ <=", value, "upTj");
            return (Criteria) this;
        }

        public Criteria andUpTjIn(List<BigDecimal> values) {
            addCriterion("UP_TJ in", values, "upTj");
            return (Criteria) this;
        }

        public Criteria andUpTjNotIn(List<BigDecimal> values) {
            addCriterion("UP_TJ not in", values, "upTj");
            return (Criteria) this;
        }

        public Criteria andUpTjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_TJ between", value1, value2, "upTj");
            return (Criteria) this;
        }

        public Criteria andUpTjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_TJ not between", value1, value2, "upTj");
            return (Criteria) this;
        }

        public Criteria andUpTj2IsNull() {
            addCriterion("UP_TJ2 is null");
            return (Criteria) this;
        }

        public Criteria andUpTj2IsNotNull() {
            addCriterion("UP_TJ2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpTj2EqualTo(BigDecimal value) {
            addCriterion("UP_TJ2 =", value, "upTj2");
            return (Criteria) this;
        }

        public Criteria andUpTj2NotEqualTo(BigDecimal value) {
            addCriterion("UP_TJ2 <>", value, "upTj2");
            return (Criteria) this;
        }

        public Criteria andUpTj2GreaterThan(BigDecimal value) {
            addCriterion("UP_TJ2 >", value, "upTj2");
            return (Criteria) this;
        }

        public Criteria andUpTj2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_TJ2 >=", value, "upTj2");
            return (Criteria) this;
        }

        public Criteria andUpTj2LessThan(BigDecimal value) {
            addCriterion("UP_TJ2 <", value, "upTj2");
            return (Criteria) this;
        }

        public Criteria andUpTj2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_TJ2 <=", value, "upTj2");
            return (Criteria) this;
        }

        public Criteria andUpTj2In(List<BigDecimal> values) {
            addCriterion("UP_TJ2 in", values, "upTj2");
            return (Criteria) this;
        }

        public Criteria andUpTj2NotIn(List<BigDecimal> values) {
            addCriterion("UP_TJ2 not in", values, "upTj2");
            return (Criteria) this;
        }

        public Criteria andUpTj2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_TJ2 between", value1, value2, "upTj2");
            return (Criteria) this;
        }

        public Criteria andUpTj2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_TJ2 not between", value1, value2, "upTj2");
            return (Criteria) this;
        }

        public Criteria andWqtyIsNull() {
            addCriterion("WQTY is null");
            return (Criteria) this;
        }

        public Criteria andWqtyIsNotNull() {
            addCriterion("WQTY is not null");
            return (Criteria) this;
        }

        public Criteria andWqtyEqualTo(BigDecimal value) {
            addCriterion("WQTY =", value, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyNotEqualTo(BigDecimal value) {
            addCriterion("WQTY <>", value, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyGreaterThan(BigDecimal value) {
            addCriterion("WQTY >", value, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WQTY >=", value, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyLessThan(BigDecimal value) {
            addCriterion("WQTY <", value, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WQTY <=", value, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyIn(List<BigDecimal> values) {
            addCriterion("WQTY in", values, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyNotIn(List<BigDecimal> values) {
            addCriterion("WQTY not in", values, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WQTY between", value1, value2, "wqty");
            return (Criteria) this;
        }

        public Criteria andWqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WQTY not between", value1, value2, "wqty");
            return (Criteria) this;
        }

        public Criteria andCqtyIsNull() {
            addCriterion("CQTY is null");
            return (Criteria) this;
        }

        public Criteria andCqtyIsNotNull() {
            addCriterion("CQTY is not null");
            return (Criteria) this;
        }

        public Criteria andCqtyEqualTo(BigDecimal value) {
            addCriterion("CQTY =", value, "cqty");
            return (Criteria) this;
        }

        public Criteria andCqtyNotEqualTo(BigDecimal value) {
            addCriterion("CQTY <>", value, "cqty");
            return (Criteria) this;
        }

        public Criteria andCqtyGreaterThan(BigDecimal value) {
            addCriterion("CQTY >", value, "cqty");
            return (Criteria) this;
        }

        public Criteria andCqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CQTY >=", value, "cqty");
            return (Criteria) this;
        }

        public Criteria andCqtyLessThan(BigDecimal value) {
            addCriterion("CQTY <", value, "cqty");
            return (Criteria) this;
        }

        public Criteria andCqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CQTY <=", value, "cqty");
            return (Criteria) this;
        }

        public Criteria andCqtyIn(List<BigDecimal> values) {
            addCriterion("CQTY in", values, "cqty");
            return (Criteria) this;
        }

        public Criteria andCqtyNotIn(List<BigDecimal> values) {
            addCriterion("CQTY not in", values, "cqty");
            return (Criteria) this;
        }

        public Criteria andCqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CQTY between", value1, value2, "cqty");
            return (Criteria) this;
        }

        public Criteria andCqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CQTY not between", value1, value2, "cqty");
            return (Criteria) this;
        }

        public Criteria andYqtyIsNull() {
            addCriterion("YQTY is null");
            return (Criteria) this;
        }

        public Criteria andYqtyIsNotNull() {
            addCriterion("YQTY is not null");
            return (Criteria) this;
        }

        public Criteria andYqtyEqualTo(BigDecimal value) {
            addCriterion("YQTY =", value, "yqty");
            return (Criteria) this;
        }

        public Criteria andYqtyNotEqualTo(BigDecimal value) {
            addCriterion("YQTY <>", value, "yqty");
            return (Criteria) this;
        }

        public Criteria andYqtyGreaterThan(BigDecimal value) {
            addCriterion("YQTY >", value, "yqty");
            return (Criteria) this;
        }

        public Criteria andYqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YQTY >=", value, "yqty");
            return (Criteria) this;
        }

        public Criteria andYqtyLessThan(BigDecimal value) {
            addCriterion("YQTY <", value, "yqty");
            return (Criteria) this;
        }

        public Criteria andYqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YQTY <=", value, "yqty");
            return (Criteria) this;
        }

        public Criteria andYqtyIn(List<BigDecimal> values) {
            addCriterion("YQTY in", values, "yqty");
            return (Criteria) this;
        }

        public Criteria andYqtyNotIn(List<BigDecimal> values) {
            addCriterion("YQTY not in", values, "yqty");
            return (Criteria) this;
        }

        public Criteria andYqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YQTY between", value1, value2, "yqty");
            return (Criteria) this;
        }

        public Criteria andYqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YQTY not between", value1, value2, "yqty");
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