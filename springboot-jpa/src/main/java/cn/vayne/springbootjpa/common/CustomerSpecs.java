/*
package cn.vayne.springbootjpa.common;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.SingularAttribute;
import java.lang.reflect.Field;
import java.util.ArrayList;

*/
/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/8 下午4:18
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 *//*

public class CustomerSpecs {

	public static <T>Specification<T> byAuto(EntityManager entityManager, T example) {
		Class<?> type = example.getClass();
		return new Specification<T>() {
			@Override
			public Predicate toPredicate(Root<T> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
				ArrayList<Predicate> predicates = new ArrayList<>();
				EntityType<?> entity = entityManager.getMetamodel().entity(type);
				for (Attribute<?, ?> attr : entity.getDeclaredAttributes()) {
					Object attrValue = getValue(example, attr);
					if (attrValue != null) {
						if(attr.getJavaType() == String.class) {
							if(!StringUtils.isEmpty(attrValue)) {
								predicates.add(criteriaBuilder.like(root.get(attrValue(entity,attr.getName(),String.class))));
							}

						}
					}
				}

				return null;
			}


		};
	}

	private static <E,T> SingularAttribute<T,E> attrValue(EntityType<T> entity, String name, Class<E> stringClass) {
		return entity.getDeclaredSingularAttribute(name, stringClass);
	}

	private static <T> Object getValue(T example, Attribute<?, ?> attr) {
		return ReflectionUtils.getField((Field) attr.getJavaMember(), example);
	}

}
*/
