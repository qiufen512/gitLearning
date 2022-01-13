package com.qiufen.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {
    /** 
    * @Description:  
    * @Param: [method:要执行的目标对象的方法, objects：参数, target：目标对象]
    * @return: void 
    * @Author: 泽斌
    * @Date: 2021/8/6 
    */ 
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
