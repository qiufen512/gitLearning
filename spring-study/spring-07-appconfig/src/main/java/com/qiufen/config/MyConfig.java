package com.qiufen.config;

import com.qiufen.pojo.Phone;
import com.qiufen.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackageClasses = User.class)
public class MyConfig {

    @Bean
    public Phone phone(){
        return new Phone();
    }

    @Bean
    public User user(Phone phone){
//        return new User(phone());
        return new User(phone);
    }

}
