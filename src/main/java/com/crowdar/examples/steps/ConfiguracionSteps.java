package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;

import static com.crowdar.examples.services.ConfiguracionService.*;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class ConfiguracionSteps extends PageSteps {

    @io.cucumber.java.en.When("el usuario hace click en el boton menu hamburguesa")
    public void elUsuarioHaceClickEnElBotonMenuHamburguesa() {
        clickMenuHambuerguesa();
    }

    @io.cucumber.java.en.And("el usario hace click en el boton configuracion")
    public void elUsarioHaceClickEnElBotonConfiguracion() {
        clickConfiguracion();
    }

    @io.cucumber.java.en.And("el usuario hace click en el checkbok de modo oscuro")
    public void elUsuarioHaceClickEnElCheckbokDeModoOscuro() {
        clickModoOscuro();
    }

    @io.cucumber.java.en.And("el usuario hace click en el checkbok de notificaciones")
    public void elUsuarioHaceClickEnElCheckbokDeNotificaciones() {
        clickNotificacion();
    }



}
