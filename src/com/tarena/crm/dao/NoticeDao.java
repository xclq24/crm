package com.tarena.crm.dao;

import java.util.List;

import com.tarena.crm.entity.Notice;

public interface NoticeDao {
	public void save(Notice notice) throws Exception;

	public List<Notice> findAll() throws Exception;

	public void update(Notice notice) throws Exception;

	public Notice findById(int id) throws Exception;

	public Notice findByTheme(String theme) throws Exception;
	
	public List<Notice> queryNoticeList(String classify,String keyword) throws Exception;
}
