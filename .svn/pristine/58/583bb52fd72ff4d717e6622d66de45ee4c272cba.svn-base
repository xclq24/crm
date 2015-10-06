package com.tarena.crm.test;

import java.util.List;

import org.junit.Test;

import com.tarena.crm.dao.impl.EmailDaoImpl;
import com.tarena.crm.entity.Email;

public class EmailDaoTest {

	@Test
	public void saveTest(){
		try {
			EmailDaoImpl edi = new EmailDaoImpl();
			Email email = edi.findById(1);
			email.setTheme("lalaaaaaaaa");
			edi.save(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void findAllTest(){
		try {
			EmailDaoImpl edi = new EmailDaoImpl();
			List<Email> list = edi.findAll();
			for (Email email : list) {
				System.out.println(email);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void updateTest(){
		try {
			EmailDaoImpl edi = new EmailDaoImpl();
			Email email = edi.findById(1);
			email.setTheme("lalaaaaaaaa");
			edi.save(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void findByIdTest(){
		
		EmailDaoImpl edi = new EmailDaoImpl();
		try {
			Email email = edi.findById(2);
			System.out.println(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void findByMessageTest(){
		
		EmailDaoImpl edi = new EmailDaoImpl();
		try {
			List<Email> list = edi.findByMessage("大爷");
			for (Email email : list) {
				System.out.println(email);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void findBySenderTest(){
		
		EmailDaoImpl edi = new EmailDaoImpl();
		try {
			List<Email> list = edi.findBySender("王");
			for (Email email : list) {
				System.out.println(email);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void findByReceiverTest(){
		
		EmailDaoImpl edi = new EmailDaoImpl();
		try {
			List<Email> list = edi.findByReceiver("李");
			for (Email email : list) {
				System.out.println(email);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void DeleteTest() {
		EmailDaoImpl edi = new EmailDaoImpl();
		try {
			edi.delete(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
