package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = {
            "/hello",
            "/hello/{name}"
    })
    public ResponseEntity<String> hello(@PathVariable(value = "name", required = false) String name) {

        String response = "hello";

        if (name != null) {
            response = response + name;
        }

        return ResponseEntity.ok(response);
    }
}
