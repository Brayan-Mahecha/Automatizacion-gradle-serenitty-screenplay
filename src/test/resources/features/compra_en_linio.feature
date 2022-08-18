Feature: Realizar la compra de productos en linio
  Yo como usuario requiero realizar la compra
  de varios productos

  Scenario Outline: seleccionar articulo para una compra y luego borrar producto de carrito
    Given el usuario se encuentra en la pagina https://www.americadecali.co/
    When el usuario interactua con el header alto de la pagina
    Then el usuario deberia ver el nombre en la aplicacion <mensaje>
    Examples:
      | mensaje                                |
      |      AMÉRICA PLAY                              |





