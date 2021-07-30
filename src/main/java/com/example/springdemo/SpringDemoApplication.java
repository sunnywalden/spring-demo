package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@RestController
public class SpringDemoApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(SpringDemoApplication.class, args);
//    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "SunnyWalden") String name) {
        return String.format("Welcome %s!", name);
    }
}
