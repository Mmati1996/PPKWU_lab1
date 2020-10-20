package com.example.ppkwu1.controllers;


import com.example.ppkwu1.Reverse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {


    // == http://localhost:8080/reverse?text=toReverse ==
    @GetMapping("/reverse")
    public String reverse(@RequestParam String text){
        Reverse reverse = new Reverse(text);
        return reverse.getText();
    }
}
