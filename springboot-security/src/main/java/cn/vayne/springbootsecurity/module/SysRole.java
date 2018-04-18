package cn.vayne.springbootsecurity.module;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/17 下午3:37
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Setter
@Getter
@Entity
public class SysRole {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

}
