package com.qiufen.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {

    private String name;
    private String price;

    public Phone() {
    }

    public String getName() {
        return name;
    }

    @Value("Iphone")
    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void call(){
        System.out.println("hello~~~");
    }
}
