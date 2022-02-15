package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

import static com.Test.TestBase.driver;

public class HomePage extends PageFactory {
    @FindBy(xpath = "//img[@src='../images/fish_icon.gif']")
    WebElement Fish;
    @FindBy(xpath = "//div[contains(text(),'Welcome Saurav!')]")
    WebElement homepage;

    public HomePage(){
        org.openqa.selenium.support.PageFactory.initElements(driver, this);
    }

    public String verifyHomePage(){
        return homepage.getText();
    }
    public String verify_user(){
        return driver.getTitle();
    }
    public void homeP(){
        Fish.click();
    }
}
