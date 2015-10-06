package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import com.tarena.crm.dao.RecordDao;
import com.tarena.crm.entity.Record;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;

public class RecordDaoImpl extends BaseDao<Record> implements RecordDao{

	@Override
	public Record toEntity(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Record record = new Record();
		EntityUtils.fillEntity(rs, record);
		return record;
	}

	@Override
	public void save(Record record) throws Exception {
		// TODO Auto-generated method stub
		update("insert into record values(null, ?, ?, ?, ?, ?, ?, ?)",record.toArray());
	}

	@Override
	public List<Record> findAll() throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from record", null);
	}

	@Override
	public void deleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		update("delete from record where id = ?",new Object[]{ id });
	}

	@Override
	public List<Record> findByRecordName(String name) throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from record where name like '%' ? '%'",
				new Object[]{ name });
	}

}
