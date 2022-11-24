package com.rahmanaulia.learnapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearnApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnApiApplication.class, args);
    }

    //Bean dapat di inject dengan autowired
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
