package com.Test;

import org.testng.annotations.Test;

public class RegisterTest extends TestBase{

    @Test
    public void register_details()  {
        pageFactory.getRegister().register();
        pageFactory.getSignIn().signIn();
    }
}
