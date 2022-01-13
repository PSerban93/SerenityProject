package org.fasttrackit.features;


import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void addToCartTest() {
        loginSteps.doLogin("cosmin@fasttrackit.org", "123456");
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
    }

    @Test
    public void addToCartTest1() {
        loginSteps.doLogin("cosmin@fasttrackit.org", "123456");
        searchSteps.searchAndSelectProduct("KHAKI BOWERY CHINO PANTS");
        cartSteps.clickselectColor();
        cartSteps.clickselectSize();
        cartSteps.clickAddProductToCart();
        cartSteps.checkCartSuccess("Khaki Bowery Chino Pants was added to your shopping cart.");
    }
}
