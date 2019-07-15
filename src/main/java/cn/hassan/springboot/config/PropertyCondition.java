package cn.hassan.springboot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/7/15 13:29
 * Description:  ConditionalOnProperty测试类
 */
//@Configuration
//@ConditionalOnProperty(prefix = "property",name = "test",havingValue = "true")
public class PropertyCondition {

	//@Bean
	public Object property() {
		return new Object();
	}
}
