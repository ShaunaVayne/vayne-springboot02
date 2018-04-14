package cn.vayne.springbootmongodb.manager.impl;

import cn.vayne.springbootmongodb.manager.interfaces.IUserManager;
import cn.vayne.springbootmongodb.module.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/14 下午3:49
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Service
@Slf4j
public class UserManagerImpl implements IUserManager {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Resource(name = "stringRedisTemplate")
	private ValueOperations<String, String> valueOperString;

	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;

	@Resource(name = "redisTemplate")
	private ValueOperations<Object, Object> valueOperObject;

	@Override
	public void stringRdisTemplateDemo() {
		valueOperString.set("xx","yy");
	}

	@Override
	public void save(User user) {
		valueOperObject.set(user.getId(),user);
	}

	@Override
	public String getString() {
		return valueOperString.get("xx");
	}

	@Override
	public User getUser() {
		return (User) valueOperObject.get("1");
	}
}
