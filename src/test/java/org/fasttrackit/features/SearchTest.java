package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class SearchTest extends BaseTest{

    @Test
    public void searchTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.executeSearch("necklace");
        searchSteps.verifyifProductDisplayed("SILVER DESERT NECKLACE");

    }

    @Test
    public void searchTestsortbyPrice(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.executeSearch("book");
        searchSteps.verifyifProductDisplayed("A TALE OF TWO CITIES");
        searchSteps.clicksortBydropdown();
        searchSteps.clicksortByPrice();

        //searchSteps.checkfirstPriceIsallwayslower();



    }
}
