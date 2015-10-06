package com.tarena.crm.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.tarena.crm.dao.UserDao;
import com.tarena.crm.entity.User;
import com.tarena.db.BaseDao;
import com.tarena.db.EntityUtils;

public class UserDaoImpl extends BaseDao<User> implements UserDao {

	@Override
	public void save(User user) throws Exception {
		update("insert into user(name,age,gender,nation,education,marriage,dept,role,tel,hobby,salary_idcard,phone,idcard,addtime,modifytime,builder,modifier,email,address,username,pwd)" +
				"  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", user.toArray());
	}
//(name,age,gender,nation,education,marriage,dept,role,tel,hobby,salary_idcard,phone,idcard,addtime,builder,modifier,email,address,username,pwd")
	@Override
	public List<User> findAll() throws Exception {
		return queryEntity("select * from user", null);
	}
	
	@Override
	public void update(User user) throws Exception {
		Object[] params = user.toArray2();
		update(
				"update user set age=?,gender=?,nation=?,education=?,marriage=?,dept=?,tel=?,hobby=?,salary_idcard=?,phone=?,idcard=?,modifytime=?,modifier=?,email=?,address=? where id=?",
				params);
	}

	@Override
	public User findById(int id) throws Exception {
		List<User> list = queryEntity("select * from user where id = ?",
				new Object[] { id });
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}


	@Override
	public User findByUsername(String username) throws Exception {
		List<User> list = queryEntity("select * from user where username = ?",
				new Object[] { username });
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	
	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		update("delete from user where id=?",new Object[]{id});
	}
	
	@Override
	public User toEntity(ResultSet rs) throws Exception {
		User user = new User();
		EntityUtils.fillEntity(rs, user);
		return user;
	}
	@Override
	public void modifyPwd(User user) throws Exception {
		update(
				"update user set pwd=? where id=?",
				new Object[]{user.getPwd(),user.getId()});
	}

}
