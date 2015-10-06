package com.tarena.crm.test;

import java.util.List;

import org.junit.Test;

import com.tarena.crm.dao.impl.ContactDaoImpl;
import com.tarena.crm.entity.Contact;

public class ContactDaoTest {
	private ContactDaoImpl test = new ContactDaoImpl();

	@Test
	public void testSave() throws Exception {
		List<Contact> list = test.findByContactName("联系人1");
		Contact c = list.get(0);
		c.setCustomer("你大爷");
		try {
			test.save(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFindAll() {
		try {
			List<Contact> list = test.findAll();
			for (Contact s : list) {
				System.out.println(s.getCustomer());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testDelete() {
		try {
			test.deleteById(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testFind() {
		try {
			List<Contact> list = test.findByContactName("联系人1");
			System.out.println(list.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUpdate() throws Exception{
		List<Contact> list = test.findByContactName("联系人1");
		Contact c = list.get(0);
		c.setPosition("待业");
		test.update(c);
	}
}
