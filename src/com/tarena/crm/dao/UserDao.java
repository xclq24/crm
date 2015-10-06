package com.tarena.crm.dao;

import java.util.List;

import com.tarena.crm.entity.User;

public interface UserDao {
	public void save(User user) throws Exception;

	public List<User> findAll() throws Exception;

	public void update(User user) throws Exception;

	public User findById(int id) throws Exception;

	public User findByUsername(String username) throws Exception;
	
	public void delete(int id) throws Exception;
	
	public void modifyPwd(User user) throws Exception;
}
