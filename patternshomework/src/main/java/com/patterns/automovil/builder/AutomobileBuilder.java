package com.patterns.automovil.builder;

import com.patterns.automovil.model.Color;
import com.patterns.automovil.model.EngineType;
import com.patterns.automovil.model.InteriorType;
import com.patterns.automovil.model.RinType;
import com.patterns.automovil.model.SoundSystemType;
import com.patterns.automovil.product.Automobile;

public class AutomobileBuilder implements Builder {

    private EngineType engine;
    private Color color;
    private RinType rin;
    private SoundSystemType soundSystem;
    private InteriorType interior;
    private boolean sunRoof;
    private boolean gps;
    private boolean startEngine;

    public AutomobileBuilder() {
        reset();
    }

    public Automobile getResult() {
        validate();

        Automobile result = new Automobile(this.engine, this.color, this.rin, this.soundSystem, this.interior, this.sunRoof, this.gps, this.startEngine);

        reset();

        return result;
    }

    @Override
    public void reset() {
        this.engine = EngineType.GASOLINE;
        this.color = Color.GRAY;
        this.rin = RinType.R16;
        this.soundSystem = SoundSystemType.BASIC;
        this.interior = InteriorType.FABRIC;
        this.sunRoof = false;
        this.gps = false;
        this.startEngine = true;
    }

    private void validate() {
        VehicleBuilderValidator.validate(
                this.engine,
                this.color,
                this.rin,
                this.soundSystem,
                this.interior,
                this.sunRoof,
                this.gps
        );
    }

    @Override
    public void setEngine(EngineType engineType) {
        this.engine = engineType;
    }

    @Override
    public void setColor(Color colorCode) {
        this.color = colorCode;
    }

    @Override
    public void setRin(RinType rinType) {
        this.rin = rinType;
    }

    @Override
    public void setSoundSystem(SoundSystemType soundSystemType) {
        this.soundSystem = soundSystemType;
    }

    @Override
    public void setInterior(InteriorType interiorType) {
        this.interior = interiorType;
    }

    @Override
    public void setSunRoof(boolean enabled) {
        this.sunRoof = enabled;
    }

    @Override
    public void setGps(boolean enabled) {
        this.gps = enabled;
    }

    @Override
    public void setStartEngine(boolean enabled) {
        this.startEngine = enabled;
    }

}
