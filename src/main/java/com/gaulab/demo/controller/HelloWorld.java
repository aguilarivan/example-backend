package com.gaulab.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloWorld {
    @GetMapping
    public List<String> helloWorld() {
        return Arrays.asList("Hello World", "This is a test");
    }



}