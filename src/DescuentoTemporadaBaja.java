public class DescuentoTemporadaBaja
        implements PoliticaDescuento {

    private static final double PORCENTAJE = 0.15;

    @Override
    public double calcular(double valorCompra) {
        return valorCompra * PORCENTAJE;
    }
}