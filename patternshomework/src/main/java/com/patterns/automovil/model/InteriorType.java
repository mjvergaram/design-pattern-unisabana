package com.patterns.automovil.model;

public enum InteriorType {

    LEATHER(100),
    FABRIC(200);

    private final int interiorCode;

    InteriorType(int interiorCode) {
        this.interiorCode = interiorCode;
    }

    public int getInteriorCode() {
        return interiorCode;
    }

}
