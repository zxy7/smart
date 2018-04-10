package com.jinhe.smart.listeners;

import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.jinhe.smart.utils.Consts;
import com.jinhe.smart.utils.PropertiesUtils;

public class PropertiesSessionListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		loadConfig(event);
	}
	
	public static void loadConfig(ServletContextEvent event) {
		// TODO Auto-generated method stub
		PropertiesUtils.pps = new Properties();
		
		try {			
			InputStream is = PropertiesSessionListener.class.getClassLoader().getResourceAsStream(Consts.CONFIG_FILE_NAME);
			PropertiesUtils.pps.load(is);
			PropertiesUtils.loaded();
			Consts.isDebug = PropertiesUtils.GetBoolean(Consts.CONFIG_DEBUGMODE);
			if (event != null){
				event.getServletContext().log("properties load.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}