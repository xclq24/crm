package com.tarena.crm.service.impl;

import java.util.List;

import com.tarena.crm.dao.TypeDao;
import com.tarena.crm.dao.impl.TypeDaoImpl;
import com.tarena.crm.entity.Type;
import com.tarena.crm.service.TypeService;
import com.tarena.db.Page;

public class TypeServiceImpl implements TypeService{

	@Override
	public List<Type> typeList() throws Exception {
		TypeDao typeDao = new TypeDaoImpl();
		List<Type> type = typeDao.findAll();
		return type;
	}
	
	@Override
	public List<Type> typeList(Page page) throws Exception {
		TypeDao typeDao = new TypeDaoImpl();
		List<Type> type = typeDao.findAll(page);
		return type;
	}

	@Override
	public void typeDel(String id) throws Exception {
		TypeDao typeDao = new TypeDaoImpl();
		typeDao.deleteById(Integer.parseInt(id));
		return ;
	}

	@Override
	public void typeAdd(Type type) throws Exception {
		TypeDao typeDao = new TypeDaoImpl();
		typeDao.save(type);
		return ;
	}

	@Override
	public List<Type> typeSearch(String type) throws Exception {
		TypeDao typeDao = new TypeDaoImpl();
		List<Type> list = typeDao.findByTypeName(type);
		return list;
	}

	@Override
	public int findCount() throws Exception {
		TypeDao typeDao = new TypeDaoImpl();
		int count = typeDao.count();
		return count;
	}
	
}
