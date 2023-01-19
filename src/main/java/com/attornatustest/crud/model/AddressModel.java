package com.attornatustest.crud.model;

import javax.persistence.*;

@Entity(name = "address")
public class AddressModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String streetAvenue;

    private Integer zipCode;

    private Integer number;

    private String city;

    private PersonModel person;

    @OneToOne(mappedBy = "addressModel")
    private PersonModel personModel;

    public AddressModel(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setStreetAvenue(String streetAvenue) {
        this.streetAvenue = streetAvenue;
    }

    public String getStreetAvenue() {
        return streetAvenue;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

}
