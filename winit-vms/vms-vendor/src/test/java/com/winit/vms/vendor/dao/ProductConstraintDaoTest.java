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

import com.winit.vms.vendor.dao.ProductConstraintDao;
import com.winit.vms.vendor.entity.ProductConstraint;
import com.winit.vms.test.BaseTest;

public class ProductConstraintDaoTest extends BaseTest{
	@Resource
	private ProductConstraintDao productConstraintDao;
	
	@Test
	@Rollback(true)
	public void testCrud(){
		ProductConstraint productConstraint=new ProductConstraint();
		Integer randId=new Double(100000*Math.random()).intValue();
		productConstraint.setId(idGenerator.getUId());
		productConstraint.setName("productConstraint" + randId);
		productConstraint.setKey("productConstraint" + randId);
		productConstraint.setMinLength(randId);
		productConstraint.setMaxLength(randId);
		productConstraint.setProductId(Long.parseLong(randId+""));
		productConstraint.setCreated(new Date());
		productConstraint.setCreatedBy(Long.parseLong(randId+""));
		productConstraint.setActive(true);
		productConstraint.setUpdated(new Date());
		productConstraint.setUpdatedBy(Long.parseLong(randId+""));
		productConstraint.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productConstraintDao.create(productConstraint);
        Assert.assertNotNull(productConstraint.getId());
        logger.debug("productConstraint1:"+ productConstraint.getId());
		//获取一实体
		ProductConstraint productConstraint2=(ProductConstraint)productConstraintDao.get(productConstraint.getId());
		Assert.assertNotNull(productConstraint2);
		logger.debug("productConstraint2:" + productConstraint2.toString());
		Integer randId2=new Double(100000*Math.random()).intValue();
		productConstraint2.setName("productConstraint" + randId2);
		productConstraint2.setKey("productConstraint" + randId2);
		productConstraint2.setMinLength(randId2);
		productConstraint2.setMaxLength(randId2);
		productConstraint2.setProductId(Long.parseLong(randId2+""));
		productConstraint2.setCreated(new Date());
		productConstraint2.setCreatedBy(Long.parseLong(randId2+""));
		productConstraint.setActive(true);
		productConstraint2.setUpdated(new Date());
		productConstraint2.setUpdatedBy(Long.parseLong(randId2+""));
		productConstraint2.setOrgId(Long.parseLong(randId2+""));
		//更新一实体
		productConstraintDao.update(productConstraint2);
		
		ProductConstraint productConstraint3=productConstraintDao.get(productConstraint.getId());
		System.out.println("productConstraint3:"+productConstraint3.toString());
		//删除一实体
		//productConstraintDao.remove(productConstraint.getId());
	}
	
	
	@Test
	public void testCreate() {
		ProductConstraint productConstraint=new ProductConstraint();
		Integer randId=new Double(100000*Math.random()).intValue();
		productConstraint.setId(idGenerator.getUId());
		productConstraint.setName("productConstraint" + randId);
		productConstraint.setKey("productConstraint" + randId);
		productConstraint.setMinLength(randId);
		productConstraint.setMaxLength(randId);
		productConstraint.setProductId(Long.parseLong(randId+""));
		productConstraint.setCreated(new Date());
		productConstraint.setCreatedBy(Long.parseLong(randId+""));
		productConstraint.setActive(true);
		productConstraint.setUpdated(new Date());
		productConstraint.setUpdatedBy(Long.parseLong(randId+""));
		productConstraint.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productConstraintDao.create(productConstraint);
		
		ProductConstraint productConstraint1 = productConstraintDao.get(productConstraint.getId());
		
		assertEquals(productConstraint.getOrgId(), productConstraint1.getOrgId());
        
	}

	@Test
	public void testUpdate() {
		ProductConstraint productConstraint=new ProductConstraint();
		Integer randId=new Double(100000*Math.random()).intValue();
		productConstraint.setId(idGenerator.getUId());
		productConstraint.setName("productConstraint" + randId);
		productConstraint.setKey("productConstraint" + randId);
		productConstraint.setMinLength(randId);
		productConstraint.setMaxLength(randId);
		productConstraint.setProductId(Long.parseLong(randId+""));
		productConstraint.setCreated(new Date());
		productConstraint.setCreatedBy(Long.parseLong(randId+""));
		productConstraint.setActive(true);
		productConstraint.setUpdated(new Date());
		productConstraint.setUpdatedBy(Long.parseLong(randId+""));
		productConstraint.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productConstraintDao.create(productConstraint);
		
		Integer randId2=new Double(100000*Math.random()).intValue();
		productConstraint.setName("productConstraint" + randId2);
		productConstraint.setKey("productConstraint" + randId2);
		productConstraint.setMinLength(randId2);
		productConstraint.setMaxLength(randId2);
		productConstraint.setProductId(Long.parseLong(randId2+""));
		productConstraint.setCreated(new Date());
		productConstraint.setCreatedBy(Long.parseLong(randId2+""));
		productConstraint.setActive(true);
		productConstraint.setUpdated(new Date());
		productConstraint.setUpdatedBy(Long.parseLong(randId2+""));
		productConstraint.setOrgId(Long.parseLong(randId2+""));
		
		//创建一实体
		productConstraintDao.update(productConstraint);
		
		ProductConstraint productConstraint2 = productConstraintDao.get(productConstraint.getId());
		
		assertEquals(productConstraint.getOrgId(),productConstraint2.getOrgId());
	}

	@Test
	public void testRemove() {
		ProductConstraint productConstraint=new ProductConstraint();
		Integer randId=new Double(100000*Math.random()).intValue();
		productConstraint.setId(idGenerator.getUId());
		productConstraint.setName("productConstraint" + randId);
		productConstraint.setKey("productConstraint" + randId);
		productConstraint.setMinLength(randId);
		productConstraint.setMaxLength(randId);
		productConstraint.setProductId(Long.parseLong(randId+""));
		productConstraint.setCreated(new Date());
		productConstraint.setCreatedBy(Long.parseLong(randId+""));
		productConstraint.setActive(true);
		productConstraint.setUpdated(new Date());
		productConstraint.setUpdatedBy(Long.parseLong(randId+""));
		productConstraint.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productConstraintDao.create(productConstraint);
		
		productConstraintDao.remove(productConstraint.getId());
		
		ProductConstraint  productConstraint2 = productConstraintDao.get(productConstraint.getId());
		
		assertNull(productConstraint2);
	}

	@Test
	public void testGet() {
		ProductConstraint productConstraint=new ProductConstraint();
		Integer randId=new Double(100000*Math.random()).intValue();
		productConstraint.setId(idGenerator.getUId());
		productConstraint.setName("productConstraint" + randId);
		productConstraint.setKey("productConstraint" + randId);
		productConstraint.setMinLength(randId);
		productConstraint.setMaxLength(randId);
		productConstraint.setProductId(Long.parseLong(randId+""));
		productConstraint.setCreated(new Date());
		productConstraint.setCreatedBy(Long.parseLong(randId+""));
		productConstraint.setActive(true);
		productConstraint.setUpdated(new Date());
		productConstraint.setUpdatedBy(Long.parseLong(randId+""));
		productConstraint.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productConstraintDao.create(productConstraint);
		
		ProductConstraint productConstraint2 = productConstraintDao.get(productConstraint.getId());
		
		

		assertEquals(productConstraint.getCreatedBy(),productConstraint2.getCreatedBy());
	}

	@Test
	public void testRemoveByIds() {
		Long[] ids = new Long[2];
		{
		ProductConstraint productConstraint=new ProductConstraint();
		Integer randId=new Double(100000*Math.random()).intValue();
		productConstraint.setId(idGenerator.getUId());
		productConstraint.setName("productConstraint" + randId);
		productConstraint.setKey("productConstraint" + randId);
		productConstraint.setMinLength(randId);
		productConstraint.setMaxLength(randId);
		productConstraint.setProductId(Long.parseLong(randId+""));
		productConstraint.setCreated(new Date());
		productConstraint.setCreatedBy(Long.parseLong(randId+""));
		productConstraint.setActive(true);
		productConstraint.setUpdated(new Date());
		productConstraint.setUpdatedBy(Long.parseLong(randId+""));
		productConstraint.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productConstraintDao.create(productConstraint);
		ids[0]=productConstraint.getId();
		}
		
		{
		
		ProductConstraint productConstraint=new ProductConstraint();
		Integer randId=new Double(100000*Math.random()).intValue();
		productConstraint.setId(idGenerator.getUId());
		productConstraint.setName("productConstraint" + randId);
		productConstraint.setKey("productConstraint" + randId);
		productConstraint.setMinLength(randId);
		productConstraint.setMaxLength(randId);
		productConstraint.setProductId(Long.parseLong(randId+""));
		productConstraint.setCreated(new Date());
		productConstraint.setCreatedBy(Long.parseLong(randId+""));
		productConstraint.setActive(true);
		productConstraint.setUpdated(new Date());
		productConstraint.setUpdatedBy(Long.parseLong(randId+""));
		productConstraint.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productConstraintDao.create(productConstraint);
		ids[1]=productConstraint.getId();
		}
		
		
		{
			ProductConstraint productConstraint = productConstraintDao.get(ids[0]);
			assertNotNull(productConstraint);
		}
		
		{
			ProductConstraint productConstraint = productConstraintDao.get(ids[1]);
			assertNotNull(productConstraint);
		}
		
		productConstraintDao.removeByIds(ids);
		
		{
			ProductConstraint productConstraint = productConstraintDao.get(ids[0]);
			assertNull(productConstraint);
		}
		
		{
			ProductConstraint productConstraint = productConstraintDao.get(ids[1]);
			assertNull(productConstraint);
		}
	}

	@Test
	public void testGetAll() {
		List<ProductConstraint> entities = productConstraintDao.getAll();
		
		
		ProductConstraint productConstraint=new ProductConstraint();
		Integer randId=new Double(100000*Math.random()).intValue();
		productConstraint.setId(idGenerator.getUId());
		productConstraint.setName("productConstraint" + randId);
		productConstraint.setKey("productConstraint" + randId);
		productConstraint.setMinLength(randId);
		productConstraint.setMaxLength(randId);
		productConstraint.setProductId(Long.parseLong(randId+""));
		productConstraint.setCreated(new Date());
		productConstraint.setCreatedBy(Long.parseLong(randId+""));
		productConstraint.setActive(true);
		productConstraint.setUpdated(new Date());
		productConstraint.setUpdatedBy(Long.parseLong(randId+""));
		productConstraint.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productConstraintDao.create(productConstraint);
		
		List<ProductConstraint> entities2 = productConstraintDao.getAll();
		
		assertEquals(entities2.size(), entities.size()+1);
	}

	@Test
	public void testGetAllByPage() {
		for(int i=0;i<10;i++){
			ProductConstraint productConstraint=new ProductConstraint();
		Integer randId=new Double(100000*Math.random()).intValue();
		productConstraint.setId(idGenerator.getUId());
		productConstraint.setName("productConstraint" + randId);
		productConstraint.setKey("productConstraint" + randId);
		productConstraint.setMinLength(randId);
		productConstraint.setMaxLength(randId);
		productConstraint.setProductId(Long.parseLong(randId+""));
		productConstraint.setCreated(new Date());
		productConstraint.setCreatedBy(Long.parseLong(randId+""));
		productConstraint.setActive(true);
		productConstraint.setUpdated(new Date());
		productConstraint.setUpdatedBy(Long.parseLong(randId+""));
		productConstraint.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productConstraintDao.create(productConstraint);
		}
		Page page = new DefaultPage(1, 5);
		List<ProductConstraint> entities1 = productConstraintDao.getAllByPage(page);
		assertEquals(entities1.size(), 5);
		Page page2 = new DefaultPage(2, 5);
		List<ProductConstraint> entities2 = productConstraintDao.getAllByPage(page2);
		assertEquals(entities2.size(), 5);
	}
	
}
