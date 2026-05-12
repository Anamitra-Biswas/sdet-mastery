package org.example.pages;

import org.openqa.selenium.WebDriver;

public class InventoryPage {

    private WebDriver driver;

    public InventoryPage(WebDriver driver){
        this.driver=driver;
    }

    public String getPageUrl(){
        String currentURL= driver.getCurrentUrl();
        return currentURL;
    }

    public boolean isLoaded(){
        return driver.getCurrentUrl().contains("inventory");
    }
}
