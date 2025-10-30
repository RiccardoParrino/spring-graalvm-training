package com.parrino.riccardo.demo.rest;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyEndpoint {

    @Autowired
    private FooRepository fooRepository;
    
    @GetMapping("/api/foo")
    public List<Foo> endpoint() {
        return fooRepository.findAll();
    }
    

}
