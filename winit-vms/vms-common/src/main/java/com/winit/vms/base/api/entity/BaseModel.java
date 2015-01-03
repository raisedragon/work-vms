package com.winit.vms.base.api.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 实体基础接口
 *
 */
public interface BaseModel extends Serializable {
	


	public Long getCreatedBy() ;

	public void setCreatedBy(Long createdBy) ;
	public Long getUpdatedBy() ;

	public void setUpdatedBy(Long updatedBy) ;

	public Date getCreated() ;

	public void setCreated(Date created) ;

	public Date getUpdated() ;

	public void setUpdated(Date updated);

	public Long getOrgId();

	public void setOrgId(Long rgId) ;

	public boolean isActive() ;
	public void setActive(boolean isActive);

	
}
