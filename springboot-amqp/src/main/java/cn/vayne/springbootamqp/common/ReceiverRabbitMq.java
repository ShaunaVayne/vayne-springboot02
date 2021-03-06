package cn.vayne.springbootamqp.common;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/19 上午11:24
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Component
public class ReceiverRabbitMq {

	@RabbitListener(queues = "my-queue")
	public void receiverMsg(String msg) {
		System.out.println("接收到:<" + msg + ">");
	}
}
