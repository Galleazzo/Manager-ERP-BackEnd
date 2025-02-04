package com.br.erp.web.model.anamnesis;

import jakarta.persistence.*;

@Entity
@Table(name = "lifestyle_info")
public class LifestyleInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "drinks_water_frequently", nullable = false)
    private boolean drinksWaterFrequently;

    @Column(name = "drinks_alcohol", nullable = false)
    private boolean drinksAlcohol;

    @Column(name = "uses_sunscreen_frequently", nullable = false)
    private boolean usesSunscreenFrequently;

    @Column(name = "is_menstruating", nullable = false)
    private boolean isMenstruating;

    @Column(name = "is_pregnant_or_lactating", nullable = false)
    private boolean isPregnantOrLactating;

    @Column(name = "uses_birth_control", nullable = false)
    private boolean usesBirthControl;

    @Column(name = "has_skincare_routine", nullable = false)
    private boolean hasSkincareRoutine;

    public LifestyleInfo() {
    }

    public LifestyleInfo(boolean drinksWaterFrequently, boolean drinksAlcohol, boolean usesSunscreenFrequently,
                         boolean isMenstruating, boolean isPregnantOrLactating, boolean usesBirthControl,
                         boolean hasSkincareRoutine) {
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
