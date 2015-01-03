package com.winit.vms.base.db.api;

import java.io.Serializable;
import java.util.List;

import com.winit.vms.base.api.query.Page;

/**
 * 数据库访问基础类
 */
public interface Dao<PK extends Serializable,T> {
    /**
     * 创建实体对象
     * @param entity
     * @return 
     */
    public void create(T entity);
    /**
     * 更新实体对象
     * @param entity
     * @return 
     */
    public void update(T entity);
    /**
     * 按实体ID删除对象
     * @param entityId 
     */
    public void remove(PK entityId);    
    
    /**
     * 按实体ID获取实体
     * @param entityId 
     */
    public T get(PK entityId);    
//    /**
//     * 按实体业务主键获取实体
//     * @param entityKey 
//     */
//    public T getByEntityKey(String entityKey);
    /**
     * 按实体IDs删除记录
     * @param ids 
     */
    public void removeByIds(PK ...ids);
 
    /**
     * 取得所有查询对象
     * @return 
     */
    public List<T> getAll();
    /**
     * 取得所有查询对象并分页查询
     * @param page
     * @return 
     */
    public List<T> getAllByPage(Page page);
}
