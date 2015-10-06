package com.tarena.crm.service.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.tarena.crm.dao.RecordDao;
import com.tarena.crm.dao.impl.RecordDaoImpl;
import com.tarena.crm.entity.Record;
import com.tarena.crm.service.RecordService;

public class RecordServiceImpl implements RecordService{

	@Override
	public List<Record> recordList() throws Exception {
		RecordDao recordDao = new RecordDaoImpl();
		List<Record> list = recordDao.findAll();
		return list;
	}
	
	@Override
	public List<Record> futureRecordList() throws Exception {
		RecordDao recordDao = new RecordDaoImpl();
		List<Record> list = recordDao.findAll();
		
		Iterator<Record> it = list.iterator();
		while (it.hasNext()) {
			Record r = it.next();
			if(r.getNext().compareTo(new Date())<0){
				it.remove();
			}
		}
		return list;
	}
	
	

	@Override
	public void recordDel(String id) throws Exception {
		RecordDao recordDao = new RecordDaoImpl();
		recordDao.deleteById(Integer.parseInt(id));
	}

	@Override
	public void recordAdd(Record record) throws Exception {
		RecordDao recordDao = new RecordDaoImpl();
		recordDao.save(record);
	}

	@Override
	public List<Record> recordSearch(String name) throws Exception {
		RecordDao recordDao = new RecordDaoImpl();
		List<Record> list = recordDao.findByRecordName(name);
		return list;
	}

}
