package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PageActions pg = new LoginPage("Login Page");
        pg.navigateTo("https://saucedemo.com");
        pg.isPageLoaded();

        PageActions pageActions=new DashBoardPage("Dashboard Page");
        pageActions.navigateTo("https://saucedemo.com");
        pageActions.isPageLoaded();

    }
}