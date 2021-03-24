package com.acbk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class MainController {
    @GetMapping(value="/hello")
    public String hello(){
        return "Hello World!!";
    }
}
