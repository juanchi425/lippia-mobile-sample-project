package com.crowdar.examples.services;

import static com.crowdar.core.actions.MobileActionManager.*;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.LoginConstants;

import org.testng.Assert;
import com.crowdar.core.actions.ActionManager;

import static com.crowdar.core.actions.ActionManager.click;



/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {

    public static void doLogin(String email, String password){
        setInput(LoginConstants.TEXT_EMAIL, email);
        setInput(LoginConstants.TEXT_PASSWORD, password);

    }
    public static void clickLogout(){
        click(LoginConstants.BUTTON_LOGOUT);
    }

    public static void isViewLoaded(){
        waitVisibility(LoginConstants.BUTTON_LOGIN);
    }

    public static void clickLogin(){
        click(LoginConstants.BUTTON_LOGIN);
    }
    public static void verificaLogueo(){
        waitVisibility(LoginConstants.BUTTON_HAMBUR);
    }
}
