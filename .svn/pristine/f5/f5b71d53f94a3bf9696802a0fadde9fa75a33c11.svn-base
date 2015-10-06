package com.tarena.crm.test;

import java.util.List;

import org.junit.Test;

import com.tarena.crm.dao.impl.AllotDaoImpl;
import com.tarena.crm.entity.Allot;

public class AllotDaoTest {
	private AllotDaoImpl test = new AllotDaoImpl();
	@Test
	public void testSave(){
		Allot a = new Allot();
		a.setCname("客户");
		a.setEname("老王");
		try {
			test.save(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testFindAll(){
		try {
			List<Allot> list = test.findAll();
			for(Allot s : list){
				System.out.println(s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
