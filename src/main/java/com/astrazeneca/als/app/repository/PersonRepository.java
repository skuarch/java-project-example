package com.astrazeneca.als.app.repository;

import com.astrazeneca.als.app.model.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
    
}
