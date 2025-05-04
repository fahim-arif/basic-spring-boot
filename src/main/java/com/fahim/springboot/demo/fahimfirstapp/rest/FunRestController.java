package com.fahim.springboot.demo.fahimfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // FROM application.properties Injecting 
    @Value("${dev.name}")
    private String devName;

    // EXPOSE / that returns Hello World
    @GetMapping("/")
    public String sayHello() {
        return String.format("Hello World %s", devName);
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run 4KM";
    }

}
