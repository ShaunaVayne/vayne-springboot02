package cn.vayne.springbootmybatis.manager.impl;

import cn.vayne.springbootmybatis.manager.interfaces.IUserManager;
import cn.vayne.springbootmybatis.mapper.UserMapper;
import cn.vayne.springbootmybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/18 下午4:11
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Service
public class UserManagerImpl implements IUserManager {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int deleteByPrimaryKey(Integer userId) {
		return userMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public int insert(User record) {
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

	@Override
	public User selectByPrimaryKey(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}
}
