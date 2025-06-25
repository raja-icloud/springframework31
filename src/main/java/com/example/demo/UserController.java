package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


class UserRequest {
    private String name;

    public UserRequest() {

    }

    public UserRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@RestController
@RequestMapping("/user-controller")
@CrossOrigin("*")
public class UserController {

    
    @Autowired
    User user;
    
    @PostMapping("/get-api/{username}")
    public  Map<String, Object> getAPI(
        @RequestBody UserRequest userRequest, 
        @PathVariable String username, 
        @RequestParam String address) {

        Map<String, Object> obj = Map.of(
            "RequestBody", userRequest, 
            "PathVariable", username, 
            "RequestParam", address
        );
        return obj;
    }
    
}

// @SpringBootApplication --> @ComponentScan, @EnableAutoConfiguration, @SpringBootConfiguration
// @RestController ---> We can create an rest controller for rest api
// @Controller ----> We can send a response of template engine like JSP or Thymeleaf
// @RequestMapping ---> We can provide base api url in controller level
// @GetMapping, @PostMapping, @PutMapping, @PatchMapping, @DeleteMapping --> to mention the request method of an api
// @RequestBody, @PathVariable, @RequestParam ---> to get input from client

// @Service, @Bean, @Async, @Shedule, @Entity, @Table, @Id, @Generated, @Table
// @OneToMany, @OneToOne, @ManyToMany, @Repository
// @Configuration, @Value, @Evic (caching), @Query
