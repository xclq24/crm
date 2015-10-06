package com.tarena.crm.dao;

import java.util.List;

import com.tarena.crm.entity.House;

public interface HouseDao {
	public void save(House house) throws Exception;

	public List<House> findAll() throws Exception;

	public void update(House house) throws Exception;

	public void delete(int id) throws Exception;
	
	public House findById(int id) throws Exception;

	public House findByType(String type) throws Exception;
	
	public List<House> queryHouseList(String classify,String keyword) throws Exception;
}
