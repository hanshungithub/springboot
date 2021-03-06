package cn.hassan.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublistMsgController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("publishMsg")
    public void publishEvent(String msg) {
        applicationContext.publishEvent(msg);
    }
}
