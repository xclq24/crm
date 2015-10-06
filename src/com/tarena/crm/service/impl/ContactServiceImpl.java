package com.tarena.crm.service.impl;

import java.util.List;

import com.tarena.crm.dao.ContactDao;
import com.tarena.crm.dao.impl.ContactDaoImpl;
import com.tarena.crm.entity.Contact;
import com.tarena.crm.service.ContactService;

public class ContactServiceImpl implements ContactService{

	@Override
	public List<Contact> contactList() throws Exception {
		ContactDao contactDao = new ContactDaoImpl();
		List<Contact> list = contactDao.findAll();
		return list;
	}

	@Override
	public void contactDel(String id) throws Exception {
		ContactDao contactDao = new ContactDaoImpl();
		contactDao.deleteById(Integer.parseInt(id));
	}

	@Override
	public void contactAdd(Contact contact) throws Exception {
		ContactDao contactDao = new ContactDaoImpl();
		contactDao.save(contact);
	}

	@Override
	public List<Contact> contactSearch(String name) throws Exception {
		ContactDao contactDao = new ContactDaoImpl();
		List<Contact> list = contactDao.findByContactName(name);
		return list;
	}

	@Override
	public Contact contactSearchById(String id) throws Exception {
		ContactDao contactDao = new ContactDaoImpl();
		Contact contact = contactDao.findContactById(Integer.parseInt(id));
		return contact;
	}

	@Override
	public void contactEdit(Contact contact) throws Exception {
		ContactDao contactDao = new ContactDaoImpl();
		contactDao.update(contact);
	}

}
