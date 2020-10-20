package com.example.ppkwu1.controllers;


import com.example.ppkwu1.Reverse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    @GetMapping("/reverse")
    public Reverse reverse(@RequestParam String text){
        return new Reverse(text);
    }
}
