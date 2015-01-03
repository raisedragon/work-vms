package com.winit.vms.order.controller;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.common.json.JSON;
import com.winit.vms.order.entity.DemoOrderEntity;
import com.winit.vms.order.manager.DemoOrderManager;

@Controller
@RequestMapping("/demoorder")
public class DemoOrderController {

	@Resource
	private DemoOrderManager demoOrderManager;
	
	@RequestMapping(value = "/getDemoOrderByNo", method = RequestMethod.GET)
	public @ResponseBody String getDemoOrderByNo(@RequestParam(value="orderNo",required=false) String orderNo) throws IOException{
		DemoOrderEntity order=demoOrderManager.getDemoOrderByNo(orderNo);
		return JSON.json(order);
	}
}
