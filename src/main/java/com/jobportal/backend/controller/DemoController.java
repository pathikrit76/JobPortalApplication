package com.jobportal.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/home")
    public String getHello(){
        return "Hello World";
    }
}
