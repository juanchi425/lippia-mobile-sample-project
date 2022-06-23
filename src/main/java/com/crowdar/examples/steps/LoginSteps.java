package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {



    @When("The user goes to the Sign Up page")
    public void goToSignUp() {
        MobileActionManager.click(LoginConstants.SIGN_UP_BUTTON_LOCATOR);
    }

    @When("El usuario inicia sesión en la aplicación con: (.*), (.*)")
    public void doLoginProcess(String email, String password) {
        LoginService.doLogin(email, password);
    }


    @io.cucumber.java.en.When("el usuario hace click en Log in")
    public void theUserClicksOnLogIn() {
          LoginService.clickLogin();
    }

    @Given("la aplicación está cargada correctamente")
    public void theAppIsLoadedCorrectly() {
        LoginService.isViewLoaded();
    }

    @Then("El usuario verifica el logueo")
    public void elUsuarioVerificaElLogueo() {
        LoginService.verificaLogueo();
    }



    @And("Clikea en el boton Log out")
    public void clikeaEnElBotonLogOut() {
        LoginService.clickLogout();
    }
}
