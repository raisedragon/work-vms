package com.winit.vms.system.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import static org.junit.Assert.*;
import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.mybatis.domain.DefaultPage;
import org.springframework.test.annotation.Rollback;

import com.winit.vms.system.dao.CountryDao;
import com.winit.vms.system.entity.Country;
import com.winit.vms.test.BaseTest;

public class CountryDaoTest extends BaseTest{
	@Resource
	private CountryDao countryDao;
	
	@Test
	@Rollback(true)
	public void testCrud(){
		Country country=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		country.setId(idGenerator.getUId());
		country.setName("country" + randId);
		country.setIosCode2Char("country" + randId);
		country.setIosCode3Char("country" + randId);
		country.setIosCode3Digit("country" + randId);
		country.setCreated(new Date());
		country.setCreatedBy(Long.parseLong(randId+""));
		country.setActive(true);
		country.setUpdated(new Date());
		country.setUpdatedBy(Long.parseLong(randId+""));
		country.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		countryDao.create(country);
        Assert.assertNotNull(country.getId());
        logger.debug("country1:"+ country.getId());
		//获取一实体
		Country country2=(Country)countryDao.get(country.getId());
		Assert.assertNotNull(country2);
		logger.debug("country2:" + country2.toString());
		Integer randId2=new Double(100000*Math.random()).intValue();
		country2.setName("country" + randId2);
		country2.setIosCode2Char("country" + randId2);
		country2.setIosCode3Char("country" + randId2);
		country2.setIosCode3Digit("country" + randId2);
		country2.setCreated(new Date());
		country2.setCreatedBy(Long.parseLong(randId2+""));
		country.setActive(true);
		country2.setUpdated(new Date());
		country2.setUpdatedBy(Long.parseLong(randId2+""));
		country2.setOrgId(Long.parseLong(randId2+""));
		//更新一实体
		countryDao.update(country2);
		
		Country country3=countryDao.get(country.getId());
		System.out.println("country3:"+country3.toString());
		//删除一实体
		//countryDao.remove(country.getId());
	}
	
	
	@Test
	public void testCreate() {
		Country country=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		country.setId(idGenerator.getUId());
		country.setName("country" + randId);
		country.setIosCode2Char("country" + randId);
		country.setIosCode3Char("country" + randId);
		country.setIosCode3Digit("country" + randId);
		country.setCreated(new Date());
		country.setCreatedBy(Long.parseLong(randId+""));
		country.setActive(true);
		country.setUpdated(new Date());
		country.setUpdatedBy(Long.parseLong(randId+""));
		country.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		countryDao.create(country);
		
		Country country1 = countryDao.get(country.getId());
		
		assertEquals(country.getOrgId(), country1.getOrgId());
        
	}

	@Test
	public void testUpdate() {
		Country country=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		country.setId(idGenerator.getUId());
		country.setName("country" + randId);
		country.setIosCode2Char("country" + randId);
		country.setIosCode3Char("country" + randId);
		country.setIosCode3Digit("country" + randId);
		country.setCreated(new Date());
		country.setCreatedBy(Long.parseLong(randId+""));
		country.setActive(true);
		country.setUpdated(new Date());
		country.setUpdatedBy(Long.parseLong(randId+""));
		country.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		countryDao.create(country);
		
		Integer randId2=new Double(100000*Math.random()).intValue();
		country.setName("country" + randId2);
		country.setIosCode2Char("country" + randId2);
		country.setIosCode3Char("country" + randId2);
		country.setIosCode3Digit("country" + randId2);
		country.setCreated(new Date());
		country.setCreatedBy(Long.parseLong(randId2+""));
		country.setActive(true);
		country.setUpdated(new Date());
		country.setUpdatedBy(Long.parseLong(randId2+""));
		country.setOrgId(Long.parseLong(randId2+""));
		
		//创建一实体
		countryDao.update(country);
		
		Country country2 = countryDao.get(country.getId());
		
		assertEquals(country.getOrgId(),country2.getOrgId());
	}

	@Test
	public void testRemove() {
		Country country=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		country.setId(idGenerator.getUId());
		country.setName("country" + randId);
		country.setIosCode2Char("country" + randId);
		country.setIosCode3Char("country" + randId);
		country.setIosCode3Digit("country" + randId);
		country.setCreated(new Date());
		country.setCreatedBy(Long.parseLong(randId+""));
		country.setActive(true);
		country.setUpdated(new Date());
		country.setUpdatedBy(Long.parseLong(randId+""));
		country.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		countryDao.create(country);
		
		countryDao.remove(country.getId());
		
		Country  country2 = countryDao.get(country.getId());
		
		assertNull(country2);
	}

	@Test
	public void testGet() {
		Country country=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		country.setId(idGenerator.getUId());
		country.setName("country" + randId);
		country.setIosCode2Char("country" + randId);
		country.setIosCode3Char("country" + randId);
		country.setIosCode3Digit("country" + randId);
		country.setCreated(new Date());
		country.setCreatedBy(Long.parseLong(randId+""));
		country.setActive(true);
		country.setUpdated(new Date());
		country.setUpdatedBy(Long.parseLong(randId+""));
		country.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		countryDao.create(country);
		
		Country country2 = countryDao.get(country.getId());
		
		

		assertEquals(country.getCreatedBy(),country2.getCreatedBy());
	}

	@Test
	public void testRemoveByIds() {
		Long[] ids = new Long[2];
		{
		Country country=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		country.setId(idGenerator.getUId());
		country.setName("country" + randId);
		country.setIosCode2Char("country" + randId);
		country.setIosCode3Char("country" + randId);
		country.setIosCode3Digit("country" + randId);
		country.setCreated(new Date());
		country.setCreatedBy(Long.parseLong(randId+""));
		country.setActive(true);
		country.setUpdated(new Date());
		country.setUpdatedBy(Long.parseLong(randId+""));
		country.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		countryDao.create(country);
		ids[0]=country.getId();
		}
		
		{
		
		Country country=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		country.setId(idGenerator.getUId());
		country.setName("country" + randId);
		country.setIosCode2Char("country" + randId);
		country.setIosCode3Char("country" + randId);
		country.setIosCode3Digit("country" + randId);
		country.setCreated(new Date());
		country.setCreatedBy(Long.parseLong(randId+""));
		country.setActive(true);
		country.setUpdated(new Date());
		country.setUpdatedBy(Long.parseLong(randId+""));
		country.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		countryDao.create(country);
		ids[1]=country.getId();
		}
		
		
		{
			Country country = countryDao.get(ids[0]);
			assertNotNull(country);
		}
		
		{
			Country country = countryDao.get(ids[1]);
			assertNotNull(country);
		}
		
		countryDao.removeByIds(ids);
		
		{
			Country country = countryDao.get(ids[0]);
			assertNull(country);
		}
		
		{
			Country country = countryDao.get(ids[1]);
			assertNull(country);
		}
	}

	@Test
	public void testGetAll() {
		List<Country> entities = countryDao.getAll();
		
		
		Country country=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		country.setId(idGenerator.getUId());
		country.setName("country" + randId);
		country.setIosCode2Char("country" + randId);
		country.setIosCode3Char("country" + randId);
		country.setIosCode3Digit("country" + randId);
		country.setCreated(new Date());
		country.setCreatedBy(Long.parseLong(randId+""));
		country.setActive(true);
		country.setUpdated(new Date());
		country.setUpdatedBy(Long.parseLong(randId+""));
		country.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		countryDao.create(country);
		
		List<Country> entities2 = countryDao.getAll();
		
		assertEquals(entities2.size(), entities.size()+1);
	}

	@Test
	public void testGetAllByPage() {
		for(int i=0;i<10;i++){
			Country country=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		country.setId(idGenerator.getUId());
		country.setName("country" + randId);
		country.setIosCode2Char("country" + randId);
		country.setIosCode3Char("country" + randId);
		country.setIosCode3Digit("country" + randId);
		country.setCreated(new Date());
		country.setCreatedBy(Long.parseLong(randId+""));
		country.setActive(true);
		country.setUpdated(new Date());
		country.setUpdatedBy(Long.parseLong(randId+""));
		country.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		countryDao.create(country);
		}
		Page page = new DefaultPage(1, 5);
		List<Country> entities1 = countryDao.getAllByPage(page);
		assertEquals(entities1.size(), 5);
		Page page2 = new DefaultPage(2, 5);
		List<Country> entities2 = countryDao.getAllByPage(page2);
		assertEquals(entities2.size(), 5);
	}
	
}
