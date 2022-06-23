
Feature: El usuario cambia opciones de configuracion

  Scenario Outline : El usuario entra en configuracion y cambia el modo oscuro y notificaciones
    Given la aplicación está cargada correctamente
    And El usuario inicia sesión en la aplicación con: <email>, <password>
    When  el usuario hace click en el boton menu hamburguesa
    And   el usario hace click en el boton configuracion
    And   el usuario hace click en el checkbok de modo oscuro
    And   el usuario hace click en el checkbok de notificaciones
    Examples:
      | email                 | password |
      | juan229mart@gmail.com | JuanM123 |
