package cn.vayne.springbootwebsocket.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * @Author: WangKun
 * @Description: 配置WebSocket,继承AbstractWebSocketMessageBrokerConfigurer, 重写方法配置websocket
 * @Date: Created in 2018/3/22 下午7:16
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
	@Override
	public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
		stompEndpointRegistry.addEndpoint("/endpointVayne").withSockJS();
		stompEndpointRegistry.addEndpoint("/endpointChat").withSockJS();
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		registry.enableSimpleBroker("/topic","/queue");
	}
}
