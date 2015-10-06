package com.tarena.crm.service.impl;

import java.util.Date;
import java.util.List;

import com.tarena.crm.dao.impl.EmailDaoImpl;
import com.tarena.crm.dao.impl.UserDaoImpl;
import com.tarena.crm.entity.Email;
import com.tarena.crm.entity.User;

public class EmailServiceImpl implements com.tarena.crm.service.EmailService {

	@Override
	public List<Email> outBox(String sender) throws Exception {
		// TODO Auto-generated method stub
		return new EmailDaoImpl().findBySender(sender);
	}

	@Override
	public List<Email> inBox(String receiver) throws Exception {
		// TODO Auto-generated method stub
		return new EmailDaoImpl().findByReceiver(receiver);
	}

	@Override
	public List<Email> draftBox(String sender) throws Exception {
		// TODO Auto-generated method stub
		return new EmailDaoImpl().findAllDraft(sender);
	}

	@Override
	public List<User> writeEmail() throws Exception {
		// TODO Auto-generated method stub
		return new UserDaoImpl().findAll();
	}

	@Override
	public void sendEmail(Email email) throws Exception {
		// TODO Auto-generated method stub
		new EmailDaoImpl().save(email);
	}

	@Override
	public void deleteEmail(int id) throws Exception {
		// TODO Auto-generated method stub
		new EmailDaoImpl().delete(id);	
	}

	@Override
	public void sendDraft(int id) throws Exception {
		// TODO Auto-generated method stub
		new EmailDaoImpl().sendDraft(id);
	}

	@Override
	public List<Email> queryInBox(String classify,String keyword,String receiver) throws Exception {
		// TODO Auto-generated method stub
		List<Email> list = new EmailDaoImpl().queryInBox(classify, keyword, receiver);
		return list;
	}

	@Override
	public Email readEmail(int id) throws Exception {
		// TODO Auto-generated method stub
		return new EmailDaoImpl().findById(id);
	}

	@Override
	public List<Email> queryOutBox(String classify, String keyword,String sender) throws Exception {
		// TODO Auto-generated method stub
		List<Email> list = new EmailDaoImpl().queryOutBox(classify, keyword, sender);
		return list;
	}

	@Override
	public List<Email> queryDraftBox(String classify, String keyword,
			String sender) throws Exception {
		// TODO Auto-generated method stub
		List<Email> list = new EmailDaoImpl().queryDraftBox(classify, keyword, sender);
		return list;
	}
	
	
	

}
