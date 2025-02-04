package com.br.erp.web.model.dto.anamnesisDTO;

public class AnamnesisFormDTO {
    private Long id;
    private PersonalInfoDTO personalInfo;
    private HealthInfoDTO healthInfo;
    private MedicalHistoryDTO medicalHistory;
    private LifestyleInfoDTO lifestyleInfo;

    public AnamnesisFormDTO() {
    }

    public AnamnesisFormDTO(Long id, PersonalInfoDTO personalInfo, HealthInfoDTO healthInfo,
                            MedicalHistoryDTO medicalHistory, LifestyleInfoDTO lifestyleInfo) {
        this.id = id;
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

    public PersonalInfoDTO getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfoDTO personalInfo) {
        this.personalInfo = personalInfo;
    }

    public HealthInfoDTO getHealthInfo() {
        return healthInfo;
    }

    public void setHealthInfo(HealthInfoDTO healthInfo) {
        this.healthInfo = healthInfo;
    }

    public MedicalHistoryDTO getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(MedicalHistoryDTO medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public LifestyleInfoDTO getLifestyleInfo() {
        return lifestyleInfo;
    }

    public void setLifestyleInfo(LifestyleInfoDTO lifestyleInfo) {
        this.lifestyleInfo = lifestyleInfo;
    }
}
