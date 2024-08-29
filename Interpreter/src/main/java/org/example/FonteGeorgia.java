package org.example;

public class FonteGeorgia implements InterpretadorExpressao {
    private InterpretadorExpressao expressao;

    public FonteGeorgia(InterpretadorExpressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public String interpretar() {
        return "<span style=\"font-family: Georgia;\">" + expressao.interpretar() + "</span>";
    }
}
