package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

import static com.Test.TestBase.driver;
import static com.Test.TestBase.prop;

public class RegisterPage extends PageFactory {

    @FindBy(xpath="//input[@name ='username']")
    WebElement username;

    @FindBy(xpath = "//input[@name ='password']")
    WebElement password;

    @FindBy(xpath="//input[@name ='repeatedPassword']")
    WebElement repeatpassword;

    @FindBy(name = "account.firstName")
    WebElement firstname;

    @FindBy(name = "account.lastName")
    WebElement lastname;

    @FindBy(name = "account.email")
    WebElement email;

    @FindBy(name = "account.phone")
    WebElement phone;

    @FindBy(name = "account.address1")
    WebElement address1;

    @FindBy(name = "account.address2")
    WebElement address2;

    @FindBy(name = "account.city")
    WebElement city;

    @FindBy(name = "account.state")
    WebElement state;

    @FindBy(name = "account.zip")
    WebElement zip;

    @FindBy(name = "account.country")
    WebElement country;

    @FindBy(name = "newAccount")
    WebElement signinbutton;

    @FindBy(name="account.listOption")
    WebElement MyList;

    @FindBy(name="account.bannerOption")
    WebElement MyBanner;

    public RegisterPage(){
        org.openqa.selenium.support.PageFactory.initElements(driver, this);
    }

    public void register() {
        username.sendKeys(prop.getProperty("userID"));
        password.sendKeys(prop.getProperty("pwd"));
        repeatpassword.sendKeys(prop.getProperty("repeatPassword"));
        firstname.sendKeys(prop.getProperty("firstName"));
        lastname.sendKeys(prop.getProperty("lastName"));
        email.sendKeys(prop.getProperty("email"));
        phone.sendKeys(prop.getProperty("phone"));
        address1.sendKeys(prop.getProperty("address_1"));
        address2.sendKeys(prop.getProperty("address_2"));
        city.sendKeys(prop.getProperty("city"));
        state.sendKeys(prop.getProperty("state"));
        zip.sendKeys(prop.getProperty("zip"));
        country.sendKeys(prop.getProperty("country"));
        MyList.click();
        MyBanner.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        signinbutton.click();
        //driver.navigate().to("https://petstore.octoperf.com/actions/Account.action?signonForm=");
    }
}
