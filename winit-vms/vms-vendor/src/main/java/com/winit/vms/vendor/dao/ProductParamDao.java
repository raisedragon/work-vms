package com.winit.vms.vendor.dao;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.winit.vms.base.api.query.Page;
import java.io.Serializable;
import com.winit.vms.base.db.api.Dao;
import com.winit.vms.vendor.entity.ProductParam;
import com.winit.vms.vendor.query.ProductParamQuery;


public interface ProductParamDao extends Dao<Long, ProductParam> {
	
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

	/**
	 * 根据外键获取子表明细列表
	 * @param productId
	 * @return
	 */
	public List<ProductParam> getByMainId(Long productId);
	
	/**
	 * 根据外键删除子表记录
	 * @param productId
	 * @return
	 */
	public void delByMainId(Long productId);
	
}


