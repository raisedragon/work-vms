package com.winit.vms.base.db.mybatis.support;


import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

/**
 * <pre>
 * 对象功能:java中的boolean和jdbc中的int之间转
 */
public class BooleanTypeHandler implements TypeHandler {

	/* (non-Javadoc)
	 * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.ResultSet, java.lang.String)
	 */
	@Override
	public Object getResult(ResultSet arg0, String arg1) throws SQLException {
		String str = arg0.getString(arg1);
		Boolean rt = Boolean.FALSE;
		if (str.equalsIgnoreCase("Y")){
			rt = Boolean.TRUE;
		}
		return rt; 
	}

	/* (non-Javadoc)
	 * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.CallableStatement, int)
	 */
	@Override
	public Object getResult(CallableStatement arg0, int arg1)
			throws SQLException {
		Boolean b = arg0.getBoolean(arg1);
		return b == true ? "Y" : "N";
	}

	/* (non-Javadoc)
	 * @see org.apache.ibatis.type.TypeHandler#setParameter(java.sql.PreparedStatement, int, java.lang.Object, org.apache.ibatis.type.JdbcType)
	 */
	@Override
	public void setParameter(PreparedStatement arg0, int arg1, Object arg2,
			JdbcType arg3) throws SQLException {
		Boolean b = (Boolean) arg2;
		String value = (Boolean) b == true ? "Y" : "N";
		arg0.setString(arg1, value);
	}

	@Override
	public Object getResult(ResultSet arg0, int arg1) throws SQLException {
		String str = arg0.getString(arg1);
		Boolean rt = Boolean.FALSE;
		if (str.equalsIgnoreCase("Y")){
			rt = Boolean.TRUE;
		}
		return rt; 
	}
}
