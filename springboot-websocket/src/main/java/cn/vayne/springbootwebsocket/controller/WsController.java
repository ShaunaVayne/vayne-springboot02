package cn.vayne.springbootwebsocket.controller;

import cn.vayne.springbootwebsocket.common.VayneRequestMsg;
import cn.vayne.springbootwebsocket.common.VayneResponseMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/3/22 下午7:27
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Slf4j
@Controller
public class WsController {

	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;

	@MessageMapping("/chat")
	public void chat(Principal principal, String msg) {
		if(principal.getName() .equals("vayne")) {
			simpMessagingTemplate.
					convertAndSendToUser("wangkun","/queue/notifications", principal.getName() + "-send:" + msg);
		}else {
			simpMessagingTemplate.
					convertAndSendToUser("vayne","/queue/notifications",principal.getName() + "-send:" + msg);
		}
	}

	@MessageMapping("/welcome")
	@SendTo("/topic/getResponse")
	public VayneResponseMsg say(VayneRequestMsg msg) throws Exception {
		Thread.sleep(1000);
		log.info("browser message is {}" , msg.getName());
		return new VayneResponseMsg("welcome" + msg.getName() + "!");
	}

}
