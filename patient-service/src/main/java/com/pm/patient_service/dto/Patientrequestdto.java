package com.pm.patient_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Patientrequestdto {
    @NotBlank(message="Name cannot be blank")
    @Size(min = 2, max = 50)
    private String name;
@NotBlank(message="Age cannot be blank")
    private String age;
    @NotBlank
    @Email(message="Invalid email format")
    private String email;
    @NotBlank(message="Address cannot be blank")
    private String address;
    @NotBlank(message="Phone number cannot be blank")
    private String phoneNumber;
    @NotBlank(message="Gender cannot be blank")
    private String gender;
    @NotNull(message="Registration date cannot be blank")
    private String registrationDate;
    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }
    

    
}
