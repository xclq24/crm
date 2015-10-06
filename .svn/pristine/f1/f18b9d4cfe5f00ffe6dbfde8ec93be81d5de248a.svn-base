package com.tarena.crm.service;

import java.util.List;

import com.tarena.crm.entity.Email;
import com.tarena.crm.entity.User;

public interface EmailService {
	public List<Email> outBox(String sender) throws Exception;
	
	public List<Email> inBox(String receiver) throws Exception;
	
	public List<Email> draftBox(String sender) throws Exception;
	
	public List<User> writeEmail() throws Exception;
	
	public void sendEmail(Email email) throws Exception;
	
	public void deleteEmail(int id) throws Exception;
	
	public void sendDraft(int id) throws Exception;
	
	public List<Email> queryInBox(String classify,String keyword,String receiver)throws Exception;
	
	public List<Email> queryOutBox(String classify,String keyword,String sender)throws Exception;
	
	public List<Email> queryDraftBox(String classify,String keyword,String sender)throws Exception;
	
	public Email readEmail(int id)throws Exception;
}
