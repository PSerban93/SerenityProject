package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends BasePage{

    @FindBy(css = ".page-title")
    private WebElementFacade CheckoutpageElement;

    public void checkCheckoutpage(String Checkoutpage){
        CheckoutpageElement.shouldContainOnlyText("CHECKOUT");
    }
}
