package com.javatutoriales.patrones.adapter.clase;

import com.javatutoriales.patrones.adapter.HexColor;
import com.javatutoriales.patrones.adapter.RgbColor;

public class HexColorAdapter extends HexColor implements RgbColor {

    public HexColorAdapter(int colorCode) {
        super(colorCode);
    }

    @Override
    public int getRed() {
        return (getColorCode() & 0xFF0000) >> 16;
    }

    @Override
    public int getGreen() {
        return (getColorCode() & 0xFF00) >> 8;
    }

    @Override
    public int getBlue() {
        return (getColorCode() & 0xFF);
    }
}
