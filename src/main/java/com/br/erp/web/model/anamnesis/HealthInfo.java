package com.br.erp.web.model.anamnesis;

import jakarta.persistence.*;

@Entity
@Table(name = "health_info")
public class HealthInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "exposed_to_sun", nullable = false)
    private boolean exposedToSun;

    @Column(name = "high_glycemic_diet", nullable = false)
    private boolean highGlycemicDiet;

    @Column(name = "regular_intestinal_function", nullable = false)
    private boolean regularIntestinalFunction;

    @Column(name = "good_sleep_quality", nullable = false)
    private boolean goodSleepQuality;

    @Column(name = "smoking", nullable = false)
    private boolean smoking;

    @Column(name = "pacemaker", nullable = false)
    private boolean pacemaker;

    @Column(name = "skin_disease", nullable = false)
    private boolean skinDisease;

    public HealthInfo() {
    }

    public HealthInfo(boolean exposedToSun, boolean highGlycemicDiet, boolean regularIntestinalFunction,
                      boolean goodSleepQuality, boolean smoking, boolean pacemaker, boolean skinDisease) {
        this.exposedToSun = exposedToSun;
        this.highGlycemicDiet = highGlycemicDiet;
        this.regularIntestinalFunction = regularIntestinalFunction;
        this.goodSleepQuality = goodSleepQuality;
        this.smoking = smoking;
        this.pacemaker = pacemaker;
        this.skinDisease = skinDisease;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isExposedToSun() {
        return exposedToSun;
    }

    public void setExposedToSun(boolean exposedToSun) {
        this.exposedToSun = exposedToSun;
    }

    public boolean isHighGlycemicDiet() {
        return highGlycemicDiet;
    }

    public void setHighGlycemicDiet(boolean highGlycemicDiet) {
        this.highGlycemicDiet = highGlycemicDiet;
    }

    public boolean isRegularIntestinalFunction() {
        return regularIntestinalFunction;
    }

    public void setRegularIntestinalFunction(boolean regularIntestinalFunction) {
        this.regularIntestinalFunction = regularIntestinalFunction;
    }

    public boolean isGoodSleepQuality() {
        return goodSleepQuality;
    }

    public void setGoodSleepQuality(boolean goodSleepQuality) {
        this.goodSleepQuality = goodSleepQuality;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public boolean isPacemaker() {
        return pacemaker;
    }

    public void setPacemaker(boolean pacemaker) {
        this.pacemaker = pacemaker;
    }

    public boolean isSkinDisease() {
        return skinDisease;
    }

    public void setSkinDisease(boolean skinDisease) {
        this.skinDisease = skinDisease;
    }
}
