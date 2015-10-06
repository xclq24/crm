package com.tarena.crm.service;

import java.util.List;

import com.tarena.crm.entity.Allot;

public interface AllotService {
	
	public List<Allot> allotList() throws Exception;
	
	public void allotUpdate(String[] names, String name) throws Exception;
}
