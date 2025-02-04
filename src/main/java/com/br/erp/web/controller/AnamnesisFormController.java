package com.br.erp.web.controller;

import com.br.erp.web.model.dto.anamnesisDTO.AnamnesisFormDTO;
import com.br.erp.web.service.AnamnesisFormService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/anamnesis")
public class AnamnesisFormController {

    @Autowired
    private AnamnesisFormService anamnesisFormService;

    @GetMapping
    public ResponseEntity<List<AnamnesisFormDTO>> getAllForms() {
        return anamnesisFormService.getAllForms();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnamnesisFormDTO> getFormById(@PathVariable Long id) {
        return anamnesisFormService.getFormById(id);
    }

    @PostMapping
    public ResponseEntity<AnamnesisFormDTO> saveForm(@RequestBody AnamnesisFormDTO formDTO) {
        return anamnesisFormService.saveForm(formDTO);
    }
}
