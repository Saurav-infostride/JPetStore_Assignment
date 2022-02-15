package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.Test.TestBase.driver;

public class FishPage {
    @FindBy(xpath ="//a[text()='FI-SW-01']")
    WebElement AngelfishLink;

    public FishPage(){
        PageFactory.initElements(driver, this);
    }
    public void addFish(){
        AngelfishLink.click();
    }
}
