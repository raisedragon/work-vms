package com.winit.vms.system.manager;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.winit.vms.system.entity.Warhouse;
import com.winit.vms.system.manager.WarhouseManager;
import com.winit.vms.test.BaseTest;

public class WarhouseManagerTest extends BaseTest{
	@Resource
	WarhouseManager warhouseManager;
	
	@Test
	@Rollback(true)
	public void testCreate(){
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
		warhouseManager.create(warhouse);
	}
}
