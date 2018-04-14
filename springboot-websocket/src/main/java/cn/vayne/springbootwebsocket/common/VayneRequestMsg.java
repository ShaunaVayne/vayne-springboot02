package cn.vayne.springbootwebsocket.common;

import lombok.Data;

/**
 * @Author: WangKun
 * @Description: 浏览器向服务端发送消息用此类接收
 * @Date: Created in 2018/3/22 下午7:23
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Data
public class VayneRequestMsg {

	private String name;
}
