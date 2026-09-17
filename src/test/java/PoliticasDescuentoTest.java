import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PoliticasDescuentoTest {

    private static final double VALOR_COMPRA = 100000;
    private static final double DELTA = 0.001;

    @Test
    @DisplayName("DescuentoFrecuente calcula el 10 por ciento")
    void frecuenteCalculaDiezPorCiento() {

        PoliticaDescuento politica =
                new DescuentoFrecuente();

        double resultado =
                politica.calcular(VALOR_COMPRA);

        assertEquals(10000, resultado, DELTA);
    }

    @Test
    @DisplayName("DescuentoTemporadaBaja calcula el 15 por ciento")
    void temporadaBajaCalculaQuincePorCiento() {

        PoliticaDescuento politica =
                new DescuentoTemporadaBaja();

        double resultado =
                politica.calcular(VALOR_COMPRA);

        assertEquals(15000, resultado, DELTA);
    }

    @Test
    @DisplayName("DescuentoConvenio calcula el 20 por ciento")
    void convenioCalculaVeintePorCiento() {

        PoliticaDescuento politica =
                new DescuentoConvenio();

        double resultado =
                politica.calcular(VALOR_COMPRA);

        assertEquals(20000, resultado, DELTA);
    }

    @Test
    @DisplayName("SinDescuento retorna cero")
    void sinDescuentoRetornaCero() {

        PoliticaDescuento politica =
                new SinDescuento();

        double resultado =
                politica.calcular(VALOR_COMPRA);

        assertEquals(0, resultado, DELTA);
    }
}