package com.sting.learn.auto.configure.One;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

/**
 * Spring自动注入第一种方式：通过上下文依赖注入完成加载
 */
public class AnnotationDrivenContainer {
    public static void main(String[] args) {
        // 构筑Spring饮用上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册配置类
        context.register(TestConfiguration.class);
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
}

