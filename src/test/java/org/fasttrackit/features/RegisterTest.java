package org.fasttrackit.features;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

public class RegisterTest extends BaseTest {
    String email = RandomStringUtils.randomAlphanumeric(6)+"@mailinator.com";

    @Test
    public void registernewwithoutpass() {
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegisterPage();
        registerSteps.enterCredentialsnoPass("Serban","Perseca", "ion.dintufe"+email);
        registerSteps.clickRegister();
        registerSteps.checkRequiredMessage("This is a required field.");
    }
    @Test
    public void registernewwithoutmail() {
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegisterPage();
        registerSteps.enterCredentialsnoMail("Serban","Perseca", "123456","123456");
        registerSteps.clickRegister();
        registerSteps.checkRequiredEmail("This is a required field.");
    }
    @Test
    public void registernew() {
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegisterPage();
        registerSteps.enterCredentials("Serban","Perseca", "ion.dintufe"+email,"123456", "123456");
        registerSteps.clickRegister();
        registerSteps.checkRegisterSuccess("Thank you for registering with Madison Island.");
    }
}
