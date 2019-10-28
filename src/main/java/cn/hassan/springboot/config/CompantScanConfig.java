package cn.hassan.springboot.config;

import cn.hassan.springboot.pojo.Person;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/10/28 11:10
 * Description:
 * 
 *   *@ComponentScan  value:指定要扫描的包
 *  excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
 *  includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件
 *  FilterType.ANNOTATION：按照注解
 *  FilterType.ASSIGNABLE_TYPE：按照给定的类型；
 *  FilterType.ASPECTJ：使用ASPECTJ表达式
 *  FilterType.REGEX：使用正则指定
 *  FilterType.CUSTOM：使用自定义规则
 */
//@Configuration
//@ComponentScans(
//		value = {@ComponentScan(value = "cn.hassan.springboot",
//						includeFilters = {
//								@Filter(type= FilterType.CUSTOM,classes={ClassTypeFilter.class})
//						},
//				useDefaultFilters = false
//				)
//		})
public class CompantScanConfig {

	//@Bean("person")
	public Person getPerson() {
		return new Person();
	}
}
