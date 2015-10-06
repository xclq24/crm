package com.tarena.crm.service;

import java.util.List;

import com.tarena.crm.entity.Dept;
import com.tarena.crm.entity.Role;
import com.tarena.crm.entity.User;

public interface UserService {
	public User login(User user) throws Exception;
		
	public boolean addEmployee(User user)throws Exception;
	
	public List<User> EmpList() throws Exception;
	
	public User FindById(int id) throws Exception;
	
	public User FindByName(String name) throws Exception;
	
	public void deleteEmployee(int id) throws Exception;
	
	public void updateEmployee(User user) throws Exception;
	
	public void modifyPwd(User user) throws Exception;
}
