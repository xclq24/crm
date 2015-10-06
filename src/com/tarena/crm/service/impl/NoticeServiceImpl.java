package com.tarena.crm.service.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.tarena.crm.dao.impl.NoticeDaoImpl;
import com.tarena.crm.entity.Notice;
import com.tarena.crm.service.NoticeService;

public class NoticeServiceImpl implements NoticeService{

	@Override
	public List<Notice> findAll() throws Exception {
		// TODO Auto-generated method stub
		return new NoticeDaoImpl().findAll();
	}

	@Override
	public void add(Notice notice) throws Exception {
		// TODO Auto-generated method stub
		new NoticeDaoImpl().save(notice);
	}

	@Override
	public List<Notice> queryNoticeList(String classify, String keyword)
			throws Exception {
		// TODO Auto-generated method stub
		return new NoticeDaoImpl().queryNoticeList(classify, keyword);
	}

	@Override
	public List<Notice> findAllValidate() throws Exception {
		// TODO Auto-generated method stub
		List<Notice> noticeList = new NoticeDaoImpl().findAll();
		
		Iterator<Notice> it = noticeList.iterator();
		while (it.hasNext()) {
			Notice n = it.next();
			if(n.getDeadline().compareTo(new Date())<0){
				it.remove();
			}
		}
		return noticeList;
	}

}
