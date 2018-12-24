package com.example.demoweb.notes;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestNotesSpringDataRest {

    public static void main(String[] args) {
        SpringApplication.run(RestNotesSpringDataRest.class, args);
    }
    @Bean
    public ModelMapper modelMapper() {return new ModelMapper();}

}