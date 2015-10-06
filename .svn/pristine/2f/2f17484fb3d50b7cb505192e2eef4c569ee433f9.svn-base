package com.tarena.crm.test;

import java.util.List;

import org.junit.Test;

import com.tarena.crm.dao.impl.SourceDaoImpl;
import com.tarena.crm.entity.Source;

public class SourceDaoTest {
	private SourceDaoImpl test = new SourceDaoImpl();
	@Test
	public void testSave(){
		Source s = new Source();
		s.setSource("大帮网");
		try {
			test.save(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFindAll(){
		try {
			List<Source> list = test.findAll();
			for(Source s : list){
				System.out.println(s.getSource());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDelete(){
		try {
			test.deleteById(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFind(){
		try {
			List<Source> list = test.findBySourceName("大帮网");
			System.out.println(list.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
