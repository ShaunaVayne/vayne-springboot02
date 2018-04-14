package cn.vayne.springbootmongodb.controller;

import cn.vayne.springbootmongodb.manager.interfaces.IUserManager;
import cn.vayne.springbootmongodb.module.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/14 下午4:13
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@RestController
@Slf4j
public class UserController {

	@Autowired
	private IUserManager iUserManager;

	@RequestMapping(value = "/set")
	public void set() {
		User user = new User("1", "wangkun", 23);
		iUserManager.save(user);
		iUserManager.stringRdisTemplateDemo();
	}

	@RequestMapping(value = "/getStr")
	public String getString() {
		return iUserManager.getString();
	}

	@RequestMapping(value = "/getUser")
	public User getUser() {
		return iUserManager.getUser();
	}
}
