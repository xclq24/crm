package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.tarena.crm.dao.HouseDao;
import com.tarena.crm.entity.House;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;

public class HouseDaoImpl extends BaseDao<House> implements HouseDao {

	@Override
	public void save(House house) throws Exception {
		update("INSERT INTO house VALUES(null, ?, ?, ?, ?, ?)", house.toArray());
	}

	@Override
	public List<House> findAll() throws Exception {
		return queryEntity("SELECT * FROM house", null);
	}

	@Override
	public void update(House house) throws Exception {
		Object[] params = house.toArray();
		params = ArrayUtils.add(params, house.getId());
		update("UPDATE house SET type=?, manager=?, address=?, price=?, environment=? WHERE id = ?",
				params);
	}

	@Override
	public House findById(int id) throws Exception {
		List<House> list = queryEntity("SELECT * FROM house WHERE id = ?", new Object[]{ id });
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public House findByType(String type) throws Exception {
		List<House> list = queryEntity("SELECT * FROM house WHERE type = ?", new Object[]{ type });
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public House toEntity(ResultSet rs) throws Exception {
		House house = new House();
		EntityUtils.fillEntity(rs, house);
		return house;
	}

	@Override
	public void delete(int id) throws Exception {
		update("DELETE FROM house WHERE id = ?", new Object[]{ id });
	}

	@Override
	public List<House> queryHouseList(String classify, String keyword)
			throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("SELECT * FROM house WHERE "+classify+" like '%' ? '%'",new Object[]{keyword});
	}
	
}
