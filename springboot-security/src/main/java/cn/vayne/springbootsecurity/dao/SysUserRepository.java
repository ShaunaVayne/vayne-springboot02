package cn.vayne.springbootsecurity.dao;

import cn.vayne.springbootsecurity.module.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/17 下午4:15
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {

	SysUser findByUsername(String username);

}
