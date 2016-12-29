package app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import app.service.CustomUserService;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	private CustomUserService userService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(userService);
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		super.configure(web);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
			.anyRequest().authenticated()//所有请求需要认证即登陆后才能访问
			.and()
			.formLogin().loginPage("/login").failureUrl("/login?error").permitAll()//定制登录行为，登录页面可任意访问
			.and()
			.logout().permitAll();//定制注销行为，注销请求可任意访问
		
	}
}
