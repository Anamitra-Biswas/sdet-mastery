package org.example;

import org.example.pages.InventoryPage;
import org.example.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{




    @Test(priority = 2)
    public void testSuccessfulTest(){
       LoginPage loginPage=new LoginPage(driver);
        InventoryPage inventoryPage=new InventoryPage(driver);
        loginPage.navigateTo();
        loginPage.login("standard_user","secret_sauce");
        assert inventoryPage.isLoaded();
        System.out.println("Current url "+inventoryPage.getPageUrl());
    }

    @Test(priority = 1)
    public void testLoginPageTitle() {
        driver.get("https://www.saucedemo.com");
        String title = driver.getTitle();
        System.out.println("Page title: " + title);
        assert title.equals("Swag Labs");
    }
}