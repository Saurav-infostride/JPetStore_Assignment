package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.Test.TestBase.driver;

public class AddToCartPage {

    @FindBy(linkText = "Add to Cart")
    WebElement addToCartButton;

    public AddToCartPage()
            {
        PageFactory.initElements(driver, this);
    }
    public void cartButton(){
        addToCartButton.click();
    }
}
