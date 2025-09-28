@HU02-IniciarSesion
Feature: Iniciar sesión en la página web Demo Blaze

  @ESC01 @HappyPath @IniciarSesion
  Scenario Outline: Iniciar sesión con credenciales válidas.
    Given el actor ingresa a la página web de Demon Blaze
    And selecciona el item Log in para el inición de sesión
    When se logea ingresando nombre de usuario "<usuario>"  y contrasenia "<contrasenia>"
    Then se inicia sesión de manera exitosa

    Examples:
      | usuario| contrasenia |
      | rsoles23  | rsoles2025   |
      | ocontreras23 | ocontreras2025  |


  @ESC02 @IniciarSesion
  Scenario Outline: Iniciar sesión con credenciales no existenes.
    Given el actor ingresa a la página web de Demon Blaze
    And selecciona el item Log in para el inición de sesión
    When se logea ingresando nombre de usuario "<usuario>"  y contrasenia "<contrasenia>"
    Then se muestra el mensaje de que el usuario no existe

    Examples:
      | usuario| contrasenia |
      | rsoles23asdsad  | rsoles2025   |
      | ocontreras23asdsad | ocontreras2025  |
