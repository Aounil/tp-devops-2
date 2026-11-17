package com.tp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController = @Controller + @ResponseBody: return values are written
// directly into the HTTP response body (no view/template resolution).
@RestController
public class HelloController {

    // Maps HTTP GET /hello to this method.
    @GetMapping("/hello")
    public String hello() {
        return "Hello DevOps!";
    }
}