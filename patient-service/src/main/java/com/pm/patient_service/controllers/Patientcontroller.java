package com.pm.patient_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pm.patient_service.dto.PatientResponseDTO;
import org.springframework.http.ResponseEntity;
import java.util.List;
import com.pm.patient_service.services.PatientService;

@RequestMapping("/patients")
@RestController

public class Patientcontroller {
    private final PatientService patientService;
    public Patientcontroller(PatientService patientService) {
        this.patientService = patientService;
    }
@GetMapping
public  ResponseEntity<List<PatientResponseDTO>> getAllPatients() {
    List<PatientResponseDTO> patients = patientService.getPatients();
    return ResponseEntity.ok(patients);
}

}