package cn.vayne.springbootjpa.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/9 下午12:03
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Person {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	private Integer age;

	private String address;
}
