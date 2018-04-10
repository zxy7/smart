package com.jinhe.smart.initializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.jinhe.smart.listeners.PropertiesSessionListener;
import com.jinhe.smart.utils.Consts;
import com.jinhe.smart.utils.PropertiesUtils;
import com.jinhe.smart.utils.TextUtils;
import com.jinhe.smart.utils.Utils;

//spring容器启动时初始化类
public class WebAppInit implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		PropertiesSessionListener.loadConfig(null);
		String encodingType = PropertiesUtils.GetString(Consts.CONFIG_ENCODING);
		if (!TextUtils.isEmpty(encodingType)) {
			FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("encodingFilter",
					CharacterEncodingFilter.class);
			encodingFilter.setInitParameter("forceEncoding", "true");
			encodingFilter.setInitParameter("encoding", encodingType);
			encodingFilter.addMappingForUrlPatterns(null, false, "/*"); // 使用/*包含jsp等页面，进行全局编码
			Utils.mPrint("编码类型", encodingType);
		}

	}

}
