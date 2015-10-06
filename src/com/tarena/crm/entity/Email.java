package com.tarena.crm.entity;

import java.util.Date;

public class Email {
	private int id;
	private String sender;
	private String receiver;
	private String theme;
	private String message;
	private Date time;
	
	public Object[] toArray() {
		return new Object[]{ sender, receiver, theme, message, time };
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Email [id=" + id + ", sender=" + sender + ", receiver="
				+ receiver + ", theme=" + theme + ", message=" + message
				+ ", time=" + time + "]";
	}
	
	
}
