package com.javalearning.springboot.demo.learnjava.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExample {

    
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Team name: " + teamName + "\n Coach: " + coachName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/workout")
    public String doWorkOut() {
        return "Doing Workout";
    }

    @GetMapping("/health")
    public String checkHealth() {
        return "Condition: Good";
    }
}
