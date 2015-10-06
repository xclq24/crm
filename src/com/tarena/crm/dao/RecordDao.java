package com.tarena.crm.dao;

import java.util.List;

import com.tarena.crm.entity.Record;

public interface RecordDao {
	public void save(Record record) throws Exception;

	public List<Record> findAll() throws Exception;

	public void deleteById(int id) throws Exception;

	public List<Record> findByRecordName(String name) throws Exception;
}
