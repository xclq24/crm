package com.tarena.crm.test;

import org.junit.Test;

import com.tarena.crm.dao.NoticeDao;
import com.tarena.crm.dao.impl.NoticeDaoImpl;
import com.tarena.crm.entity.Notice;

public class NoticeDaoTest {
	@Test
	public void test() throws Exception {
		Notice notice = null;
		NoticeDao dao = new NoticeDaoImpl();
		notice = dao.findAll().get(0);
		System.out.println(notice.getMessage());
		notice.setMessage("记得带钱");
		dao.update(notice);
//		dao.save(notice);
		
	}
}
