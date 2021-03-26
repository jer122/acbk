package com.acbk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/admin")
@RestController
public class MainController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World!!";
    }

    @GetMapping(value = "/adminn")
    public String admin() {
        return "Hello World!!";
    }
}
