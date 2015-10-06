package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.tarena.crm.dao.ContactDao;
import com.tarena.crm.entity.Contact;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;

public class ContactDaoImpl extends BaseDao<Contact> implements ContactDao {

	@Override
	public Contact toEntity(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Contact contact = new Contact();
		EntityUtils.fillEntity(rs, contact);
		return contact;
	}

	@Override
	public void save(Contact contact) throws Exception {
		// TODO Auto-generated method stub
		update("insert into contact values (null,?,?,?,?,?,?,?)",
				contact.toArray());
	}

	@Override
	public List<Contact> findAll() throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from contact", null);
	}

	@Override
	public void deleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		update("delete from contact where id = ?", new Object[] { id });
	}

	@Override
	public List<Contact> findByContactName(String name) throws Exception {
		// TODO Auto-generated method stub
		return queryEntity(
				"select * from contact where name like '%' ? '%'", new Object[] { name });
	
	}

	@Override
	public void update(Contact contact) throws Exception {
		// TODO Auto-generated method stub
		Object[] params = contact.toEditArray();
		params = ArrayUtils.add(params, contact.getId());
		update("update contact set customer=?, gender=?, age=?, position=?, phone=?, relation=? where id = ?",
				params);
	}

	@Override
	public Contact findContactById(int id) throws Exception {
		List<Contact> list = queryEntity("select * from contact where id = ?", new Object[]{ id });
		if(list.size() > 0){
			return list.get(0);
		}
		return null;
	}

}
