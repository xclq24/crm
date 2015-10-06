package com.tarena.crm.service.impl;

import java.util.List;

import com.tarena.crm.dao.impl.HouseDaoImpl;
import com.tarena.crm.dao.impl.HouseTypeDaoImpl;
import com.tarena.crm.dao.impl.UserDaoImpl;
import com.tarena.crm.entity.House;
import com.tarena.crm.entity.HouseType;
import com.tarena.crm.entity.User;
import com.tarena.crm.service.HouseService;

public class HouseServiceImpl implements HouseService {

	@Override
	public List<House> houseList() throws Exception {
		// TODO Auto-generated method stub
		return new HouseDaoImpl().findAll();
	}

	@Override
	public void deleteHouse(int id) throws Exception {
		// TODO Auto-generated method stub
		new HouseDaoImpl().delete(id);
	}
	
	@Override
	public void loadAddHouse(List<HouseType> houseTypeList, List<User> userList)
			throws Exception {
		houseTypeList.addAll(new HouseTypeDaoImpl().findAll());
		userList.addAll(new UserDaoImpl().findAll());
	}

	@Override
	public void addHouse(House house) throws Exception {
		// TODO Auto-generated method stub
		new HouseDaoImpl().save(house);
	}

	@Override
	public House findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return new HouseDaoImpl().findById(id);
	}

	@Override
	public void update(House house) throws Exception {
		// TODO Auto-generated method stub
		new HouseDaoImpl().update(house);
	}

	@Override
	public List<House> query(String classify, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return new HouseDaoImpl().queryHouseList(classify, keyword);
	}
}
