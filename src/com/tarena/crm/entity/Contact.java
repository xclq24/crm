package com.tarena.crm.entity;

public class Contact {
	
	private int id;
	private String customer;
	private String name;
	private String gender;
	private int age;
	private String position;
	private String phone;
	private String relation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	public Object[] toArray(){
		return new Object[]{customer, name, gender, age, position, phone, relation};
	}
	
	public Object[] toEditArray(){
		return new Object[]{customer, gender, age, position, phone, relation};
	}
}
