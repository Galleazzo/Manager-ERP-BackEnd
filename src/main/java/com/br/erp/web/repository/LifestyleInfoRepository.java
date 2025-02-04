package com.br.erp.web.repository;

import com.br.erp.web.model.anamnesis.LifestyleInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LifestyleInfoRepository extends JpaRepository<LifestyleInfo, Long> {
    // Custom query methods can be added if needed
}
