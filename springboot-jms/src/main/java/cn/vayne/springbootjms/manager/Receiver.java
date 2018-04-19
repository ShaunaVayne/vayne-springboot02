package cn.vayne.springbootjms.manager;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/19 上午10:17
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Component
public class Receiver {

	@JmsListener(destination = "my-desination")
	public void receiverMsg(String msg) {
		System.out.println("接收到:<"  +msg+ ">");
	}
}
