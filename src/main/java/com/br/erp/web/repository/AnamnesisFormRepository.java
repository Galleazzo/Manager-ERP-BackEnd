package com.br.erp.web.repository;

import com.br.erp.web.model.anamnesis.AnamnesisForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnamnesisFormRepository extends JpaRepository<AnamnesisForm, Long> {
    // Custom query methods can be added if needed
}
