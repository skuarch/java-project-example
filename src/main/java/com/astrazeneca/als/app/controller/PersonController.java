package com.astrazeneca.als.app.controller;

import com.astrazeneca.als.app.model.entity.Person;
import com.astrazeneca.als.app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {
    
    @Autowired
    private PersonRepository personRepository;
    
    @ResponseBody
    @GetMapping("/{id}")
    public Person getPersons(@PathVariable("id") Long id){
        int r = 0;
        return personRepository.findOne(id);
    }
    
}
