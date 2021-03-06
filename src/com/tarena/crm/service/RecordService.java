package com.tarena.crm.service;

import java.util.List;

import com.tarena.crm.entity.Record;

public interface RecordService {
	
	public List<Record> recordList() throws Exception;
	
	public List<Record> futureRecordList() throws Exception;

	public void recordDel(String id) throws Exception;

	public void recordAdd(Record record) throws Exception;

	public List<Record> recordSearch(String name) throws Exception;
}
