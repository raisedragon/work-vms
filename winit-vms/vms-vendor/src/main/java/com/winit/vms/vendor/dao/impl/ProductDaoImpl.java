package com.winit.vms.vendor.dao.impl;

import java.io.Serializable;
import com.winit.common.orm.mybatis.MyBatisRepo;

import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.impl.MyBatisDaoImpl;
import java.util.List;
import com.winit.vms.vendor.dao.ProductDao;
import com.winit.vms.vendor.entity.Product;
import com.winit.vms.vendor.query.ProductQuery;


@MyBatisRepo
public class ProductDaoImpl extends MyBatisDaoImpl<Long,Product> implements ProductDao{

    @Override
    public String getNamespace() {
        return Product.class.getName();
    }
     
    @Override
	public List<Product> queryByCriteria(ProductQuery.FindQuery query) {
		return this.getByKey("queryByCriteria", query);
	}
	
	
	@Override
	public List<Product> queryByCriteria(ProductQuery.FindQuery query, Page page) {
		return this.getByKey("queryByCriteria", query, page);
	}

	@Override
	public long queryCountByCriteria(ProductQuery.FindQuery query) {
		return (Long) this.getOne("queryCountByCriteria", query);
	}
	
	@Override
	public void updateByUpdateQuery(ProductQuery.UpdateQuery uQuery){
		this.updateByKey("updateByUpdateQuery",uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(ProductQuery.DeleteQuery dQuery) {
		this.deleteByKey("deleteByDeleteQuery",dQuery);
	}
	
}

