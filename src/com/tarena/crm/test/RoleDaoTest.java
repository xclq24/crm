package com.tarena.crm.test;

import java.util.List;

import org.junit.Test;

import com.tarena.crm.dao.impl.RoleDaoImpl;
import com.tarena.crm.entity.Role;

public class RoleDaoTest {

	@Test
	public void saveTest() {
		try {
			RoleDaoImpl rdi = new RoleDaoImpl();
			Role role = rdi.findById(1);
			role.setName("123");
			rdi.save(role);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void findAllTest() {
		try {
			RoleDaoImpl rdi = new RoleDaoImpl();
			List<Role> list = rdi.findAll();
			for (Role role : list) {
				System.out.println(role.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void updateTest(){
		try {
			RoleDaoImpl rdi = new RoleDaoImpl();
			Role role = rdi.findById(1);
			role.setName("xxxxx");
			rdi.update(role);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void findByIdTest(){
		try {
			RoleDaoImpl rdi = new RoleDaoImpl();
			Role role = rdi.findById(1);
			System.out.println(role);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void deleteTest(){
		try {
			RoleDaoImpl rdi = new RoleDaoImpl();
			rdi.delete(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
