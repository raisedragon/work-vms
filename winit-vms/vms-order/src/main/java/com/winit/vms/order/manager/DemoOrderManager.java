package com.winit.vms.order.manager;

import java.util.List;
import java.util.Map;

import com.winit.vms.order.entity.DemoOrderEntity;
 

/**
 * Demo订单业务接口 TODO wen.bai: Change to the actual description of this class
 * 
 * @version Revision History
 * 
 *          <pre>
 * Author     Version       Date        Changes
 * wen.bai    1.0           2014-10-21     Created
 * 
 * </pre>
 * @since 1.
 */
public interface DemoOrderManager {

	/**
	 * 
	 * TODO Add comments here.
	 * @param orderNo
	 * @return
	 */
	public DemoOrderEntity getDemoOrderByNo(String orderNo);
	
}
