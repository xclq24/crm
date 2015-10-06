package com.tarena.crm.service;

import java.util.List;

import com.tarena.crm.entity.Role;



public interface RoleService {
	
	public List<Role> RoleList() throws Exception;
	
	public void addRole(Role role) throws Exception;
	
	public Role FindById(int id) throws Exception;
	
	public void deleteRole(int id) throws Exception;
	
}
