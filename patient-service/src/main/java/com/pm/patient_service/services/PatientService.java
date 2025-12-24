package com.pm.patient_service.services;
import com.pm.patient_service.dto.PatientResponseDTO;
import com.pm.patient_service.dto.Patientrequestdto;
import com.pm.patient_service.repository.Patientrepo;
import com.pm.patient_service.mapper.PatientMapper;
import com.pm.patient_service.model.Patient;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class PatientService{
    private final Patientrepo Patientrepository;

    public PatientService(Patientrepo Patientrepository) {
        this.Patientrepository = Patientrepository;
    }
    public List<PatientResponseDTO> getPatients(){
        List<Patient> patients = Patientrepository.findAll();
        List<PatientResponseDTO> patientDTOs = patients.stream()
                .map(PatientMapper::toDTO)
                .collect(Collectors.toList());

        return patientDTOs;
    }
    public PatientResponseDTO createPatient(Patientrequestdto patientrequestdto){
        Patient newPatient=Patientrepository.save(PatientMapper.toModel(patientrequestdto));
        return PatientMapper.toDTO(newPatient);
    }
}


    

