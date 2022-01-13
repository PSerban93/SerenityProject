package org.fasttrackit.features;

import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("cosmin@fasttrackit.org", "123456");
        loginSteps.clickLogin();
        loginSteps.checkUserIsLoggedIn("Cosmin Fast");
    }

    @Test
    public void loginWithInvalidCredentialsTest() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("cosmin@fastrackit.org", "123456");
        loginSteps.clickLogin();
        loginSteps.checkLoggedInmsg("Invalid login or password.");
    }

    @Test
    public void loginWithInvalidpasswordTest() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("cosmin@fasttrackit.org", "123456asdf");
        loginSteps.clickLogin();
        loginSteps.checkLoggedInmsg("Invalid login or password.");
    }
    @Test
    public void loginWithoutemail() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("", "123456");
        loginSteps.clickLogin();
        loginSteps.checkRequiredMessage("This is a required field.");
    }
    @Test
    public void loginWithoutpass() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("cosmin@fasttrackit.org", "");
        loginSteps.clickLogin();
        loginSteps.checkRequiredPass("This is a required field.");
    }
}
