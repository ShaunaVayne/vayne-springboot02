package cn.vayne.springbootjpa.web;

import cn.vayne.springbootjpa.dao.UserRepository;
import cn.vayne.springbootjpa.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/1 下午10:24
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/save")
	public User save(String name, Integer age, String address) {
		User user = userRepository.save(new User(null, name, age, address));
		return user;
	}

	/**
	 * 测试findByAddress
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/q1")
	public List<User> q1(String name) {
		return userRepository.findByName(name);
	}

	/**
	 * 测试findByNameAndAddress
	 * @param name
	 * @param address
	 * @return
	 */
	@RequestMapping(value = "/q2")
	public User q2(String name, String address) {
		return userRepository.findByNameAndAddress(name,address);
	}

	/**
	 * 测试withNameAndAddressQuery
	 * @param name
	 * @param address
	 * @return
	 */
	@RequestMapping(value = "/q3")
	public User q3(String name, String address) {
		return userRepository.withNameAndAddressQuery(name, address);
	}

	/**
	 * 测试withNameAndAddressNamedQuery
	 * @param name
	 * @param address
	 * @return
	 */
	@RequestMapping(value = "/q4")
	public List<User> q4(String name, String address) {
		return userRepository.withNameAndAddressNamedQuery(name, address);
	}

	/**
	 * 测试排序
	 * @return
	 */
	@RequestMapping(value = "/sort")
	public List<User> sort() {
		List<User> users = userRepository.findAll(new Sort(Sort.Direction.DESC, "id"));
		return users;
	}

	/**
	 * 测试分页
	 * @return
	 */
	@RequestMapping(value = "/page")
	public Page<User> page() {
		Page<User> users = userRepository.findAll(new PageRequest(0, 2));
		return users;
	}


}
