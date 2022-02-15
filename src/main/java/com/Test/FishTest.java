package com.Test;

import org.testng.annotations.Test;

public class FishTest extends TestBase {

    @Test(priority = 0)
    public void login_details(){
        pageFactory.getSignIn().signIn();
    }
    @Test(priority = 1)
    public void clickOnFish() {
        pageFactory.getHomePage().homeP();
        pageFactory.getFishPage().addFish();
    }
}
