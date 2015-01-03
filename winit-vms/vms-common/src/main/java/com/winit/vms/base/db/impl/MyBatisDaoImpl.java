package com.winit.vms.base.db.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;

import com.winit.vms.base.api.entity.BaseModel;
import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.mybatis.domain.DefaultPage;
import com.winit.vms.base.entity.AbstractModel;

/**
 * 对象功能:MyBatis 数据库访问操作基础类
 * 开发人员:longsheng.wang
 */
public abstract class MyBatisDaoImpl<PK extends Serializable,T extends Serializable> extends AbstractDaoImpl<PK,T>{

    @Resource
    protected SqlSessionTemplate sqlSessionTemplate;
    
    /**
     * 按ID获取单一记录
     */
    protected final static String OP_GET=".get";
    /**
     * 按业务主键获取单一记录
     */
    protected final static String OP_GET_BY_ENTITY_KEY=".getByEntityKey";    
    /**
     * 按ID删除记录
     */
    protected final static String OP_DEL=".remove";
    /**
     * 按ID更新记录
     */
    protected final static String OP_UPD=".update";
    /**
     * 添加记录
     */
    protected final static String OP_CREATE=".create";
    /**
     * 查询记录列表
     */
    protected final static String OP_QUERY=".query";
    
    /**
     * 返回当前实体的命名空间字符串名称
     */
    public abstract String getNamespace();
    /*
     * (non-Javadoc)
     * @see com.hotent.base.db.api.Dao#create(java.lang.Object)
     */
    public void create(T entity) {
        if(entity instanceof AbstractModel){
        	@SuppressWarnings("unchecked")
			AbstractModel<Long> model = (AbstractModel<Long>)entity;
            if(model.getId()==null){
                model.setId(idGenerator.getUId());
            }
            if(model.getCreated()==null){
            	model.setCreated(new java.util.Date());
            }
        }
        sqlSessionTemplate.insert(getNamespace() + OP_CREATE, entity);
    }
 
    @Override
    public void update(T entity) {
        if(entity instanceof BaseModel){
            BaseModel model = (BaseModel)entity;
            model.setUpdated(new java.util.Date());
        }        
        sqlSessionTemplate.update(getNamespace() + OP_UPD, entity);
    }
   
    @Override
    public void remove(PK entityId) {
         sqlSessionTemplate.delete(getNamespace() + OP_DEL, entityId);
    }
    
    @Override
    public T get(PK entityId) {
        @SuppressWarnings("unchecked")
		T selectOne = (T)sqlSessionTemplate.selectOne(getNamespace() + OP_GET,entityId);
		return selectOne;
    }    
    
    @Override
    public void removeByIds(PK... ids) {
        if(ids!=null){
            for(PK pk:ids){
                remove(pk);
            }
        }
    }
    @Override
    public List<T> getAll() {
        return sqlSessionTemplate.selectList(getNamespace() + OP_QUERY, null);
    }
    
    @Override
    public List<T> getAllByPage(Page page){
    	DefaultPage p=( DefaultPage)page;
        return sqlSessionTemplate.selectList(getNamespace() + OP_QUERY, null,p);
    }
    
    /**
     * 根据在Map配置文件中的Sql Key及参数获取唯一实体
     * @param sqlKey Mapping文件的sql id
     * @param params 参数集合
     * @return 有唯一值则返回一个实体，无值返回null，结果大于1，则抛错。
     */
    public T getUnique(String sqlKey,Map<String,Object> params){
    	return (T) sqlSessionTemplate.selectOne(sqlKey, params);
    	
    }    
    /**
     * 根据在Map配置文件中的Sql Key及参数获取唯一实体
     * @param sqlKey Mapping文件的sql id
     * @param param 参数
     * @return 有唯一值则返回一个实体，无值返回null，结果大于1，则抛错。
     */
    public T getUnique(String sqlKey,Object params){
    	return (T) sqlSessionTemplate.selectOne(sqlKey, params);
    	
    }
    
	/**
	 * 返回单条数据，如 select count(*) from table_a 
	 * @param sqlKey
	 * @param params
	 * @return
	 */
	public Object getOne(String sqlKey,Object params)
	{
		return sqlSessionTemplate.selectOne(getNamespace() + "." + sqlKey, params);
	}
    
    /**
     * 根据在Map配置文件中的Sql Key及参数获取实列表
     * @param sqlKey
     * @param params
     * @return
     */
    public List<T> getByKey(String sqlKey,Map<String,Object> params){
    	return sqlSessionTemplate.selectList(getNamespace() + "." + sqlKey , params);
    }
    /**
     * 根据在Map配置文件中的Sql Key及参数分页获取实列表
     * @param sqlKey
     * @param params
     * @param page
     * @return
     */
    public List<T> getByKey(String sqlKey,Map<String,Object> params,Page page){
    	return sqlSessionTemplate.selectList(getNamespace() + "." + sqlKey , params,new RowBounds(page.getStartIndex(), page.getPageSize()));
    }
    
    
    /**
     * 根据在Map配置文件中的Sql Key及参数获取实列表
     * @param sqlKey
     * @param page
     * @return
     */
    public List<T> getByKey(String sqlKey,Object param){
    	return sqlSessionTemplate.selectList(getNamespace() + "." + sqlKey , param);
    }
    
    
    /**
     * 根据在Map配置文件中的Sql Key及参数分页获取实列表
     * @param sqlKey
     * @param param
     * @param page
     * @return
     */
    public List<T> getByKey(String sqlKey,Object param,Page page){
    	return sqlSessionTemplate.selectList(getNamespace() + "." + sqlKey , param,new RowBounds(page.getStartIndex(), page.getPageSize()));
    }
    
    /**
     * 根据在Map配置文件中的Sql Key及参数更新数据
     * @param sqlKey
     * @param params
     */
    public void updateByKey(String sqlKey,Map<String,Object> params){
    	sqlSessionTemplate.update(getNamespace() + "." + sqlKey, params);
    	
    }
    
    /**
     * 根据在Map配置文件中的Sql Key及参数更新数据
     * @param sqlKey
     * @param params
     */
    public void updateByKey(String sqlKey,Object params){
    	sqlSessionTemplate.update(getNamespace() + "." + sqlKey, params);
    	
    }
    
    /**
     * 根据在Map配置文件中的Sql Key更新数据
     * @param sqlKey
     */
    public void updateByKey(String sqlKey){
    	sqlSessionTemplate.update(getNamespace() + "." + sqlKey);
    }
    /**
     * 根据在Map配置文件中的Sql Key及参数删除数据
     * @param sqlKey
     * @param params
     */
    public void deleteByKey(String sqlKey,Map<String,Object> params){
    	sqlSessionTemplate.delete(getNamespace() + "." + sqlKey, params);
    }
    
    /**
     * 根据在Map配置文件中的Sql Key及参数删除数据
     * @param sqlKey
     * @param params
     */
    public void deleteByKey(String sqlKey,Object params){
    	sqlSessionTemplate.delete(getNamespace() + "." + sqlKey, params);
    }
    
    /**
     * 根据在Map配置文件中的Sql Key删除数据
     * @param sqlKey
     */
    public void deleteByKey(String sqlKey){
    	sqlSessionTemplate.delete(getNamespace() + "." + sqlKey);
    }
    protected Map<String,Object> buildMap(String paramName,Object paramValue){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(paramName, paramValue);
        return map;
    }
    
}
