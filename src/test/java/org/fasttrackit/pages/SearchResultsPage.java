package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".products-grid .item")
    private List<WebElementFacade> listOfProducts;


    public boolean openProduct(String name){
        waitFor(listOfProducts.get(0));
        for (WebElementFacade element : listOfProducts){
            if (element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(name)){
                element.findElement(By.cssSelector("a")).click();
                return true;
            }
        }
        return false;
    }

    @FindBy(css = ".category-products .item.last")
    private List<WebElementFacade> productList;

    public boolean isProductDisplayed(String productName){
        for(WebElementFacade webElementFacade:productList){
            if (webElementFacade.findElement(By.cssSelector(".product-name a")).getText().toLowerCase().contains(productName.toLowerCase()))
                return true;
        }
        return false;
    }
    @FindBy(css = ".category-products>.toolbar [title='Sort By']")
    private WebElementFacade sortBy;
    @FindBy(css = ".category-products>.toolbar [title='Sort By'] :nth-child(1)")
    private WebElementFacade sortByRelevance;
    @FindBy(css = ".category-products>.toolbar [title='Sort By'] :nth-child(1)")
    private WebElementFacade sortByName;
    @FindBy(css = ".category-products>.toolbar [title='Sort By'] :nth-child(3)")
    private WebElementFacade sortByPrice;
    @FindBy(css = ".products-grid .item .price:not([id])")
    private List<WebElementFacade> lisofPrice;

    public void clicksortBydropdown(){
        clickOn(sortBy);
    }

    public void clicksortByRelevance(){
        clickOn(sortByRelevance);
    }

    public void clicksortByName(){
        clickOn(sortByName);
    }

    public void clicksortByPrice(){
        clickOn(sortByPrice);
    }

//    public int getPrice() {
//        int sum = 0;
//        for (WebElementFacade element : lisofPrice) {
//            sum += getIntFromPrice(element.getText());
//        }
//        return sum;
//    }

    public boolean isPriceCorrectArranged(){
        return  getIntFromPrice(lisofPrice.get(0).getText()) <
                getIntFromPrice(lisofPrice.get(lisofPrice.size()-1).getText());
    }

}
