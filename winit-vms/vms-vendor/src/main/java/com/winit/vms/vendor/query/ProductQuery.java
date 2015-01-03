package com.winit.vms.vendor.query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.winit.vms.base.query.OrderBy;
import com.winit.vms.base.query.SetData;
import com.winit.vms.base.query.Direction;
public class ProductQuery {
	public static class FindQuery {

		protected boolean distinct;

		protected List<Criteria> oredCriteria;

		
		protected OrderByClause orderByClause;
		
		public FindQuery() {
			oredCriteria = new ArrayList<Criteria>();
			orderByClause = new OrderByClause();

		}
		
		public OrderByClause getOrderByClause() {
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
	}

	public static class UpdateQuery {
		protected UpdateClause updateClause;

		protected List<Criteria> oredCriteria;

		public UpdateClause getUpdateClause() {
			return updateClause;
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

		public UpdateQuery() {
			oredCriteria = new ArrayList<Criteria>();
			updateClause = new UpdateClause();
		}

	}

	public static class DeleteQuery {
		protected List<Criteria> oredCriteria;

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

		public DeleteQuery() {
			oredCriteria = new ArrayList<Criteria>();
		}

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
			addCriterion("id_ is null");
			return (Criteria) this;
		}
		
		public Criteria andIdIsNotNull() {
			addCriterion("id_ is not null");
			return (Criteria) this;
		}
		public Criteria andIdEqualTo(Long  value) {
			addCriterion("id_ =", value, "id");
			return (Criteria) this;
		}
			
		
		public Criteria andIdBetween(Long  value1, Long  value2) {
			addCriterion("id_ between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id_ in", values, "id");
			return (Criteria) this;
		}
		public Criteria andIdGreaterThan(Long  value) {
			addCriterion("id_ >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long  value) {
			addCriterion("id_ >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long  value) {
			addCriterion("id_ <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long  value) {
			addCriterion("id_ <=", value, "id");
			return (Criteria) this;
		}
		
		public Criteria andNameIsNull() {
			addCriterion("name_ is null");
			return (Criteria) this;
		}
		
		public Criteria andNameIsNotNull() {
			addCriterion("name_ is not null");
			return (Criteria) this;
		}
		public Criteria andNameEqualTo(String  value) {
			addCriterion("name_ =", value, "name");
			return (Criteria) this;
		}
			
		
		public Criteria andNameBetween(String  value1, String  value2) {
			addCriterion("name_ between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name_ in", values, "name");
			return (Criteria) this;
		}
		public Criteria andNameLike(String  value) {
			addCriterion("name_ like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String  value) {
			addCriterion("name_ not like", value, "name");
			return (Criteria) this;
		}
		
		public Criteria andCodeIsNull() {
			addCriterion("code_ is null");
			return (Criteria) this;
		}
		
		public Criteria andCodeIsNotNull() {
			addCriterion("code_ is not null");
			return (Criteria) this;
		}
		public Criteria andCodeEqualTo(String  value) {
			addCriterion("code_ =", value, "code");
			return (Criteria) this;
		}
			
		
		public Criteria andCodeBetween(String  value1, String  value2) {
			addCriterion("code_ between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("code_ in", values, "code");
			return (Criteria) this;
		}
		public Criteria andCodeLike(String  value) {
			addCriterion("code_ like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String  value) {
			addCriterion("code_ not like", value, "code");
			return (Criteria) this;
		}
		
		public Criteria andDescriptionIsNull() {
			addCriterion("description_ is null");
			return (Criteria) this;
		}
		
		public Criteria andDescriptionIsNotNull() {
			addCriterion("description_ is not null");
			return (Criteria) this;
		}
		public Criteria andDescriptionEqualTo(String  value) {
			addCriterion("description_ =", value, "description");
			return (Criteria) this;
		}
			
		
		public Criteria andDescriptionBetween(String  value1, String  value2) {
			addCriterion("description_ between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description_ in", values, "description");
			return (Criteria) this;
		}
		public Criteria andDescriptionLike(String  value) {
			addCriterion("description_ like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String  value) {
			addCriterion("description_ not like", value, "description");
			return (Criteria) this;
		}
		
		public Criteria andVenderIdIsNull() {
			addCriterion("vender_id_ is null");
			return (Criteria) this;
		}
		
		public Criteria andVenderIdIsNotNull() {
			addCriterion("vender_id_ is not null");
			return (Criteria) this;
		}
		public Criteria andVenderIdEqualTo(Long  value) {
			addCriterion("vender_id_ =", value, "venderId");
			return (Criteria) this;
		}
			
		
		public Criteria andVenderIdBetween(Long  value1, Long  value2) {
			addCriterion("vender_id_ between", value1, value2, "venderId");
			return (Criteria) this;
		}

		public Criteria andVenderIdIn(List<Long> values) {
			addCriterion("vender_id_ in", values, "venderId");
			return (Criteria) this;
		}
		public Criteria andVenderIdGreaterThan(Long  value) {
			addCriterion("vender_id_ >", value, "venderId");
			return (Criteria) this;
		}

		public Criteria andVenderIdGreaterThanOrEqualTo(Long  value) {
			addCriterion("vender_id_ >=", value, "venderId");
			return (Criteria) this;
		}

		public Criteria andVenderIdLessThan(Long  value) {
			addCriterion("vender_id_ <", value, "venderId");
			return (Criteria) this;
		}

		public Criteria andVenderIdLessThanOrEqualTo(Long  value) {
			addCriterion("vender_id_ <=", value, "venderId");
			return (Criteria) this;
		}
		
		public Criteria andCreatedIsNull() {
			addCriterion("created_ is null");
			return (Criteria) this;
		}
		
		public Criteria andCreatedIsNotNull() {
			addCriterion("created_ is not null");
			return (Criteria) this;
		}
		public Criteria andCreatedEqualTo(Date  value) {
			addCriterion("created_ =", value, "created");
			return (Criteria) this;
		}
			
		
		public Criteria andCreatedBetween(Date  value1, Date  value2) {
			addCriterion("created_ between", value1, value2, "created");
			return (Criteria) this;
		}

		
		public Criteria andCreatedByIsNull() {
			addCriterion("Created_By_ is null");
			return (Criteria) this;
		}
		
		public Criteria andCreatedByIsNotNull() {
			addCriterion("Created_By_ is not null");
			return (Criteria) this;
		}
		public Criteria andCreatedByEqualTo(Long  value) {
			addCriterion("Created_By_ =", value, "createdBy");
			return (Criteria) this;
		}
			
		
		public Criteria andCreatedByBetween(Long  value1, Long  value2) {
			addCriterion("Created_By_ between", value1, value2, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByIn(List<Long> values) {
			addCriterion("Created_By_ in", values, "createdBy");
			return (Criteria) this;
		}
		public Criteria andCreatedByGreaterThan(Long  value) {
			addCriterion("Created_By_ >", value, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByGreaterThanOrEqualTo(Long  value) {
			addCriterion("Created_By_ >=", value, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByLessThan(Long  value) {
			addCriterion("Created_By_ <", value, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByLessThanOrEqualTo(Long  value) {
			addCriterion("Created_By_ <=", value, "createdBy");
			return (Criteria) this;
		}
		
		public Criteria andIsActiveIsNull() {
			addCriterion("Is_Active_ is null");
			return (Criteria) this;
		}
		
		public Criteria andIsActiveIsNotNull() {
			addCriterion("Is_Active_ is not null");
			return (Criteria) this;
		}
		public Criteria andIsActiveEqualTo(Boolean  value) {
			addCriterion("Is_Active_ =", value, "isActive");
			return (Criteria) this;
		}
			
		

		
		public Criteria andUpdatedIsNull() {
			addCriterion("updated_ is null");
			return (Criteria) this;
		}
		
		public Criteria andUpdatedIsNotNull() {
			addCriterion("updated_ is not null");
			return (Criteria) this;
		}
		public Criteria andUpdatedEqualTo(Date  value) {
			addCriterion("updated_ =", value, "updated");
			return (Criteria) this;
		}
			
		
		public Criteria andUpdatedBetween(Date  value1, Date  value2) {
			addCriterion("updated_ between", value1, value2, "updated");
			return (Criteria) this;
		}

		
		public Criteria andUpdatedByIsNull() {
			addCriterion("updated_by_ is null");
			return (Criteria) this;
		}
		
		public Criteria andUpdatedByIsNotNull() {
			addCriterion("updated_by_ is not null");
			return (Criteria) this;
		}
		public Criteria andUpdatedByEqualTo(Long  value) {
			addCriterion("updated_by_ =", value, "updatedBy");
			return (Criteria) this;
		}
			
		
		public Criteria andUpdatedByBetween(Long  value1, Long  value2) {
			addCriterion("updated_by_ between", value1, value2, "updatedBy");
			return (Criteria) this;
		}

		public Criteria andUpdatedByIn(List<Long> values) {
			addCriterion("updated_by_ in", values, "updatedBy");
			return (Criteria) this;
		}
		public Criteria andUpdatedByGreaterThan(Long  value) {
			addCriterion("updated_by_ >", value, "updatedBy");
			return (Criteria) this;
		}

		public Criteria andUpdatedByGreaterThanOrEqualTo(Long  value) {
			addCriterion("updated_by_ >=", value, "updatedBy");
			return (Criteria) this;
		}

		public Criteria andUpdatedByLessThan(Long  value) {
			addCriterion("updated_by_ <", value, "updatedBy");
			return (Criteria) this;
		}

		public Criteria andUpdatedByLessThanOrEqualTo(Long  value) {
			addCriterion("updated_by_ <=", value, "updatedBy");
			return (Criteria) this;
		}
		
		public Criteria andOrgIdIsNull() {
			addCriterion("org_id_ is null");
			return (Criteria) this;
		}
		
		public Criteria andOrgIdIsNotNull() {
			addCriterion("org_id_ is not null");
			return (Criteria) this;
		}
		public Criteria andOrgIdEqualTo(Long  value) {
			addCriterion("org_id_ =", value, "orgId");
			return (Criteria) this;
		}
			
		
		public Criteria andOrgIdBetween(Long  value1, Long  value2) {
			addCriterion("org_id_ between", value1, value2, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdIn(List<Long> values) {
			addCriterion("org_id_ in", values, "orgId");
			return (Criteria) this;
		}
		public Criteria andOrgIdGreaterThan(Long  value) {
			addCriterion("org_id_ >", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdGreaterThanOrEqualTo(Long  value) {
			addCriterion("org_id_ >=", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLessThan(Long  value) {
			addCriterion("org_id_ <", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLessThanOrEqualTo(Long  value) {
			addCriterion("org_id_ <=", value, "orgId");
			return (Criteria) this;
		}
		
		public Criteria andTransitTimeIsNull() {
			addCriterion("Transit_time_ is null");
			return (Criteria) this;
		}
		
		public Criteria andTransitTimeIsNotNull() {
			addCriterion("Transit_time_ is not null");
			return (Criteria) this;
		}
		public Criteria andTransitTimeEqualTo(Integer  value) {
			addCriterion("Transit_time_ =", value, "transitTime");
			return (Criteria) this;
		}
			
		
		public Criteria andTransitTimeBetween(Integer  value1, Integer  value2) {
			addCriterion("Transit_time_ between", value1, value2, "transitTime");
			return (Criteria) this;
		}

		public Criteria andTransitTimeIn(List<Integer> values) {
			addCriterion("Transit_time_ in", values, "transitTime");
			return (Criteria) this;
		}
		public Criteria andTransitTimeGreaterThan(Integer  value) {
			addCriterion("Transit_time_ >", value, "transitTime");
			return (Criteria) this;
		}

		public Criteria andTransitTimeGreaterThanOrEqualTo(Integer  value) {
			addCriterion("Transit_time_ >=", value, "transitTime");
			return (Criteria) this;
		}

		public Criteria andTransitTimeLessThan(Integer  value) {
			addCriterion("Transit_time_ <", value, "transitTime");
			return (Criteria) this;
		}

		public Criteria andTransitTimeLessThanOrEqualTo(Integer  value) {
			addCriterion("Transit_time_ <=", value, "transitTime");
			return (Criteria) this;
		}
		
		public Criteria andFirstTrackTimeIsNull() {
			addCriterion("First_track_time_ is null");
			return (Criteria) this;
		}
		
		public Criteria andFirstTrackTimeIsNotNull() {
			addCriterion("First_track_time_ is not null");
			return (Criteria) this;
		}
		public Criteria andFirstTrackTimeEqualTo(Integer  value) {
			addCriterion("First_track_time_ =", value, "firstTrackTime");
			return (Criteria) this;
		}
			
		
		public Criteria andFirstTrackTimeBetween(Integer  value1, Integer  value2) {
			addCriterion("First_track_time_ between", value1, value2, "firstTrackTime");
			return (Criteria) this;
		}

		public Criteria andFirstTrackTimeIn(List<Integer> values) {
			addCriterion("First_track_time_ in", values, "firstTrackTime");
			return (Criteria) this;
		}
		public Criteria andFirstTrackTimeGreaterThan(Integer  value) {
			addCriterion("First_track_time_ >", value, "firstTrackTime");
			return (Criteria) this;
		}

		public Criteria andFirstTrackTimeGreaterThanOrEqualTo(Integer  value) {
			addCriterion("First_track_time_ >=", value, "firstTrackTime");
			return (Criteria) this;
		}

		public Criteria andFirstTrackTimeLessThan(Integer  value) {
			addCriterion("First_track_time_ <", value, "firstTrackTime");
			return (Criteria) this;
		}

		public Criteria andFirstTrackTimeLessThanOrEqualTo(Integer  value) {
			addCriterion("First_track_time_ <=", value, "firstTrackTime");
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

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value) {
			super();
			this.condition = condition;
			this.value = value;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.betweenValue = true;
		}
	}

	public static class UpdateClause {
		protected List<SetData> dataClauses;

		public List<SetData> getdataClauses() {
			if (dataClauses.size() == 0) {
				throw new RuntimeException("更新的数据，必须指定");
			}
			return dataClauses;
		}

		protected UpdateClause() {
			this.dataClauses = new ArrayList<SetData>();
		}
		
		public void setName(String  name) {
			dataClauses.add(new SetData("name_ = ", name));
		}
		
		public void setCode(String  code) {
			dataClauses.add(new SetData("code_ = ", code));
		}
		
		public void setDescription(String  description) {
			dataClauses.add(new SetData("description_ = ", description));
		}
		
		public void setVenderId(Long  venderId) {
			dataClauses.add(new SetData("vender_id_ = ", venderId));
		}
		
		public void setCreated(Date  created) {
			dataClauses.add(new SetData("created_ = ", created));
		}
		
		public void setCreatedBy(Long  createdBy) {
			dataClauses.add(new SetData("Created_By_ = ", createdBy));
		}
		
		public void setIsActive(Boolean  isActive) {
			dataClauses.add(new SetData("Is_Active_ = ", isActive));
		}
		
		public void setUpdated(Date  updated) {
			dataClauses.add(new SetData("updated_ = ", updated));
		}
		
		public void setUpdatedBy(Long  updatedBy) {
			dataClauses.add(new SetData("updated_by_ = ", updatedBy));
		}
		
		public void setOrgId(Long  orgId) {
			dataClauses.add(new SetData("org_id_ = ", orgId));
		}
		
		public void setTransitTime(Integer  transitTime) {
			dataClauses.add(new SetData("Transit_time_ = ", transitTime));
		}
		
		public void setFirstTrackTime(Integer  firstTrackTime) {
			dataClauses.add(new SetData("First_track_time_ = ", firstTrackTime));
		}

	}
	public static class OrderByClause{
		protected List<OrderBy> orderBys;
		public List<OrderBy> getOrderBys() {
			return orderBys;
		}
		
		public boolean isValid(){
			return orderBys!=null && !orderBys.isEmpty();
		}
		
		public void clear() {
			orderBys.clear();
		}

		public OrderByClause() {
			this.orderBys = new ArrayList<OrderBy>();
		}

		
	}
}