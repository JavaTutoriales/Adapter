package com.javatutoriales.patrones.adapter.objeto;

import com.javatutoriales.patrones.adapter.objeto.ColoreadorFondos;
import com.javatutoriales.patrones.adapter.objeto.HexColor;
import com.javatutoriales.patrones.adapter.objeto.HexColorAdapter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ColoreadorFondosTest {

    private ColoreadorFondos coloreadorFondos = new ColoreadorFondos();
    private HexColorAdapter hexColorAdapter;

    @Test
    void testColorRgbCuando_colorNegro() {
        HexColor colorNegro = new HexColor(0x000000);

        hexColorAdapter = new HexColorAdapter(colorNegro);

        String colorFondo = coloreadorFondos.colorea(hexColorAdapter);

        assertThat(colorFondo).isEqualTo("0,0,0");
    }

    @Test
    void testColorRgbCuando_colorBlanco() {
        HexColor colorBlanco = new HexColor(0xFFFFFF);

        hexColorAdapter = new HexColorAdapter(colorBlanco);

        String colorFondo = coloreadorFondos.colorea(hexColorAdapter);

        assertThat(colorFondo).isEqualTo("255,255,255");
    }

    @Test
    void testColorRgbCuando_colorVerde() {
        HexColor colorVerde = new HexColor(0x00FF00);

        hexColorAdapter = new HexColorAdapter(colorVerde);

        String colorFondo = coloreadorFondos.colorea(hexColorAdapter);

        assertThat(colorFondo).isEqualTo("0,255,0");
    }

    @Test
    void testColorRgbCuando_colorMorado() {
        HexColor colorMorado = new HexColor(0xC678AA);

        hexColorAdapter = new HexColorAdapter(colorMorado);

        String colorFondo = coloreadorFondos.colorea(hexColorAdapter);

        assertThat(colorFondo).isEqualTo("198,120,170");
    }
}