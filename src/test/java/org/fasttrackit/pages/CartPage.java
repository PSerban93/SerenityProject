package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(id = "empty_cart_button")
    private WebElementFacade emptyCart;

    @FindBy(css = "page-title, h1")
    private WebElementFacade cartisEmptytext;

    @FindBy(css = ".success-msg span")
    private WebElementFacade addSuccessElement;

    @FindBy(css = ".product-cart-total .price")
    private List<WebElementFacade> listOfSubtotalPrices;

    @FindBy(css = "#shopping-cart-totals-table tbody tr:nth-child(1) .price")
    private WebElementFacade subtotalText;

    @FindBy(css = "#shopping-cart-totals-table tbody tr:nth-child(2) .price")
    private WebElementFacade shippingFeeText;

    @FindBy(css = "#shopping-cart-totals-table tfoot .price")
    private WebElementFacade grandTotal;


    public void cartisEmpty() {
        cartisEmptytext.shouldContainOnlyText("SHOPPING CART IS EMPTY");
    }

    public void clickEmptyCart() {
        if (emptyCart.isPresent()) {
            emptyCart.click();
        }
        //clickOn(emptyCart);
    }


    public void checkaddSuccess(String addSuccess) {
        addSuccessElement.shouldContainOnlyText(addSuccess);
    }

    public int getSubtotalPricesCalculated() {
        int sum = 0;
        for (WebElementFacade element : listOfSubtotalPrices) {
            sum += getIntFromPrice(element.getText());
        }
        return sum;
    }

    public boolean isSubtotalPriceCorrect() {
        return getSubtotalPricesCalculated() == getIntFromPrice(subtotalText.getText());
    }

    public int getSubtotalPriceWithTaxes(){
        String x = subtotalText.getText();
        String y = "0";
        if (shippingFeeText.isPresent()){
            y = shippingFeeText.getText();
        }
        return getIntFromPrice(x) + getIntFromPrice(y);
    }

    public boolean isGrandTotalPriceCorrect(){
        return getSubtotalPriceWithTaxes() == getIntFromPrice(grandTotal.getText());
    }
}


