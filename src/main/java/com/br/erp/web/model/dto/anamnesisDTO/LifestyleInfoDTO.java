package com.br.erp.web.model.dto.anamnesisDTO;

public class LifestyleInfoDTO {
    private Long id;
    private boolean drinksWaterFrequently;
    private boolean drinksAlcohol;
    private boolean usesSunscreenFrequently;
    private boolean isMenstruating;
    private boolean isPregnantOrLactating;
    private boolean usesBirthControl;
    private boolean hasSkincareRoutine;

    public LifestyleInfoDTO() {
    }

    public LifestyleInfoDTO(Long id, boolean drinksWaterFrequently, boolean drinksAlcohol, boolean usesSunscreenFrequently,
                            boolean isMenstruating, boolean isPregnantOrLactating, boolean usesBirthControl,
                            boolean hasSkincareRoutine) {
        this.id = id;
        this.drinksWaterFrequently = drinksWaterFrequently;
        this.drinksAlcohol = drinksAlcohol;
        this.usesSunscreenFrequently = usesSunscreenFrequently;
        this.isMenstruating = isMenstruating;
        this.isPregnantOrLactating = isPregnantOrLactating;
        this.usesBirthControl = usesBirthControl;
        this.hasSkincareRoutine = hasSkincareRoutine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDrinksWaterFrequently() {
        return drinksWaterFrequently;
    }

    public void setDrinksWaterFrequently(boolean drinksWaterFrequently) {
        this.drinksWaterFrequently = drinksWaterFrequently;
    }

    public boolean isDrinksAlcohol() {
        return drinksAlcohol;
    }

    public void setDrinksAlcohol(boolean drinksAlcohol) {
        this.drinksAlcohol = drinksAlcohol;
    }

    public boolean isUsesSunscreenFrequently() {
        return usesSunscreenFrequently;
    }

    public void setUsesSunscreenFrequently(boolean usesSunscreenFrequently) {
        this.usesSunscreenFrequently = usesSunscreenFrequently;
    }

    public boolean isMenstruating() {
        return isMenstruating;
    }

    public void setMenstruating(boolean menstruating) {
        isMenstruating = menstruating;
    }

    public boolean isPregnantOrLactating() {
        return isPregnantOrLactating;
    }

    public void setPregnantOrLactating(boolean pregnantOrLactating) {
        isPregnantOrLactating = pregnantOrLactating;
    }

    public boolean isUsesBirthControl() {
        return usesBirthControl;
    }

    public void setUsesBirthControl(boolean usesBirthControl) {
        this.usesBirthControl = usesBirthControl;
    }

    public boolean isHasSkincareRoutine() {
        return hasSkincareRoutine;
    }

    public void setHasSkincareRoutine(boolean hasSkincareRoutine) {
        this.hasSkincareRoutine = hasSkincareRoutine;
    }
}
