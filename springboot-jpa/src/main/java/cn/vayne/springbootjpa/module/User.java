package cn.vayne.springbootjpa.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/1 下午10:07
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Data
@Entity
@NamedQuery(name = "User.withNameAndAddressNamedQuery",
			query = "select u from User u where u.name=?1 and u.address=?2")
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	private Integer age;

	private String address;

}
