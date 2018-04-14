package cn.vayne.springbootcache.controller;

import cn.vayne.springbootcache.manager.impl.PersonManagermpl;
import cn.vayne.springbootcache.module.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/13 上午10:16
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@RestController
public class PersonController {

	@Autowired
	private PersonManagermpl personManagermpl;

	@RequestMapping(value = "/put")
	public Person put(Person p) {
		return personManagermpl.save(p);
	}

	@RequestMapping(value = "/evit")
	public String evit(Integer id) {
		personManagermpl.remove(id);
		return "ok";
	}

	@RequestMapping(value = "/cacheeble")
	public Person cacheeble(Person person) {
		return personManagermpl.findPerson(person);
	}
}
