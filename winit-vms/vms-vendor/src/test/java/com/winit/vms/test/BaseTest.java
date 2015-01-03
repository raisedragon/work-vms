package com.winit.vms.test;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.winit.vms.base.db.api.IdGenerator;


@ContextConfiguration({"classpath:conf/applicationContext.xml"})
@ActiveProfiles({"test"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class BaseTest {
	protected Log logger=LogFactory.getLog(BaseTest.class);
	
    @Resource
    protected IdGenerator idGenerator;
}
  