

@TimeEntries
Feature: Como cliente potencial quiero Agregar una entrada de tiempo

  Scenario Outline: El usuario se logea correctamente con credenciales validas
    Given Que el usuario se encuentra en la App
    When el usuario hace click en el boton
    Then El usuario verifica el logueo
    Examples:
      | email                 | password |
      | juan229mart@gmail.com | 123456   |

