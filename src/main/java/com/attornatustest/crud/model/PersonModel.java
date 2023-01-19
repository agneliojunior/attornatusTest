package com.attornatustest.crud.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "person")
public class PersonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    private LocalDate birthDate;

    @OneToOne(cascade =CascadeType.ALL)
    private AddressModel address;

    public PersonModel(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

}
