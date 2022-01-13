package com.qiufen.ext;

import com.qiufen.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.qiufen.ext")
public class ExtConfig {

    @Bean
    public Car car() {
        return new Car();
    }

}
