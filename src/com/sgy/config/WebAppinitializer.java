package com.sgy.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 使用全注解的方式来搭建 ssm 框架
 * @author bupt632
 *
 */

public class WebAppinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// Spring IoC 环境配置
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?> [] {RootConfig.class} ;
	}

	// DispatcherServlet 类配置
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{WebConfig.class};  // 返回数组
	}

	// DispatchServlet 拦截请求配置
	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.do"};
	}
	
	/**
	* @param dynamic Servlet 上传文件配置．
	*/
	@Override
	protected void customizeRegistration(Dynamic dynamic ) {
		String filepath = "d:/project/java_standard";
		//5MB
		Long singleMax = ( long) (5  * Math.pow(2 , 20 ));
		//lOMB
		Long totalMax = (long) (10 * Math.pow(2 , 20 ));
		// 设置上传文件配置
		dynamic.setMultipartConfig (new MultipartConfigElement(filepath, singleMax , totalMax , 0 ));
	}

}
