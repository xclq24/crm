package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import com.tarena.crm.dao.AllotDao;
import com.tarena.crm.entity.Allot;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;

public class AllotDaoImpl extends BaseDao<Allot> implements AllotDao{
	@Override
	public Allot toEntity(ResultSet rs) throws Exception {
		Allot allot = new Allot();
		EntityUtils.fillEntity(rs, allot);
		return allot;
	}
	@Override
	public void save(Allot allot) throws Exception {
		update("insert into allot values(null,?,?)"
				, allot.toArray());
	}

	@Override
	public List<Allot> findAll() throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from allot", null);
	}

}
