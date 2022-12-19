package com.sting.learn.auto.configure.Four;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.util.ClassUtils;

import java.util.List;

/**
 * Spring自动注入第四种方式：Spring SPI + 条件 方式加载
 */
public class AnnotationDrivenContainer {
    public static void main(String[] args) {
        // 构筑Spring饮用上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 激活Profile
        activeProfile(context);
        // 注册配置类
        registerConfigoration(context);
        // 启动Spring应用上下文
        context.refresh();
        // 依赖查找
        ConditionalConfiguration conditionalConfiguration = context.getBean(ConditionalConfiguration.class);
        System.out.println("Max value is : " + conditionalConfiguration.maxValue());
        // 关闭Spring应用上下文
        context.close();
        // 默认关闭->非阻塞模式
        // 信号关闭->阻塞模式
    }

    private static void activeProfile(AnnotationConfigApplicationContext context) {
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles("test");
    }

    private static void registerConfigoration(AnnotationConfigApplicationContext context) {
        // Spring SPI 来配置所有装配类
        ClassLoader classloder = context.getClassLoader();
        List<String> configurationClassNames = SpringFactoriesLoader.loadFactoryNames(Object.class, classloder);
        // 装配类列表注册到AnnotationConfigApplicationContext
        for (String configurationClassName : configurationClassNames) {
            Class<?> configurationClass = ClassUtils.resolveClassName(configurationClassName, classloder);
            context.register(configurationClass);
        }
    }
}

