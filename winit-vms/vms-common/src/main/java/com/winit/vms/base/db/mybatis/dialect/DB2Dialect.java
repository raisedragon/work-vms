package com.winit.vms.base.db.mybatis.dialect;

import com.winit.vms.base.db.mybatis.Dialect;

/**
 * db2的方言
 * <pre> 
 * 构建组：x5-base-db
 * 作者：ray
 * 邮箱:zhangyg@jee-soft.cn
 * 日期:2014-1-3-下午4:00:29
 * 版权：广州宏天软件有限公司版权所有
 * </pre>
 */
public class DB2Dialect extends Dialect{

	public boolean supportsLimit() {
		return true;
	}
	
	public boolean supportsLimitOffset(){
		return true;
	}
	
	private static String getRowNumber(String sql) {
		StringBuffer rownumber = new StringBuffer(50)
			.append("rownumber() over(");

		int orderByIndex = sql.toLowerCase().indexOf("order by");

		if ( orderByIndex>0 && !hasDistinct(sql) ) {
			rownumber.append( sql.substring(orderByIndex) );
		}

		rownumber.append(") as rownumber_,");

		return rownumber.toString();
	}
	
	private static boolean hasDistinct(String sql) {
		return sql.toLowerCase().indexOf("select distinct")>=0;
	}

	public String getLimitString(String sql, int offset,String offsetPlaceholder, int limit, String limitPlaceholder) {
		int startOfSelect = sql.toLowerCase().indexOf("select");

		StringBuffer pagingSelect = new StringBuffer( sql.length()+100 )
					.append( sql.substring(0, startOfSelect) ) //add the comment
					.append("select * from ( select ") //nest the main query in an outer select
					.append( getRowNumber(sql) ); //add the rownnumber bit into the outer query select list

		if ( hasDistinct(sql) ) {
			pagingSelect.append(" row_.* from ( ") //add another (inner) nested select
				.append( sql.substring(startOfSelect) ) //add the main query
				.append(" ) as row_"); //close off the inner nested select
		}
		else {
			pagingSelect.append( sql.substring( startOfSelect + 6 ) ); //add the main query
		}

		pagingSelect.append(" ) as temp_ where rownumber_ ");

		//add the restriction to the outer select
		if (offset > 0) {
//			int end = offset + limit;
			String endString = offsetPlaceholder+"+"+limitPlaceholder;
			pagingSelect.append("between "+offsetPlaceholder+"+1 and "+endString);
		}
		else {
			pagingSelect.append("<= "+limitPlaceholder);
		}

		return pagingSelect.toString();
	}
}
