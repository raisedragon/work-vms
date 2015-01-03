package com.winit.vms.system.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.mybatis.domain.DefaultPage;
import com.winit.vms.system.entity.Country;
import com.winit.vms.system.query.CountryQuery;
import com.winit.vms.test.BaseTest;

public class CountryDaoTest2  extends BaseTest {
	@Resource
	private CountryDao entityDao;

	@Test
	public void testQueryByCriteriaFindQuery() {
		for(int i=0;i<5;i++){
			Country entity=new Country();
			Integer randId=new Double(100000*Math.random()).intValue();
			entity.setId(idGenerator.getUId());
			entity.setName("CN");
			entity.setIosCode2Char("CN");
			entity.setIosCode3Char("CN");
			entity.setIosCode3Digit("CN");
			entity.setCreated(new Date());
			entity.setCreatedBy(Long.parseLong(randId+""));
			entity.setActive(true);
			entity.setUpdated(new Date());
			entity.setUpdatedBy(Long.parseLong(randId+""));
			entity.setOrgId(Long.parseLong(randId+""));
			entityDao.create(entity);
		}
		
		List<Country> entities = entityDao.getAll();
		
		List<Country> entities2 = entityDao.queryByCriteria(new CountryQuery.FindQuery());
		
		assertEquals(entities.size(), entities2.size());
		
		CountryQuery.FindQuery query = new CountryQuery.FindQuery();
		query.createCriteria().andNameEqualTo("CN");
		List<Country> entities3 = entityDao.queryByCriteria(query);
		for(Country entity:entities3){
			assertEquals("CN", entity.getName());
		}
		
		
	}

	@Test
	public void testQueryByCriteriaFindQueryPage() {
		for(int i=0;i<5;i++){
			Country entity=new Country();
			Integer randId=new Double(100000*Math.random()).intValue();
			entity.setId(idGenerator.getUId());
			entity.setName("CN");
			entity.setIosCode2Char("CN");
			entity.setIosCode3Char("CN");
			entity.setIosCode3Digit("CN");
			entity.setCreated(new Date());
			entity.setCreatedBy(Long.parseLong(randId+""));
			entity.setActive(true);
			entity.setUpdated(new Date());
			entity.setUpdatedBy(Long.parseLong(randId+""));
			entity.setOrgId(Long.parseLong(randId+""));
			entityDao.create(entity);
		}
		
		
		
		CountryQuery.FindQuery query = new CountryQuery.FindQuery();
		query.createCriteria().andNameEqualTo("CN");
		Page page = new DefaultPage(1,3);
		List<Country> entities = entityDao.queryByCriteria(query,page);
		assertEquals(3, entities.size());
		
		for(Country entity:entities){
			assertEquals("CN", entity.getName());
		}
	}

	@Test
	public void testQueryCountByCriteria() {
		
		CountryQuery.FindQuery query = new CountryQuery.FindQuery();
		query.createCriteria().andNameEqualTo("CN");
		long cnt = entityDao.queryCountByCriteria(query);
		
		
		for(int i=0;i<5;i++){
			Country entity=new Country();
			Integer randId=new Double(100000*Math.random()).intValue();
			entity.setId(idGenerator.getUId());
			entity.setName("CN");
			entity.setIosCode2Char("CN");
			entity.setIosCode3Char("CN");
			entity.setIosCode3Digit("CN");
			entity.setCreated(new Date());
			entity.setCreatedBy(Long.parseLong(randId+""));
			entity.setActive(true);
			entity.setUpdated(new Date());
			entity.setUpdatedBy(Long.parseLong(randId+""));
			entity.setOrgId(Long.parseLong(randId+""));
			entityDao.create(entity);
		}
		
		long cnt2 = entityDao.queryCountByCriteria(query);
		
		assertEquals(cnt+5, cnt2);
		
	}

	@Test
	public void testUpdateByUpdateQuery() {
		
		List<Long> ids = new ArrayList<Long>();
		for(int i=0;i<5;i++){
			Country entity=new Country();
			Integer randId=new Double(100000*Math.random()).intValue();
			entity.setId(idGenerator.getUId());
			entity.setName("CN");
			entity.setIosCode2Char("CN");
			entity.setIosCode3Char("CN");
			entity.setIosCode3Digit("CN");
			entity.setCreated(new Date());
			entity.setCreatedBy(Long.parseLong(randId+""));
			entity.setActive(true);
			entity.setUpdated(new Date());
			entity.setUpdatedBy(Long.parseLong(randId+""));
			entity.setOrgId(Long.parseLong(randId+""));
			entityDao.create(entity);
			ids.add(entity.getId());
		}
		
		CountryQuery.UpdateQuery uquery = new CountryQuery.UpdateQuery();
		uquery.createCriteria().andNameEqualTo("CN");
		uquery.getUpdateClause().setName("China");
		
		entityDao.updateByUpdateQuery(uquery);
		
		
		
		CountryQuery.FindQuery query = new CountryQuery.FindQuery();
		query.createCriteria().andIdIn(ids);
		List<Country> entities = entityDao.queryByCriteria(query);
		for(Country entity:entities){
			assertEquals("China", entity.getName());
		}
		
	}

	@Test
	public void testDeleteByDeleteQuery() {
		{
		CountryQuery.DeleteQuery dquery = new CountryQuery.DeleteQuery();
		dquery.createCriteria().andNameEqualTo("CN0");
		entityDao.deleteByDeleteQuery(dquery);
		}
		{
		CountryQuery.FindQuery query = new CountryQuery.FindQuery();
		query.createCriteria().andNameEqualTo("CN0");
		long cnt = entityDao.queryCountByCriteria(query);
		assertEquals(0, cnt);
		}
		for(int i=0;i<5;i++){
			Country entity=new Country();
			Integer randId=new Double(100000*Math.random()).intValue();
			entity.setId(idGenerator.getUId());
			entity.setName("CN"+i);
			entity.setIosCode2Char("CN");
			entity.setIosCode3Char("CN");
			entity.setIosCode3Digit("CN");
			entity.setCreated(new Date());
			entity.setCreatedBy(Long.parseLong(randId+""));
			entity.setActive(true);
			entity.setUpdated(new Date());
			entity.setUpdatedBy(Long.parseLong(randId+""));
			entity.setOrgId(Long.parseLong(randId+""));
			entityDao.create(entity);
		}
		
		{
			CountryQuery.FindQuery query = new CountryQuery.FindQuery();
			query.createCriteria().andNameEqualTo("CN0");
			long cnt = entityDao.queryCountByCriteria(query);
			assertEquals(1, cnt);
			}
		
		{
			CountryQuery.DeleteQuery dquery = new CountryQuery.DeleteQuery();
			dquery.createCriteria().andNameEqualTo("CN0");
			entityDao.deleteByDeleteQuery(dquery);
			}
			{
			CountryQuery.FindQuery query = new CountryQuery.FindQuery();
			query.createCriteria().andNameEqualTo("CN0");
			long cnt = entityDao.queryCountByCriteria(query);
			assertEquals(0, cnt);
			}
	}

	
	@Test
	public void testCreate() {
		Country entity=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		entity.setId(idGenerator.getUId());
		entity.setName("CN");
		entity.setIosCode2Char("CN");
		entity.setIosCode3Char("CN");
		entity.setIosCode3Digit("CN");
		entity.setCreated(new Date());
		entity.setCreatedBy(Long.parseLong(randId+""));
		entity.setActive(true);
		entity.setUpdated(new Date());
		entity.setUpdatedBy(Long.parseLong(randId+""));
		entity.setOrgId(Long.parseLong(randId+""));
		entityDao.create(entity);
		
		Country entity2 = entityDao.get(entity.getId());
		
		assertEquals(entity2.getName(), entity.getName());
        
	}

	@Test
	public void testUpdate() {
		Country entity=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		entity.setId(idGenerator.getUId());
		entity.setName("CN");
		entity.setIosCode2Char("CN");
		entity.setIosCode3Char("CN");
		entity.setIosCode3Digit("CN");
		entity.setCreated(new Date());
		entity.setCreatedBy(Long.parseLong(randId+""));
		entity.setActive(true);
		entity.setUpdated(new Date());
		entity.setUpdatedBy(Long.parseLong(randId+""));
		entity.setOrgId(Long.parseLong(randId+""));
		entityDao.create(entity);
		
		Integer randId2=new Double(100000*Math.random()).intValue();
		entity.setName("CN1");
		entity.setIosCode2Char("CC");
		entity.setIosCode3Char("CN1");
		entity.setIosCode3Digit("CN1");
		entity.setCreated(new Date());
		entity.setCreatedBy(Long.parseLong(randId2+""));
		entity.setActive(true);
		entity.setUpdated(new Date());
		entity.setUpdatedBy(Long.parseLong(randId2+""));
		entity.setOrgId(Long.parseLong(randId2+""));
		entityDao.update(entity);
		
		Country entity2 = entityDao.get(entity.getId());
		
		assertEquals(entity.getName(),entity2.getName());
	}

	@Test
	public void testRemove() {
		Country entity=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		entity.setId(idGenerator.getUId());
		entity.setName("CN");
		entity.setIosCode2Char("CN");
		entity.setIosCode3Char("CN");
		entity.setIosCode3Digit("CN");
		entity.setCreated(new Date());
		entity.setCreatedBy(Long.parseLong(randId+""));
		entity.setActive(true);
		entity.setUpdated(new Date());
		entity.setUpdatedBy(Long.parseLong(randId+""));
		entity.setOrgId(Long.parseLong(randId+""));
		entityDao.create(entity);
		
		entityDao.remove(entity.getId());
		
		Country entity2 = entityDao.get(entity.getId());
		
		assertNull(entity2);
	}

	@Test
	public void testGet() {
		Country entity=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		entity.setId(idGenerator.getUId());
		entity.setName("CN");
		entity.setIosCode2Char("CN");
		entity.setIosCode3Char("CN");
		entity.setIosCode3Digit("CN");
		entity.setCreated(new Date());
		entity.setCreatedBy(Long.parseLong(randId+""));
		entity.setActive(true);
		entity.setUpdated(new Date());
		entity.setUpdatedBy(Long.parseLong(randId+""));
		entity.setOrgId(Long.parseLong(randId+""));
		entityDao.create(entity);
		
		Country entity2 = entityDao.get(entity.getId());
		
		

		assertEquals(entity.getName(),entity2.getName());
	}

	@Test
	public void testRemoveByIds() {
		Long[] ids = new Long[2];
		{
		Country entity=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		entity.setId(idGenerator.getUId());
		entity.setName("CN");
		entity.setIosCode2Char("CN");
		entity.setIosCode3Char("CN");
		entity.setIosCode3Digit("CN");
		entity.setCreated(new Date());
		entity.setCreatedBy(Long.parseLong(randId+""));
		entity.setActive(true);
		entity.setUpdated(new Date());
		entity.setUpdatedBy(Long.parseLong(randId+""));
		entity.setOrgId(Long.parseLong(randId+""));
		entityDao.create(entity);
		ids[0]=entity.getId();
		}
		
		{
		
		Country entity=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		entity.setId(idGenerator.getUId());
		entity.setName("CN");
		entity.setIosCode2Char("CN");
		entity.setIosCode3Char("CN");
		entity.setIosCode3Digit("CN");
		entity.setCreated(new Date());
		entity.setCreatedBy(Long.parseLong(randId+""));
		entity.setActive(true);
		entity.setUpdated(new Date());
		entity.setUpdatedBy(Long.parseLong(randId+""));
		entity.setOrgId(Long.parseLong(randId+""));
		entityDao.create(entity);
		ids[1]=entity.getId();
		}
		
		
		{
			Country entity = entityDao.get(ids[0]);
			assertNotNull(entity);
		}
		
		{
			Country entity = entityDao.get(ids[1]);
			assertNotNull(entity);
		}
		
		entityDao.removeByIds(ids);
		
		{
			Country entity = entityDao.get(ids[0]);
			assertNull(entity);
		}
		
		{
			Country entity = entityDao.get(ids[1]);
			assertNull(entity);
		}
	}

	@Test
	public void testGetAll() {
		List<Country> entities = entityDao.getAll();
		
		
		Country entity=new Country();
		Integer randId=new Double(100000*Math.random()).intValue();
		entity.setId(idGenerator.getUId());
		entity.setName("CN");
		entity.setIosCode2Char("CN");
		entity.setIosCode3Char("CN");
		entity.setIosCode3Digit("CN");
		entity.setCreated(new Date());
		entity.setCreatedBy(Long.parseLong(randId+""));
		entity.setActive(true);
		entity.setUpdated(new Date());
		entity.setUpdatedBy(Long.parseLong(randId+""));
		entity.setOrgId(Long.parseLong(randId+""));
		entityDao.create(entity);
		
		List<Country> entities2 = entityDao.getAll();
		
		assertEquals(entities2.size(), entities.size()+1);
	}

	@Test
	public void testGetAllByPage() {
		for(int i=0;i<10;i++){
			Country entity=new Country();
			Integer randId=new Double(100000*Math.random()).intValue();
			entity.setId(idGenerator.getUId());
			entity.setName("CN");
			entity.setIosCode2Char("CN");
			entity.setIosCode3Char("CN");
			entity.setIosCode3Digit("CN");
			entity.setCreated(new Date());
			entity.setCreatedBy(Long.parseLong(randId+""));
			entity.setActive(true);
			entity.setUpdated(new Date());
			entity.setUpdatedBy(Long.parseLong(randId+""));
			entity.setOrgId(Long.parseLong(randId+""));
			entityDao.create(entity);
		}
		Page page = new DefaultPage(1, 5);
		List<Country> entities1 = entityDao.getAllByPage(page);
		assertEquals(entities1.size(), 5);
		Page page2 = new DefaultPage(2, 5);
		List<Country> entities2 = entityDao.getAllByPage(page2);
		assertEquals(entities2.size(), 5);
	}

}
