package com.tarena.crm.service;

import java.util.List;

import com.tarena.crm.entity.State;

public interface StateService {

	public List<State> stateList() throws Exception;
	
	public void stateDel(String id) throws Exception;

	public void stateAdd(State state) throws Exception;
	
	public List<State> stateSearch(String state) throws Exception;
}
