package com.qiufen.demo04;

import com.qiufen.demo02.ManagerServiceImpl;
import com.qiufen.demo02.UserService;
import com.qiufen.demo02.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        ManagerServiceImpl managerService = new ManagerServiceImpl();
        //设置要代理的对象
        ProxyInvocationHandler pih = new ProxyInvocationHandler(userService);
        //动态生成代理类
        UserService userProxy = (UserService) pih.getProxy();
        userProxy.query();
    }
}
