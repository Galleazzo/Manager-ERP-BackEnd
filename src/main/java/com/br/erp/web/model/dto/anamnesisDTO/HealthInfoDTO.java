package com.br.erp.web.model.dto.anamnesisDTO;

public class HealthInfoDTO {
    private Long id;
    private boolean exposedToSun;
    private boolean highGlycemicDiet;
    private boolean regularIntestinalFunction;
    private boolean goodSleepQuality;
    private boolean smoking;
    private boolean pacemaker;
    private boolean skinDisease;

    public HealthInfoDTO() {
    }

    public HealthInfoDTO(Long id, boolean exposedToSun, boolean highGlycemicDiet, boolean regularIntestinalFunction,
                         boolean goodSleepQuality, boolean smoking, boolean pacemaker, boolean skinDisease) {
        this.id = id;
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
