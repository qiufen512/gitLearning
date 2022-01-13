package com.qiufen.demo01;

public class Proxy implements Subject{
    private Subject subject;

    public Proxy(Subject subject){
        this.subject=subject;
    }
    @Override
    public void request() {
        System.out.println("Begin");
        subject.request();
        System.out.println("End");
    }
}
