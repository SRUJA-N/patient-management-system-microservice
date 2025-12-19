package com.pm.patient_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientServiceApplication.class, args);
		com.pm.model.Patient p = new com.pm.model.Patient();
    p.setName("Srujan");       // Try typing this manually!
    System.out.println(p.getName());
	}

}
