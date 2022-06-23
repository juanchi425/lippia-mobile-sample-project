package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.setInput;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class HomeService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.SIGN_OUT_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void clickAddTimeEntries(){
        MobileActionManager.waitVisibility(HomeConstants.BUTTON_ADD);
        click(HomeConstants.BUTTON_ADD);
    }
    public static void addTime(String H_inicio, String H_final){

        MobileActionManager.waitVisibility(HomeConstants.HORA_INICIO);
        setInput(HomeConstants.HORA_INICIO, H_inicio);
        setInput(HomeConstants.HORA_INICIO, H_inicio);
        setInput(HomeConstants.HORA_FINAL, H_final);
        setInput(HomeConstants.HORA_FINAL, H_final);
    }

    public static void addWorking(String working){
        click(HomeConstants.WORKING_DESCRIP);
        setInput(HomeConstants.WORKING_DESCRIP,working);
    }
    public static void clickProject(){
        click(HomeConstants.PROJECT);
        click(HomeConstants.BUTTON_ADD);
    }
    public static void addProject(String project){
        setInput(HomeConstants.PROJECT_NAME, project);
    }
    public static void clickAddClient(){
        click(HomeConstants.CLIENTE);
        click(HomeConstants.BUTTON_ADD);
    }
    public static void addClient(String cliente){
        setInput(HomeConstants.ADD_CLIENTE, cliente);
        click(HomeConstants.BUTTON_SAVE);
    }
    public static void Guardar(){
        click(HomeConstants.BUTTON_ADD);
    }
    public static void clickAddTasks(){
        click(HomeConstants.TASKS);
        click(HomeConstants.BUTTON_ADD);
    }

    public static void addTask(String task){
        setInput(HomeConstants.ADD_TASKS, task);
        click(HomeConstants.BUTTON_SAVE);
    }
    public static void clickAddTag(){
        click(HomeConstants.TAGS);
        click(HomeConstants.BUTTON_ADD);
    }
    public static void addTag(String tag){
        setInput(HomeConstants.ADD_TAGS, tag);
        click(HomeConstants.BUTTON_SAVE);
        click(HomeConstants.BUTTON_ATRAS);
    }
    public static void visualizaLista(){
        MobileActionManager.waitVisibility(HomeConstants.TITLE_TIME_ENTRIES);
    }
    public static void ingresarFecha(){
        click(HomeConstants.START_FECHA);
        click(HomeConstants.INPUT_FECHA);
        click(HomeConstants.BUTTON_ADD);
    }
    public static void cancelarEntrada(){
        click(HomeConstants.BUTTON_DISCARD);
        click(HomeConstants.BUTTON_CONFIRM_DISCARD);
    }

}
