package com.tarena.crm.test;

import java.util.List;

import org.junit.Test;

import com.tarena.crm.dao.impl.RecordDaoImpl;
import com.tarena.crm.entity.Record;

public class RecordDaoTest {
	private RecordDaoImpl test = new RecordDaoImpl();

	@Test
	public void testSave() throws Exception {
		List<Record> list = test.findByRecordName("客户1");
		Record record = list.get(0);
		record.setName("你大爷");
		try {
			test.save(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFindAll() {
		try {
			List<Record> list = test.findAll();
			for (Record r : list) {
				System.out.println(r.getName());
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
			List<Record> list = test.findByRecordName("客户1");
			System.out.println(list.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
