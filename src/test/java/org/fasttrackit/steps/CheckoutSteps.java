package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps {

    @Step
    public void navigateToCheckoutPage() {
        homePage.clickAccountLink();
        homePage.clickcheckoutLink();
    }

    @Step
    public void navigateToCheckoutPagefromCarticon() {
        homePage.clickminicartIcon();
        homePage.clickcheckoutcarticonLink();
    }

    @Step
    public void checkCheckoutpage() {
        checkoutPage.checkCheckoutpage("CHECKOUT");
    }
}
