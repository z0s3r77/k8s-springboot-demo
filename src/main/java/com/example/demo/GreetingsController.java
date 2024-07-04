package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api")
public class GreetingsController {

    private static final String FILE_PATH = "/mnt/data/test.txt";


    @GetMapping(value = "/{name}", produces = "application/json")
    public String getGreeting(@PathVariable String name) {
        return "Saludos " + name + "!";
    }


    @GetMapping("/test/read-file")
    public String readFile() throws Exception {
        return Files.lines(Paths.get(FILE_PATH)).collect(Collectors.joining("\n"));
    }


    @GetMapping("/test/new-endpoint")
    public String newEndpoint() {
        return "Kubernetes es lo más";
    }


}
