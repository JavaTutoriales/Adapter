package com.javatutoriales.patrones.adapter.objeto;

public class ColoreadorFondos {
    public String colorea(RgbColor color) {
        return String.format("%d,%d,%d", color.getRed(), color.getGreen(), color.getBlue());
    }
}
