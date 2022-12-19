package com.sting.learn.auto.configure.Two;

import com.sting.learn.auto.configure.Two.TestConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ServiceLoader;

/**
 * Spring自动注入第二种方式：Java SPI 方式加载
 */
public class AnnotationDrivenContainer {
    public static void main(String[] args) {
        // 构筑Spring饮用上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册配置类
        // context.register(TestConfiguration.class);
        registerConfigoration(context);
        // 启动Spring应用上下文
        context.refresh();
        // 依赖查找
        String helloWorldBean = context.getBean("helloWorld", String.class);
        System.out.println(helloWorldBean);

        System.out.println(context.getBean(TestConfiguration.class).helloWord3);
        // 关闭Spring应用上下文
        context.close();
        // 默认关闭->非阻塞模式
        // 信号关闭->阻塞模式
    }

    private static void registerConfigoration(AnnotationConfigApplicationContext context) {
        // 利用JAVA SPI 来配置所有装配类
        ClassLoader classloder = context.getClassLoader();
        ServiceLoader<Object> serviceLoader = ServiceLoader.load(Object.class, classloder);
        // 装配类列表注册到AnnotationConfigApplicationContext
        for (Object configuration : serviceLoader) {
            Class<?> configurationClass = configuration.getClass();
            context.register(configurationClass);
        }
    }
}

