package cn.litchi.model.entity;

import java.util.ArrayList;
import java.util.List;

public class LimitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LimitExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStageIsNull() {
            addCriterion("stage is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("stage is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(String value) {
            addCriterion("stage =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(String value) {
            addCriterion("stage <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(String value) {
            addCriterion("stage >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(String value) {
            addCriterion("stage >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(String value) {
            addCriterion("stage <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(String value) {
            addCriterion("stage <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLike(String value) {
            addCriterion("stage like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotLike(String value) {
            addCriterion("stage not like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<String> values) {
            addCriterion("stage in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<String> values) {
            addCriterion("stage not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(String value1, String value2) {
            addCriterion("stage between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(String value1, String value2) {
            addCriterion("stage not between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andTuIsNull() {
            addCriterion("tu is null");
            return (Criteria) this;
        }

        public Criteria andTuIsNotNull() {
            addCriterion("tu is not null");
            return (Criteria) this;
        }

        public Criteria andTuEqualTo(String value) {
            addCriterion("tu =", value, "tu");
            return (Criteria) this;
        }

        public Criteria andTuNotEqualTo(String value) {
            addCriterion("tu <>", value, "tu");
            return (Criteria) this;
        }

        public Criteria andTuGreaterThan(String value) {
            addCriterion("tu >", value, "tu");
            return (Criteria) this;
        }

        public Criteria andTuGreaterThanOrEqualTo(String value) {
            addCriterion("tu >=", value, "tu");
            return (Criteria) this;
        }

        public Criteria andTuLessThan(String value) {
            addCriterion("tu <", value, "tu");
            return (Criteria) this;
        }

        public Criteria andTuLessThanOrEqualTo(String value) {
            addCriterion("tu <=", value, "tu");
            return (Criteria) this;
        }

        public Criteria andTuLike(String value) {
            addCriterion("tu like", value, "tu");
            return (Criteria) this;
        }

        public Criteria andTuNotLike(String value) {
            addCriterion("tu not like", value, "tu");
            return (Criteria) this;
        }

        public Criteria andTuIn(List<String> values) {
            addCriterion("tu in", values, "tu");
            return (Criteria) this;
        }

        public Criteria andTuNotIn(List<String> values) {
            addCriterion("tu not in", values, "tu");
            return (Criteria) this;
        }

        public Criteria andTuBetween(String value1, String value2) {
            addCriterion("tu between", value1, value2, "tu");
            return (Criteria) this;
        }

        public Criteria andTuNotBetween(String value1, String value2) {
            addCriterion("tu not between", value1, value2, "tu");
            return (Criteria) this;
        }

        public Criteria andTdIsNull() {
            addCriterion("td is null");
            return (Criteria) this;
        }

        public Criteria andTdIsNotNull() {
            addCriterion("td is not null");
            return (Criteria) this;
        }

        public Criteria andTdEqualTo(String value) {
            addCriterion("td =", value, "td");
            return (Criteria) this;
        }

        public Criteria andTdNotEqualTo(String value) {
            addCriterion("td <>", value, "td");
            return (Criteria) this;
        }

        public Criteria andTdGreaterThan(String value) {
            addCriterion("td >", value, "td");
            return (Criteria) this;
        }

        public Criteria andTdGreaterThanOrEqualTo(String value) {
            addCriterion("td >=", value, "td");
            return (Criteria) this;
        }

        public Criteria andTdLessThan(String value) {
            addCriterion("td <", value, "td");
            return (Criteria) this;
        }

        public Criteria andTdLessThanOrEqualTo(String value) {
            addCriterion("td <=", value, "td");
            return (Criteria) this;
        }

        public Criteria andTdLike(String value) {
            addCriterion("td like", value, "td");
            return (Criteria) this;
        }

        public Criteria andTdNotLike(String value) {
            addCriterion("td not like", value, "td");
            return (Criteria) this;
        }

        public Criteria andTdIn(List<String> values) {
            addCriterion("td in", values, "td");
            return (Criteria) this;
        }

        public Criteria andTdNotIn(List<String> values) {
            addCriterion("td not in", values, "td");
            return (Criteria) this;
        }

        public Criteria andTdBetween(String value1, String value2) {
            addCriterion("td between", value1, value2, "td");
            return (Criteria) this;
        }

        public Criteria andTdNotBetween(String value1, String value2) {
            addCriterion("td not between", value1, value2, "td");
            return (Criteria) this;
        }

        public Criteria andHuIsNull() {
            addCriterion("hu is null");
            return (Criteria) this;
        }

        public Criteria andHuIsNotNull() {
            addCriterion("hu is not null");
            return (Criteria) this;
        }

        public Criteria andHuEqualTo(String value) {
            addCriterion("hu =", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuNotEqualTo(String value) {
            addCriterion("hu <>", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuGreaterThan(String value) {
            addCriterion("hu >", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuGreaterThanOrEqualTo(String value) {
            addCriterion("hu >=", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuLessThan(String value) {
            addCriterion("hu <", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuLessThanOrEqualTo(String value) {
            addCriterion("hu <=", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuLike(String value) {
            addCriterion("hu like", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuNotLike(String value) {
            addCriterion("hu not like", value, "hu");
            return (Criteria) this;
        }

        public Criteria andHuIn(List<String> values) {
            addCriterion("hu in", values, "hu");
            return (Criteria) this;
        }

        public Criteria andHuNotIn(List<String> values) {
            addCriterion("hu not in", values, "hu");
            return (Criteria) this;
        }

        public Criteria andHuBetween(String value1, String value2) {
            addCriterion("hu between", value1, value2, "hu");
            return (Criteria) this;
        }

        public Criteria andHuNotBetween(String value1, String value2) {
            addCriterion("hu not between", value1, value2, "hu");
            return (Criteria) this;
        }

        public Criteria andHdIsNull() {
            addCriterion("hd is null");
            return (Criteria) this;
        }

        public Criteria andHdIsNotNull() {
            addCriterion("hd is not null");
            return (Criteria) this;
        }

        public Criteria andHdEqualTo(String value) {
            addCriterion("hd =", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdNotEqualTo(String value) {
            addCriterion("hd <>", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdGreaterThan(String value) {
            addCriterion("hd >", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdGreaterThanOrEqualTo(String value) {
            addCriterion("hd >=", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdLessThan(String value) {
            addCriterion("hd <", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdLessThanOrEqualTo(String value) {
            addCriterion("hd <=", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdLike(String value) {
            addCriterion("hd like", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdNotLike(String value) {
            addCriterion("hd not like", value, "hd");
            return (Criteria) this;
        }

        public Criteria andHdIn(List<String> values) {
            addCriterion("hd in", values, "hd");
            return (Criteria) this;
        }

        public Criteria andHdNotIn(List<String> values) {
            addCriterion("hd not in", values, "hd");
            return (Criteria) this;
        }

        public Criteria andHdBetween(String value1, String value2) {
            addCriterion("hd between", value1, value2, "hd");
            return (Criteria) this;
        }

        public Criteria andHdNotBetween(String value1, String value2) {
            addCriterion("hd not between", value1, value2, "hd");
            return (Criteria) this;
        }

        public Criteria andLuIsNull() {
            addCriterion("lu is null");
            return (Criteria) this;
        }

        public Criteria andLuIsNotNull() {
            addCriterion("lu is not null");
            return (Criteria) this;
        }

        public Criteria andLuEqualTo(String value) {
            addCriterion("lu =", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuNotEqualTo(String value) {
            addCriterion("lu <>", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuGreaterThan(String value) {
            addCriterion("lu >", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuGreaterThanOrEqualTo(String value) {
            addCriterion("lu >=", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuLessThan(String value) {
            addCriterion("lu <", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuLessThanOrEqualTo(String value) {
            addCriterion("lu <=", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuLike(String value) {
            addCriterion("lu like", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuNotLike(String value) {
            addCriterion("lu not like", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuIn(List<String> values) {
            addCriterion("lu in", values, "lu");
            return (Criteria) this;
        }

        public Criteria andLuNotIn(List<String> values) {
            addCriterion("lu not in", values, "lu");
            return (Criteria) this;
        }

        public Criteria andLuBetween(String value1, String value2) {
            addCriterion("lu between", value1, value2, "lu");
            return (Criteria) this;
        }

        public Criteria andLuNotBetween(String value1, String value2) {
            addCriterion("lu not between", value1, value2, "lu");
            return (Criteria) this;
        }

        public Criteria andLdIsNull() {
            addCriterion("ld is null");
            return (Criteria) this;
        }

        public Criteria andLdIsNotNull() {
            addCriterion("ld is not null");
            return (Criteria) this;
        }

        public Criteria andLdEqualTo(String value) {
            addCriterion("ld =", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdNotEqualTo(String value) {
            addCriterion("ld <>", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdGreaterThan(String value) {
            addCriterion("ld >", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdGreaterThanOrEqualTo(String value) {
            addCriterion("ld >=", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdLessThan(String value) {
            addCriterion("ld <", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdLessThanOrEqualTo(String value) {
            addCriterion("ld <=", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdLike(String value) {
            addCriterion("ld like", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdNotLike(String value) {
            addCriterion("ld not like", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdIn(List<String> values) {
            addCriterion("ld in", values, "ld");
            return (Criteria) this;
        }

        public Criteria andLdNotIn(List<String> values) {
            addCriterion("ld not in", values, "ld");
            return (Criteria) this;
        }

        public Criteria andLdBetween(String value1, String value2) {
            addCriterion("ld between", value1, value2, "ld");
            return (Criteria) this;
        }

        public Criteria andLdNotBetween(String value1, String value2) {
            addCriterion("ld not between", value1, value2, "ld");
            return (Criteria) this;
        }

        public Criteria andWuIsNull() {
            addCriterion("wu is null");
            return (Criteria) this;
        }

        public Criteria andWuIsNotNull() {
            addCriterion("wu is not null");
            return (Criteria) this;
        }

        public Criteria andWuEqualTo(String value) {
            addCriterion("wu =", value, "wu");
            return (Criteria) this;
        }

        public Criteria andWuNotEqualTo(String value) {
            addCriterion("wu <>", value, "wu");
            return (Criteria) this;
        }

        public Criteria andWuGreaterThan(String value) {
            addCriterion("wu >", value, "wu");
            return (Criteria) this;
        }

        public Criteria andWuGreaterThanOrEqualTo(String value) {
            addCriterion("wu >=", value, "wu");
            return (Criteria) this;
        }

        public Criteria andWuLessThan(String value) {
            addCriterion("wu <", value, "wu");
            return (Criteria) this;
        }

        public Criteria andWuLessThanOrEqualTo(String value) {
            addCriterion("wu <=", value, "wu");
            return (Criteria) this;
        }

        public Criteria andWuLike(String value) {
            addCriterion("wu like", value, "wu");
            return (Criteria) this;
        }

        public Criteria andWuNotLike(String value) {
            addCriterion("wu not like", value, "wu");
            return (Criteria) this;
        }

        public Criteria andWuIn(List<String> values) {
            addCriterion("wu in", values, "wu");
            return (Criteria) this;
        }

        public Criteria andWuNotIn(List<String> values) {
            addCriterion("wu not in", values, "wu");
            return (Criteria) this;
        }

        public Criteria andWuBetween(String value1, String value2) {
            addCriterion("wu between", value1, value2, "wu");
            return (Criteria) this;
        }

        public Criteria andWuNotBetween(String value1, String value2) {
            addCriterion("wu not between", value1, value2, "wu");
            return (Criteria) this;
        }

        public Criteria andWdIsNull() {
            addCriterion("wd is null");
            return (Criteria) this;
        }

        public Criteria andWdIsNotNull() {
            addCriterion("wd is not null");
            return (Criteria) this;
        }

        public Criteria andWdEqualTo(String value) {
            addCriterion("wd =", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotEqualTo(String value) {
            addCriterion("wd <>", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThan(String value) {
            addCriterion("wd >", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThanOrEqualTo(String value) {
            addCriterion("wd >=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThan(String value) {
            addCriterion("wd <", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThanOrEqualTo(String value) {
            addCriterion("wd <=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLike(String value) {
            addCriterion("wd like", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotLike(String value) {
            addCriterion("wd not like", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdIn(List<String> values) {
            addCriterion("wd in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotIn(List<String> values) {
            addCriterion("wd not in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdBetween(String value1, String value2) {
            addCriterion("wd between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotBetween(String value1, String value2) {
            addCriterion("wd not between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andVdIsNull() {
            addCriterion("vd is null");
            return (Criteria) this;
        }

        public Criteria andVdIsNotNull() {
            addCriterion("vd is not null");
            return (Criteria) this;
        }

        public Criteria andVdEqualTo(String value) {
            addCriterion("vd =", value, "vd");
            return (Criteria) this;
        }

        public Criteria andVdNotEqualTo(String value) {
            addCriterion("vd <>", value, "vd");
            return (Criteria) this;
        }

        public Criteria andVdGreaterThan(String value) {
            addCriterion("vd >", value, "vd");
            return (Criteria) this;
        }

        public Criteria andVdGreaterThanOrEqualTo(String value) {
            addCriterion("vd >=", value, "vd");
            return (Criteria) this;
        }

        public Criteria andVdLessThan(String value) {
            addCriterion("vd <", value, "vd");
            return (Criteria) this;
        }

        public Criteria andVdLessThanOrEqualTo(String value) {
            addCriterion("vd <=", value, "vd");
            return (Criteria) this;
        }

        public Criteria andVdLike(String value) {
            addCriterion("vd like", value, "vd");
            return (Criteria) this;
        }

        public Criteria andVdNotLike(String value) {
            addCriterion("vd not like", value, "vd");
            return (Criteria) this;
        }

        public Criteria andVdIn(List<String> values) {
            addCriterion("vd in", values, "vd");
            return (Criteria) this;
        }

        public Criteria andVdNotIn(List<String> values) {
            addCriterion("vd not in", values, "vd");
            return (Criteria) this;
        }

        public Criteria andVdBetween(String value1, String value2) {
            addCriterion("vd between", value1, value2, "vd");
            return (Criteria) this;
        }

        public Criteria andVdNotBetween(String value1, String value2) {
            addCriterion("vd not between", value1, value2, "vd");
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