package org.example;

public class FonteTimesNewRoman implements InterpretadorExpressao {
    private InterpretadorExpressao expressao;

    public FonteTimesNewRoman(InterpretadorExpressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public String interpretar() {
        return "<span style=\"font-family: Times New Roman;\">" + expressao.interpretar() + "</span>";
    }
}
