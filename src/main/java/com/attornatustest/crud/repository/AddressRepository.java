package com.attornatustest.crud.repository;

import com.attornatustest.crud.model.AddressModel;
import com.attornatustest.crud.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends  JpaRepository< AddressModel, Long> {
  Optional<AddressModel> findByAddress(String streetAvenue);

}
