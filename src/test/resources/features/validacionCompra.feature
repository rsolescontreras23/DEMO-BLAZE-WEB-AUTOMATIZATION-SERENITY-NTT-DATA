@HU03-ValidarCompra
Feature: Validar que el usuario realice una compra de manera exitosa

  @ESC05 @HappyPath @ValidarCompra
  Scenario Outline: Valición de una compra exitosa.
#    Iniciar sesión
    Given el actor ingresa a la página web de Demon Blaze
    And selecciona el item Log in para el inición de sesión
    When inicia sesión ingresando el username "rsoles23" y la contraseña "rsoles2025"
    Then se inicia sesión de manera exitosa

# Elegir un producto y agregarlo al carrito
    When selecciona aleatoriamente un producto de la primera página
    And lo añade al carrito de compras
    Then se agrega el producto exitosamente
# Ir al carrito y poner una orden
    When selecciona el item Cart para ver el carrito
    And selecciona el botón Place Order para realizar un pedido
    And completa el formulario con los datos nombre "<name>", país "<country>", ciudad "<city>", número de tarjeta de crédito "<creditcard>", mes "<month>" y año "<year>"
    And selecciona el botón Purchase
    Then se realiza la compra exitosamente
    And presiona el botón OK del mensaje exitoso
# Verificar carrito vacio.
    When selecciona el item Cart para ver el carrito
    Then el carrito esta vácio


    Examples:
      | name   | country | city      | creditcard            |  month     | year   |
      | Renzo  | Peru    | Trujillo  |  4343 4545 5656 7676  | Septiembre  | 2025   |






