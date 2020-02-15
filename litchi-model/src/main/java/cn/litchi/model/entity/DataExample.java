package cn.litchi.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataExample() {
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

        public Criteria andTempIsNull() {
            addCriterion("temp is null");
            return (Criteria) this;
        }

        public Criteria andTempIsNotNull() {
            addCriterion("temp is not null");
            return (Criteria) this;
        }

        public Criteria andTempEqualTo(String value) {
            addCriterion("temp =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(String value) {
            addCriterion("temp <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(String value) {
            addCriterion("temp >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(String value) {
            addCriterion("temp >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(String value) {
            addCriterion("temp <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(String value) {
            addCriterion("temp <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLike(String value) {
            addCriterion("temp like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotLike(String value) {
            addCriterion("temp not like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<String> values) {
            addCriterion("temp in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<String> values) {
            addCriterion("temp not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(String value1, String value2) {
            addCriterion("temp between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(String value1, String value2) {
            addCriterion("temp not between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andHumiIsNull() {
            addCriterion("humi is null");
            return (Criteria) this;
        }

        public Criteria andHumiIsNotNull() {
            addCriterion("humi is not null");
            return (Criteria) this;
        }

        public Criteria andHumiEqualTo(String value) {
            addCriterion("humi =", value, "humi");
            return (Criteria) this;
        }

        public Criteria andHumiNotEqualTo(String value) {
            addCriterion("humi <>", value, "humi");
            return (Criteria) this;
        }

        public Criteria andHumiGreaterThan(String value) {
            addCriterion("humi >", value, "humi");
            return (Criteria) this;
        }

        public Criteria andHumiGreaterThanOrEqualTo(String value) {
            addCriterion("humi >=", value, "humi");
            return (Criteria) this;
        }

        public Criteria andHumiLessThan(String value) {
            addCriterion("humi <", value, "humi");
            return (Criteria) this;
        }

        public Criteria andHumiLessThanOrEqualTo(String value) {
            addCriterion("humi <=", value, "humi");
            return (Criteria) this;
        }

        public Criteria andHumiLike(String value) {
            addCriterion("humi like", value, "humi");
            return (Criteria) this;
        }

        public Criteria andHumiNotLike(String value) {
            addCriterion("humi not like", value, "humi");
            return (Criteria) this;
        }

        public Criteria andHumiIn(List<String> values) {
            addCriterion("humi in", values, "humi");
            return (Criteria) this;
        }

        public Criteria andHumiNotIn(List<String> values) {
            addCriterion("humi not in", values, "humi");
            return (Criteria) this;
        }

        public Criteria andHumiBetween(String value1, String value2) {
            addCriterion("humi between", value1, value2, "humi");
            return (Criteria) this;
        }

        public Criteria andHumiNotBetween(String value1, String value2) {
            addCriterion("humi not between", value1, value2, "humi");
            return (Criteria) this;
        }

        public Criteria andLxIsNull() {
            addCriterion("lx is null");
            return (Criteria) this;
        }

        public Criteria andLxIsNotNull() {
            addCriterion("lx is not null");
            return (Criteria) this;
        }

        public Criteria andLxEqualTo(String value) {
            addCriterion("lx =", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotEqualTo(String value) {
            addCriterion("lx <>", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxGreaterThan(String value) {
            addCriterion("lx >", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxGreaterThanOrEqualTo(String value) {
            addCriterion("lx >=", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLessThan(String value) {
            addCriterion("lx <", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLessThanOrEqualTo(String value) {
            addCriterion("lx <=", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLike(String value) {
            addCriterion("lx like", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotLike(String value) {
            addCriterion("lx not like", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxIn(List<String> values) {
            addCriterion("lx in", values, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotIn(List<String> values) {
            addCriterion("lx not in", values, "lx");
            return (Criteria) this;
        }

        public Criteria andLxBetween(String value1, String value2) {
            addCriterion("lx between", value1, value2, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotBetween(String value1, String value2) {
            addCriterion("lx not between", value1, value2, "lx");
            return (Criteria) this;
        }

        public Criteria andTlxIsNull() {
            addCriterion("Tlx is null");
            return (Criteria) this;
        }

        public Criteria andTlxIsNotNull() {
            addCriterion("Tlx is not null");
            return (Criteria) this;
        }

        public Criteria andTlxEqualTo(String value) {
            addCriterion("Tlx =", value, "tlx");
            return (Criteria) this;
        }

        public Criteria andTlxNotEqualTo(String value) {
            addCriterion("Tlx <>", value, "tlx");
            return (Criteria) this;
        }

        public Criteria andTlxGreaterThan(String value) {
            addCriterion("Tlx >", value, "tlx");
            return (Criteria) this;
        }

        public Criteria andTlxGreaterThanOrEqualTo(String value) {
            addCriterion("Tlx >=", value, "tlx");
            return (Criteria) this;
        }

        public Criteria andTlxLessThan(String value) {
            addCriterion("Tlx <", value, "tlx");
            return (Criteria) this;
        }

        public Criteria andTlxLessThanOrEqualTo(String value) {
            addCriterion("Tlx <=", value, "tlx");
            return (Criteria) this;
        }

        public Criteria andTlxLike(String value) {
            addCriterion("Tlx like", value, "tlx");
            return (Criteria) this;
        }

        public Criteria andTlxNotLike(String value) {
            addCriterion("Tlx not like", value, "tlx");
            return (Criteria) this;
        }

        public Criteria andTlxIn(List<String> values) {
            addCriterion("Tlx in", values, "tlx");
            return (Criteria) this;
        }

        public Criteria andTlxNotIn(List<String> values) {
            addCriterion("Tlx not in", values, "tlx");
            return (Criteria) this;
        }

        public Criteria andTlxBetween(String value1, String value2) {
            addCriterion("Tlx between", value1, value2, "tlx");
            return (Criteria) this;
        }

        public Criteria andTlxNotBetween(String value1, String value2) {
            addCriterion("Tlx not between", value1, value2, "tlx");
            return (Criteria) this;
        }

        public Criteria andWaterIsNull() {
            addCriterion("water is null");
            return (Criteria) this;
        }

        public Criteria andWaterIsNotNull() {
            addCriterion("water is not null");
            return (Criteria) this;
        }

        public Criteria andWaterEqualTo(String value) {
            addCriterion("water =", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotEqualTo(String value) {
            addCriterion("water <>", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterGreaterThan(String value) {
            addCriterion("water >", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterGreaterThanOrEqualTo(String value) {
            addCriterion("water >=", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLessThan(String value) {
            addCriterion("water <", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLessThanOrEqualTo(String value) {
            addCriterion("water <=", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLike(String value) {
            addCriterion("water like", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotLike(String value) {
            addCriterion("water not like", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterIn(List<String> values) {
            addCriterion("water in", values, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotIn(List<String> values) {
            addCriterion("water not in", values, "water");
            return (Criteria) this;
        }

        public Criteria andWaterBetween(String value1, String value2) {
            addCriterion("water between", value1, value2, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotBetween(String value1, String value2) {
            addCriterion("water not between", value1, value2, "water");
            return (Criteria) this;
        }

        public Criteria andCo2IsNull() {
            addCriterion("co2 is null");
            return (Criteria) this;
        }

        public Criteria andCo2IsNotNull() {
            addCriterion("co2 is not null");
            return (Criteria) this;
        }

        public Criteria andCo2EqualTo(String value) {
            addCriterion("co2 =", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotEqualTo(String value) {
            addCriterion("co2 <>", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2GreaterThan(String value) {
            addCriterion("co2 >", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2GreaterThanOrEqualTo(String value) {
            addCriterion("co2 >=", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2LessThan(String value) {
            addCriterion("co2 <", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2LessThanOrEqualTo(String value) {
            addCriterion("co2 <=", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2Like(String value) {
            addCriterion("co2 like", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotLike(String value) {
            addCriterion("co2 not like", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2In(List<String> values) {
            addCriterion("co2 in", values, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotIn(List<String> values) {
            addCriterion("co2 not in", values, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2Between(String value1, String value2) {
            addCriterion("co2 between", value1, value2, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotBetween(String value1, String value2) {
            addCriterion("co2 not between", value1, value2, "co2");
            return (Criteria) this;
        }

        public Criteria andWindDirectionIsNull() {
            addCriterion("wind_direction is null");
            return (Criteria) this;
        }

        public Criteria andWindDirectionIsNotNull() {
            addCriterion("wind_direction is not null");
            return (Criteria) this;
        }

        public Criteria andWindDirectionEqualTo(Byte value) {
            addCriterion("wind_direction =", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotEqualTo(Byte value) {
            addCriterion("wind_direction <>", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionGreaterThan(Byte value) {
            addCriterion("wind_direction >", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionGreaterThanOrEqualTo(Byte value) {
            addCriterion("wind_direction >=", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionLessThan(Byte value) {
            addCriterion("wind_direction <", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionLessThanOrEqualTo(Byte value) {
            addCriterion("wind_direction <=", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionIn(List<Byte> values) {
            addCriterion("wind_direction in", values, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotIn(List<Byte> values) {
            addCriterion("wind_direction not in", values, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionBetween(Byte value1, Byte value2) {
            addCriterion("wind_direction between", value1, value2, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotBetween(Byte value1, Byte value2) {
            addCriterion("wind_direction not between", value1, value2, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindStrengthIsNull() {
            addCriterion("wind_strength is null");
            return (Criteria) this;
        }

        public Criteria andWindStrengthIsNotNull() {
            addCriterion("wind_strength is not null");
            return (Criteria) this;
        }

        public Criteria andWindStrengthEqualTo(String value) {
            addCriterion("wind_strength =", value, "windStrength");
            return (Criteria) this;
        }

        public Criteria andWindStrengthNotEqualTo(String value) {
            addCriterion("wind_strength <>", value, "windStrength");
            return (Criteria) this;
        }

        public Criteria andWindStrengthGreaterThan(String value) {
            addCriterion("wind_strength >", value, "windStrength");
            return (Criteria) this;
        }

        public Criteria andWindStrengthGreaterThanOrEqualTo(String value) {
            addCriterion("wind_strength >=", value, "windStrength");
            return (Criteria) this;
        }

        public Criteria andWindStrengthLessThan(String value) {
            addCriterion("wind_strength <", value, "windStrength");
            return (Criteria) this;
        }

        public Criteria andWindStrengthLessThanOrEqualTo(String value) {
            addCriterion("wind_strength <=", value, "windStrength");
            return (Criteria) this;
        }

        public Criteria andWindStrengthLike(String value) {
            addCriterion("wind_strength like", value, "windStrength");
            return (Criteria) this;
        }

        public Criteria andWindStrengthNotLike(String value) {
            addCriterion("wind_strength not like", value, "windStrength");
            return (Criteria) this;
        }

        public Criteria andWindStrengthIn(List<String> values) {
            addCriterion("wind_strength in", values, "windStrength");
            return (Criteria) this;
        }

        public Criteria andWindStrengthNotIn(List<String> values) {
            addCriterion("wind_strength not in", values, "windStrength");
            return (Criteria) this;
        }

        public Criteria andWindStrengthBetween(String value1, String value2) {
            addCriterion("wind_strength between", value1, value2, "windStrength");
            return (Criteria) this;
        }

        public Criteria andWindStrengthNotBetween(String value1, String value2) {
            addCriterion("wind_strength not between", value1, value2, "windStrength");
            return (Criteria) this;
        }

        public Criteria andRainfallIsNull() {
            addCriterion("rainfall is null");
            return (Criteria) this;
        }

        public Criteria andRainfallIsNotNull() {
            addCriterion("rainfall is not null");
            return (Criteria) this;
        }

        public Criteria andRainfallEqualTo(String value) {
            addCriterion("rainfall =", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallNotEqualTo(String value) {
            addCriterion("rainfall <>", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallGreaterThan(String value) {
            addCriterion("rainfall >", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallGreaterThanOrEqualTo(String value) {
            addCriterion("rainfall >=", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallLessThan(String value) {
            addCriterion("rainfall <", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallLessThanOrEqualTo(String value) {
            addCriterion("rainfall <=", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallLike(String value) {
            addCriterion("rainfall like", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallNotLike(String value) {
            addCriterion("rainfall not like", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallIn(List<String> values) {
            addCriterion("rainfall in", values, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallNotIn(List<String> values) {
            addCriterion("rainfall not in", values, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallBetween(String value1, String value2) {
            addCriterion("rainfall between", value1, value2, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallNotBetween(String value1, String value2) {
            addCriterion("rainfall not between", value1, value2, "rainfall");
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