package com.tarena.crm.service.impl;

import java.util.List;

import com.tarena.crm.dao.impl.HouseTypeDaoImpl;
import com.tarena.crm.entity.HouseType;
import com.tarena.crm.service.HouseTypeService;

public class HouseTypeServiceImpl implements HouseTypeService {

	@Override
	public List<HouseType> findAll() throws Exception {
		// TODO Auto-generated method stub
		return new HouseTypeDaoImpl().findAll();
	}

	@Override
	public void deleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		new HouseTypeDaoImpl().delete(id);
	}

	@Override
	public void add(HouseType houseType) throws Exception {
		// TODO Auto-generated method stub
		new HouseTypeDaoImpl().save(houseType);
	}

}
