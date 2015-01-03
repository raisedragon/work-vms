package com.winit.vms.vendor.dao.impl;

import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;
import com.winit.common.orm.mybatis.MyBatisRepo;

import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.impl.MyBatisDaoImpl;
import java.util.List;
import com.winit.vms.vendor.dao.TrackMappingDao;
import com.winit.vms.vendor.entity.TrackMapping;
import com.winit.vms.vendor.query.TrackMappingQuery;


@MyBatisRepo
public class TrackMappingDaoImpl extends MyBatisDaoImpl<Long,TrackMapping> implements TrackMappingDao{

    @Override
    public String getNamespace() {
        return TrackMapping.class.getName();
    }
     
    @Override
	public List<TrackMapping> queryByCriteria(TrackMappingQuery.FindQuery query) {
		return this.getByKey("queryByCriteria", query);
	}
	
	
	@Override
	public List<TrackMapping> queryByCriteria(TrackMappingQuery.FindQuery query, Page page) {
		return this.getByKey("queryByCriteria", query, page);
	}

	@Override
	public long queryCountByCriteria(TrackMappingQuery.FindQuery query) {
		return (Long) this.getOne("queryCountByCriteria", query);
	}
	
	@Override
	public void updateByUpdateQuery(TrackMappingQuery.UpdateQuery uQuery){
		this.updateByKey("updateByUpdateQuery",uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(TrackMappingQuery.DeleteQuery dQuery) {
		this.deleteByKey("deleteByDeleteQuery",dQuery);
	}
	/**
	 * 根据外键获取子表明细列表
	 * @param productId
	 * @return
	 */
	public List<TrackMapping> getByMainId(Long productId) {
		Map<String,Object>params=new HashMap<String, Object>();
		params.put("productId", productId);
		return (List<TrackMapping>) this.getByKey("getTrackMappingList", params);
	}
	
	/**
	 * 根据外键删除子表记录
	 * @param productId
	 * @return
	 */
	public void delByMainId(Long productId) {
		Map<String,Object>params=new HashMap<String, Object>();
		params.put("productId", productId);
		this.deleteByKey("delByMainId", params);
	}
	
	
}

