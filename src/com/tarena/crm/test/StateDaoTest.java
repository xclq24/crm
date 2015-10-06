package com.tarena.crm.test;

import java.util.List;

import org.junit.Test;

import com.tarena.crm.dao.impl.StateDaoImpl;
import com.tarena.crm.entity.Source;
import com.tarena.crm.entity.State;

public class StateDaoTest {
	private StateDaoImpl test = new StateDaoImpl();
	@Test
	public void testSave(){
		State s = new State();
		s.setState("不是客户");
		s.setDescription("上辈子结仇");
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
			List<State> list = test.findAll();
			for(State s : list){
				System.out.println(s.getState());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDelete(){
		try {
			test.deleteById(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFind(){
		try {
			List<State> list = test.findByStateName("潜在客户");
			System.out.println(list.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
