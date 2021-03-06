package com.java.emailapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emails")
public class EmailController {

    @GetMapping("/{id}")
    public String getEmail(@PathVariable("id") Long id) {
        return id + "@rest.local";
    }
}
