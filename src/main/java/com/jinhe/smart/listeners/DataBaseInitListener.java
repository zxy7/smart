package com.jinhe.smart.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.jinhe.smart.utils.db.DBUtils;


public class DataBaseInitListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {

	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		DBUtils.getInstance();
		if (event != null){
			event.getServletContext().log("DB inited");
		}
	}

}
