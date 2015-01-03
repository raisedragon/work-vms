package com.winit.vms.vendor.manager;

import java.util.List;
import com.winit.vms.base.api.query.Page;
import java.io.Serializable;
import com.winit.vms.base.manager.api.Manager;
import com.winit.vms.vendor.entity.Vendor;
import com.winit.vms.vendor.query.VendorQuery;

public interface VendorManager  extends Manager<Long,  Vendor>{
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public List<Vendor> queryByCriteria(VendorQuery.FindQuery query);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @param page
	 * @return
	 */
	public List<Vendor> queryByCriteria(VendorQuery.FindQuery query, Page page);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public long queryCountByCriteria(VendorQuery.FindQuery query);
	
	/**
	 * 根据查询对象更新
	 * @param query
	 * @return
	 */
	public void updateByUpdateQuery(VendorQuery.UpdateQuery uQuery);

	/**
	 * 根据查询对象删除
	 * @param query
	 * @return
	 */
	public void deleteByDeleteQuery(VendorQuery.DeleteQuery dQuery);
}

