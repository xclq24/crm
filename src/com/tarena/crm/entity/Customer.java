package com.tarena.crm.entity;

import java.util.Date;

public class Customer {
	private int id;
	private String name;
	private String source;
	private String ename;
	private String position;
	private String type;
	private String gender;
	private String email;
	private Date birthday;
	private String phone;
	private String qq;
	private String addr;
	private String weibo;
	private String tel;
	private String msn;
	private String company;
	private String builder;
	private String modifier;
	private String state;
	private String note;
	private Date createtime;
	private Date modifytime;

	public Customer() {

	}

	public Customer(String name, String source, String position, String type,
			String gender, String email, Date birthday, String phone,
			String qq, String addr, String weibo, String tel, String msn,
			String company, String builder, String modifier, String state,
			String note, Date createtime, Date modifytime) {
		this.name = name;
		this.source = source;
		this.position = position;
		this.type = type;
		this.gender = gender;
		this.email = email;
		this.birthday = birthday;
		this.phone = phone;
		this.qq = qq;
		this.addr = addr;
		this.weibo = weibo;
		this.tel = tel;
		this.msn = msn;
		this.company = company;
		this.builder = builder;
		this.modifier = modifier;
		this.state = state;
		this.note = note;
		this.createtime = createtime;
		this.modifytime = modifytime;
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getWeibo() {
		return weibo;
	}

	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getModifytime() {
		return modifytime;
	}

	public void setModifytime(Date modifytime) {
		this.modifytime = modifytime;
	}

	public Object[] toArray() {
		return new Object[] { name, source, position, type, gender, email,
				birthday, phone, qq, addr, weibo, tel, msn, company, builder,
				modifier, state, note, createtime, modifytime };
	}
	
	public Object[] toEditArray() {
		return new Object[] { source, position, type, gender, email, phone, qq,
				addr, weibo, tel, msn, company, modifier, state, modifytime };
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", source=" + source
				+ ", ename=" + ename + ", position=" + position + ", type="
				+ type + ", gender=" + gender + ", email=" + email
				+ ", birthday=" + birthday + ", phone=" + phone + ", qq=" + qq
				+ ", addr=" + addr + ", weibo=" + weibo + ", tel=" + tel
				+ ", msn=" + msn + ", company=" + company + ", builder="
				+ builder + ", modifier=" + modifier + ", state=" + state
				+ ", note=" + note + ", createtime=" + createtime
				+ ", modifytime=" + modifytime + "]";
	}

	
}
