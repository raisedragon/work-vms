package com.winit.vms.base.manager.impl;

import java.io.Serializable;
import java.util.List;

import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.api.Dao;
import com.winit.vms.base.manager.api.Manager;
/**
 * <pre> 
 * 描述：抽象实体业务管理类实现
 * </pre>
 */
public abstract class AbstractManagerImpl<PK extends Serializable, T extends Serializable> implements Manager<PK, T>{
	//获取基础类

    protected abstract Dao<PK, T > getDao();
    /*
     * (non-Javadoc)
     * @see com.hotent.base.manager.api.Manager#create(java.lang.Object)
     */
    public void create(T entity) {
        getDao().create(entity);
    }
    /*
     * (non-Javadoc)
     * @see com.hotent.base.manager.api.Manager#update(java.lang.Object)
     */
    public void update(T entity) {
        getDao().update(entity);
    }
    /*
     * (non-Javadoc)
     * @see com.hotent.base.manager.api.Manager#remove(java.io.Serializable)
     */
    public void remove(PK entityId) {
        getDao().remove(entityId);
    }
   /*
    * (non-Javadoc)
    * @see com.hotent.base.manager.api.Manager#get(java.io.Serializable)
    */
    public T get(PK entityId) {
        return getDao().get(entityId);
    }
    /*
     * (non-Javadoc)
     * @see com.hotent.base.manager.api.Manager#removeByIds(PK[])
     */
    public void removeByIds(PK... ids) {
        if(ids!=null){
            for(PK pk:ids){
                remove(pk);
            }
        }
    }

    /*
     * (non-Javadoc)
     * @see com.hotent.base.manager.api.Manager#getAll()
     */
    public List<T> getAll() {
        return getDao().getAll();
    }
    /*
     * (non-Javadoc)
     * @see com.hotent.base.manager.api.Manager#getAllByPage(com.hotent.base.api.Page)
     */
    public List<T> getAllByPage(Page page) {
        return getDao().getAllByPage(page);
    }
}
