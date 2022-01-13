package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;

public class ProductSteps extends ScenarioSteps {
    private HomePage homePage;
    private ProductPage productPage;

    @Step
    public void selectProduct(){
        homePage.open();
        homePage.clickProductCategory();
        productPage.clickAddToCartButton();
    }

}
