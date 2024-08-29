
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentoTest {

    private Documento documento;

    @BeforeEach
    public void setUp() {
        documento = new Documento("Texto Base");
    }

    @Test
    public void testAplicarFonteGeorgia() {
        documento.aplicarFonteGeorgia("FonteGeorgia");
        assertEquals("Texto Base <span style=\"font-family: Georgia;\">FonteGeorgia</span>", documento.obterTextoFormatado());
    }

    @Test
    public void testAplicarFonteArial() {
        documento.aplicarFonteArial("FonteArial");
        assertEquals("Texto Base <span style=\"font-family: Arial;\">FonteArial</span>", documento.obterTextoFormatado());
    }

    @Test
    public void testAplicarFonteTimesNewRoman() {
        documento.aplicarFonteTimesNewRoman("FonteTimesNewRoman");
        assertEquals("Texto Base <span style=\"font-family: Times New Roman;\">FonteTimesNewRoman</span>", documento.obterTextoFormatado());
    }

    @Test
    public void testAplicarMultipleFontes() {
        documento.aplicarFonteGeorgia("FonteGeorgia");
        documento.aplicarFonteArial("FonteArial");
        documento.aplicarFonteTimesNewRoman("FonteTimesNewRoman");
        assertEquals("Texto Base <span style=\"font-family: Georgia;\">FonteGeorgia</span> <span style=\"font-family: Arial;\">FonteArial</span> <span style=\"font-family: Times New Roman;\">FonteTimesNewRoman</span>", documento.obterTextoFormatado());
    }

    @Test
    public void testObterTextoFonteGeorgia() {
        documento.aplicarFonteGeorgia("FonteGeorgia");
        documento.aplicarFonteArial("FonteArial");
        assertEquals("<span style=\"font-family: Georgia;\">FonteGeorgia</span>", documento.obterTextoFonteGeorgia());
    }

    @Test
    public void testObterTextoFonteArial() {
        documento.aplicarFonteArial("FonteArial");
        documento.aplicarFonteTimesNewRoman("FonteTimesNewRoman");
        assertEquals("<span style=\"font-family: Arial;\">FonteArial</span>", documento.obterTextoFonteArial());
    }

    @Test
    public void testObterTextoFonteTimesNewRoman() {
        documento.aplicarFonteTimesNewRoman("FonteTimesNewRoman");
        documento.aplicarFonteGeorgia("FonteGeorgia");
        assertEquals("<span style=\"font-family: Times New Roman;\">FonteTimesNewRoman</span>", documento.obterTextoFonteTimesNewRoman());
    }

    @Test
    public void testSemFontes() {
        assertEquals("Texto Base", documento.obterTextoFormatado());
    }
}
