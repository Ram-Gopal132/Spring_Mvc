package com.app.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	{
}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]
				{
						AppInitializer.class
				};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 return new Class[] {
		            WebConfig.class
		        };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {
	            "/"
	        };
	}

}
