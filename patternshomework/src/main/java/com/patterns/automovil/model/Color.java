package com.patterns.automovil.model;

public enum Color {
    BLACK(100),
    WHITE(200),
    RED(300),
    BLUE(400),
    GRAY(500);

    private final int colorCode;

    Color(int colorCode) {
        this.colorCode = colorCode;
    }

    public int getColorCode() {
        return colorCode;
    }

}
