package cn.vayne.springbootsecurity.config;

import cn.vayne.springbootsecurity.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @Author: WangKun
 * @Description: springboot-security配置
 * @Date: Created in 2018/4/17 下午4:39
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	UserDetailsService customUseService() {//注册CustomerService的Bean
		return new CustomerService();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUseService());//添加自定义的user detail service认证
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.anyRequest().authenticated()//所有请求需要登录后才能访问
				.and()
				.formLogin()
					.loginPage("/login")
					.failureUrl("/login?error")
					.permitAll()//定制登录行为,登录页面可以任意访问
				.and()
				.logout().permitAll();//定制注销行为,注销页面可以任意访问
	}
}
