package com.winit.vms.vendor.dao;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.winit.vms.base.api.query.Page;
import java.io.Serializable;
import com.winit.vms.base.db.api.Dao;
import com.winit.vms.vendor.entity.ProductConstraint;
import com.winit.vms.vendor.query.ProductConstraintQuery;


public interface ProductConstraintDao extends Dao<Long, ProductConstraint> {
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public List<ProductConstraint> queryByCriteria(ProductConstraintQuery.FindQuery query);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @param page
	 * @return
	 */
	public List<ProductConstraint> queryByCriteria(ProductConstraintQuery.FindQuery query, Page page);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public long queryCountByCriteria(ProductConstraintQuery.FindQuery query);
	
	/**
	 * 根据查询对象更新
	 * @param query
	 * @return
	 */
	public void updateByUpdateQuery(ProductConstraintQuery.UpdateQuery uQuery);

	/**
	 * 根据查询对象删除
	 * @param query
	 * @return
	 */
	public void deleteByDeleteQuery(ProductConstraintQuery.DeleteQuery dQuery);

	/**
	 * 根据外键获取子表明细列表
	 * @param productId
	 * @return
	 */
	public List<ProductConstraint> getByMainId(Long productId);
	
	/**
	 * 根据外键删除子表记录
	 * @param productId
	 * @return
	 */
	public void delByMainId(Long productId);
	
}


