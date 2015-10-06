package com.tarena.crm.service;

import java.util.List;

import com.tarena.crm.entity.House;
import com.tarena.crm.entity.HouseType;
import com.tarena.crm.entity.User;

public interface HouseService {
	public List<House> houseList() throws Exception;
	
	public void deleteHouse(int id) throws Exception;
	
	public void loadAddHouse(List<HouseType> houseTypeList,List<User> userList) throws Exception;
	
	public void addHouse(House house) throws Exception;
	
	public House findById(int id) throws Exception; 
	
	public void update(House house) throws Exception;
	
	public List<House> query(String classify,String keyword) throws Exception;
	
	
}
