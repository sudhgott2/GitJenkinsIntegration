package com.example.hw;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HWController {
    @RequestMapping("/")
    public String index() {
        return "Hello Jenkins X + Spring Boot! + Docker";
    }
}
