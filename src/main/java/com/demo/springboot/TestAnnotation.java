package com.demo.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class TestAnnotation {
    public TestAnnotation(){
        System.out.println("Default construct");
    }


    @Bean
    public void test(){
        System.out.println("confi-bean");
    }
}
