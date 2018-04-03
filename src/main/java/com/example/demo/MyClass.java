package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Zia on 4/1/2018.
 */
@RestController
public class MyClass {

    @RequestMapping(value = "/")
    public String test(){
        return "Hello";
    }

}