package com.attornatustest.crud.controller;

import com.attornatustest.crud.model.AddressModel;
import com.attornatustest.crud.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/address")
    public AddressModel create(@RequestBody AddressModel address) {
        return addressService.create(address);
    }

    @GetMapping("/address/{id}")
    public AddressModel findById(@PathVariable Long id) {
        return addressService.findById(id);
    }

    @GetMapping("/address/streetAvenue/{streetAvenue}")
    public AddressModel findByAddress(@RequestBody AddressModel address) {
        return addressService.update(address);
    }

    @PatchMapping("/address")
    public AddressModel update(@RequestBody AddressModel address){
        return addressService.update(address);
    }

    @DeleteMapping("/address")
    public void delete(@RequestBody AddressModel address) {
        addressService.delete(address);
    }

    @DeleteMapping("/address/{id}")
    public void deleteById(@PathVariable Long id) {
        addressService.deleteById(id);
    }

}

