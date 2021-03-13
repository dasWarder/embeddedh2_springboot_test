package ee.babichev.h2demo.controller;


import ee.babichev.h2demo.entity.Person;
import ee.babichev.h2demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class PersonController {

    private PersonRepository repository;

    @Autowired
    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String getAll() {
        StringBuilder builder = new StringBuilder();

        Collection<Person> all = repository.getAll();

        all.stream().forEach(p -> builder.append(p));

        return builder.toString();
    }
}
