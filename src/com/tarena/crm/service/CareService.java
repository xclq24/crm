package com.tarena.crm.service;

import java.util.List;

import com.tarena.crm.entity.Care;

public interface CareService {

	public List<Care> careList() throws Exception;

	public void careDel(String id) throws Exception;

	public void careAdd(Care care) throws Exception;

	public List<Care> careSearch(String name) throws Exception;
	
	public Care careSearchById(String id) throws Exception;
	
	public void careEdit(Care care) throws Exception;
	
	public List<Care> futureCareList() throws Exception;
}
