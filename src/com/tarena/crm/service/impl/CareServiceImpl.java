package com.tarena.crm.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.tarena.crm.dao.CareDao;
import com.tarena.crm.dao.impl.CareDaoImpl;
import com.tarena.crm.entity.Care;
import com.tarena.crm.entity.Customer;
import com.tarena.crm.service.CareService;

public class CareServiceImpl implements CareService {

	@Override
	public List<Care> careList() throws Exception {
		CareDao careDao = new CareDaoImpl();
		List<Care> list = careDao.findAll();
		return list;
	}

	@Override
	public void careDel(String id) throws Exception {
		CareDao careDao = new CareDaoImpl();
		careDao.deleteById(Integer.parseInt(id));
	}

	@Override
	public void careAdd(Care care) throws Exception {
		CareDao careDao = new CareDaoImpl();
		careDao.save(care);
	}

	@Override
	public List<Care> careSearch(String name) throws Exception {
		CareDao careDao = new CareDaoImpl();
		List<Care> list = careDao.findByObject(name);
		return list;
	}

	@Override
	public Care careSearchById(String id) throws Exception {
		CareDao careDao = new CareDaoImpl();
		Care care = careDao.findById(Integer.parseInt(id));
		return care;
	}

	@Override
	public void careEdit(Care care) throws Exception {
		CareDao careDao = new CareDaoImpl();
		careDao.update(care);
	}

	@Override
	public List<Care> futureCareList() throws Exception {
		// TODO Auto-generated method stub
		List<Care> careList = careList();
		
		Iterator<Care> it = careList.iterator();
		while (it.hasNext()) {
			Care c = it.next();
			
			if(c.getNext().compareTo(new Date())<0){
				it.remove();
			}
		}
		return careList;
	}
	
}
