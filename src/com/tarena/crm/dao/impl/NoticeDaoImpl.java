package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.tarena.crm.dao.NoticeDao;
import com.tarena.crm.entity.House;
import com.tarena.crm.entity.Notice;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;

public class NoticeDaoImpl extends BaseDao<Notice> implements NoticeDao {

	@Override
	public void save(Notice notice) throws Exception {
		update("INSERT INTO notice VALUES(null, ?, ?, ?, ?, ?)", notice.toArray());
	}

	@Override
	public List<Notice> findAll() throws Exception {
		return queryEntity("SELECT * FROM notice", null);
	}

	@Override
	public void update(Notice notice) throws Exception {
		Object[] params = notice.toArray();
		params = ArrayUtils.add(params, notice.getId());
		update("UPDATE notice SET name=?, theme=?, time=?, deadline=?, message=? WHERE id = ?",
				params);
	}

	@Override
	public Notice findById(int id) throws Exception {
		List<Notice> list = queryEntity("SELECT * FROM notice WHERE id = ?", new Object[]{ id });
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public Notice findByTheme(String theme) throws Exception {
		List<Notice> list = queryEntity("SELECT * FROM notice WHERE theme = ?", new Object[]{ theme });
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public Notice toEntity(ResultSet rs) throws Exception {
		Notice notice = new Notice();
		EntityUtils.fillEntity(rs, notice);
		return notice;
	}

	@Override
	public List<Notice> queryNoticeList(String classify, String keyword)
			throws Exception {
		// TODO Auto-generated method stub
		return queryEntity("SELECT * FROM notice WHERE "+classify+" like '%' ? '%' ", new Object[]{keyword});
	}
	
}
