package com.winit.vms.base.api.db;

import java.util.List;

import com.winit.vms.base.api.query.FieldSort;

/**
 * 方言接口
 * 
 */
public interface IDialect {

	public static String DB_ORACLE = "oracle";
	public static String DB_MYSQL = "mysql";
	public static String DB_SQLSERVER = "sqlserver";
	public static String DB_DB2 = "db2";
	public static String DB_DERBY = "derby";
	public static String DB_HBASE = "hbase";
	public static String DB_HIVE = "hive";
	public static String DB_H2 = "h2";
	public static String DB_JTDS = "jtds";
	public static String DB_MOCK = "mock";
	public static String DB_HSQL = "hsql";
	public static String DB_POSTGRESQL = "postgresql";
	public static String DB_SYBASE = "sybase";
	public static String DB_SQLITE = "sqlite";
	public static String DB_MCKOI = "mckoi";
	public static String DB_CLOUDSCAPE = "cloudscape";
	public static String DB_INFORMIX = "informix";
	public static String DB_TIMESTEN = "timesten";
	public static String DB_AS400 = "as400";
	public static String DB_SAPDB = "sapdb";
	public static String DB_JSQLCONNECT = "JSQLConnect";
	public static String DB_JTURBO = "JTurbo";
	public static String DB_FIREBIRDSQL = "firebirdsql";
	public static String DB_INTERBASE = "interbase";
	public static String DB_POINTBASE = "pointbase";
	public static String DB_EDBC = "edbc";
	public static String DB_MIMER = "mimer";
	public static String DB_DM = "dm";
	public static String DB_INGRES = "ingres";
	
	
	/**
	 * 支持limit
	 * 
	 * @return
	 */
	public boolean supportsLimit();

	/**
	 * 支持limit偏移
	 * 
	 * @return
	 */
	public boolean supportsLimitOffset();

	/**
	 * 
	 * 将sql变成分页sql语句,直接使用offset,limit的值作为占位符.</br>
	 * 
	 * @param sql
	 *            sql语句
	 * @param offset
	 *            记录编号
	 * @param limit
	 *            页大小
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getLimitString(String sql, int offset, int limit);

	/**
	 * 将sql变成分页sql语句,提供将offset及limit使用占位符(placeholder)替换.
	 * 
	 * <pre>
	 * 如mysql
	 * dialect.getLimitString("select * from user", 12, ":offset",0,":limit") 将返回
	 * select * from user limit :offset,:limit
	 * </pre>
	 * 
	 * @return 包含占位符的分页sql
	 */
	public String getLimitString(String sql, int offset,
			String offsetPlaceholder, int limit, String limitPlaceholder);

	/**
	 * 将sql转换为总记录数SQL
	 * 
	 * @param sql
	 *            SQL语句
	 * @return 总记录数的sql
	 */
	public String getCountString(String sql);

	/**
	 * 将sql转换为带排序的SQL
	 * 
	 * @param sql
	 *            SQL语句
	 * @param orders
	 *            排序对象
	 * @return String
	 */
	public String getSortString(String sql, List<FieldSort> orders);

}
