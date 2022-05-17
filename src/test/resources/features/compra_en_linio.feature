Feature: Realizar la compra de productos en linio
  Yo como usuario requiero realizar la compra
  de varios productos

  Scenario: seleccionar articulo para una compra y luego borrar producto de carrito
    Given el usuario se encuentra en la pagina https://www.linio.com.co/
    When el usuario ingresa al menu hogar colchones base cama y almohadas y elije un producto
    And el usuario elimina un producto del carrito
    Then el usuario visualiza los productos y el valor total
    And el usuario visualiza el mensaje "NO TIENES PRODUCTOS EN TU CARRITO"




