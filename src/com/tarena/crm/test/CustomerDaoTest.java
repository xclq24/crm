package com.tarena.crm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.tarena.crm.dao.impl.CustomerDaoImpl;
import com.tarena.crm.entity.Customer;

public class CustomerDaoTest {
	private CustomerDaoImpl test = new CustomerDaoImpl();
	@Test
	public void testSave(){
		Customer c = new Customer();
		c.setName("董小姐");
		c.setSource("自己上门");
		c.setPosition("女屌丝");
		c.setType("供应商");
		c.setGender("男");
		c.setEmail("123@qq.com");
		java.util.Date d = new java.util.Date();
		Date date = new Date(d.getTime());
		c.setBirthday(date);
		c.setPhone("12345");
		c.setQq("123456");
		c.setAddr("火星");
		c.setWeibo("火星来的额");
		c.setTel("6666");
		c.setMsn("呜呼哈哈哈");
		c.setCompany("大公司");
		c.setBuilder("老李");
		c.setModifier("老王");
		c.setState("潜在客户");
		c.setNote("我是备注");
		c.setCreatetime(new Date());
		c.setModifytime(new Date());
		try {
			test.save(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testFindAll(){
		try {
			List<Customer> list = test.findAll();
			for(Customer s : list){
				System.out.println(s.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testDelete(){
		try {
			test.deleteById(5);
			System.out.println("成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testUpdate() {
		try {
			Customer c = test.findById(2);
			c.setName("嘿嘿");
			test.update(c);
			System.out.println("修改成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testFind(){
		try {
			List<Customer> list = test.findByname("董小姐");
			System.out.println(list.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
