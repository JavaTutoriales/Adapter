package com.javatutoriales.patrones.adapter.objeto;

import com.javatutoriales.patrones.adapter.HexColor;
import com.javatutoriales.patrones.adapter.RgbColor;

public class HexColorAdapter implements RgbColor {
    private final HexColor hexColor;

    public HexColorAdapter(HexColor hexColor) {
        this.hexColor = hexColor;
    }

    @Override
    public int getRed() {
        return (hexColor.getColorCode() & 0xFF0000) >> 16;
    }

    @Override
    public int getGreen() {
        return (hexColor.getColorCode() & 0xFF00) >> 8;
    }

    @Override
    public int getBlue() {
        return (hexColor.getColorCode() & 0xFF);
    }
}
