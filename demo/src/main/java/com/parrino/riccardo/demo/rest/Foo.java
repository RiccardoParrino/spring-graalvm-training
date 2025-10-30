package com.parrino.riccardo.demo.rest;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Access(AccessType.PROPERTY)
public class Foo {
    
    private String bar;

    void setBar(String bar) {
        System.out.println("setBar");
        this.bar = bar;
    }
    
    @Id
    String getBar() {
        System.out.println("getBar");
        return this.bar;
    }

}