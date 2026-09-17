package main.java;
public class DescuentoFrecuente
        implements PoliticaDescuento {

    private static final double PORCENTAJE = 0.10;

    @Override
    public double calcular(double valorCompra) {
        return valorCompra * PORCENTAJE;
    }
}