


Feature: El usuario se logea en la App correctamente

  Scenario Outline: El usuario se logea correctamente con credenciales validas
    Given la aplicación está cargada correctamente
    And El usuario inicia sesión en la aplicación con: <email>, <password>
    When el usuario hace click en Log in
    Then El usuario verifica el logueo
    Examples:
      | email                 | password |
      | juan229mart@gmail.com | JuanM123 |

  Scenario Outline: El usuario se logea y cierra sesion
    Given la aplicación está cargada correctamente
    And El usuario inicia sesión en la aplicación con: <email>, <password>
    When el usuario hace click en el boton menu hamburguesa
    And Clikea en el boton Log out
    Examples:
      | email                 | password |
      | juan229mart@gmail.com | JuanM123 |