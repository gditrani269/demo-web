package com.ger2.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

@SpringBootApplication
public class DemoWebApplication {

    @RequestMapping("/sasa")
    String home2() {
        return "Hello World! cata";
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}

}
