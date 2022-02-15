package com.Test;

import com.Pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    protected static PageFactory pageFactory;

    public TestBase(){

    }
    @BeforeClass
    public void launch_browser() throws Exception {
            pageFactory = new PageFactory();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try
        {
            //Environment specific properties file loading
            InputStream ip = new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\" +
                    "java\\com\\Config\\data.properties");
            prop = new Properties();
            prop.load(ip);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    @BeforeClass()
    public void loadBaseUrl() {
        pageFactory = new PageFactory();
        driver.get(prop .getProperty("url"));
        driver.manage().deleteAllCookies();
    }
    @AfterClass
    public void suiteTearDown() {
        driver.quit();
    }
}
