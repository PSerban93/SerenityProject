package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class ProductSteps extends BaseSteps {

    @Step
    public void selectProduct(){
        homePage.open();
        homePage.clickProductCategory();
        productPage.clickAddToCartButton();
    }

}
