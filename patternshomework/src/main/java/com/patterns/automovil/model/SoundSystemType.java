package com.patterns.automovil.model;

public enum SoundSystemType {

    BASIC(100),
    PRO(200),
    MILITARY(300);

    private final int soundSystemCode;

    SoundSystemType(int soundSystemCode) {
        this.soundSystemCode = soundSystemCode;
    }

    public int getSoundSystemCode() {
        return soundSystemCode;
    }

}
