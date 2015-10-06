package com.tarena.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDao<E> {
	/**
	 * 通用查询方法
	 * 
	 * @param sql
	 * @param params
	 * @return
	 * @throws Exception
	 */
	protected List<E> queryEntity(String sql, Object[] params) throws Exception {
		Connection con = null;
		try {
			con = DBUtils.getConnection();
			ResultSet rs = baseQuery(con, sql, params);
			List<E> list = new ArrayList<E>();
			while (rs.next()) {
				list.add(toEntity(rs));
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtils.closeConnection(con);
		}
	}

	/**
	 * 设置参数
	 * 
	 * @param con
	 *            链接
	 * @param sql
	 *            SQL语句
	 * @param params
	 *            参数
	 * @return 结果集
	 * @throws Exception
	 */
	private ResultSet baseQuery(Connection con, String sql, Object[] params)
			throws Exception {
		PreparedStatement pstmt = con.prepareStatement(sql);
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				pstmt.setObject(i + 1, params[i]);
			}
		}
		return pstmt.executeQuery();
	}

	/**
	 * 封装所有更改语句
	 * 
	 * @param sql
	 *            SQL语句
	 * @param params
	 *            参数
	 * @throws Exception
	 */
	protected void update(String sql, Object[] params) throws Exception {
		Connection con = null;
		try {
			con = DBUtils.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					stmt.setObject(i + 1, params[i]);
				}
			}
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtils.closeConnection(con);
		}
	}

	/**
	 * 开启事务
	 * 
	 * @throws Exception
	 */
	public void begin() throws Exception {
		Connection con = DBUtils.getConnection();
		con.setAutoCommit(false);
	}

	/**
	 * 提交
	 * 
	 * @throws Exception
	 */
	public void commit() throws Exception {
		Connection con = DBUtils.getConnection();
		con.commit();
	}

	/**
	 * 回滚
	 * 
	 * @throws Exception
	 */
	public void rollback() throws Exception {
		Connection con = DBUtils.getConnection();
		con.rollback();
	}

	/**
	 * 不同的子类用不同的方式把结果集中的数据转换成实体对象
	 * 
	 * @param rs
	 *            结果集
	 * @return 实体对象
	 * @throws Exception
	 */
	public abstract E toEntity(ResultSet rs) throws Exception;
}
