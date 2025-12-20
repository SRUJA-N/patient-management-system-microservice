package com.pm.patient_service.services;

import com.pm.patient_service.repository.Patientrepo;
import org.springframework.stereotype.Service;

@Service

public class PatientService{
    private final Patientrepo Patientrepository;

    public PatientService(Patientrepo Patientrepository) {
        this.Patientrepository = Patientrepository;
    }



    
}
