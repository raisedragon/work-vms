package com.winit.vms.system.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.displaytag.properties.SortOrderEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.winit.vms.base.api.query.Direction;
import com.winit.vms.base.api.query.FieldSort;
import com.winit.vms.base.api.query.Page;
import com.winit.vms.base.db.mybatis.domain.DefaultFieldSort;
import com.winit.vms.base.db.mybatis.domain.DefaultPage;
import com.winit.vms.base.db.mybatis.domain.PageList;
import com.winit.vms.system.entity.Country;
import com.winit.vms.system.manager.CountryManager;
import com.winit.vms.web.BaseController;
import com.winit.vms.web.displaytag.ExtendedPaginatedList;
import com.winit.vms.web.displaytag.PaginateListFactory;

@Controller
@RequestMapping("country")
public class CountryController extends BaseController {

	@Resource
	private CountryManager countryManager;

	@RequestMapping("list")
	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ExtendedPaginatedList paginatedList = getAllPagination(request, countryManager);
		
		ModelAndView mv = getAutoView(request);
		mv.addObject("paginatedList", paginatedList);
		return mv;
	}
}
