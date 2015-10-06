package com.tarena.crm.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarena.crm.entity.Customer;
import com.tarena.crm.entity.Source;
import com.tarena.crm.entity.State;
import com.tarena.crm.entity.Type;
import com.tarena.crm.entity.User;
import com.tarena.crm.service.CustomerService;
import com.tarena.crm.service.SourceService;
import com.tarena.crm.service.StateService;
import com.tarena.crm.service.TypeService;
import com.tarena.crm.service.UserService;
import com.tarena.crm.service.impl.CustomerServiceImpl;
import com.tarena.crm.service.impl.SourceServiceImpl;
import com.tarena.crm.service.impl.StateServiceImpl;
import com.tarena.crm.service.impl.TypeServiceImpl;
import com.tarena.crm.service.impl.UserServiceImpl;
import com.tarena.db.Page;
import com.tarena.db.PageUtil;
import com.tarena.minispringmvc.servlet.Action;
import com.tarena.minispringmvc.servlet.EntityUtil;
import com.tarena.minispringmvc.servlet.RequestPath;

@Action
public class CustomerAction {

	// 客户信息展示
	@RequestPath(path = "/page/customer/customerList.do")
	public void list(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/html;charset=utf-8");
		List<Customer> customers = null;

		String current = request.getParameter("currentPage");
		if (current == null) {
			current = "0";
		}
		// 搜索路径转发
		if (request.getAttribute("customers") != null) {
			customers = (List<Customer>) request.getAttribute("customers");
		} else {
			CustomerService customerService = new CustomerServiceImpl();
			int totalCount = customerService.findCount();
			int currentPage = Integer.parseInt(current);
			Page page = PageUtil.createPage(1, totalCount, currentPage);
			customers = customerService.customerList(page);

			request.setAttribute("page", page);
		}
		request.setAttribute("customers", customers);
		request.getRequestDispatcher("/page/customer/customerList.jsp")
				.forward(request, response);
	}

	// 删除客户信息
	@RequestPath(path = "/page/customer/customerDel.do")
	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("id");
		CustomerService customerService = new CustomerServiceImpl();

		customerService.customerDel(id);
		request.getRequestDispatcher("/page/customer/customerList.do").forward(
				request, response);
		return;

	}

	// 客户信息搜索
	@RequestPath(path = "/page/customer/customerSearch.do")
	public void search(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");

		CustomerService customerService = new CustomerServiceImpl();
		List<Customer> customers = customerService.customerSearch(name);

		request.setAttribute("customers", customers);
		request.getRequestDispatcher("/page/customer/customerList.do").forward(
				request, response);
		return;

	}

	// 客户信息编辑
	@RequestPath(path = "/page/customer/customerEdit1.do")
	public void edit1(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String id = request.getParameter("id");
		// /取得要编辑的联系人
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = customerService.customerSearchById(id);
		// 获得员工列表
		UserService userService = new UserServiceImpl();
		List<User> users = userService.EmpList();
		// 获得客户状态列表
		StateService stateService = new StateServiceImpl();
		List<State> states = stateService.stateList();
		// 获得客户来源列表
		SourceService sourceService = new SourceServiceImpl();
		List<Source> sources = sourceService.sourceList();
		// 获得客户类型列表
		TypeService typeService = new TypeServiceImpl();
		List<Type> types = typeService.typeList();

		request.setAttribute("customer", customer);
		request.setAttribute("users", users);
		request.setAttribute("states", states);
		request.setAttribute("sources", sources);
		request.setAttribute("types", types);

		request.getRequestDispatcher("/page/customer/customerEdit.jsp")
				.forward(request, response);
		return;
	}

	// 编辑信息提交
	@RequestPath(path = "/page/customer/customerEdit2.do")
	public void edit2(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		Customer customer = (Customer) EntityUtil.getObject(request,
				Customer.class, "customer");
		customer.setModifytime(new Date());
		System.out.println(customer.toString());
		CustomerService customerService = new CustomerServiceImpl();
		customerService.cunstomerEdit(customer);

		response.getWriter().println("/crm/page/customer/customerList.do");
		return;
	}

	// 客户信息详情
	@RequestPath(path = "/page/customer/customerInfo.do")
	public void info(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String id = request.getParameter("id");
		CustomerService customerService = new CustomerServiceImpl();

		Customer customer = customerService.customerSearchById(id);
		request.setAttribute("customer", customer);
		request.getRequestDispatcher("/page/customer/customerInfo.jsp")
				.forward(request, response);
		return;
	}

	// 进入客户信息添加
	@RequestPath(path = "/page/customer/customerAdd1.do")
	public void add1(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		// 获得客户来源列表
		SourceService sourceService = new SourceServiceImpl();
		List<Source> sources = sourceService.sourceList();
		// 获得客户类型列表
		TypeService typeService = new TypeServiceImpl();
		List<Type> types = typeService.typeList();
		// 获得客户状态列表
		StateService stateService = new StateServiceImpl();
		List<State> states = stateService.stateList();
		request.setAttribute("sources", sources);
		request.setAttribute("types", types);
		request.setAttribute("states", states);

		request.getRequestDispatcher("/page/customer/customerAdd.jsp").forward(
				request, response);
		return;
	}

	// 客户信息添加
	@RequestPath(path = "/page/customer/customerAdd2.do")
	public void add2(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		Customer customer = (Customer) EntityUtil.getObject(request,
				Customer.class, "customer");
		Date birthday = new SimpleDateFormat("yyyy-MM-dd").parse(request
				.getParameter("customer.birthday"));
		customer.setBirthday(birthday);
		customer.setCreatetime(new Date());
		CustomerService customerService = new CustomerServiceImpl();
		customerService.customerAdd(customer);

		response.getWriter().println("/crm/page/customer/customerList.do");
		return;
	}
}
