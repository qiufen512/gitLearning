package com.qiufen.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Component
//@Named
public class User {
    private String name;
    private Phone phone;

    public User(Phone phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    @Value(value = "秋分")
    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sayHello() {
        System.out.println(name + "hello");
    }

}
