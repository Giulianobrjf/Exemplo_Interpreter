import org.example.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InterpretadorTextoTest {

    @Test
    public void testFonteGeorgia() {
        String texto = "~Olá Mundo~";
        InterpretadorExpressao interpretador = new InterpretadorTexto(texto);
        assertEquals("<span style=\"font-family: Georgia;\">Olá Mundo</span>", interpretador.interpretar());
    }

    @Test
    public void testFonteArial() {
        String texto = "*Olá Mundo*";
        InterpretadorExpressao interpretador = new InterpretadorTexto(texto);
        assertEquals("<span style=\"font-family: Arial;\">Olá Mundo</span>", interpretador.interpretar());
    }

    @Test
    public void testFonteTimesNewRoman() {
        String texto = "_Olá Mundo_";
        InterpretadorExpressao interpretador = new InterpretadorTexto(texto);
        assertEquals("<span style=\"font-family: Times New Roman;\">Olá Mundo</span>", interpretador.interpretar());
    }

    @Test
    public void testMultipleFontes() {
        String texto = "*Olá* _Mundo_ ~Testando~";
        InterpretadorExpressao interpretador = new InterpretadorTexto(texto);
        assertEquals("<span style=\"font-family: Arial;\">Olá</span> <span style=\"font-family: Times New Roman;\">Mundo</span> <span style=\"font-family: Georgia;\">Testando</span>", interpretador.interpretar());
    }

    @Test
    public void testTextoSimples() {
        String texto = "Texto simples";
        InterpretadorExpressao interpretador = new InterpretadorTexto(texto);
        assertEquals("Texto simples", interpretador.interpretar());
    }

    @Test
    public void testStringVazia() {
        String texto = "";
        InterpretadorExpressao interpretador = new InterpretadorTexto(texto);
        assertEquals("", interpretador.interpretar());
    }
}
