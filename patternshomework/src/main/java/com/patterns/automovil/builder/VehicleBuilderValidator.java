package com.patterns.automovil.builder;

import com.patterns.automovil.model.Color;
import com.patterns.automovil.model.EngineType;
import com.patterns.automovil.model.InteriorType;
import com.patterns.automovil.model.RinType;
import com.patterns.automovil.model.SoundSystemType;

final class VehicleBuilderValidator {

    static void validate(
            EngineType engine,
            Color color,
            RinType rin,
            SoundSystemType soundSystem,
            InteriorType interior,
            boolean sunRoof,
            boolean gps
    ) {
        requirePresent(engine, "Engine is required");
        requirePresent(color, "Color is required");
        requirePresent(rin, "Rim is required");
        requirePresent(soundSystem, "Sound system is required");
        requirePresent(interior, "Interior is required");

        requireState(!(sunRoof && interior == InteriorType.FABRIC),
                "Sunroof is not allowed with fabric interior");
        requireState(!(engine == EngineType.ELECTRIC && !gps),
                "Electric vehicle must include GPS");
    }

    private static void requirePresent(Object value, String message) {
        if (value == null) {
            throw new IllegalStateException(message);
        }
    }

    private static void requireState(boolean condition, String message) {
        if (!condition) {
            throw new IllegalStateException(message);
        }
    }
}
