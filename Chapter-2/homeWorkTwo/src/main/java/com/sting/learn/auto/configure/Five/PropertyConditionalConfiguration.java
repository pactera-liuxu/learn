package com.sting.learn.auto.configure.Five;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@Conditional(EnablePropertyConditional.class)
public class PropertyConditionalConfiguration {

    @Bean
    public Long maxLong() {
        return Long.MAX_VALUE;
    }

}
