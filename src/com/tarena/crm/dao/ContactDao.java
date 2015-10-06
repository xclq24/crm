package com.tarena.crm.dao;

import java.util.List;

import com.tarena.crm.entity.Contact;

public interface ContactDao {
	public void save(Contact contact) throws Exception;

	public List<Contact> findAll() throws Exception;

	public void update(Contact contact) throws Exception;
	
	public void deleteById(int id) throws Exception;

	public List<Contact> findByContactName(String name) throws Exception;
	
	public Contact findContactById(int id) throws Exception;
}
