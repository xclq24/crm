package com.tarena.crm.service;

import java.util.List;

import com.tarena.crm.entity.Contact;

public interface ContactService {

	public List<Contact> contactList() throws Exception;

	public void contactDel(String id) throws Exception;

	public void contactAdd(Contact contact) throws Exception;

	public List<Contact> contactSearch(String name) throws Exception;

	public Contact contactSearchById(String id) throws Exception;
	
	public void contactEdit(Contact contact) throws Exception;
}
