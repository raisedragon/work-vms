package com.winit.vms.vendor.manager;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.winit.vms.vendor.entity.Vendor;
import com.winit.vms.vendor.manager.VendorManager;
import com.winit.vms.test.BaseTest;

public class VendorManagerTest extends BaseTest{
	@Resource
	VendorManager vendorManager;
	
	@Test
	@Rollback(true)
	public void testCreate(){
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
		vendorManager.create(vendor);
	}
}
