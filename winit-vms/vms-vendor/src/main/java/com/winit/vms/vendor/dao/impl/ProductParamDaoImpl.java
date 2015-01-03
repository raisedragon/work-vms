package com.winit.vms.vendor.dao.impl;

import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;
import com.winit.common.orm.mybatis.MyBatisRepo;

import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.impl.MyBatisDaoImpl;
import java.util.List;
import com.winit.vms.vendor.dao.ProductParamDao;
import com.winit.vms.vendor.entity.ProductParam;
import com.winit.vms.vendor.query.ProductParamQuery;


@MyBatisRepo
public class ProductParamDaoImpl extends MyBatisDaoImpl<Long,ProductParam> implements ProductParamDao{

    @Override
    public String getNamespace() {
        return ProductParam.class.getName();
    }
     
    @Override
	public List<ProductParam> queryByCriteria(ProductParamQuery.FindQuery query) {
		return this.getByKey("queryByCriteria", query);
	}
	
	
	@Override
	public List<ProductParam> queryByCriteria(ProductParamQuery.FindQuery query, Page page) {
		return this.getByKey("queryByCriteria", query, page);
	}

	@Override
	public long queryCountByCriteria(ProductParamQuery.FindQuery query) {
		return (Long) this.getOne("queryCountByCriteria", query);
	}
	
	@Override
	public void updateByUpdateQuery(ProductParamQuery.UpdateQuery uQuery){
		this.updateByKey("updateByUpdateQuery",uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(ProductParamQuery.DeleteQuery dQuery) {
		this.deleteByKey("deleteByDeleteQuery",dQuery);
	}
	/**
	 * 根据外键获取子表明细列表
	 * @param productId
	 * @return
	 */
	public List<ProductParam> getByMainId(Long productId) {
		Map<String,Object>params=new HashMap<String, Object>();
		params.put("productId", productId);
		return (List<ProductParam>) this.getByKey("getProductParamList", params);
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

