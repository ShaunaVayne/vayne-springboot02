package cn.vayne.springbootweb.module;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: WangKun
 * @Description: test 1.0
 * @Date: Created in 2018/3/30 上午10:58
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Data
@AllArgsConstructor
public class Person {

	private String name;

	private String address;

	private Integer age;
}
