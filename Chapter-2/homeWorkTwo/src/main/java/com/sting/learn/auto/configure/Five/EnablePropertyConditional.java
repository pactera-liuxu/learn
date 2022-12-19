package com.sting.learn.auto.configure.Five;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 是否激活 Spring 属性配置条件
 */
public class EnablePropertyConditional implements Condition {

    private static final String PROPERTY_NAME = "enabled";

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        boolean enabled = environment.getProperty(PROPERTY_NAME, boolean.class, false);
        return enabled;
    }
}
