package cn.vayne.springbootmongodb.manager.interfaces;

import cn.vayne.springbootmongodb.module.User;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/14 下午3:47
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
public interface IUserManager {

	void stringRdisTemplateDemo();

	void save(User user);

	String getString();

	User getUser();
}
