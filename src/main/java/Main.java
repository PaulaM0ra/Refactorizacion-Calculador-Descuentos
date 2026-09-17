package main.java;
public class Main {

        public static void main(String[] args) {

                ProcesoCompra procesoCompra = new ProcesoCompra();

                double valorCompra = 100000;

                double descuentoFrecuente = procesoCompra.realizarCompra(
                                valorCompra,
                                new DescuentoFrecuente());

                double descuentoTemporada = procesoCompra.realizarCompra(
                                valorCompra,
                                new DescuentoTemporadaBaja());

                double descuentoConvenio = procesoCompra.realizarCompra(
                                valorCompra,
                                new DescuentoConvenio());

                System.out.println(
                                "Descuento frecuente: "
                                                + descuentoFrecuente);

                System.out.println(
                                "Descuento temporada baja: "
                                                + descuentoTemporada);

                System.out.println(
                                "Descuento convenio: "
                                                + descuentoConvenio);

                double sinDescuento = procesoCompra.realizarCompra(
                                valorCompra,
                                new SinDescuento());

                System.out.println(
                                "Sin descuento: " + sinDescuento);
        }
}