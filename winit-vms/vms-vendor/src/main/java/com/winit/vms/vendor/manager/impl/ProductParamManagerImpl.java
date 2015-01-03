package com.winit.vms.vendor.manager.impl;

import java.io.Serializable;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import java.util.List;
import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.api.Dao;
import com.winit.vms.base.manager.impl.AbstractManagerImpl;
import com.winit.vms.vendor.dao.ProductParamDao;
import com.winit.vms.vendor.entity.ProductParam;
import com.winit.vms.vendor.manager.ProductParamManager;
import com.winit.vms.vendor.query.ProductParamQuery;

@Service("productParamManager")
public class ProductParamManagerImpl extends AbstractManagerImpl<Long, ProductParam> implements ProductParamManager{
	@Resource
	ProductParamDao productParamDao;
	@Override
	protected Dao<Long, ProductParam> getDao() {
		return productParamDao;
	}
	
	 @Override
	public List<ProductParam> queryByCriteria(ProductParamQuery.FindQuery query) {
		return productParamDao.queryByCriteria(query);
	}
	
	
	@Override
	public List<ProductParam> queryByCriteria(ProductParamQuery.FindQuery query, Page page) {
		return productParamDao.queryByCriteria(query,page);
	}

	@Override
	public long queryCountByCriteria(ProductParamQuery.FindQuery query) {
		return productParamDao.queryCountByCriteria(query);
	}
	
	@Override
	public void updateByUpdateQuery(ProductParamQuery.UpdateQuery uQuery){
		productParamDao.updateByUpdateQuery(uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(ProductParamQuery.DeleteQuery dQuery) {
		productParamDao.deleteByDeleteQuery(dQuery);
	}
	
}
