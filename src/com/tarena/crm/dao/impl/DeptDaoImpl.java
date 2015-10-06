package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.tarena.crm.dao.DeptDao;
import com.tarena.crm.entity.Dept;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;

public class DeptDaoImpl extends BaseDao<Dept> implements DeptDao {

	@Override
	public void save(Dept dept) throws Exception {
		// TODO Auto-generated method stub
		update("insert into dept(name,description) values(?,?)",dept.toArray());
	}

	@Override
	public List<Dept> findAll() throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from dept", null);
	}

	@Override
	public void update(Dept dept) throws Exception {
		// TODO Auto-generated method stub
		Object[] params = dept.toArray();
		params = ArrayUtils.add(params, dept.getId());
		update("update dept set name=?,description=? where id=?",params);
	}

	@Override
	public Dept findById(int id) throws Exception {
		// TODO Auto-generated method stub
		List<Dept> list = queryEntity("select * from dept where id=?", new Object[]{id});
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		update("delete from dept where id=?",new Object[]{id});
	}
	
	@Override
	public Dept toEntity(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Dept dept = new Dept();
		EntityUtils.fillEntity(rs, dept);
		return dept;
	}

	@Override
	public Dept findByName(String name) throws Exception {
		List<Dept> list = queryEntity("select * from dept where name=?", new Object[]{name});
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<Dept> findByText(String name) throws Exception {
		List<Dept> list = queryEntity("select * from dept where name like '%' ? '%'", new Object[]{name});
		if(list.size()>0)
			return list;
		return null;
	}

}
