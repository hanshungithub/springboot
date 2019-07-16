package cn.hassan.springboot.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("myListener 收到了 myEvent 的消息 ---> " + event.getMsg());
    }
}
