package com.sting.learn.auto.configure.Three;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

@AllArgsConstructor
@NoArgsConstructor
@ComponentScan(basePackages = {"com.acme"})
public class TestConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World";
    }

    @Resource
    public String helloWord3;
}
