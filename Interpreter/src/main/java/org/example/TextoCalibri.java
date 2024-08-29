package org.example;

public class TextoCalibri implements InterpretadorExpressao{
    private String texto;

    public TextoCalibri(String texto) {
        this.texto = texto;
    }

    @Override
    public String interpretar() {
        return texto;
    }
}
