


Feature: Como cliente potencial quiero Agregar una entrada de tiempo

    Background:
     Given la aplicación está cargada correctamente
     And El usuario se loguea correctamente

  @Test
  Scenario Outline: El usuario agrega una entrada de tiempo con horario

    When el usuario hace click en el boton de Añadir entrada de tiempo
    And Ingresa un tiempo de ocho horas y diez minutos <inicio>, <final>
     And  ingresa su Trabajo <Working>
     And  hace click en projectos y clikea el boton de añadir proyecto
     And Ingresa el nombre del proyecto <Project>
     And clikea en cliente y hace clik en añadir cliente
     And Ingresa el nombre del cliente <Client> y clieckea en Guardar
     And Guarda el proyecto creado
     And hace click en Tareas y clikea en el boton añadir tarea
     And ingresa el nombre de la tarea <Tasks>y clikea en el boton añadir
     And hace click en Tags y clikea en el boton añadir Tags
     And ingresa el Tag y vuelve al home <Tag>
     And hace click en el boton guardar
     Then verifica la creacion del Time Entries

    Examples:
      | inicio | final | Working | Project | Client | Tasks | Tag |
      | 08     | 10    | kat     | asda    | kat    | asd   | #4  |


  Scenario Outline: El usuario agrega una entrada de tiempo con fecha

     When el usuario hace click en el boton de Añadir entrada de tiempo
     And  clickea en ingresar la fecha y selecciona la fecha veintitres de junio del dos mil veintidos
     And Ingresa un tiempo de ocho horas y diez minutos <inicio>, <final>
     And  ingresa su Trabajo <Working>
     And  hace click en projectos y clikea el boton de añadir proyecto
     And Ingresa el nombre del proyecto <Project>
     And clikea en cliente y hace clik en añadir cliente
     And Ingresa el nombre del cliente <Client> y clieckea en Guardar
     And Guarda el proyecto creado
     And hace click en Tareas y clikea en el boton añadir tarea
     And ingresa el nombre de la tarea <Tasks>y clikea en el boton añadir
     And hace click en Tags y clikea en el boton añadir Tags
     And ingresa el Tag y vuelve al home <Tag>
     And hace click en el boton guardar
     Then verifica la creacion del Time Entries

    Examples:
      | inicio | final | Working | Project | Client | Tasks | Tag |
      | 08     | 10    | CAMBA   | CA2     | CAMBA  | SDS   | 1.1  |


  Scenario Outline: El usuario ingresa entrada de datos y cancela

    When el usuario hace click en el boton de Añadir entrada de tiempo
    And  clickea en ingresar la fecha y selecciona la fecha veintitres de junio del dos mil veintidos
    And Ingresa un tiempo de ocho horas y diez minutos <inicio>, <final>
    And  ingresa su Trabajo <Working>
    And  hace click en projectos y clikea el boton de añadir proyecto
    And Ingresa el nombre del proyecto <Project>
    And clikea en cliente y hace clik en añadir cliente
    And Ingresa el nombre del cliente <Client> y clieckea en Guardar
    And Guarda el proyecto creado
    And hace click en Tareas y clikea en el boton añadir tarea
    And ingresa el nombre de la tarea <Tasks>y clikea en el boton añadir
    And hace click en Tags y clikea en el boton añadir Tags
    And ingresa el Tag y vuelve al home <Tag>
    And hace click en el boton cancelar


    Examples:
      | inicio | final | Working | Project | Client | Tasks | Tag |
      | 08     | 10    | CAMBA2  | CA22    | CAMBA2 | SDS1  | 1.2 |



