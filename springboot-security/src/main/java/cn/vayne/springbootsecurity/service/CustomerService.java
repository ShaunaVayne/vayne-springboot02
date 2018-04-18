package cn.vayne.springbootsecurity.service;

import cn.vayne.springbootsecurity.dao.SysUserRepository;
import cn.vayne.springbootsecurity.module.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/17 下午4:19
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Slf4j
public class CustomerService implements UserDetailsService {

	@Autowired
	private SysUserRepository sysUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("请求参数:{}",username);
		SysUser sysUser = sysUserRepository.findByUsername(username);
		Optional.ofNullable(sysUser).orElseThrow(() -> new UsernameNotFoundException("用户名不存在"));
		return sysUser;
	}
}
