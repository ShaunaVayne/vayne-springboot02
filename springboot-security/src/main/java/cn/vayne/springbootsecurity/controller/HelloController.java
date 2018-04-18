package cn.vayne.springbootsecurity.controller;

import cn.vayne.springbootsecurity.common.Msg;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/17 下午10:38
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@RestController
public class HelloController {

	@RequestMapping(value = "/")
	public ModelAndView toIndex() {
		ModelAndView modelAndView = new ModelAndView("index");
		Msg msg = new Msg("测试标题", "测试内容", "额外信息只对管理员展示");
		modelAndView.addObject("msg", msg);
		return modelAndView;
	}
}
