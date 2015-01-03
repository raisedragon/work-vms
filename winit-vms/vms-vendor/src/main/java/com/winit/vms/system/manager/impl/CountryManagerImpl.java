package com.winit.vms.system.manager.impl;

import java.io.Serializable;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import java.util.List;
import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.api.Dao;
import com.winit.vms.base.manager.impl.AbstractManagerImpl;
import com.winit.vms.system.dao.CountryDao;
import com.winit.vms.system.entity.Country;
import com.winit.vms.system.manager.CountryManager;
import com.winit.vms.system.query.CountryQuery;

@Service("countryManager")
public class CountryManagerImpl extends AbstractManagerImpl<Long, Country> implements CountryManager{
	@Resource
	CountryDao countryDao;
	@Override
	protected Dao<Long, Country> getDao() {
		return countryDao;
	}
	
	 @Override
	public List<Country> queryByCriteria(CountryQuery.FindQuery query) {
		return countryDao.queryByCriteria(query);
	}
	
	
	@Override
	public List<Country> queryByCriteria(CountryQuery.FindQuery query, Page page) {
		return countryDao.queryByCriteria(query,page);
	}

	@Override
	public long queryCountByCriteria(CountryQuery.FindQuery query) {
		return countryDao.queryCountByCriteria(query);
	}
	
	@Override
	public void updateByUpdateQuery(CountryQuery.UpdateQuery uQuery){
		countryDao.updateByUpdateQuery(uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(CountryQuery.DeleteQuery dQuery) {
		countryDao.deleteByDeleteQuery(dQuery);
	}
	
}
