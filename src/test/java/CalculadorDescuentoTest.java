import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadorDescuentoTest {

    private static final double VALOR_COMPRA = 100000;
    private static final double DELTA = 0.001;

    @Test
    @DisplayName("Conserva el descuento de cliente frecuente")
    void calculaDescuentoFrecuente() {

        CalculadorDescuento calculador =
                new CalculadorDescuento(
                        new DescuentoFrecuente());

        double resultado =
                calculador.calcular(VALOR_COMPRA);

        assertEquals(10000, resultado, DELTA);
    }

    @Test
    @DisplayName("Conserva el descuento de temporada baja")
    void calculaDescuentoTemporadaBaja() {

        CalculadorDescuento calculador =
                new CalculadorDescuento(
                        new DescuentoTemporadaBaja());

        double resultado =
                calculador.calcular(VALOR_COMPRA);

        assertEquals(15000, resultado, DELTA);
    }

    @Test
    @DisplayName("Conserva el descuento por convenio")
    void calculaDescuentoConvenio() {

        CalculadorDescuento calculador =
                new CalculadorDescuento(
                        new DescuentoConvenio());

        double resultado =
                calculador.calcular(VALOR_COMPRA);

        assertEquals(20000, resultado, DELTA);
    }

    @Test
    @DisplayName("Conserva el resultado sin descuento")
    void calculaSinDescuento() {

        CalculadorDescuento calculador =
                new CalculadorDescuento(
                        new SinDescuento());

        double resultado =
                calculador.calcular(VALOR_COMPRA);

        assertEquals(0, resultado, DELTA);
    }

    @Test
    @DisplayName("No permite crear el calculador con una política nula")
    void rechazaPoliticaNula() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new CalculadorDescuento(null));
    }
}