package com.winit.vms.vendor.dao.impl;

import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;
import com.winit.common.orm.mybatis.MyBatisRepo;

import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.impl.MyBatisDaoImpl;
import java.util.List;
import com.winit.vms.vendor.dao.ProductConstraintDao;
import com.winit.vms.vendor.entity.ProductConstraint;
import com.winit.vms.vendor.query.ProductConstraintQuery;


@MyBatisRepo
public class ProductConstraintDaoImpl extends MyBatisDaoImpl<Long,ProductConstraint> implements ProductConstraintDao{

    @Override
    public String getNamespace() {
        return ProductConstraint.class.getName();
    }
     
    @Override
	public List<ProductConstraint> queryByCriteria(ProductConstraintQuery.FindQuery query) {
		return this.getByKey("queryByCriteria", query);
	}
	
	
	@Override
	public List<ProductConstraint> queryByCriteria(ProductConstraintQuery.FindQuery query, Page page) {
		return this.getByKey("queryByCriteria", query, page);
	}

	@Override
	public long queryCountByCriteria(ProductConstraintQuery.FindQuery query) {
		return (Long) this.getOne("queryCountByCriteria", query);
	}
	
	@Override
	public void updateByUpdateQuery(ProductConstraintQuery.UpdateQuery uQuery){
		this.updateByKey("updateByUpdateQuery",uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(ProductConstraintQuery.DeleteQuery dQuery) {
		this.deleteByKey("deleteByDeleteQuery",dQuery);
	}
	/**
	 * 根据外键获取子表明细列表
	 * @param productId
	 * @return
	 */
	public List<ProductConstraint> getByMainId(Long productId) {
		Map<String,Object>params=new HashMap<String, Object>();
		params.put("productId", productId);
		return (List<ProductConstraint>) this.getByKey("getProductConstraintList", params);
	}
	
	/**
	 * 根据外键删除子表记录
	 * @param productId
	 * @return
	 */
	public void delByMainId(Long productId) {
		Map<String,Object>params=new HashMap<String, Object>();
		params.put("productId", productId);
		this.deleteByKey("delByMainId", params);
	}
	
	
}

