package com.patterns.automovil.builder;

import com.patterns.automovil.model.Color;
import com.patterns.automovil.model.EngineType;
import com.patterns.automovil.model.InteriorType;
import com.patterns.automovil.model.RinType;
import com.patterns.automovil.model.SoundSystemType;

public interface Builder {
    void reset();
    void setEngine(EngineType engineType);
    void setColor(Color colorCode);
    void setRin(RinType rinType);
    void setSoundSystem(SoundSystemType soundSystemType);
    void setInterior(InteriorType interiorType);
    void setSunRoof(boolean enabled);
    void setGps(boolean enabled);
    void setStartEngine(boolean enabled);
}
