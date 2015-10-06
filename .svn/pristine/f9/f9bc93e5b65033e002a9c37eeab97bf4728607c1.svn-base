package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import com.tarena.crm.dao.StateDao;
import com.tarena.crm.entity.State;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;

public class StateDaoImpl extends BaseDao<State> implements StateDao{

	@Override
	public State toEntity(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		State state = new State();
		EntityUtils.fillEntity(rs, state);
		return state;
	}

	@Override
	public void save(State state) throws Exception {
		// TODO Auto-generated method stub
		update("insert into state values(null, ? ,?)",state.toArray());
	}

	@Override
	public List<State> findAll() throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from state", null);
	}

	@Override
	public void deleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		update("delete from state where id = ?",new Object[]{ id });
	}

	@Override
	public List<State> findByStateName(String state) throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from state where state like '%' ? '%'",
				new Object[]{ state });
	}

}
