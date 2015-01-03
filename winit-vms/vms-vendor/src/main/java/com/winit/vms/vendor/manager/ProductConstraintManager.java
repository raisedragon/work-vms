package com.winit.vms.vendor.manager;

import java.util.List;
import com.winit.vms.base.api.query.Page;
import java.io.Serializable;
import com.winit.vms.base.manager.api.Manager;
import com.winit.vms.vendor.entity.ProductConstraint;
import com.winit.vms.vendor.query.ProductConstraintQuery;

public interface ProductConstraintManager  extends Manager<Long,  ProductConstraint>{
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
}

