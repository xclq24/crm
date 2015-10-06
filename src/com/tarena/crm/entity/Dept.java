package com.tarena.crm.entity;

public class Dept {
	private int id;
	private String name;
	private String description;
	
	public Object[] toArray(){
		return new Object[]{name,description};
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}
	
	
}
