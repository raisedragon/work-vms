package com.winit.vms.vendor.entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.winit.vms.base.entity.AbstractModel;

/**
 * 对象功能:vms_ve_product entity对象
 * 开发公司:WINIT
 * 开发人员:longsheng.wang
 * 创建时间:2015-01-03 14:58:08
 */
public class Product extends AbstractModel<Long> implements Cloneable{
	protected Long  id; /*id_*/
	protected String  name; /*name_*/
	protected String  code; /*code_*/
	protected String  description; /*description_*/
	protected Long  venderId; /*vender_id_*/
	protected Integer  transitTime; /*Transit_time_*/
	protected Integer  firstTrackTime; /*First_track_time_*/
	protected List<ProductParam> productParamList=new ArrayList<ProductParam>(); /*vms_ve_product_param列表*/
	protected List<ProductConstraint> productConstraintList=new ArrayList<ProductConstraint>(); /*vms_ve_product_constraint列表*/
	protected List<TrackMapping> trackMappingList=new ArrayList<TrackMapping>(); /*vms_ve_track_mapping列表*/
	
		 
	public void setId(Long id) 
	{
		this.id = id;
	}
	/**
	 * 返回 id_
	 * @return
	 */
	public Long getId() 
	{
		return this.id;
	}
	
		 
	public void setName(String name) 
	{
		this.name = name;
	}
	/**
	 * 返回 name_
	 * @return
	 */
	public String getName() 
	{
		return this.name;
	}
	
		 
	public void setCode(String code) 
	{
		this.code = code;
	}
	/**
	 * 返回 code_
	 * @return
	 */
	public String getCode() 
	{
		return this.code;
	}
	
		 
	public void setDescription(String description) 
	{
		this.description = description;
	}
	/**
	 * 返回 description_
	 * @return
	 */
	public String getDescription() 
	{
		return this.description;
	}
	
		 
	public void setVenderId(Long venderId) 
	{
		this.venderId = venderId;
	}
	/**
	 * 返回 vender_id_
	 * @return
	 */
	public Long getVenderId() 
	{
		return this.venderId;
	}
	
		 
	public void setUpdatedBy(Long updatedBy) 
	{
		this.updatedBy = updatedBy;
	}
	/**
	 * 返回 updated_by_
	 * @return
	 */
	public Long getUpdatedBy() 
	{
		return this.updatedBy;
	}
	
		 
	public void setTransitTime(Integer transitTime) 
	{
		this.transitTime = transitTime;
	}
	/**
	 * 返回 Transit_time_
	 * @return
	 */
	public Integer getTransitTime() 
	{
		return this.transitTime;
	}
	
		 
	public void setFirstTrackTime(Integer firstTrackTime) 
	{
		this.firstTrackTime = firstTrackTime;
	}
	/**
	 * 返回 First_track_time_
	 * @return
	 */
	public Integer getFirstTrackTime() 
	{
		return this.firstTrackTime;
	}
	public void setProductParamList(List<ProductParam> productParamList) 
	{
		this.productParamList = productParamList;
	}
	/**
	 * 返回 vms_ve_product_param列表
	 * @return
	 */
	public List<ProductParam> getProductParamList() 
	{
		return this.productParamList;
	}
	public void setProductConstraintList(List<ProductConstraint> productConstraintList) 
	{
		this.productConstraintList = productConstraintList;
	}
	/**
	 * 返回 vms_ve_product_constraint列表
	 * @return
	 */
	public List<ProductConstraint> getProductConstraintList() 
	{
		return this.productConstraintList;
	}
	public void setTrackMappingList(List<TrackMapping> trackMappingList) 
	{
		this.trackMappingList = trackMappingList;
	}
	/**
	 * 返回 vms_ve_track_mapping列表
	 * @return
	 */
	public List<TrackMapping> getTrackMappingList() 
	{
		return this.trackMappingList;
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		return new ToStringBuilder(this)
		.append("id", this.id) 
		.append("name", this.name) 
		.append("code", this.code) 
		.append("description", this.description) 
		.append("venderId", this.venderId) 
		.append("created", this.created) 
		.append("createdBy", this.createdBy) 
		.append("isActive", this.isActive) 
		.append("updated", this.updated) 
		.append("updatedBy", this.updatedBy) 
		.append("orgId", this.orgId) 
		.append("transitTime", this.transitTime) 
		.append("firstTrackTime", this.firstTrackTime) 
		.toString();
	}
}