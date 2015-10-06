package com.tarena.crm.service.impl;

import java.util.List;

import com.tarena.crm.dao.AllotDao;
import com.tarena.crm.dao.impl.AllotDaoImpl;
import com.tarena.crm.entity.Allot;
import com.tarena.crm.service.AllotService;

public class AllotServiceImpl implements AllotService{

	@Override
	public List<Allot> allotList() throws Exception {
		AllotDao allotDao = new AllotDaoImpl();
		List<Allot> list = allotDao.findAll();
		return list;
	}

	@Override
	public void allotUpdate(String[] names, String name) throws Exception {
		AllotDao allotDao = new AllotDaoImpl();
		for(String str : names){
			Allot allot = new Allot();
			allot.setEname(name);
			allot.setCname(str);
			allotDao.save(allot);
		}
		return;
	}
	
}
