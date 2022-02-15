package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest  extends TestBase {
    String title;
    String user;

    @Test(priority = 0)
    public void login_details(){
        pageFactory.getSignIn().signIn();
    }

    @Test(priority = 1)
    public void CheckUserName(){
        title = pageFactory.getHomePage().verifyHomePage();
        Assert.assertEquals(title, "Welcome Saurav!");
    }

}
