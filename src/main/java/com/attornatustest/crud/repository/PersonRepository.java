package com.attornatustest.crud.repository;

import com.attornatustest.crud.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonModel, Long> {
    Optional<Person> findByName(String name);
}

}
