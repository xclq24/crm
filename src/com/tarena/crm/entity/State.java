package com.tarena.crm.entity;

public class State {
	
	private int id;
	private String state;
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Object[] toArray() {
		return new Object[] { state, description };
	}
}
