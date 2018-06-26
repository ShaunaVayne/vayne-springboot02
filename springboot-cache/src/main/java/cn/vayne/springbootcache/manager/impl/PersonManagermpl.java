package cn.vayne.springbootcache.manager.impl;

import cn.vayne.springbootcache.dao.PersonRepository;
import cn.vayne.springbootcache.manager.inter.IPersonManager;
import cn.vayne.springbootcache.module.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/13 上午10:06
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Service
@Slf4j
public class PersonManagermpl implements IPersonManager {

	@Autowired
	private PersonRepository personRepository;

	@Override
	@CachePut(value = "person", key = "#person.id")
	public Person save(Person person) {
		log.info("对象信息id为{}进入缓存",person.getId());
		return person;
		//return personRepository.save(person);
	}

	@Override
	@CacheEvict(value = "person")
	public void remove(Integer id) {
		log.info("id为{}的数据从数据库删除",id);
		//personRepository.delete(id);
	}

	@Override
	@Cacheable(value = "person", key = "#person.id")
	public Person findPerson(Person person) {
		log.info("id为{}的数据从缓存中取出",person.getId());
		return personRepository.findOne(person.getId());
	}

	@Override
	@CachePut(value = "person2", key = "#e.id")
	public Person test(Person e) {
		log.info("id为{}入缓存",e);
		return e;
	}

	@Override
	@Cacheable(value = "person2", key = "#p.id")
	public Person testGet(Person p) {
		log.info("id为{}出缓存",p);
		return p;
	}

	@CacheEvict(value = "person2")
	public void cls() {
		log.info("进方法");
	}
}
