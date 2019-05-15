package com.sgy.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ ComponentScan(value = "com.*",  includeFilters= {@Filter(type = FilterType.ANNOTATION, value= Controller.class)})
@EnableWebMvc
public class WebConfig {
	/**
	 * 视图解析器
	 * 配置了 viewResolver 的前缀和后缀
	 * @return
	 */
	@Bean(name="internalResourceViewResolver")
	public ViewResolver initViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	/**
	 * 初始化 RequestMappingHandlerAdapter，并加载 http 的 json 转换器
	 * 为了使用 ResponseBody
	 * @return
	 */
	@Bean(name="requestMappingHandlerAdapter")
	public HandlerAdapter initRequestMappingHandlerAdapter() {
		RequestMappingHandlerAdapter rmhd = new RequestMappingHandlerAdapter();
		// 添加 json 转换器
		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		// 添加 MediaType，为啥没有 UTF-8 ？
		MediaType mediaType = MediaType.APPLICATION_JSON;
		// 添加到列表
		List<MediaType> mediaTypes = new ArrayList<MediaType>();
		mediaTypes.add(mediaType);
		// 将 mediaTypes 添加到 jsonConverter 中
		jsonConverter.setSupportedMediaTypes(mediaTypes);
		rmhd.getMessageConverters().add(jsonConverter);
		return rmhd;
	}
}
