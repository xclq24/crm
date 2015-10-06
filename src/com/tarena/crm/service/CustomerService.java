package com.tarena.crm.service;

import java.util.List;

import com.tarena.crm.entity.Customer;
import com.tarena.crm.entity.User;
import com.tarena.db.Page;

public interface CustomerService {

	public List<Customer> customerList() throws Exception;
	
	public List<Customer> customerList(Page page) throws Exception;

	public List<Customer> allotList() throws Exception;
	
	public void customerDel(String id) throws Exception;

	public void customerAdd(Customer customer) throws Exception;

	public List<Customer> customerSearch(String name) throws Exception;

	public Customer customerSearchById(String id) throws Exception;
	
	public void cunstomerEdit(Customer customer) throws Exception;
	
	public int findCount() throws Exception;
	
	public List<Customer> getBirthdayCustomers() throws Exception;
}
