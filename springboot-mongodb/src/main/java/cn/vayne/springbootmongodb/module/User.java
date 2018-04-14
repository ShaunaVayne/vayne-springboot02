package cn.vayne.springbootmongodb.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/14 下午3:43
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{

	private static final long serialVersionUID = -2456231857576056918L;

	private String id;

	private String name;

	private Integer age;

}
