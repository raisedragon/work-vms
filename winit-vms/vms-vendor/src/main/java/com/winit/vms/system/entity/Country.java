package com.winit.vms.system.entity;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.winit.vms.base.entity.AbstractModel;

/**
 * 对象功能:vms_gl_country entity对象
 * 开发公司:WINIT
 * 开发人员:longsheng.wang
 * 创建时间:2015-01-03 14:58:07
 */
public class Country extends AbstractModel<Long> implements Cloneable{
	protected Long  id; /*id_*/
	protected String  name; /*name_*/
	protected String  iosCode2Char; /*ios_code_2_char_*/
	protected String  iosCode3Char; /*ios_code_3_char_*/
	protected String  iosCode3Digit; /*ios_code_3_digit_*/
	
		 
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
	
		 
	public void setIosCode2Char(String iosCode2Char) 
	{
		this.iosCode2Char = iosCode2Char;
	}
	/**
	 * 返回 ios_code_2_char_
	 * @return
	 */
	public String getIosCode2Char() 
	{
		return this.iosCode2Char;
	}
	
		 
	public void setIosCode3Char(String iosCode3Char) 
	{
		this.iosCode3Char = iosCode3Char;
	}
	/**
	 * 返回 ios_code_3_char_
	 * @return
	 */
	public String getIosCode3Char() 
	{
		return this.iosCode3Char;
	}
	
		 
	public void setIosCode3Digit(String iosCode3Digit) 
	{
		this.iosCode3Digit = iosCode3Digit;
	}
	/**
	 * 返回 ios_code_3_digit_
	 * @return
	 */
	public String getIosCode3Digit() 
	{
		return this.iosCode3Digit;
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
		.append("iosCode2Char", this.iosCode2Char) 
		.append("iosCode3Char", this.iosCode3Char) 
		.append("iosCode3Digit", this.iosCode3Digit) 
		.append("created", this.created) 
		.append("createdBy", this.createdBy) 
		.append("isActive", this.isActive) 
		.append("updated", this.updated) 
		.append("updatedBy", this.updatedBy) 
		.append("orgId", this.orgId) 
		.toString();
	}
}