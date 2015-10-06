package com.tarena.crm.dao;

import java.util.List;

import com.tarena.crm.entity.State;

public interface StateDao {
	public void save(State state) throws Exception;

	public List<State> findAll() throws Exception;

	public void deleteById(int id) throws Exception;

	public List<State> findByStateName(String state) throws Exception;
}
