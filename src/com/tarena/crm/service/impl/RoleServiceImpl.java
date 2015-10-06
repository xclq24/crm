package com.tarena.crm.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.tarena.crm.dao.RoleDao;
import com.tarena.crm.dao.impl.RoleDaoImpl;
import com.tarena.crm.entity.Role;
import com.tarena.crm.service.RoleService;

public class RoleServiceImpl implements RoleService{

	@Override
	public List<Role> RoleList() throws Exception {
		List<Role> roles = new ArrayList<Role>();
		RoleDao roledao = new RoleDaoImpl();
		roles = roledao.findAll();
		return roles;
	}

	@Override
	public Role FindById(int id) throws Exception {
		return null;
	}

	@Override
	public void deleteRole(int id) throws Exception {
		RoleDao roleDao = new RoleDaoImpl();
		roleDao.delete(id);
	}

	@Override
	public void addRole(Role role) throws Exception {
		RoleDao roleDao = new RoleDaoImpl();
		roleDao.save(role);
		System.out.println("添加成功");
	}
	
}
