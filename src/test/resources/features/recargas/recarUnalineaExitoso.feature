#language: es
  
Característica: Realizar recarga exitosa a cliente movil exito
  Como usuario
  Quiero realiza recargas de usando diferentes metodos de pago
  Para tener minutos y dato en mi movil


  Escenario: Realizar una recarga exitosa usando el metodo de pago PSE
    Dado que el usairo esta en el formualario de checkout
    Cuando realiza el proceso de pago
    Entonces espero ver un un texto de confirmacion exitoso
