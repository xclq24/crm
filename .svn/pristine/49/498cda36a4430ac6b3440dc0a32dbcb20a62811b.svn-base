package com.tarena.crm.service.impl;

import java.util.List;

import com.tarena.crm.dao.SourceDao;
import com.tarena.crm.dao.impl.SourceDaoImpl;
import com.tarena.crm.entity.Source;
import com.tarena.crm.service.SourceService;

public class SourceServiceImpl implements  SourceService{

	@Override
	public List<Source> sourceList() throws Exception {
		SourceDao sourceDao = new SourceDaoImpl();
		List<Source> source = sourceDao.findAll();
		return source;
	}

	@Override
	public void sourceDel(String id) throws Exception {
		SourceDao sourceDao = new SourceDaoImpl();
		sourceDao.deleteById(Integer.parseInt(id));
		return ;
	}

	@Override
	public void sourceAdd(Source source) throws Exception {
		SourceDao sourceDao = new SourceDaoImpl();
		sourceDao.save(source);
		return;
	}

	@Override
	public List<Source> sourceSearch(String source) throws Exception {
		SourceDao sourceDao = new SourceDaoImpl();
		List<Source> list = sourceDao.findBySourceName(source);
		return list;
		
	}
	
}
