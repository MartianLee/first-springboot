package com.greenhair.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class WebController {

    @GetMapping("/")
    public String main() {
        return "main.hbs";
    }
    
    @GetMapping("/template")
    public String template() {
        return "template.html";
    }
    
    @GetMapping("/test")
    public String test() {
        return "test.html";
    }
}