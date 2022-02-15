package com.Test;

import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {

    @Test
    public void addToCart_details()
    {
        pageFactory.getSignIn().signIn();
        pageFactory.getHomePage().homeP();
        pageFactory.getFishPage().addFish();
        pageFactory.getAddToCartPage().cartButton();
    }

}
