package com.winit.vms.system.manager;

import java.util.List;
import com.winit.vms.base.api.query.Page;
import java.io.Serializable;
import com.winit.vms.base.manager.api.Manager;
import com.winit.vms.system.entity.Warhouse;
import com.winit.vms.system.query.WarhouseQuery;

public interface WarhouseManager  extends Manager<Long,  Warhouse>{
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public List<Warhouse> queryByCriteria(WarhouseQuery.FindQuery query);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @param page
	 * @return
	 */
	public List<Warhouse> queryByCriteria(WarhouseQuery.FindQuery query, Page page);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public long queryCountByCriteria(WarhouseQuery.FindQuery query);
	
	/**
	 * 根据查询对象更新
	 * @param query
	 * @return
	 */
	public void updateByUpdateQuery(WarhouseQuery.UpdateQuery uQuery);

	/**
	 * 根据查询对象删除
	 * @param query
	 * @return
	 */
	public void deleteByDeleteQuery(WarhouseQuery.DeleteQuery dQuery);
}

