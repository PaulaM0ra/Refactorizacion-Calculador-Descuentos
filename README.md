# Motor flexible de asignación de descuentos

## Descripción

Este proyecto corresponde al caso de estudio de la plataforma
TurismoCundinamarca. El sistema permite calcular descuentos para
la compra de planes turísticos.

## Problema inicial

La clase CalculadorDescuento utilizaba una cadena de condicionales
para identificar los descuentos de cliente frecuente, temporada
baja y convenio empresarial.

Cada nueva política requería modificar el método calcular, lo que
aumentaba el acoplamiento y dificultaba el mantenimiento.

## Patrón aplicado

Se aplicó el patrón Strategy, perteneciente a la categoría de
patrones GoF de comportamiento.

Cada política de descuento implementa la interfaz
PoliticaDescuento y contiene su propio algoritmo de cálculo.

## Políticas implementadas

- Cliente frecuente: 10 %.
- Temporada baja: 15 %.
- Convenio empresarial: 20 %.
- Sin descuento: 0 %.

## Estructura de la solución

- PoliticaDescuento: interfaz común.
- DescuentoFrecuente: estrategia concreta del 10 %.
- DescuentoTemporadaBaja: estrategia concreta del 15 %.
- DescuentoConvenio: estrategia concreta del 20 %.
- SinDescuento: estrategia que retorna cero.
- CalculadorDescuento: contexto que utiliza una estrategia.
- ProcesoCompra: proporciona la política aplicable.
- Main: ejecuta ejemplos de funcionamiento.

## Ejecución

Ejecutar la clase Main desde Visual Studio Code.

Resultados esperados para una compra de 100000:

- Frecuente: 10000.
- Temporada baja: 15000.
- Convenio: 20000.
- Sin descuento: 0.

## Cambios principales

1. Se creó la interfaz PoliticaDescuento.
2. Se separó cada descuento en una clase.
3. Se eliminaron los condicionales de CalculadorDescuento.
4. Se cambiaron los números mágicos por constantes.
5. Se aplicó inyección de dependencias mediante el constructor.
6. Se agregó la clase ProcesoCompra.
7. Se conservó el comportamiento funcional original.

## Beneficios

- Menor acoplamiento.
- Mayor extensibilidad.
- Mejor mantenibilidad.
- Pruebas independientes.
- Incorporación de nuevas políticas sin modificar el calculador.

## Autora

Paula Dayana Mora Acosta