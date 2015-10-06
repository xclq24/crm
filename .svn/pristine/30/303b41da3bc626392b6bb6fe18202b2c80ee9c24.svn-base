package com.tarena.crm.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.tarena.crm.dao.DeptDao;
import com.tarena.crm.dao.impl.DeptDaoImpl;
import com.tarena.crm.entity.Dept;
import com.tarena.crm.service.DeptService;

public class DeptServiceImpl implements DeptService{

	@Override
	public List<Dept> DeptList() throws Exception {
		List<Dept> depts = new ArrayList<Dept>();
		DeptDao deptDao = new DeptDaoImpl();
		depts = deptDao.findAll();
		return depts;
	}

	@Override
	public Dept FindById(int id) throws Exception {
		DeptDao deptDao = new DeptDaoImpl();
		Dept dept = deptDao.findById(id);
		return dept;
	}

	@Override
	public void deleteDept(int id) throws Exception {
	}

	@Override
	public void addDept(Dept dept) throws Exception {
		DeptDao deptDao = new DeptDaoImpl();
		deptDao.save(dept);
	}

	@Override
	public Dept FindByName(String name) throws Exception {
		DeptDao deptDao = new DeptDaoImpl();
		Dept dept = deptDao.findByName(name);
		return dept;
	}

	@Override
	public List<Dept> findByText(String name) throws Exception {
		List<Dept> depts = new ArrayList<Dept>();
		DeptDao deptDao = new DeptDaoImpl();
		depts = deptDao.findByText(name);
		return depts;
	}

}
