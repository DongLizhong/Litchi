package cn.litchi.model.entity;

import java.util.ArrayList;
import java.util.List;

public class LzLitchiTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LzLitchiTypeExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andJanIsNull() {
            addCriterion("jan is null");
            return (Criteria) this;
        }

        public Criteria andJanIsNotNull() {
            addCriterion("jan is not null");
            return (Criteria) this;
        }

        public Criteria andJanEqualTo(String value) {
            addCriterion("jan =", value, "jan");
            return (Criteria) this;
        }

        public Criteria andJanNotEqualTo(String value) {
            addCriterion("jan <>", value, "jan");
            return (Criteria) this;
        }

        public Criteria andJanGreaterThan(String value) {
            addCriterion("jan >", value, "jan");
            return (Criteria) this;
        }

        public Criteria andJanGreaterThanOrEqualTo(String value) {
            addCriterion("jan >=", value, "jan");
            return (Criteria) this;
        }

        public Criteria andJanLessThan(String value) {
            addCriterion("jan <", value, "jan");
            return (Criteria) this;
        }

        public Criteria andJanLessThanOrEqualTo(String value) {
            addCriterion("jan <=", value, "jan");
            return (Criteria) this;
        }

        public Criteria andJanLike(String value) {
            addCriterion("jan like", value, "jan");
            return (Criteria) this;
        }

        public Criteria andJanNotLike(String value) {
            addCriterion("jan not like", value, "jan");
            return (Criteria) this;
        }

        public Criteria andJanIn(List<String> values) {
            addCriterion("jan in", values, "jan");
            return (Criteria) this;
        }

        public Criteria andJanNotIn(List<String> values) {
            addCriterion("jan not in", values, "jan");
            return (Criteria) this;
        }

        public Criteria andJanBetween(String value1, String value2) {
            addCriterion("jan between", value1, value2, "jan");
            return (Criteria) this;
        }

        public Criteria andJanNotBetween(String value1, String value2) {
            addCriterion("jan not between", value1, value2, "jan");
            return (Criteria) this;
        }

        public Criteria andFebIsNull() {
            addCriterion("feb is null");
            return (Criteria) this;
        }

        public Criteria andFebIsNotNull() {
            addCriterion("feb is not null");
            return (Criteria) this;
        }

        public Criteria andFebEqualTo(String value) {
            addCriterion("feb =", value, "feb");
            return (Criteria) this;
        }

        public Criteria andFebNotEqualTo(String value) {
            addCriterion("feb <>", value, "feb");
            return (Criteria) this;
        }

        public Criteria andFebGreaterThan(String value) {
            addCriterion("feb >", value, "feb");
            return (Criteria) this;
        }

        public Criteria andFebGreaterThanOrEqualTo(String value) {
            addCriterion("feb >=", value, "feb");
            return (Criteria) this;
        }

        public Criteria andFebLessThan(String value) {
            addCriterion("feb <", value, "feb");
            return (Criteria) this;
        }

        public Criteria andFebLessThanOrEqualTo(String value) {
            addCriterion("feb <=", value, "feb");
            return (Criteria) this;
        }

        public Criteria andFebLike(String value) {
            addCriterion("feb like", value, "feb");
            return (Criteria) this;
        }

        public Criteria andFebNotLike(String value) {
            addCriterion("feb not like", value, "feb");
            return (Criteria) this;
        }

        public Criteria andFebIn(List<String> values) {
            addCriterion("feb in", values, "feb");
            return (Criteria) this;
        }

        public Criteria andFebNotIn(List<String> values) {
            addCriterion("feb not in", values, "feb");
            return (Criteria) this;
        }

        public Criteria andFebBetween(String value1, String value2) {
            addCriterion("feb between", value1, value2, "feb");
            return (Criteria) this;
        }

        public Criteria andFebNotBetween(String value1, String value2) {
            addCriterion("feb not between", value1, value2, "feb");
            return (Criteria) this;
        }

        public Criteria andMarIsNull() {
            addCriterion("mar is null");
            return (Criteria) this;
        }

        public Criteria andMarIsNotNull() {
            addCriterion("mar is not null");
            return (Criteria) this;
        }

        public Criteria andMarEqualTo(String value) {
            addCriterion("mar =", value, "mar");
            return (Criteria) this;
        }

        public Criteria andMarNotEqualTo(String value) {
            addCriterion("mar <>", value, "mar");
            return (Criteria) this;
        }

        public Criteria andMarGreaterThan(String value) {
            addCriterion("mar >", value, "mar");
            return (Criteria) this;
        }

        public Criteria andMarGreaterThanOrEqualTo(String value) {
            addCriterion("mar >=", value, "mar");
            return (Criteria) this;
        }

        public Criteria andMarLessThan(String value) {
            addCriterion("mar <", value, "mar");
            return (Criteria) this;
        }

        public Criteria andMarLessThanOrEqualTo(String value) {
            addCriterion("mar <=", value, "mar");
            return (Criteria) this;
        }

        public Criteria andMarLike(String value) {
            addCriterion("mar like", value, "mar");
            return (Criteria) this;
        }

        public Criteria andMarNotLike(String value) {
            addCriterion("mar not like", value, "mar");
            return (Criteria) this;
        }

        public Criteria andMarIn(List<String> values) {
            addCriterion("mar in", values, "mar");
            return (Criteria) this;
        }

        public Criteria andMarNotIn(List<String> values) {
            addCriterion("mar not in", values, "mar");
            return (Criteria) this;
        }

        public Criteria andMarBetween(String value1, String value2) {
            addCriterion("mar between", value1, value2, "mar");
            return (Criteria) this;
        }

        public Criteria andMarNotBetween(String value1, String value2) {
            addCriterion("mar not between", value1, value2, "mar");
            return (Criteria) this;
        }

        public Criteria andAprIsNull() {
            addCriterion("apr is null");
            return (Criteria) this;
        }

        public Criteria andAprIsNotNull() {
            addCriterion("apr is not null");
            return (Criteria) this;
        }

        public Criteria andAprEqualTo(String value) {
            addCriterion("apr =", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotEqualTo(String value) {
            addCriterion("apr <>", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprGreaterThan(String value) {
            addCriterion("apr >", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprGreaterThanOrEqualTo(String value) {
            addCriterion("apr >=", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprLessThan(String value) {
            addCriterion("apr <", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprLessThanOrEqualTo(String value) {
            addCriterion("apr <=", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprLike(String value) {
            addCriterion("apr like", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotLike(String value) {
            addCriterion("apr not like", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprIn(List<String> values) {
            addCriterion("apr in", values, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotIn(List<String> values) {
            addCriterion("apr not in", values, "apr");
            return (Criteria) this;
        }

        public Criteria andAprBetween(String value1, String value2) {
            addCriterion("apr between", value1, value2, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotBetween(String value1, String value2) {
            addCriterion("apr not between", value1, value2, "apr");
            return (Criteria) this;
        }

        public Criteria andMayIsNull() {
            addCriterion("may is null");
            return (Criteria) this;
        }

        public Criteria andMayIsNotNull() {
            addCriterion("may is not null");
            return (Criteria) this;
        }

        public Criteria andMayEqualTo(String value) {
            addCriterion("may =", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotEqualTo(String value) {
            addCriterion("may <>", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayGreaterThan(String value) {
            addCriterion("may >", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayGreaterThanOrEqualTo(String value) {
            addCriterion("may >=", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLessThan(String value) {
            addCriterion("may <", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLessThanOrEqualTo(String value) {
            addCriterion("may <=", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLike(String value) {
            addCriterion("may like", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotLike(String value) {
            addCriterion("may not like", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayIn(List<String> values) {
            addCriterion("may in", values, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotIn(List<String> values) {
            addCriterion("may not in", values, "may");
            return (Criteria) this;
        }

        public Criteria andMayBetween(String value1, String value2) {
            addCriterion("may between", value1, value2, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotBetween(String value1, String value2) {
            addCriterion("may not between", value1, value2, "may");
            return (Criteria) this;
        }

        public Criteria andJunIsNull() {
            addCriterion("jun is null");
            return (Criteria) this;
        }

        public Criteria andJunIsNotNull() {
            addCriterion("jun is not null");
            return (Criteria) this;
        }

        public Criteria andJunEqualTo(String value) {
            addCriterion("jun =", value, "jun");
            return (Criteria) this;
        }

        public Criteria andJunNotEqualTo(String value) {
            addCriterion("jun <>", value, "jun");
            return (Criteria) this;
        }

        public Criteria andJunGreaterThan(String value) {
            addCriterion("jun >", value, "jun");
            return (Criteria) this;
        }

        public Criteria andJunGreaterThanOrEqualTo(String value) {
            addCriterion("jun >=", value, "jun");
            return (Criteria) this;
        }

        public Criteria andJunLessThan(String value) {
            addCriterion("jun <", value, "jun");
            return (Criteria) this;
        }

        public Criteria andJunLessThanOrEqualTo(String value) {
            addCriterion("jun <=", value, "jun");
            return (Criteria) this;
        }

        public Criteria andJunLike(String value) {
            addCriterion("jun like", value, "jun");
            return (Criteria) this;
        }

        public Criteria andJunNotLike(String value) {
            addCriterion("jun not like", value, "jun");
            return (Criteria) this;
        }

        public Criteria andJunIn(List<String> values) {
            addCriterion("jun in", values, "jun");
            return (Criteria) this;
        }

        public Criteria andJunNotIn(List<String> values) {
            addCriterion("jun not in", values, "jun");
            return (Criteria) this;
        }

        public Criteria andJunBetween(String value1, String value2) {
            addCriterion("jun between", value1, value2, "jun");
            return (Criteria) this;
        }

        public Criteria andJunNotBetween(String value1, String value2) {
            addCriterion("jun not between", value1, value2, "jun");
            return (Criteria) this;
        }

        public Criteria andJulIsNull() {
            addCriterion("jul is null");
            return (Criteria) this;
        }

        public Criteria andJulIsNotNull() {
            addCriterion("jul is not null");
            return (Criteria) this;
        }

        public Criteria andJulEqualTo(String value) {
            addCriterion("jul =", value, "jul");
            return (Criteria) this;
        }

        public Criteria andJulNotEqualTo(String value) {
            addCriterion("jul <>", value, "jul");
            return (Criteria) this;
        }

        public Criteria andJulGreaterThan(String value) {
            addCriterion("jul >", value, "jul");
            return (Criteria) this;
        }

        public Criteria andJulGreaterThanOrEqualTo(String value) {
            addCriterion("jul >=", value, "jul");
            return (Criteria) this;
        }

        public Criteria andJulLessThan(String value) {
            addCriterion("jul <", value, "jul");
            return (Criteria) this;
        }

        public Criteria andJulLessThanOrEqualTo(String value) {
            addCriterion("jul <=", value, "jul");
            return (Criteria) this;
        }

        public Criteria andJulLike(String value) {
            addCriterion("jul like", value, "jul");
            return (Criteria) this;
        }

        public Criteria andJulNotLike(String value) {
            addCriterion("jul not like", value, "jul");
            return (Criteria) this;
        }

        public Criteria andJulIn(List<String> values) {
            addCriterion("jul in", values, "jul");
            return (Criteria) this;
        }

        public Criteria andJulNotIn(List<String> values) {
            addCriterion("jul not in", values, "jul");
            return (Criteria) this;
        }

        public Criteria andJulBetween(String value1, String value2) {
            addCriterion("jul between", value1, value2, "jul");
            return (Criteria) this;
        }

        public Criteria andJulNotBetween(String value1, String value2) {
            addCriterion("jul not between", value1, value2, "jul");
            return (Criteria) this;
        }

        public Criteria andAugIsNull() {
            addCriterion("aug is null");
            return (Criteria) this;
        }

        public Criteria andAugIsNotNull() {
            addCriterion("aug is not null");
            return (Criteria) this;
        }

        public Criteria andAugEqualTo(String value) {
            addCriterion("aug =", value, "aug");
            return (Criteria) this;
        }

        public Criteria andAugNotEqualTo(String value) {
            addCriterion("aug <>", value, "aug");
            return (Criteria) this;
        }

        public Criteria andAugGreaterThan(String value) {
            addCriterion("aug >", value, "aug");
            return (Criteria) this;
        }

        public Criteria andAugGreaterThanOrEqualTo(String value) {
            addCriterion("aug >=", value, "aug");
            return (Criteria) this;
        }

        public Criteria andAugLessThan(String value) {
            addCriterion("aug <", value, "aug");
            return (Criteria) this;
        }

        public Criteria andAugLessThanOrEqualTo(String value) {
            addCriterion("aug <=", value, "aug");
            return (Criteria) this;
        }

        public Criteria andAugLike(String value) {
            addCriterion("aug like", value, "aug");
            return (Criteria) this;
        }

        public Criteria andAugNotLike(String value) {
            addCriterion("aug not like", value, "aug");
            return (Criteria) this;
        }

        public Criteria andAugIn(List<String> values) {
            addCriterion("aug in", values, "aug");
            return (Criteria) this;
        }

        public Criteria andAugNotIn(List<String> values) {
            addCriterion("aug not in", values, "aug");
            return (Criteria) this;
        }

        public Criteria andAugBetween(String value1, String value2) {
            addCriterion("aug between", value1, value2, "aug");
            return (Criteria) this;
        }

        public Criteria andAugNotBetween(String value1, String value2) {
            addCriterion("aug not between", value1, value2, "aug");
            return (Criteria) this;
        }

        public Criteria andSeptIsNull() {
            addCriterion("sept is null");
            return (Criteria) this;
        }

        public Criteria andSeptIsNotNull() {
            addCriterion("sept is not null");
            return (Criteria) this;
        }

        public Criteria andSeptEqualTo(String value) {
            addCriterion("sept =", value, "sept");
            return (Criteria) this;
        }

        public Criteria andSeptNotEqualTo(String value) {
            addCriterion("sept <>", value, "sept");
            return (Criteria) this;
        }

        public Criteria andSeptGreaterThan(String value) {
            addCriterion("sept >", value, "sept");
            return (Criteria) this;
        }

        public Criteria andSeptGreaterThanOrEqualTo(String value) {
            addCriterion("sept >=", value, "sept");
            return (Criteria) this;
        }

        public Criteria andSeptLessThan(String value) {
            addCriterion("sept <", value, "sept");
            return (Criteria) this;
        }

        public Criteria andSeptLessThanOrEqualTo(String value) {
            addCriterion("sept <=", value, "sept");
            return (Criteria) this;
        }

        public Criteria andSeptLike(String value) {
            addCriterion("sept like", value, "sept");
            return (Criteria) this;
        }

        public Criteria andSeptNotLike(String value) {
            addCriterion("sept not like", value, "sept");
            return (Criteria) this;
        }

        public Criteria andSeptIn(List<String> values) {
            addCriterion("sept in", values, "sept");
            return (Criteria) this;
        }

        public Criteria andSeptNotIn(List<String> values) {
            addCriterion("sept not in", values, "sept");
            return (Criteria) this;
        }

        public Criteria andSeptBetween(String value1, String value2) {
            addCriterion("sept between", value1, value2, "sept");
            return (Criteria) this;
        }

        public Criteria andSeptNotBetween(String value1, String value2) {
            addCriterion("sept not between", value1, value2, "sept");
            return (Criteria) this;
        }

        public Criteria andOctIsNull() {
            addCriterion("oct is null");
            return (Criteria) this;
        }

        public Criteria andOctIsNotNull() {
            addCriterion("oct is not null");
            return (Criteria) this;
        }

        public Criteria andOctEqualTo(String value) {
            addCriterion("oct =", value, "oct");
            return (Criteria) this;
        }

        public Criteria andOctNotEqualTo(String value) {
            addCriterion("oct <>", value, "oct");
            return (Criteria) this;
        }

        public Criteria andOctGreaterThan(String value) {
            addCriterion("oct >", value, "oct");
            return (Criteria) this;
        }

        public Criteria andOctGreaterThanOrEqualTo(String value) {
            addCriterion("oct >=", value, "oct");
            return (Criteria) this;
        }

        public Criteria andOctLessThan(String value) {
            addCriterion("oct <", value, "oct");
            return (Criteria) this;
        }

        public Criteria andOctLessThanOrEqualTo(String value) {
            addCriterion("oct <=", value, "oct");
            return (Criteria) this;
        }

        public Criteria andOctLike(String value) {
            addCriterion("oct like", value, "oct");
            return (Criteria) this;
        }

        public Criteria andOctNotLike(String value) {
            addCriterion("oct not like", value, "oct");
            return (Criteria) this;
        }

        public Criteria andOctIn(List<String> values) {
            addCriterion("oct in", values, "oct");
            return (Criteria) this;
        }

        public Criteria andOctNotIn(List<String> values) {
            addCriterion("oct not in", values, "oct");
            return (Criteria) this;
        }

        public Criteria andOctBetween(String value1, String value2) {
            addCriterion("oct between", value1, value2, "oct");
            return (Criteria) this;
        }

        public Criteria andOctNotBetween(String value1, String value2) {
            addCriterion("oct not between", value1, value2, "oct");
            return (Criteria) this;
        }

        public Criteria andNovIsNull() {
            addCriterion("nov is null");
            return (Criteria) this;
        }

        public Criteria andNovIsNotNull() {
            addCriterion("nov is not null");
            return (Criteria) this;
        }

        public Criteria andNovEqualTo(String value) {
            addCriterion("nov =", value, "nov");
            return (Criteria) this;
        }

        public Criteria andNovNotEqualTo(String value) {
            addCriterion("nov <>", value, "nov");
            return (Criteria) this;
        }

        public Criteria andNovGreaterThan(String value) {
            addCriterion("nov >", value, "nov");
            return (Criteria) this;
        }

        public Criteria andNovGreaterThanOrEqualTo(String value) {
            addCriterion("nov >=", value, "nov");
            return (Criteria) this;
        }

        public Criteria andNovLessThan(String value) {
            addCriterion("nov <", value, "nov");
            return (Criteria) this;
        }

        public Criteria andNovLessThanOrEqualTo(String value) {
            addCriterion("nov <=", value, "nov");
            return (Criteria) this;
        }

        public Criteria andNovLike(String value) {
            addCriterion("nov like", value, "nov");
            return (Criteria) this;
        }

        public Criteria andNovNotLike(String value) {
            addCriterion("nov not like", value, "nov");
            return (Criteria) this;
        }

        public Criteria andNovIn(List<String> values) {
            addCriterion("nov in", values, "nov");
            return (Criteria) this;
        }

        public Criteria andNovNotIn(List<String> values) {
            addCriterion("nov not in", values, "nov");
            return (Criteria) this;
        }

        public Criteria andNovBetween(String value1, String value2) {
            addCriterion("nov between", value1, value2, "nov");
            return (Criteria) this;
        }

        public Criteria andNovNotBetween(String value1, String value2) {
            addCriterion("nov not between", value1, value2, "nov");
            return (Criteria) this;
        }

        public Criteria andDeceIsNull() {
            addCriterion("dece is null");
            return (Criteria) this;
        }

        public Criteria andDeceIsNotNull() {
            addCriterion("dece is not null");
            return (Criteria) this;
        }

        public Criteria andDeceEqualTo(String value) {
            addCriterion("dece =", value, "dece");
            return (Criteria) this;
        }

        public Criteria andDeceNotEqualTo(String value) {
            addCriterion("dece <>", value, "dece");
            return (Criteria) this;
        }

        public Criteria andDeceGreaterThan(String value) {
            addCriterion("dece >", value, "dece");
            return (Criteria) this;
        }

        public Criteria andDeceGreaterThanOrEqualTo(String value) {
            addCriterion("dece >=", value, "dece");
            return (Criteria) this;
        }

        public Criteria andDeceLessThan(String value) {
            addCriterion("dece <", value, "dece");
            return (Criteria) this;
        }

        public Criteria andDeceLessThanOrEqualTo(String value) {
            addCriterion("dece <=", value, "dece");
            return (Criteria) this;
        }

        public Criteria andDeceLike(String value) {
            addCriterion("dece like", value, "dece");
            return (Criteria) this;
        }

        public Criteria andDeceNotLike(String value) {
            addCriterion("dece not like", value, "dece");
            return (Criteria) this;
        }

        public Criteria andDeceIn(List<String> values) {
            addCriterion("dece in", values, "dece");
            return (Criteria) this;
        }

        public Criteria andDeceNotIn(List<String> values) {
            addCriterion("dece not in", values, "dece");
            return (Criteria) this;
        }

        public Criteria andDeceBetween(String value1, String value2) {
            addCriterion("dece between", value1, value2, "dece");
            return (Criteria) this;
        }

        public Criteria andDeceNotBetween(String value1, String value2) {
            addCriterion("dece not between", value1, value2, "dece");
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