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

import com.winit.vms.vendor.dao.ProductDao;
import com.winit.vms.vendor.entity.Product;
import com.winit.vms.test.BaseTest;

public class ProductDaoTest extends BaseTest{
	@Resource
	private ProductDao productDao;
	
	@Test
	@Rollback(true)
	public void testCrud(){
		Product product=new Product();
		Integer randId=new Double(100000*Math.random()).intValue();
		product.setId(idGenerator.getUId());
		product.setName("product" + randId);
		product.setCode("product" + randId);
		product.setVenderId(Long.parseLong(randId+""));
		product.setCreated(new Date());
		product.setCreatedBy(Long.parseLong(randId+""));
		product.setActive(true);
		product.setUpdated(new Date());
		product.setUpdatedBy(Long.parseLong(randId+""));
		product.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productDao.create(product);
        Assert.assertNotNull(product.getId());
        logger.debug("product1:"+ product.getId());
		//获取一实体
		Product product2=(Product)productDao.get(product.getId());
		Assert.assertNotNull(product2);
		logger.debug("product2:" + product2.toString());
		Integer randId2=new Double(100000*Math.random()).intValue();
		product2.setName("product" + randId2);
		product2.setCode("product" + randId2);
		product2.setVenderId(Long.parseLong(randId2+""));
		product2.setCreated(new Date());
		product2.setCreatedBy(Long.parseLong(randId2+""));
		product.setActive(true);
		product2.setUpdated(new Date());
		product2.setUpdatedBy(Long.parseLong(randId2+""));
		product2.setOrgId(Long.parseLong(randId2+""));
		//更新一实体
		productDao.update(product2);
		
		Product product3=productDao.get(product.getId());
		System.out.println("product3:"+product3.toString());
		//删除一实体
		//productDao.remove(product.getId());
	}
	
	
	@Test
	public void testCreate() {
		Product product=new Product();
		Integer randId=new Double(100000*Math.random()).intValue();
		product.setId(idGenerator.getUId());
		product.setName("product" + randId);
		product.setCode("product" + randId);
		product.setVenderId(Long.parseLong(randId+""));
		product.setCreated(new Date());
		product.setCreatedBy(Long.parseLong(randId+""));
		product.setActive(true);
		product.setUpdated(new Date());
		product.setUpdatedBy(Long.parseLong(randId+""));
		product.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productDao.create(product);
		
		Product product1 = productDao.get(product.getId());
		
		assertEquals(product.getOrgId(), product1.getOrgId());
        
	}

	@Test
	public void testUpdate() {
		Product product=new Product();
		Integer randId=new Double(100000*Math.random()).intValue();
		product.setId(idGenerator.getUId());
		product.setName("product" + randId);
		product.setCode("product" + randId);
		product.setVenderId(Long.parseLong(randId+""));
		product.setCreated(new Date());
		product.setCreatedBy(Long.parseLong(randId+""));
		product.setActive(true);
		product.setUpdated(new Date());
		product.setUpdatedBy(Long.parseLong(randId+""));
		product.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productDao.create(product);
		
		Integer randId2=new Double(100000*Math.random()).intValue();
		product.setName("product" + randId2);
		product.setCode("product" + randId2);
		product.setVenderId(Long.parseLong(randId2+""));
		product.setCreated(new Date());
		product.setCreatedBy(Long.parseLong(randId2+""));
		product.setActive(true);
		product.setUpdated(new Date());
		product.setUpdatedBy(Long.parseLong(randId2+""));
		product.setOrgId(Long.parseLong(randId2+""));
		
		//创建一实体
		productDao.update(product);
		
		Product product2 = productDao.get(product.getId());
		
		assertEquals(product.getOrgId(),product2.getOrgId());
	}

	@Test
	public void testRemove() {
		Product product=new Product();
		Integer randId=new Double(100000*Math.random()).intValue();
		product.setId(idGenerator.getUId());
		product.setName("product" + randId);
		product.setCode("product" + randId);
		product.setVenderId(Long.parseLong(randId+""));
		product.setCreated(new Date());
		product.setCreatedBy(Long.parseLong(randId+""));
		product.setActive(true);
		product.setUpdated(new Date());
		product.setUpdatedBy(Long.parseLong(randId+""));
		product.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productDao.create(product);
		
		productDao.remove(product.getId());
		
		Product  product2 = productDao.get(product.getId());
		
		assertNull(product2);
	}

	@Test
	public void testGet() {
		Product product=new Product();
		Integer randId=new Double(100000*Math.random()).intValue();
		product.setId(idGenerator.getUId());
		product.setName("product" + randId);
		product.setCode("product" + randId);
		product.setVenderId(Long.parseLong(randId+""));
		product.setCreated(new Date());
		product.setCreatedBy(Long.parseLong(randId+""));
		product.setActive(true);
		product.setUpdated(new Date());
		product.setUpdatedBy(Long.parseLong(randId+""));
		product.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productDao.create(product);
		
		Product product2 = productDao.get(product.getId());
		
		

		assertEquals(product.getCreatedBy(),product2.getCreatedBy());
	}

	@Test
	public void testRemoveByIds() {
		Long[] ids = new Long[2];
		{
		Product product=new Product();
		Integer randId=new Double(100000*Math.random()).intValue();
		product.setId(idGenerator.getUId());
		product.setName("product" + randId);
		product.setCode("product" + randId);
		product.setVenderId(Long.parseLong(randId+""));
		product.setCreated(new Date());
		product.setCreatedBy(Long.parseLong(randId+""));
		product.setActive(true);
		product.setUpdated(new Date());
		product.setUpdatedBy(Long.parseLong(randId+""));
		product.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productDao.create(product);
		ids[0]=product.getId();
		}
		
		{
		
		Product product=new Product();
		Integer randId=new Double(100000*Math.random()).intValue();
		product.setId(idGenerator.getUId());
		product.setName("product" + randId);
		product.setCode("product" + randId);
		product.setVenderId(Long.parseLong(randId+""));
		product.setCreated(new Date());
		product.setCreatedBy(Long.parseLong(randId+""));
		product.setActive(true);
		product.setUpdated(new Date());
		product.setUpdatedBy(Long.parseLong(randId+""));
		product.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productDao.create(product);
		ids[1]=product.getId();
		}
		
		
		{
			Product product = productDao.get(ids[0]);
			assertNotNull(product);
		}
		
		{
			Product product = productDao.get(ids[1]);
			assertNotNull(product);
		}
		
		productDao.removeByIds(ids);
		
		{
			Product product = productDao.get(ids[0]);
			assertNull(product);
		}
		
		{
			Product product = productDao.get(ids[1]);
			assertNull(product);
		}
	}

	@Test
	public void testGetAll() {
		List<Product> entities = productDao.getAll();
		
		
		Product product=new Product();
		Integer randId=new Double(100000*Math.random()).intValue();
		product.setId(idGenerator.getUId());
		product.setName("product" + randId);
		product.setCode("product" + randId);
		product.setVenderId(Long.parseLong(randId+""));
		product.setCreated(new Date());
		product.setCreatedBy(Long.parseLong(randId+""));
		product.setActive(true);
		product.setUpdated(new Date());
		product.setUpdatedBy(Long.parseLong(randId+""));
		product.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productDao.create(product);
		
		List<Product> entities2 = productDao.getAll();
		
		assertEquals(entities2.size(), entities.size()+1);
	}

	@Test
	public void testGetAllByPage() {
		for(int i=0;i<10;i++){
			Product product=new Product();
		Integer randId=new Double(100000*Math.random()).intValue();
		product.setId(idGenerator.getUId());
		product.setName("product" + randId);
		product.setCode("product" + randId);
		product.setVenderId(Long.parseLong(randId+""));
		product.setCreated(new Date());
		product.setCreatedBy(Long.parseLong(randId+""));
		product.setActive(true);
		product.setUpdated(new Date());
		product.setUpdatedBy(Long.parseLong(randId+""));
		product.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		productDao.create(product);
		}
		Page page = new DefaultPage(1, 5);
		List<Product> entities1 = productDao.getAllByPage(page);
		assertEquals(entities1.size(), 5);
		Page page2 = new DefaultPage(2, 5);
		List<Product> entities2 = productDao.getAllByPage(page2);
		assertEquals(entities2.size(), 5);
	}
	
}
