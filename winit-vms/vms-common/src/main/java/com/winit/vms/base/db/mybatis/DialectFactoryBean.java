package com.winit.vms.base.db.mybatis;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.FactoryBean;

import com.winit.vms.base.db.mybatis.dialect.DB2Dialect;
import com.winit.vms.base.db.mybatis.dialect.H2Dialect;
import com.winit.vms.base.db.mybatis.dialect.MySQLDialect;
import com.winit.vms.base.db.mybatis.dialect.OracleDialect;
import com.winit.vms.base.db.mybatis.dialect.SQLServer2005Dialect;



/**
 * 方言FactoryBean，通过统一的接口取得不同数据库的分页Sql语句。
 * 
 */
public class DialectFactoryBean implements FactoryBean<Dialect> {
	private static String EXCEPTION_MSG = "没有设置合适的数据库类型";

	/**
	 * 方言
	 */
	private Dialect dialect;

	/**
	 * 数据类型
	 */
	private String dbType = Dialect.DB_MYSQL;

	/**
	 * 设置数据库类型
	 * 
	 * @param dbType
	 */
	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	@Override
	public Dialect getObject() throws Exception {
		if (StringUtils.isEmpty(dbType))
			throw new Exception(EXCEPTION_MSG);
		if (dbType.equals(Dialect.DB_ORACLE)) {
			dialect = new OracleDialect();
		} else if (dbType.equals(Dialect.DB_MYSQL)) {
			dialect = new MySQLDialect();
		} else if (dbType.equals(Dialect.DB_SQLSERVER)) {
			dialect = new SQLServer2005Dialect();
		} else if (dbType.equals(Dialect.DB_DB2)) {
			dialect = new DB2Dialect();
		} else if (dbType.equals(Dialect.DB_H2)) {
			dialect = new H2Dialect();
		} else if (dbType.equals(Dialect.DB_DM)) {
			// dialect = new DmDialect();
		} else {
			throw new Exception(EXCEPTION_MSG);
		}
		return dialect;
	}

	@Override
	public Class<?> getObjectType() {
		return Dialect.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
