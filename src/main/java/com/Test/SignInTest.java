package com.Test;

import org.testng.annotations.Test;


public class SignInTest extends TestBase {

    @Test
    public void login_details(){
        pageFactory.getSignIn().signIn();
    }

}
