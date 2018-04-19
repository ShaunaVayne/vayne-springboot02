package cn.vayne.springbootjms.manager;

import cn.vayne.springbootjms.common.MsgDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/19 上午10:28
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Service
public class ActiveMqService {

	@Autowired
	private JmsTemplate jmsTemplate;

	public void run(String value) {
		jmsTemplate.send("my-desination",new MsgDTO(value));
	}
}
