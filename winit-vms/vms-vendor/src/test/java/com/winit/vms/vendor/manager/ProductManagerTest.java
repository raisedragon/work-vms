package com.winit.vms.vendor.manager;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.winit.vms.vendor.entity.Product;
import com.winit.vms.vendor.manager.ProductManager;
import com.winit.vms.test.BaseTest;

public class ProductManagerTest extends BaseTest{
	@Resource
	ProductManager productManager;
	
	@Test
	@Rollback(true)
	public void testCreate(){
		Product product=new Product();
		Integer randId=new Double(100000*Math.random()).intValue();
		product.setId(idGenerator.getUId());
		product.setName("product" + randId);
		product.setCode("product" + randId);
		product.setVenderId(Long.parseLong(randId+""));
		product.setCreated(new Date());
		product.setCreatedBy(Long.parseLong(randId+""));
		product.setActive(true);
		product.setUpdated(new Date());
		product.setUpdatedBy(Long.parseLong(randId+""));
		product.setOrgId(Long.parseLong(randId+""));
		//创建一实体
		productManager.create(product);
	}
}
