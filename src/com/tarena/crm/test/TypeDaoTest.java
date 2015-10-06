package com.tarena.crm.test;

import java.util.List;

import org.junit.Test;

import com.tarena.crm.dao.impl.TypeDaoImpl;
import com.tarena.crm.entity.Source;
import com.tarena.crm.entity.Type;

public class TypeDaoTest {
	private TypeDaoImpl test = new TypeDaoImpl();
	@Test
	public void testSave(){
		Type t = new Type();
		t.setType("你爸");
		try {
			test.save(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFindAll(){
		try {
			List<Type> list = test.findAll();
			for(Type t : list){
				System.out.println(t.getType());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDelete(){
		try {
			test.deleteById(4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFind(){
		try {
			List<Type> list = test.findByTypeName("客户");
			System.out.println(list.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
