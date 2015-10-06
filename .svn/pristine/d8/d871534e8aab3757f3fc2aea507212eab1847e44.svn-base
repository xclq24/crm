package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import com.tarena.crm.dao.TypeDao;
import com.tarena.crm.entity.Type;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;
import com.tarena.db.Page;

public class TypeDaoImpl extends BaseDao<Type> implements TypeDao{

	@Override
	public Type toEntity(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Type type = new Type();
		EntityUtils.fillEntity(rs, type);
		return type;
	}

	@Override
	public void save(Type type) throws Exception {
		// TODO Auto-generated method stub
		update("insert into type values(null,?)", type.toArray());
	}

	@Override
	public List<Type> findAll() throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from type", null);
	}

	@Override
	public List<Type> findAll(Page page) throws Exception {
		Object[] params = {page.getBeginIndex(), page.getEveryPage()};
		return queryEntity("select * from type limit ?,?", params);
	}
	
	@Override
	public void deleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		update("delete from type where id = ?",new Object[]{ id });
	}

	@Override
	public List<Type> findByTypeName(String type) throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from type where type like '%' ? '%'",
				new Object[]{ type });
	}

	@Override
	public int count() throws Exception {
		List<Type> list = queryEntity("select * from type", null);
		return list.size();
	}

}
