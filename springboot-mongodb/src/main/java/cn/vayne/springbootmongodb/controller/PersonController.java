package cn.vayne.springbootmongodb.controller;

import cn.vayne.springbootmongodb.dao.PersonRepository;
import cn.vayne.springbootmongodb.module.Location;
import cn.vayne.springbootmongodb.module.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/13 下午5:07
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@RestController
@Slf4j
public class PersonController {

	@Autowired
	private PersonRepository personRepository;

	@RequestMapping(value = "/save")
	public Person save() {
		Person person = new Person();
		person.setName("wfk");
		person.setAge(23);
		Location sh = new Location("上海", "2009");
		Location hf = new Location("合肥", "2010");
		Location bj = new Location("北京", "2011");
		Location nj = new Location("南京", "2012");
		Collection<Location> locations = new LinkedHashSet<>();
		locations.add(sh);
		locations.add(hf);
		locations.add(bj);
		locations.add(nj);
		person.setLocations(locations);
		return personRepository.save(person);
	}

	@RequestMapping(value = "/q1")
	public Person q1(String name){
		return personRepository.findByName(name);
	}

	@RequestMapping(value = "/q2")
	public List<Person> q2(Integer age) {
		return personRepository.withQueryFindByAge(age);
	}
}
