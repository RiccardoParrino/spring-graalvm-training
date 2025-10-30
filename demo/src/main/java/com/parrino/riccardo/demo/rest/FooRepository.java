package com.parrino.riccardo.demo.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FooRepository extends JpaRepository<Foo, String> {
    
}
