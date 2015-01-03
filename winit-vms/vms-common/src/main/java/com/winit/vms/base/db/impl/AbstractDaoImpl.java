package com.winit.vms.base.db.impl;


import java.io.Serializable;

import javax.annotation.Resource;

import com.winit.vms.base.db.api.Dao;
import com.winit.vms.base.db.api.IdGenerator;

/**
 *
 * @author longsheng.wang
 */
public abstract class AbstractDaoImpl<PK extends Serializable,T extends Serializable> implements Dao<PK,T>{
	  @Resource
	  protected IdGenerator idGenerator;
}
