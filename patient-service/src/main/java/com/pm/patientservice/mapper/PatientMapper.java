package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDto(Patient patient) {
        PatientResponseDTO patientDto = new PatientResponseDTO();

        patientDto.setId(patientDto.getId().toString());
        patientDto.setName(patientDto.getName().toString());
        patientDto.setAddress(patientDto.getAddress().toString());
        patientDto.setEmail(patientDto.getEmail().toString());
        patientDto.setDateOfBirth(patientDto.getDateOfBirth().toString());

        return patientDto;
    }
}
