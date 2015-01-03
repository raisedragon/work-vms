package com.winit.vms.vendor.manager;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.winit.vms.vendor.entity.ProductConstraint;
import com.winit.vms.vendor.manager.ProductConstraintManager;
import com.winit.vms.test.BaseTest;

public class ProductConstraintManagerTest extends BaseTest{
	@Resource
	ProductConstraintManager productConstraintManager;
	
	@Test
	@Rollback(true)
	public void testCreate(){
		ProductConstraint productConstraint=new ProductConstraint();
		Integer randId=new Double(100000*Math.random()).intValue();
		productConstraint.setId(idGenerator.getUId());
		productConstraint.setName("productConstraint" + randId);
		productConstraint.setKey("productConstraint" + randId);
		productConstraint.setMinLength(randId);
		productConstraint.setMaxLength(randId);
		productConstraint.setProductId(Long.parseLong(randId+""));
		productConstraint.setCreated(new Date());
		productConstraint.setCreatedBy(Long.parseLong(randId+""));
		productConstraint.setActive(true);
		productConstraint.setUpdated(new Date());
		productConstraint.setUpdatedBy(Long.parseLong(randId+""));
		productConstraint.setOrgId(Long.parseLong(randId+""));
		//创建一实体
		productConstraintManager.create(productConstraint);
	}
}
