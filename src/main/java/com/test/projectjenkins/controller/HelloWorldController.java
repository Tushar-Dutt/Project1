package com.test.projectjenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @GetMapping("/hello")
    public ResponseEntity<String> get() {
        String str = "\n" + "lets run and display changes";
        return ResponseEntity.ok("Hello World Hii!"+str);
    }
}