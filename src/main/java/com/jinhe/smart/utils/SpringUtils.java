package com.jinhe.smart.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author lazyeraser
 * Spring工具，获取上下文Context等
 */
public class SpringUtils implements ApplicationContextAware {
	
	private static ApplicationContext applicationContext = null;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		if (SpringUtils.applicationContext == null) {
			SpringUtils.applicationContext = applicationContext;
		}
	}

	
	/**
	 * @return Spring上下文
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * @param name bean名
	 * @return 根据名称获取bean
	 */
	public static Object getBean(String name) {
		return getApplicationContext().getBean(name);

	}

	/**
	 * @param c1ass 类
	 * @return 根据class获取bean
	 */
	public static <T> T getBean(Class<T> c1ass) {
		return getApplicationContext().getBean(c1ass);
	}

	/**
	 * @param name bean名
	 * @param c1ass 类
	 * @return 根据名称和类获取bean
	 */
	public static <T> T getBean(String name, Class<T> c1ass) {
		return getApplicationContext().getBean(name, c1ass);
	}
}
