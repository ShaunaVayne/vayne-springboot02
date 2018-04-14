package cn.vayne.springbootwebsocket.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: WangKun
 * @Description: 为ws.html提供便捷的访问映射
 * @Date: Created in 2018/3/27 上午11:31
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/ws").setViewName("/ws");
		registry.addViewController("/login").setViewName("/login");
		registry.addViewController("/test1").setViewName("/test1");
		registry.addViewController("/test2").setViewName("/angular/test2");
	}
}
