package main.java;
public class ProcesoCompra {

    public double realizarCompra(
            double valorCompra,
            PoliticaDescuento politica) {

        CalculadorDescuento calculador =
                new CalculadorDescuento(politica);

        return calculador.calcular(valorCompra);
    }
}