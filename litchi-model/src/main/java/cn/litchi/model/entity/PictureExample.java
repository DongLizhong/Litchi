package cn.litchi.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictureExample() {
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

        public Criteria andNIdIsNull() {
            addCriterion("n_id is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("n_id is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(Long value) {
            addCriterion("n_id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Long value) {
            addCriterion("n_id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Long value) {
            addCriterion("n_id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Long value) {
            addCriterion("n_id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Long value) {
            addCriterion("n_id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Long value) {
            addCriterion("n_id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Long> values) {
            addCriterion("n_id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Long> values) {
            addCriterion("n_id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Long value1, Long value2) {
            addCriterion("n_id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Long value1, Long value2) {
            addCriterion("n_id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Long value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Long value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Long value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Long value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Long value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Long value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Long> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Long> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Long value1, Long value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Long value1, Long value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(Long value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(Long value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(Long value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(Long value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(Long value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(Long value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<Long> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<Long> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(Long value1, Long value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(Long value1, Long value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andLIdIsNull() {
            addCriterion("l_id is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("l_id is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(Long value) {
            addCriterion("l_id =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(Long value) {
            addCriterion("l_id <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(Long value) {
            addCriterion("l_id >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(Long value) {
            addCriterion("l_id >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(Long value) {
            addCriterion("l_id <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(Long value) {
            addCriterion("l_id <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<Long> values) {
            addCriterion("l_id in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<Long> values) {
            addCriterion("l_id not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(Long value1, Long value2) {
            addCriterion("l_id between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(Long value1, Long value2) {
            addCriterion("l_id not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andVoltIsNull() {
            addCriterion("volt is null");
            return (Criteria) this;
        }

        public Criteria andVoltIsNotNull() {
            addCriterion("volt is not null");
            return (Criteria) this;
        }

        public Criteria andVoltEqualTo(String value) {
            addCriterion("volt =", value, "volt");
            return (Criteria) this;
        }

        public Criteria andVoltNotEqualTo(String value) {
            addCriterion("volt <>", value, "volt");
            return (Criteria) this;
        }

        public Criteria andVoltGreaterThan(String value) {
            addCriterion("volt >", value, "volt");
            return (Criteria) this;
        }

        public Criteria andVoltGreaterThanOrEqualTo(String value) {
            addCriterion("volt >=", value, "volt");
            return (Criteria) this;
        }

        public Criteria andVoltLessThan(String value) {
            addCriterion("volt <", value, "volt");
            return (Criteria) this;
        }

        public Criteria andVoltLessThanOrEqualTo(String value) {
            addCriterion("volt <=", value, "volt");
            return (Criteria) this;
        }

        public Criteria andVoltLike(String value) {
            addCriterion("volt like", value, "volt");
            return (Criteria) this;
        }

        public Criteria andVoltNotLike(String value) {
            addCriterion("volt not like", value, "volt");
            return (Criteria) this;
        }

        public Criteria andVoltIn(List<String> values) {
            addCriterion("volt in", values, "volt");
            return (Criteria) this;
        }

        public Criteria andVoltNotIn(List<String> values) {
            addCriterion("volt not in", values, "volt");
            return (Criteria) this;
        }

        public Criteria andVoltBetween(String value1, String value2) {
            addCriterion("volt between", value1, value2, "volt");
            return (Criteria) this;
        }

        public Criteria andVoltNotBetween(String value1, String value2) {
            addCriterion("volt not between", value1, value2, "volt");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andYoungNumIsNull() {
            addCriterion("young_num is null");
            return (Criteria) this;
        }

        public Criteria andYoungNumIsNotNull() {
            addCriterion("young_num is not null");
            return (Criteria) this;
        }

        public Criteria andYoungNumEqualTo(Integer value) {
            addCriterion("young_num =", value, "youngNum");
            return (Criteria) this;
        }

        public Criteria andYoungNumNotEqualTo(Integer value) {
            addCriterion("young_num <>", value, "youngNum");
            return (Criteria) this;
        }

        public Criteria andYoungNumGreaterThan(Integer value) {
            addCriterion("young_num >", value, "youngNum");
            return (Criteria) this;
        }

        public Criteria andYoungNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("young_num >=", value, "youngNum");
            return (Criteria) this;
        }

        public Criteria andYoungNumLessThan(Integer value) {
            addCriterion("young_num <", value, "youngNum");
            return (Criteria) this;
        }

        public Criteria andYoungNumLessThanOrEqualTo(Integer value) {
            addCriterion("young_num <=", value, "youngNum");
            return (Criteria) this;
        }

        public Criteria andYoungNumIn(List<Integer> values) {
            addCriterion("young_num in", values, "youngNum");
            return (Criteria) this;
        }

        public Criteria andYoungNumNotIn(List<Integer> values) {
            addCriterion("young_num not in", values, "youngNum");
            return (Criteria) this;
        }

        public Criteria andYoungNumBetween(Integer value1, Integer value2) {
            addCriterion("young_num between", value1, value2, "youngNum");
            return (Criteria) this;
        }

        public Criteria andYoungNumNotBetween(Integer value1, Integer value2) {
            addCriterion("young_num not between", value1, value2, "youngNum");
            return (Criteria) this;
        }

        public Criteria andImmatureNumIsNull() {
            addCriterion("immature_num is null");
            return (Criteria) this;
        }

        public Criteria andImmatureNumIsNotNull() {
            addCriterion("immature_num is not null");
            return (Criteria) this;
        }

        public Criteria andImmatureNumEqualTo(Integer value) {
            addCriterion("immature_num =", value, "immatureNum");
            return (Criteria) this;
        }

        public Criteria andImmatureNumNotEqualTo(Integer value) {
            addCriterion("immature_num <>", value, "immatureNum");
            return (Criteria) this;
        }

        public Criteria andImmatureNumGreaterThan(Integer value) {
            addCriterion("immature_num >", value, "immatureNum");
            return (Criteria) this;
        }

        public Criteria andImmatureNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("immature_num >=", value, "immatureNum");
            return (Criteria) this;
        }

        public Criteria andImmatureNumLessThan(Integer value) {
            addCriterion("immature_num <", value, "immatureNum");
            return (Criteria) this;
        }

        public Criteria andImmatureNumLessThanOrEqualTo(Integer value) {
            addCriterion("immature_num <=", value, "immatureNum");
            return (Criteria) this;
        }

        public Criteria andImmatureNumIn(List<Integer> values) {
            addCriterion("immature_num in", values, "immatureNum");
            return (Criteria) this;
        }

        public Criteria andImmatureNumNotIn(List<Integer> values) {
            addCriterion("immature_num not in", values, "immatureNum");
            return (Criteria) this;
        }

        public Criteria andImmatureNumBetween(Integer value1, Integer value2) {
            addCriterion("immature_num between", value1, value2, "immatureNum");
            return (Criteria) this;
        }

        public Criteria andImmatureNumNotBetween(Integer value1, Integer value2) {
            addCriterion("immature_num not between", value1, value2, "immatureNum");
            return (Criteria) this;
        }

        public Criteria andMatureNumIsNull() {
            addCriterion("mature_num is null");
            return (Criteria) this;
        }

        public Criteria andMatureNumIsNotNull() {
            addCriterion("mature_num is not null");
            return (Criteria) this;
        }

        public Criteria andMatureNumEqualTo(Integer value) {
            addCriterion("mature_num =", value, "matureNum");
            return (Criteria) this;
        }

        public Criteria andMatureNumNotEqualTo(Integer value) {
            addCriterion("mature_num <>", value, "matureNum");
            return (Criteria) this;
        }

        public Criteria andMatureNumGreaterThan(Integer value) {
            addCriterion("mature_num >", value, "matureNum");
            return (Criteria) this;
        }

        public Criteria andMatureNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mature_num >=", value, "matureNum");
            return (Criteria) this;
        }

        public Criteria andMatureNumLessThan(Integer value) {
            addCriterion("mature_num <", value, "matureNum");
            return (Criteria) this;
        }

        public Criteria andMatureNumLessThanOrEqualTo(Integer value) {
            addCriterion("mature_num <=", value, "matureNum");
            return (Criteria) this;
        }

        public Criteria andMatureNumIn(List<Integer> values) {
            addCriterion("mature_num in", values, "matureNum");
            return (Criteria) this;
        }

        public Criteria andMatureNumNotIn(List<Integer> values) {
            addCriterion("mature_num not in", values, "matureNum");
            return (Criteria) this;
        }

        public Criteria andMatureNumBetween(Integer value1, Integer value2) {
            addCriterion("mature_num between", value1, value2, "matureNum");
            return (Criteria) this;
        }

        public Criteria andMatureNumNotBetween(Integer value1, Integer value2) {
            addCriterion("mature_num not between", value1, value2, "matureNum");
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