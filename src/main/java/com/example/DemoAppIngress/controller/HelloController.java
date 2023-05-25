package com.example.DemoAppIngress.controller;

import com.example.DemoAppIngress.Dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String sayHello(@RequestBody StudentDto dto) {
        return "Hello from " +dto.getName();
    }
}
