package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.tarena.crm.dao.CareDao;
import com.tarena.crm.entity.Care;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;

public class CareDaoImpl extends BaseDao<Care> implements CareDao {

	@Override
	public Care toEntity(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Care care = new Care();
		EntityUtils.fillEntity(rs, care);
		return care;
	}

	@Override
	public void save(Care care) throws Exception {
		// TODO Auto-generated method stub
		update("insert into care values(null,?,?,?,?,?,?,?)", care.toArray());
	}

	@Override
	public List<Care> findAll() throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from care", null);
	}

	@Override
	public void deleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		update("delete from care where id = ?", new Object[] { id });
	}

	@Override
	public List<Care> findByObject(String object) throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from care where object like '%' ? '%'",
				new Object[] { object });
	}

	@Override
	public void update(Care care) throws Exception {
		// TODO Auto-generated method stub
		Object[] params = care.toArray();
		params = ArrayUtils.remove(params, 2);
		params = ArrayUtils.add(params, care.getId());
		update("update care set theme=?, object=?, next=?, way=?, people=?, note=? where id = ?",
				params);
	}

	@Override
	public Care findById(int id) throws Exception {
		List<Care> list = queryEntity("select * from care where id = ?", new Object[]{ id });
		if(list.size() > 0){
			return list.get(0);
		}
		return null;
	}

}
