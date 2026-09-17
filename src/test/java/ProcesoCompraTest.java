import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProcesoCompraTest {

    private static final double VALOR_COMPRA = 100000;
    private static final double DELTA = 0.001;

    @Test
    @DisplayName("ProcesoCompra utiliza la política frecuente")
    void utilizaPoliticaFrecuente() {

        ProcesoCompra procesoCompra =
                new ProcesoCompra();

        double resultado =
                procesoCompra.realizarCompra(
                        VALOR_COMPRA,
                        new DescuentoFrecuente());

        assertEquals(10000, resultado, DELTA);
    }

    @Test
    @DisplayName("ProcesoCompra puede cambiar de política")
    void permiteCambiarPolitica() {

        ProcesoCompra procesoCompra =
                new ProcesoCompra();

        double descuentoFrecuente =
                procesoCompra.realizarCompra(
                        VALOR_COMPRA,
                        new DescuentoFrecuente());

        double descuentoConvenio =
                procesoCompra.realizarCompra(
                        VALOR_COMPRA,
                        new DescuentoConvenio());

        assertEquals(
                10000,
                descuentoFrecuente,
                DELTA);

        assertEquals(
                20000,
                descuentoConvenio,
                DELTA);
    }

    @Test
    @DisplayName("Permite agregar una estrategia sin modificar el proceso")
    void permiteAgregarNuevaEstrategia() {

        PoliticaDescuento politicaPrueba =
                valorCompra -> valorCompra * 0.05;

        ProcesoCompra procesoCompra =
                new ProcesoCompra();

        double resultado =
                procesoCompra.realizarCompra(
                        VALOR_COMPRA,
                        politicaPrueba);

        assertEquals(5000, resultado, DELTA);
    }
}