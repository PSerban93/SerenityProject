package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        loginSteps.checkUserIsLoggedIn(EnvConstants.USER_NAME);
    }

    @Test
    public void loginWithInvalidCredentialsTest() {
        loginSteps.doLogin("cosmin@fastrackit.org", "123654");
               loginSteps.checkLoggedInmsg("Invalid login or password.");
    }

    @Test
    public void loginWithInvalidpasswordTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, "123456asdf");
        loginSteps.checkLoggedInmsg("Invalid login or password.");
    }

    @Test
    public void loginWithoutemail() {
        loginSteps.doLogin("",EnvConstants.USER_PASS);
        loginSteps.checkRequiredMessage("This is a required field.");
    }
    @Test
    public void loginWithoutpass() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, "");
        loginSteps.checkRequiredPass("This is a required field.");
    }
}
