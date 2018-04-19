package cn.vayne.springbootjms.manager;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/19 上午11:20
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Service
public class RabbitMqService {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Bean
	public Queue myQueue() {
		return new Queue("my-queue");
	}

	public void run(String value) {
		rabbitTemplate.convertAndSend("my-queue",value);
	}
}
