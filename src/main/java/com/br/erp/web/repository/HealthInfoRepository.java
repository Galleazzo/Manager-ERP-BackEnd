package com.br.erp.web.repository;

import com.br.erp.web.model.anamnesis.HealthInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthInfoRepository extends JpaRepository<HealthInfo, Long> {
    // Custom query methods can be added if needed
}
