package com.sting.learn.auto.configure.One;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@AllArgsConstructor
@NoArgsConstructor
public class TestConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World";
    }

    @Resource
    public String helloWord3;
}
