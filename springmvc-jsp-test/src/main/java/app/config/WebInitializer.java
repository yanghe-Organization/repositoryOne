package app.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
/**
 * web容器配置类
 * @author Administrator
 *
 */

public class WebInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		context.register(SpringMvcConfig.class);
		context.setServletContext(servletContext);
		Dynamic dynServlet=servletContext.addServlet("dispatcher", new DispatcherServlet(context));
		dynServlet.addMapping("/");
		dynServlet.setLoadOnStartup(1);
		dynServlet.setAsyncSupported(true);//开启异步方法支持
		
	}

}
