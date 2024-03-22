package com.javalearning.springboot.demo.learnjava.dependencyInjection;

import org.springframework.stereotype.Component;

public class BasketballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Train ball-handling skills, and shooting from the baseline.";
    }
}
