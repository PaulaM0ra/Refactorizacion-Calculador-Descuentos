public class DescuentoConvenio
        implements PoliticaDescuento {

    private static final double PORCENTAJE = 0.20;

    @Override
    public double calcular(double valorCompra) {
        return valorCompra * PORCENTAJE;
    }
}