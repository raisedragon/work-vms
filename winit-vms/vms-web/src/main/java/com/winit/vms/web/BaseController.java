package com.winit.vms.web;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.displaytag.properties.SortOrderEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

import com.winit.vms.base.api.query.Direction;
import com.winit.vms.base.api.query.FieldSort;
import com.winit.vms.base.db.mybatis.domain.DefaultFieldSort;
import com.winit.vms.base.db.mybatis.domain.DefaultPage;
import com.winit.vms.base.db.mybatis.domain.PageList;
import com.winit.vms.base.manager.api.Manager;
import com.winit.vms.system.entity.Country;
import com.winit.vms.web.displaytag.ExtendedPaginatedList;
import com.winit.vms.web.displaytag.PaginateListFactory;


public class BaseController {
	
	protected Logger logger = LoggerFactory.getLogger(BaseController.class);

	/**
	 * 通过Request的URL对应转成对应的JSP文件展示
	 * 
	 * @return
	 * @throws Exception
	 */
	public ModelAndView getAutoView(HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		String servletPath= request.getServletPath();
		String lastUri = servletPath;
		String viewName = lastUri.replaceAll("\\.\\S+$", "");
		mv.setViewName(viewName);
		return mv;

	}
	
	
	public <T> ExtendedPaginatedList getAllPagination(HttpServletRequest request,Manager<? extends Serializable, T> manager){
		ExtendedPaginatedList paginatedList = PaginateListFactory
				.getPaginatedListFromRequest(request);
		paginatedList.getSortCriterion();
		DefaultPage page = getPage(paginatedList);

		PageList<T> countryList = (PageList<T>) manager.getAllByPage(page);
		
		paginatedList.setTotalNumberOfRows(countryList.getPageResult().getTotalCount());
		paginatedList.setList(countryList);

		return paginatedList;
	}
	
	

	private DefaultPage getPage(ExtendedPaginatedList paginatedList) {

		FieldSort fieldSort = null;
		if (paginatedList.getSortDirection().equals(SortOrderEnum.ASCENDING)) {
			fieldSort = new DefaultFieldSort(paginatedList.getSortCriterion(),
					Direction.ASC);
		}
		if (paginatedList.getSortDirection().equals(SortOrderEnum.DESCENDING)) {
			fieldSort = new DefaultFieldSort(paginatedList.getSortCriterion(),
					Direction.DESC);
		}
		DefaultPage page = new DefaultPage(paginatedList.getPageNumber(),
				paginatedList.getPageSize(), fieldSort);
		return page;
	}
	
}
