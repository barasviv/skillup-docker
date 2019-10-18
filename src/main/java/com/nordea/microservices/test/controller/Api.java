package com.nordea.microservices.test.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class Api {

    @RequestMapping(method = RequestMethod.GET, value = "hello")
    public String hello(){
        return "Hello World";
    }
}
