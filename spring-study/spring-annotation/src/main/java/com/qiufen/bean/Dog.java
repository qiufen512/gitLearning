package com.qiufen.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements ApplicationContextAware{

    private ApplicationContext app;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.app = applicationContext;
    }

    public Dog() {
        System.out.println("dog...constructor...");
    }
    // 对象创建并赋值后

    @PostConstruct
    public void init() {
        System.out.println("dog...PostConstruct...");
    }
    // 容器移除对象前调用

    @PreDestroy
    public void destroy() {
        System.out.println("dog...PreDestroy...");
    }


}
