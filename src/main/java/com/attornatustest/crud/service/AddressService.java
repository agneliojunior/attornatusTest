package com.attornatustest.crud.service;

import com.attornatustest.crud.model.AddressModel;
import com.attornatustest.crud.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public AddressModel create(AddressModel address){
        return AddressRepository.save(address);
    }

    public AddressModel findById(Long id){
        return addressRepository.findById(id).orElse(new AddressModel());
    }

    public AddressModel findByAdress(String streetAvenue) {
        return addressRepository.findByName(streetAvenue).orElse(new AddressModel());
    }

    public AddressModel update(AddressModel address){
        return addressRepository.save(address);
    }

    public void delete(AddressModel address){
        addressRepository.delete(address);
    }

    public void deleteById(Long id){
        addressRepository.deleteById(id);
    }
}
