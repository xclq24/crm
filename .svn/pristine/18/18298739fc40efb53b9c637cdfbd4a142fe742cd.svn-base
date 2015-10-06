package com.tarena.crm.test;

import org.junit.Test;

import com.tarena.crm.dao.HouseTypeDao;
import com.tarena.crm.dao.impl.HouseTypeDaoImpl;
import com.tarena.crm.entity.HouseType;

public class HouseTypeDaoTest {
	@Test
	public void test() throws Exception {
		HouseType house = null;
		HouseTypeDao dao = new HouseTypeDaoImpl();
		house = dao.findById(1);
		System.out.println(house.getName());
		house.setName("三室两厅");
		dao.delete(2);
	}
}
