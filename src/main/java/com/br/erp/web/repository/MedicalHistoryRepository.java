package com.br.erp.web.repository;

import com.br.erp.web.model.anamnesis.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {
    // Custom query methods can be added if needed
}
