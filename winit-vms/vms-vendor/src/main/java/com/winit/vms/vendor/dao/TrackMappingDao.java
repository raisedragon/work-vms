package com.winit.vms.vendor.dao;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.winit.vms.base.api.query.Page;
import java.io.Serializable;
import com.winit.vms.base.db.api.Dao;
import com.winit.vms.vendor.entity.TrackMapping;
import com.winit.vms.vendor.query.TrackMappingQuery;


public interface TrackMappingDao extends Dao<Long, TrackMapping> {
	
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

	/**
	 * 根据外键获取子表明细列表
	 * @param productId
	 * @return
	 */
	public List<TrackMapping> getByMainId(Long productId);
	
	/**
	 * 根据外键删除子表记录
	 * @param productId
	 * @return
	 */
	public void delByMainId(Long productId);
	
}


