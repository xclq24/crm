package com.tarena.minispringmvc.servlet;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

public class EntityUtil {
	public static Object getObject(HttpServletRequest request, Class<?> cls,
			String name) throws Exception {
		// 创建需要封装的对象
		Object obj = cls.newInstance();

		// 获得request中所有要设置属性的东西
		Map<?, ?> requestMap = request.getParameterMap();
		// 获取requestMap中的所有键值
		Set<?> keys = requestMap.keySet();

		// 循环遍历requestMap中key的数据并进行设值主要类型包括String和基本数据类型及其包装类的
		for (Object temp : keys) {
			String key = (String) temp;
			if (!key.startsWith(name)) {
				continue;
			}
			if (StringUtils.countMatches(key, ".") > 1) {
				continue;
			}
			String simpleKey = key.substring(key.indexOf(".") + 1);
			Field field = cls.getDeclaredField(simpleKey);
			field.setAccessible(true);
			String value = request.getParameter(key);
			setValue(field, obj, value);
		}

		return obj;
	}

	private static void setValue(Field field, Object obj, String value)
			throws Exception {
		String fieldType = field.getType().toString();
		if ("class java.lang.String".equals(fieldType)) {
			field.set(obj, value);
		} else if ("int".equals(fieldType)) {
			field.set(obj, Integer.parseInt(value));
		} else if ("class java.lang.Integer".equals(fieldType)) {
			field.set(obj, Integer.valueOf(value));
		} else if ("double".equals(fieldType)) {
			field.set(obj, Double.parseDouble(value));
		} else if ("class java.lang.Double".equals(fieldType)) {
			field.set(obj, Double.valueOf(value));
		} else if ("boolean".equals(fieldType)) {
			field.set(obj, Boolean.parseBoolean(value));
		} else if ("class java.lang.Boolean".equals(fieldType)) {
			field.set(obj, Boolean.valueOf(value));
		} else if ("char".equals(fieldType)) {
			field.set(obj, value.charAt(0));
		} else if ("class java.lang.Character".equals(fieldType)) {
			field.set(obj, Character.valueOf(value.charAt(0)));
		} else if ("long".equals(fieldType)) {
			field.set(obj, Long.parseLong(value));
		} else if ("class java.lang.Long".equals(fieldType)) {
			field.set(obj, Long.valueOf(value));
		} else if ("float".equals(fieldType)) {
			field.set(obj, Float.parseFloat(value));
		} else if ("class java.lang.Float".equals(fieldType)) {
			field.set(obj, Float.valueOf(value));
		} else if ("byte".equals(fieldType)) {
			field.set(obj, Byte.parseByte(value));
		} else if ("class java.lang.Byte".equals(fieldType)) {
			field.set(obj, Byte.valueOf(value));
		} else if ("short".equals(fieldType)) {
			field.set(obj, Short.parseShort(value));
		} else if ("class java.lang.Short".equals(fieldType)) {
			field.set(obj, Short.valueOf(value));
		}
	}
}
