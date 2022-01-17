package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {



    @Step
    public void executeSearch(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }

    @Step
    public void findAndOpenProduct(String productName){
        Assert.assertTrue(searchResultsPage.openProduct(productName));
    }

    @Step
    public void searchAndSelectProduct(String productName){
        executeSearch(productName);
        findAndOpenProduct(productName);
    }

    @Step
    public void verifyifProductDisplayed(String productName){
        Assert.assertTrue(searchResultsPage.isProductDisplayed(productName));

    }

    @Step
    public void clicksortBydropdown(){
        searchResultsPage.clicksortBydropdown();
    }

    @Step
    public void clicksortByRelevance(){
        searchResultsPage.clicksortByRelevance();
    }

    @Step
    public void clicksortByName(){
        searchResultsPage.clicksortByName();
    }

    @Step
    public void clicksortByPrice(){
        searchResultsPage.clicksortByPrice();
    }

    @Step
    public void checkisPriceCorrectArranged(){
        searchResultsPage.isPriceCorrectArranged();
    }

    @Step
    public void checkfirstPriceIsallwayslower(){
        Assert.assertTrue("First product price is not lower than last product.", searchResultsPage.isPriceCorrectArranged());
    }

}
