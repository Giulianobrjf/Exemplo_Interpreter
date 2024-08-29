package org.example;

public class FonteArial implements InterpretadorExpressao {
    private InterpretadorExpressao expressao;

    public FonteArial(InterpretadorExpressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public String interpretar() {
        return "<span style=\"font-family: Arial;\">" + expressao.interpretar() + "</span>";
    }
}
