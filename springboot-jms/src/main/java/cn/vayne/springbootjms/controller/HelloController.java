package cn.vayne.springbootjms.controller;

import cn.vayne.springbootjms.manager.ActiveMqService;
import cn.vayne.springbootjms.manager.RabbitMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/19 上午10:25
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Controller
public class HelloController {

	@Autowired
	private ActiveMqService activeMqService;

	@Autowired
	private RabbitMqService rabbitMqService;

	@RequestMapping(value = "/index/{value}")
	public String test(@PathVariable("value") String value) {
		activeMqService.run(value);
		return "index";
	}

	@RequestMapping(value = "/amqp/{value}")
	public String test2(@PathVariable("value") String value) {
		rabbitMqService.run(value);
		return "index";
	}

}
