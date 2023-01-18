package com.attornatustest.crud.controller;

import com.attornatustest.crud.model.PersonModel;
import com.attornatustest.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/person")
    public Person create(@RequestBody PersonModel person){
        return personService.create(person);
    }

    @GetMapping("/person/{id}")
    public Person findById(@PathVariable Long id){
        return personService.findById(id);
    }

    @GetMapping("/person/name/{name}")
    public Person findByName(@PathVariable String name){
        return personService.findByName(name);
    }

    @PatchMapping("/person")
    public Person uptade (@RequestBody Person person) {
        return personService.update(person);
    }

    @DeleteMapping("/person")
    public void delete(@RequestBody Person person) {
        personService.delete(person);
    }

    @DeleteMapping("/person/{id}")
    public void deleteById(@PathVariable Long id) {
        personService.deleteById(id);
    }

}

