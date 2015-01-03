package com.winit.vms.vendor.entity;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.winit.vms.base.entity.AbstractModel;

/**
 * 对象功能:vms_ve_vendor entity对象
 * 开发公司:WINIT
 * 开发人员:longsheng.wang
 * 创建时间:2015-01-03 14:58:07
 */
public class Vendor extends AbstractModel<Long> implements Cloneable{
	protected Long  id; /*id_*/
	protected String  name; /*name_*/
	protected String  code; /*code_*/
	protected Long  warehouseId; /*warehouse_id_*/
	
		 
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
	
		 
	public void setWarehouseId(Long warehouseId) 
	{
		this.warehouseId = warehouseId;
	}
	/**
	 * 返回 warehouse_id_
	 * @return
	 */
	public Long getWarehouseId() 
	{
		return this.warehouseId;
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
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		return new ToStringBuilder(this)
		.append("id", this.id) 
		.append("name", this.name) 
		.append("code", this.code) 
		.append("warehouseId", this.warehouseId) 
		.append("created", this.created) 
		.append("createdBy", this.createdBy) 
		.append("isActive", this.isActive) 
		.append("updated", this.updated) 
		.append("updatedBy", this.updatedBy) 
		.append("orgId", this.orgId) 
		.toString();
	}
}