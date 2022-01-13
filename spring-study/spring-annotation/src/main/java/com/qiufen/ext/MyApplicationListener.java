package com.qiufen.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener {

    // 当容器中发布ApplicationEvent此类型的事件，该方法会被触发
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("收到事件" + event);
    }
}
