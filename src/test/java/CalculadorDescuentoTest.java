import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadorDescuentoTest {

    private CalculadorDescuento calculador;

    @BeforeEach
    void prepararPrueba() {
        calculador = new CalculadorDescuento();
    }

    @Test
    @DisplayName("Calcula 10 por ciento para cliente frecuente")
    void calculaDescuentoFrecuente() {
        double resultado =
                calculador.calcular("FRECUENTE", 100000);

        assertEquals(10000, resultado, 0.001);
    }

    @Test
    @DisplayName("Calcula 15 por ciento para temporada baja")
    void calculaDescuentoTemporadaBaja() {
        double resultado =
                calculador.calcular(
                        "TEMPORADA_BAJA",
                        100000);

        assertEquals(15000, resultado, 0.001);
    }

    @Test
    @DisplayName("Calcula 20 por ciento para convenio")
    void calculaDescuentoConvenio() {
        double resultado =
                calculador.calcular("CONVENIO", 100000);

        assertEquals(20000, resultado, 0.001);
    }

    @Test
    @DisplayName("Retorna cero para un tipo desconocido")
    void retornaCeroParaTipoDesconocido() {
        double resultado =
                calculador.calcular("DESCONOCIDO", 100000);

        assertEquals(0, resultado, 0.001);
    }
}