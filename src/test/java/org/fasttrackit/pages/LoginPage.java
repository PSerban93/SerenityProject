package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passwordField;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    @FindBy(css = ".error-msg span")
    private WebElementFacade loginErrorMessageElement;
    public void checkLoggedInmsg(String message) {
        loginErrorMessageElement.shouldContainOnlyText("Invalid login or password.");
    }

    @FindBy(id = "advice-required-entry-email")
    private WebElementFacade loginRequiredMessageElement;
    public void checkRequiredMessage(String requiredmsg) {
        loginRequiredMessageElement.shouldContainOnlyText("This is a required field.");
    }
    @FindBy(id = "advice-required-entry-pass")
    private WebElementFacade loginRequiredPassElement;
    public void checkRequiredPass(String requiredpass) {
        loginRequiredPassElement.shouldContainOnlyText("This is a required field.");
    }



    public void setEmailField(String email){
        waitFor(emailField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(emailField);
        typeInto(emailField, email);
    }

    public void setPasswordField(String pass){
        typeInto(passwordField, pass);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }
}
