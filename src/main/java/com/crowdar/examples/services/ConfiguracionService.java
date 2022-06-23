package com.crowdar.examples.services;


import static com.crowdar.examples.constants.ConfiguracionConstants.*;

import static com.crowdar.core.actions.ActionManager.click;





public class ConfiguracionService {

    public static void clickMenuHambuerguesa(){
        click(MENU_HAMBURGUESA);
    }
    public static void clickConfiguracion(){
        click(BUTTON_SETTING);
    }
    public static void clickModoOscuro(){
        click(BUTTON_MODE_DARK);
    }
    public static void clickNotificacion(){
        click(BUTTON_NOTIFICACION);
    }


}
