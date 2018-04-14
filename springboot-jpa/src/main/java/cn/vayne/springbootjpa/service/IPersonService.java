package cn.vayne.springbootjpa.service;

import cn.vayne.springbootjpa.module.Person;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/10 下午8:34
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
public interface IPersonService {

	Person savePersonWithRollBack(Person person);

	Person savePersonWithoutRollBack(Person person);
}
