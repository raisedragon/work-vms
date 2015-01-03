package com.winit.vms.system.dao.impl;

import java.io.Serializable;
import com.winit.common.orm.mybatis.MyBatisRepo;

import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.impl.MyBatisDaoImpl;
import java.util.List;
import com.winit.vms.system.dao.CountryDao;
import com.winit.vms.system.entity.Country;
import com.winit.vms.system.query.CountryQuery;


@MyBatisRepo
public class CountryDaoImpl extends MyBatisDaoImpl<Long,Country> implements CountryDao{

    @Override
    public String getNamespace() {
        return Country.class.getName();
    }
     
    @Override
	public List<Country> queryByCriteria(CountryQuery.FindQuery query) {
		return this.getByKey("queryByCriteria", query);
	}
	
	
	@Override
	public List<Country> queryByCriteria(CountryQuery.FindQuery query, Page page) {
		return this.getByKey("queryByCriteria", query, page);
	}

	@Override
	public long queryCountByCriteria(CountryQuery.FindQuery query) {
		return (Long) this.getOne("queryCountByCriteria", query);
	}
	
	@Override
	public void updateByUpdateQuery(CountryQuery.UpdateQuery uQuery){
		this.updateByKey("updateByUpdateQuery",uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(CountryQuery.DeleteQuery dQuery) {
		this.deleteByKey("deleteByDeleteQuery",dQuery);
	}
	
}

