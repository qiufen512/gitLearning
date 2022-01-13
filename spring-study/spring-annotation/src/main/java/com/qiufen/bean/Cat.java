package com.qiufen.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Cat implements InitializingBean, DisposableBean {

    public Cat() {
        System.out.println("cat...constructor...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("cat...destroy...");
    }

    // bean创建完成并且属性赋值好调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat...afterPropertiesSet...");
    }
}
