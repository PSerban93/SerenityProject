package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {


    @Step
    public void clickAddProductToCart(){
        productPage.clickAddToCartButton();
    }
    @Step
    public void clickselectColor(){
        productPage.clickselectColor();
    }
    @Step
    public void clickselectColor1(){
        productPage.clickselectColor1();
    }
    @Step
    public void clickselectSize() {
        productPage.clickselectSize();
    }
    @Step
    public void clickselectSize1() {
        productPage.clickselectSize1();
    }
    @Step
    public void checkCartSuccess(String cartSuccess){
        productPage.checkCartSuccess("Khaki Bowery Chino Pants was added to your shopping cart.");

    }
    @Step
    public void navigateToCartPagefromCarticon(){
        homePage.clickminicartIcon();
        homePage.clickminicartLink();
    }

    @Step
    public void navigateToCart(){
        homePage.clickAccountLink();
        homePage.clickcartLink();
    }
    @Step
    public void checkaddSuccess(String addSuccess){
        cartPage.checkaddSuccess(addSuccess);
    }

    @Step
    public void cartisEmpty(String cartEmpty){
        cartPage.cartisEmpty("SHOPPING CART IS EMPTY");

    }
    @Step
    public void clearCart(){
        cartPage.clickEmptyCart();
    }

    @Step
    public void checkSubtotalPriceIsDisplayedCorrectly(){
        Assert.assertTrue("The subtotal price is not correct!",cartPage.isSubtotalPriceCorrect());
    }

    @Step
    public void checkGrandTotalPriceIsCorrect(){
        Assert.assertTrue("Total price not correct", cartPage.isGrandTotalPriceCorrect());
    }

}
