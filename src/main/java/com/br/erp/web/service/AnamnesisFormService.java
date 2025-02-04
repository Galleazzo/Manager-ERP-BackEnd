package com.br.erp.web.service;

import com.br.erp.web.model.anamnesis.AnamnesisForm;
import com.br.erp.web.model.dto.anamnesisDTO.AnamnesisFormDTO;
import com.br.erp.web.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnamnesisFormService {

    @Autowired
    private PersonalInfoRepository personalInfoRepository;

    @Autowired
    private LifestyleInfoRepository lifestyleInfoRepository;

    @Autowired
    private HealthInfoRepository healthInfoRepository;

    @Autowired
    private MedicalHistoryRepository medicalHistoryRepository;

    @Autowired
    private AnamnesisFormRepository anamnesisFormRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<List<AnamnesisFormDTO>> getAllForms() {
        List<AnamnesisFormDTO> forms = anamnesisFormRepository.findAll()
                .stream()
                .map(form -> modelMapper.map(form, AnamnesisFormDTO.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(forms);
    }

    public ResponseEntity<AnamnesisFormDTO> getFormById(Long id) {
        Optional<AnamnesisForm> form = anamnesisFormRepository.findById(id);
        return form.map(value -> ResponseEntity.ok(modelMapper.map(value, AnamnesisFormDTO.class)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<AnamnesisFormDTO> saveForm(AnamnesisFormDTO formDTO) {
        AnamnesisForm form = modelMapper.map(formDTO, AnamnesisForm.class);
        AnamnesisForm savedForm = anamnesisFormRepository.save(form);
        return ResponseEntity.ok(modelMapper.map(savedForm, AnamnesisFormDTO.class));
    }
}
