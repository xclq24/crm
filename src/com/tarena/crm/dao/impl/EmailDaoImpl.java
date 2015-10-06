package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.tarena.crm.dao.EmailDao;
import com.tarena.crm.entity.Email;
import com.tarena.crm.entity.User;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;

public class EmailDaoImpl extends BaseDao<Email> implements EmailDao {

	@Override
	public void save(Email email) throws Exception {
		// TODO Auto-generated method stub
		update("insert into email values(null,?,?,?,?,?)",email.toArray());
	}

	@Override
	public List<Email> findAll() throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from email", null);
	}

	@Override
	public void update(Email email) throws Exception {
		// TODO Auto-generated method stub
		Object[] params = email.toArray();
		params = ArrayUtils.add(params, email.getId());
		update("update email set sender=?,receiver=?,theme=?,message=?,time=? where id=?",params);
	}

	@Override
	public Email findById(int id) throws Exception {
		// TODO Auto-generated method stub
		List<Email> list = queryEntity("select * from email where id = ?",
				new Object[] { id });
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<Email> findByMessage(String message) throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from email where message like '%' ? '%' and time is not null", new Object[]{message});
	}

	@Override
	public List<Email> findBySender(String sender) throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from email where sender like '%' ? '%' and time is not null", new Object[]{sender});
	}

	@Override
	public List<Email> findByReceiver(String receiver) throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from email where receiver like '%' ? '%' and time is not null", new Object[]{receiver});
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		update("delete from email where id = ?",new Object[]{id});
	}

	@Override
	public Email toEntity(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		Email email = new Email();
		EntityUtils.fillEntity(rs, email);
		return email;
	}

	@Override
	public List<Email> findAllDraft(String sender) throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from email where sender = ? and time is null",new Object[]{sender});
	}

	@Override
	public void sendDraft(int id) throws Exception {
		// TODO Auto-generated method stub
		update("update email set time = ? where id = ?",new Object[]{new Date(),id});
	}

	@Override
	public List<Email> queryInBox(String classify, String keyword,String receiver)throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("select * from email where receiver = ? and time is not null and "+classify+" like '%' ? '%' ", new Object[]{receiver,keyword});
		//return queryEntity("select * from email ", new Object[]{});
	}

	@Override
	public List<Email> queryOutBox(String classify, String keyword,String sender) throws Exception {
		// TODO Auto-generated method stub
		List<Email> emailList = queryEntity("select * from email where sender = ? and time is not null and "+classify+" like ? ", new Object[]{sender,"%"+keyword+"%"});
		return emailList;
	}

	@Override
	public List<Email> queryDraftBox(String classify, String keyword,
			String sender) throws Exception {
		// TODO Auto-generated method stub
		List<Email> emailList = queryEntity("select * from email where sender = ? and time is null and "+classify+" like '%' ? '%' ", new Object[]{sender,keyword});
		
		return emailList;
	}
	
	
}
