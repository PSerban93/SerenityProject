package org.fasttrackit.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class RegisterPage extends PageObject{

    @FindBy(id = "firstname")
    private WebElementFacade firstnameField;

    @FindBy(name = "lastname")
    private WebElementFacade lastnameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailField;

    @FindBy(css = ".buttons-set .button")
    private WebElementFacade registerButton;

    @FindBy(id = "advice-required-entry-password")
    private WebElementFacade registerRequiredPassElement;

    @FindBy(id = "advice-required-entry-email_address")
    private WebElementFacade registerRequiredEmailElement;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmationField;

    @FindBy(css = ".success-msg span")
    private WebElementFacade registerSuccessElement;

    public void setfirstnameField(String firstname){
        typeInto(firstnameField, firstname);
    }

    public void setlastnameField(String lastname){
        typeInto(lastnameField, lastname);
    }

    public void setEmailField(String email){
        waitFor(emailField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(emailField);
        typeInto(emailField, email);
    }
    public void setPasswordField(String pass){
        waitFor(passwordField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(passwordField);
        typeInto(passwordField, pass);
    }
    public void setConfirmationField(String confirmation){
        waitFor(confirmationField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(confirmationField);
        typeInto(confirmationField, confirmation);
    }
    public void clickRegisterButton(){
        clickOn(registerButton);
    }

    public void checkRequiredMessage(String requiredmessage){
            registerRequiredPassElement.shouldContainOnlyText("This is a required field.");
    }

    public void checkRequiredEmail(String requiredEmail){
        registerRequiredEmailElement.shouldContainOnlyText("This is a required field.");
    }
    public void checkRegisterSuccess(String registerSuccess){
        registerSuccessElement.shouldContainOnlyText("Thank you for registering with Madison Island.");
    }

}

