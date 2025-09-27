@HU01-RegistrarUsuario
Feature: Registar usuario en la página web Demo Blaze

  @ESC03 @HappyPath @RegistrarUsuario
  Scenario Outline: Registrar un usuario con datos validos de manera exitosa
    Given el actor ingresa a la página web de Demon Blaze
    And selecciona el item Sign up para el regisrto de usuario
    When se registra ingresando nombre de usuario "<usuario>"  y contrasenia "<contrasenia>"
    Then se realiza el registro del usuario de manera exitosa

    Examples:
      | usuario| contrasenia |
      | rsoles23021  | rsoles2025   |
      | ocontreras23021   | ocontreras2025  |

  @ESC04 @RegistrarUsuario
  Scenario Outline: Registrar un usuario con datos ya registrados
    Given el actor ingresa a la página web de Demon Blaze
    And selecciona el item Sign up para el regisrto de usuario
    When se registra ingresando nombre de usuario "<usuario>"  y contrasenia "<contrasenia>"
    Then se muestra el mensaje de error que el usuario ya existe

    Examples:
      | usuario| contrasenia |
      | rsoles23  | rsoles2025   |
      | ocontreras23   | ocontreras2025  |

