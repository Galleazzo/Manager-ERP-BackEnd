package com.br.erp.web.model.dto.anamnesisDTO;

public class MedicalHistoryDTO {
    private Long id;
    private boolean previousFacialTreatment;
    private String facialTreatmentDescription;
    private boolean skinAllergy;
    private String allergyDescription;
    private boolean usedRoaccutane;

    public MedicalHistoryDTO() {
    }

    public MedicalHistoryDTO(Long id, boolean previousFacialTreatment, String facialTreatmentDescription,
                             boolean skinAllergy, String allergyDescription, boolean usedRoaccutane) {
        this.id = id;
        this.previousFacialTreatment = previousFacialTreatment;
        this.facialTreatmentDescription = facialTreatmentDescription;
        this.skinAllergy = skinAllergy;
        this.allergyDescription = allergyDescription;
        this.usedRoaccutane = usedRoaccutane;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPreviousFacialTreatment() {
        return previousFacialTreatment;
    }

    public void setPreviousFacialTreatment(boolean previousFacialTreatment) {
        this.previousFacialTreatment = previousFacialTreatment;
    }

    public String getFacialTreatmentDescription() {
        return facialTreatmentDescription;
    }

    public void setFacialTreatmentDescription(String facialTreatmentDescription) {
        this.facialTreatmentDescription = facialTreatmentDescription;
    }

    public boolean isSkinAllergy() {
        return skinAllergy;
    }

    public void setSkinAllergy(boolean skinAllergy) {
        this.skinAllergy = skinAllergy;
    }

    public String getAllergyDescription() {
        return allergyDescription;
    }

    public void setAllergyDescription(String allergyDescription) {
        this.allergyDescription = allergyDescription;
    }

    public boolean isUsedRoaccutane() {
        return usedRoaccutane;
    }

    public void setUsedRoaccutane(boolean usedRoaccutane) {
        this.usedRoaccutane = usedRoaccutane;
    }
}
