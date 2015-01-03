package com.winit.vms.system.manager.impl;

import java.io.Serializable;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import java.util.List;
import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.api.Dao;
import com.winit.vms.base.manager.impl.AbstractManagerImpl;
import com.winit.vms.system.dao.WarhouseDao;
import com.winit.vms.system.entity.Warhouse;
import com.winit.vms.system.manager.WarhouseManager;
import com.winit.vms.system.query.WarhouseQuery;

@Service("warhouseManager")
public class WarhouseManagerImpl extends AbstractManagerImpl<Long, Warhouse> implements WarhouseManager{
	@Resource
	WarhouseDao warhouseDao;
	@Override
	protected Dao<Long, Warhouse> getDao() {
		return warhouseDao;
	}
	
	 @Override
	public List<Warhouse> queryByCriteria(WarhouseQuery.FindQuery query) {
		return warhouseDao.queryByCriteria(query);
	}
	
	
	@Override
	public List<Warhouse> queryByCriteria(WarhouseQuery.FindQuery query, Page page) {
		return warhouseDao.queryByCriteria(query,page);
	}

	@Override
	public long queryCountByCriteria(WarhouseQuery.FindQuery query) {
		return warhouseDao.queryCountByCriteria(query);
	}
	
	@Override
	public void updateByUpdateQuery(WarhouseQuery.UpdateQuery uQuery){
		warhouseDao.updateByUpdateQuery(uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(WarhouseQuery.DeleteQuery dQuery) {
		warhouseDao.deleteByDeleteQuery(dQuery);
	}
	
}
