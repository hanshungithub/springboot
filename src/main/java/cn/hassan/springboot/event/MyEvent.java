package cn.hassan.springboot.event;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    private String msg;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
