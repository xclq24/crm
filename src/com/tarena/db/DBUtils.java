package com.tarena.db;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;


public class DBUtils {
	private static BasicDataSource dataSource;
	static {
		try {
			ConfigUtils config = new ConfigUtils("/db-config.properties");
			String driverName = config.getString("jdbc.driverName");
			String url = config.getString("jdbc.url");
			String username = config.getString("jdbc.username");
			String password = config.getString("jdbc.password");
			int maxActive = config.getInteger("dbcp.maxActive");
			int maxWait = config.getInteger("dbcp.maxWait");

			dataSource = new BasicDataSource();
			dataSource.setDriverClassName(driverName);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			dataSource.setMaxActive(maxActive);
			dataSource.setMaxWait(maxWait);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws Exception {
		return dataSource.getConnection();
	}

	public static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
