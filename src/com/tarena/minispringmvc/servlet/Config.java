package com.tarena.minispringmvc.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

public class Config {
	private Properties properties = new Properties();

	public Config() {
		try {
			properties.load(new FileInputStream(new File(Config.class
					.getResource("/MiniSpring.properties").toURI())));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public Config(String path) {
		try {
			properties.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getInt(String key) {
		return Integer.parseInt(properties.getProperty(key));
	}

	public String getString(String key) {
		return properties.getProperty(key);
	}

	public double getDouble(String key) {
		return Double.parseDouble(properties.getProperty(key));
	}
}
