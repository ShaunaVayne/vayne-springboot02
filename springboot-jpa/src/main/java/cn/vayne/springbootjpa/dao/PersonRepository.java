package cn.vayne.springbootjpa.dao;

import cn.vayne.springbootjpa.module.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/13 上午10:47
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
