package com.tarena.minispringmvc.servlet;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MiniSpringServlet extends HttpServlet {
	private static final long serialVersionUID = -2105972927786666332L;
	private static Map<String, ClassEntity> MAPPER = new HashMap<String, ClassEntity>();

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			// 配置文件
			Config conf = new Config();
			// 获取扫描路径
			String actionPath = conf.getString("ActionPath");
			String filePath = actionPath.replaceAll("\\.", "/");
			// 加载配置文件
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			URL url = loader.getResource(filePath);
			File actionDir = new File(url.toURI());
			// 遍历获取该包下的所有Action类
			File[] actionClassFiles = actionDir.listFiles();
			for (File file : actionClassFiles) {
				String fileName = file.getName();
				String actionName = actionPath + "."
						+ fileName.substring(0, fileName.lastIndexOf("."));
				// 通过类名反射出Class对象
				Class<?> cls = Class.forName(actionName);
				// 判断是否是Action类
				if (cls.getAnnotation(Action.class) == null) {
					continue;
				}
				// 利用反射创建Action对象
				Object obj = cls.newInstance();
				// 获取该类下的所有方法
				Method[] methods = cls.getDeclaredMethods();
				for (Method method : methods) {
					// 判断是否有RequestPath的标签
					RequestPath requestPath = method
							.getAnnotation(RequestPath.class);
					if (requestPath == null) {
						continue;
					}
					// 获取路径
					String path = requestPath.path();
					// 封装Action的对象和方法
					ClassEntity classEntity = new ClassEntity();
					classEntity.setObj(obj);
					classEntity.setMethod(method);
					// 存放到MAPPER中
					MAPPER.put(path, classEntity);
				}
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			String key = request.getServletPath();
			ClassEntity classEntity = MAPPER.get(key);
			// 如果不存在该路径就结束
			if (classEntity == null) {
				return;
			}
			Method method = classEntity.getMethod();
			Object obj = classEntity.getObj();
			Object resultPath = method.invoke(obj, new Object[] { request,
					response });
			if (resultPath == null) {
				return;
			}
			if (resultPath instanceof String) {
				request.getRequestDispatcher((String) resultPath).forward(
						request, response);
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
