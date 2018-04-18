package cn.vayne.springbootsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: WangKun
 * @Description: SpringMvc配置
 * @Date: Created in 2018/4/17 下午4:25
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
	}
}
