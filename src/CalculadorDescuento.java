public class CalculadorDescuento {

    private final PoliticaDescuento politica;

    public CalculadorDescuento(
            PoliticaDescuento politica) {

        if (politica == null) {
            throw new IllegalArgumentException(
                    "La politica de descuento es obligatoria");
        }

        this.politica = politica;
    }

    public double calcular(double valorCompra) {
        return politica.calcular(valorCompra);
    }
}