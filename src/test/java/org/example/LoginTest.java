package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testLoginPageTitle() {
        driver.get("https://www.saucedemo.com");
        String title = driver.getTitle();
        System.out.println("Page title: " + title);
        assert title.equals("Swag Labs");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}