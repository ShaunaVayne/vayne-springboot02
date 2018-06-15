package cn.vayne.springbootjpa.web;

import cn.vayne.springbootjpa.module.Person;
import cn.vayne.springbootjpa.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangKun
 * @Description: 2。0
 * @Date: Created in 2018/4/11 下午10:12
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@RestController
@Slf4j
public class PersonController {

	@Autowired
	private IPersonService iPersonService;

	@RequestMapping(value = "/rollback")
	public Person rollback(Person p) {
		return iPersonService.savePersonWithRollBack(p);
	}

	@RequestMapping(value = "/norollback")
	public Person norollback(Person person) {
		return iPersonService.savePersonWithoutRollBack(person);
	}


}
