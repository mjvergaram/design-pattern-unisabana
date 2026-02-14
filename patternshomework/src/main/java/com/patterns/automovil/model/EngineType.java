package com.patterns.automovil.model;

public enum EngineType {

    GASOLINE(100),
    DIESEL(200),
    HYBRID(300),
    ELECTRIC(400);

    private final int code;

    EngineType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
