package cn.vayne.springbootmongodb.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/13 下午4:41
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Person {

	@Id
	private String id;

	private String name;

	private Integer age;

	private Collection<Location> locations = new LinkedHashSet<Location>();
}
