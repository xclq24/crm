package com.tarena.crm.entity;


public class Allot {
	private int id;
	private String ename;
	private String cname;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	public Object[] toArray() {
		return new Object[] {
				ename,cname
		};
	}
	@Override
	public String toString() {
		return "Allot [id=" + id + ", ename=" + ename + ", cname=" + cname + "]";
	}
	
}
