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

import com.winit.vms.vendor.dao.TrackMappingDao;
import com.winit.vms.vendor.entity.TrackMapping;
import com.winit.vms.test.BaseTest;

public class TrackMappingDaoTest extends BaseTest{
	@Resource
	private TrackMappingDao trackMappingDao;
	
	@Test
	@Rollback(true)
	public void testCrud(){
		TrackMapping trackMapping=new TrackMapping();
		Integer randId=new Double(100000*Math.random()).intValue();
		trackMapping.setId(idGenerator.getUId());
		trackMapping.setCode("trackMapping" + randId);
		trackMapping.setWinitCode("trackMapping" + randId);
		trackMapping.setValue("trackMapping" + randId);
		trackMapping.setProductId(Long.parseLong(randId+""));
		trackMapping.setCreated(new Date());
		trackMapping.setCreatedBy(Long.parseLong(randId+""));
		trackMapping.setActive(true);
		trackMapping.setUpdated(new Date());
		trackMapping.setUpdatedBy(Long.parseLong(randId+""));
		trackMapping.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		trackMappingDao.create(trackMapping);
        Assert.assertNotNull(trackMapping.getId());
        logger.debug("trackMapping1:"+ trackMapping.getId());
		//获取一实体
		TrackMapping trackMapping2=(TrackMapping)trackMappingDao.get(trackMapping.getId());
		Assert.assertNotNull(trackMapping2);
		logger.debug("trackMapping2:" + trackMapping2.toString());
		Integer randId2=new Double(100000*Math.random()).intValue();
		trackMapping2.setCode("trackMapping" + randId2);
		trackMapping2.setWinitCode("trackMapping" + randId2);
		trackMapping2.setValue("trackMapping" + randId2);
		trackMapping2.setProductId(Long.parseLong(randId2+""));
		trackMapping2.setCreated(new Date());
		trackMapping2.setCreatedBy(Long.parseLong(randId2+""));
		trackMapping.setActive(true);
		trackMapping2.setUpdated(new Date());
		trackMapping2.setUpdatedBy(Long.parseLong(randId2+""));
		trackMapping2.setOrgId(Long.parseLong(randId2+""));
		//更新一实体
		trackMappingDao.update(trackMapping2);
		
		TrackMapping trackMapping3=trackMappingDao.get(trackMapping.getId());
		System.out.println("trackMapping3:"+trackMapping3.toString());
		//删除一实体
		//trackMappingDao.remove(trackMapping.getId());
	}
	
	
	@Test
	public void testCreate() {
		TrackMapping trackMapping=new TrackMapping();
		Integer randId=new Double(100000*Math.random()).intValue();
		trackMapping.setId(idGenerator.getUId());
		trackMapping.setCode("trackMapping" + randId);
		trackMapping.setWinitCode("trackMapping" + randId);
		trackMapping.setValue("trackMapping" + randId);
		trackMapping.setProductId(Long.parseLong(randId+""));
		trackMapping.setCreated(new Date());
		trackMapping.setCreatedBy(Long.parseLong(randId+""));
		trackMapping.setActive(true);
		trackMapping.setUpdated(new Date());
		trackMapping.setUpdatedBy(Long.parseLong(randId+""));
		trackMapping.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		trackMappingDao.create(trackMapping);
		
		TrackMapping trackMapping1 = trackMappingDao.get(trackMapping.getId());
		
		assertEquals(trackMapping.getOrgId(), trackMapping1.getOrgId());
        
	}

	@Test
	public void testUpdate() {
		TrackMapping trackMapping=new TrackMapping();
		Integer randId=new Double(100000*Math.random()).intValue();
		trackMapping.setId(idGenerator.getUId());
		trackMapping.setCode("trackMapping" + randId);
		trackMapping.setWinitCode("trackMapping" + randId);
		trackMapping.setValue("trackMapping" + randId);
		trackMapping.setProductId(Long.parseLong(randId+""));
		trackMapping.setCreated(new Date());
		trackMapping.setCreatedBy(Long.parseLong(randId+""));
		trackMapping.setActive(true);
		trackMapping.setUpdated(new Date());
		trackMapping.setUpdatedBy(Long.parseLong(randId+""));
		trackMapping.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		trackMappingDao.create(trackMapping);
		
		Integer randId2=new Double(100000*Math.random()).intValue();
		trackMapping.setCode("trackMapping" + randId2);
		trackMapping.setWinitCode("trackMapping" + randId2);
		trackMapping.setValue("trackMapping" + randId2);
		trackMapping.setProductId(Long.parseLong(randId2+""));
		trackMapping.setCreated(new Date());
		trackMapping.setCreatedBy(Long.parseLong(randId2+""));
		trackMapping.setActive(true);
		trackMapping.setUpdated(new Date());
		trackMapping.setUpdatedBy(Long.parseLong(randId2+""));
		trackMapping.setOrgId(Long.parseLong(randId2+""));
		
		//创建一实体
		trackMappingDao.update(trackMapping);
		
		TrackMapping trackMapping2 = trackMappingDao.get(trackMapping.getId());
		
		assertEquals(trackMapping.getOrgId(),trackMapping2.getOrgId());
	}

	@Test
	public void testRemove() {
		TrackMapping trackMapping=new TrackMapping();
		Integer randId=new Double(100000*Math.random()).intValue();
		trackMapping.setId(idGenerator.getUId());
		trackMapping.setCode("trackMapping" + randId);
		trackMapping.setWinitCode("trackMapping" + randId);
		trackMapping.setValue("trackMapping" + randId);
		trackMapping.setProductId(Long.parseLong(randId+""));
		trackMapping.setCreated(new Date());
		trackMapping.setCreatedBy(Long.parseLong(randId+""));
		trackMapping.setActive(true);
		trackMapping.setUpdated(new Date());
		trackMapping.setUpdatedBy(Long.parseLong(randId+""));
		trackMapping.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		trackMappingDao.create(trackMapping);
		
		trackMappingDao.remove(trackMapping.getId());
		
		TrackMapping  trackMapping2 = trackMappingDao.get(trackMapping.getId());
		
		assertNull(trackMapping2);
	}

	@Test
	public void testGet() {
		TrackMapping trackMapping=new TrackMapping();
		Integer randId=new Double(100000*Math.random()).intValue();
		trackMapping.setId(idGenerator.getUId());
		trackMapping.setCode("trackMapping" + randId);
		trackMapping.setWinitCode("trackMapping" + randId);
		trackMapping.setValue("trackMapping" + randId);
		trackMapping.setProductId(Long.parseLong(randId+""));
		trackMapping.setCreated(new Date());
		trackMapping.setCreatedBy(Long.parseLong(randId+""));
		trackMapping.setActive(true);
		trackMapping.setUpdated(new Date());
		trackMapping.setUpdatedBy(Long.parseLong(randId+""));
		trackMapping.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		trackMappingDao.create(trackMapping);
		
		TrackMapping trackMapping2 = trackMappingDao.get(trackMapping.getId());
		
		

		assertEquals(trackMapping.getCreatedBy(),trackMapping2.getCreatedBy());
	}

	@Test
	public void testRemoveByIds() {
		Long[] ids = new Long[2];
		{
		TrackMapping trackMapping=new TrackMapping();
		Integer randId=new Double(100000*Math.random()).intValue();
		trackMapping.setId(idGenerator.getUId());
		trackMapping.setCode("trackMapping" + randId);
		trackMapping.setWinitCode("trackMapping" + randId);
		trackMapping.setValue("trackMapping" + randId);
		trackMapping.setProductId(Long.parseLong(randId+""));
		trackMapping.setCreated(new Date());
		trackMapping.setCreatedBy(Long.parseLong(randId+""));
		trackMapping.setActive(true);
		trackMapping.setUpdated(new Date());
		trackMapping.setUpdatedBy(Long.parseLong(randId+""));
		trackMapping.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		trackMappingDao.create(trackMapping);
		ids[0]=trackMapping.getId();
		}
		
		{
		
		TrackMapping trackMapping=new TrackMapping();
		Integer randId=new Double(100000*Math.random()).intValue();
		trackMapping.setId(idGenerator.getUId());
		trackMapping.setCode("trackMapping" + randId);
		trackMapping.setWinitCode("trackMapping" + randId);
		trackMapping.setValue("trackMapping" + randId);
		trackMapping.setProductId(Long.parseLong(randId+""));
		trackMapping.setCreated(new Date());
		trackMapping.setCreatedBy(Long.parseLong(randId+""));
		trackMapping.setActive(true);
		trackMapping.setUpdated(new Date());
		trackMapping.setUpdatedBy(Long.parseLong(randId+""));
		trackMapping.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		trackMappingDao.create(trackMapping);
		ids[1]=trackMapping.getId();
		}
		
		
		{
			TrackMapping trackMapping = trackMappingDao.get(ids[0]);
			assertNotNull(trackMapping);
		}
		
		{
			TrackMapping trackMapping = trackMappingDao.get(ids[1]);
			assertNotNull(trackMapping);
		}
		
		trackMappingDao.removeByIds(ids);
		
		{
			TrackMapping trackMapping = trackMappingDao.get(ids[0]);
			assertNull(trackMapping);
		}
		
		{
			TrackMapping trackMapping = trackMappingDao.get(ids[1]);
			assertNull(trackMapping);
		}
	}

	@Test
	public void testGetAll() {
		List<TrackMapping> entities = trackMappingDao.getAll();
		
		
		TrackMapping trackMapping=new TrackMapping();
		Integer randId=new Double(100000*Math.random()).intValue();
		trackMapping.setId(idGenerator.getUId());
		trackMapping.setCode("trackMapping" + randId);
		trackMapping.setWinitCode("trackMapping" + randId);
		trackMapping.setValue("trackMapping" + randId);
		trackMapping.setProductId(Long.parseLong(randId+""));
		trackMapping.setCreated(new Date());
		trackMapping.setCreatedBy(Long.parseLong(randId+""));
		trackMapping.setActive(true);
		trackMapping.setUpdated(new Date());
		trackMapping.setUpdatedBy(Long.parseLong(randId+""));
		trackMapping.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		trackMappingDao.create(trackMapping);
		
		List<TrackMapping> entities2 = trackMappingDao.getAll();
		
		assertEquals(entities2.size(), entities.size()+1);
	}

	@Test
	public void testGetAllByPage() {
		for(int i=0;i<10;i++){
			TrackMapping trackMapping=new TrackMapping();
		Integer randId=new Double(100000*Math.random()).intValue();
		trackMapping.setId(idGenerator.getUId());
		trackMapping.setCode("trackMapping" + randId);
		trackMapping.setWinitCode("trackMapping" + randId);
		trackMapping.setValue("trackMapping" + randId);
		trackMapping.setProductId(Long.parseLong(randId+""));
		trackMapping.setCreated(new Date());
		trackMapping.setCreatedBy(Long.parseLong(randId+""));
		trackMapping.setActive(true);
		trackMapping.setUpdated(new Date());
		trackMapping.setUpdatedBy(Long.parseLong(randId+""));
		trackMapping.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		trackMappingDao.create(trackMapping);
		}
		Page page = new DefaultPage(1, 5);
		List<TrackMapping> entities1 = trackMappingDao.getAllByPage(page);
		assertEquals(entities1.size(), 5);
		Page page2 = new DefaultPage(2, 5);
		List<TrackMapping> entities2 = trackMappingDao.getAllByPage(page2);
		assertEquals(entities2.size(), 5);
	}
	
}
