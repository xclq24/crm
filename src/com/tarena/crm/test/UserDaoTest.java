package com.tarena.crm.test;

import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;

import com.tarena.crm.dao.impl.UserDaoImpl;
import com.tarena.crm.entity.User;

public class UserDaoTest {

	@Test
	public void findAllTest(){
		try {
			UserDaoImpl udi = new UserDaoImpl();
			List<User> list = udi.findAll();
			for (User user : list) {
				System.out.println(user.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void saveTest(){
		try {
			UserDaoImpl udi = new UserDaoImpl();
			User user = udi.findByUsername("admin");
			
			System.out.println(user.getAddtime());
			
			user.setUsername("admin2");
			user.setAddtime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-01-01 15:15:15"));
			
			udi.save(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void deleteTest(){
		try {
			UserDaoImpl udi = new UserDaoImpl();
			udi.delete(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
