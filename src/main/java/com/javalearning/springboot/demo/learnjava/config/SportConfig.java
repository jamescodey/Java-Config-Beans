package com.javalearning.springboot.demo.learnjava.config;

import com.javalearning.springboot.demo.learnjava.dependencyInjection.BasketballCoach;
import com.javalearning.springboot.demo.learnjava.dependencyInjection.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("basketball")
    public Coach basketballCoach() {
        return new BasketballCoach();
    }
}
