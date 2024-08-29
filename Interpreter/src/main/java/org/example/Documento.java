package org.example;

import java.util.ArrayList;
import java.util.List;

public class Documento {

        private String textoOriginal;
        private List<InterpretadorExpressao> fontes;

        public Documento(String textoOriginal) {
            this.textoOriginal = textoOriginal;
            this.fontes = new ArrayList<>();
        }

        public void aplicarFonteArial(String texto) {
            fontes.add(new FonteArial(new TextoCalibri(texto)));
        }

        public void aplicarFonteTimesNewRoman(String texto) {
            fontes.add(new FonteTimesNewRoman(new TextoCalibri(texto)));
        }

        public void aplicarFonteGeorgia(String texto) {
            fontes.add(new FonteGeorgia(new TextoCalibri(texto)));
        }

        public String obterTextoFormatado() {
            StringBuilder resultado = new StringBuilder(textoOriginal);
            for (InterpretadorExpressao fonte : fontes) {
                resultado.append(" ").append(fonte.interpretar());
            }
            return resultado.toString();
        }

        public String obterTextoFonteArial() {
            StringBuilder resultado = new StringBuilder();
            for (InterpretadorExpressao fonte : fontes) {
                if (fonte instanceof FonteArial) {
                    resultado.append(fonte.interpretar()).append(" ");
                }
            }
            return resultado.toString().trim();
        }

        public String obterTextoFonteTimesNewRoman() {
            StringBuilder resultado = new StringBuilder();
            for (InterpretadorExpressao fonte : fontes) {
                if (fonte instanceof FonteTimesNewRoman) {
                    resultado.append(fonte.interpretar()).append(" ");
                }
            }
            return resultado.toString().trim();
        }

        public String obterTextoFonteGeorgia() {
            StringBuilder resultado = new StringBuilder();
            for (InterpretadorExpressao fonte : fontes) {
                if (fonte instanceof FonteGeorgia) {
                    resultado.append(fonte.interpretar()).append(" ");
                }
            }
            return resultado.toString().trim();
        }

}
