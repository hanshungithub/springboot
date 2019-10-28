package cn.hassan.springboot.config;

import cn.hassan.springboot.pojo.Person;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/10/28 11:10
 * Description:
 */
@Configuration
@ComponentScans(
		value = {@ComponentScan(value = "cn.hassan.springboot",
						includeFilters = {
								@Filter(type= FilterType.CUSTOM,classes={ClassTypeFilter.class})
						},
				useDefaultFilters = false
				)
		})
public class CompantScanConfig {

	@Bean
	public Person getPerson() {
		return new Person();
	}
}
