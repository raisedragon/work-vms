package com.winit.vms.vendor.manager;

import java.util.List;
import com.winit.vms.base.api.query.Page;
import java.io.Serializable;
import com.winit.vms.base.manager.api.Manager;
import com.winit.vms.vendor.entity.TrackMapping;
import com.winit.vms.vendor.query.TrackMappingQuery;

public interface TrackMappingManager  extends Manager<Long,  TrackMapping>{
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public List<TrackMapping> queryByCriteria(TrackMappingQuery.FindQuery query);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @param page
	 * @return
	 */
	public List<TrackMapping> queryByCriteria(TrackMappingQuery.FindQuery query, Page page);
	
	/**
	 * 根据查询对象查询
	 * @param query
	 * @return
	 */
	public long queryCountByCriteria(TrackMappingQuery.FindQuery query);
	
	/**
	 * 根据查询对象更新
	 * @param query
	 * @return
	 */
	public void updateByUpdateQuery(TrackMappingQuery.UpdateQuery uQuery);

	/**
	 * 根据查询对象删除
	 * @param query
	 * @return
	 */
	public void deleteByDeleteQuery(TrackMappingQuery.DeleteQuery dQuery);
}

