package com.winit.vms.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.winit.vms.order.entity.DemoOrderEntity;
import com.winit.vms.order.manager.DemoOrderManager;
 
 
/**
 * 
 * TODO wen.bai: Change to the actual description of this class
 * 
 * @version Revision History
 * 
 *          <pre>
 * Author     Version       Date        Changes
 * wen.bai    1.0           2014-10-23     Created
 * 
 * </pre>
 * @since 1.
 */
@DirtiesContext
@ActiveProfiles("test")
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class DemoOrderServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Resource
	private DemoOrderManager demoOrderManager;
 
	@Resource
	protected DataSource dataSource;

	@Test
	@Rollback(true)
	public void getDemoOrder() throws Exception {
		DemoOrderEntity order=new DemoOrderEntity();
		
		order=demoOrderManager.getDemoOrderByNo("201411100805222676");
		System.out.println(order.getOperator());
	}
}
