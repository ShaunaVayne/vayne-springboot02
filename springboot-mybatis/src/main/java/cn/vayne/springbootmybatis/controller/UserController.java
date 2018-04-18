package cn.vayne.springbootmybatis.controller;

import cn.vayne.springbootmybatis.manager.interfaces.IUserManager;
import cn.vayne.springbootmybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/18 下午4:14
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@RestController
public class UserController {

	@Autowired
	private IUserManager userManager;

	/**
	 * post方式, 使用json提交
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public int insertPost(@RequestBody() User user) {
		int insert = userManager.insert(user);
		return insert;
	}

	/**
	 * get方法, 参数拼接的方式提交
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/insert")
	public int insert(User user) {
		int insert = userManager.insert(user);
		return insert;
	}

	@RequestMapping(value = "/selectone")
	public User selectByPrimaryKey(Integer id) {
		User user = userManager.selectByPrimaryKey(id);
		return user;
	}

	@RequestMapping(value = "/update")
	public int update(User user) {
		return userManager.updateByPrimaryKeySelective(user);
	}

}
