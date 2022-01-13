package com.qiufen.demo01;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("RealSubject!");
    }
}
