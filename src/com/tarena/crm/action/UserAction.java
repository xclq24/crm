package com.tarena.crm.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.alibaba.fastjson.JSONArray;
import com.tarena.crm.entity.Dept;
import com.tarena.crm.entity.Role;
import com.tarena.crm.entity.User;
import com.tarena.crm.service.DeptService;
import com.tarena.crm.service.RoleService;
import com.tarena.crm.service.UserService;
import com.tarena.crm.service.impl.DeptServiceImpl;
import com.tarena.crm.service.impl.RoleServiceImpl;
import com.tarena.crm.service.impl.UserServiceImpl;
import com.tarena.minispringmvc.servlet.Action;
import com.tarena.minispringmvc.servlet.EntityUtil;
import com.tarena.minispringmvc.servlet.RequestPath;

@Action
public class UserAction {
	// 路径分析在框架内进行
	@RequestPath(path = "/user/login.do")
	public void login(HttpServletRequest request, HttpServletResponse response) {
		User loginUser = null;
		try {
			User user = (User) EntityUtil
					.getObject(request, User.class, "user");
			UserService userService = new UserServiceImpl();
			loginUser = userService.login(user);
			if (loginUser == null) {
				response.sendRedirect("/crm/login.do");
			} else {
				request.getSession().setAttribute("loginUser", loginUser);
				response.sendRedirect("/crm/main.do");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestPath(path = "/page/manage/addEmployee.do")
	public void loadEmployee(HttpServletRequest request, HttpServletResponse response){
		try{
			RoleService roleService = new RoleServiceImpl();
			DeptService deptService = new DeptServiceImpl();
			List<Role> roles = roleService.RoleList();
			List<Dept> depts = deptService.DeptList();
			request.setAttribute("roles", roles);
			request.setAttribute("depts", depts);
			request.getRequestDispatcher("addEmployee.jsp").forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestPath(path = "/page/basis/addEmployee.do")
	public void addEmployee(HttpServletRequest request, HttpServletResponse response){
		try{
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			User user = (User) EntityUtil
					.getObject(request, User.class, "user");
			user.setAddtime(new Date());
			UserService userService = new UserServiceImpl();
			if(userService.addEmployee(user)){
				out.println("/crm/page/basis/employeeList.jsp");
			}else{
				out.println("失败");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestPath(path = "/page/basis/employeeList.do")
	public void employeeList(HttpServletRequest request, HttpServletResponse response){
		List<User> users = new ArrayList<User>();
		try{
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			UserService userService = new UserServiceImpl();
			users = userService.EmpList();
			JSONArray json = (JSONArray) JSONArray.toJSON(users);
			String jsonStr = json.toString();
			out.println(jsonStr);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestPath(path = "/page/basis/employeeEdit.do")
	public void employeeEdit(HttpServletRequest request, HttpServletResponse response){
		User user = null;
		int id = Integer.parseInt(request.getParameter("id"));
		try{
			UserService userService = new UserServiceImpl();
			RoleService roleService = new RoleServiceImpl();
			DeptService deptService = new DeptServiceImpl();
			List<Role> roles = roleService.RoleList();
			List<Dept> depts = deptService.DeptList();
			user = userService.FindById(id);
			request.setAttribute("user", user);
			request.setAttribute("roles", roles);
			request.setAttribute("depts", depts);
			request.getRequestDispatcher("employeeEdit.jsp").forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestPath(path = "/page/basis/employeeInfo.do")
	public void employeeInfo(HttpServletRequest request, HttpServletResponse response){
		User user = null;
		int id = Integer.parseInt(request.getParameter("id"));
		try{
			UserService userService = new UserServiceImpl();
			user = userService.FindById(id);
			request.setAttribute("user", user);
			request.getRequestDispatcher("employeeInfo.jsp").forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestPath(path = "/page/basis/employeeDelete.do")
	public void employeeDelete(HttpServletRequest request, HttpServletResponse response){
		int id = Integer.parseInt(request.getParameter("id"));
		try{
			UserService userService = new UserServiceImpl();
			userService.deleteEmployee(id);
			request.getRequestDispatcher("employeeList.jsp").forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestPath(path = "/page/basis/modifyEmployee.do")
	public void modifyEmployee(HttpServletRequest request, HttpServletResponse response){
		try{
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			User user = (User) EntityUtil
					.getObject(request, User.class, "user");
			user.setModifytime(new Date());
			UserService userService = new UserServiceImpl();
			userService.updateEmployee(user);
			System.out.println("更新成功");
			PrintWriter out = response.getWriter();
			out.println("/crm/page/basis/employeeList.jsp");
//			response.sendRedirect("employeeList.jsp");
			}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestPath(path = "/page/basis/check_uname.do")
	public void check_uname(HttpServletRequest request, HttpServletResponse response){
		try {
			PrintWriter out = response.getWriter();
			System.out.println(request.getParameter("username"));
			String username = request.getParameter("username");
			UserService userService = new UserServiceImpl();
			User user = userService.FindByName(username);
			if(user!=null){
				out.println(-1);
			}else{
				out.println(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//加载用户个人修改
	@RequestPath(path = "/page/base/userInfo.do")
	public void loadUser(HttpServletRequest request, HttpServletResponse response){
		User user = null;
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			UserService userService = new UserServiceImpl();
			RoleService roleService = new RoleServiceImpl();
			DeptService deptService = new DeptServiceImpl();
			List<Role> roles = roleService.RoleList();
			List<Dept> depts = deptService.DeptList();
			user = userService.FindById(id);
			request.setAttribute("user", user);
			request.setAttribute("roles", roles);
			request.setAttribute("depts", depts);
			request.getRequestDispatcher("userInfo.jsp").forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	//修改个人信息
	@RequestPath(path = "/page/base/modifyPwd.do")
	public void modifyUser(HttpServletRequest request, HttpServletResponse response){
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id", id);
		try {
			request.getRequestDispatcher("modifyPwd.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	//修改个人密码
	@RequestPath(path = "/page/basis/check_Pwd.do")
	public void check_Pwd(HttpServletRequest request, HttpServletResponse response){
		try{
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			int id = Integer.parseInt(request.getParameter("id"));
			String pwd = request.getParameter("pwd");
			String new_pwd = request.getParameter("new_pwd");
			PrintWriter out = response.getWriter();
			UserService userService = new UserServiceImpl();
			User user = userService.FindById(id);
			List<String> str = new ArrayList<String>();
			if(user.getPwd().equals(pwd)){
				user.setPwd(new_pwd);
				userService.modifyPwd(user);
				str.add("修改成功");
				str.add("/crm/page/main.jsp");
				
			}else{
				str.add("原密码错误！");
			}
			JSONArray json = (JSONArray) JSONArray.toJSON(str);
			String jsonStr = json.toJSONString();
			System.out.println(jsonStr);
			out.println(jsonStr);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
