package com.tarena.crm.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarena.crm.entity.Role;
import com.tarena.crm.service.RoleService;
import com.tarena.crm.service.impl.RoleServiceImpl;
import com.tarena.minispringmvc.servlet.Action;
import com.tarena.minispringmvc.servlet.RequestPath;

@Action
public class RoleAction {
	@RequestPath(path = "/page/manage/RoleList.do")
	public void RoleList(HttpServletRequest request, HttpServletResponse response){
		List<Role> roles = null;
		try{
			RoleService roleService = new RoleServiceImpl();
			roles = roleService.RoleList();
			request.setAttribute("roles", roles);
			request.getRequestDispatcher("addRole.jsp").forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestPath(path = "/page/basis/roleDelete.do")
	public void roleDelete(HttpServletRequest request, HttpServletResponse response){
		int id = Integer.parseInt(request.getParameter("id"));
		try{
			RoleService roleService = new RoleServiceImpl();
			roleService.deleteRole(id);
			request.getRequestDispatcher("crm/page/manage/RoleList.do").forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestPath(path = "/page/basis/addRole.do")
	public void addRole(HttpServletRequest request, HttpServletResponse response){
		try{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");
		int level = Integer.parseInt(request.getParameter("level"));
		Role role = new Role();
		role.setLevel(level);
		role.setName(name);
		RoleService roleService = new RoleServiceImpl();
		roleService.addRole(role);
		request.getRequestDispatcher("/page/manage/RoleList.do").forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		
}
