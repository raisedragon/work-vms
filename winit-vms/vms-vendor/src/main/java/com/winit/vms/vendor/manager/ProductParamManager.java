package com.winit.vms.vendor.manager;

import java.util.List;
import com.winit.vms.base.api.query.Page;
import java.io.Serializable;
import com.winit.vms.base.manager.api.Manager;
import com.winit.vms.vendor.entity.ProductParam;
import com.winit.vms.vendor.query.ProductParamQuery;

public interface ProductParamManager  extends Manager<Long,  ProductParam>{
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public List<ProductParam> queryByCriteria(ProductParamQuery.FindQuery query);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @param page
	 * @return
	 */
	public List<ProductParam> queryByCriteria(ProductParamQuery.FindQuery query, Page page);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public long queryCountByCriteria(ProductParamQuery.FindQuery query);
	
	/**
	 * 根据查询对象更新
	 * @param query
	 * @return
	 */
	public void updateByUpdateQuery(ProductParamQuery.UpdateQuery uQuery);

	/**
	 * 根据查询对象删除
	 * @param query
	 * @return
	 */
	public void deleteByDeleteQuery(ProductParamQuery.DeleteQuery dQuery);
}

