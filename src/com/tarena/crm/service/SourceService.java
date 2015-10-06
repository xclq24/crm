package com.tarena.crm.service;

import java.util.List;

import com.tarena.crm.entity.Source;

public interface SourceService {

	public List<Source> sourceList() throws Exception;
	
	public void sourceDel(String id) throws Exception;

	public void sourceAdd(Source source) throws Exception;
	
	public List<Source> sourceSearch(String source) throws Exception;
}
