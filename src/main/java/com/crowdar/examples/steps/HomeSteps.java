package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.*;


import static com.crowdar.examples.services.HomeService.*;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class HomeSteps extends PageSteps {

    @Then("Home page is displayed")
    public void isHomePageVisible() {
        HomeService.isViewLoaded();
    }

    @When("The user changes the language")
    public void doChangeLanguage() {
        MobileActionManager.click(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR);
    }

    @When("The user log out of the app")
    public void doSignOut() {
        MobileActionManager.click(HomeConstants.SIGN_OUT_BUTTON_LOCATOR);
    }

    @io.cucumber.java.en.When("el usuario hace click en el boton de Añadir entrada de tiempo")
    public void elUsuarioHaceClickEnElBotonDeAñadirEntradaDeTiempo() {
        clickAddTimeEntries();
    }

    @io.cucumber.java.en.Given("Que el usuario se encuentra en la Home")
    public void queElUsuarioSeEncuentraEnLaHome() {

    }


    @io.cucumber.java.en.And("Ingresa un tiempo de ocho horas y diez minutos (.*), (.*)")
    public void ingresaUnTiempoDeOchoHorasYDiezMinutosInicioFinal(String H_inicio,String H_final) {
               addTime(H_inicio,H_final);
    }

    @io.cucumber.java.en.And("El usuario se loguea correctamente")
    public void elUsuarioSeLogueaCorrectamente() {
        LoginService.doLogin("juan229mart@gmail.com" , "JuanM123");
        LoginService.clickLogin();
    }

    @io.cucumber.java.en.And("ingresa su Trabajo (.*)")
    public void ingresaSuTrabajoWorking(String working) {
        addWorking(working);
    }

    @io.cucumber.java.en.And("hace click en projectos y clikea el boton de añadir proyecto")
    public void haceClickEnProjectosYClikeaElBotonDeAñadirProyecto() {
        clickProject();
    }

    @io.cucumber.java.en.And("Ingresa el nombre del proyecto (.*)")
    public void ingresaElNombreDelProyectoProject(String project){
        addProject(project);
    }

    @io.cucumber.java.en.And("clikea en cliente y hace clik en añadir cliente")
    public void clikeaEnClienteYHaceClikEnAñadirCliente() {
        clickAddClient();
    }

    @io.cucumber.java.en.And("Ingresa el nombre del cliente (.*) y clieckea en Guardar")
    public void ingresaElNombreDelClienteClientYClieckeaEnGuardar(String cliente) {
        addClient(cliente);
    }
    @io.cucumber.java.en.And("Guarda el proyecto creado")
    public void guardaElProyectoCreado(){
        Guardar();
    }
    @io.cucumber.java.en.And("hace click en Tareas y clikea en el boton añadir tarea")
    public void haceClickEnTareasYClikeaEnElBotonAñadirTarea() {
        clickAddTasks();
    }



    @io.cucumber.java.en.And("ingresa el nombre de la tarea (.*)y clikea en el boton añadir")
    public void ingresaElNombreDeLaTareaTasksYClikeaEnElBotonAñadir(String task) {
        addTask(task);
    }

    @io.cucumber.java.en.And("hace click en Tags y clikea en el boton añadir Tags")
    public void haceClickEnTagsYClikeaEnElBotonAñadirTags() {
        clickAddTag();
    }

    @io.cucumber.java.en.And("ingresa el Tag y vuelve al home (.*)")
    public void ingresaElNombreDelTagTag(String tag) {
        addTag(tag);
    }

    @io.cucumber.java.en.And("hace click en el boton guardar")
    public void haceClickEnElBotonGuardar() {
        Guardar();
    }


    @io.cucumber.java.en.Then("verifica la creacion del Time Entries")
    public void verificaLaCreacionDelTimeEntries(){
        visualizaLista();
    }


    @io.cucumber.java.en.And("clickea en ingresar la fecha y selecciona la fecha veintitres de junio del dos mil veintidos")
    public void clickeaEnIngresarLaFechaYSeleccionaLaFechaVeintitresDeJunioDelDosMilVeintidos(){
            ingresarFecha();
    }


    @io.cucumber.java.en.And("hace click en el boton cancelar")
    public void haceClickEnElBotonCancelar() {
        cancelarEntrada();
    }


}
