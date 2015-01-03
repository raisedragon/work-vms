package com.winit.vms.vendor.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import static org.junit.Assert.*;
import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.mybatis.domain.DefaultPage;
import org.springframework.test.annotation.Rollback;

import com.winit.vms.vendor.dao.ProductParamDao;
import com.winit.vms.vendor.entity.ProductParam;
import com.winit.vms.test.BaseTest;

public class ProductParamDaoTest extends BaseTest{
	@Resource
	private ProductParamDao productParamDao;
	
	@Test
	@Rollback(true)
	public void testCrud(){
		ProductParam productParam=new ProductParam();
		Integer randId=new Double(100000*Math.random()).intValue();
		productParam.setId(idGenerator.getUId());
		productParam.setName("productParam" + randId);
		productParam.setValue("productParam" + randId);
		productParam.setProductId(Long.parseLong(randId+""));
		productParam.setCreated(new Date());
		productParam.setCreatedBy(Long.parseLong(randId+""));
		productParam.setActive(true);
		productParam.setUpdated(new Date());
		productParam.setUpdatedBy(Long.parseLong(randId+""));
		productParam.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productParamDao.create(productParam);
        Assert.assertNotNull(productParam.getId());
        logger.debug("productParam1:"+ productParam.getId());
		//获取一实体
		ProductParam productParam2=(ProductParam)productParamDao.get(productParam.getId());
		Assert.assertNotNull(productParam2);
		logger.debug("productParam2:" + productParam2.toString());
		Integer randId2=new Double(100000*Math.random()).intValue();
		productParam2.setName("productParam" + randId2);
		productParam2.setValue("productParam" + randId2);
		productParam2.setProductId(Long.parseLong(randId2+""));
		productParam2.setCreated(new Date());
		productParam2.setCreatedBy(Long.parseLong(randId2+""));
		productParam.setActive(true);
		productParam2.setUpdated(new Date());
		productParam2.setUpdatedBy(Long.parseLong(randId2+""));
		productParam2.setOrgId(Long.parseLong(randId2+""));
		//更新一实体
		productParamDao.update(productParam2);
		
		ProductParam productParam3=productParamDao.get(productParam.getId());
		System.out.println("productParam3:"+productParam3.toString());
		//删除一实体
		//productParamDao.remove(productParam.getId());
	}
	
	
	@Test
	public void testCreate() {
		ProductParam productParam=new ProductParam();
		Integer randId=new Double(100000*Math.random()).intValue();
		productParam.setId(idGenerator.getUId());
		productParam.setName("productParam" + randId);
		productParam.setValue("productParam" + randId);
		productParam.setProductId(Long.parseLong(randId+""));
		productParam.setCreated(new Date());
		productParam.setCreatedBy(Long.parseLong(randId+""));
		productParam.setActive(true);
		productParam.setUpdated(new Date());
		productParam.setUpdatedBy(Long.parseLong(randId+""));
		productParam.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productParamDao.create(productParam);
		
		ProductParam productParam1 = productParamDao.get(productParam.getId());
		
		assertEquals(productParam.getOrgId(), productParam1.getOrgId());
        
	}

	@Test
	public void testUpdate() {
		ProductParam productParam=new ProductParam();
		Integer randId=new Double(100000*Math.random()).intValue();
		productParam.setId(idGenerator.getUId());
		productParam.setName("productParam" + randId);
		productParam.setValue("productParam" + randId);
		productParam.setProductId(Long.parseLong(randId+""));
		productParam.setCreated(new Date());
		productParam.setCreatedBy(Long.parseLong(randId+""));
		productParam.setActive(true);
		productParam.setUpdated(new Date());
		productParam.setUpdatedBy(Long.parseLong(randId+""));
		productParam.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productParamDao.create(productParam);
		
		Integer randId2=new Double(100000*Math.random()).intValue();
		productParam.setName("productParam" + randId2);
		productParam.setValue("productParam" + randId2);
		productParam.setProductId(Long.parseLong(randId2+""));
		productParam.setCreated(new Date());
		productParam.setCreatedBy(Long.parseLong(randId2+""));
		productParam.setActive(true);
		productParam.setUpdated(new Date());
		productParam.setUpdatedBy(Long.parseLong(randId2+""));
		productParam.setOrgId(Long.parseLong(randId2+""));
		
		//创建一实体
		productParamDao.update(productParam);
		
		ProductParam productParam2 = productParamDao.get(productParam.getId());
		
		assertEquals(productParam.getOrgId(),productParam2.getOrgId());
	}

	@Test
	public void testRemove() {
		ProductParam productParam=new ProductParam();
		Integer randId=new Double(100000*Math.random()).intValue();
		productParam.setId(idGenerator.getUId());
		productParam.setName("productParam" + randId);
		productParam.setValue("productParam" + randId);
		productParam.setProductId(Long.parseLong(randId+""));
		productParam.setCreated(new Date());
		productParam.setCreatedBy(Long.parseLong(randId+""));
		productParam.setActive(true);
		productParam.setUpdated(new Date());
		productParam.setUpdatedBy(Long.parseLong(randId+""));
		productParam.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productParamDao.create(productParam);
		
		productParamDao.remove(productParam.getId());
		
		ProductParam  productParam2 = productParamDao.get(productParam.getId());
		
		assertNull(productParam2);
	}

	@Test
	public void testGet() {
		ProductParam productParam=new ProductParam();
		Integer randId=new Double(100000*Math.random()).intValue();
		productParam.setId(idGenerator.getUId());
		productParam.setName("productParam" + randId);
		productParam.setValue("productParam" + randId);
		productParam.setProductId(Long.parseLong(randId+""));
		productParam.setCreated(new Date());
		productParam.setCreatedBy(Long.parseLong(randId+""));
		productParam.setActive(true);
		productParam.setUpdated(new Date());
		productParam.setUpdatedBy(Long.parseLong(randId+""));
		productParam.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productParamDao.create(productParam);
		
		ProductParam productParam2 = productParamDao.get(productParam.getId());
		
		

		assertEquals(productParam.getCreatedBy(),productParam2.getCreatedBy());
	}

	@Test
	public void testRemoveByIds() {
		Long[] ids = new Long[2];
		{
		ProductParam productParam=new ProductParam();
		Integer randId=new Double(100000*Math.random()).intValue();
		productParam.setId(idGenerator.getUId());
		productParam.setName("productParam" + randId);
		productParam.setValue("productParam" + randId);
		productParam.setProductId(Long.parseLong(randId+""));
		productParam.setCreated(new Date());
		productParam.setCreatedBy(Long.parseLong(randId+""));
		productParam.setActive(true);
		productParam.setUpdated(new Date());
		productParam.setUpdatedBy(Long.parseLong(randId+""));
		productParam.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productParamDao.create(productParam);
		ids[0]=productParam.getId();
		}
		
		{
		
		ProductParam productParam=new ProductParam();
		Integer randId=new Double(100000*Math.random()).intValue();
		productParam.setId(idGenerator.getUId());
		productParam.setName("productParam" + randId);
		productParam.setValue("productParam" + randId);
		productParam.setProductId(Long.parseLong(randId+""));
		productParam.setCreated(new Date());
		productParam.setCreatedBy(Long.parseLong(randId+""));
		productParam.setActive(true);
		productParam.setUpdated(new Date());
		productParam.setUpdatedBy(Long.parseLong(randId+""));
		productParam.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productParamDao.create(productParam);
		ids[1]=productParam.getId();
		}
		
		
		{
			ProductParam productParam = productParamDao.get(ids[0]);
			assertNotNull(productParam);
		}
		
		{
			ProductParam productParam = productParamDao.get(ids[1]);
			assertNotNull(productParam);
		}
		
		productParamDao.removeByIds(ids);
		
		{
			ProductParam productParam = productParamDao.get(ids[0]);
			assertNull(productParam);
		}
		
		{
			ProductParam productParam = productParamDao.get(ids[1]);
			assertNull(productParam);
		}
	}

	@Test
	public void testGetAll() {
		List<ProductParam> entities = productParamDao.getAll();
		
		
		ProductParam productParam=new ProductParam();
		Integer randId=new Double(100000*Math.random()).intValue();
		productParam.setId(idGenerator.getUId());
		productParam.setName("productParam" + randId);
		productParam.setValue("productParam" + randId);
		productParam.setProductId(Long.parseLong(randId+""));
		productParam.setCreated(new Date());
		productParam.setCreatedBy(Long.parseLong(randId+""));
		productParam.setActive(true);
		productParam.setUpdated(new Date());
		productParam.setUpdatedBy(Long.parseLong(randId+""));
		productParam.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productParamDao.create(productParam);
		
		List<ProductParam> entities2 = productParamDao.getAll();
		
		assertEquals(entities2.size(), entities.size()+1);
	}

	@Test
	public void testGetAllByPage() {
		for(int i=0;i<10;i++){
			ProductParam productParam=new ProductParam();
		Integer randId=new Double(100000*Math.random()).intValue();
		productParam.setId(idGenerator.getUId());
		productParam.setName("productParam" + randId);
		productParam.setValue("productParam" + randId);
		productParam.setProductId(Long.parseLong(randId+""));
		productParam.setCreated(new Date());
		productParam.setCreatedBy(Long.parseLong(randId+""));
		productParam.setActive(true);
		productParam.setUpdated(new Date());
		productParam.setUpdatedBy(Long.parseLong(randId+""));
		productParam.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productParamDao.create(productParam);
		}
		Page page = new DefaultPage(1, 5);
		List<ProductParam> entities1 = productParamDao.getAllByPage(page);
		assertEquals(entities1.size(), 5);
		Page page2 = new DefaultPage(2, 5);
		List<ProductParam> entities2 = productParamDao.getAllByPage(page2);
		assertEquals(entities2.size(), 5);
	}
	
}
