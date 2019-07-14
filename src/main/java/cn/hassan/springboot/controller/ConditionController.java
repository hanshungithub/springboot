package cn.hassan.springboot.controller;

import cn.hassan.springboot.config.TestCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
@Conditional(TestCondition.class)
public class ConditionController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "world";
    }
}
