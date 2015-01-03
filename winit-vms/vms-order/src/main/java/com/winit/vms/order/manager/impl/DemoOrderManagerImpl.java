package com.winit.vms.order.manager.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.winit.vms.order.dao.DemoOrderDao;
import com.winit.vms.order.entity.DemoOrderEntity;
import com.winit.vms.order.manager.DemoOrderManager;
 
@Component("demoOrderManager")
public class DemoOrderManagerImpl implements DemoOrderManager {

	@Resource
	private DemoOrderDao demoOrderDao;

	@Override
	public DemoOrderEntity getDemoOrderByNo(String orderNo) {
		//DemoOrderEntity order=new DemoOrderEntity();
		DemoOrderEntity order=demoOrderDao.getDemoOrderByNO(orderNo);
		return order;
	}

	 
}
