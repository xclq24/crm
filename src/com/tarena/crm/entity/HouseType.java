package com.tarena.crm.entity;

public class HouseType {
	private int id;
	private String name;
	
	public Object[] toArray() {
		return new Object[]{ name };
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HouseType [id=" + id + ", name=" + name + "]";
	}
	
}
