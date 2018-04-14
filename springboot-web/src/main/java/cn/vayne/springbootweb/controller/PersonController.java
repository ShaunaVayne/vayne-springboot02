package cn.vayne.springbootweb.controller;

import cn.vayne.springbootweb.module.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/3/30 上午10:56
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@RestController
@Slf4j
public class PersonController {

	@RequestMapping(value = "/search", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Person search(String personName) {
		return new Person(personName,"shanghai",23);
	}

}
