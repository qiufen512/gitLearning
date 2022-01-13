package com.qiufen.config;

import com.qiufen.aop.LogAspects;
import com.qiufen.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfAOP {


    // 将切面类和业务逻辑类加入到容器
    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }


    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }


}
