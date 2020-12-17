package com.example.demo.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2020/12/17
 */
@RestController
public class HelloWorld {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
