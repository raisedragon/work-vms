package com.winit.vms.system.dao.impl;

import java.io.Serializable;
import com.winit.common.orm.mybatis.MyBatisRepo;

import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.impl.MyBatisDaoImpl;
import java.util.List;
import com.winit.vms.system.dao.WarhouseDao;
import com.winit.vms.system.entity.Warhouse;
import com.winit.vms.system.query.WarhouseQuery;


@MyBatisRepo
public class WarhouseDaoImpl extends MyBatisDaoImpl<Long,Warhouse> implements WarhouseDao{

    @Override
    public String getNamespace() {
        return Warhouse.class.getName();
    }
     
    @Override
	public List<Warhouse> queryByCriteria(WarhouseQuery.FindQuery query) {
		return this.getByKey("queryByCriteria", query);
	}
	
	
	@Override
	public List<Warhouse> queryByCriteria(WarhouseQuery.FindQuery query, Page page) {
		return this.getByKey("queryByCriteria", query, page);
	}

	@Override
	public long queryCountByCriteria(WarhouseQuery.FindQuery query) {
		return (Long) this.getOne("queryCountByCriteria", query);
	}
	
	@Override
	public void updateByUpdateQuery(WarhouseQuery.UpdateQuery uQuery){
		this.updateByKey("updateByUpdateQuery",uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(WarhouseQuery.DeleteQuery dQuery) {
		this.deleteByKey("deleteByDeleteQuery",dQuery);
	}
	
}

