package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDto(Patient patient) {
        PatientResponseDTO patientDto = new PatientResponseDTO();

        patientDto.setId(patient.getId().toString());
        patientDto.setName(patient.toString());
        patientDto.setAddress(patient.getAddress().toString());
        patientDto.setEmail(patient.getEmail().toString());
        patientDto.setDateOfBirth(patient.getDateOfBirth().toString());

        return patientDto;
    }
}
