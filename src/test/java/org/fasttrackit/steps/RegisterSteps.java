package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class RegisterSteps extends BaseSteps {

    @Step
    public void navigateToRegisterPage() {
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }

    @Step
    public void enterCredentialsnoPass(String firstname, String lastname , String email ) {
        registerPage.setfirstnameField(firstname);
        registerPage.setlastnameField(lastname);
        registerPage.setEmailField(email);
    }
    @Step
    public void enterCredentialsnoMail(String firstname, String lastname , String pass, String confirmation ) {
        registerPage.setfirstnameField(firstname);
        registerPage.setlastnameField(lastname);
        registerPage.setPasswordField(pass);
        registerPage.setConfirmationField(confirmation);
    }
    @Step
    public void enterCredentials(String firstname, String lastname , String email, String pass, String confirmation ) {
        registerPage.setfirstnameField(firstname);
        registerPage.setlastnameField(lastname);
        registerPage.setPasswordField(pass);
        registerPage.setConfirmationField(confirmation);
        registerPage.setEmailField(email);
    }
       @Step
    public void clickRegister(){
        registerPage.clickRegisterButton();
    }
    @Step
    public void checkRequiredMessage(String requiredmessage) {
        registerPage.checkRequiredMessage(requiredmessage);
    }
    @Step
    public void checkRequiredEmail(String requiredMail) {
        registerPage.checkRequiredEmail(requiredMail);
    }
    @Step
    public void checkRegisterSuccess(String registerSuccess){
        registerPage.checkRegisterSuccess(registerSuccess);
    }
}
