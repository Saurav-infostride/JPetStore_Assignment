package com.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.Test.TestBase.driver;
import static com.Test.TestBase.prop;

public class SignInPage extends PageFactory {

    @FindBy(xpath="//input[@name ='username']")
    WebElement username;

    @FindBy(xpath="//input[@name ='password']")
    WebElement password;

    @FindBy(xpath="//input[@name='signon']")
    WebElement loginbutton;

    @FindBy(xpath="//*[@id=\"Catalog\"]/a")
    WebElement registernow;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signInButton;

    public SignInPage(){
        org.openqa.selenium.support.PageFactory.initElements(driver, this);
    }
    public void signIn() {
        signInButton.click();
        username.sendKeys(prop.getProperty("uname"));
        password.clear();
        password.sendKeys(prop.getProperty("pword"));
        loginbutton.click();
    }
}
