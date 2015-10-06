package com.tarena.crm.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.tarena.crm.dao.CustomerDao;
import com.tarena.crm.dao.impl.CustomerDaoImpl;
import com.tarena.crm.entity.Customer;
import com.tarena.crm.service.CustomerService;
import com.tarena.db.Page;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<Customer> customerList() throws Exception {
		CustomerDao customerDao = new CustomerDaoImpl();
		List<Customer> list = customerDao.findAll();
		return list;
	}
	
	@Override
	public List<Customer> customerList(Page page) throws Exception {
		CustomerDao customerDao = new CustomerDaoImpl();
		List<Customer> list = customerDao.findAll(page);
		return list;
	}

	@Override
	public void customerDel(String id) throws Exception {
		CustomerDao customerDao = new CustomerDaoImpl();
		customerDao.deleteById(Integer.parseInt(id));
		
	}

	@Override
	public void customerAdd(Customer customer) throws Exception {
		CustomerDao customerDao = new CustomerDaoImpl();
		customerDao.save(customer);
	}

	@Override
	public List<Customer> customerSearch(String name) throws Exception {
		CustomerDao customerDao = new CustomerDaoImpl();
		List<Customer> list = customerDao.findByname(name);
		return list;
	}

	@Override
	public Customer customerSearchById(String id) throws Exception {
		CustomerDao customerDao = new CustomerDaoImpl();
		Customer customer = customerDao.findById(Integer.parseInt(id));
		return customer;
	}

	@Override
	public List<Customer> allotList() throws Exception {
		CustomerDao customerDao = new CustomerDaoImpl();
		List<Customer> list = customerDao.findAllot();
		return list;
	}

	@Override
	public void cunstomerEdit(Customer customer) throws Exception {
		CustomerDao customerDao = new CustomerDaoImpl();
		customerDao.update(customer);
	}

	@Override
	public int findCount() throws Exception {
		CustomerDao customerDao = new CustomerDaoImpl();
		return customerDao.count();
	}

	@Override
	public List<Customer> getBirthdayCustomers() throws Exception {
		// TODO Auto-generated method stub
		List<Customer> cList = customerList();
		
		Iterator<Customer> it = cList.iterator();
		while (it.hasNext()) {
			Customer c = it.next();
			
			Calendar c1 = Calendar.getInstance();
			c1.setTime(c.getBirthday());
			int day1 = c1.get(Calendar.DAY_OF_YEAR);
			
			Calendar c2 = Calendar.getInstance();
			c2.setTime(new Date());
			int day2 = c2.get(Calendar.DAY_OF_YEAR);
			
			if(day1<day2){
				it.remove();
			}
		}
		
		return cList;
	}

}
