package com.winit.vms.vendor.manager.impl;

import java.io.Serializable;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.winit.vms.vendor.dao.ProductParamDao;
import com.winit.vms.vendor.entity.ProductParam;
import com.winit.vms.vendor.dao.ProductConstraintDao;
import com.winit.vms.vendor.entity.ProductConstraint;
import com.winit.vms.vendor.dao.TrackMappingDao;
import com.winit.vms.vendor.entity.TrackMapping;
import java.util.List;
import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.api.Dao;
import com.winit.vms.base.manager.impl.AbstractManagerImpl;
import com.winit.vms.vendor.dao.ProductDao;
import com.winit.vms.vendor.entity.Product;
import com.winit.vms.vendor.manager.ProductManager;
import com.winit.vms.vendor.query.ProductQuery;

@Service("productManager")
public class ProductManagerImpl extends AbstractManagerImpl<Long, Product> implements ProductManager{
	@Resource
	ProductDao productDao;
	@Resource
	ProductParamDao productParamDao;
	@Resource
	ProductConstraintDao productConstraintDao;
	@Resource
	TrackMappingDao trackMappingDao;
	@Override
	protected Dao<Long, Product> getDao() {
		return productDao;
	}
	
	 @Override
	public List<Product> queryByCriteria(ProductQuery.FindQuery query) {
		return productDao.queryByCriteria(query);
	}
	
	
	@Override
	public List<Product> queryByCriteria(ProductQuery.FindQuery query, Page page) {
		return productDao.queryByCriteria(query,page);
	}

	@Override
	public long queryCountByCriteria(ProductQuery.FindQuery query) {
		return productDao.queryCountByCriteria(query);
	}
	
	@Override
	public void updateByUpdateQuery(ProductQuery.UpdateQuery uQuery){
		productDao.updateByUpdateQuery(uQuery);
	}

	
	@Override
	public void deleteByDeleteQuery(ProductQuery.DeleteQuery dQuery) {
		productDao.deleteByDeleteQuery(dQuery);
	}
	
	/**
	 * 创建实体包含子表实体
	 */
	public void create(Product product){
    	super.create(product);
    	productParamDao.delByMainId(product.getId());
    	List<ProductParam> productParamList=product.getProductParamList();
    	for(ProductParam productParam:productParamList){
    		productParamDao.create(productParam);
    	}
    	productConstraintDao.delByMainId(product.getId());
    	List<ProductConstraint> productConstraintList=product.getProductConstraintList();
    	for(ProductConstraint productConstraint:productConstraintList){
    		productConstraintDao.create(productConstraint);
    	}
    	trackMappingDao.delByMainId(product.getId());
    	List<TrackMapping> trackMappingList=product.getTrackMappingList();
    	for(TrackMapping trackMapping:trackMappingList){
    		trackMappingDao.create(trackMapping);
    	}
    }
	
	/**
	 * 删除记录包含子表记录
	 */
	public void remove(Long entityId){
		super.remove(entityId);
    	productParamDao.delByMainId(entityId);
    	productConstraintDao.delByMainId(entityId);
    	trackMappingDao.delByMainId(entityId);
		
	}
	
	/**
	 * 批量删除包含子表记录
	 */
	public void removeByIds(Long[] entityIds){
		for(Long id:entityIds){
			this.remove(id);
		}
	}
    
	/**
	 * 获取实体
	 */
    public Product get(Long entityId){
    	Product product=super.get(entityId);
    	List<ProductParam> productParamList=productParamDao.getByMainId(entityId);
    	product.setProductParamList(productParamList);
    	List<ProductConstraint> productConstraintList=productConstraintDao.getByMainId(entityId);
    	product.setProductConstraintList(productConstraintList);
    	List<TrackMapping> trackMappingList=trackMappingDao.getByMainId(entityId);
    	product.setTrackMappingList(trackMappingList);
    	return product;
    }
    
    /**
     * 更新实体同时更新子表记录
     */
    public void update(Product product){
    	super.update(product);
    	productParamDao.delByMainId(product.getId());
    	List<ProductParam> productParamList=product.getProductParamList();
    	for(ProductParam productParam:productParamList){
    		productParamDao.create(productParam);
    	}
    	productConstraintDao.delByMainId(product.getId());
    	List<ProductConstraint> productConstraintList=product.getProductConstraintList();
    	for(ProductConstraint productConstraint:productConstraintList){
    		productConstraintDao.create(productConstraint);
    	}
    	trackMappingDao.delByMainId(product.getId());
    	List<TrackMapping> trackMappingList=product.getTrackMappingList();
    	for(TrackMapping trackMapping:trackMappingList){
    		trackMappingDao.create(trackMapping);
    	}
    }
	
}
