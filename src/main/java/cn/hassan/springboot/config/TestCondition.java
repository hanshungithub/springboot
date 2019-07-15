package cn.hassan.springboot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
public class TestCondition implements Condition {

	@SuppressWarnings("unchecked")
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		boolean annotated = metadata.isAnnotated(Conditional.class.getName());
		if (annotated) {
			MultiValueMap<String, Object> attributes = metadata.getAllAnnotationAttributes(Conditional.class.getName(), true);
			Object values = (attributes != null ? attributes.get("value") : null);
			List<String[]> list = (List<String[]>) (values != null ? values : Collections.emptyList());
			for (String[] strings : list) {
				for (String string : strings) {
					if (string.equalsIgnoreCase(getClass().getName())) {
						return true;
					}
				}
			}
		}
		return false;
    }
}
