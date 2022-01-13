package com.qiufen.demo02;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserService managerService = new ManagerServiceImpl();
        UserServiceProxy userProxy = new UserServiceProxy(userService);
        UserServiceProxy managerProxy = new UserServiceProxy(managerService);
        userProxy.add();
        managerProxy.add();
    }
}
