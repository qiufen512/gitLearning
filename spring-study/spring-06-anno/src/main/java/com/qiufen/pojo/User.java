package com.qiufen.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component = <bean id="user" class="com.qiufen.pojo.User"></bean>
@Component
public class User {

    public String name;

    @Value("泽斌")
    public void setName(String name) {
        this.name = name;
    }
}
