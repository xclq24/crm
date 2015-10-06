package com.tarena.crm.action;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarena.crm.entity.Care;
import com.tarena.crm.entity.Customer;
import com.tarena.crm.service.CareService;
import com.tarena.crm.service.CustomerService;
import com.tarena.crm.service.impl.CareServiceImpl;
import com.tarena.crm.service.impl.CustomerServiceImpl;
import com.tarena.minispringmvc.servlet.Action;
import com.tarena.minispringmvc.servlet.EntityUtil;
import com.tarena.minispringmvc.servlet.RequestPath;

@Action
public class CareAction {
	@RequestPath(path = "/page/customer/careList.do")
	public void list(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/html;charset=utf-8");
		List<Care> cares = null;

		// 搜索路径转发
		if (request.getAttribute("cares") != null) {
			cares = (List<Care>) request.getAttribute("cares");
		} else {

			CareService careService = new CareServiceImpl();
			cares = careService.careList();
		}
		request.setAttribute("cares", cares);
		request.getRequestDispatcher("/page/customer/careList.jsp").forward(
				request, response);
	}

	// 删除关怀信息
	@RequestPath(path = "/page/customer/careDel.do")
	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("id");
		CareService careService = new CareServiceImpl();

		careService.careDel(id);
		request.getRequestDispatcher("/page/customer/careList.do").forward(
				request, response);
		return;

	}

	// 关怀信息搜索
	@RequestPath(path = "/page/customer/careSearch.do")
	public void search(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");

		CareService careService = new CareServiceImpl();
		List<Care> cares = careService.careSearch(name);

		request.setAttribute("cares", cares);
		request.getRequestDispatcher("/page/customer/careList.do").forward(
				request, response);
		return;

	}

	// 关怀信息编辑
	@RequestPath(path = "/page/customer/careEdit1.do")
	public void edit1(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("id");
		//取得编辑客户信息
		CareService careService = new CareServiceImpl();
		Care care = careService.careSearchById(id);
		// 获得所有客户
		CustomerService customerService = new CustomerServiceImpl();
		List<Customer> customers = customerService.customerList();
		
		request.setAttribute("care", care);
		request.setAttribute("customers", customers);
		
		request.getRequestDispatcher("/page/customer/careEdit.jsp").forward(
				request, response);
		return;

	}
	
	// 编辑后
	@RequestPath(path = "/page/customer/careEdit2.do")
	public void edit2(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		Care care = (Care)EntityUtil.getObject(request, Care.class, "care");
		care.setNext(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("care.next")));
		CareService careService = new CareServiceImpl();
		careService.careEdit(care);
		
		response.getWriter().println("/crm/page/customer/careList.do");
		return;
	}
	
	//进入关怀添加
	@RequestPath(path = "/page/customer/careAdd1.do")
	public void add1(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		CustomerService customerService = new CustomerServiceImpl();
		List<Customer> customers = customerService.customerList();
		
		request.setAttribute("customers", customers);
		request.getRequestDispatcher("/page/customer/careAdd.jsp")
				.forward(request, response);
		return;
	}
	
	//关怀添加
	@RequestPath(path = "/page/customer/careAdd2.do")
	public void add2(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		Care care = (Care)EntityUtil.getObject(request, Care.class, "care");
		care.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(request.getParameter("care.time")));
		care.setNext(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("care.time")));
		
		CareService careService = new CareServiceImpl();
		careService.careAdd(care);
		
		response.getWriter().println("/crm/page/customer/careList.do");
		return;
	}
}
