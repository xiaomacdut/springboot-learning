package com.xiaoma.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public MyCore gupaoCore(){
        return new MyCore();
    }
}
