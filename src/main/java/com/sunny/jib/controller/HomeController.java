package com.sunny.jib.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HomeController {

    @GetMapping("/home/{name}")
    public String home(@PathVariable String name) {
        return "Hello：" + name;
    }

    @GetMapping("/index")
    public LocalDateTime index() {
        return LocalDateTime.now();
    }

}
