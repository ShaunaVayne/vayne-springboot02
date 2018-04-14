package cn.vayne.springbootjpa.service.impl;

import cn.vayne.springbootjpa.dao.PersonRepository;
import cn.vayne.springbootjpa.module.Person;
import cn.vayne.springbootjpa.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/10 下午8:36
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	@Transactional(rollbackFor = IllegalArgumentException.class)
	public Person savePersonWithRollBack(Person person) {
		Person pr = personRepository.save(person);
		if(person.getName().equals("vayne")) {
			throw  new IllegalArgumentException("vayne用户已经存在,数据rollBack");
		}
		return pr;
	}

	@Override
	@Transactional(noRollbackFor = IllegalArgumentException.class)
	public Person savePersonWithoutRollBack(Person person) {
		Person pr = personRepository.save(person);
		if(person.getName().equals("vayne")) {
			throw new IllegalArgumentException("vayne用户已经存在,但数据notRollBack");
		}
		return pr;
	}
}
