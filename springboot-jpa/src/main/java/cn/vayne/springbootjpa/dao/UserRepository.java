package cn.vayne.springbootjpa.dao;

import cn.vayne.springbootjpa.module.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/1 下午10:16
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {

	//1
	List<User> findByName(String address);

	//2
	User findByNameAndAddress(String name, String address);

	//3 2
	@Query("select u from User u where u.name = :name and u.address = :address")
	User withNameAndAddressQuery(@Param("name") String name,@Param("address") String address);

	//4
	List<User> withNameAndAddressNamedQuery(String name, String address);

}
