package com.winit.vms.vendor.manager;

import java.util.List;
import com.winit.vms.base.api.query.Page;
import java.io.Serializable;
import com.winit.vms.base.manager.api.Manager;
import com.winit.vms.vendor.entity.Product;
import com.winit.vms.vendor.query.ProductQuery;

public interface ProductManager  extends Manager<Long,  Product>{
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public List<Product> queryByCriteria(ProductQuery.FindQuery query);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @param page
	 * @return
	 */
	public List<Product> queryByCriteria(ProductQuery.FindQuery query, Page page);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public long queryCountByCriteria(ProductQuery.FindQuery query);
	
	/**
	 * 根据查询对象更新
	 * @param query
	 * @return
	 */
	public void updateByUpdateQuery(ProductQuery.UpdateQuery uQuery);

	/**
	 * 根据查询对象删除
	 * @param query
	 * @return
	 */
	public void deleteByDeleteQuery(ProductQuery.DeleteQuery dQuery);
}

