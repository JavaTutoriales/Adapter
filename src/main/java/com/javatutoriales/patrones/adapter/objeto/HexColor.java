package com.javatutoriales.patrones.adapter.objeto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HexColor {
    private final int colorCode;

    public int getColorCode() {
        return colorCode;
    }
}
