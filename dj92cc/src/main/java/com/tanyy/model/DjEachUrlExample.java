package com.tanyy.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DjEachUrlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DjEachUrlExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIdIsNull() {
            addCriterion("total_id is null");
            return (Criteria) this;
        }

        public Criteria andTotalIdIsNotNull() {
            addCriterion("total_id is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIdEqualTo(Integer value) {
            addCriterion("total_id =", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdNotEqualTo(Integer value) {
            addCriterion("total_id <>", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdGreaterThan(Integer value) {
            addCriterion("total_id >", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_id >=", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdLessThan(Integer value) {
            addCriterion("total_id <", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdLessThanOrEqualTo(Integer value) {
            addCriterion("total_id <=", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdIn(List<Integer> values) {
            addCriterion("total_id in", values, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdNotIn(List<Integer> values) {
            addCriterion("total_id not in", values, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdBetween(Integer value1, Integer value2) {
            addCriterion("total_id between", value1, value2, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("total_id not between", value1, value2, "totalId");
            return (Criteria) this;
        }

        public Criteria andDjTypeIsNull() {
            addCriterion("dj_type is null");
            return (Criteria) this;
        }

        public Criteria andDjTypeIsNotNull() {
            addCriterion("dj_type is not null");
            return (Criteria) this;
        }

        public Criteria andDjTypeEqualTo(Integer value) {
            addCriterion("dj_type =", value, "djType");
            return (Criteria) this;
        }

        public Criteria andDjTypeNotEqualTo(Integer value) {
            addCriterion("dj_type <>", value, "djType");
            return (Criteria) this;
        }

        public Criteria andDjTypeGreaterThan(Integer value) {
            addCriterion("dj_type >", value, "djType");
            return (Criteria) this;
        }

        public Criteria andDjTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dj_type >=", value, "djType");
            return (Criteria) this;
        }

        public Criteria andDjTypeLessThan(Integer value) {
            addCriterion("dj_type <", value, "djType");
            return (Criteria) this;
        }

        public Criteria andDjTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dj_type <=", value, "djType");
            return (Criteria) this;
        }

        public Criteria andDjTypeIn(List<Integer> values) {
            addCriterion("dj_type in", values, "djType");
            return (Criteria) this;
        }

        public Criteria andDjTypeNotIn(List<Integer> values) {
            addCriterion("dj_type not in", values, "djType");
            return (Criteria) this;
        }

        public Criteria andDjTypeBetween(Integer value1, Integer value2) {
            addCriterion("dj_type between", value1, value2, "djType");
            return (Criteria) this;
        }

        public Criteria andDjTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dj_type not between", value1, value2, "djType");
            return (Criteria) this;
        }

        public Criteria andPageUrlIsNull() {
            addCriterion("page_url is null");
            return (Criteria) this;
        }

        public Criteria andPageUrlIsNotNull() {
            addCriterion("page_url is not null");
            return (Criteria) this;
        }

        public Criteria andPageUrlEqualTo(String value) {
            addCriterion("page_url =", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotEqualTo(String value) {
            addCriterion("page_url <>", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlGreaterThan(String value) {
            addCriterion("page_url >", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("page_url >=", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLessThan(String value) {
            addCriterion("page_url <", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLessThanOrEqualTo(String value) {
            addCriterion("page_url <=", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLike(String value) {
            addCriterion("page_url like", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotLike(String value) {
            addCriterion("page_url not like", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlIn(List<String> values) {
            addCriterion("page_url in", values, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotIn(List<String> values) {
            addCriterion("page_url not in", values, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlBetween(String value1, String value2) {
            addCriterion("page_url between", value1, value2, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotBetween(String value1, String value2) {
            addCriterion("page_url not between", value1, value2, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeIsNull() {
            addCriterion("extract_time is null");
            return (Criteria) this;
        }

        public Criteria andExtractTimeIsNotNull() {
            addCriterion("extract_time is not null");
            return (Criteria) this;
        }

        public Criteria andExtractTimeEqualTo(Date value) {
            addCriterion("extract_time =", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeNotEqualTo(Date value) {
            addCriterion("extract_time <>", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeGreaterThan(Date value) {
            addCriterion("extract_time >", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("extract_time >=", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeLessThan(Date value) {
            addCriterion("extract_time <", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeLessThanOrEqualTo(Date value) {
            addCriterion("extract_time <=", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeIn(List<Date> values) {
            addCriterion("extract_time in", values, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeNotIn(List<Date> values) {
            addCriterion("extract_time not in", values, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeBetween(Date value1, Date value2) {
            addCriterion("extract_time between", value1, value2, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeNotBetween(Date value1, Date value2) {
            addCriterion("extract_time not between", value1, value2, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractCountIsNull() {
            addCriterion("extract_count is null");
            return (Criteria) this;
        }

        public Criteria andExtractCountIsNotNull() {
            addCriterion("extract_count is not null");
            return (Criteria) this;
        }

        public Criteria andExtractCountEqualTo(Integer value) {
            addCriterion("extract_count =", value, "extractCount");
            return (Criteria) this;
        }

        public Criteria andExtractCountNotEqualTo(Integer value) {
            addCriterion("extract_count <>", value, "extractCount");
            return (Criteria) this;
        }

        public Criteria andExtractCountGreaterThan(Integer value) {
            addCriterion("extract_count >", value, "extractCount");
            return (Criteria) this;
        }

        public Criteria andExtractCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("extract_count >=", value, "extractCount");
            return (Criteria) this;
        }

        public Criteria andExtractCountLessThan(Integer value) {
            addCriterion("extract_count <", value, "extractCount");
            return (Criteria) this;
        }

        public Criteria andExtractCountLessThanOrEqualTo(Integer value) {
            addCriterion("extract_count <=", value, "extractCount");
            return (Criteria) this;
        }

        public Criteria andExtractCountIn(List<Integer> values) {
            addCriterion("extract_count in", values, "extractCount");
            return (Criteria) this;
        }

        public Criteria andExtractCountNotIn(List<Integer> values) {
            addCriterion("extract_count not in", values, "extractCount");
            return (Criteria) this;
        }

        public Criteria andExtractCountBetween(Integer value1, Integer value2) {
            addCriterion("extract_count between", value1, value2, "extractCount");
            return (Criteria) this;
        }

        public Criteria andExtractCountNotBetween(Integer value1, Integer value2) {
            addCriterion("extract_count not between", value1, value2, "extractCount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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