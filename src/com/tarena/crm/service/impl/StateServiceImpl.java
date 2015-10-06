package com.tarena.crm.service.impl;

import java.util.List;

import com.tarena.crm.dao.StateDao;
import com.tarena.crm.dao.impl.StateDaoImpl;
import com.tarena.crm.entity.State;
import com.tarena.crm.service.StateService;

public class StateServiceImpl implements StateService{

	@Override
	public List<State> stateList() throws Exception {
		StateDao stateDao = new StateDaoImpl();
		List<State> state = stateDao.findAll();
		return state;
	}

	@Override
	public void stateDel(String id) throws Exception {
		StateDao stateDao = new StateDaoImpl();
		stateDao.deleteById(Integer.parseInt(id));
		return ;
	}

	@Override
	public void stateAdd(State state) throws Exception {
		StateDao stateDao = new StateDaoImpl();
		stateDao.save(state);
		return ;
	}

	@Override
	public List<State> stateSearch(String state) throws Exception {
		StateDao stateDao = new StateDaoImpl();
		List<State> list = stateDao.findByStateName(state);
		return list;
	}

}
