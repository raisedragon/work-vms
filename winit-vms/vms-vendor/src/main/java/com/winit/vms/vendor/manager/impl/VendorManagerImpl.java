package com.winit.vms.vendor.manager.impl;

import java.io.Serializable;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import java.util.List;
import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.api.Dao;
import com.winit.vms.base.manager.impl.AbstractManagerImpl;
import com.winit.vms.vendor.dao.VendorDao;
import com.winit.vms.vendor.entity.Vendor;
import com.winit.vms.vendor.manager.VendorManager;
import com.winit.vms.vendor.query.VendorQuery;

@Service("vendorManager")
public class VendorManagerImpl extends AbstractManagerImpl<Long, Vendor> implements VendorManager{
	@Resource
	VendorDao vendorDao;
	@Override
	protected Dao<Long, Vendor> getDao() {
		return vendorDao;
	}
	
	 @Override
	public List<Vendor> queryByCriteria(VendorQuery.FindQuery query) {
		return vendorDao.queryByCriteria(query);
	}
	
	
	@Override
	public List<Vendor> queryByCriteria(VendorQuery.FindQuery query, Page page) {
		return vendorDao.queryByCriteria(query,page);
	}

	@Override
	public long queryCountByCriteria(VendorQuery.FindQuery query) {
		return vendorDao.queryCountByCriteria(query);
	}
	
	@Override
	public void updateByUpdateQuery(VendorQuery.UpdateQuery uQuery){
		vendorDao.updateByUpdateQuery(uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(VendorQuery.DeleteQuery dQuery) {
		vendorDao.deleteByDeleteQuery(dQuery);
	}
	
}
