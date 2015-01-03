package com.winit.vms.vendor.dao.impl;

import java.io.Serializable;
import com.winit.common.orm.mybatis.MyBatisRepo;

import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.impl.MyBatisDaoImpl;
import java.util.List;
import com.winit.vms.vendor.dao.VendorDao;
import com.winit.vms.vendor.entity.Vendor;
import com.winit.vms.vendor.query.VendorQuery;


@MyBatisRepo
public class VendorDaoImpl extends MyBatisDaoImpl<Long,Vendor> implements VendorDao{

    @Override
    public String getNamespace() {
        return Vendor.class.getName();
    }
     
    @Override
	public List<Vendor> queryByCriteria(VendorQuery.FindQuery query) {
		return this.getByKey("queryByCriteria", query);
	}
	
	
	@Override
	public List<Vendor> queryByCriteria(VendorQuery.FindQuery query, Page page) {
		return this.getByKey("queryByCriteria", query, page);
	}

	@Override
	public long queryCountByCriteria(VendorQuery.FindQuery query) {
		return (Long) this.getOne("queryCountByCriteria", query);
	}
	
	@Override
	public void updateByUpdateQuery(VendorQuery.UpdateQuery uQuery){
		this.updateByKey("updateByUpdateQuery",uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(VendorQuery.DeleteQuery dQuery) {
		this.deleteByKey("deleteByDeleteQuery",dQuery);
	}
	
}

