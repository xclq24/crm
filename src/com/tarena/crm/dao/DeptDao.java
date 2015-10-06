package com.tarena.crm.dao;

import java.util.List;

import com.tarena.crm.entity.Dept;

public interface DeptDao {
	public void save(Dept dept) throws Exception;

	public List<Dept> findAll() throws Exception;

	public void update(Dept dept) throws Exception;

	public Dept findById(int id) throws Exception;

	public void delete(int id) throws Exception;
	
	public Dept findByName(String name) throws Exception;
	
	public List<Dept> findByText(String name)throws Exception;
}
