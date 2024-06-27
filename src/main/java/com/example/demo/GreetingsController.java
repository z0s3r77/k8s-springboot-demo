package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class GreetingsController {

    @GetMapping(value = "/{name}", produces = "application/json")
    public String getGreeting(@PathVariable String name){
        return "Saludos " + name + "!";
    }


}
