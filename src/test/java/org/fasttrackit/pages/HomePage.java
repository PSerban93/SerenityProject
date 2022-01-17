package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;



public class HomePage extends BasePage {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css = "[title='Search']")
    private WebElementFacade searchIcon;

    @FindBy(css = "[title='Register']")
    private WebElementFacade registerLink;

    @FindBy(css = "li.level0.nav-6.menu-active:nth-child(6) > a")
    private WebElementFacade productCategoryButton;

    @FindBy(css = ".header-minicart .label")
    private WebElementFacade minicartIcon;

    @FindBy(css = ".cart-link")
    private WebElementFacade minicartLink;

    @FindBy(css = ".links:nth-child(1) .top-link-cart")
    private WebElementFacade cartLink;

    @FindBy(css = ".links:nth-child(1) .top-link-checkout")
    private WebElementFacade checkoutLink;

    @FindBy(css = ".checkout-button")
    private WebElementFacade checkoutcarticonLink;




    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void setSearchField(String value) {
        typeInto(searchField, value);
    }

    public void clickSearchIcon() {
        clickOn(searchIcon);
    }

    public void clickRegisterLink() {
        clickOn(registerLink);
    }

    public void clickProductCategory() {
        clickOn(productCategoryButton);
    }

    public void clickminicartIcon(){
        clickOn(minicartIcon);
    }

    public void clickminicartLink(){
        waitFor(minicartLink);
        clickOn(minicartLink);
    }

    public void clickcartLink(){
        clickOn(cartLink);
    }

    public void clickcheckoutLink(){
        clickOn(checkoutLink);
    }
    public void clickcheckoutcarticonLink(){
        clickOn(checkoutcarticonLink);
    }
}
