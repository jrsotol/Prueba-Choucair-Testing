#language: es

Característica: Validar botón "Cómo lo hacemos"
  Como usuario de pruebas
  Quiero probar que el botón "Cómo lo Hacmos" de la pagina de Choucair Testing
  Para validar que haga lo especificado

  @ValidarServicios
  Escenario: Validar Botón "Cómo lo hacemos" en la sección de Servicios
    Dado que usuario quiere ingresar a la pagina de Choucair Testing
    Cuando el ingrese y se dirija a revisar los servicios que ofrecen
    Y validar que el botón de Cómo lo hacemos hace lo especificado
    Entonces deberia ver en pantallas las Cómo lo hacemos que el vínculo ofrece
