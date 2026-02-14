package com.patterns.automovil.product;

import com.patterns.automovil.model.Color;
import com.patterns.automovil.model.EngineType;
import com.patterns.automovil.model.InteriorType;
import com.patterns.automovil.model.RinType;
import com.patterns.automovil.model.SoundSystemType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class Automobile {

    private final EngineType engine;
    private final Color color;
    private final RinType rin;
    private final SoundSystemType soundSystem;
    private final InteriorType interior;
    private final boolean sunRoof;
    private final boolean gps;
    private final boolean startEngine;

}
