package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DanceConfig {
    @Bean
    public Dance danceService(){
        return new DanceService();
    }

    @Bean
    public Dancer dancer(){
        return new Dancer(danceService());
    }
}
