package com.tarena.crm.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;

import com.tarena.crm.dao.impl.CareDaoImpl;
import com.tarena.crm.entity.Care;

public class CareDaoTest {
	private CareDaoImpl test = new CareDaoImpl();

	@Test
	public void testTime() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String t = "2015-12-01 00:00:00";
		System.out.println(sdf.parse(t));
	}

	@Test
	public void testSave() throws Exception {
		List<Care> list = test.findByObject("关怀客户2");
		Care c = list.get(0);
		c.setNext(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-12-01 00:00:00"));
		try {
			test.save(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testFindAll() {
		try {
			List<Care> list = test.findAll();
			for (Care s : list) {
				System.out.println(s.getTheme());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testDelete() {
		try {
			test.deleteById(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testFind() {
		try {
			List<Care> list = test.findByObject("关怀客户2");
			System.out.println(list.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
