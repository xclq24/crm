package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import com.tarena.crm.dao.SourceDao;
import com.tarena.crm.entity.Source;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;

public class SourceDaoImpl extends BaseDao<Source> implements SourceDao{

	@Override
	public Source toEntity(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Source source =  new Source();
		EntityUtils.fillEntity(rs, source);
		return source;
	}
	
	@Override
	public void save(Source source) throws Exception {
		// TODO Auto-generated method stub
		update("insert into source values(null,?)", source.toArray());
	}

	@Override
	public List<Source> findAll() throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from source", null);
	}

	@Override
	public void deleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		update("delete from source where id = ?", new Object[]{ id });
	}

	@Override
	public List<Source> findBySourceName(String source) throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from source where source like '%' ? '%'",
				new Object[]{ source });
	}

}
