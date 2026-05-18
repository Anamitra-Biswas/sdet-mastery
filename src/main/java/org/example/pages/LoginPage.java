package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private By usernameField=By.id("user-name");
    private By passwordField=By.id("password");
    private By loginButton=By.id("login-button");

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterUserName(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void navigateTo(){
        driver.get("https://www.saucedemo.com/");
    }
    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(loginButton).click();
    }
    public void login(String username,String password){
        enterUserName(username);
        enterPassword(password);
        clickLogin();
    }


}
