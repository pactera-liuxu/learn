package com.sting.learn.auto.configure.Seven;

import com.sting.learn.auto.configure.Seven.foo.FooConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@Slf4j
public class ContextXMLConfiguration implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(ContextXMLConfiguration.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FooConfig.class);
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}, applicationContext);
        TestBean bean = applicationContext.getBean("testBeanLiu", TestBean.class);
        bean.hello();
        log.info("=============");
        bean = classPathXmlApplicationContext.getBean("testBeanLiu", TestBean.class);
        bean.hello();
        bean = classPathXmlApplicationContext.getBean("testBeanXu", TestBean.class);
        bean.hello();
    }
}
