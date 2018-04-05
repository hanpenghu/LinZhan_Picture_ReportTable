package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MfIcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MfIcExample() {
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

        public Criteria andVohIdIsNull() {
            addCriterion("VOH_ID is null");
            return (Criteria) this;
        }

        public Criteria andVohIdIsNotNull() {
            addCriterion("VOH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVohIdEqualTo(String value) {
            addCriterion("VOH_ID =", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotEqualTo(String value) {
            addCriterion("VOH_ID <>", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdGreaterThan(String value) {
            addCriterion("VOH_ID >", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdGreaterThanOrEqualTo(String value) {
            addCriterion("VOH_ID >=", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdLessThan(String value) {
            addCriterion("VOH_ID <", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdLessThanOrEqualTo(String value) {
            addCriterion("VOH_ID <=", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdLike(String value) {
            addCriterion("VOH_ID like", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotLike(String value) {
            addCriterion("VOH_ID not like", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdIn(List<String> values) {
            addCriterion("VOH_ID in", values, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotIn(List<String> values) {
            addCriterion("VOH_ID not in", values, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdBetween(String value1, String value2) {
            addCriterion("VOH_ID between", value1, value2, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotBetween(String value1, String value2) {
            addCriterion("VOH_ID not between", value1, value2, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohNoIsNull() {
            addCriterion("VOH_NO is null");
            return (Criteria) this;
        }

        public Criteria andVohNoIsNotNull() {
            addCriterion("VOH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVohNoEqualTo(String value) {
            addCriterion("VOH_NO =", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotEqualTo(String value) {
            addCriterion("VOH_NO <>", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoGreaterThan(String value) {
            addCriterion("VOH_NO >", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoGreaterThanOrEqualTo(String value) {
            addCriterion("VOH_NO >=", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoLessThan(String value) {
            addCriterion("VOH_NO <", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoLessThanOrEqualTo(String value) {
            addCriterion("VOH_NO <=", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoLike(String value) {
            addCriterion("VOH_NO like", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotLike(String value) {
            addCriterion("VOH_NO not like", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoIn(List<String> values) {
            addCriterion("VOH_NO in", values, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotIn(List<String> values) {
            addCriterion("VOH_NO not in", values, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoBetween(String value1, String value2) {
            addCriterion("VOH_NO between", value1, value2, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotBetween(String value1, String value2) {
            addCriterion("VOH_NO not between", value1, value2, "vohNo");
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

        public Criteria andUsrIsNull() {
            addCriterion("USR is null");
            return (Criteria) this;
        }

        public Criteria andUsrIsNotNull() {
            addCriterion("USR is not null");
            return (Criteria) this;
        }

        public Criteria andUsrEqualTo(String value) {
            addCriterion("USR =", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotEqualTo(String value) {
            addCriterion("USR <>", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrGreaterThan(String value) {
            addCriterion("USR >", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrGreaterThanOrEqualTo(String value) {
            addCriterion("USR >=", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLessThan(String value) {
            addCriterion("USR <", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLessThanOrEqualTo(String value) {
            addCriterion("USR <=", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLike(String value) {
            addCriterion("USR like", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotLike(String value) {
            addCriterion("USR not like", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrIn(List<String> values) {
            addCriterion("USR in", values, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotIn(List<String> values) {
            addCriterion("USR not in", values, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrBetween(String value1, String value2) {
            addCriterion("USR between", value1, value2, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotBetween(String value1, String value2) {
            addCriterion("USR not between", value1, value2, "usr");
            return (Criteria) this;
        }

        public Criteria andChkManIsNull() {
            addCriterion("CHK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andChkManIsNotNull() {
            addCriterion("CHK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andChkManEqualTo(String value) {
            addCriterion("CHK_MAN =", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotEqualTo(String value) {
            addCriterion("CHK_MAN <>", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManGreaterThan(String value) {
            addCriterion("CHK_MAN >", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_MAN >=", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLessThan(String value) {
            addCriterion("CHK_MAN <", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLessThanOrEqualTo(String value) {
            addCriterion("CHK_MAN <=", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLike(String value) {
            addCriterion("CHK_MAN like", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotLike(String value) {
            addCriterion("CHK_MAN not like", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManIn(List<String> values) {
            addCriterion("CHK_MAN in", values, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotIn(List<String> values) {
            addCriterion("CHK_MAN not in", values, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManBetween(String value1, String value2) {
            addCriterion("CHK_MAN between", value1, value2, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotBetween(String value1, String value2) {
            addCriterion("CHK_MAN not between", value1, value2, "chkMan");
            return (Criteria) this;
        }

        public Criteria andPrtSwIsNull() {
            addCriterion("PRT_SW is null");
            return (Criteria) this;
        }

        public Criteria andPrtSwIsNotNull() {
            addCriterion("PRT_SW is not null");
            return (Criteria) this;
        }

        public Criteria andPrtSwEqualTo(String value) {
            addCriterion("PRT_SW =", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotEqualTo(String value) {
            addCriterion("PRT_SW <>", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwGreaterThan(String value) {
            addCriterion("PRT_SW >", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwGreaterThanOrEqualTo(String value) {
            addCriterion("PRT_SW >=", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwLessThan(String value) {
            addCriterion("PRT_SW <", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwLessThanOrEqualTo(String value) {
            addCriterion("PRT_SW <=", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwLike(String value) {
            addCriterion("PRT_SW like", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotLike(String value) {
            addCriterion("PRT_SW not like", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwIn(List<String> values) {
            addCriterion("PRT_SW in", values, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotIn(List<String> values) {
            addCriterion("PRT_SW not in", values, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwBetween(String value1, String value2) {
            addCriterion("PRT_SW between", value1, value2, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotBetween(String value1, String value2) {
            addCriterion("PRT_SW not between", value1, value2, "prtSw");
            return (Criteria) this;
        }

        public Criteria andCpySwIsNull() {
            addCriterion("CPY_SW is null");
            return (Criteria) this;
        }

        public Criteria andCpySwIsNotNull() {
            addCriterion("CPY_SW is not null");
            return (Criteria) this;
        }

        public Criteria andCpySwEqualTo(String value) {
            addCriterion("CPY_SW =", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotEqualTo(String value) {
            addCriterion("CPY_SW <>", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwGreaterThan(String value) {
            addCriterion("CPY_SW >", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwGreaterThanOrEqualTo(String value) {
            addCriterion("CPY_SW >=", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLessThan(String value) {
            addCriterion("CPY_SW <", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLessThanOrEqualTo(String value) {
            addCriterion("CPY_SW <=", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLike(String value) {
            addCriterion("CPY_SW like", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotLike(String value) {
            addCriterion("CPY_SW not like", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwIn(List<String> values) {
            addCriterion("CPY_SW in", values, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotIn(List<String> values) {
            addCriterion("CPY_SW not in", values, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwBetween(String value1, String value2) {
            addCriterion("CPY_SW between", value1, value2, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotBetween(String value1, String value2) {
            addCriterion("CPY_SW not between", value1, value2, "cpySw");
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

        public Criteria andClsDateIsNull() {
            addCriterion("CLS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andClsDateIsNotNull() {
            addCriterion("CLS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andClsDateEqualTo(Date value) {
            addCriterion("CLS_DATE =", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotEqualTo(Date value) {
            addCriterion("CLS_DATE <>", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateGreaterThan(Date value) {
            addCriterion("CLS_DATE >", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CLS_DATE >=", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateLessThan(Date value) {
            addCriterion("CLS_DATE <", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateLessThanOrEqualTo(Date value) {
            addCriterion("CLS_DATE <=", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateIn(List<Date> values) {
            addCriterion("CLS_DATE in", values, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotIn(List<Date> values) {
            addCriterion("CLS_DATE not in", values, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateBetween(Date value1, Date value2) {
            addCriterion("CLS_DATE between", value1, value2, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotBetween(Date value1, Date value2) {
            addCriterion("CLS_DATE not between", value1, value2, "clsDate");
            return (Criteria) this;
        }

        public Criteria andPosIdIsNull() {
            addCriterion("POS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPosIdIsNotNull() {
            addCriterion("POS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPosIdEqualTo(String value) {
            addCriterion("POS_ID =", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotEqualTo(String value) {
            addCriterion("POS_ID <>", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThan(String value) {
            addCriterion("POS_ID >", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThanOrEqualTo(String value) {
            addCriterion("POS_ID >=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThan(String value) {
            addCriterion("POS_ID <", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThanOrEqualTo(String value) {
            addCriterion("POS_ID <=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLike(String value) {
            addCriterion("POS_ID like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotLike(String value) {
            addCriterion("POS_ID not like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdIn(List<String> values) {
            addCriterion("POS_ID in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotIn(List<String> values) {
            addCriterion("POS_ID not in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdBetween(String value1, String value2) {
            addCriterion("POS_ID between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotBetween(String value1, String value2) {
            addCriterion("POS_ID not between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andZyNoIsNull() {
            addCriterion("ZY_NO is null");
            return (Criteria) this;
        }

        public Criteria andZyNoIsNotNull() {
            addCriterion("ZY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andZyNoEqualTo(String value) {
            addCriterion("ZY_NO =", value, "zyNo");
            return (Criteria) this;
        }

        public Criteria andZyNoNotEqualTo(String value) {
            addCriterion("ZY_NO <>", value, "zyNo");
            return (Criteria) this;
        }

        public Criteria andZyNoGreaterThan(String value) {
            addCriterion("ZY_NO >", value, "zyNo");
            return (Criteria) this;
        }

        public Criteria andZyNoGreaterThanOrEqualTo(String value) {
            addCriterion("ZY_NO >=", value, "zyNo");
            return (Criteria) this;
        }

        public Criteria andZyNoLessThan(String value) {
            addCriterion("ZY_NO <", value, "zyNo");
            return (Criteria) this;
        }

        public Criteria andZyNoLessThanOrEqualTo(String value) {
            addCriterion("ZY_NO <=", value, "zyNo");
            return (Criteria) this;
        }

        public Criteria andZyNoLike(String value) {
            addCriterion("ZY_NO like", value, "zyNo");
            return (Criteria) this;
        }

        public Criteria andZyNoNotLike(String value) {
            addCriterion("ZY_NO not like", value, "zyNo");
            return (Criteria) this;
        }

        public Criteria andZyNoIn(List<String> values) {
            addCriterion("ZY_NO in", values, "zyNo");
            return (Criteria) this;
        }

        public Criteria andZyNoNotIn(List<String> values) {
            addCriterion("ZY_NO not in", values, "zyNo");
            return (Criteria) this;
        }

        public Criteria andZyNoBetween(String value1, String value2) {
            addCriterion("ZY_NO between", value1, value2, "zyNo");
            return (Criteria) this;
        }

        public Criteria andZyNoNotBetween(String value1, String value2) {
            addCriterion("ZY_NO not between", value1, value2, "zyNo");
            return (Criteria) this;
        }

        public Criteria andAmtnIsNull() {
            addCriterion("AMTN is null");
            return (Criteria) this;
        }

        public Criteria andAmtnIsNotNull() {
            addCriterion("AMTN is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnEqualTo(BigDecimal value) {
            addCriterion("AMTN =", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnNotEqualTo(BigDecimal value) {
            addCriterion("AMTN <>", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnGreaterThan(BigDecimal value) {
            addCriterion("AMTN >", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN >=", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnLessThan(BigDecimal value) {
            addCriterion("AMTN <", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN <=", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnIn(List<BigDecimal> values) {
            addCriterion("AMTN in", values, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnNotIn(List<BigDecimal> values) {
            addCriterion("AMTN not in", values, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN between", value1, value2, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN not between", value1, value2, "amtn");
            return (Criteria) this;
        }

        public Criteria andDepIsNull() {
            addCriterion("DEP is null");
            return (Criteria) this;
        }

        public Criteria andDepIsNotNull() {
            addCriterion("DEP is not null");
            return (Criteria) this;
        }

        public Criteria andDepEqualTo(String value) {
            addCriterion("DEP =", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotEqualTo(String value) {
            addCriterion("DEP <>", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepGreaterThan(String value) {
            addCriterion("DEP >", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepGreaterThanOrEqualTo(String value) {
            addCriterion("DEP >=", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLessThan(String value) {
            addCriterion("DEP <", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLessThanOrEqualTo(String value) {
            addCriterion("DEP <=", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLike(String value) {
            addCriterion("DEP like", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotLike(String value) {
            addCriterion("DEP not like", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepIn(List<String> values) {
            addCriterion("DEP in", values, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotIn(List<String> values) {
            addCriterion("DEP not in", values, "dep");
            return (Criteria) this;
        }

        public Criteria andDepBetween(String value1, String value2) {
            addCriterion("DEP between", value1, value2, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotBetween(String value1, String value2) {
            addCriterion("DEP not between", value1, value2, "dep");
            return (Criteria) this;
        }

        public Criteria andOutdepIsNull() {
            addCriterion("OUTDEP is null");
            return (Criteria) this;
        }

        public Criteria andOutdepIsNotNull() {
            addCriterion("OUTDEP is not null");
            return (Criteria) this;
        }

        public Criteria andOutdepEqualTo(String value) {
            addCriterion("OUTDEP =", value, "outdep");
            return (Criteria) this;
        }

        public Criteria andOutdepNotEqualTo(String value) {
            addCriterion("OUTDEP <>", value, "outdep");
            return (Criteria) this;
        }

        public Criteria andOutdepGreaterThan(String value) {
            addCriterion("OUTDEP >", value, "outdep");
            return (Criteria) this;
        }

        public Criteria andOutdepGreaterThanOrEqualTo(String value) {
            addCriterion("OUTDEP >=", value, "outdep");
            return (Criteria) this;
        }

        public Criteria andOutdepLessThan(String value) {
            addCriterion("OUTDEP <", value, "outdep");
            return (Criteria) this;
        }

        public Criteria andOutdepLessThanOrEqualTo(String value) {
            addCriterion("OUTDEP <=", value, "outdep");
            return (Criteria) this;
        }

        public Criteria andOutdepLike(String value) {
            addCriterion("OUTDEP like", value, "outdep");
            return (Criteria) this;
        }

        public Criteria andOutdepNotLike(String value) {
            addCriterion("OUTDEP not like", value, "outdep");
            return (Criteria) this;
        }

        public Criteria andOutdepIn(List<String> values) {
            addCriterion("OUTDEP in", values, "outdep");
            return (Criteria) this;
        }

        public Criteria andOutdepNotIn(List<String> values) {
            addCriterion("OUTDEP not in", values, "outdep");
            return (Criteria) this;
        }

        public Criteria andOutdepBetween(String value1, String value2) {
            addCriterion("OUTDEP between", value1, value2, "outdep");
            return (Criteria) this;
        }

        public Criteria andOutdepNotBetween(String value1, String value2) {
            addCriterion("OUTDEP not between", value1, value2, "outdep");
            return (Criteria) this;
        }

        public Criteria andReqDdIsNull() {
            addCriterion("REQ_DD is null");
            return (Criteria) this;
        }

        public Criteria andReqDdIsNotNull() {
            addCriterion("REQ_DD is not null");
            return (Criteria) this;
        }

        public Criteria andReqDdEqualTo(Date value) {
            addCriterion("REQ_DD =", value, "reqDd");
            return (Criteria) this;
        }

        public Criteria andReqDdNotEqualTo(Date value) {
            addCriterion("REQ_DD <>", value, "reqDd");
            return (Criteria) this;
        }

        public Criteria andReqDdGreaterThan(Date value) {
            addCriterion("REQ_DD >", value, "reqDd");
            return (Criteria) this;
        }

        public Criteria andReqDdGreaterThanOrEqualTo(Date value) {
            addCriterion("REQ_DD >=", value, "reqDd");
            return (Criteria) this;
        }

        public Criteria andReqDdLessThan(Date value) {
            addCriterion("REQ_DD <", value, "reqDd");
            return (Criteria) this;
        }

        public Criteria andReqDdLessThanOrEqualTo(Date value) {
            addCriterion("REQ_DD <=", value, "reqDd");
            return (Criteria) this;
        }

        public Criteria andReqDdIn(List<Date> values) {
            addCriterion("REQ_DD in", values, "reqDd");
            return (Criteria) this;
        }

        public Criteria andReqDdNotIn(List<Date> values) {
            addCriterion("REQ_DD not in", values, "reqDd");
            return (Criteria) this;
        }

        public Criteria andReqDdBetween(Date value1, Date value2) {
            addCriterion("REQ_DD between", value1, value2, "reqDd");
            return (Criteria) this;
        }

        public Criteria andReqDdNotBetween(Date value1, Date value2) {
            addCriterion("REQ_DD not between", value1, value2, "reqDd");
            return (Criteria) this;
        }

        public Criteria andGlNoIsNull() {
            addCriterion("GL_NO is null");
            return (Criteria) this;
        }

        public Criteria andGlNoIsNotNull() {
            addCriterion("GL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGlNoEqualTo(String value) {
            addCriterion("GL_NO =", value, "glNo");
            return (Criteria) this;
        }

        public Criteria andGlNoNotEqualTo(String value) {
            addCriterion("GL_NO <>", value, "glNo");
            return (Criteria) this;
        }

        public Criteria andGlNoGreaterThan(String value) {
            addCriterion("GL_NO >", value, "glNo");
            return (Criteria) this;
        }

        public Criteria andGlNoGreaterThanOrEqualTo(String value) {
            addCriterion("GL_NO >=", value, "glNo");
            return (Criteria) this;
        }

        public Criteria andGlNoLessThan(String value) {
            addCriterion("GL_NO <", value, "glNo");
            return (Criteria) this;
        }

        public Criteria andGlNoLessThanOrEqualTo(String value) {
            addCriterion("GL_NO <=", value, "glNo");
            return (Criteria) this;
        }

        public Criteria andGlNoLike(String value) {
            addCriterion("GL_NO like", value, "glNo");
            return (Criteria) this;
        }

        public Criteria andGlNoNotLike(String value) {
            addCriterion("GL_NO not like", value, "glNo");
            return (Criteria) this;
        }

        public Criteria andGlNoIn(List<String> values) {
            addCriterion("GL_NO in", values, "glNo");
            return (Criteria) this;
        }

        public Criteria andGlNoNotIn(List<String> values) {
            addCriterion("GL_NO not in", values, "glNo");
            return (Criteria) this;
        }

        public Criteria andGlNoBetween(String value1, String value2) {
            addCriterion("GL_NO between", value1, value2, "glNo");
            return (Criteria) this;
        }

        public Criteria andGlNoNotBetween(String value1, String value2) {
            addCriterion("GL_NO not between", value1, value2, "glNo");
            return (Criteria) this;
        }

        public Criteria andCasNoIsNull() {
            addCriterion("CAS_NO is null");
            return (Criteria) this;
        }

        public Criteria andCasNoIsNotNull() {
            addCriterion("CAS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCasNoEqualTo(String value) {
            addCriterion("CAS_NO =", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoNotEqualTo(String value) {
            addCriterion("CAS_NO <>", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoGreaterThan(String value) {
            addCriterion("CAS_NO >", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoGreaterThanOrEqualTo(String value) {
            addCriterion("CAS_NO >=", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoLessThan(String value) {
            addCriterion("CAS_NO <", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoLessThanOrEqualTo(String value) {
            addCriterion("CAS_NO <=", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoLike(String value) {
            addCriterion("CAS_NO like", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoNotLike(String value) {
            addCriterion("CAS_NO not like", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoIn(List<String> values) {
            addCriterion("CAS_NO in", values, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoNotIn(List<String> values) {
            addCriterion("CAS_NO not in", values, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoBetween(String value1, String value2) {
            addCriterion("CAS_NO between", value1, value2, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoNotBetween(String value1, String value2) {
            addCriterion("CAS_NO not between", value1, value2, "casNo");
            return (Criteria) this;
        }

        public Criteria andBilTypeIsNull() {
            addCriterion("BIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBilTypeIsNotNull() {
            addCriterion("BIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBilTypeEqualTo(String value) {
            addCriterion("BIL_TYPE =", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotEqualTo(String value) {
            addCriterion("BIL_TYPE <>", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeGreaterThan(String value) {
            addCriterion("BIL_TYPE >", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_TYPE >=", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLessThan(String value) {
            addCriterion("BIL_TYPE <", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLessThanOrEqualTo(String value) {
            addCriterion("BIL_TYPE <=", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLike(String value) {
            addCriterion("BIL_TYPE like", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotLike(String value) {
            addCriterion("BIL_TYPE not like", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeIn(List<String> values) {
            addCriterion("BIL_TYPE in", values, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotIn(List<String> values) {
            addCriterion("BIL_TYPE not in", values, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeBetween(String value1, String value2) {
            addCriterion("BIL_TYPE between", value1, value2, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotBetween(String value1, String value2) {
            addCriterion("BIL_TYPE not between", value1, value2, "bilType");
            return (Criteria) this;
        }

        public Criteria andSalNoIsNull() {
            addCriterion("SAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSalNoIsNotNull() {
            addCriterion("SAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSalNoEqualTo(String value) {
            addCriterion("SAL_NO =", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotEqualTo(String value) {
            addCriterion("SAL_NO <>", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoGreaterThan(String value) {
            addCriterion("SAL_NO >", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_NO >=", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLessThan(String value) {
            addCriterion("SAL_NO <", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLessThanOrEqualTo(String value) {
            addCriterion("SAL_NO <=", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLike(String value) {
            addCriterion("SAL_NO like", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotLike(String value) {
            addCriterion("SAL_NO not like", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoIn(List<String> values) {
            addCriterion("SAL_NO in", values, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotIn(List<String> values) {
            addCriterion("SAL_NO not in", values, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoBetween(String value1, String value2) {
            addCriterion("SAL_NO between", value1, value2, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotBetween(String value1, String value2) {
            addCriterion("SAL_NO not between", value1, value2, "salNo");
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

        public Criteria andMobIdIsNull() {
            addCriterion("MOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andMobIdIsNotNull() {
            addCriterion("MOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMobIdEqualTo(String value) {
            addCriterion("MOB_ID =", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotEqualTo(String value) {
            addCriterion("MOB_ID <>", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdGreaterThan(String value) {
            addCriterion("MOB_ID >", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdGreaterThanOrEqualTo(String value) {
            addCriterion("MOB_ID >=", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLessThan(String value) {
            addCriterion("MOB_ID <", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLessThanOrEqualTo(String value) {
            addCriterion("MOB_ID <=", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLike(String value) {
            addCriterion("MOB_ID like", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotLike(String value) {
            addCriterion("MOB_ID not like", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdIn(List<String> values) {
            addCriterion("MOB_ID in", values, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotIn(List<String> values) {
            addCriterion("MOB_ID not in", values, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdBetween(String value1, String value2) {
            addCriterion("MOB_ID between", value1, value2, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotBetween(String value1, String value2) {
            addCriterion("MOB_ID not between", value1, value2, "mobId");
            return (Criteria) this;
        }

        public Criteria andLockManIsNull() {
            addCriterion("LOCK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andLockManIsNotNull() {
            addCriterion("LOCK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andLockManEqualTo(String value) {
            addCriterion("LOCK_MAN =", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotEqualTo(String value) {
            addCriterion("LOCK_MAN <>", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManGreaterThan(String value) {
            addCriterion("LOCK_MAN >", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_MAN >=", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLessThan(String value) {
            addCriterion("LOCK_MAN <", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLessThanOrEqualTo(String value) {
            addCriterion("LOCK_MAN <=", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLike(String value) {
            addCriterion("LOCK_MAN like", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotLike(String value) {
            addCriterion("LOCK_MAN not like", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManIn(List<String> values) {
            addCriterion("LOCK_MAN in", values, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotIn(List<String> values) {
            addCriterion("LOCK_MAN not in", values, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManBetween(String value1, String value2) {
            addCriterion("LOCK_MAN between", value1, value2, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotBetween(String value1, String value2) {
            addCriterion("LOCK_MAN not between", value1, value2, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNull() {
            addCriterion("LOCK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNotNull() {
            addCriterion("LOCK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLockDateEqualTo(Date value) {
            addCriterion("LOCK_DATE =", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotEqualTo(Date value) {
            addCriterion("LOCK_DATE <>", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThan(Date value) {
            addCriterion("LOCK_DATE >", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCK_DATE >=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThan(Date value) {
            addCriterion("LOCK_DATE <", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThanOrEqualTo(Date value) {
            addCriterion("LOCK_DATE <=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateIn(List<Date> values) {
            addCriterion("LOCK_DATE in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotIn(List<Date> values) {
            addCriterion("LOCK_DATE not in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateBetween(Date value1, Date value2) {
            addCriterion("LOCK_DATE between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotBetween(Date value1, Date value2) {
            addCriterion("LOCK_DATE not between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andFjNumIsNull() {
            addCriterion("FJ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFjNumIsNotNull() {
            addCriterion("FJ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFjNumEqualTo(Short value) {
            addCriterion("FJ_NUM =", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumNotEqualTo(Short value) {
            addCriterion("FJ_NUM <>", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumGreaterThan(Short value) {
            addCriterion("FJ_NUM >", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumGreaterThanOrEqualTo(Short value) {
            addCriterion("FJ_NUM >=", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumLessThan(Short value) {
            addCriterion("FJ_NUM <", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumLessThanOrEqualTo(Short value) {
            addCriterion("FJ_NUM <=", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumIn(List<Short> values) {
            addCriterion("FJ_NUM in", values, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumNotIn(List<Short> values) {
            addCriterion("FJ_NUM not in", values, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumBetween(Short value1, Short value2) {
            addCriterion("FJ_NUM between", value1, value2, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumNotBetween(Short value1, Short value2) {
            addCriterion("FJ_NUM not between", value1, value2, "fjNum");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNull() {
            addCriterion("SYS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNotNull() {
            addCriterion("SYS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSysDateEqualTo(Date value) {
            addCriterion("SYS_DATE =", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotEqualTo(Date value) {
            addCriterion("SYS_DATE <>", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThan(Date value) {
            addCriterion("SYS_DATE >", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE >=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThan(Date value) {
            addCriterion("SYS_DATE <", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE <=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateIn(List<Date> values) {
            addCriterion("SYS_DATE in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotIn(List<Date> values) {
            addCriterion("SYS_DATE not in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE not between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andCusNo1IsNull() {
            addCriterion("CUS_NO1 is null");
            return (Criteria) this;
        }

        public Criteria andCusNo1IsNotNull() {
            addCriterion("CUS_NO1 is not null");
            return (Criteria) this;
        }

        public Criteria andCusNo1EqualTo(String value) {
            addCriterion("CUS_NO1 =", value, "cusNo1");
            return (Criteria) this;
        }

        public Criteria andCusNo1NotEqualTo(String value) {
            addCriterion("CUS_NO1 <>", value, "cusNo1");
            return (Criteria) this;
        }

        public Criteria andCusNo1GreaterThan(String value) {
            addCriterion("CUS_NO1 >", value, "cusNo1");
            return (Criteria) this;
        }

        public Criteria andCusNo1GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_NO1 >=", value, "cusNo1");
            return (Criteria) this;
        }

        public Criteria andCusNo1LessThan(String value) {
            addCriterion("CUS_NO1 <", value, "cusNo1");
            return (Criteria) this;
        }

        public Criteria andCusNo1LessThanOrEqualTo(String value) {
            addCriterion("CUS_NO1 <=", value, "cusNo1");
            return (Criteria) this;
        }

        public Criteria andCusNo1Like(String value) {
            addCriterion("CUS_NO1 like", value, "cusNo1");
            return (Criteria) this;
        }

        public Criteria andCusNo1NotLike(String value) {
            addCriterion("CUS_NO1 not like", value, "cusNo1");
            return (Criteria) this;
        }

        public Criteria andCusNo1In(List<String> values) {
            addCriterion("CUS_NO1 in", values, "cusNo1");
            return (Criteria) this;
        }

        public Criteria andCusNo1NotIn(List<String> values) {
            addCriterion("CUS_NO1 not in", values, "cusNo1");
            return (Criteria) this;
        }

        public Criteria andCusNo1Between(String value1, String value2) {
            addCriterion("CUS_NO1 between", value1, value2, "cusNo1");
            return (Criteria) this;
        }

        public Criteria andCusNo1NotBetween(String value1, String value2) {
            addCriterion("CUS_NO1 not between", value1, value2, "cusNo1");
            return (Criteria) this;
        }

        public Criteria andCusNo2IsNull() {
            addCriterion("CUS_NO2 is null");
            return (Criteria) this;
        }

        public Criteria andCusNo2IsNotNull() {
            addCriterion("CUS_NO2 is not null");
            return (Criteria) this;
        }

        public Criteria andCusNo2EqualTo(String value) {
            addCriterion("CUS_NO2 =", value, "cusNo2");
            return (Criteria) this;
        }

        public Criteria andCusNo2NotEqualTo(String value) {
            addCriterion("CUS_NO2 <>", value, "cusNo2");
            return (Criteria) this;
        }

        public Criteria andCusNo2GreaterThan(String value) {
            addCriterion("CUS_NO2 >", value, "cusNo2");
            return (Criteria) this;
        }

        public Criteria andCusNo2GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_NO2 >=", value, "cusNo2");
            return (Criteria) this;
        }

        public Criteria andCusNo2LessThan(String value) {
            addCriterion("CUS_NO2 <", value, "cusNo2");
            return (Criteria) this;
        }

        public Criteria andCusNo2LessThanOrEqualTo(String value) {
            addCriterion("CUS_NO2 <=", value, "cusNo2");
            return (Criteria) this;
        }

        public Criteria andCusNo2Like(String value) {
            addCriterion("CUS_NO2 like", value, "cusNo2");
            return (Criteria) this;
        }

        public Criteria andCusNo2NotLike(String value) {
            addCriterion("CUS_NO2 not like", value, "cusNo2");
            return (Criteria) this;
        }

        public Criteria andCusNo2In(List<String> values) {
            addCriterion("CUS_NO2 in", values, "cusNo2");
            return (Criteria) this;
        }

        public Criteria andCusNo2NotIn(List<String> values) {
            addCriterion("CUS_NO2 not in", values, "cusNo2");
            return (Criteria) this;
        }

        public Criteria andCusNo2Between(String value1, String value2) {
            addCriterion("CUS_NO2 between", value1, value2, "cusNo2");
            return (Criteria) this;
        }

        public Criteria andCusNo2NotBetween(String value1, String value2) {
            addCriterion("CUS_NO2 not between", value1, value2, "cusNo2");
            return (Criteria) this;
        }

        public Criteria andClsIdIsNull() {
            addCriterion("CLS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClsIdIsNotNull() {
            addCriterion("CLS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClsIdEqualTo(String value) {
            addCriterion("CLS_ID =", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotEqualTo(String value) {
            addCriterion("CLS_ID <>", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdGreaterThan(String value) {
            addCriterion("CLS_ID >", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLS_ID >=", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLessThan(String value) {
            addCriterion("CLS_ID <", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLessThanOrEqualTo(String value) {
            addCriterion("CLS_ID <=", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLike(String value) {
            addCriterion("CLS_ID like", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotLike(String value) {
            addCriterion("CLS_ID not like", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdIn(List<String> values) {
            addCriterion("CLS_ID in", values, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotIn(List<String> values) {
            addCriterion("CLS_ID not in", values, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdBetween(String value1, String value2) {
            addCriterion("CLS_ID between", value1, value2, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotBetween(String value1, String value2) {
            addCriterion("CLS_ID not between", value1, value2, "clsId");
            return (Criteria) this;
        }

        public Criteria andByboxIsNull() {
            addCriterion("BYBOX is null");
            return (Criteria) this;
        }

        public Criteria andByboxIsNotNull() {
            addCriterion("BYBOX is not null");
            return (Criteria) this;
        }

        public Criteria andByboxEqualTo(String value) {
            addCriterion("BYBOX =", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxNotEqualTo(String value) {
            addCriterion("BYBOX <>", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxGreaterThan(String value) {
            addCriterion("BYBOX >", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxGreaterThanOrEqualTo(String value) {
            addCriterion("BYBOX >=", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxLessThan(String value) {
            addCriterion("BYBOX <", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxLessThanOrEqualTo(String value) {
            addCriterion("BYBOX <=", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxLike(String value) {
            addCriterion("BYBOX like", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxNotLike(String value) {
            addCriterion("BYBOX not like", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxIn(List<String> values) {
            addCriterion("BYBOX in", values, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxNotIn(List<String> values) {
            addCriterion("BYBOX not in", values, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxBetween(String value1, String value2) {
            addCriterion("BYBOX between", value1, value2, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxNotBetween(String value1, String value2) {
            addCriterion("BYBOX not between", value1, value2, "bybox");
            return (Criteria) this;
        }

        public Criteria andTotBoxIsNull() {
            addCriterion("TOT_BOX is null");
            return (Criteria) this;
        }

        public Criteria andTotBoxIsNotNull() {
            addCriterion("TOT_BOX is not null");
            return (Criteria) this;
        }

        public Criteria andTotBoxEqualTo(BigDecimal value) {
            addCriterion("TOT_BOX =", value, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxNotEqualTo(BigDecimal value) {
            addCriterion("TOT_BOX <>", value, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxGreaterThan(BigDecimal value) {
            addCriterion("TOT_BOX >", value, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOT_BOX >=", value, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxLessThan(BigDecimal value) {
            addCriterion("TOT_BOX <", value, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOT_BOX <=", value, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxIn(List<BigDecimal> values) {
            addCriterion("TOT_BOX in", values, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxNotIn(List<BigDecimal> values) {
            addCriterion("TOT_BOX not in", values, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOT_BOX between", value1, value2, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOT_BOX not between", value1, value2, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotQtyIsNull() {
            addCriterion("TOT_QTY is null");
            return (Criteria) this;
        }

        public Criteria andTotQtyIsNotNull() {
            addCriterion("TOT_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andTotQtyEqualTo(BigDecimal value) {
            addCriterion("TOT_QTY =", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyNotEqualTo(BigDecimal value) {
            addCriterion("TOT_QTY <>", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyGreaterThan(BigDecimal value) {
            addCriterion("TOT_QTY >", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOT_QTY >=", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyLessThan(BigDecimal value) {
            addCriterion("TOT_QTY <", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOT_QTY <=", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyIn(List<BigDecimal> values) {
            addCriterion("TOT_QTY in", values, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyNotIn(List<BigDecimal> values) {
            addCriterion("TOT_QTY not in", values, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOT_QTY between", value1, value2, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOT_QTY not between", value1, value2, "totQty");
            return (Criteria) this;
        }

        public Criteria andOsNoIsNull() {
            addCriterion("OS_NO is null");
            return (Criteria) this;
        }

        public Criteria andOsNoIsNotNull() {
            addCriterion("OS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOsNoEqualTo(String value) {
            addCriterion("OS_NO =", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoNotEqualTo(String value) {
            addCriterion("OS_NO <>", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoGreaterThan(String value) {
            addCriterion("OS_NO >", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoGreaterThanOrEqualTo(String value) {
            addCriterion("OS_NO >=", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoLessThan(String value) {
            addCriterion("OS_NO <", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoLessThanOrEqualTo(String value) {
            addCriterion("OS_NO <=", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoLike(String value) {
            addCriterion("OS_NO like", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoNotLike(String value) {
            addCriterion("OS_NO not like", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoIn(List<String> values) {
            addCriterion("OS_NO in", values, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoNotIn(List<String> values) {
            addCriterion("OS_NO not in", values, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoBetween(String value1, String value2) {
            addCriterion("OS_NO between", value1, value2, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoNotBetween(String value1, String value2) {
            addCriterion("OS_NO not between", value1, value2, "osNo");
            return (Criteria) this;
        }

        public Criteria andLzClsIdIsNull() {
            addCriterion("LZ_CLS_ID is null");
            return (Criteria) this;
        }

        public Criteria andLzClsIdIsNotNull() {
            addCriterion("LZ_CLS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLzClsIdEqualTo(String value) {
            addCriterion("LZ_CLS_ID =", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdNotEqualTo(String value) {
            addCriterion("LZ_CLS_ID <>", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdGreaterThan(String value) {
            addCriterion("LZ_CLS_ID >", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdGreaterThanOrEqualTo(String value) {
            addCriterion("LZ_CLS_ID >=", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdLessThan(String value) {
            addCriterion("LZ_CLS_ID <", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdLessThanOrEqualTo(String value) {
            addCriterion("LZ_CLS_ID <=", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdLike(String value) {
            addCriterion("LZ_CLS_ID like", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdNotLike(String value) {
            addCriterion("LZ_CLS_ID not like", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdIn(List<String> values) {
            addCriterion("LZ_CLS_ID in", values, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdNotIn(List<String> values) {
            addCriterion("LZ_CLS_ID not in", values, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdBetween(String value1, String value2) {
            addCriterion("LZ_CLS_ID between", value1, value2, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdNotBetween(String value1, String value2) {
            addCriterion("LZ_CLS_ID not between", value1, value2, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andSalNo2IsNull() {
            addCriterion("SAL_NO2 is null");
            return (Criteria) this;
        }

        public Criteria andSalNo2IsNotNull() {
            addCriterion("SAL_NO2 is not null");
            return (Criteria) this;
        }

        public Criteria andSalNo2EqualTo(String value) {
            addCriterion("SAL_NO2 =", value, "salNo2");
            return (Criteria) this;
        }

        public Criteria andSalNo2NotEqualTo(String value) {
            addCriterion("SAL_NO2 <>", value, "salNo2");
            return (Criteria) this;
        }

        public Criteria andSalNo2GreaterThan(String value) {
            addCriterion("SAL_NO2 >", value, "salNo2");
            return (Criteria) this;
        }

        public Criteria andSalNo2GreaterThanOrEqualTo(String value) {
            addCriterion("SAL_NO2 >=", value, "salNo2");
            return (Criteria) this;
        }

        public Criteria andSalNo2LessThan(String value) {
            addCriterion("SAL_NO2 <", value, "salNo2");
            return (Criteria) this;
        }

        public Criteria andSalNo2LessThanOrEqualTo(String value) {
            addCriterion("SAL_NO2 <=", value, "salNo2");
            return (Criteria) this;
        }

        public Criteria andSalNo2Like(String value) {
            addCriterion("SAL_NO2 like", value, "salNo2");
            return (Criteria) this;
        }

        public Criteria andSalNo2NotLike(String value) {
            addCriterion("SAL_NO2 not like", value, "salNo2");
            return (Criteria) this;
        }

        public Criteria andSalNo2In(List<String> values) {
            addCriterion("SAL_NO2 in", values, "salNo2");
            return (Criteria) this;
        }

        public Criteria andSalNo2NotIn(List<String> values) {
            addCriterion("SAL_NO2 not in", values, "salNo2");
            return (Criteria) this;
        }

        public Criteria andSalNo2Between(String value1, String value2) {
            addCriterion("SAL_NO2 between", value1, value2, "salNo2");
            return (Criteria) this;
        }

        public Criteria andSalNo2NotBetween(String value1, String value2) {
            addCriterion("SAL_NO2 not between", value1, value2, "salNo2");
            return (Criteria) this;
        }

        public Criteria andPrtUsrIsNull() {
            addCriterion("PRT_USR is null");
            return (Criteria) this;
        }

        public Criteria andPrtUsrIsNotNull() {
            addCriterion("PRT_USR is not null");
            return (Criteria) this;
        }

        public Criteria andPrtUsrEqualTo(String value) {
            addCriterion("PRT_USR =", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotEqualTo(String value) {
            addCriterion("PRT_USR <>", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrGreaterThan(String value) {
            addCriterion("PRT_USR >", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrGreaterThanOrEqualTo(String value) {
            addCriterion("PRT_USR >=", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrLessThan(String value) {
            addCriterion("PRT_USR <", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrLessThanOrEqualTo(String value) {
            addCriterion("PRT_USR <=", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrLike(String value) {
            addCriterion("PRT_USR like", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotLike(String value) {
            addCriterion("PRT_USR not like", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrIn(List<String> values) {
            addCriterion("PRT_USR in", values, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotIn(List<String> values) {
            addCriterion("PRT_USR not in", values, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrBetween(String value1, String value2) {
            addCriterion("PRT_USR between", value1, value2, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotBetween(String value1, String value2) {
            addCriterion("PRT_USR not between", value1, value2, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andAmtClsIsNull() {
            addCriterion("AMT_CLS is null");
            return (Criteria) this;
        }

        public Criteria andAmtClsIsNotNull() {
            addCriterion("AMT_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtClsEqualTo(BigDecimal value) {
            addCriterion("AMT_CLS =", value, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsNotEqualTo(BigDecimal value) {
            addCriterion("AMT_CLS <>", value, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsGreaterThan(BigDecimal value) {
            addCriterion("AMT_CLS >", value, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_CLS >=", value, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsLessThan(BigDecimal value) {
            addCriterion("AMT_CLS <", value, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_CLS <=", value, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsIn(List<BigDecimal> values) {
            addCriterion("AMT_CLS in", values, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsNotIn(List<BigDecimal> values) {
            addCriterion("AMT_CLS not in", values, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_CLS between", value1, value2, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_CLS not between", value1, value2, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsIsNull() {
            addCriterion("AMTN_NET_CLS is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsIsNotNull() {
            addCriterion("AMTN_NET_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_CLS =", value, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_CLS <>", value, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_CLS >", value, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_CLS >=", value, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_CLS <", value, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_CLS <=", value, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_CLS in", values, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_CLS not in", values, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_CLS between", value1, value2, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_CLS not between", value1, value2, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsIsNull() {
            addCriterion("TAX_CLS is null");
            return (Criteria) this;
        }

        public Criteria andTaxClsIsNotNull() {
            addCriterion("TAX_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxClsEqualTo(BigDecimal value) {
            addCriterion("TAX_CLS =", value, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsNotEqualTo(BigDecimal value) {
            addCriterion("TAX_CLS <>", value, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsGreaterThan(BigDecimal value) {
            addCriterion("TAX_CLS >", value, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_CLS >=", value, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsLessThan(BigDecimal value) {
            addCriterion("TAX_CLS <", value, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_CLS <=", value, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsIn(List<BigDecimal> values) {
            addCriterion("TAX_CLS in", values, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsNotIn(List<BigDecimal> values) {
            addCriterion("TAX_CLS not in", values, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_CLS between", value1, value2, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_CLS not between", value1, value2, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTurnIdIsNull() {
            addCriterion("TURN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTurnIdIsNotNull() {
            addCriterion("TURN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTurnIdEqualTo(String value) {
            addCriterion("TURN_ID =", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdNotEqualTo(String value) {
            addCriterion("TURN_ID <>", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdGreaterThan(String value) {
            addCriterion("TURN_ID >", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdGreaterThanOrEqualTo(String value) {
            addCriterion("TURN_ID >=", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdLessThan(String value) {
            addCriterion("TURN_ID <", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdLessThanOrEqualTo(String value) {
            addCriterion("TURN_ID <=", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdLike(String value) {
            addCriterion("TURN_ID like", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdNotLike(String value) {
            addCriterion("TURN_ID not like", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdIn(List<String> values) {
            addCriterion("TURN_ID in", values, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdNotIn(List<String> values) {
            addCriterion("TURN_ID not in", values, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdBetween(String value1, String value2) {
            addCriterion("TURN_ID between", value1, value2, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdNotBetween(String value1, String value2) {
            addCriterion("TURN_ID not between", value1, value2, "turnId");
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

        public Criteria andLzClsId2IsNull() {
            addCriterion("LZ_CLS_ID2 is null");
            return (Criteria) this;
        }

        public Criteria andLzClsId2IsNotNull() {
            addCriterion("LZ_CLS_ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andLzClsId2EqualTo(String value) {
            addCriterion("LZ_CLS_ID2 =", value, "lzClsId2");
            return (Criteria) this;
        }

        public Criteria andLzClsId2NotEqualTo(String value) {
            addCriterion("LZ_CLS_ID2 <>", value, "lzClsId2");
            return (Criteria) this;
        }

        public Criteria andLzClsId2GreaterThan(String value) {
            addCriterion("LZ_CLS_ID2 >", value, "lzClsId2");
            return (Criteria) this;
        }

        public Criteria andLzClsId2GreaterThanOrEqualTo(String value) {
            addCriterion("LZ_CLS_ID2 >=", value, "lzClsId2");
            return (Criteria) this;
        }

        public Criteria andLzClsId2LessThan(String value) {
            addCriterion("LZ_CLS_ID2 <", value, "lzClsId2");
            return (Criteria) this;
        }

        public Criteria andLzClsId2LessThanOrEqualTo(String value) {
            addCriterion("LZ_CLS_ID2 <=", value, "lzClsId2");
            return (Criteria) this;
        }

        public Criteria andLzClsId2Like(String value) {
            addCriterion("LZ_CLS_ID2 like", value, "lzClsId2");
            return (Criteria) this;
        }

        public Criteria andLzClsId2NotLike(String value) {
            addCriterion("LZ_CLS_ID2 not like", value, "lzClsId2");
            return (Criteria) this;
        }

        public Criteria andLzClsId2In(List<String> values) {
            addCriterion("LZ_CLS_ID2 in", values, "lzClsId2");
            return (Criteria) this;
        }

        public Criteria andLzClsId2NotIn(List<String> values) {
            addCriterion("LZ_CLS_ID2 not in", values, "lzClsId2");
            return (Criteria) this;
        }

        public Criteria andLzClsId2Between(String value1, String value2) {
            addCriterion("LZ_CLS_ID2 between", value1, value2, "lzClsId2");
            return (Criteria) this;
        }

        public Criteria andLzClsId2NotBetween(String value1, String value2) {
            addCriterion("LZ_CLS_ID2 not between", value1, value2, "lzClsId2");
            return (Criteria) this;
        }

        public Criteria andAmtCls2IsNull() {
            addCriterion("AMT_CLS2 is null");
            return (Criteria) this;
        }

        public Criteria andAmtCls2IsNotNull() {
            addCriterion("AMT_CLS2 is not null");
            return (Criteria) this;
        }

        public Criteria andAmtCls2EqualTo(BigDecimal value) {
            addCriterion("AMT_CLS2 =", value, "amtCls2");
            return (Criteria) this;
        }

        public Criteria andAmtCls2NotEqualTo(BigDecimal value) {
            addCriterion("AMT_CLS2 <>", value, "amtCls2");
            return (Criteria) this;
        }

        public Criteria andAmtCls2GreaterThan(BigDecimal value) {
            addCriterion("AMT_CLS2 >", value, "amtCls2");
            return (Criteria) this;
        }

        public Criteria andAmtCls2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_CLS2 >=", value, "amtCls2");
            return (Criteria) this;
        }

        public Criteria andAmtCls2LessThan(BigDecimal value) {
            addCriterion("AMT_CLS2 <", value, "amtCls2");
            return (Criteria) this;
        }

        public Criteria andAmtCls2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_CLS2 <=", value, "amtCls2");
            return (Criteria) this;
        }

        public Criteria andAmtCls2In(List<BigDecimal> values) {
            addCriterion("AMT_CLS2 in", values, "amtCls2");
            return (Criteria) this;
        }

        public Criteria andAmtCls2NotIn(List<BigDecimal> values) {
            addCriterion("AMT_CLS2 not in", values, "amtCls2");
            return (Criteria) this;
        }

        public Criteria andAmtCls2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_CLS2 between", value1, value2, "amtCls2");
            return (Criteria) this;
        }

        public Criteria andAmtCls2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_CLS2 not between", value1, value2, "amtCls2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetCls2IsNull() {
            addCriterion("AMTN_NET_CLS2 is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetCls2IsNotNull() {
            addCriterion("AMTN_NET_CLS2 is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetCls2EqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_CLS2 =", value, "amtnNetCls2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetCls2NotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_CLS2 <>", value, "amtnNetCls2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetCls2GreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_CLS2 >", value, "amtnNetCls2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetCls2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_CLS2 >=", value, "amtnNetCls2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetCls2LessThan(BigDecimal value) {
            addCriterion("AMTN_NET_CLS2 <", value, "amtnNetCls2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetCls2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_CLS2 <=", value, "amtnNetCls2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetCls2In(List<BigDecimal> values) {
            addCriterion("AMTN_NET_CLS2 in", values, "amtnNetCls2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetCls2NotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_CLS2 not in", values, "amtnNetCls2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetCls2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_CLS2 between", value1, value2, "amtnNetCls2");
            return (Criteria) this;
        }

        public Criteria andAmtnNetCls2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_CLS2 not between", value1, value2, "amtnNetCls2");
            return (Criteria) this;
        }

        public Criteria andTaxCls2IsNull() {
            addCriterion("TAX_CLS2 is null");
            return (Criteria) this;
        }

        public Criteria andTaxCls2IsNotNull() {
            addCriterion("TAX_CLS2 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCls2EqualTo(BigDecimal value) {
            addCriterion("TAX_CLS2 =", value, "taxCls2");
            return (Criteria) this;
        }

        public Criteria andTaxCls2NotEqualTo(BigDecimal value) {
            addCriterion("TAX_CLS2 <>", value, "taxCls2");
            return (Criteria) this;
        }

        public Criteria andTaxCls2GreaterThan(BigDecimal value) {
            addCriterion("TAX_CLS2 >", value, "taxCls2");
            return (Criteria) this;
        }

        public Criteria andTaxCls2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_CLS2 >=", value, "taxCls2");
            return (Criteria) this;
        }

        public Criteria andTaxCls2LessThan(BigDecimal value) {
            addCriterion("TAX_CLS2 <", value, "taxCls2");
            return (Criteria) this;
        }

        public Criteria andTaxCls2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_CLS2 <=", value, "taxCls2");
            return (Criteria) this;
        }

        public Criteria andTaxCls2In(List<BigDecimal> values) {
            addCriterion("TAX_CLS2 in", values, "taxCls2");
            return (Criteria) this;
        }

        public Criteria andTaxCls2NotIn(List<BigDecimal> values) {
            addCriterion("TAX_CLS2 not in", values, "taxCls2");
            return (Criteria) this;
        }

        public Criteria andTaxCls2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_CLS2 between", value1, value2, "taxCls2");
            return (Criteria) this;
        }

        public Criteria andTaxCls2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_CLS2 not between", value1, value2, "taxCls2");
            return (Criteria) this;
        }

        public Criteria andTurnId2IsNull() {
            addCriterion("TURN_ID2 is null");
            return (Criteria) this;
        }

        public Criteria andTurnId2IsNotNull() {
            addCriterion("TURN_ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andTurnId2EqualTo(String value) {
            addCriterion("TURN_ID2 =", value, "turnId2");
            return (Criteria) this;
        }

        public Criteria andTurnId2NotEqualTo(String value) {
            addCriterion("TURN_ID2 <>", value, "turnId2");
            return (Criteria) this;
        }

        public Criteria andTurnId2GreaterThan(String value) {
            addCriterion("TURN_ID2 >", value, "turnId2");
            return (Criteria) this;
        }

        public Criteria andTurnId2GreaterThanOrEqualTo(String value) {
            addCriterion("TURN_ID2 >=", value, "turnId2");
            return (Criteria) this;
        }

        public Criteria andTurnId2LessThan(String value) {
            addCriterion("TURN_ID2 <", value, "turnId2");
            return (Criteria) this;
        }

        public Criteria andTurnId2LessThanOrEqualTo(String value) {
            addCriterion("TURN_ID2 <=", value, "turnId2");
            return (Criteria) this;
        }

        public Criteria andTurnId2Like(String value) {
            addCriterion("TURN_ID2 like", value, "turnId2");
            return (Criteria) this;
        }

        public Criteria andTurnId2NotLike(String value) {
            addCriterion("TURN_ID2 not like", value, "turnId2");
            return (Criteria) this;
        }

        public Criteria andTurnId2In(List<String> values) {
            addCriterion("TURN_ID2 in", values, "turnId2");
            return (Criteria) this;
        }

        public Criteria andTurnId2NotIn(List<String> values) {
            addCriterion("TURN_ID2 not in", values, "turnId2");
            return (Criteria) this;
        }

        public Criteria andTurnId2Between(String value1, String value2) {
            addCriterion("TURN_ID2 between", value1, value2, "turnId2");
            return (Criteria) this;
        }

        public Criteria andTurnId2NotBetween(String value1, String value2) {
            addCriterion("TURN_ID2 not between", value1, value2, "turnId2");
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

        public Criteria andEpNoIsNull() {
            addCriterion("EP_NO is null");
            return (Criteria) this;
        }

        public Criteria andEpNoIsNotNull() {
            addCriterion("EP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEpNoEqualTo(String value) {
            addCriterion("EP_NO =", value, "epNo");
            return (Criteria) this;
        }

        public Criteria andEpNoNotEqualTo(String value) {
            addCriterion("EP_NO <>", value, "epNo");
            return (Criteria) this;
        }

        public Criteria andEpNoGreaterThan(String value) {
            addCriterion("EP_NO >", value, "epNo");
            return (Criteria) this;
        }

        public Criteria andEpNoGreaterThanOrEqualTo(String value) {
            addCriterion("EP_NO >=", value, "epNo");
            return (Criteria) this;
        }

        public Criteria andEpNoLessThan(String value) {
            addCriterion("EP_NO <", value, "epNo");
            return (Criteria) this;
        }

        public Criteria andEpNoLessThanOrEqualTo(String value) {
            addCriterion("EP_NO <=", value, "epNo");
            return (Criteria) this;
        }

        public Criteria andEpNoLike(String value) {
            addCriterion("EP_NO like", value, "epNo");
            return (Criteria) this;
        }

        public Criteria andEpNoNotLike(String value) {
            addCriterion("EP_NO not like", value, "epNo");
            return (Criteria) this;
        }

        public Criteria andEpNoIn(List<String> values) {
            addCriterion("EP_NO in", values, "epNo");
            return (Criteria) this;
        }

        public Criteria andEpNoNotIn(List<String> values) {
            addCriterion("EP_NO not in", values, "epNo");
            return (Criteria) this;
        }

        public Criteria andEpNoBetween(String value1, String value2) {
            addCriterion("EP_NO between", value1, value2, "epNo");
            return (Criteria) this;
        }

        public Criteria andEpNoNotBetween(String value1, String value2) {
            addCriterion("EP_NO not between", value1, value2, "epNo");
            return (Criteria) this;
        }

        public Criteria andDepDsIsNull() {
            addCriterion("DEP_DS is null");
            return (Criteria) this;
        }

        public Criteria andDepDsIsNotNull() {
            addCriterion("DEP_DS is not null");
            return (Criteria) this;
        }

        public Criteria andDepDsEqualTo(String value) {
            addCriterion("DEP_DS =", value, "depDs");
            return (Criteria) this;
        }

        public Criteria andDepDsNotEqualTo(String value) {
            addCriterion("DEP_DS <>", value, "depDs");
            return (Criteria) this;
        }

        public Criteria andDepDsGreaterThan(String value) {
            addCriterion("DEP_DS >", value, "depDs");
            return (Criteria) this;
        }

        public Criteria andDepDsGreaterThanOrEqualTo(String value) {
            addCriterion("DEP_DS >=", value, "depDs");
            return (Criteria) this;
        }

        public Criteria andDepDsLessThan(String value) {
            addCriterion("DEP_DS <", value, "depDs");
            return (Criteria) this;
        }

        public Criteria andDepDsLessThanOrEqualTo(String value) {
            addCriterion("DEP_DS <=", value, "depDs");
            return (Criteria) this;
        }

        public Criteria andDepDsLike(String value) {
            addCriterion("DEP_DS like", value, "depDs");
            return (Criteria) this;
        }

        public Criteria andDepDsNotLike(String value) {
            addCriterion("DEP_DS not like", value, "depDs");
            return (Criteria) this;
        }

        public Criteria andDepDsIn(List<String> values) {
            addCriterion("DEP_DS in", values, "depDs");
            return (Criteria) this;
        }

        public Criteria andDepDsNotIn(List<String> values) {
            addCriterion("DEP_DS not in", values, "depDs");
            return (Criteria) this;
        }

        public Criteria andDepDsBetween(String value1, String value2) {
            addCriterion("DEP_DS between", value1, value2, "depDs");
            return (Criteria) this;
        }

        public Criteria andDepDsNotBetween(String value1, String value2) {
            addCriterion("DEP_DS not between", value1, value2, "depDs");
            return (Criteria) this;
        }

        public Criteria andSalDsIsNull() {
            addCriterion("SAL_DS is null");
            return (Criteria) this;
        }

        public Criteria andSalDsIsNotNull() {
            addCriterion("SAL_DS is not null");
            return (Criteria) this;
        }

        public Criteria andSalDsEqualTo(String value) {
            addCriterion("SAL_DS =", value, "salDs");
            return (Criteria) this;
        }

        public Criteria andSalDsNotEqualTo(String value) {
            addCriterion("SAL_DS <>", value, "salDs");
            return (Criteria) this;
        }

        public Criteria andSalDsGreaterThan(String value) {
            addCriterion("SAL_DS >", value, "salDs");
            return (Criteria) this;
        }

        public Criteria andSalDsGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_DS >=", value, "salDs");
            return (Criteria) this;
        }

        public Criteria andSalDsLessThan(String value) {
            addCriterion("SAL_DS <", value, "salDs");
            return (Criteria) this;
        }

        public Criteria andSalDsLessThanOrEqualTo(String value) {
            addCriterion("SAL_DS <=", value, "salDs");
            return (Criteria) this;
        }

        public Criteria andSalDsLike(String value) {
            addCriterion("SAL_DS like", value, "salDs");
            return (Criteria) this;
        }

        public Criteria andSalDsNotLike(String value) {
            addCriterion("SAL_DS not like", value, "salDs");
            return (Criteria) this;
        }

        public Criteria andSalDsIn(List<String> values) {
            addCriterion("SAL_DS in", values, "salDs");
            return (Criteria) this;
        }

        public Criteria andSalDsNotIn(List<String> values) {
            addCriterion("SAL_DS not in", values, "salDs");
            return (Criteria) this;
        }

        public Criteria andSalDsBetween(String value1, String value2) {
            addCriterion("SAL_DS between", value1, value2, "salDs");
            return (Criteria) this;
        }

        public Criteria andSalDsNotBetween(String value1, String value2) {
            addCriterion("SAL_DS not between", value1, value2, "salDs");
            return (Criteria) this;
        }

        public Criteria andQtyClsIsNull() {
            addCriterion("QTY_CLS is null");
            return (Criteria) this;
        }

        public Criteria andQtyClsIsNotNull() {
            addCriterion("QTY_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andQtyClsEqualTo(BigDecimal value) {
            addCriterion("QTY_CLS =", value, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsNotEqualTo(BigDecimal value) {
            addCriterion("QTY_CLS <>", value, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsGreaterThan(BigDecimal value) {
            addCriterion("QTY_CLS >", value, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CLS >=", value, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsLessThan(BigDecimal value) {
            addCriterion("QTY_CLS <", value, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CLS <=", value, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsIn(List<BigDecimal> values) {
            addCriterion("QTY_CLS in", values, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsNotIn(List<BigDecimal> values) {
            addCriterion("QTY_CLS not in", values, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CLS between", value1, value2, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CLS not between", value1, value2, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyCls2IsNull() {
            addCriterion("QTY_CLS2 is null");
            return (Criteria) this;
        }

        public Criteria andQtyCls2IsNotNull() {
            addCriterion("QTY_CLS2 is not null");
            return (Criteria) this;
        }

        public Criteria andQtyCls2EqualTo(BigDecimal value) {
            addCriterion("QTY_CLS2 =", value, "qtyCls2");
            return (Criteria) this;
        }

        public Criteria andQtyCls2NotEqualTo(BigDecimal value) {
            addCriterion("QTY_CLS2 <>", value, "qtyCls2");
            return (Criteria) this;
        }

        public Criteria andQtyCls2GreaterThan(BigDecimal value) {
            addCriterion("QTY_CLS2 >", value, "qtyCls2");
            return (Criteria) this;
        }

        public Criteria andQtyCls2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CLS2 >=", value, "qtyCls2");
            return (Criteria) this;
        }

        public Criteria andQtyCls2LessThan(BigDecimal value) {
            addCriterion("QTY_CLS2 <", value, "qtyCls2");
            return (Criteria) this;
        }

        public Criteria andQtyCls2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CLS2 <=", value, "qtyCls2");
            return (Criteria) this;
        }

        public Criteria andQtyCls2In(List<BigDecimal> values) {
            addCriterion("QTY_CLS2 in", values, "qtyCls2");
            return (Criteria) this;
        }

        public Criteria andQtyCls2NotIn(List<BigDecimal> values) {
            addCriterion("QTY_CLS2 not in", values, "qtyCls2");
            return (Criteria) this;
        }

        public Criteria andQtyCls2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CLS2 between", value1, value2, "qtyCls2");
            return (Criteria) this;
        }

        public Criteria andQtyCls2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CLS2 not between", value1, value2, "qtyCls2");
            return (Criteria) this;
        }

        public Criteria andIzBackIdIsNull() {
            addCriterion("IZ_BACK_ID is null");
            return (Criteria) this;
        }

        public Criteria andIzBackIdIsNotNull() {
            addCriterion("IZ_BACK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIzBackIdEqualTo(String value) {
            addCriterion("IZ_BACK_ID =", value, "izBackId");
            return (Criteria) this;
        }

        public Criteria andIzBackIdNotEqualTo(String value) {
            addCriterion("IZ_BACK_ID <>", value, "izBackId");
            return (Criteria) this;
        }

        public Criteria andIzBackIdGreaterThan(String value) {
            addCriterion("IZ_BACK_ID >", value, "izBackId");
            return (Criteria) this;
        }

        public Criteria andIzBackIdGreaterThanOrEqualTo(String value) {
            addCriterion("IZ_BACK_ID >=", value, "izBackId");
            return (Criteria) this;
        }

        public Criteria andIzBackIdLessThan(String value) {
            addCriterion("IZ_BACK_ID <", value, "izBackId");
            return (Criteria) this;
        }

        public Criteria andIzBackIdLessThanOrEqualTo(String value) {
            addCriterion("IZ_BACK_ID <=", value, "izBackId");
            return (Criteria) this;
        }

        public Criteria andIzBackIdLike(String value) {
            addCriterion("IZ_BACK_ID like", value, "izBackId");
            return (Criteria) this;
        }

        public Criteria andIzBackIdNotLike(String value) {
            addCriterion("IZ_BACK_ID not like", value, "izBackId");
            return (Criteria) this;
        }

        public Criteria andIzBackIdIn(List<String> values) {
            addCriterion("IZ_BACK_ID in", values, "izBackId");
            return (Criteria) this;
        }

        public Criteria andIzBackIdNotIn(List<String> values) {
            addCriterion("IZ_BACK_ID not in", values, "izBackId");
            return (Criteria) this;
        }

        public Criteria andIzBackIdBetween(String value1, String value2) {
            addCriterion("IZ_BACK_ID between", value1, value2, "izBackId");
            return (Criteria) this;
        }

        public Criteria andIzBackIdNotBetween(String value1, String value2) {
            addCriterion("IZ_BACK_ID not between", value1, value2, "izBackId");
            return (Criteria) this;
        }

        public Criteria andCfmSwIsNull() {
            addCriterion("CFM_SW is null");
            return (Criteria) this;
        }

        public Criteria andCfmSwIsNotNull() {
            addCriterion("CFM_SW is not null");
            return (Criteria) this;
        }

        public Criteria andCfmSwEqualTo(String value) {
            addCriterion("CFM_SW =", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwNotEqualTo(String value) {
            addCriterion("CFM_SW <>", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwGreaterThan(String value) {
            addCriterion("CFM_SW >", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwGreaterThanOrEqualTo(String value) {
            addCriterion("CFM_SW >=", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwLessThan(String value) {
            addCriterion("CFM_SW <", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwLessThanOrEqualTo(String value) {
            addCriterion("CFM_SW <=", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwLike(String value) {
            addCriterion("CFM_SW like", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwNotLike(String value) {
            addCriterion("CFM_SW not like", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwIn(List<String> values) {
            addCriterion("CFM_SW in", values, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwNotIn(List<String> values) {
            addCriterion("CFM_SW not in", values, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwBetween(String value1, String value2) {
            addCriterion("CFM_SW between", value1, value2, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwNotBetween(String value1, String value2) {
            addCriterion("CFM_SW not between", value1, value2, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andIzClsIdIsNull() {
            addCriterion("IZ_CLS_ID is null");
            return (Criteria) this;
        }

        public Criteria andIzClsIdIsNotNull() {
            addCriterion("IZ_CLS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIzClsIdEqualTo(String value) {
            addCriterion("IZ_CLS_ID =", value, "izClsId");
            return (Criteria) this;
        }

        public Criteria andIzClsIdNotEqualTo(String value) {
            addCriterion("IZ_CLS_ID <>", value, "izClsId");
            return (Criteria) this;
        }

        public Criteria andIzClsIdGreaterThan(String value) {
            addCriterion("IZ_CLS_ID >", value, "izClsId");
            return (Criteria) this;
        }

        public Criteria andIzClsIdGreaterThanOrEqualTo(String value) {
            addCriterion("IZ_CLS_ID >=", value, "izClsId");
            return (Criteria) this;
        }

        public Criteria andIzClsIdLessThan(String value) {
            addCriterion("IZ_CLS_ID <", value, "izClsId");
            return (Criteria) this;
        }

        public Criteria andIzClsIdLessThanOrEqualTo(String value) {
            addCriterion("IZ_CLS_ID <=", value, "izClsId");
            return (Criteria) this;
        }

        public Criteria andIzClsIdLike(String value) {
            addCriterion("IZ_CLS_ID like", value, "izClsId");
            return (Criteria) this;
        }

        public Criteria andIzClsIdNotLike(String value) {
            addCriterion("IZ_CLS_ID not like", value, "izClsId");
            return (Criteria) this;
        }

        public Criteria andIzClsIdIn(List<String> values) {
            addCriterion("IZ_CLS_ID in", values, "izClsId");
            return (Criteria) this;
        }

        public Criteria andIzClsIdNotIn(List<String> values) {
            addCriterion("IZ_CLS_ID not in", values, "izClsId");
            return (Criteria) this;
        }

        public Criteria andIzClsIdBetween(String value1, String value2) {
            addCriterion("IZ_CLS_ID between", value1, value2, "izClsId");
            return (Criteria) this;
        }

        public Criteria andIzClsIdNotBetween(String value1, String value2) {
            addCriterion("IZ_CLS_ID not between", value1, value2, "izClsId");
            return (Criteria) this;
        }

        public Criteria andCancelIdIsNull() {
            addCriterion("CANCEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCancelIdIsNotNull() {
            addCriterion("CANCEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCancelIdEqualTo(String value) {
            addCriterion("CANCEL_ID =", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotEqualTo(String value) {
            addCriterion("CANCEL_ID <>", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdGreaterThan(String value) {
            addCriterion("CANCEL_ID >", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_ID >=", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLessThan(String value) {
            addCriterion("CANCEL_ID <", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_ID <=", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLike(String value) {
            addCriterion("CANCEL_ID like", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotLike(String value) {
            addCriterion("CANCEL_ID not like", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdIn(List<String> values) {
            addCriterion("CANCEL_ID in", values, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotIn(List<String> values) {
            addCriterion("CANCEL_ID not in", values, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdBetween(String value1, String value2) {
            addCriterion("CANCEL_ID between", value1, value2, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotBetween(String value1, String value2) {
            addCriterion("CANCEL_ID not between", value1, value2, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsIsNull() {
            addCriterion("CUR_ID_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsIsNotNull() {
            addCriterion("CUR_ID_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsEqualTo(String value) {
            addCriterion("CUR_ID_IFRS =", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsNotEqualTo(String value) {
            addCriterion("CUR_ID_IFRS <>", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsGreaterThan(String value) {
            addCriterion("CUR_ID_IFRS >", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_ID_IFRS >=", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsLessThan(String value) {
            addCriterion("CUR_ID_IFRS <", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsLessThanOrEqualTo(String value) {
            addCriterion("CUR_ID_IFRS <=", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsLike(String value) {
            addCriterion("CUR_ID_IFRS like", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsNotLike(String value) {
            addCriterion("CUR_ID_IFRS not like", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsIn(List<String> values) {
            addCriterion("CUR_ID_IFRS in", values, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsNotIn(List<String> values) {
            addCriterion("CUR_ID_IFRS not in", values, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsBetween(String value1, String value2) {
            addCriterion("CUR_ID_IFRS between", value1, value2, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsNotBetween(String value1, String value2) {
            addCriterion("CUR_ID_IFRS not between", value1, value2, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsIsNull() {
            addCriterion("EXC_RTO_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsIsNotNull() {
            addCriterion("EXC_RTO_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_IFRS =", value, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsNotEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_IFRS <>", value, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsGreaterThan(BigDecimal value) {
            addCriterion("EXC_RTO_IFRS >", value, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_IFRS >=", value, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsLessThan(BigDecimal value) {
            addCriterion("EXC_RTO_IFRS <", value, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_IFRS <=", value, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO_IFRS in", values, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsNotIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO_IFRS not in", values, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO_IFRS between", value1, value2, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO_IFRS not between", value1, value2, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andCusOsNoIsNull() {
            addCriterion("CUS_OS_NO is null");
            return (Criteria) this;
        }

        public Criteria andCusOsNoIsNotNull() {
            addCriterion("CUS_OS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCusOsNoEqualTo(String value) {
            addCriterion("CUS_OS_NO =", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotEqualTo(String value) {
            addCriterion("CUS_OS_NO <>", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoGreaterThan(String value) {
            addCriterion("CUS_OS_NO >", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_OS_NO >=", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoLessThan(String value) {
            addCriterion("CUS_OS_NO <", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoLessThanOrEqualTo(String value) {
            addCriterion("CUS_OS_NO <=", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoLike(String value) {
            addCriterion("CUS_OS_NO like", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotLike(String value) {
            addCriterion("CUS_OS_NO not like", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoIn(List<String> values) {
            addCriterion("CUS_OS_NO in", values, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotIn(List<String> values) {
            addCriterion("CUS_OS_NO not in", values, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoBetween(String value1, String value2) {
            addCriterion("CUS_OS_NO between", value1, value2, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotBetween(String value1, String value2) {
            addCriterion("CUS_OS_NO not between", value1, value2, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andPrtDateIsNull() {
            addCriterion("PRT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPrtDateIsNotNull() {
            addCriterion("PRT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrtDateEqualTo(Date value) {
            addCriterion("PRT_DATE =", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateNotEqualTo(Date value) {
            addCriterion("PRT_DATE <>", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateGreaterThan(Date value) {
            addCriterion("PRT_DATE >", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRT_DATE >=", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateLessThan(Date value) {
            addCriterion("PRT_DATE <", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateLessThanOrEqualTo(Date value) {
            addCriterion("PRT_DATE <=", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateIn(List<Date> values) {
            addCriterion("PRT_DATE in", values, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateNotIn(List<Date> values) {
            addCriterion("PRT_DATE not in", values, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateBetween(Date value1, Date value2) {
            addCriterion("PRT_DATE between", value1, value2, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateNotBetween(Date value1, Date value2) {
            addCriterion("PRT_DATE not between", value1, value2, "prtDate");
            return (Criteria) this;
        }

        public Criteria andSendMthIsNull() {
            addCriterion("SEND_MTH is null");
            return (Criteria) this;
        }

        public Criteria andSendMthIsNotNull() {
            addCriterion("SEND_MTH is not null");
            return (Criteria) this;
        }

        public Criteria andSendMthEqualTo(String value) {
            addCriterion("SEND_MTH =", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthNotEqualTo(String value) {
            addCriterion("SEND_MTH <>", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthGreaterThan(String value) {
            addCriterion("SEND_MTH >", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_MTH >=", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthLessThan(String value) {
            addCriterion("SEND_MTH <", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthLessThanOrEqualTo(String value) {
            addCriterion("SEND_MTH <=", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthLike(String value) {
            addCriterion("SEND_MTH like", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthNotLike(String value) {
            addCriterion("SEND_MTH not like", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthIn(List<String> values) {
            addCriterion("SEND_MTH in", values, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthNotIn(List<String> values) {
            addCriterion("SEND_MTH not in", values, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthBetween(String value1, String value2) {
            addCriterion("SEND_MTH between", value1, value2, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthNotBetween(String value1, String value2) {
            addCriterion("SEND_MTH not between", value1, value2, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendWhIsNull() {
            addCriterion("SEND_WH is null");
            return (Criteria) this;
        }

        public Criteria andSendWhIsNotNull() {
            addCriterion("SEND_WH is not null");
            return (Criteria) this;
        }

        public Criteria andSendWhEqualTo(String value) {
            addCriterion("SEND_WH =", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhNotEqualTo(String value) {
            addCriterion("SEND_WH <>", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhGreaterThan(String value) {
            addCriterion("SEND_WH >", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_WH >=", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhLessThan(String value) {
            addCriterion("SEND_WH <", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhLessThanOrEqualTo(String value) {
            addCriterion("SEND_WH <=", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhLike(String value) {
            addCriterion("SEND_WH like", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhNotLike(String value) {
            addCriterion("SEND_WH not like", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhIn(List<String> values) {
            addCriterion("SEND_WH in", values, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhNotIn(List<String> values) {
            addCriterion("SEND_WH not in", values, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhBetween(String value1, String value2) {
            addCriterion("SEND_WH between", value1, value2, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhNotBetween(String value1, String value2) {
            addCriterion("SEND_WH not between", value1, value2, "sendWh");
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

        public Criteria andQty1ClsIsNull() {
            addCriterion("QTY1_CLS is null");
            return (Criteria) this;
        }

        public Criteria andQty1ClsIsNotNull() {
            addCriterion("QTY1_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andQty1ClsEqualTo(BigDecimal value) {
            addCriterion("QTY1_CLS =", value, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_CLS <>", value, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsGreaterThan(BigDecimal value) {
            addCriterion("QTY1_CLS >", value, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_CLS >=", value, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsLessThan(BigDecimal value) {
            addCriterion("QTY1_CLS <", value, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_CLS <=", value, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsIn(List<BigDecimal> values) {
            addCriterion("QTY1_CLS in", values, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_CLS not in", values, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_CLS between", value1, value2, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_CLS not between", value1, value2, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1Cls2IsNull() {
            addCriterion("QTY1_CLS2 is null");
            return (Criteria) this;
        }

        public Criteria andQty1Cls2IsNotNull() {
            addCriterion("QTY1_CLS2 is not null");
            return (Criteria) this;
        }

        public Criteria andQty1Cls2EqualTo(BigDecimal value) {
            addCriterion("QTY1_CLS2 =", value, "qty1Cls2");
            return (Criteria) this;
        }

        public Criteria andQty1Cls2NotEqualTo(BigDecimal value) {
            addCriterion("QTY1_CLS2 <>", value, "qty1Cls2");
            return (Criteria) this;
        }

        public Criteria andQty1Cls2GreaterThan(BigDecimal value) {
            addCriterion("QTY1_CLS2 >", value, "qty1Cls2");
            return (Criteria) this;
        }

        public Criteria andQty1Cls2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_CLS2 >=", value, "qty1Cls2");
            return (Criteria) this;
        }

        public Criteria andQty1Cls2LessThan(BigDecimal value) {
            addCriterion("QTY1_CLS2 <", value, "qty1Cls2");
            return (Criteria) this;
        }

        public Criteria andQty1Cls2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_CLS2 <=", value, "qty1Cls2");
            return (Criteria) this;
        }

        public Criteria andQty1Cls2In(List<BigDecimal> values) {
            addCriterion("QTY1_CLS2 in", values, "qty1Cls2");
            return (Criteria) this;
        }

        public Criteria andQty1Cls2NotIn(List<BigDecimal> values) {
            addCriterion("QTY1_CLS2 not in", values, "qty1Cls2");
            return (Criteria) this;
        }

        public Criteria andQty1Cls2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_CLS2 between", value1, value2, "qty1Cls2");
            return (Criteria) this;
        }

        public Criteria andQty1Cls2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_CLS2 not between", value1, value2, "qty1Cls2");
            return (Criteria) this;
        }

        public Criteria andIssvsIsNull() {
            addCriterion("ISSVS is null");
            return (Criteria) this;
        }

        public Criteria andIssvsIsNotNull() {
            addCriterion("ISSVS is not null");
            return (Criteria) this;
        }

        public Criteria andIssvsEqualTo(String value) {
            addCriterion("ISSVS =", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsNotEqualTo(String value) {
            addCriterion("ISSVS <>", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsGreaterThan(String value) {
            addCriterion("ISSVS >", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsGreaterThanOrEqualTo(String value) {
            addCriterion("ISSVS >=", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsLessThan(String value) {
            addCriterion("ISSVS <", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsLessThanOrEqualTo(String value) {
            addCriterion("ISSVS <=", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsLike(String value) {
            addCriterion("ISSVS like", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsNotLike(String value) {
            addCriterion("ISSVS not like", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsIn(List<String> values) {
            addCriterion("ISSVS in", values, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsNotIn(List<String> values) {
            addCriterion("ISSVS not in", values, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsBetween(String value1, String value2) {
            addCriterion("ISSVS between", value1, value2, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsNotBetween(String value1, String value2) {
            addCriterion("ISSVS not between", value1, value2, "issvs");
            return (Criteria) this;
        }

        public Criteria andScanIdIsNull() {
            addCriterion("SCAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andScanIdIsNotNull() {
            addCriterion("SCAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andScanIdEqualTo(String value) {
            addCriterion("SCAN_ID =", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdNotEqualTo(String value) {
            addCriterion("SCAN_ID <>", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdGreaterThan(String value) {
            addCriterion("SCAN_ID >", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdGreaterThanOrEqualTo(String value) {
            addCriterion("SCAN_ID >=", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdLessThan(String value) {
            addCriterion("SCAN_ID <", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdLessThanOrEqualTo(String value) {
            addCriterion("SCAN_ID <=", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdLike(String value) {
            addCriterion("SCAN_ID like", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdNotLike(String value) {
            addCriterion("SCAN_ID not like", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdIn(List<String> values) {
            addCriterion("SCAN_ID in", values, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdNotIn(List<String> values) {
            addCriterion("SCAN_ID not in", values, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdBetween(String value1, String value2) {
            addCriterion("SCAN_ID between", value1, value2, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdNotBetween(String value1, String value2) {
            addCriterion("SCAN_ID not between", value1, value2, "scanId");
            return (Criteria) this;
        }

        public Criteria andModifyDdIsNull() {
            addCriterion("MODIFY_DD is null");
            return (Criteria) this;
        }

        public Criteria andModifyDdIsNotNull() {
            addCriterion("MODIFY_DD is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDdEqualTo(Date value) {
            addCriterion("MODIFY_DD =", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotEqualTo(Date value) {
            addCriterion("MODIFY_DD <>", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdGreaterThan(Date value) {
            addCriterion("MODIFY_DD >", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DD >=", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdLessThan(Date value) {
            addCriterion("MODIFY_DD <", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DD <=", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdIn(List<Date> values) {
            addCriterion("MODIFY_DD in", values, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotIn(List<Date> values) {
            addCriterion("MODIFY_DD not in", values, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DD between", value1, value2, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DD not between", value1, value2, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyManIsNull() {
            addCriterion("MODIFY_MAN is null");
            return (Criteria) this;
        }

        public Criteria andModifyManIsNotNull() {
            addCriterion("MODIFY_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andModifyManEqualTo(String value) {
            addCriterion("MODIFY_MAN =", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotEqualTo(String value) {
            addCriterion("MODIFY_MAN <>", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManGreaterThan(String value) {
            addCriterion("MODIFY_MAN >", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_MAN >=", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLessThan(String value) {
            addCriterion("MODIFY_MAN <", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_MAN <=", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLike(String value) {
            addCriterion("MODIFY_MAN like", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotLike(String value) {
            addCriterion("MODIFY_MAN not like", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManIn(List<String> values) {
            addCriterion("MODIFY_MAN in", values, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotIn(List<String> values) {
            addCriterion("MODIFY_MAN not in", values, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManBetween(String value1, String value2) {
            addCriterion("MODIFY_MAN between", value1, value2, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotBetween(String value1, String value2) {
            addCriterion("MODIFY_MAN not between", value1, value2, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andScanUsrIsNull() {
            addCriterion("SCAN_USR is null");
            return (Criteria) this;
        }

        public Criteria andScanUsrIsNotNull() {
            addCriterion("SCAN_USR is not null");
            return (Criteria) this;
        }

        public Criteria andScanUsrEqualTo(String value) {
            addCriterion("SCAN_USR =", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrNotEqualTo(String value) {
            addCriterion("SCAN_USR <>", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrGreaterThan(String value) {
            addCriterion("SCAN_USR >", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrGreaterThanOrEqualTo(String value) {
            addCriterion("SCAN_USR >=", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrLessThan(String value) {
            addCriterion("SCAN_USR <", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrLessThanOrEqualTo(String value) {
            addCriterion("SCAN_USR <=", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrLike(String value) {
            addCriterion("SCAN_USR like", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrNotLike(String value) {
            addCriterion("SCAN_USR not like", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrIn(List<String> values) {
            addCriterion("SCAN_USR in", values, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrNotIn(List<String> values) {
            addCriterion("SCAN_USR not in", values, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrBetween(String value1, String value2) {
            addCriterion("SCAN_USR between", value1, value2, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrNotBetween(String value1, String value2) {
            addCriterion("SCAN_USR not between", value1, value2, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanDateIsNull() {
            addCriterion("SCAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andScanDateIsNotNull() {
            addCriterion("SCAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andScanDateEqualTo(Date value) {
            addCriterion("SCAN_DATE =", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotEqualTo(Date value) {
            addCriterion("SCAN_DATE <>", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateGreaterThan(Date value) {
            addCriterion("SCAN_DATE >", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SCAN_DATE >=", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateLessThan(Date value) {
            addCriterion("SCAN_DATE <", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateLessThanOrEqualTo(Date value) {
            addCriterion("SCAN_DATE <=", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateIn(List<Date> values) {
            addCriterion("SCAN_DATE in", values, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotIn(List<Date> values) {
            addCriterion("SCAN_DATE not in", values, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateBetween(Date value1, Date value2) {
            addCriterion("SCAN_DATE between", value1, value2, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotBetween(Date value1, Date value2) {
            addCriterion("SCAN_DATE not between", value1, value2, "scanDate");
            return (Criteria) this;
        }

        public Criteria andCkLineYsIsNull() {
            addCriterion("CK_LINE_YS is null");
            return (Criteria) this;
        }

        public Criteria andCkLineYsIsNotNull() {
            addCriterion("CK_LINE_YS is not null");
            return (Criteria) this;
        }

        public Criteria andCkLineYsEqualTo(String value) {
            addCriterion("CK_LINE_YS =", value, "ckLineYs");
            return (Criteria) this;
        }

        public Criteria andCkLineYsNotEqualTo(String value) {
            addCriterion("CK_LINE_YS <>", value, "ckLineYs");
            return (Criteria) this;
        }

        public Criteria andCkLineYsGreaterThan(String value) {
            addCriterion("CK_LINE_YS >", value, "ckLineYs");
            return (Criteria) this;
        }

        public Criteria andCkLineYsGreaterThanOrEqualTo(String value) {
            addCriterion("CK_LINE_YS >=", value, "ckLineYs");
            return (Criteria) this;
        }

        public Criteria andCkLineYsLessThan(String value) {
            addCriterion("CK_LINE_YS <", value, "ckLineYs");
            return (Criteria) this;
        }

        public Criteria andCkLineYsLessThanOrEqualTo(String value) {
            addCriterion("CK_LINE_YS <=", value, "ckLineYs");
            return (Criteria) this;
        }

        public Criteria andCkLineYsLike(String value) {
            addCriterion("CK_LINE_YS like", value, "ckLineYs");
            return (Criteria) this;
        }

        public Criteria andCkLineYsNotLike(String value) {
            addCriterion("CK_LINE_YS not like", value, "ckLineYs");
            return (Criteria) this;
        }

        public Criteria andCkLineYsIn(List<String> values) {
            addCriterion("CK_LINE_YS in", values, "ckLineYs");
            return (Criteria) this;
        }

        public Criteria andCkLineYsNotIn(List<String> values) {
            addCriterion("CK_LINE_YS not in", values, "ckLineYs");
            return (Criteria) this;
        }

        public Criteria andCkLineYsBetween(String value1, String value2) {
            addCriterion("CK_LINE_YS between", value1, value2, "ckLineYs");
            return (Criteria) this;
        }

        public Criteria andCkLineYsNotBetween(String value1, String value2) {
            addCriterion("CK_LINE_YS not between", value1, value2, "ckLineYs");
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