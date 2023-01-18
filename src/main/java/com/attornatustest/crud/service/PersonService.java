package com.attornatustest.crud.service;

import com.attornatustest.crud.model.PersonModel;
import com.attornatustest.crud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public PersonModel create(PersonModel person){
        return personRepository.save(person);
    }

    public PersonModel findById(Long id){
        return personRepository.findById(id).orElse(new PersonModel());
    }

    public PersonModel update(PersonModel person){
        return personRepository.save(person);
    }

    public void delete(PersonModel person){
        personRepository.delete(person);
    }

    public void deleteById(Long id){
        personRepository.deleteById(id);
    }
}
