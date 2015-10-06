package com.tarena.crm.dao;

import java.util.List;

import com.tarena.crm.entity.Source;

public interface SourceDao {
	public void save(Source source) throws Exception;

	public List<Source> findAll() throws Exception;

	public void deleteById(int id) throws Exception;

	public List<Source> findBySourceName(String source) throws Exception;
}
