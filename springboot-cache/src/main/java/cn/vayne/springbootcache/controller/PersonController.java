package cn.vayne.springbootcache.controller;

import cn.vayne.springbootcache.manager.impl.PersonManagermpl;
import cn.vayne.springbootcache.module.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

	@RequestMapping(value = "/test")
	public Object test() {
		Person person1 = new Person(1, "wangkun1", 1, "sh");
		Person person2 = new Person(2, "wangkun2", 2, "sh");
		Person person3 = new Person(3, "wangkun3", 3, "sh");
		Person person4 = new Person(4, "wangkun4", 4, "sh");
		Person person5 = new Person(5, "wangkun5", 5, "sh");
		List<Person> people = Arrays.asList(person1, person2, person3, person4, person5);
		people.stream().forEach( e -> {
			personManagermpl.test(e);
		});
		return "ok";
	}


	@RequestMapping(value = "/get")
	public Object get() {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		ArrayList<Person> people = new ArrayList<>();
		integers.stream().forEach(e -> {
			Person p = new Person();
			p.setId(e);
			p = personManagermpl.testGet(p);
			people.add(p);
		});
		return people;
	}

	@RequestMapping(value = "/cls")
	public Object cls() {
		personManagermpl.cls();
		return "ok";
	}
}
