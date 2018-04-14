package cn.vayne.springbootcache.dao;

import cn.vayne.springbootcache.module.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/9 下午12:24
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
