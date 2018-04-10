package com.jinhe.smart.initializer;



import java.nio.charset.Charset;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jinhe.smart.utils.Consts;
import com.jinhe.smart.utils.PropertiesUtils;
import com.jinhe.smart.utils.SpringUtils;

/**
 * @author lazyeraser spring bean配置
 */
@Configuration
public class BeanConfig {

	/**
	 * @return 注入用于获取Spring上下文和bean的工具类
	 */
	@Bean
	public SpringUtils springUtils() {
		return new SpringUtils();
	}

	/**
	 * @return 配置JSP视图解析器
	 */
/*	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}*/

	/**
	 * @return GoogleGson Json转换
	 */
	@Bean
	public Gson gson() {
		Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		return gson;
	}

	/**
	 * @param gson
	 * @return 使用Gson作为json转换器
	 */
	@Bean
	public GsonHttpMessageConverter jsonConverter(Gson gson) {
		GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
		converter.setGson(gson);
		converter.setDefaultCharset(Charset.forName(PropertiesUtils.GetString(Consts.CONFIG_ENCODING)));
		converter.setSupportedMediaTypes(
				Arrays.asList(new MediaType("application", "json"), new MediaType("text", "html")));
		return converter;
	}


}
