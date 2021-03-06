package com.tarena.crm.entity;

import java.util.Date;

public class Care {
	
	private int id;
	private String theme;
	private String object;
	private Date time;
	private Date next;
	private String way;
	private String people;
	private String note;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Date getNext() {
		return next;
	}
	public void setNext(Date next) {
		this.next = next;
	}
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public Object[] toArray() {
		return new Object[] { theme, object, time, next, way, people, note };
	}
	@Override
	public String toString() {
		return "Care [id=" + id + ", theme=" + theme + ", object=" + object
				+ ", time=" + time + ", next=" + next + ", way=" + way
				+ ", people=" + people + ", note=" + note + "]";
	}
}
