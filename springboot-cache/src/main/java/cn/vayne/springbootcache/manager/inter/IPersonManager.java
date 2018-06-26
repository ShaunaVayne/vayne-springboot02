package cn.vayne.springbootcache.manager.inter;

import cn.vayne.springbootcache.module.Person;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/13 上午10:05
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
public interface IPersonManager {

	Person save(Person person);

	void remove(Integer id);

	Person findPerson(Person person);

	Person test(Person e);

	Person testGet(Person p);
}
