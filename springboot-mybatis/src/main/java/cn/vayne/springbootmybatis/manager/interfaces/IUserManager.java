package cn.vayne.springbootmybatis.manager.interfaces;

import cn.vayne.springbootmybatis.model.User;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/18 下午4:11
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
public interface IUserManager {

	int deleteByPrimaryKey(Integer userId);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer userId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}
