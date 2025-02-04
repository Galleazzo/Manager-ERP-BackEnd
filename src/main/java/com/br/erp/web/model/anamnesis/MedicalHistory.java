package com.br.erp.web.model.anamnesis;

import jakarta.persistence.*;

@Entity
@Table(name = "medical_history")
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "previous_facial_treatment", nullable = false)
    private boolean previousFacialTreatment;

    @Column(name = "facial_treatment_description")
    private String facialTreatmentDescription;

    @Column(name = "skin_allergy", nullable = false)
    private boolean skinAllergy;

    @Column(name = "allergy_description")
    private String allergyDescription;

    @Column(name = "used_roaccutane", nullable = false)
    private boolean usedRoaccutane;

    public MedicalHistory() {
    }

    public MedicalHistory(boolean previousFacialTreatment, String facialTreatmentDescription, boolean skinAllergy,
                          String allergyDescription, boolean usedRoaccutane) {
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
