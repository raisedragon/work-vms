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

import com.winit.vms.vendor.dao.VendorDao;
import com.winit.vms.vendor.entity.Vendor;
import com.winit.vms.test.BaseTest;

public class VendorDaoTest extends BaseTest{
	@Resource
	private VendorDao vendorDao;
	
	@Test
	@Rollback(true)
	public void testCrud(){
		Vendor vendor=new Vendor();
		Integer randId=new Double(100000*Math.random()).intValue();
		vendor.setId(idGenerator.getUId());
		vendor.setName("vendor" + randId);
		vendor.setCode("vendor" + randId);
		vendor.setWarehouseId(Long.parseLong(randId+""));
		vendor.setCreated(new Date());
		vendor.setCreatedBy(Long.parseLong(randId+""));
		vendor.setActive(true);
		vendor.setUpdated(new Date());
		vendor.setUpdatedBy(Long.parseLong(randId+""));
		vendor.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		vendorDao.create(vendor);
        Assert.assertNotNull(vendor.getId());
        logger.debug("vendor1:"+ vendor.getId());
		//获取一实体
		Vendor vendor2=(Vendor)vendorDao.get(vendor.getId());
		Assert.assertNotNull(vendor2);
		logger.debug("vendor2:" + vendor2.toString());
		Integer randId2=new Double(100000*Math.random()).intValue();
		vendor2.setName("vendor" + randId2);
		vendor2.setCode("vendor" + randId2);
		vendor2.setWarehouseId(Long.parseLong(randId2+""));
		vendor2.setCreated(new Date());
		vendor2.setCreatedBy(Long.parseLong(randId2+""));
		vendor.setActive(true);
		vendor2.setUpdated(new Date());
		vendor2.setUpdatedBy(Long.parseLong(randId2+""));
		vendor2.setOrgId(Long.parseLong(randId2+""));
		//更新一实体
		vendorDao.update(vendor2);
		
		Vendor vendor3=vendorDao.get(vendor.getId());
		System.out.println("vendor3:"+vendor3.toString());
		//删除一实体
		//vendorDao.remove(vendor.getId());
	}
	
	
	@Test
	public void testCreate() {
		Vendor vendor=new Vendor();
		Integer randId=new Double(100000*Math.random()).intValue();
		vendor.setId(idGenerator.getUId());
		vendor.setName("vendor" + randId);
		vendor.setCode("vendor" + randId);
		vendor.setWarehouseId(Long.parseLong(randId+""));
		vendor.setCreated(new Date());
		vendor.setCreatedBy(Long.parseLong(randId+""));
		vendor.setActive(true);
		vendor.setUpdated(new Date());
		vendor.setUpdatedBy(Long.parseLong(randId+""));
		vendor.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		vendorDao.create(vendor);
		
		Vendor vendor1 = vendorDao.get(vendor.getId());
		
		assertEquals(vendor.getOrgId(), vendor1.getOrgId());
        
	}

	@Test
	public void testUpdate() {
		Vendor vendor=new Vendor();
		Integer randId=new Double(100000*Math.random()).intValue();
		vendor.setId(idGenerator.getUId());
		vendor.setName("vendor" + randId);
		vendor.setCode("vendor" + randId);
		vendor.setWarehouseId(Long.parseLong(randId+""));
		vendor.setCreated(new Date());
		vendor.setCreatedBy(Long.parseLong(randId+""));
		vendor.setActive(true);
		vendor.setUpdated(new Date());
		vendor.setUpdatedBy(Long.parseLong(randId+""));
		vendor.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		vendorDao.create(vendor);
		
		Integer randId2=new Double(100000*Math.random()).intValue();
		vendor.setName("vendor" + randId2);
		vendor.setCode("vendor" + randId2);
		vendor.setWarehouseId(Long.parseLong(randId2+""));
		vendor.setCreated(new Date());
		vendor.setCreatedBy(Long.parseLong(randId2+""));
		vendor.setActive(true);
		vendor.setUpdated(new Date());
		vendor.setUpdatedBy(Long.parseLong(randId2+""));
		vendor.setOrgId(Long.parseLong(randId2+""));
		
		//创建一实体
		vendorDao.update(vendor);
		
		Vendor vendor2 = vendorDao.get(vendor.getId());
		
		assertEquals(vendor.getOrgId(),vendor2.getOrgId());
	}

	@Test
	public void testRemove() {
		Vendor vendor=new Vendor();
		Integer randId=new Double(100000*Math.random()).intValue();
		vendor.setId(idGenerator.getUId());
		vendor.setName("vendor" + randId);
		vendor.setCode("vendor" + randId);
		vendor.setWarehouseId(Long.parseLong(randId+""));
		vendor.setCreated(new Date());
		vendor.setCreatedBy(Long.parseLong(randId+""));
		vendor.setActive(true);
		vendor.setUpdated(new Date());
		vendor.setUpdatedBy(Long.parseLong(randId+""));
		vendor.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		vendorDao.create(vendor);
		
		vendorDao.remove(vendor.getId());
		
		Vendor  vendor2 = vendorDao.get(vendor.getId());
		
		assertNull(vendor2);
	}

	@Test
	public void testGet() {
		Vendor vendor=new Vendor();
		Integer randId=new Double(100000*Math.random()).intValue();
		vendor.setId(idGenerator.getUId());
		vendor.setName("vendor" + randId);
		vendor.setCode("vendor" + randId);
		vendor.setWarehouseId(Long.parseLong(randId+""));
		vendor.setCreated(new Date());
		vendor.setCreatedBy(Long.parseLong(randId+""));
		vendor.setActive(true);
		vendor.setUpdated(new Date());
		vendor.setUpdatedBy(Long.parseLong(randId+""));
		vendor.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		vendorDao.create(vendor);
		
		Vendor vendor2 = vendorDao.get(vendor.getId());
		
		

		assertEquals(vendor.getCreatedBy(),vendor2.getCreatedBy());
	}

	@Test
	public void testRemoveByIds() {
		Long[] ids = new Long[2];
		{
		Vendor vendor=new Vendor();
		Integer randId=new Double(100000*Math.random()).intValue();
		vendor.setId(idGenerator.getUId());
		vendor.setName("vendor" + randId);
		vendor.setCode("vendor" + randId);
		vendor.setWarehouseId(Long.parseLong(randId+""));
		vendor.setCreated(new Date());
		vendor.setCreatedBy(Long.parseLong(randId+""));
		vendor.setActive(true);
		vendor.setUpdated(new Date());
		vendor.setUpdatedBy(Long.parseLong(randId+""));
		vendor.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		vendorDao.create(vendor);
		ids[0]=vendor.getId();
		}
		
		{
		
		Vendor vendor=new Vendor();
		Integer randId=new Double(100000*Math.random()).intValue();
		vendor.setId(idGenerator.getUId());
		vendor.setName("vendor" + randId);
		vendor.setCode("vendor" + randId);
		vendor.setWarehouseId(Long.parseLong(randId+""));
		vendor.setCreated(new Date());
		vendor.setCreatedBy(Long.parseLong(randId+""));
		vendor.setActive(true);
		vendor.setUpdated(new Date());
		vendor.setUpdatedBy(Long.parseLong(randId+""));
		vendor.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		vendorDao.create(vendor);
		ids[1]=vendor.getId();
		}
		
		
		{
			Vendor vendor = vendorDao.get(ids[0]);
			assertNotNull(vendor);
		}
		
		{
			Vendor vendor = vendorDao.get(ids[1]);
			assertNotNull(vendor);
		}
		
		vendorDao.removeByIds(ids);
		
		{
			Vendor vendor = vendorDao.get(ids[0]);
			assertNull(vendor);
		}
		
		{
			Vendor vendor = vendorDao.get(ids[1]);
			assertNull(vendor);
		}
	}

	@Test
	public void testGetAll() {
		List<Vendor> entities = vendorDao.getAll();
		
		
		Vendor vendor=new Vendor();
		Integer randId=new Double(100000*Math.random()).intValue();
		vendor.setId(idGenerator.getUId());
		vendor.setName("vendor" + randId);
		vendor.setCode("vendor" + randId);
		vendor.setWarehouseId(Long.parseLong(randId+""));
		vendor.setCreated(new Date());
		vendor.setCreatedBy(Long.parseLong(randId+""));
		vendor.setActive(true);
		vendor.setUpdated(new Date());
		vendor.setUpdatedBy(Long.parseLong(randId+""));
		vendor.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		vendorDao.create(vendor);
		
		List<Vendor> entities2 = vendorDao.getAll();
		
		assertEquals(entities2.size(), entities.size()+1);
	}

	@Test
	public void testGetAllByPage() {
		for(int i=0;i<10;i++){
			Vendor vendor=new Vendor();
		Integer randId=new Double(100000*Math.random()).intValue();
		vendor.setId(idGenerator.getUId());
		vendor.setName("vendor" + randId);
		vendor.setCode("vendor" + randId);
		vendor.setWarehouseId(Long.parseLong(randId+""));
		vendor.setCreated(new Date());
		vendor.setCreatedBy(Long.parseLong(randId+""));
		vendor.setActive(true);
		vendor.setUpdated(new Date());
		vendor.setUpdatedBy(Long.parseLong(randId+""));
		vendor.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		vendorDao.create(vendor);
		}
		Page page = new DefaultPage(1, 5);
		List<Vendor> entities1 = vendorDao.getAllByPage(page);
		assertEquals(entities1.size(), 5);
		Page page2 = new DefaultPage(2, 5);
		List<Vendor> entities2 = vendorDao.getAllByPage(page2);
		assertEquals(entities2.size(), 5);
	}
	
}
