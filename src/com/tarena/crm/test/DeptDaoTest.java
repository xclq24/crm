package com.tarena.crm.test;

import java.util.List;

import org.junit.Test;

import com.tarena.crm.dao.impl.DeptDaoImpl;
import com.tarena.crm.entity.Dept;

public class DeptDaoTest {

	@Test
	public void saveTest() {
		try {
			DeptDaoImpl rdi = new DeptDaoImpl();
			Dept dept = rdi.findById(1);
			dept.setName("123");
			rdi.save(dept);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void findAllTest() {
		try {
			DeptDaoImpl rdi = new DeptDaoImpl();
			List<Dept> list = rdi.findAll();
			for (Dept dept : list) {
				System.out.println(dept.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void updateTest(){
		try {
			DeptDaoImpl rdi = new DeptDaoImpl();
			Dept dept = rdi.findById(1);
			dept.setName("xx");
			rdi.update(dept);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void findByIdTest(){
		try {
			DeptDaoImpl rdi = new DeptDaoImpl();
			Dept dept = rdi.findById(1);
			System.out.println(dept);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void deleteTest(){
		try {
			DeptDaoImpl rdi = new DeptDaoImpl();
			rdi.delete(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
