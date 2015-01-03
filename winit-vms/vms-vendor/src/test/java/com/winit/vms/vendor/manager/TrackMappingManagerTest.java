package com.winit.vms.vendor.manager;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.winit.vms.vendor.entity.TrackMapping;
import com.winit.vms.vendor.manager.TrackMappingManager;
import com.winit.vms.test.BaseTest;

public class TrackMappingManagerTest extends BaseTest{
	@Resource
	TrackMappingManager trackMappingManager;
	
	@Test
	@Rollback(true)
	public void testCreate(){
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
		trackMappingManager.create(trackMapping);
	}
}
