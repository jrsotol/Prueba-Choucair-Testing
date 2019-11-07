#language: es

Característica: Validar botón "Capacidades"
  Como encargado de pruebas
  Quiero probar que el botón "Capacidades" de la pagina de Choucair Testing
  Para validar que haga lo especificado

  @ValidarServicios
  Escenario: Validar Botón "Capacidades" en la sección de Servicios
    Dado que usuario quiere ingresar a la pagina de Choucair Testing
    Cuando el ingrese y se dirija a revisar los servicios que ofrecen
    Y validar que el botón de Capacidades hace lo especificado
    Entonces deberia ver en pantalla las Capacidades de Pruebas Centradas en el negocio que el vínculo ofrece
