package cn.hassan.springboot.config;

import org.springframework.context.annotation.*;

@Configuration
@Conditional(TestCondition.class)
public class ConditionConfiguration {

    @Bean
    @Conditional(TestCondition.class)
    public Object testObject() {
        return new Object();
    }
}
