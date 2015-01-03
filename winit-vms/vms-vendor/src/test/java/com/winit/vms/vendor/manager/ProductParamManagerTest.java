package com.winit.vms.vendor.manager;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.winit.vms.vendor.entity.ProductParam;
import com.winit.vms.vendor.manager.ProductParamManager;
import com.winit.vms.test.BaseTest;

public class ProductParamManagerTest extends BaseTest{
	@Resource
	ProductParamManager productParamManager;
	
	@Test
	@Rollback(true)
	public void testCreate(){
		ProductParam productParam=new ProductParam();
		Integer randId=new Double(100000*Math.random()).intValue();
		productParam.setId(idGenerator.getUId());
		productParam.setName("productParam" + randId);
		productParam.setValue("productParam" + randId);
		productParam.setProductId(Long.parseLong(randId+""));
		productParam.setCreated(new Date());
		productParam.setCreatedBy(Long.parseLong(randId+""));
		productParam.setActive(true);
		productParam.setUpdated(new Date());
		productParam.setUpdatedBy(Long.parseLong(randId+""));
		productParam.setOrgId(Long.parseLong(randId+""));
		//创建一实体
		productParamManager.create(productParam);
	}
}
