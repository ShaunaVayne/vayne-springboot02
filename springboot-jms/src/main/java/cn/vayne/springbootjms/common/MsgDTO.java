package cn.vayne.springbootjms.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/19 上午10:13
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgDTO implements MessageCreator {

	private String value;

	@Override
	public Message createMessage(Session session) throws JMSException {

		return session.createTextMessage(value);
	}
}
