package com.pm.model;
import jakarta.persistence.Column;
import  jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.UUID;


import lombok.Data;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
@Entity
public class Patient{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)//used to auto generate the primary key value in the database
    private UUID id;

    @NotNull
    private String name;
    @NotNull
    @Email
    @Column(unique=true)
    private String email;
    @NotNull
    private String address;
    @NotNull
    private String phoneno;
    @NotNull
    private String gender;
    @NotNull
    private LocalDate dateofBirth;
    @NotNull
    private LocalDate dateofregistration;


}
//getter and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public LocalDate getDateofregistration() {
        return dateofregistration;
    }

    public void setDateofregistration(LocalDate dateofregistration) {
        this.dateofregistration = dateofregistration;
    }
}