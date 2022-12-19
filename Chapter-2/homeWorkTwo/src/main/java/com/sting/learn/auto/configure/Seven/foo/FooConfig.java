package com.sting.learn.auto.configure.Seven.foo;

import com.sting.learn.auto.configure.Seven.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class FooConfig {
    @Bean
    public TestBean testBeanLiu() {
        return new TestBean("Liu");
    }

    @Bean
    public TestBean testBeanXu() {
        return new TestBean("XU");
    }

    @Bean
    public FooAspect fooAspect() {
        return new FooAspect();
    }
}