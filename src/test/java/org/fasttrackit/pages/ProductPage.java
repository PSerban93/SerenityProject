package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;

    @FindBy(id = "option17")
    private WebElementFacade selectColor;

    @FindBy(id = "option15")
    private WebElementFacade selectColor1;

    @FindBy(id = "option63")
    private WebElementFacade selectSize;

    @FindBy(id = "swatch73")
    private WebElementFacade selectSize1;

    @FindBy(css = ".success-msg span")
    private WebElementFacade cartSuccessElement;

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
    public void clickselectColor(){
        clickOn(selectColor);
    }
    public void clickselectColor1(){
        clickOn(selectColor1);
    }
    public void clickselectSize(){
        clickOn(selectSize);
    }
    public void clickselectSize1(){
        clickOn(selectSize1);
    }
    public void checkCartSuccess(String cartSuccess){
        cartSuccessElement.shouldContainOnlyText("Khaki Bowery Chino Pants was added to your shopping cart.");
    }
}
