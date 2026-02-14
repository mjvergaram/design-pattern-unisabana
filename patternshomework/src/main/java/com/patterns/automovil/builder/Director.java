package com.patterns.automovil.builder;

import com.patterns.automovil.model.Color;
import com.patterns.automovil.model.EngineType;
import com.patterns.automovil.model.InteriorType;
import com.patterns.automovil.model.RinType;
import com.patterns.automovil.model.SoundSystemType;

public class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructBase() {
        requireBuilder();
        builder.reset();
        builder.setEngine(EngineType.GASOLINE);
        builder.setColor(Color.GRAY);
        builder.setRin(RinType.R16);
        builder.setSoundSystem(SoundSystemType.BASIC);
        builder.setInterior(InteriorType.FABRIC);
        builder.setSunRoof(false);
        builder.setGps(false);
        builder.setStartEngine(true);
    }

    public void constructBatMobile() {
        requireBuilder();
        builder.reset();
        builder.setEngine(EngineType.HYBRID);
        builder.setColor(Color.BLACK);
        builder.setRin(RinType.R20);
        builder.setSoundSystem(SoundSystemType.MILITARY);
        builder.setInterior(InteriorType.LEATHER);
        builder.setSunRoof(false);
        builder.setGps(true);
        builder.setStartEngine(true);
    }

    private void requireBuilder() {
        if (builder == null) {
            throw new IllegalStateException("AutomobileBuilder isn`t set in AutomobileDirector");
        }
    }
}
