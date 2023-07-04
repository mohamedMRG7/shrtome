package com.mrg.clientmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ClientModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientModuleApplication.class, args);
    }

    @GetMapping("/tst")
    public String test(){
        return "hello";
    }
}
