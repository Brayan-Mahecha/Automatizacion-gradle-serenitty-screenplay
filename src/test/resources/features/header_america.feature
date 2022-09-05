Feature: Recorer header america de cali
  Yo como usuario quiero validar todo el header de la pagina America


  Scenario Outline: Interactuar con todo el header
    Given el usuario se encuentra en la pagina https://www.americadecali.co/
    When el usuario interactua con el header alto de la pagina
    And el usuario ingrese las credenciales <email>
    Then el usuario deberia ver el nombre en la aplicacion <mensaje>
    And  deberia ver la palabra AMÉRICA PLAY en la pantalla
    Examples:
      | mensaje                                | email|
      |      AMÉRICA PLAY                              | asnarepse2021@hotmail.com |





