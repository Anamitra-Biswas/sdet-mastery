package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.InventoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.example.pages.LoginPage;
import org.example.pages.InventoryPage;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSuccessfulTest(){
       LoginPage loginPage=new LoginPage(driver);
        InventoryPage inventoryPage=new InventoryPage(driver);
        loginPage.navigateTo();
        loginPage.Login("standard_user ","secret sauce");
        assert inventoryPage.isLoaded();
        System.out.println("Current url "+inventoryPage.getPageUrl());
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