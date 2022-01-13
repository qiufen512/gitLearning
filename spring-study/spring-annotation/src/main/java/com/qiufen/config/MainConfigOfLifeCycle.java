package com.qiufen.config;

import com.qiufen.bean.Car;
import com.qiufen.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.qiufen.bean")
//@ComponentScan(basePackageClasses = com.qiufen.bean.Cat.class)
public class MainConfigOfLifeCycle {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }

//    @Bean
//    public Cat cat() {
//        return new Cat();
//    }


    /*
    * BeanPostProcessor:
    * postProcessBeforeInitialization:InitializingBean's afterPropertiesSet or a custom init-method
    * 在以上方法前调用
    * postProcessAfterInitialization：InitializingBean's afterPropertiesSet or a custom init-method
    * 在以上方法后调用
    *
    * */

}
