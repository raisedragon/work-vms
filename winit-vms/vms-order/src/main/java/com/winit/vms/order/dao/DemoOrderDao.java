package com.winit.vms.order.dao;

import java.io.Serializable;

import com.winit.common.orm.mybatis.MyBatisPageRepo;
import com.winit.common.orm.mybatis.MyBatisRepo;
import com.winit.vms.order.entity.DemoOrderEntity;


@MyBatisRepo
public interface DemoOrderDao extends MyBatisPageRepo<DemoOrderEntity, Serializable> {
 
	 
	/**
	 * 
	 * TODO Add comments here.
	 * @return
	 */
	public DemoOrderEntity getDemoOrderByNO(String orderNo);
}
