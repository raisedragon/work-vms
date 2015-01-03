package com.winit.vms.system.manager;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.winit.vms.system.entity.Country;
import com.winit.vms.system.manager.CountryManager;
import com.winit.vms.test.BaseTest;

public class CountryManagerTest extends BaseTest{
	@Resource
	CountryManager countryManager;
	
	@Test
	@Rollback(true)
	public void testCreate(){
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
		countryManager.create(country);
	}
}
