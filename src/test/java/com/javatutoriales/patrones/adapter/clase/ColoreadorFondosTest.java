package com.javatutoriales.patrones.adapter.clase;

import com.javatutoriales.patrones.adapter.ColoreadorFondos;
import com.javatutoriales.patrones.adapter.RgbColor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ColoreadorFondosTest {
    private ColoreadorFondos coloreadorFondos = new ColoreadorFondos();
    private RgbColor hexColorAdapter;

    @Test
    void testColorRgbCuando_colorNegro() {
        hexColorAdapter = new HexColorAdapter(0x000000);

        String colorFondo = coloreadorFondos.colorea(hexColorAdapter);

        assertThat(colorFondo).isEqualTo("0,0,0");
    }

    @Test
    void testColorRgbCuando_colorBlanco() {
        hexColorAdapter = new HexColorAdapter(0xFFFFFF);

        String colorFondo = coloreadorFondos.colorea(hexColorAdapter);

        assertThat(colorFondo).isEqualTo("255,255,255");
    }

    @Test
    void testColorRgbCuando_colorVerde() {
        hexColorAdapter = new HexColorAdapter(0x00FF00);

        String colorFondo = coloreadorFondos.colorea(hexColorAdapter);

        assertThat(colorFondo).isEqualTo("0,255,0");
    }

    @Test
    void testColorRgbCuando_colorMorado() {
        hexColorAdapter = new HexColorAdapter(0xC678AA);

        String colorFondo = coloreadorFondos.colorea(hexColorAdapter);

        assertThat(colorFondo).isEqualTo("198,120,170");
    }
}