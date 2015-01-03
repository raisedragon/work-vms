package com.winit.vms.base.entity;

import java.util.Date;

import com.winit.vms.base.api.entity.BaseModel;


public abstract class AbstractModel<T> implements BaseModel {
	// 创建人
	protected Long createdBy;
	// 更新人
	protected Long updatedBy;
	// 创建时间
	protected Date created;
	// 更新时间
	protected Date updated;
	// 创建人组织ID
	protected Long orgId;
	
	protected boolean isActive;
	
	

	

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * 设置主键ID
	 * 
	 * @param id
	 */
	public abstract void setId(T id);

	/**
	 * 获取主键ID
	 * 
	 * @return
	 */
	public abstract T getId();

}
