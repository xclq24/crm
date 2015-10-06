package com.tarena.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

/**
 * 配置文件解析器
 */
public class ConfigUtils {
	private Properties config = new Properties();

	public ConfigUtils(String filePath) {
		try {
			// 配置文件加载
			config.load(new FileInputStream(new File(ConfigUtils.class
					.getResource(filePath).toURI())));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

	}

	// 获取配置文件字符串型数据
	public String getString(String key) {
		return config.getProperty(key);
	}

	// 获取配置文件整型数据
	public int getInteger(String key) {
		return Integer.parseInt(config.getProperty(key));
	}

	// 获取配置文件浮点型数据
	public double getDouble(String key) {
		return Double.parseDouble(config.getProperty(key));
	}
}
