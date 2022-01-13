package com.qiufen.aop;

/*
* 业务逻辑类
*
* */
public class MathCalculator {

    public int div(int i, int j) {
        System.out.println("div()被调用...");
        return i / j;
    }

}
