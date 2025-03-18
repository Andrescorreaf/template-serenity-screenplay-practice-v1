#language: es

@Test
Característica: Realizar recarga exitosa a cliente movil exito
  Como usuario
  Quiero realiza recargasde diferente valor
  Para tener minutos y dato en mi movil


  Escenario: Ser realice una recarga exitosa a un numero movil del exito
    Dado que el usairo está en el formualario de checkout
    Cuando realiza el proceso de pago
    Entonces espero ver un un texto de confirmacion exitoso
