package com.winit.vms.vendor.manager.impl;

import java.io.Serializable;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import java.util.List;
import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.api.Dao;
import com.winit.vms.base.manager.impl.AbstractManagerImpl;
import com.winit.vms.vendor.dao.ProductConstraintDao;
import com.winit.vms.vendor.entity.ProductConstraint;
import com.winit.vms.vendor.manager.ProductConstraintManager;
import com.winit.vms.vendor.query.ProductConstraintQuery;

@Service("productConstraintManager")
public class ProductConstraintManagerImpl extends AbstractManagerImpl<Long, ProductConstraint> implements ProductConstraintManager{
	@Resource
	ProductConstraintDao productConstraintDao;
	@Override
	protected Dao<Long, ProductConstraint> getDao() {
		return productConstraintDao;
	}
	
	 @Override
	public List<ProductConstraint> queryByCriteria(ProductConstraintQuery.FindQuery query) {
		return productConstraintDao.queryByCriteria(query);
	}
	
	
	@Override
	public List<ProductConstraint> queryByCriteria(ProductConstraintQuery.FindQuery query, Page page) {
		return productConstraintDao.queryByCriteria(query,page);
	}

	@Override
	public long queryCountByCriteria(ProductConstraintQuery.FindQuery query) {
		return productConstraintDao.queryCountByCriteria(query);
	}
	
	@Override
	public void updateByUpdateQuery(ProductConstraintQuery.UpdateQuery uQuery){
		productConstraintDao.updateByUpdateQuery(uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(ProductConstraintQuery.DeleteQuery dQuery) {
		productConstraintDao.deleteByDeleteQuery(dQuery);
	}
	
}
