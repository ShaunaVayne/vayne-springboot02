package cn.vayne.springbootmongodb.dao;

import cn.vayne.springbootmongodb.module.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/13 下午5:02
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
public interface PersonRepository extends MongoRepository<Person, String> {

	Person findByName(String name);

	@Query("{'age': ?0}")
	List<Person> withQueryFindByAge(Integer age);
}
