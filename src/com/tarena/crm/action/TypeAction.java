package com.tarena.crm.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarena.crm.entity.Type;
import com.tarena.crm.service.TypeService;
import com.tarena.crm.service.impl.TypeServiceImpl;
import com.tarena.db.Page;
import com.tarena.db.PageUtil;
import com.tarena.minispringmvc.servlet.Action;
import com.tarena.minispringmvc.servlet.EntityUtil;
import com.tarena.minispringmvc.servlet.RequestPath;

@Action
public class TypeAction {

	@RequestPath(path = "/page/customer/typeList.do")
	public void list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		response.setContentType("text/html;charset=utf-8");
		List<Type> types = null;
		
		String current = request.getParameter("currentPage");
		if(current == null){
			current = "0";
		}
		//搜索路径转发
		if (request.getAttribute("types") != null) {
			types = (List<Type>) request.getAttribute("types");
		}else{
			TypeService typeService = new TypeServiceImpl();
			int totalCount = typeService.findCount();
			int currentPage = Integer.parseInt(current);
			Page page = PageUtil.createPage(5, totalCount, currentPage);
			types = typeService.typeList(page);
			request.setAttribute("page", page);
		}
		request.setAttribute("types", types);
		request.getRequestDispatcher("/page/customer/typeList.jsp").forward(
				request, response);
		return;

	}

	@RequestPath(path = "/page/customer/typeDel.do")
	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("id");
		TypeService typeService = new TypeServiceImpl();
		typeService.typeDel(id);
		request.getRequestDispatcher("/page/customer/typeList.do").forward(
				request, response);
		return;
	}

	@RequestPath(path = "/page/customer/typeAdd.do")
	public void add(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		Type type = (Type) EntityUtil.getObject(request, Type.class, "type");

		TypeService typeService = new TypeServiceImpl();
		typeService.typeAdd(type);

		response.getWriter().println("/crm/page/customer/typeList.do");
		return ;

	}

	@RequestPath(path = "/page/customer/typeSearch.do")
	public void search(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String type = request.getParameter("type");

		TypeService typeService = new TypeServiceImpl();
		List<Type> types = typeService.typeSearch(type);

		request.setAttribute("types", types);
		request.getRequestDispatcher("/page/customer/typeList.do").forward(
				request, response);
		return;

	}
}
