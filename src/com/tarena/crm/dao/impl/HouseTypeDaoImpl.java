package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import com.tarena.crm.dao.HouseTypeDao;
import com.tarena.crm.entity.HouseType;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;

public class HouseTypeDaoImpl extends BaseDao<HouseType> implements HouseTypeDao {

	@Override
	public void save(HouseType house) throws Exception {
		update("INSERT INTO house_type VALUES(null, ?)", house.toArray());
	}

	@Override
	public List<HouseType> findAll() throws Exception {
		return queryEntity("SELECT * FROM house_type", null);
	}

	@Override
	public void delete(int id) throws Exception {
		update("DELETE FROM house_type WHERE id = ?", new Object[]{ id });
	}

	@Override
	public HouseType findById(int id) throws Exception {
		List<HouseType> list = queryEntity("SELECT * FROM house_type WHERE id = ?", new Object[]{ id });
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public HouseType findByType(String type) throws Exception {
		List<HouseType> list = queryEntity("SELECT * FROM house_type WHERE type = ?", new Object[]{ type });
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public HouseType toEntity(ResultSet rs) throws Exception {
		HouseType house = new HouseType();
		EntityUtils.fillEntity(rs, house);
		return house;
	}
	
}
