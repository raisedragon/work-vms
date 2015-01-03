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

import com.winit.vms.system.dao.WarhouseDao;
import com.winit.vms.system.entity.Warhouse;
import com.winit.vms.test.BaseTest;

public class WarhouseDaoTest extends BaseTest{
	@Resource
	private WarhouseDao warhouseDao;
	
	@Test
	@Rollback(true)
	public void testCrud(){
		Warhouse warhouse=new Warhouse();
		Integer randId=new Double(100000*Math.random()).intValue();
		warhouse.setId(idGenerator.getUId());
		warhouse.setName("warhouse" + randId);
		warhouse.setCode("warhouse" + randId);
		warhouse.setCreated(new Date());
		warhouse.setCreatedBy(Long.parseLong(randId+""));
		warhouse.setActive(true);
		warhouse.setUpdated(new Date());
		warhouse.setUpdatedBy(Long.parseLong(randId+""));
		warhouse.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		warhouseDao.create(warhouse);
        Assert.assertNotNull(warhouse.getId());
        logger.debug("warhouse1:"+ warhouse.getId());
		//获取一实体
		Warhouse warhouse2=(Warhouse)warhouseDao.get(warhouse.getId());
		Assert.assertNotNull(warhouse2);
		logger.debug("warhouse2:" + warhouse2.toString());
		Integer randId2=new Double(100000*Math.random()).intValue();
		warhouse2.setName("warhouse" + randId2);
		warhouse2.setCode("warhouse" + randId2);
		warhouse2.setCreated(new Date());
		warhouse2.setCreatedBy(Long.parseLong(randId2+""));
		warhouse.setActive(true);
		warhouse2.setUpdated(new Date());
		warhouse2.setUpdatedBy(Long.parseLong(randId2+""));
		warhouse2.setOrgId(Long.parseLong(randId2+""));
		//更新一实体
		warhouseDao.update(warhouse2);
		
		Warhouse warhouse3=warhouseDao.get(warhouse.getId());
		System.out.println("warhouse3:"+warhouse3.toString());
		//删除一实体
		//warhouseDao.remove(warhouse.getId());
	}
	
	
	@Test
	public void testCreate() {
		Warhouse warhouse=new Warhouse();
		Integer randId=new Double(100000*Math.random()).intValue();
		warhouse.setId(idGenerator.getUId());
		warhouse.setName("warhouse" + randId);
		warhouse.setCode("warhouse" + randId);
		warhouse.setCreated(new Date());
		warhouse.setCreatedBy(Long.parseLong(randId+""));
		warhouse.setActive(true);
		warhouse.setUpdated(new Date());
		warhouse.setUpdatedBy(Long.parseLong(randId+""));
		warhouse.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		warhouseDao.create(warhouse);
		
		Warhouse warhouse1 = warhouseDao.get(warhouse.getId());
		
		assertEquals(warhouse.getOrgId(), warhouse1.getOrgId());
        
	}

	@Test
	public void testUpdate() {
		Warhouse warhouse=new Warhouse();
		Integer randId=new Double(100000*Math.random()).intValue();
		warhouse.setId(idGenerator.getUId());
		warhouse.setName("warhouse" + randId);
		warhouse.setCode("warhouse" + randId);
		warhouse.setCreated(new Date());
		warhouse.setCreatedBy(Long.parseLong(randId+""));
		warhouse.setActive(true);
		warhouse.setUpdated(new Date());
		warhouse.setUpdatedBy(Long.parseLong(randId+""));
		warhouse.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		warhouseDao.create(warhouse);
		
		Integer randId2=new Double(100000*Math.random()).intValue();
		warhouse.setName("warhouse" + randId2);
		warhouse.setCode("warhouse" + randId2);
		warhouse.setCreated(new Date());
		warhouse.setCreatedBy(Long.parseLong(randId2+""));
		warhouse.setActive(true);
		warhouse.setUpdated(new Date());
		warhouse.setUpdatedBy(Long.parseLong(randId2+""));
		warhouse.setOrgId(Long.parseLong(randId2+""));
		
		//创建一实体
		warhouseDao.update(warhouse);
		
		Warhouse warhouse2 = warhouseDao.get(warhouse.getId());
		
		assertEquals(warhouse.getOrgId(),warhouse2.getOrgId());
	}

	@Test
	public void testRemove() {
		Warhouse warhouse=new Warhouse();
		Integer randId=new Double(100000*Math.random()).intValue();
		warhouse.setId(idGenerator.getUId());
		warhouse.setName("warhouse" + randId);
		warhouse.setCode("warhouse" + randId);
		warhouse.setCreated(new Date());
		warhouse.setCreatedBy(Long.parseLong(randId+""));
		warhouse.setActive(true);
		warhouse.setUpdated(new Date());
		warhouse.setUpdatedBy(Long.parseLong(randId+""));
		warhouse.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		warhouseDao.create(warhouse);
		
		warhouseDao.remove(warhouse.getId());
		
		Warhouse  warhouse2 = warhouseDao.get(warhouse.getId());
		
		assertNull(warhouse2);
	}

	@Test
	public void testGet() {
		Warhouse warhouse=new Warhouse();
		Integer randId=new Double(100000*Math.random()).intValue();
		warhouse.setId(idGenerator.getUId());
		warhouse.setName("warhouse" + randId);
		warhouse.setCode("warhouse" + randId);
		warhouse.setCreated(new Date());
		warhouse.setCreatedBy(Long.parseLong(randId+""));
		warhouse.setActive(true);
		warhouse.setUpdated(new Date());
		warhouse.setUpdatedBy(Long.parseLong(randId+""));
		warhouse.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		warhouseDao.create(warhouse);
		
		Warhouse warhouse2 = warhouseDao.get(warhouse.getId());
		
		

		assertEquals(warhouse.getCreatedBy(),warhouse2.getCreatedBy());
	}

	@Test
	public void testRemoveByIds() {
		Long[] ids = new Long[2];
		{
		Warhouse warhouse=new Warhouse();
		Integer randId=new Double(100000*Math.random()).intValue();
		warhouse.setId(idGenerator.getUId());
		warhouse.setName("warhouse" + randId);
		warhouse.setCode("warhouse" + randId);
		warhouse.setCreated(new Date());
		warhouse.setCreatedBy(Long.parseLong(randId+""));
		warhouse.setActive(true);
		warhouse.setUpdated(new Date());
		warhouse.setUpdatedBy(Long.parseLong(randId+""));
		warhouse.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		warhouseDao.create(warhouse);
		ids[0]=warhouse.getId();
		}
		
		{
		
		Warhouse warhouse=new Warhouse();
		Integer randId=new Double(100000*Math.random()).intValue();
		warhouse.setId(idGenerator.getUId());
		warhouse.setName("warhouse" + randId);
		warhouse.setCode("warhouse" + randId);
		warhouse.setCreated(new Date());
		warhouse.setCreatedBy(Long.parseLong(randId+""));
		warhouse.setActive(true);
		warhouse.setUpdated(new Date());
		warhouse.setUpdatedBy(Long.parseLong(randId+""));
		warhouse.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		warhouseDao.create(warhouse);
		ids[1]=warhouse.getId();
		}
		
		
		{
			Warhouse warhouse = warhouseDao.get(ids[0]);
			assertNotNull(warhouse);
		}
		
		{
			Warhouse warhouse = warhouseDao.get(ids[1]);
			assertNotNull(warhouse);
		}
		
		warhouseDao.removeByIds(ids);
		
		{
			Warhouse warhouse = warhouseDao.get(ids[0]);
			assertNull(warhouse);
		}
		
		{
			Warhouse warhouse = warhouseDao.get(ids[1]);
			assertNull(warhouse);
		}
	}

	@Test
	public void testGetAll() {
		List<Warhouse> entities = warhouseDao.getAll();
		
		
		Warhouse warhouse=new Warhouse();
		Integer randId=new Double(100000*Math.random()).intValue();
		warhouse.setId(idGenerator.getUId());
		warhouse.setName("warhouse" + randId);
		warhouse.setCode("warhouse" + randId);
		warhouse.setCreated(new Date());
		warhouse.setCreatedBy(Long.parseLong(randId+""));
		warhouse.setActive(true);
		warhouse.setUpdated(new Date());
		warhouse.setUpdatedBy(Long.parseLong(randId+""));
		warhouse.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		warhouseDao.create(warhouse);
		
		List<Warhouse> entities2 = warhouseDao.getAll();
		
		assertEquals(entities2.size(), entities.size()+1);
	}

	@Test
	public void testGetAllByPage() {
		for(int i=0;i<10;i++){
			Warhouse warhouse=new Warhouse();
		Integer randId=new Double(100000*Math.random()).intValue();
		warhouse.setId(idGenerator.getUId());
		warhouse.setName("warhouse" + randId);
		warhouse.setCode("warhouse" + randId);
		warhouse.setCreated(new Date());
		warhouse.setCreatedBy(Long.parseLong(randId+""));
		warhouse.setActive(true);
		warhouse.setUpdated(new Date());
		warhouse.setUpdatedBy(Long.parseLong(randId+""));
		warhouse.setOrgId(Long.parseLong(randId+""));
		
		//创建一实体
		warhouseDao.create(warhouse);
		}
		Page page = new DefaultPage(1, 5);
		List<Warhouse> entities1 = warhouseDao.getAllByPage(page);
		assertEquals(entities1.size(), 5);
		Page page2 = new DefaultPage(2, 5);
		List<Warhouse> entities2 = warhouseDao.getAllByPage(page2);
		assertEquals(entities2.size(), 5);
	}
	
}
