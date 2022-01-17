package org.fasttrackit.features;


import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void addToCartTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
        cartSteps.checkaddSuccess("Silver Desert Necklace was added to your shopping cart.");
    }

    @Test
    public void addToCartTest1() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("KHAKI BOWERY CHINO PANTS");
        cartSteps.clickselectColor();
        cartSteps.clickselectSize();
        cartSteps.clickAddProductToCart();
        cartSteps.checkaddSuccess("Khaki Bowery Chino Pants was added to your shopping cart.");
    }

    @Test
    public void proceedtoCart() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        cartSteps.navigateToCart();
    }

    @Test
    public void clearcart() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        cartSteps.navigateToCart();
        cartSteps.clearCart();
    }

    @Test
    public void CartSummaryTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        cartSteps.navigateToCart();
        cartSteps.clearCart();
        cartSteps.cartisEmpty();
        searchSteps.searchAndSelectProduct("KHAKI BOWERY CHINO PANTS");
        cartSteps.clickselectColor();
        cartSteps.clickselectSize();
        cartSteps.clickAddProductToCart();
        cartSteps.checkaddSuccess("Khaki Bowery Chino Pants was added to your shopping cart.");
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
        cartSteps.checkaddSuccess("Silver Desert Necklace was added to your shopping cart.");
        searchSteps.searchAndSelectProduct("LUDLOW SHEATH DRESS");
        cartSteps.clickselectColor1();
        cartSteps.clickselectSize1();
        cartSteps.clickAddProductToCart();
        cartSteps.checkaddSuccess("Ludlow Sheath Dress was added to your shopping cart.");
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
        cartSteps.checkGrandTotalPriceIsCorrect();
    }

    @Test
    public void checkCartTotalSummaryTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        cartSteps.navigateToCart();
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
        cartSteps.checkGrandTotalPriceIsCorrect();
    }

}
