package com.winit.vms.system.manager;

import java.util.List;
import com.winit.vms.base.api.query.Page;
import java.io.Serializable;
import com.winit.vms.base.manager.api.Manager;
import com.winit.vms.system.entity.Country;
import com.winit.vms.system.query.CountryQuery;

public interface CountryManager  extends Manager<Long,  Country>{
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public List<Country> queryByCriteria(CountryQuery.FindQuery query);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @param page
	 * @return
	 */
	public List<Country> queryByCriteria(CountryQuery.FindQuery query, Page page);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public long queryCountByCriteria(CountryQuery.FindQuery query);
	
	/**
	 * 根据查询对象更新
	 * @param query
	 * @return
	 */
	public void updateByUpdateQuery(CountryQuery.UpdateQuery uQuery);

	/**
	 * 根据查询对象删除
	 * @param query
	 * @return
	 */
	public void deleteByDeleteQuery(CountryQuery.DeleteQuery dQuery);
}

