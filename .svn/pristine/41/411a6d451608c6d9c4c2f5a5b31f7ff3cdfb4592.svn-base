package com.tarena.crm.test;

import org.junit.Test;

import com.tarena.crm.dao.HouseDao;
import com.tarena.crm.dao.impl.HouseDaoImpl;
import com.tarena.crm.entity.House;

public class HouseDaoTest {
	@Test
	public void test() throws Exception {
		House house = null;
		HouseDao dao = new HouseDaoImpl();
		house = dao.findByType("两室一厅");
		System.out.println(house.getType());
		house.setManager("张三");
//		dao.update(house);
		dao.save(house);
	}
}
