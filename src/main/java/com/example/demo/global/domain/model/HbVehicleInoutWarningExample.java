package com.example.demo.global.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbVehicleInoutWarningExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    public HbVehicleInoutWarningExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVehicleidIsNull() {
            addCriterion("vehicleid is null");
            return (Criteria) this;
        }

        public Criteria andVehicleidIsNotNull() {
            addCriterion("vehicleid is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleidEqualTo(String value) {
            addCriterion("vehicleid =", value, "vehicleid");
            return (Criteria) this;
        }

        public Criteria andVehicleidNotEqualTo(String value) {
            addCriterion("vehicleid <>", value, "vehicleid");
            return (Criteria) this;
        }

        public Criteria andVehicleidGreaterThan(String value) {
            addCriterion("vehicleid >", value, "vehicleid");
            return (Criteria) this;
        }

        public Criteria andVehicleidGreaterThanOrEqualTo(String value) {
            addCriterion("vehicleid >=", value, "vehicleid");
            return (Criteria) this;
        }

        public Criteria andVehicleidLessThan(String value) {
            addCriterion("vehicleid <", value, "vehicleid");
            return (Criteria) this;
        }

        public Criteria andVehicleidLessThanOrEqualTo(String value) {
            addCriterion("vehicleid <=", value, "vehicleid");
            return (Criteria) this;
        }

        public Criteria andVehicleidLike(String value) {
            addCriterion("vehicleid like", value, "vehicleid");
            return (Criteria) this;
        }

        public Criteria andVehicleidNotLike(String value) {
            addCriterion("vehicleid not like", value, "vehicleid");
            return (Criteria) this;
        }

        public Criteria andVehicleidIn(List<String> values) {
            addCriterion("vehicleid in", values, "vehicleid");
            return (Criteria) this;
        }

        public Criteria andVehicleidNotIn(List<String> values) {
            addCriterion("vehicleid not in", values, "vehicleid");
            return (Criteria) this;
        }

        public Criteria andVehicleidBetween(String value1, String value2) {
            addCriterion("vehicleid between", value1, value2, "vehicleid");
            return (Criteria) this;
        }

        public Criteria andVehicleidNotBetween(String value1, String value2) {
            addCriterion("vehicleid not between", value1, value2, "vehicleid");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgid is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("orgid =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("orgid <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("orgid >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("orgid >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("orgid <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("orgid <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("orgid like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("orgid not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("orgid in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("orgid not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("orgid between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("orgid not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("orgname is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("orgname is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("orgname =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("orgname <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("orgname >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("orgname >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("orgname <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("orgname <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("orgname like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("orgname not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("orgname in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("orgname not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("orgname between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("orgname not between", value1, value2, "orgname");
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

        public Criteria andCreateidtimeIsNull() {
            addCriterion("createidtime is null");
            return (Criteria) this;
        }

        public Criteria andCreateidtimeIsNotNull() {
            addCriterion("createidtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateidtimeEqualTo(Date value) {
            addCriterion("createidtime =", value, "createidtime");
            return (Criteria) this;
        }

        public Criteria andCreateidtimeNotEqualTo(Date value) {
            addCriterion("createidtime <>", value, "createidtime");
            return (Criteria) this;
        }

        public Criteria andCreateidtimeGreaterThan(Date value) {
            addCriterion("createidtime >", value, "createidtime");
            return (Criteria) this;
        }

        public Criteria andCreateidtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createidtime >=", value, "createidtime");
            return (Criteria) this;
        }

        public Criteria andCreateidtimeLessThan(Date value) {
            addCriterion("createidtime <", value, "createidtime");
            return (Criteria) this;
        }

        public Criteria andCreateidtimeLessThanOrEqualTo(Date value) {
            addCriterion("createidtime <=", value, "createidtime");
            return (Criteria) this;
        }

        public Criteria andCreateidtimeIn(List<Date> values) {
            addCriterion("createidtime in", values, "createidtime");
            return (Criteria) this;
        }

        public Criteria andCreateidtimeNotIn(List<Date> values) {
            addCriterion("createidtime not in", values, "createidtime");
            return (Criteria) this;
        }

        public Criteria andCreateidtimeBetween(Date value1, Date value2) {
            addCriterion("createidtime between", value1, value2, "createidtime");
            return (Criteria) this;
        }

        public Criteria andCreateidtimeNotBetween(Date value1, Date value2) {
            addCriterion("createidtime not between", value1, value2, "createidtime");
            return (Criteria) this;
        }

        public Criteria andDealstateIsNull() {
            addCriterion("dealstate is null");
            return (Criteria) this;
        }

        public Criteria andDealstateIsNotNull() {
            addCriterion("dealstate is not null");
            return (Criteria) this;
        }

        public Criteria andDealstateEqualTo(String value) {
            addCriterion("dealstate =", value, "dealstate");
            return (Criteria) this;
        }

        public Criteria andDealstateNotEqualTo(String value) {
            addCriterion("dealstate <>", value, "dealstate");
            return (Criteria) this;
        }

        public Criteria andDealstateGreaterThan(String value) {
            addCriterion("dealstate >", value, "dealstate");
            return (Criteria) this;
        }

        public Criteria andDealstateGreaterThanOrEqualTo(String value) {
            addCriterion("dealstate >=", value, "dealstate");
            return (Criteria) this;
        }

        public Criteria andDealstateLessThan(String value) {
            addCriterion("dealstate <", value, "dealstate");
            return (Criteria) this;
        }

        public Criteria andDealstateLessThanOrEqualTo(String value) {
            addCriterion("dealstate <=", value, "dealstate");
            return (Criteria) this;
        }

        public Criteria andDealstateLike(String value) {
            addCriterion("dealstate like", value, "dealstate");
            return (Criteria) this;
        }

        public Criteria andDealstateNotLike(String value) {
            addCriterion("dealstate not like", value, "dealstate");
            return (Criteria) this;
        }

        public Criteria andDealstateIn(List<String> values) {
            addCriterion("dealstate in", values, "dealstate");
            return (Criteria) this;
        }

        public Criteria andDealstateNotIn(List<String> values) {
            addCriterion("dealstate not in", values, "dealstate");
            return (Criteria) this;
        }

        public Criteria andDealstateBetween(String value1, String value2) {
            addCriterion("dealstate between", value1, value2, "dealstate");
            return (Criteria) this;
        }

        public Criteria andDealstateNotBetween(String value1, String value2) {
            addCriterion("dealstate not between", value1, value2, "dealstate");
            return (Criteria) this;
        }

        public Criteria andDealuseridIsNull() {
            addCriterion("dealuserid is null");
            return (Criteria) this;
        }

        public Criteria andDealuseridIsNotNull() {
            addCriterion("dealuserid is not null");
            return (Criteria) this;
        }

        public Criteria andDealuseridEqualTo(String value) {
            addCriterion("dealuserid =", value, "dealuserid");
            return (Criteria) this;
        }

        public Criteria andDealuseridNotEqualTo(String value) {
            addCriterion("dealuserid <>", value, "dealuserid");
            return (Criteria) this;
        }

        public Criteria andDealuseridGreaterThan(String value) {
            addCriterion("dealuserid >", value, "dealuserid");
            return (Criteria) this;
        }

        public Criteria andDealuseridGreaterThanOrEqualTo(String value) {
            addCriterion("dealuserid >=", value, "dealuserid");
            return (Criteria) this;
        }

        public Criteria andDealuseridLessThan(String value) {
            addCriterion("dealuserid <", value, "dealuserid");
            return (Criteria) this;
        }

        public Criteria andDealuseridLessThanOrEqualTo(String value) {
            addCriterion("dealuserid <=", value, "dealuserid");
            return (Criteria) this;
        }

        public Criteria andDealuseridLike(String value) {
            addCriterion("dealuserid like", value, "dealuserid");
            return (Criteria) this;
        }

        public Criteria andDealuseridNotLike(String value) {
            addCriterion("dealuserid not like", value, "dealuserid");
            return (Criteria) this;
        }

        public Criteria andDealuseridIn(List<String> values) {
            addCriterion("dealuserid in", values, "dealuserid");
            return (Criteria) this;
        }

        public Criteria andDealuseridNotIn(List<String> values) {
            addCriterion("dealuserid not in", values, "dealuserid");
            return (Criteria) this;
        }

        public Criteria andDealuseridBetween(String value1, String value2) {
            addCriterion("dealuserid between", value1, value2, "dealuserid");
            return (Criteria) this;
        }

        public Criteria andDealuseridNotBetween(String value1, String value2) {
            addCriterion("dealuserid not between", value1, value2, "dealuserid");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNull() {
            addCriterion("dealtime is null");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNotNull() {
            addCriterion("dealtime is not null");
            return (Criteria) this;
        }

        public Criteria andDealtimeEqualTo(Date value) {
            addCriterion("dealtime =", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotEqualTo(Date value) {
            addCriterion("dealtime <>", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThan(Date value) {
            addCriterion("dealtime >", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dealtime >=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThan(Date value) {
            addCriterion("dealtime <", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThanOrEqualTo(Date value) {
            addCriterion("dealtime <=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeIn(List<Date> values) {
            addCriterion("dealtime in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotIn(List<Date> values) {
            addCriterion("dealtime not in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeBetween(Date value1, Date value2) {
            addCriterion("dealtime between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotBetween(Date value1, Date value2) {
            addCriterion("dealtime not between", value1, value2, "dealtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hb_vehicle_inout_warning
     *
     * @mbg.generated
     */
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