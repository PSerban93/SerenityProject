package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void proceedtoCheckout() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        checkoutSteps.navigateToCheckoutPage();
        checkoutSteps.checkCheckoutpage();
    }

    @Test
    public void proceedtoCheckoutmini() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        checkoutSteps.navigateToCheckoutPagefromCarticon();
        checkoutSteps.checkCheckoutpage();
    }

    @Test
    public void validCheckout(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
        cartSteps.checkCartSuccess("Silver Desert Necklace was added to your shopping cart.");

    }

}
