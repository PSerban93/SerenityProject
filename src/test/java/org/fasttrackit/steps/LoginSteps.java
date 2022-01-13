package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;

public class LoginSteps extends ScenarioSteps {


    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToLoginPage(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }

    @Step
    public void enterCredentials(String email, String pass){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(pass);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();
    }

    @Step
    public void checkUserIsLoggedIn(String userName){
        myAccountPage.checkUserLoggedIn(userName);
    }

    @Step
    public void checkLoggedInmsg(String message){
        loginPage.checkLoggedInmsg(message);
    }

    @Step
    public void checkRequiredMessage(String requiredmessage) {
        loginPage.checkRequiredMessage(requiredmessage);
    }
    @Step
    public void checkRequiredPass(String requiredpass) {
        loginPage.checkRequiredPass(requiredpass);
    }
    @Step
    public void doLogin(String user, String pass){
        navigateToHomePage();
        navigateToLoginPage();
        enterCredentials(user,pass);
        clickLogin();
    }

}
