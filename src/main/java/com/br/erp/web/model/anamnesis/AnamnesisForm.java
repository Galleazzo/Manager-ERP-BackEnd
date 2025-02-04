package com.br.erp.web.model.anamnesis;

import jakarta.persistence.*;

@Entity
@Table(name = "anamnesis_form")
public class AnamnesisForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_info_id", referencedColumnName = "id")
    private PersonalInfo personalInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "health_info_id", referencedColumnName = "id")
    private HealthInfo healthInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medical_history_id", referencedColumnName = "id")
    private MedicalHistory medicalHistory;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lifestyle_info_id", referencedColumnName = "id")
    private LifestyleInfo lifestyleInfo;

    public AnamnesisForm() {
    }

    public AnamnesisForm(PersonalInfo personalInfo, HealthInfo healthInfo, MedicalHistory medicalHistory, LifestyleInfo lifestyleInfo) {
        this.personalInfo = personalInfo;
        this.healthInfo = healthInfo;
        this.medicalHistory = medicalHistory;
        this.lifestyleInfo = lifestyleInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public HealthInfo getHealthInfo() {
        return healthInfo;
    }

    public void setHealthInfo(HealthInfo healthInfo) {
        this.healthInfo = healthInfo;
    }

    public MedicalHistory getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(MedicalHistory medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public LifestyleInfo getLifestyleInfo() {
        return lifestyleInfo;
    }

    public void setLifestyleInfo(LifestyleInfo lifestyleInfo) {
        this.lifestyleInfo = lifestyleInfo;
    }
}
