package com.sting.learn.auto.configure.Four;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Profile("test")
public class ConditionalConfiguration {

    @Bean
    public Integer maxValue() {
        return Integer.MAX_VALUE;
    }
}
