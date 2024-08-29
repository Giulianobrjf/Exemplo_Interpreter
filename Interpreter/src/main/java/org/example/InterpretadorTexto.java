package org.example;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpretadorTexto implements InterpretadorExpressao {
    private String texto;

    public InterpretadorTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String interpretar() {
        Stack<InterpretadorExpressao> pilha = new Stack<>();

        Pattern pattern = Pattern.compile("(\\*.*?\\*|_.*?_|~.*?~|[^*_~]+)");
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            String match = matcher.group();
            if (match.startsWith("*") && match.endsWith("*")) {
                pilha.push(new FonteArial(new TextoCalibri(match.substring(1, match.length() - 1))));
            } else if (match.startsWith("_") && match.endsWith("_")) {
                pilha.push(new FonteTimesNewRoman(new TextoCalibri(match.substring(1, match.length() - 1))));
            } else if (match.startsWith("~") && match.endsWith("~")) {
                pilha.push(new FonteGeorgia(new TextoCalibri(match.substring(1, match.length() - 1))));
            } else {
                pilha.push(new TextoCalibri(match));
            }
        }

        StringBuilder resultado = new StringBuilder();
        while (!pilha.isEmpty()) {
            resultado.insert(0, pilha.pop().interpretar());
        }

        return resultado.toString();
    }
}
