package com.patterns.automovil.model;

public enum RinType {

    R15(100),
    R16(200),
    R17(300),
    R18(400),
    R19(500),
    R20(600);

    private final int rinCode;

    RinType(int rinCode) {
        this.rinCode = rinCode;
    }

    public int getRinCode() {
        return rinCode;
    }

}
