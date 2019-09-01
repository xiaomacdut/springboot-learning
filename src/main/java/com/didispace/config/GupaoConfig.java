package com.didispace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GupaoConfig {

    @Bean
    public GupaoCore gupaoCore(){
        return new GupaoCore();
    }
}
