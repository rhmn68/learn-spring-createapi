package com.rahmanaulia.learnapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    /**
     * Akan menghandle request get yang datang
     * */
    @GetMapping
    public String welcome(){
        return "Welcome to spring boot Rest API yihaaa";
    }
}
