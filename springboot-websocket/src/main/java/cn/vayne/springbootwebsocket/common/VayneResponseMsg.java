package cn.vayne.springbootwebsocket.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: WangKun
 * @Description: 服务端向浏览器发送的消息用此类封装
 * @Date: Created in 2018/3/22 下午7:24
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@AllArgsConstructor
@Data
public class VayneResponseMsg {

	private String responseMsg;
}
