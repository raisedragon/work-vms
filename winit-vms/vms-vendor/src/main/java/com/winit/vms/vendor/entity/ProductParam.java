package com.winit.vms.vendor.entity;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.winit.vms.base.entity.AbstractModel;

/**
 * 对象功能:vms_ve_product_param entity对象
 * 开发公司:WINIT
 * 开发人员:longsheng.wang
 * 创建时间:2015-01-03 14:58:07
 */
public class ProductParam extends AbstractModel<Long> implements Cloneable{
	protected Long  id; /*id_*/
	protected String  name; /*name_*/
	protected String  value; /*value_*/
	protected String  description; /*description_*/
	protected Long  productId; /*product_id_*/
	
		 
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
	
		 
	public void setValue(String value) 
	{
		this.value = value;
	}
	/**
	 * 返回 value_
	 * @return
	 */
	public String getValue() 
	{
		return this.value;
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
	
		 
	public void setProductId(Long productId) 
	{
		this.productId = productId;
	}
	/**
	 * 返回 product_id_
	 * @return
	 */
	public Long getProductId() 
	{
		return this.productId;
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
		.append("value", this.value) 
		.append("description", this.description) 
		.append("productId", this.productId) 
		.append("created", this.created) 
		.append("createdBy", this.createdBy) 
		.append("isActive", this.isActive) 
		.append("updated", this.updated) 
		.append("updatedBy", this.updatedBy) 
		.append("orgId", this.orgId) 
		.toString();
	}
}