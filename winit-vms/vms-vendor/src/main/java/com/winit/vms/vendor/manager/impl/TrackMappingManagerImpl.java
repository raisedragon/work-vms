package com.winit.vms.vendor.manager.impl;

import java.io.Serializable;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import java.util.List;
import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.api.Dao;
import com.winit.vms.base.manager.impl.AbstractManagerImpl;
import com.winit.vms.vendor.dao.TrackMappingDao;
import com.winit.vms.vendor.entity.TrackMapping;
import com.winit.vms.vendor.manager.TrackMappingManager;
import com.winit.vms.vendor.query.TrackMappingQuery;

@Service("trackMappingManager")
public class TrackMappingManagerImpl extends AbstractManagerImpl<Long, TrackMapping> implements TrackMappingManager{
	@Resource
	TrackMappingDao trackMappingDao;
	@Override
	protected Dao<Long, TrackMapping> getDao() {
		return trackMappingDao;
	}
	
	 @Override
	public List<TrackMapping> queryByCriteria(TrackMappingQuery.FindQuery query) {
		return trackMappingDao.queryByCriteria(query);
	}
	
	
	@Override
	public List<TrackMapping> queryByCriteria(TrackMappingQuery.FindQuery query, Page page) {
		return trackMappingDao.queryByCriteria(query,page);
	}

	@Override
	public long queryCountByCriteria(TrackMappingQuery.FindQuery query) {
		return trackMappingDao.queryCountByCriteria(query);
	}
	
	@Override
	public void updateByUpdateQuery(TrackMappingQuery.UpdateQuery uQuery){
		trackMappingDao.updateByUpdateQuery(uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(TrackMappingQuery.DeleteQuery dQuery) {
		trackMappingDao.deleteByDeleteQuery(dQuery);
	}
	
}
