package com.sunny.jib.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "Hello World";
    }

    @RequestMapping("/index")
    public LocalDateTime index() {
        return LocalDateTime.now();
    }

}
